package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzadz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzadz> CREATOR = new zzaec();
    public final int versionCode;
    public final int zzbnp;
    public final int zzbnq;
    public final boolean zzbnr;
    public final int zzbns;
    public final boolean zzbnu;
    public final boolean zzdet;
    public final zzaaq zzdeu;

    public zzadz(NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzaaq(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzjt(), nativeAdOptions.getMediaAspectRatio());
    }

    public zzadz(int i, boolean z, int i2, boolean z2, int i3, zzaaq zzaaqVar, boolean z3, int i4) {
        this.versionCode = i;
        this.zzdet = z;
        this.zzbnp = i2;
        this.zzbnr = z2;
        this.zzbns = i3;
        this.zzdeu = zzaaqVar;
        this.zzbnu = z3;
        this.zzbnq = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzdet);
        SafeParcelWriter.writeInt(parcel, 3, this.zzbnp);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzbnr);
        SafeParcelWriter.writeInt(parcel, 5, this.zzbns);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzdeu, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzbnu);
        SafeParcelWriter.writeInt(parcel, 8, this.zzbnq);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
