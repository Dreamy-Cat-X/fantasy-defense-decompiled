package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcxb extends zzxc {
    private zzwv zzbpi;
    private final zzbff zzgtg;
    private final Context zzgwb;
    private final zzdmz zzgwc = new zzdmz();
    private final zzcbv zzgwd = new zzcbv();

    public zzcxb(zzbff zzbffVar, Context context, String str) {
        this.zzgtg = zzbffVar;
        this.zzgwc.zzgs(str);
        this.zzgwb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final zzwy zzqy() {
        zzcbt zzaop = this.zzgwd.zzaop();
        this.zzgwc.zzc(zzaop.zzaom());
        this.zzgwc.zzd(zzaop.zzaon());
        zzdmz zzdmzVar = this.zzgwc;
        if (zzdmzVar.zzkf() == null) {
            zzdmzVar.zzg(zzvp.zzqd());
        }
        return new zzcxa(this.zzgwb, this.zzgtg, this.zzgwc, zzaop, this.zzbpi);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzb(zzwv zzwvVar) {
        this.zzbpi = zzwvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzafj zzafjVar) {
        this.zzgwd.zzb(zzafjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzagc zzagcVar) {
        this.zzgwd.zzb(zzagcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzafo zzafoVar) {
        this.zzgwd.zzb(zzafoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(String str, zzafu zzafuVar, zzafp zzafpVar) {
        this.zzgwd.zzb(str, zzafuVar, zzafpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzadz zzadzVar) {
        this.zzgwc.zzb(zzadzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzajh zzajhVar) {
        this.zzgwc.zzb(zzajhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzajp zzajpVar) {
        this.zzgwd.zzb(zzajpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzb(zzxu zzxuVar) {
        this.zzgwc.zzc(zzxuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzafx zzafxVar, zzvp zzvpVar) {
        this.zzgwd.zza(zzafxVar);
        this.zzgwc.zzg(zzvpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzgwc.zzb(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzgwc.zzb(adManagerAdViewOptions);
    }
}
