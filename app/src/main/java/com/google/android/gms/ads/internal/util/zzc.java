package com.google.android.gms.ads.internal.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzc implements Runnable {
    private final /* synthetic */ zza zzebv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(zza zzaVar) {
        this.zzebv = zzaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzebv.thread = Thread.currentThread();
        this.zzebv.zzwc();
    }
}
