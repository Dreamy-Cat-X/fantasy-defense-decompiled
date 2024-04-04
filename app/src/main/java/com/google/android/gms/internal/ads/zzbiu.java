package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbiu implements zzdza<String> {
    private final /* synthetic */ String zzfpw;
    private final /* synthetic */ zzbis zzfpx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbiu(zzbis zzbisVar, String str) {
        this.zzfpx = zzbisVar;
        this.zzfpw = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        zzdnj zzdnjVar;
        zzdsf zzdsfVar;
        zzdmt zzdmtVar;
        zzdmi zzdmiVar;
        zzdmi zzdmiVar2;
        zzdnjVar = this.zzfpx.zzfpo;
        zzdsfVar = this.zzfpx.zzfpn;
        zzdmtVar = this.zzfpx.zzfpl;
        zzdmiVar = this.zzfpx.zzfpm;
        String str = this.zzfpw;
        zzdmiVar2 = this.zzfpx.zzfpm;
        zzdnjVar.zzj(zzdsfVar.zza(zzdmtVar, zzdmiVar, false, str, null, zzdmiVar2.zzdlh));
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(String str) {
        zzdnj zzdnjVar;
        zzdsf zzdsfVar;
        zzdmt zzdmtVar;
        zzdmi zzdmiVar;
        zzdmi zzdmiVar2;
        String str2 = str;
        zzdnjVar = this.zzfpx.zzfpo;
        zzdsfVar = this.zzfpx.zzfpn;
        zzdmtVar = this.zzfpx.zzfpl;
        zzdmiVar = this.zzfpx.zzfpm;
        String str3 = this.zzfpw;
        zzdmiVar2 = this.zzfpx.zzfpm;
        zzdnjVar.zzj(zzdsfVar.zza(zzdmtVar, zzdmiVar, false, str3, str2, zzdmiVar2.zzdlh));
    }
}
