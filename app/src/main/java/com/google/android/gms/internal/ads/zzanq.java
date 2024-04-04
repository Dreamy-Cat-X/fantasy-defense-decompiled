package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzanq implements MediationAdRequest {
    private final String zzadn;
    private final int zzcgy;
    private final boolean zzchj;
    private final int zzdmh;
    private final int zzdmi;
    private final Date zzmu;
    private final Set<String> zzmw;
    private final boolean zzmx;
    private final Location zzmy;

    public zzanq(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.zzmu = date;
        this.zzcgy = i;
        this.zzmw = set;
        this.zzmy = location;
        this.zzmx = z;
        this.zzdmh = i2;
        this.zzchj = z2;
        this.zzdmi = i3;
        this.zzadn = str;
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

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzchj;
    }
}
