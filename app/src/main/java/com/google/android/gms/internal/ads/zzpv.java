package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzpv implements ThreadFactory {
    private final /* synthetic */ String zzbkp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpv(String str) {
        this.zzbkp = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.zzbkp);
    }
}
