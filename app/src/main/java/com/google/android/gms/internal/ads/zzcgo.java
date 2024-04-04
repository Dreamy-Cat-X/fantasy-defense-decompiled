package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcgo implements zzepq<zzcqq<zzcgg>> {
    private final zzeqd<zzcvp<zzcgg, zzdno, zzcsn>> zzfqy;
    private final zzeqd<zzdmx> zzftm;
    private final zzeqd<zzcvp<zzcgg, zzdno, zzcsk>> zzgia;

    public zzcgo(zzeqd<zzcvp<zzcgg, zzdno, zzcsn>> zzeqdVar, zzeqd<zzcvp<zzcgg, zzdno, zzcsk>> zzeqdVar2, zzeqd<zzdmx> zzeqdVar3) {
        this.zzfqy = zzeqdVar;
        this.zzgia = zzeqdVar2;
        this.zzftm = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        zzcvp<zzcgg, zzdno, zzcsn> zzcvpVar;
        zzeqd<zzcvp<zzcgg, zzdno, zzcsn>> zzeqdVar = this.zzfqy;
        zzeqd<zzcvp<zzcgg, zzdno, zzcsk>> zzeqdVar2 = this.zzgia;
        if (zzcgp.zzgib[this.zzftm.get().zzhjl.zzhir - 1] == 1) {
            zzcvpVar = zzeqdVar.get();
        } else {
            zzcvpVar = zzeqdVar2.get();
        }
        return (zzcqq) zzepw.zza(zzcvpVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
