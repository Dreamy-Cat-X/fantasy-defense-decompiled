package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzae {
    private final zzx zzak;
    private final AtomicInteger zzbe;
    private final Set<zzaa<?>> zzbf;
    private final PriorityBlockingQueue<zzaa<?>> zzbg;
    private final PriorityBlockingQueue<zzaa<?>> zzbh;
    private final zzw[] zzbi;
    private final List<zzag> zzbj;
    private final List<zzah> zzbk;
    private final zzk zzn;
    private final zzak zzo;
    private zzm zzz;

    private zzae(zzk zzkVar, zzx zzxVar, int i, zzak zzakVar) {
        this.zzbe = new AtomicInteger();
        this.zzbf = new HashSet();
        this.zzbg = new PriorityBlockingQueue<>();
        this.zzbh = new PriorityBlockingQueue<>();
        this.zzbj = new ArrayList();
        this.zzbk = new ArrayList();
        this.zzn = zzkVar;
        this.zzak = zzxVar;
        this.zzbi = new zzw[4];
        this.zzo = zzakVar;
    }

    private zzae(zzk zzkVar, zzx zzxVar, int i) {
        this(zzkVar, zzxVar, 4, new zzt(new Handler(Looper.getMainLooper())));
    }

    public zzae(zzk zzkVar, zzx zzxVar) {
        this(zzkVar, zzxVar, 4);
    }

    public final void start() {
        zzm zzmVar = this.zzz;
        if (zzmVar != null) {
            zzmVar.quit();
        }
        for (zzw zzwVar : this.zzbi) {
            if (zzwVar != null) {
                zzwVar.quit();
            }
        }
        zzm zzmVar2 = new zzm(this.zzbg, this.zzbh, this.zzn, this.zzo);
        this.zzz = zzmVar2;
        zzmVar2.start();
        for (int i = 0; i < this.zzbi.length; i++) {
            zzw zzwVar2 = new zzw(this.zzbh, this.zzak, this.zzn, this.zzo);
            this.zzbi[i] = zzwVar2;
            zzwVar2.start();
        }
    }

    public final <T> zzaa<T> zze(zzaa<T> zzaaVar) {
        zzaaVar.zza(this);
        synchronized (this.zzbf) {
            this.zzbf.add(zzaaVar);
        }
        zzaaVar.zze(this.zzbe.incrementAndGet());
        zzaaVar.zzc("add-to-queue");
        zza(zzaaVar, 0);
        if (!zzaaVar.zzh()) {
            this.zzbh.add(zzaaVar);
            return zzaaVar;
        }
        this.zzbg.add(zzaaVar);
        return zzaaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> void zzf(zzaa<T> zzaaVar) {
        synchronized (this.zzbf) {
            this.zzbf.remove(zzaaVar);
        }
        synchronized (this.zzbj) {
            Iterator<zzag> it = this.zzbj.iterator();
            while (it.hasNext()) {
                it.next().zzg(zzaaVar);
            }
        }
        zza(zzaaVar, 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzaa<?> zzaaVar, int i) {
        synchronized (this.zzbk) {
            Iterator<zzah> it = this.zzbk.iterator();
            while (it.hasNext()) {
                it.next().zzb(zzaaVar, i);
            }
        }
    }
}
