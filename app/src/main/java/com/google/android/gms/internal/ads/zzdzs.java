package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdzs<V> extends zzdyt<V> {

    @NullableDecl
    private zzdzl<V> zzhzj;

    @NullableDecl
    private ScheduledFuture<?> zzhzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> zzdzl<V> zzb(zzdzl<V> zzdzlVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzdzs zzdzsVar = new zzdzs(zzdzlVar);
        zzdzu zzdzuVar = new zzdzu(zzdzsVar);
        zzdzsVar.zzhzk = scheduledExecutorService.schedule(zzdzuVar, j, timeUnit);
        zzdzlVar.addListener(zzdzuVar, zzdys.INSTANCE);
        return zzdzsVar;
    }

    private zzdzs(zzdzl<V> zzdzlVar) {
        this.zzhzj = (zzdzl) zzdwa.checkNotNull(zzdzlVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdxz
    public final String pendingToString() {
        zzdzl<V> zzdzlVar = this.zzhzj;
        ScheduledFuture<?> scheduledFuture = this.zzhzk;
        if (zzdzlVar == null) {
            return null;
        }
        String valueOf = String.valueOf(zzdzlVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("inputFuture=[");
        sb.append(valueOf);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        String valueOf2 = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
        sb3.append(valueOf2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdxz
    public final void afterDone() {
        maybePropagateCancellationTo(this.zzhzj);
        ScheduledFuture<?> scheduledFuture = this.zzhzk;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzhzj = null;
        this.zzhzk = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ScheduledFuture zza(zzdzs zzdzsVar, ScheduledFuture scheduledFuture) {
        zzdzsVar.zzhzk = null;
        return null;
    }
}
