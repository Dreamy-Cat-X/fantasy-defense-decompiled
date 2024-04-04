package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbqd;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzctz extends zzctu<zzbyd> {
    private final zzbvl zzexd;
    private final zzcwh zzfln;
    private final zzbff zzgtg;
    private final zzbqd.zza zzgth;

    public zzctz(zzbff zzbffVar, zzbqd.zza zzaVar, zzcwh zzcwhVar, zzbvl zzbvlVar) {
        this.zzgtg = zzbffVar;
        this.zzgth = zzaVar;
        this.zzfln = zzcwhVar;
        this.zzexd = zzbvlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctu
    protected final zzdzl<zzbyd> zza(zzdmx zzdmxVar, Bundle bundle) {
        return this.zzgtg.zzaff().zze(this.zzgth.zza(zzdmxVar).zze(bundle).zzalm()).zze(this.zzexd).zzb(this.zzfln).zzahu().zzagu().zzaky();
    }
}
