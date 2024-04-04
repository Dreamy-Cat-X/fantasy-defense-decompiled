package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdmg {
    private final Clock zzbpw;
    private final Object lock = new Object();
    private volatile int zzhhi = zzdmf.zzhhe;
    private volatile long zzebd = 0;

    public zzdmg(Clock clock) {
        this.zzbpw = clock;
    }

    private final void zzr(int i, int i2) {
        zzauy();
        long currentTimeMillis = this.zzbpw.currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzhhi != i) {
                return;
            }
            this.zzhhi = i2;
            if (this.zzhhi == zzdmf.zzhhg) {
                this.zzebd = currentTimeMillis;
            }
        }
    }

    private final void zzauy() {
        long currentTimeMillis = this.zzbpw.currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzhhi == zzdmf.zzhhg) {
                if (this.zzebd + ((Long) zzwo.zzqq().zzd(zzabh.zzcwo)).longValue() <= currentTimeMillis) {
                    this.zzhhi = zzdmf.zzhhe;
                }
            }
        }
    }

    public final void zzbk(boolean z) {
        if (z) {
            zzr(zzdmf.zzhhe, zzdmf.zzhhf);
        } else {
            zzr(zzdmf.zzhhf, zzdmf.zzhhe);
        }
    }

    public final boolean zzauz() {
        boolean z;
        synchronized (this.lock) {
            zzauy();
            z = this.zzhhi == zzdmf.zzhhf;
        }
        return z;
    }

    public final boolean zzava() {
        boolean z;
        synchronized (this.lock) {
            zzauy();
            z = this.zzhhi == zzdmf.zzhhg;
        }
        return z;
    }

    public final void zzxm() {
        zzr(zzdmf.zzhhf, zzdmf.zzhhg);
    }
}
