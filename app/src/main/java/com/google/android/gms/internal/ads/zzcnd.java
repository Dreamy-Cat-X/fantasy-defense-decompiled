package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcnd implements zzbtf {
    private final Context context;
    private final zzawg zzbql;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcnd(Context context, zzawg zzawgVar) {
        this.context = context;
        this.zzbql = zzawgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzd(zzasu zzasuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzb(zzdmt zzdmtVar) {
        if (TextUtils.isEmpty(zzdmtVar.zzhiz.zzera.zzdvd)) {
            return;
        }
        this.zzbql.zza(this.context, zzdmtVar.zzhiy.zzfve.zzhjd);
        this.zzbql.zzi(this.context, zzdmtVar.zzhiz.zzera.zzdvd);
    }
}
