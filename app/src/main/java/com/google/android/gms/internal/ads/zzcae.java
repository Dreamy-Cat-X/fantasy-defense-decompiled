package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqd;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcae implements zzepq<zzbna<zzblb>> {
    private final zzeqd<zzbsx> zzfwq;
    private final zzeqd<zzbff> zzgah;
    private final zzeqd<zzbqd.zza> zzgai;
    private final zzeqd<zzbvl> zzgaj;
    private final zzeqd<zzbzv> zzgak;

    public zzcae(zzeqd<zzbff> zzeqdVar, zzeqd<zzbqd.zza> zzeqdVar2, zzeqd<zzbvl> zzeqdVar3, zzeqd<zzbzv> zzeqdVar4, zzeqd<zzbsx> zzeqdVar5) {
        this.zzgah = zzeqdVar;
        this.zzgai = zzeqdVar2;
        this.zzgaj = zzeqdVar3;
        this.zzgak = zzeqdVar4;
        this.zzfwq = zzeqdVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        zzbff zzbffVar = this.zzgah.get();
        zzbqd.zza zzaVar = this.zzgai.get();
        zzbvl zzbvlVar = this.zzgaj.get();
        return (zzbna) zzepw.zza(zzbffVar.zzafa().zzd(zzaVar.zzalm()).zzd(zzbvlVar).zzb(this.zzgak.get()).zza(new zzcwh(null)).zza(new zzbms(this.zzfwq.get())).zzd(new zzbkw(null)).zzahm().zzahl(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
