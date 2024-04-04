package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbqd;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzctx extends zzctu<zzblb> {
    private final zzbvl zzexd;
    private final zzbzv zzexf;
    private final zzcwh zzfln;
    private final ViewGroup zzfsr;
    private final zzbsx zzfuf;
    private final zzbff zzgtg;
    private final zzbqd.zza zzgth;

    public zzctx(zzbff zzbffVar, zzbqd.zza zzaVar, zzcwh zzcwhVar, zzbvl zzbvlVar, zzbzv zzbzvVar, zzbsx zzbsxVar, ViewGroup viewGroup) {
        this.zzgtg = zzbffVar;
        this.zzgth = zzaVar;
        this.zzfln = zzcwhVar;
        this.zzexd = zzbvlVar;
        this.zzexf = zzbzvVar;
        this.zzfuf = zzbsxVar;
        this.zzfsr = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzctu
    protected final zzdzl<zzblb> zza(zzdmx zzdmxVar, Bundle bundle) {
        return this.zzgtg.zzafa().zzd(this.zzgth.zza(zzdmxVar).zze(bundle).zzalm()).zzd(this.zzexd).zza(this.zzfln).zzb(this.zzexf).zza(new zzbms(this.zzfuf)).zzd(new zzbkw(this.zzfsr)).zzahm().zzagu().zzaky();
    }
}
