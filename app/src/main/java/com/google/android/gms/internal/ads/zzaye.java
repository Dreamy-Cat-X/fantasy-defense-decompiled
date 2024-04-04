package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzaye extends Thread {
    private final /* synthetic */ String zzeek;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaye(zzayf zzayfVar, String str) {
        this.zzeek = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzayq().zzel(this.zzeek);
    }
}
