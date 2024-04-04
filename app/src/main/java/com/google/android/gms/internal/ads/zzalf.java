package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzalf extends zzazj<zzakb> {
    private com.google.android.gms.ads.internal.util.zzau<zzakb> zzdig;
    private final Object lock = new Object();
    private boolean zzdix = false;
    private int zzdiy = 0;

    public zzalf(com.google.android.gms.ads.internal.util.zzau<zzakb> zzauVar) {
        this.zzdig = zzauVar;
    }

    public final zzalb zzul() {
        zzalb zzalbVar = new zzalb(this);
        synchronized (this.lock) {
            zza(new zzali(this, zzalbVar), new zzalh(this, zzalbVar));
            Preconditions.checkState(this.zzdiy >= 0);
            this.zzdiy++;
        }
        return zzalbVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzum() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzdiy > 0);
            com.google.android.gms.ads.internal.util.zzd.zzeb("Releasing 1 reference for JS Engine");
            this.zzdiy--;
            zzuo();
        }
    }

    public final void zzun() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzdiy >= 0);
            com.google.android.gms.ads.internal.util.zzd.zzeb("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzdix = true;
            zzuo();
        }
    }

    private final void zzuo() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzdiy >= 0);
            if (this.zzdix && this.zzdiy == 0) {
                com.google.android.gms.ads.internal.util.zzd.zzeb("No reference is left (including root). Cleaning up engine.");
                zza(new zzalk(this), new zzazh());
            } else {
                com.google.android.gms.ads.internal.util.zzd.zzeb("There are still references to the engine. Not destroying.");
            }
        }
    }
}
