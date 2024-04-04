package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyd;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdyn<V> extends zzdyd<Object, V> {
    private zzdyp<?> zzhyp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyn(zzdwn<? extends zzdzl<?>> zzdwnVar, boolean z, Executor executor, Callable<V> callable) {
        super(zzdwnVar, z, false);
        this.zzhyp = new zzdyq(this, callable, executor);
        zzazz();
    }

    @Override // com.google.android.gms.internal.ads.zzdyd
    final void zzb(int i, @NullableDecl Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzdyd
    final void zzbaa() {
        zzdyp<?> zzdypVar = this.zzhyp;
        if (zzdypVar != null) {
            zzdypVar.execute();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdyd
    public final void zza(zzdyd.zza zzaVar) {
        super.zza(zzaVar);
        if (zzaVar == zzdyd.zza.OUTPUT_FUTURE_DONE) {
            this.zzhyp = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdxz
    protected final void interruptTask() {
        zzdyp<?> zzdypVar = this.zzhyp;
        if (zzdypVar != null) {
            zzdypVar.interruptTask();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzdyp zza(zzdyn zzdynVar, zzdyp zzdypVar) {
        zzdynVar.zzhyp = null;
        return null;
    }
}
