package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbly implements zzepq<zzcqq<zzblb>> {
    private final zzeqd<zzcvp<zzblb, zzdno, zzcsk>> zzffn;
    private final zzeqd<Boolean> zzfle;
    private final zzeqd<zzctx> zzflg;

    public zzbly(zzeqd<Boolean> zzeqdVar, zzeqd<zzctx> zzeqdVar2, zzeqd<zzcvp<zzblb, zzdno, zzcsk>> zzeqdVar3) {
        this.zzfle = zzeqdVar;
        this.zzflg = zzeqdVar2;
        this.zzffn = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        boolean booleanValue = this.zzfle.get().booleanValue();
        zzcqq zzcqqVar = (zzctx) this.zzflg.get();
        zzcqq zzcqqVar2 = (zzcvp) this.zzffn.get();
        if (!booleanValue) {
            zzcqqVar = zzcqqVar2;
        }
        return (zzcqq) zzepw.zza(zzcqqVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
