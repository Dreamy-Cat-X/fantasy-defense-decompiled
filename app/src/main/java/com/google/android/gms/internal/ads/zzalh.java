package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzalh implements zzaze {
    private final /* synthetic */ zzalb zzdiz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalh(zzalf zzalfVar, zzalb zzalbVar) {
        this.zzdiz = zzalbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaze
    public final void run() {
        com.google.android.gms.ads.internal.util.zzd.zzeb("Rejecting reference for JS Engine.");
        this.zzdiz.reject();
    }
}
