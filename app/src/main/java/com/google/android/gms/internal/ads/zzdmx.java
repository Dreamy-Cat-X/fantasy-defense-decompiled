package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdmx {
    public final zzvp zzbpe;
    public final zzadz zzdmv;
    public final zzajh zzdty;
    public final int zzgxk;
    public final boolean zzgyz;
    public final zzxu zzhjb;
    public final zzaaq zzhjc;
    public final zzvi zzhjd;
    public final String zzhje;
    public final ArrayList<String> zzhjf;
    public final ArrayList<String> zzhjg;
    public final zzvu zzhjh;
    public final AdManagerAdViewOptions zzhji;
    public final PublisherAdViewOptions zzhjj;
    public final zzxo zzhjk;
    public final zzdmo zzhjl;

    private zzdmx(zzdmz zzdmzVar) {
        zzaaq zzaaqVar;
        zzadz zzq;
        this.zzbpe = zzdmz.zza(zzdmzVar);
        this.zzhje = zzdmz.zzb(zzdmzVar);
        this.zzhjb = zzdmz.zzc(zzdmzVar);
        this.zzhjd = new zzvi(zzdmz.zzn(zzdmzVar).versionCode, zzdmz.zzn(zzdmzVar).zzcgx, zzdmz.zzn(zzdmzVar).extras, zzdmz.zzn(zzdmzVar).zzcgy, zzdmz.zzn(zzdmzVar).zzcgz, zzdmz.zzn(zzdmzVar).zzcha, zzdmz.zzn(zzdmzVar).zzadl, zzdmz.zzn(zzdmzVar).zzbnf || zzdmz.zzo(zzdmzVar), zzdmz.zzn(zzdmzVar).zzchb, zzdmz.zzn(zzdmzVar).zzchc, zzdmz.zzn(zzdmzVar).zzmy, zzdmz.zzn(zzdmzVar).zzchd, zzdmz.zzn(zzdmzVar).zzche, zzdmz.zzn(zzdmzVar).zzchf, zzdmz.zzn(zzdmzVar).zzchg, zzdmz.zzn(zzdmzVar).zzchh, zzdmz.zzn(zzdmzVar).zzchi, zzdmz.zzn(zzdmzVar).zzchj, zzdmz.zzn(zzdmzVar).zzchk, zzdmz.zzn(zzdmzVar).zzadm, zzdmz.zzn(zzdmzVar).zzadn, zzdmz.zzn(zzdmzVar).zzchl, com.google.android.gms.ads.internal.util.zzm.zzdg(zzdmz.zzn(zzdmzVar).zzchm));
        if (zzdmz.zzp(zzdmzVar) != null) {
            zzaaqVar = zzdmz.zzp(zzdmzVar);
        } else {
            zzaaqVar = zzdmz.zzq(zzdmzVar) != null ? zzdmz.zzq(zzdmzVar).zzdeu : null;
        }
        this.zzhjc = zzaaqVar;
        this.zzhjf = zzdmz.zzd(zzdmzVar);
        this.zzhjg = zzdmz.zze(zzdmzVar);
        if (zzdmz.zzd(zzdmzVar) == null) {
            zzq = null;
        } else if (zzdmz.zzq(zzdmzVar) == null) {
            zzq = new zzadz(new NativeAdOptions.Builder().build());
        } else {
            zzq = zzdmz.zzq(zzdmzVar);
        }
        this.zzdmv = zzq;
        this.zzhjh = zzdmz.zzf(zzdmzVar);
        this.zzgxk = zzdmz.zzg(zzdmzVar);
        this.zzhji = zzdmz.zzh(zzdmzVar);
        this.zzhjj = zzdmz.zzi(zzdmzVar);
        this.zzhjk = zzdmz.zzj(zzdmzVar);
        this.zzdty = zzdmz.zzk(zzdmzVar);
        this.zzhjl = new zzdmo(zzdmz.zzl(zzdmzVar));
        this.zzgyz = zzdmz.zzm(zzdmzVar);
    }

    public final zzagd zzavd() {
        if (this.zzhjj == null && this.zzhji == null) {
            return null;
        }
        PublisherAdViewOptions publisherAdViewOptions = this.zzhjj;
        if (publisherAdViewOptions != null) {
            return publisherAdViewOptions.zzjr();
        }
        return this.zzhji.zzjr();
    }
}
