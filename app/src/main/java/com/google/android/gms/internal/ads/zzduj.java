package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzduj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzduj> CREATOR = new zzdui();
    private final int versionCode;
    private final String zzhrf;
    private final String zzhrg;
    private final int zzhrh;
    private final int zzhsx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduj(int i, int i2, int i3, String str, String str2) {
        this.versionCode = i;
        this.zzhrh = i2;
        this.zzhrf = str;
        this.zzhrg = str2;
        this.zzhsx = i3;
    }

    public zzduj(int i, zzgq zzgqVar, String str, String str2) {
        this(1, i, zzgqVar.zzv(), str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeInt(parcel, 2, this.zzhrh);
        SafeParcelWriter.writeString(parcel, 3, this.zzhrf, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzhrg, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzhsx);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
