package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbag implements Runnable {
    private final /* synthetic */ zzbad zzeit;
    private final /* synthetic */ boolean zzeiw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbag(zzbad zzbadVar, boolean z) {
        this.zzeit = zzbadVar;
        this.zzeiw = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzeit.zzd("windowVisibilityChanged", "isVisible", String.valueOf(this.zzeiw));
    }
}
