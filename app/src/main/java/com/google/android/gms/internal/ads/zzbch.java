package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbch implements Runnable {
    private final /* synthetic */ zzbce zzent;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbch(zzbce zzbceVar) {
        this.zzent = zzbceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzp.zzlm().zzb(this.zzent);
    }
}
