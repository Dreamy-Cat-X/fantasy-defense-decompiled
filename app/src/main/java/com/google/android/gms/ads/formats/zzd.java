package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzd implements Parcelable.Creator<PublisherAdViewOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PublisherAdViewOptions[] newArray(int i) {
        return new PublisherAdViewOptions[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PublisherAdViewOptions createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        boolean z = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                z = SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId == 2) {
                iBinder = SafeParcelReader.readIBinder(parcel, readHeader);
            } else if (fieldId == 3) {
                iBinder2 = SafeParcelReader.readIBinder(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new PublisherAdViewOptions(z, iBinder, iBinder2);
    }
}
