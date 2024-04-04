package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdyf implements Runnable {
    private final /* synthetic */ zzdwn zzhye;
    private final /* synthetic */ zzdyd zzhyf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyf(zzdyd zzdydVar, zzdwn zzdwnVar) {
        this.zzhyf = zzdydVar;
        this.zzhye = zzdwnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzhyf.zza(this.zzhye);
    }
}
