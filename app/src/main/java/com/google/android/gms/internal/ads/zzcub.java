package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbqd;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcub extends zzctu<zzcgg> {
    private final zzbvl zzexd;
    private final zzbff zzgtg;
    private final zzbqd.zza zzgth;

    public zzcub(zzbff zzbffVar, zzbqd.zza zzaVar, zzbvl zzbvlVar) {
        this.zzgtg = zzbffVar;
        this.zzgth = zzaVar;
        this.zzexd = zzbvlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctu
    protected final zzdzl<zzcgg> zza(zzdmx zzdmxVar, Bundle bundle) {
        return this.zzgtg.zzafi().zzf(this.zzgth.zza(zzdmxVar).zze(bundle).zzalm()).zzf(this.zzexd).zzaid().zzagu().zzaky();
    }
}
