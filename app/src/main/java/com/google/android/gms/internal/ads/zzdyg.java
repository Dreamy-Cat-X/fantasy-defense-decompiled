package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdyg implements Runnable {
    private final /* synthetic */ zzdyd zzhyf;
    private final /* synthetic */ zzdzl zzhyg;
    private final /* synthetic */ int zzhyh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyg(zzdyd zzdydVar, zzdzl zzdzlVar, int i) {
        this.zzhyf = zzdydVar;
        this.zzhyg = zzdzlVar;
        this.zzhyh = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.zzhyg.isCancelled()) {
                zzdyd.zza(this.zzhyf, (zzdwn) null);
                this.zzhyf.cancel(false);
            } else {
                this.zzhyf.zza(this.zzhyh, this.zzhyg);
            }
        } finally {
            this.zzhyf.zza((zzdwn) null);
        }
    }
}
