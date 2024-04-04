package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzbac implements Runnable {
    private final zzbab zzeic;

    private zzbac(zzbab zzbabVar) {
        this.zzeic = zzbabVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzbab zzbabVar) {
        return new zzbac(zzbabVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzeic.stop();
    }
}
