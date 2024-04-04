package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzdyp<T> extends zzdzh<T> {
    private final Executor zzhyq;
    private final /* synthetic */ zzdyn zzhyr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyp(zzdyn zzdynVar, Executor executor) {
        this.zzhyr = zzdynVar;
        this.zzhyq = (Executor) zzdwa.checkNotNull(executor);
    }

    abstract void setValue(T t);

    @Override // com.google.android.gms.internal.ads.zzdzh
    final boolean isDone() {
        return this.zzhyr.isDone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void execute() {
        try {
            this.zzhyq.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzhyr.setException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdzh
    final void zzb(T t, Throwable th) {
        zzdyn.zza(this.zzhyr, (zzdyp) null);
        if (th != null) {
            if (th instanceof ExecutionException) {
                this.zzhyr.setException(th.getCause());
                return;
            } else if (th instanceof CancellationException) {
                this.zzhyr.cancel(false);
                return;
            } else {
                this.zzhyr.setException(th);
                return;
            }
        }
        setValue(t);
    }
}
