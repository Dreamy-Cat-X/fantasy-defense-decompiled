package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzalb extends zzazj<zzalm> {
    private final Object lock = new Object();
    private final zzalf zzdiu;
    private boolean zzdiv;

    public zzalb(zzalf zzalfVar) {
        this.zzdiu = zzalfVar;
    }

    public final void release() {
        synchronized (this.lock) {
            if (this.zzdiv) {
                return;
            }
            this.zzdiv = true;
            zza(new zzale(this), new zzazh());
            zza(new zzald(this), new zzalg(this));
        }
    }
}
