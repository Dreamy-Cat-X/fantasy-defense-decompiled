package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbgq implements zzdho {
    private final /* synthetic */ zzbgb zzexk;
    private Context zzfkv;
    private String zzfkw;

    private zzbgq(zzbgb zzbgbVar) {
        this.zzexk = zzbgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdho
    public final zzdhl zzahj() {
        zzepw.zza(this.zzfkv, (Class<Context>) Context.class);
        zzepw.zza(this.zzfkw, (Class<String>) String.class);
        return new zzbgp(this.zzexk, this.zzfkv, this.zzfkw);
    }

    @Override // com.google.android.gms.internal.ads.zzdho
    public final /* synthetic */ zzdho zzfo(String str) {
        this.zzfkw = (String) zzepw.checkNotNull(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdho
    public final /* synthetic */ zzdho zzby(Context context) {
        this.zzfkv = (Context) zzepw.checkNotNull(context);
        return this;
    }
}
