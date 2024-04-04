package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzayc implements zzrm {
    private final com.google.android.gms.ads.internal.util.zzf zzebk;
    private final zzaxz zzebr;
    private final Object lock = new Object();
    private final HashSet<zzaxr> zzebs = new HashSet<>();
    private final HashSet<zzaya> zzebt = new HashSet<>();
    private boolean zzebu = false;
    private final zzayb zzebq = new zzayb();

    public zzayc(String str, com.google.android.gms.ads.internal.util.zzf zzfVar) {
        this.zzebr = new zzaxz(str, zzfVar);
        this.zzebk = zzfVar;
    }

    public final void zzb(zzaxr zzaxrVar) {
        synchronized (this.lock) {
            this.zzebs.add(zzaxrVar);
        }
    }

    public final void zzb(HashSet<zzaxr> hashSet) {
        synchronized (this.lock) {
            this.zzebs.addAll(hashSet);
        }
    }

    public final Bundle zza(Context context, zzaxy zzaxyVar) {
        HashSet<zzaxr> hashSet = new HashSet<>();
        synchronized (this.lock) {
            hashSet.addAll(this.zzebs);
            this.zzebs.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zzebr.zzn(context, this.zzebq.zzyb()));
        Bundle bundle2 = new Bundle();
        Iterator<zzaya> it = this.zzebt.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NoSuchMethodError();
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<zzaxr> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().toBundle());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzaxyVar.zza(hashSet);
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final void zzp(boolean z) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis();
        if (z) {
            if (currentTimeMillis - this.zzebk.zzym() > ((Long) zzwo.zzqq().zzd(zzabh.zzcou)).longValue()) {
                this.zzebr.zzebh = -1;
            } else {
                this.zzebr.zzebh = this.zzebk.zzyn();
            }
            this.zzebu = true;
            return;
        }
        this.zzebk.zzez(currentTimeMillis);
        this.zzebk.zzdf(this.zzebr.zzebh);
    }

    public final void zzxh() {
        synchronized (this.lock) {
            this.zzebr.zzxh();
        }
    }

    public final void zzxg() {
        synchronized (this.lock) {
            this.zzebr.zzxg();
        }
    }

    public final void zza(zzvi zzviVar, long j) {
        synchronized (this.lock) {
            this.zzebr.zza(zzviVar, j);
        }
    }

    public final zzaxr zza(Clock clock, String str) {
        return new zzaxr(clock, this, this.zzebq.zzya(), str);
    }

    public final boolean zzyd() {
        return this.zzebu;
    }
}
