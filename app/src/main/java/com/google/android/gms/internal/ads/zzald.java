package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzald implements zzazg<zzalm> {
    private final /* synthetic */ zzalb zzdiw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzald(zzalb zzalbVar) {
        this.zzdiw = zzalbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazg
    public final /* synthetic */ void zzg(zzalm zzalmVar) {
        zzalf zzalfVar;
        com.google.android.gms.ads.internal.util.zzd.zzeb("Releasing engine reference.");
        zzalfVar = this.zzdiw.zzdiu;
        zzalfVar.zzum();
    }
}
