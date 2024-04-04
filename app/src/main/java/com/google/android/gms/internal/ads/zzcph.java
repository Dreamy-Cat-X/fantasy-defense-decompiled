package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcph implements zzepq<zzcpc> {
    private final zzeqd<zzcpa> zzfex;
    private final zzeqd<zzdzk> zzgoz;

    private zzcph(zzeqd<zzcpa> zzeqdVar, zzeqd<zzdzk> zzeqdVar2) {
        this.zzfex = zzeqdVar;
        this.zzgoz = zzeqdVar2;
    }

    public static zzcph zzaq(zzeqd<zzcpa> zzeqdVar, zzeqd<zzdzk> zzeqdVar2) {
        return new zzcph(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcpc(this.zzfex.get(), this.zzgoz.get());
    }
}
