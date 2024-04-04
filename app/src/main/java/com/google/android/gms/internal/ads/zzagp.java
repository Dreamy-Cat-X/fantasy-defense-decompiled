package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzagp {
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zzdfk;
    private final NativeCustomTemplateAd.OnCustomClickListener zzdfl;
    private NativeCustomTemplateAd zzdfm;

    public zzagp(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zzdfk = onCustomTemplateAdLoadedListener;
        this.zzdfl = onCustomClickListener;
    }

    public final zzafu zzty() {
        return new zzagu(this);
    }

    public final zzafp zztz() {
        if (this.zzdfl == null) {
            return null;
        }
        return new zzagr(this);
    }

    public final synchronized NativeCustomTemplateAd zzb(zzaff zzaffVar) {
        if (this.zzdfm != null) {
            return this.zzdfm;
        }
        zzafk zzafkVar = new zzafk(zzaffVar);
        this.zzdfm = zzafkVar;
        return zzafkVar;
    }
}
