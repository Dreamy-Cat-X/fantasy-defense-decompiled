package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcge implements zzaif {
    private final zzbrr zzfvb;
    private final zzaun zzghx;
    private final String zzghy;
    private final String zzghz;

    public zzcge(zzbrr zzbrrVar, zzdmi zzdmiVar) {
        this.zzfvb = zzbrrVar;
        this.zzghx = zzdmiVar.zzdur;
        this.zzghy = zzdmiVar.zzdkw;
        this.zzghz = zzdmiVar.zzdkx;
    }

    @Override // com.google.android.gms.internal.ads.zzaif
    public final void zzua() {
        this.zzfvb.onRewardedVideoStarted();
    }

    @Override // com.google.android.gms.internal.ads.zzaif
    @ParametersAreNonnullByDefault
    public final void zza(zzaun zzaunVar) {
        String str;
        int i;
        zzaun zzaunVar2 = this.zzghx;
        if (zzaunVar2 != null) {
            zzaunVar = zzaunVar2;
        }
        if (zzaunVar != null) {
            str = zzaunVar.type;
            i = zzaunVar.zzdxh;
        } else {
            str = "";
            i = 1;
        }
        this.zzfvb.zzb(new zzatm(str, i), this.zzghy, this.zzghz);
    }

    @Override // com.google.android.gms.internal.ads.zzaif
    public final void zzub() {
        this.zzfvb.onRewardedVideoCompleted();
    }
}
