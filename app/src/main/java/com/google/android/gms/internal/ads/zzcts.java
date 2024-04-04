package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbqd;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcts extends zzctu<zzbnf> {
    private final zzbvl zzexd;
    private final zzbzv zzexf;
    private final zzbff zzgtg;
    private final zzbqd.zza zzgth;

    public zzcts(zzbff zzbffVar, zzbzv zzbzvVar, zzbqd.zza zzaVar, zzbvl zzbvlVar) {
        this.zzgtg = zzbffVar;
        this.zzexf = zzbzvVar;
        this.zzgth = zzaVar;
        this.zzexd = zzbvlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctu
    protected final zzdzl<zzbnf> zza(zzdmx zzdmxVar, Bundle bundle) {
        return this.zzgtg.zzafh().zza(this.zzgth.zza(zzdmxVar).zze(bundle).zzalm()).zza(this.zzexd).zza(this.zzexf).zza(new zzbkw(null)).zzagc().zzagu().zzaky();
    }
}
