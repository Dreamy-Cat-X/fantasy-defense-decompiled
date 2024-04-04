package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzfd implements Runnable {
    private final /* synthetic */ zzez zzzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfd(zzez zzezVar) {
        this.zzzh = zzezVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzabh.initialize(this.zzzh.context);
    }
}
