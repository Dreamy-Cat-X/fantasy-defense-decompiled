package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbhe implements zzdlz {
    private final /* synthetic */ zzbgb zzexk;
    private Context zzfkv;
    private String zzfkw;

    private zzbhe(zzbgb zzbgbVar) {
        this.zzexk = zzbgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdlz
    public final zzdma zzaic() {
        zzepw.zza(this.zzfkv, (Class<Context>) Context.class);
        return new zzbhd(this.zzexk, this.zzfkv, this.zzfkw);
    }

    @Override // com.google.android.gms.internal.ads.zzdlz
    public final /* synthetic */ zzdlz zzfr(String str) {
        this.zzfkw = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlz
    public final /* synthetic */ zzdlz zzcb(Context context) {
        this.zzfkv = (Context) zzepw.checkNotNull(context);
        return this;
    }
}
