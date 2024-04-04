package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzv implements Runnable {
    private final Runnable mRunnable;
    private final zzaa zzah;
    private final zzaj zzai;

    public zzv(zzaa zzaaVar, zzaj zzajVar, Runnable runnable) {
        this.zzah = zzaaVar;
        this.zzai = zzajVar;
        this.mRunnable = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzah.isCanceled();
        if (this.zzai.isSuccess()) {
            this.zzah.zza((zzaa) this.zzai.result);
        } else {
            this.zzah.zzb(this.zzai.zzbr);
        }
        if (this.zzai.zzbs) {
            this.zzah.zzc("intermediate-response");
        } else {
            this.zzah.zzd("done");
        }
        Runnable runnable = this.mRunnable;
        if (runnable != null) {
            runnable.run();
        }
    }
}
