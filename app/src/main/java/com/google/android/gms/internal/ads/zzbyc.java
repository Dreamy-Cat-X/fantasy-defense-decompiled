package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzbyc implements Runnable {
    private final zzbdh zzesn;

    private zzbyc(zzbdh zzbdhVar) {
        this.zzesn = zzbdhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zze(zzbdh zzbdhVar) {
        return new zzbyc(zzbdhVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzesn.destroy();
    }
}
