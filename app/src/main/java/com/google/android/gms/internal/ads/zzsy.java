package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzsy implements Runnable {
    private final /* synthetic */ zzsv zzbus;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsy(zzsv zzsvVar) {
        this.zzbus = zzsvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbus.disconnect();
    }
}
