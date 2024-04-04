package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzajk implements Parcelable.Creator<zzajh> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzajh[] newArray(int i) {
        return new zzajh[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzajh createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i2 = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 2) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                i3 = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 1000) {
                i = SafeParcelReader.readInt(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzajh(i, i2, str, i3);
    }
}
