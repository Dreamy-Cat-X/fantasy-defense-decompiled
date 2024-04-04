package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzasu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasu> CREATOR = new zzasx();
    private final ApplicationInfo applicationInfo;
    public final String packageName;
    public final zzayt zzdsc;
    public final PackageInfo zzdsj;
    public final List<String> zzdst;
    public final String zzdtc;
    public final Bundle zzdvn;
    public final String zzdvo;
    public zzdou zzdvp;
    public String zzdvq;

    public zzasu(Bundle bundle, zzayt zzaytVar, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, String str3, zzdou zzdouVar, String str4) {
        this.zzdvn = bundle;
        this.zzdsc = zzaytVar;
        this.packageName = str;
        this.applicationInfo = applicationInfo;
        this.zzdst = list;
        this.zzdsj = packageInfo;
        this.zzdtc = str2;
        this.zzdvo = str3;
        this.zzdvp = zzdouVar;
        this.zzdvq = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zzdvn, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdsc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.applicationInfo, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.packageName, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzdst, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzdsj, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzdtc, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzdvo, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzdvp, i, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzdvq, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
