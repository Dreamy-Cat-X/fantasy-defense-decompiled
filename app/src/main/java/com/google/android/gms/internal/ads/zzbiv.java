package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbiv implements zzdza<String> {
    private final /* synthetic */ zzbis zzfpx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbiv(zzbis zzbisVar) {
        this.zzfpx = zzbisVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        zzdnj zzdnjVar;
        zzdsf zzdsfVar;
        zzdmt zzdmtVar;
        zzdmi zzdmiVar;
        zzdmi zzdmiVar2;
        Context context;
        int i;
        zzdnjVar = this.zzfpx.zzfpo;
        zzdsfVar = this.zzfpx.zzfpn;
        zzdmtVar = this.zzfpx.zzfpl;
        zzdmiVar = this.zzfpx.zzfpm;
        zzdmiVar2 = this.zzfpx.zzfpm;
        List<String> zza = zzdsfVar.zza(zzdmtVar, zzdmiVar, false, "", "failure_click_attok", zzdmiVar2.zzdlg);
        com.google.android.gms.ads.internal.zzp.zzkq();
        context = this.zzfpx.context;
        if (com.google.android.gms.ads.internal.util.zzm.zzbb(context)) {
            i = zzcpz.zzgqc;
        } else {
            i = zzcpz.zzgqb;
        }
        zzdnjVar.zza(zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(String str) {
        zzdnj zzdnjVar;
        zzdsf zzdsfVar;
        zzdmt zzdmtVar;
        zzdmi zzdmiVar;
        zzdmi zzdmiVar2;
        Context context;
        int i;
        String str2 = str;
        zzdnjVar = this.zzfpx.zzfpo;
        zzdsfVar = this.zzfpx.zzfpn;
        zzdmtVar = this.zzfpx.zzfpl;
        zzdmiVar = this.zzfpx.zzfpm;
        zzdmiVar2 = this.zzfpx.zzfpm;
        List<String> zza = zzdsfVar.zza(zzdmtVar, zzdmiVar, false, "", str2, zzdmiVar2.zzdlg);
        com.google.android.gms.ads.internal.zzp.zzkq();
        context = this.zzfpx.context;
        if (com.google.android.gms.ads.internal.util.zzm.zzbb(context)) {
            i = zzcpz.zzgqc;
        } else {
            i = zzcpz.zzgqb;
        }
        zzdnjVar.zza(zza, i);
    }
}
