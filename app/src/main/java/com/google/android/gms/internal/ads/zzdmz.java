package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdmz {
    private boolean zzbnf;
    private zzvp zzbpe;
    private zzadz zzdmv;
    private zzajh zzdty;
    private zzxu zzhjb;
    private zzaaq zzhjc;
    private zzvi zzhjd;
    private String zzhje;
    private ArrayList<String> zzhjf;
    private ArrayList<String> zzhjg;
    private zzvu zzhjh;
    private AdManagerAdViewOptions zzhji;
    private PublisherAdViewOptions zzhjj;
    private zzxo zzhjk;
    private int zzgxk = 1;
    private zzdmq zzhjn = new zzdmq();
    private boolean zzgyz = false;

    public final zzdmz zzh(zzvi zzviVar) {
        this.zzhjd = zzviVar;
        return this;
    }

    public final zzvi zzavf() {
        return this.zzhjd;
    }

    public final zzdmz zzg(zzvp zzvpVar) {
        this.zzbpe = zzvpVar;
        return this;
    }

    public final zzdmz zzbl(boolean z) {
        this.zzgyz = z;
        return this;
    }

    public final zzvp zzkf() {
        return this.zzbpe;
    }

    public final zzdmz zzc(zzxu zzxuVar) {
        this.zzhjb = zzxuVar;
        return this;
    }

    public final zzdmz zzgs(String str) {
        this.zzhje = str;
        return this;
    }

    public final String zzavg() {
        return this.zzhje;
    }

    public final zzdmz zzc(zzaaq zzaaqVar) {
        this.zzhjc = zzaaqVar;
        return this;
    }

    public final zzdmq zzavh() {
        return this.zzhjn;
    }

    public final zzdmz zzbm(boolean z) {
        this.zzbnf = z;
        return this;
    }

    public final zzdmz zzef(int i) {
        this.zzgxk = i;
        return this;
    }

    public final zzdmz zzc(ArrayList<String> arrayList) {
        this.zzhjf = arrayList;
        return this;
    }

    public final zzdmz zzd(ArrayList<String> arrayList) {
        this.zzhjg = arrayList;
        return this;
    }

    public final zzdmz zzb(zzadz zzadzVar) {
        this.zzdmv = zzadzVar;
        return this;
    }

    public final zzdmz zzb(zzvu zzvuVar) {
        this.zzhjh = zzvuVar;
        return this;
    }

    public final zzdmz zzb(zzajh zzajhVar) {
        this.zzdty = zzajhVar;
        this.zzhjc = new zzaaq(false, true, false);
        return this;
    }

    public final zzdmz zzb(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzhjj = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zzbnf = publisherAdViewOptions.getManualImpressionsEnabled();
            this.zzhjk = publisherAdViewOptions.zzjv();
        }
        return this;
    }

    public final zzdmz zzb(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzhji = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zzbnf = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzdmz zzb(zzdmx zzdmxVar) {
        this.zzhjn.zza(zzdmxVar.zzhjl);
        this.zzhjd = zzdmxVar.zzhjd;
        this.zzbpe = zzdmxVar.zzbpe;
        this.zzhjb = zzdmxVar.zzhjb;
        this.zzhje = zzdmxVar.zzhje;
        this.zzhjc = zzdmxVar.zzhjc;
        this.zzhjf = zzdmxVar.zzhjf;
        this.zzhjg = zzdmxVar.zzhjg;
        this.zzdmv = zzdmxVar.zzdmv;
        this.zzhjh = zzdmxVar.zzhjh;
        zzdmz zzb = zzb(zzdmxVar.zzhji).zzb(zzdmxVar.zzhjj);
        zzb.zzgyz = zzdmxVar.zzgyz;
        return zzb;
    }

    public final zzdmx zzavi() {
        Preconditions.checkNotNull(this.zzhje, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzbpe, "ad size must not be null");
        Preconditions.checkNotNull(this.zzhjd, "ad request must not be null");
        return new zzdmx(this);
    }

    public final boolean zzavj() {
        return this.zzgyz;
    }

    public static /* synthetic */ zzvp zza(zzdmz zzdmzVar) {
        return zzdmzVar.zzbpe;
    }

    public static /* synthetic */ String zzb(zzdmz zzdmzVar) {
        return zzdmzVar.zzhje;
    }

    public static /* synthetic */ zzxu zzc(zzdmz zzdmzVar) {
        return zzdmzVar.zzhjb;
    }

    public static /* synthetic */ ArrayList zzd(zzdmz zzdmzVar) {
        return zzdmzVar.zzhjf;
    }

    public static /* synthetic */ ArrayList zze(zzdmz zzdmzVar) {
        return zzdmzVar.zzhjg;
    }

    public static /* synthetic */ zzvu zzf(zzdmz zzdmzVar) {
        return zzdmzVar.zzhjh;
    }

    public static /* synthetic */ int zzg(zzdmz zzdmzVar) {
        return zzdmzVar.zzgxk;
    }

    public static /* synthetic */ AdManagerAdViewOptions zzh(zzdmz zzdmzVar) {
        return zzdmzVar.zzhji;
    }

    public static /* synthetic */ PublisherAdViewOptions zzi(zzdmz zzdmzVar) {
        return zzdmzVar.zzhjj;
    }

    public static /* synthetic */ zzxo zzj(zzdmz zzdmzVar) {
        return zzdmzVar.zzhjk;
    }

    public static /* synthetic */ zzajh zzk(zzdmz zzdmzVar) {
        return zzdmzVar.zzdty;
    }

    public static /* synthetic */ zzdmq zzl(zzdmz zzdmzVar) {
        return zzdmzVar.zzhjn;
    }

    public static /* synthetic */ boolean zzm(zzdmz zzdmzVar) {
        return zzdmzVar.zzgyz;
    }

    public static /* synthetic */ zzvi zzn(zzdmz zzdmzVar) {
        return zzdmzVar.zzhjd;
    }

    public static /* synthetic */ boolean zzo(zzdmz zzdmzVar) {
        return zzdmzVar.zzbnf;
    }

    public static /* synthetic */ zzaaq zzp(zzdmz zzdmzVar) {
        return zzdmzVar.zzhjc;
    }

    public static /* synthetic */ zzadz zzq(zzdmz zzdmzVar) {
        return zzdmzVar.zzdmv;
    }
}
