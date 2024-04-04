package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzs implements Executor {
    private final /* synthetic */ Handler val$handler;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(zzt zztVar, Handler handler) {
        this.val$handler = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.val$handler.post(runnable);
    }
}
