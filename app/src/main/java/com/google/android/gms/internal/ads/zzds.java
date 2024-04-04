package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzds implements zzdtv {
    private final /* synthetic */ zzdsn zzvw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzds(zzdsn zzdsnVar) {
        this.zzvw = zzdsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final void zza(int i, long j) {
        this.zzvw.zzh(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final void zza(int i, long j, String str) {
        this.zzvw.zzb(i, System.currentTimeMillis() - j, str);
    }
}
