package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.reward.AdMetadataListener;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbti extends AdMetadataListener implements AppEventListener, com.google.android.gms.ads.internal.overlay.zzp, zzbqr, zzbrf, zzbrj, zzbsl, zzbsy, zzuz {
    private final zzbuj zzfyc = new zzbuj(this);

    @Nullable
    private zzcxf zzfyd;

    @Nullable
    private zzcxz zzfye;

    @Nullable
    private zzdht zzfyf;

    @Nullable
    private zzdkp zzfyg;

    public final zzbuj zzakq() {
        return this.zzfyc;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdOpened() {
        zza(this.zzfyd, (zzbum<zzcxf>) zzbth.zzfyb);
        zza(this.zzfyg, (zzbum<zzdkp>) zzbtk.zzfyb);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdClosed() {
        zza(this.zzfyd, (zzbum<zzcxf>) zzbtt.zzfyb);
        zza(this.zzfyg, (zzbum<zzdkp>) zzbub.zzfyb);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdLeftApplication() {
        zza(this.zzfyd, (zzbum<zzcxf>) zzbue.zzfyb);
        zza(this.zzfyg, (zzbum<zzdkp>) zzbud.zzfyb);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onRewardedVideoStarted() {
        zza(this.zzfyd, (zzbum<zzcxf>) zzbug.zzfyb);
        zza(this.zzfyg, (zzbum<zzdkp>) zzbuf.zzfyb);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzb(final zzato zzatoVar, final String str, final String str2) {
        zza(this.zzfyd, (zzbum<zzcxf>) new zzbum(zzatoVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzbui
            private final String zzdhw;
            private final String zzdkf;
            private final zzato zzfxs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxs = zzatoVar;
                this.zzdhw = str;
                this.zzdkf = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbum
            public final void zzp(Object obj) {
            }
        });
        zza(this.zzfyg, (zzbum<zzdkp>) new zzbum(zzatoVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzbuh
            private final String zzdhw;
            private final String zzdkf;
            private final zzato zzfxs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxs = zzatoVar;
                this.zzdhw = str;
                this.zzdkf = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbum
            public final void zzp(Object obj) {
                ((zzdkp) obj).zzb(this.zzfxs, this.zzdhw, this.zzdkf);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onRewardedVideoCompleted() {
        zza(this.zzfyd, (zzbum<zzcxf>) zzbtj.zzfyb);
        zza(this.zzfyg, (zzbum<zzdkp>) zzbtm.zzfyb);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void onAdClicked() {
        zza(this.zzfyd, (zzbum<zzcxf>) zzbtl.zzfyb);
        zza(this.zzfye, (zzbum<zzcxz>) zzbto.zzfyb);
    }

    @Override // com.google.android.gms.ads.doubleclick.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zza(this.zzfyd, (zzbum<zzcxf>) new zzbum(str, str2) { // from class: com.google.android.gms.internal.ads.zzbtn
            private final String zzdhw;
            private final String zzdjy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdjy = str;
                this.zzdhw = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbum
            public final void zzp(Object obj) {
                ((zzcxf) obj).onAppEvent(this.zzdjy, this.zzdhw);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzb(final zzvr zzvrVar) {
        zza(this.zzfyd, (zzbum<zzcxf>) new zzbum(zzvrVar) { // from class: com.google.android.gms.internal.ads.zzbtq
            private final zzvr zzfyh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfyh = zzvrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbum
            public final void zzp(Object obj) {
                ((zzcxf) obj).zzb(this.zzfyh);
            }
        });
        zza(this.zzfyg, (zzbum<zzdkp>) new zzbum(zzvrVar) { // from class: com.google.android.gms.internal.ads.zzbtp
            private final zzvr zzfyh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfyh = zzvrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbum
            public final void zzp(Object obj) {
                ((zzdkp) obj).zzb(this.zzfyh);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final void onAdImpression() {
        zza(this.zzfyd, (zzbum<zzcxf>) zzbts.zzfyb);
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final void zzalo() {
        zza(this.zzfyf, (zzbum<zzdht>) zzbtr.zzfyb);
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        zza(this.zzfyg, (zzbum<zzdkp>) zzbtu.zzfyb);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzk(final zzvc zzvcVar) {
        zza(this.zzfyg, (zzbum<zzdkp>) new zzbum(zzvcVar) { // from class: com.google.android.gms.internal.ads.zzbtw
            private final zzvc zzfxo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxo = zzvcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbum
            public final void zzp(Object obj) {
                ((zzdkp) obj).zzk(this.zzfxo);
            }
        });
        zza(this.zzfyd, (zzbum<zzcxf>) new zzbum(zzvcVar) { // from class: com.google.android.gms.internal.ads.zzbtv
            private final zzvc zzfxo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxo = zzvcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbum
            public final void zzp(Object obj) {
                ((zzcxf) obj).zzk(this.zzfxo);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzvn() {
        zza(this.zzfyf, (zzbum<zzdht>) zzbty.zzfyb);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zza(final com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        zza(this.zzfyf, (zzbum<zzdht>) new zzbum(zzlVar) { // from class: com.google.android.gms.internal.ads.zzbtx
            private final com.google.android.gms.ads.internal.overlay.zzl zzfxu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxu = zzlVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbum
            public final void zzp(Object obj) {
                ((zzdht) obj).zza(this.zzfxu);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onUserLeaveHint() {
        zza(this.zzfyf, (zzbum<zzdht>) zzbua.zzfyb);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onPause() {
        zza(this.zzfyf, (zzbum<zzdht>) zzbtz.zzfyb);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onResume() {
        zza(this.zzfyf, (zzbum<zzdht>) zzbuc.zzfyb);
    }

    private static <T> void zza(T t, zzbum<T> zzbumVar) {
        if (t != null) {
            zzbumVar.zzp(t);
        }
    }
}
