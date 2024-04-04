package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzauh implements Parcelable.Creator<zzaue> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaue[] newArray(int i) {
        return new zzaue[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaue createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzvi zzviVar = null;
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                zzviVar = (zzvi) SafeParcelReader.createParcelable(parcel, readHeader, zzvi.CREATOR);
            } else if (fieldId == 3) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzaue(zzviVar, str);
    }
}
