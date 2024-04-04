package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdzm implements Executor {
    private final /* synthetic */ Executor zzhzd;
    private final /* synthetic */ zzdxz zzhze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzm(Executor executor, zzdxz zzdxzVar) {
        this.zzhzd = executor;
        this.zzhze = zzdxzVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zzhzd.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzhze.setException(e);
        }
    }
}
