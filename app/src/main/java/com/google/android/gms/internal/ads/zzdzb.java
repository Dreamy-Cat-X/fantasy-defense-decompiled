package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdzb<V> implements Runnable {
    private final Future<V> zzhyw;
    private final zzdza<? super V> zzhyx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzb(Future<V> future, zzdza<? super V> zzdzaVar) {
        this.zzhyw = future;
        this.zzhyx = zzdzaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future<V> future = this.zzhyw;
        if ((future instanceof zzead) && (zza = zzeac.zza((zzead) future)) != null) {
            this.zzhyx.zzb(zza);
            return;
        }
        try {
            this.zzhyx.onSuccess(zzdyz.zza(this.zzhyw));
        } catch (Error e) {
            e = e;
            this.zzhyx.zzb(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.zzhyx.zzb(e);
        } catch (ExecutionException e3) {
            this.zzhyx.zzb(e3.getCause());
        }
    }

    public final String toString() {
        return zzdvq.zzw(this).zzy(this.zzhyx).toString();
    }
}
