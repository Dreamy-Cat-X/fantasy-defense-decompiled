package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class VersionInfo {
    private final int zzetl;
    private final int zzetm;
    private final int zzetn;

    public VersionInfo(int i, int i2, int i3) {
        this.zzetl = i;
        this.zzetm = i2;
        this.zzetn = i3;
    }

    public final int getMajorVersion() {
        return this.zzetl;
    }

    public final int getMinorVersion() {
        return this.zzetm;
    }

    public final int getMicroVersion() {
        return this.zzetn;
    }
}
