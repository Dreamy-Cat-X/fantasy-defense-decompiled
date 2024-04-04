package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zztw;
import com.google.android.gms.internal.ads.zzuc;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcir implements zzbqw, zzbrj, zzbsg, zzbtf, zzbvh, zzuz {
    private final zztu zzgjf;
    private boolean zzgjg = false;

    public zzcir(zztu zztuVar, @Nullable zzdkd zzdkdVar) {
        this.zzgjf = zztuVar;
        zztuVar.zza(zztw.zza.zzb.AD_REQUEST);
        if (zzdkdVar != null) {
            zztuVar.zza(zztw.zza.zzb.REQUEST_IS_PREFETCH);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzd(zzasu zzasuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzb(final zzdmt zzdmtVar) {
        this.zzgjf.zza(new zztt(zzdmtVar) { // from class: com.google.android.gms.internal.ads.zzciq
            private final zzdmt zzfya;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfya = zzdmtVar;
            }

            @Override // com.google.android.gms.internal.ads.zztt
            public final void zza(zzuc.zzi.zza zzaVar) {
                zzaVar.zza(zzaVar.zzod().zzbim().zza(zzaVar.zzod().zznh().zzbim().zzbt(this.zzfya.zzhiz.zzera.zzbvf)));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void onAdLoaded() {
        this.zzgjf.zza(zztw.zza.zzb.AD_LOADED);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzd(zzvc zzvcVar) {
        switch (zzvcVar.errorCode) {
            case 1:
                this.zzgjf.zza(zztw.zza.zzb.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                return;
            case 2:
                this.zzgjf.zza(zztw.zza.zzb.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                return;
            case 3:
                this.zzgjf.zza(zztw.zza.zzb.AD_FAILED_TO_LOAD_NO_FILL);
                return;
            case 4:
                this.zzgjf.zza(zztw.zza.zzb.AD_FAILED_TO_LOAD_TIMEOUT);
                return;
            case 5:
                this.zzgjf.zza(zztw.zza.zzb.AD_FAILED_TO_LOAD_CANCELLED);
                return;
            case 6:
                this.zzgjf.zza(zztw.zza.zzb.AD_FAILED_TO_LOAD_NO_ERROR);
                return;
            case 7:
                this.zzgjf.zza(zztw.zza.zzb.AD_FAILED_TO_LOAD_NOT_FOUND);
                return;
            default:
                this.zzgjf.zza(zztw.zza.zzb.AD_FAILED_TO_LOAD);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final synchronized void onAdImpression() {
        this.zzgjf.zza(zztw.zza.zzb.AD_IMPRESSION);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final synchronized void onAdClicked() {
        if (!this.zzgjg) {
            this.zzgjf.zza(zztw.zza.zzb.AD_FIRST_CLICK);
            this.zzgjg = true;
        } else {
            this.zzgjf.zza(zztw.zza.zzb.AD_SUBSEQUENT_CLICK);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzc(final zzuc.zzb zzbVar) {
        this.zzgjf.zza(new zztt(zzbVar) { // from class: com.google.android.gms.internal.ads.zzcit
            private final zzuc.zzb zzfyk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfyk = zzbVar;
            }

            @Override // com.google.android.gms.internal.ads.zztt
            public final void zza(zzuc.zzi.zza zzaVar) {
                zzaVar.zza(this.zzfyk);
            }
        });
        this.zzgjf.zza(zztw.zza.zzb.REQUEST_LOADED_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzd(final zzuc.zzb zzbVar) {
        this.zzgjf.zza(new zztt(zzbVar) { // from class: com.google.android.gms.internal.ads.zzcis
            private final zzuc.zzb zzfyk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfyk = zzbVar;
            }

            @Override // com.google.android.gms.internal.ads.zztt
            public final void zza(zzuc.zzi.zza zzaVar) {
                zzaVar.zza(this.zzfyk);
            }
        });
        this.zzgjf.zza(zztw.zza.zzb.REQUEST_SAVED_TO_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zze(final zzuc.zzb zzbVar) {
        this.zzgjf.zza(new zztt(zzbVar) { // from class: com.google.android.gms.internal.ads.zzciv
            private final zzuc.zzb zzfyk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfyk = zzbVar;
            }

            @Override // com.google.android.gms.internal.ads.zztt
            public final void zza(zzuc.zzi.zza zzaVar) {
                zzaVar.zza(this.zzfyk);
            }
        });
        this.zzgjf.zza(zztw.zza.zzb.REQUEST_PREFETCH_INTERCEPTED);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzbf(boolean z) {
        zztw.zza.zzb zzbVar;
        zztu zztuVar = this.zzgjf;
        if (z) {
            zzbVar = zztw.zza.zzb.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED;
        } else {
            zzbVar = zztw.zza.zzb.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED;
        }
        zztuVar.zza(zzbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzbg(boolean z) {
        zztw.zza.zzb zzbVar;
        zztu zztuVar = this.zzgjf;
        if (z) {
            zzbVar = zztw.zza.zzb.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED;
        } else {
            zzbVar = zztw.zza.zzb.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED;
        }
        zztuVar.zza(zzbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzalv() {
        this.zzgjf.zza(zztw.zza.zzb.REQUEST_FAILED_TO_LOAD_FROM_CACHE);
    }
}
