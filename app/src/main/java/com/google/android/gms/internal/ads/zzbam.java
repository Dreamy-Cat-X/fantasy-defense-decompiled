package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbam implements Runnable {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbam(zzban zzbanVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
