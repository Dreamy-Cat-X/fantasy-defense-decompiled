package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcwl implements zzcwf<zzbyd> {
    private final Context context;
    private final zzbzd zzgsh;

    public zzcwl(Context context, zzbzd zzbzdVar) {
        this.context = context;
        this.zzgsh = zzbzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwf
    public final /* synthetic */ zzbyd zza(zzdmt zzdmtVar, zzdmi zzdmiVar, View view, zzcwi zzcwiVar) {
        zzbyf zza = this.zzgsh.zza(new zzbnp(zzdmtVar, zzdmiVar, null), new zzcwn(this, zzcwk.zzgvn));
        zzcwiVar.zza(new zzcwm(this, zza));
        return zza.zzahw();
    }
}
