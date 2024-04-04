package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcpm implements zzepq<zzcpn> {
    private final zzeqd<zzcpi> zzgpj;

    private zzcpm(zzeqd<zzcpi> zzeqdVar) {
        this.zzgpj = zzeqdVar;
    }

    public static zzcpm zzah(zzeqd<zzcpi> zzeqdVar) {
        return new zzcpm(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcpn(this.zzgpj.get());
    }
}
