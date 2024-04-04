package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzagr extends zzafs {
    private final /* synthetic */ zzagp zzdfn;

    private zzagr(zzagp zzagpVar) {
        this.zzdfn = zzagpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zza(zzaff zzaffVar, String str) {
        if (zzagp.zzb(this.zzdfn) == null) {
            return;
        }
        zzagp.zzb(this.zzdfn).onCustomClick(zzagp.zza(this.zzdfn, zzaffVar), str);
    }
}
