package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.kt.olleh.inapp.net.InAppError;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzany implements NativeMediationAdRequest {
    private final String zzadn;
    private final int zzcgy;
    private final boolean zzchj;
    private final int zzdmh;
    private final int zzdmi;
    private final zzadz zzdmv;
    private final List<String> zzdmw = new ArrayList();
    private final Map<String, Boolean> zzdmx = new HashMap();
    private final Date zzmu;
    private final Set<String> zzmw;
    private final boolean zzmx;
    private final Location zzmy;

    public zzany(Date date, int i, Set<String> set, Location location, boolean z, int i2, zzadz zzadzVar, List<String> list, boolean z2, int i3, String str) {
        this.zzmu = date;
        this.zzcgy = i;
        this.zzmw = set;
        this.zzmy = location;
        this.zzmx = z;
        this.zzdmh = i2;
        this.zzdmv = zzadzVar;
        this.zzchj = z2;
        this.zzdmi = i3;
        this.zzadn = str;
        if (list != null) {
            for (String str2 : list) {
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.zzdmx.put(split[1], true);
                        } else if ("false".equals(split[2])) {
                            this.zzdmx.put(split[1], false);
                        }
                    }
                } else {
                    this.zzdmw.add(str2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.zzmu;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.zzcgy;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.zzmw;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.zzmy;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.zzmx;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.zzdmh;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        if (this.zzdmv == null) {
            return null;
        }
        NativeAdOptions.Builder requestMultipleImages = new NativeAdOptions.Builder().setReturnUrlsForImageAssets(this.zzdmv.zzdet).setImageOrientation(this.zzdmv.zzbnp).setRequestMultipleImages(this.zzdmv.zzbnr);
        if (this.zzdmv.versionCode >= 2) {
            requestMultipleImages.setAdChoicesPlacement(this.zzdmv.zzbns);
        }
        if (this.zzdmv.versionCode >= 3 && this.zzdmv.zzdeu != null) {
            requestMultipleImages.setVideoOptions(new VideoOptions(this.zzdmv.zzdeu));
        }
        return requestMultipleImages.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return zzzj.zzrr().zzra();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return zzzj.zzrr().zzqz();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAppInstallAdRequested() {
        List<String> list = this.zzdmw;
        if (list != null) {
            return list.contains("2") || this.zzdmw.contains("6");
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        List<String> list = this.zzdmw;
        return list != null && list.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isContentAdRequested() {
        List<String> list = this.zzdmw;
        if (list != null) {
            return list.contains(InAppError.FAILED) || this.zzdmw.contains("6");
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzvk() {
        List<String> list = this.zzdmw;
        return list != null && list.contains("3");
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map<String, Boolean> zzvl() {
        return this.zzdmx;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzchj;
    }
}
