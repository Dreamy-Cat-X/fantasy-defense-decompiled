package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zztb implements Parcelable.Creator<zztc> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zztc[] newArray(int i) {
        return new zztc[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zztc createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.createParcelable(parcel, readHeader, ParcelFileDescriptor.CREATOR);
            } else if (fieldId == 3) {
                z = SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId == 4) {
                z2 = SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId == 5) {
                j = SafeParcelReader.readLong(parcel, readHeader);
            } else if (fieldId == 6) {
                z3 = SafeParcelReader.readBoolean(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zztc(parcelFileDescriptor, z, z2, j, z3);
    }
}
