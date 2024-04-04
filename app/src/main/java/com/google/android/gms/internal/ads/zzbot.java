package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbot implements zzepq<zzbmy> {
    private final zzeqd<zzbrl> zzeyc;
    private final zzeqd<zzbti> zzeyd;
    private final zzeqd<zzbsb> zzezq;
    private final zzeqd<zzdmt> zzfqd;
    private final zzeqd<zzdmi> zzfue;
    private final zzeqd<zzdjw> zzfvw;
    private final zzeqd<zzbqm> zzfvx;

    private zzbot(zzeqd<zzdmt> zzeqdVar, zzeqd<zzdmi> zzeqdVar2, zzeqd<zzbrl> zzeqdVar3, zzeqd<zzbsb> zzeqdVar4, zzeqd<zzdjw> zzeqdVar5, zzeqd<zzbqm> zzeqdVar6, zzeqd<zzbti> zzeqdVar7) {
        this.zzfqd = zzeqdVar;
        this.zzfue = zzeqdVar2;
        this.zzeyc = zzeqdVar3;
        this.zzezq = zzeqdVar4;
        this.zzfvw = zzeqdVar5;
        this.zzfvx = zzeqdVar6;
        this.zzeyd = zzeqdVar7;
    }

    public static zzbot zza(zzeqd<zzdmt> zzeqdVar, zzeqd<zzdmi> zzeqdVar2, zzeqd<zzbrl> zzeqdVar3, zzeqd<zzbsb> zzeqdVar4, zzeqd<zzdjw> zzeqdVar5, zzeqd<zzbqm> zzeqdVar6, zzeqd<zzbti> zzeqdVar7) {
        return new zzbot(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5, zzeqdVar6, zzeqdVar7);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbmy(this.zzfqd.get(), this.zzfue.get(), this.zzeyc.get(), this.zzezq.get(), this.zzfvw.get(), this.zzfvx.get(), this.zzeyd.get());
    }
}
