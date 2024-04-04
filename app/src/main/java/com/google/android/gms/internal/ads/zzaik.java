package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaik implements Parcelable.Creator<zzaih> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaih[] newArray(int i) {
        return new zzaih[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaih createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                strArr = SafeParcelReader.createStringArray(parcel, readHeader);
            } else if (fieldId == 3) {
                strArr2 = SafeParcelReader.createStringArray(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzaih(str, strArr, strArr2);
    }
}
