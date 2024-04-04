package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdkp extends AdMetadataListener implements zzbqr, zzbqw, zzbrf, zzbsg, zzbsy, zzdjw {
    private final zzdok zzhdz;
    private final AtomicReference<AdMetadataListener> zzhgi = new AtomicReference<>();
    private final AtomicReference<zzauy> zzhgj = new AtomicReference<>();
    private final AtomicReference<zzauv> zzhgk = new AtomicReference<>();
    private final AtomicReference<zzaty> zzhgl = new AtomicReference<>();
    private final AtomicReference<zzavd> zzhgm = new AtomicReference<>();
    private final AtomicReference<zzatt> zzhgn = new AtomicReference<>();
    private final AtomicReference<zzyo> zzhgo = new AtomicReference<>();
    private zzdkp zzhgp = null;

    public zzdkp(zzdok zzdokVar) {
        this.zzhdz = zzdokVar;
    }

    public final void zzb(zzauy zzauyVar) {
        this.zzhgj.set(zzauyVar);
    }

    public final void zzb(zzauv zzauvVar) {
        this.zzhgk.set(zzauvVar);
    }

    public final void zzb(zzavd zzavdVar) {
        this.zzhgm.set(zzavdVar);
    }

    public final void zza(AdMetadataListener adMetadataListener) {
        this.zzhgi.set(adMetadataListener);
    }

    public final void zzd(zzyo zzyoVar) {
        this.zzhgo.set(zzyoVar);
    }

    @Deprecated
    public final void zzb(zzaty zzatyVar) {
        this.zzhgl.set(zzatyVar);
    }

    @Deprecated
    public final void zzb(zzatt zzattVar) {
        this.zzhgn.set(zzattVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void onAdLoaded() {
        zzdkp zzdkpVar = this;
        while (true) {
            zzdkp zzdkpVar2 = zzdkpVar.zzhgp;
            if (zzdkpVar2 == null) {
                zzdjl.zza(zzdkpVar.zzhgj, zzdks.zzgwi);
                zzdjl.zza(zzdkpVar.zzhgl, zzdkr.zzgwi);
                return;
            }
            zzdkpVar = zzdkpVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzd(final zzvc zzvcVar) {
        zzdkp zzdkpVar = this;
        while (true) {
            zzdkp zzdkpVar2 = zzdkpVar.zzhgp;
            if (zzdkpVar2 == null) {
                final int i = zzvcVar.errorCode;
                zzdjl.zza(zzdkpVar.zzhgj, new zzdjo(zzvcVar) { // from class: com.google.android.gms.internal.ads.zzdle
                    private final zzvc zzfxo;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfxo = zzvcVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdjo
                    public final void zzp(Object obj) {
                        ((zzauy) obj).zzj(this.zzfxo);
                    }
                });
                zzdjl.zza(zzdkpVar.zzhgj, new zzdjo(i) { // from class: com.google.android.gms.internal.ads.zzdld
                    private final int zzefz;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzefz = i;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdjo
                    public final void zzp(Object obj) {
                        ((zzauy) obj).onRewardedAdFailedToLoad(this.zzefz);
                    }
                });
                zzdjl.zza(zzdkpVar.zzhgl, new zzdjo(i) { // from class: com.google.android.gms.internal.ads.zzdlg
                    private final int zzefz;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzefz = i;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdjo
                    public final void zzp(Object obj) {
                        ((zzaty) obj).onRewardedVideoAdFailedToLoad(this.zzefz);
                    }
                });
                return;
            }
            zzdkpVar = zzdkpVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdOpened() {
        zzdkp zzdkpVar = this;
        while (true) {
            zzdkp zzdkpVar2 = zzdkpVar.zzhgp;
            if (zzdkpVar2 == null) {
                zzdjl.zza(zzdkpVar.zzhgk, zzdlf.zzgwi);
                zzdjl.zza(zzdkpVar.zzhgl, zzdli.zzgwi);
                return;
            }
            zzdkpVar = zzdkpVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdClosed() {
        zzdkp zzdkpVar = this;
        while (true) {
            zzdkp zzdkpVar2 = zzdkpVar.zzhgp;
            if (zzdkpVar2 == null) {
                zzdkpVar.zzhdz.onAdClosed();
                zzdjl.zza(zzdkpVar.zzhgk, zzdlh.zzgwi);
                zzdjl.zza(zzdkpVar.zzhgl, zzdlk.zzgwi);
                return;
            }
            zzdkpVar = zzdkpVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdLeftApplication() {
        zzdkp zzdkpVar = this;
        while (true) {
            zzdkp zzdkpVar2 = zzdkpVar.zzhgp;
            if (zzdkpVar2 == null) {
                zzdjl.zza(zzdkpVar.zzhgl, zzdlj.zzgwi);
                return;
            }
            zzdkpVar = zzdkpVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onRewardedVideoStarted() {
        zzdkp zzdkpVar = this;
        while (true) {
            zzdkp zzdkpVar2 = zzdkpVar.zzhgp;
            if (zzdkpVar2 == null) {
                zzdjl.zza(zzdkpVar.zzhgl, zzdku.zzgwi);
                return;
            }
            zzdkpVar = zzdkpVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzb(final zzato zzatoVar, final String str, final String str2) {
        zzdkp zzdkpVar = this;
        while (true) {
            zzdkp zzdkpVar2 = zzdkpVar.zzhgp;
            if (zzdkpVar2 == null) {
                zzdjl.zza(zzdkpVar.zzhgk, new zzdjo(zzatoVar) { // from class: com.google.android.gms.internal.ads.zzdkt
                    private final zzato zzfxs;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfxs = zzatoVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdjo
                    public final void zzp(Object obj) {
                        zzato zzatoVar2 = this.zzfxs;
                        ((zzauv) obj).zza(new zzavm(zzatoVar2.getType(), zzatoVar2.getAmount()));
                    }
                });
                zzdjl.zza(zzdkpVar.zzhgm, new zzdjo(zzatoVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzdkw
                    private final String zzdhw;
                    private final String zzdkf;
                    private final zzato zzfxs;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfxs = zzatoVar;
                        this.zzdhw = str;
                        this.zzdkf = str2;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdjo
                    public final void zzp(Object obj) {
                        zzato zzatoVar2 = this.zzfxs;
                        ((zzavd) obj).zza(new zzavm(zzatoVar2.getType(), zzatoVar2.getAmount()), this.zzdhw, this.zzdkf);
                    }
                });
                zzdjl.zza(zzdkpVar.zzhgl, new zzdjo(zzatoVar) { // from class: com.google.android.gms.internal.ads.zzdkv
                    private final zzato zzfxs;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfxs = zzatoVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdjo
                    public final void zzp(Object obj) {
                        ((zzaty) obj).zza(this.zzfxs);
                    }
                });
                zzdjl.zza(zzdkpVar.zzhgn, new zzdjo(zzatoVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzdky
                    private final String zzdhw;
                    private final String zzdkf;
                    private final zzato zzfxs;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfxs = zzatoVar;
                        this.zzdhw = str;
                        this.zzdkf = str2;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdjo
                    public final void zzp(Object obj) {
                        ((zzatt) obj).zza(this.zzfxs, this.zzdhw, this.zzdkf);
                    }
                });
                return;
            }
            zzdkpVar = zzdkpVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onRewardedVideoCompleted() {
        zzdkp zzdkpVar = this;
        while (true) {
            zzdkp zzdkpVar2 = zzdkpVar.zzhgp;
            if (zzdkpVar2 == null) {
                zzdjl.zza(zzdkpVar.zzhgl, zzdkx.zzgwi);
                return;
            }
            zzdkpVar = zzdkpVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzk(final zzvc zzvcVar) {
        zzdkp zzdkpVar = this;
        while (true) {
            zzdkp zzdkpVar2 = zzdkpVar.zzhgp;
            if (zzdkpVar2 == null) {
                zzdjl.zza(zzdkpVar.zzhgk, new zzdjo(zzvcVar) { // from class: com.google.android.gms.internal.ads.zzdla
                    private final zzvc zzfxo;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfxo = zzvcVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdjo
                    public final void zzp(Object obj) {
                        ((zzauv) obj).zzi(this.zzfxo);
                    }
                });
                zzdjl.zza(zzdkpVar.zzhgk, new zzdjo(zzvcVar) { // from class: com.google.android.gms.internal.ads.zzdkz
                    private final zzvc zzfxo;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfxo = zzvcVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdjo
                    public final void zzp(Object obj) {
                        ((zzauv) obj).onRewardedAdFailedToShow(this.zzfxo.errorCode);
                    }
                });
                return;
            }
            zzdkpVar = zzdkpVar2;
        }
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        zzdkp zzdkpVar = this.zzhgp;
        if (zzdkpVar != null) {
            zzdkpVar.onAdMetadataChanged();
        } else {
            zzdjl.zza(this.zzhgi, zzdlc.zzgwi);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzb(final zzvr zzvrVar) {
        zzdkp zzdkpVar = this;
        while (true) {
            zzdkp zzdkpVar2 = zzdkpVar.zzhgp;
            if (zzdkpVar2 == null) {
                zzdjl.zza(zzdkpVar.zzhgo, new zzdjo(zzvrVar) { // from class: com.google.android.gms.internal.ads.zzdlb
                    private final zzvr zzfyh;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfyh = zzvrVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdjo
                    public final void zzp(Object obj) {
                        ((zzyo) obj).zza(this.zzfyh);
                    }
                });
                return;
            }
            zzdkpVar = zzdkpVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjw
    public final void zzb(zzdjw zzdjwVar) {
        this.zzhgp = (zzdkp) zzdjwVar;
    }
}
