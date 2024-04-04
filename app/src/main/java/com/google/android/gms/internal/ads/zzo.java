package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzo implements zzac {
    private final Map<String, List<zzaa<?>>> zzy = new HashMap();
    private final zzm zzz;

    public zzo(zzm zzmVar) {
        this.zzz = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzac
    public final void zza(zzaa<?> zzaaVar, zzaj<?> zzajVar) {
        List<zzaa<?>> remove;
        zzak zzakVar;
        if (zzajVar.zzbq == null || zzajVar.zzbq.zza()) {
            zza(zzaaVar);
            return;
        }
        String zze = zzaaVar.zze();
        synchronized (this) {
            remove = this.zzy.remove(zze);
        }
        if (remove != null) {
            if (zzaq.DEBUG) {
                zzaq.v("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), zze);
            }
            for (zzaa<?> zzaaVar2 : remove) {
                zzakVar = this.zzz.zzo;
                zzakVar.zzb(zzaaVar2, zzajVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzac
    public final synchronized void zza(zzaa<?> zzaaVar) {
        BlockingQueue blockingQueue;
        String zze = zzaaVar.zze();
        List<zzaa<?>> remove = this.zzy.remove(zze);
        if (remove != null && !remove.isEmpty()) {
            if (zzaq.DEBUG) {
                zzaq.v("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), zze);
            }
            zzaa<?> remove2 = remove.remove(0);
            this.zzy.put(zze, remove);
            remove2.zza((zzac) this);
            try {
                blockingQueue = this.zzz.zzm;
                blockingQueue.put(remove2);
            } catch (InterruptedException e) {
                zzaq.e("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.zzz.quit();
            }
        }
    }

    public final synchronized boolean zzb(zzaa<?> zzaaVar) {
        String zze = zzaaVar.zze();
        if (this.zzy.containsKey(zze)) {
            List<zzaa<?>> list = this.zzy.get(zze);
            if (list == null) {
                list = new ArrayList<>();
            }
            zzaaVar.zzc("waiting-for-response");
            list.add(zzaaVar);
            this.zzy.put(zze, list);
            if (zzaq.DEBUG) {
                zzaq.d("Request for cacheKey=%s is in flight, putting on hold.", zze);
            }
            return true;
        }
        this.zzy.put(zze, null);
        zzaaVar.zza((zzac) this);
        if (zzaq.DEBUG) {
            zzaq.d("new request, sending to network %s", zze);
        }
        return false;
    }
}
