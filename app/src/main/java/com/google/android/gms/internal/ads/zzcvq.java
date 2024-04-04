package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcvq implements zzbsc {
    private final /* synthetic */ zzcqs zzguf;
    private boolean zzgur = false;
    private final /* synthetic */ zzazc zzgus;
    private final /* synthetic */ zzcvp zzgut;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvq(zzcvp zzcvpVar, zzcqs zzcqsVar, zzazc zzazcVar) {
        this.zzgut = zzcvpVar;
        this.zzguf = zzcqsVar;
        this.zzgus = zzazcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void onAdFailedToLoad(int i) {
        if (this.zzgur) {
            return;
        }
        zzm(new zzvc(i, zzcvp.zza(this.zzguf.zzchy, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final synchronized void zzf(int i, String str) {
        if (this.zzgur) {
            return;
        }
        this.zzgur = true;
        if (str == null) {
            str = zzcvp.zza(this.zzguf.zzchy, i);
        }
        zzm(new zzvc(i, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final synchronized void zzd(zzvc zzvcVar) {
        this.zzgur = true;
        zzm(zzvcVar);
    }

    private final void zzm(zzvc zzvcVar) {
        zzdnu zzdnuVar = zzdnu.INTERNAL_ERROR;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcvm)).booleanValue()) {
            zzdnuVar = zzdnu.NO_FILL;
        }
        this.zzgus.setException(new zzcqu(zzdnuVar, zzvcVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final synchronized void onAdLoaded() {
        this.zzgus.set(null);
    }
}
