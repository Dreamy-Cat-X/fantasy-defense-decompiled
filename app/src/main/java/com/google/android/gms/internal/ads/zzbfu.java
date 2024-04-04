package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbfu implements zzepq<zzdnr<zzcfp>> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<zzcfy> zzeum;

    public zzbfu(zzeqd<zzcfy> zzeqdVar, zzeqd<zzdzk> zzeqdVar2) {
        this.zzeum = zzeqdVar;
        this.zzeuj = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzdnr) zzepw.zza(new zzdnr(this.zzeum.get(), this.zzeuj.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
