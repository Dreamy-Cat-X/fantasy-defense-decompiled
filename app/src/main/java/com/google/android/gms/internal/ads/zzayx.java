package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzayx implements ThreadFactory {
    private final /* synthetic */ String zzegp;
    private final AtomicInteger zzzj = new AtomicInteger(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayx(String str) {
        this.zzegp = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.zzegp;
        int andIncrement = this.zzzj.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
