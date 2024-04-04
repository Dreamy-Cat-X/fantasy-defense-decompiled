package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbhc implements zzdkq {
    private final /* synthetic */ zzbgb zzexk;
    private Context zzfkv;
    private String zzfkw;
    private zzvp zzfmi;

    private zzbhc(zzbgb zzbgbVar) {
        this.zzexk = zzbgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdkq
    public final zzdkn zzahz() {
        zzepw.zza(this.zzfkv, (Class<Context>) Context.class);
        zzepw.zza(this.zzfkw, (Class<String>) String.class);
        zzepw.zza(this.zzfmi, (Class<zzvp>) zzvp.class);
        return new zzbhb(this.zzexk, this.zzfkv, this.zzfkw, this.zzfmi);
    }

    @Override // com.google.android.gms.internal.ads.zzdkq
    public final /* synthetic */ zzdkq zzd(zzvp zzvpVar) {
        this.zzfmi = (zzvp) zzepw.checkNotNull(zzvpVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdkq
    public final /* synthetic */ zzdkq zzfq(String str) {
        this.zzfkw = (String) zzepw.checkNotNull(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdkq
    public final /* synthetic */ zzdkq zzca(Context context) {
        this.zzfkv = (Context) zzepw.checkNotNull(context);
        return this;
    }
}
