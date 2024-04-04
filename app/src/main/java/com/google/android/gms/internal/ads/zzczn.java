package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzczn implements zzepq<zzdzl<zzczr>> {
    private final zzeqd<zzdqy> zzftq;
    private final zzeqd<zzczq> zzgyj;
    private final zzeqd<zzbpw> zzgyk;

    public zzczn(zzeqd<zzdqy> zzeqdVar, zzeqd<zzczq> zzeqdVar2, zzeqd<zzbpw> zzeqdVar3) {
        this.zzftq = zzeqdVar;
        this.zzgyj = zzeqdVar2;
        this.zzgyk = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzdzl) zzepw.zza(this.zzftq.get().zza((zzdqy) zzdqz.GENERATE_SIGNALS, (zzdzl) this.zzgyk.get().zzalg()).zza(this.zzgyj.get()).zza(((Integer) zzwo.zzqq().zzd(zzabh.zzcvq)).intValue(), TimeUnit.SECONDS).zzaxm(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
