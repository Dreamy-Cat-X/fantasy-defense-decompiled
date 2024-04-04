package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcpj implements zzepq<zzcpg> {
    private final zzeqd<zzcpp> zzgph;

    private zzcpj(zzeqd<zzcpp> zzeqdVar) {
        this.zzgph = zzeqdVar;
    }

    public static zzcpj zzag(zzeqd<zzcpp> zzeqdVar) {
        return new zzcpj(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcpg(this.zzgph.get());
    }
}
