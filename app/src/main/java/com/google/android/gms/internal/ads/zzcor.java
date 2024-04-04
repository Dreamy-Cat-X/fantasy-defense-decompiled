package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcor implements zzepq<zzcoo> {
    private final zzeqd<zzayc> zzfby;
    private final zzeqd<zzdro> zzghw;
    private final zzeqd<zzdrp> zzgoo;

    private zzcor(zzeqd<zzdrp> zzeqdVar, zzeqd<zzdro> zzeqdVar2, zzeqd<zzayc> zzeqdVar3) {
        this.zzgoo = zzeqdVar;
        this.zzghw = zzeqdVar2;
        this.zzfby = zzeqdVar3;
    }

    public static zzcor zzy(zzeqd<zzdrp> zzeqdVar, zzeqd<zzdro> zzeqdVar2, zzeqd<zzayc> zzeqdVar3) {
        return new zzcor(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcoo(this.zzgoo.get(), this.zzghw.get(), this.zzfby.get());
    }
}
