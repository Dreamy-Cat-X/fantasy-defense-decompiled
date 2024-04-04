package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdtz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdtz> CREATOR = new zzdty();
    private final String packageName;
    private final int versionCode;
    private final String zzhsk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtz(int i, String str, String str2) {
        this.versionCode = i;
        this.packageName = str;
        this.zzhsk = str2;
    }

    public zzdtz(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzhsk, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
