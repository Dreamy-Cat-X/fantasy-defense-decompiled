package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdbc implements zzepq<zzdba> {
    private final zzeqd<zzdob> zzfct;
    private final zzeqd<zzbol> zzfdn;
    private final zzeqd<zzdmx> zzftm;
    private final zzeqd<String> zzgzg;
    private final zzeqd<String> zzgzo;

    private zzdbc(zzeqd<String> zzeqdVar, zzeqd<String> zzeqdVar2, zzeqd<zzbol> zzeqdVar3, zzeqd<zzdob> zzeqdVar4, zzeqd<zzdmx> zzeqdVar5) {
        this.zzgzg = zzeqdVar;
        this.zzgzo = zzeqdVar2;
        this.zzfdn = zzeqdVar3;
        this.zzfct = zzeqdVar4;
        this.zzftm = zzeqdVar5;
    }

    public static zzdbc zzg(zzeqd<String> zzeqdVar, zzeqd<String> zzeqdVar2, zzeqd<zzbol> zzeqdVar3, zzeqd<zzdob> zzeqdVar4, zzeqd<zzdmx> zzeqdVar5) {
        return new zzdbc(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdba(this.zzgzg.get(), this.zzgzo.get(), this.zzfdn.get(), this.zzfct.get(), this.zzftm.get());
    }
}
