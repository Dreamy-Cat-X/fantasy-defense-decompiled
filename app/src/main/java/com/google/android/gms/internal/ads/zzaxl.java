package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaxl implements Parcelable.Creator<zzaxi> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaxi[] newArray(int i) {
        return new zzaxi[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaxi createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        zzvp zzvpVar = null;
        zzvi zzviVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                str2 = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                zzvpVar = (zzvp) SafeParcelReader.createParcelable(parcel, readHeader, zzvp.CREATOR);
            } else if (fieldId == 4) {
                zzviVar = (zzvi) SafeParcelReader.createParcelable(parcel, readHeader, zzvi.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzaxi(str, str2, zzvpVar, zzviVar);
    }
}
