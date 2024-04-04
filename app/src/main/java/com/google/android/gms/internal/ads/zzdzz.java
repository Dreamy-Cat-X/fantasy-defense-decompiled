package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdzz<V> extends zzdzh<zzdzl<V>> {
    private final /* synthetic */ zzdzw zzhzn;
    private final zzdyk<V> zzhzo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzz(zzdzw zzdzwVar, zzdyk<V> zzdykVar) {
        this.zzhzn = zzdzwVar;
        this.zzhzo = (zzdyk) zzdwa.checkNotNull(zzdykVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdzh
    final boolean isDone() {
        return this.zzhzn.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzdzh
    final String zzbaf() {
        return this.zzhzo.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzdzh
    final /* synthetic */ void zzb(Object obj, Throwable th) {
        zzdzl<? extends V> zzdzlVar = (zzdzl) obj;
        if (th == null) {
            this.zzhzn.setFuture(zzdzlVar);
        } else {
            this.zzhzn.setException(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdzh
    final /* synthetic */ Object zzbae() throws Exception {
        return (zzdzl) zzdwa.zza(this.zzhzo.zzatn(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzhzo);
    }
}
