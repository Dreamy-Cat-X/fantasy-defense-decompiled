package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbgw implements zzdiv {
    private final /* synthetic */ zzbgb zzexk;
    private Context zzfkv;
    private String zzfkw;
    private zzvp zzfmi;

    private zzbgw(zzbgb zzbgbVar) {
        this.zzexk = zzbgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdiv
    public final zzdiw zzaht() {
        zzepw.zza(this.zzfkv, (Class<Context>) Context.class);
        zzepw.zza(this.zzfkw, (Class<String>) String.class);
        zzepw.zza(this.zzfmi, (Class<zzvp>) zzvp.class);
        return new zzbgv(this.zzexk, this.zzfkv, this.zzfkw, this.zzfmi);
    }

    @Override // com.google.android.gms.internal.ads.zzdiv
    public final /* synthetic */ zzdiv zzc(zzvp zzvpVar) {
        this.zzfmi = (zzvp) zzepw.checkNotNull(zzvpVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdiv
    public final /* synthetic */ zzdiv zzfp(String str) {
        this.zzfkw = (String) zzepw.checkNotNull(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdiv
    public final /* synthetic */ zzdiv zzbz(Context context) {
        this.zzfkv = (Context) zzepw.checkNotNull(context);
        return this;
    }
}
