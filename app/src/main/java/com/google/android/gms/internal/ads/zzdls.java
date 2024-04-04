package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzdls implements Runnable {
    private final zzdkp zzhgw;

    private zzdls(zzdkp zzdkpVar) {
        this.zzhgw = zzdkpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zzb(zzdkp zzdkpVar) {
        return new zzdls(zzdkpVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzhgw.onAdLoaded();
    }
}
