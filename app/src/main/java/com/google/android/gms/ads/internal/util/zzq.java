package com.google.android.gms.ads.internal.util;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzq implements Runnable {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzm zzedb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(zzm zzmVar, Context context) {
        this.zzedb = zzmVar;
        this.val$context = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        obj = this.zzedb.zzecv;
        synchronized (obj) {
            this.zzedb.zzbiq = zzm.zzan(this.val$context);
            obj2 = this.zzedb.zzecv;
            obj2.notifyAll();
        }
    }
}
