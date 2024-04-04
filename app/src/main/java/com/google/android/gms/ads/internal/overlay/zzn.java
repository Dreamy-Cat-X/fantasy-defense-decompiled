package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.zzayt;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzn implements Parcelable.Creator<AdOverlayInfoParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzb zzbVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        zzayt zzaytVar = null;
        String str4 = null;
        com.google.android.gms.ads.internal.zzi zziVar = null;
        IBinder iBinder6 = null;
        String str5 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        IBinder iBinder10 = null;
        String str6 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    zzbVar = (zzb) SafeParcelReader.createParcelable(parcel, readHeader, zzb.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 6:
                    iBinder4 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 7:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 10:
                    iBinder5 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 11:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 12:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 13:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 14:
                    zzaytVar = (zzayt) SafeParcelReader.createParcelable(parcel, readHeader, zzayt.CREATOR);
                    break;
                case 15:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 16:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 17:
                    zziVar = (com.google.android.gms.ads.internal.zzi) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.ads.internal.zzi.CREATOR);
                    break;
                case 18:
                    iBinder6 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 19:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 20:
                    iBinder7 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 21:
                    iBinder8 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 22:
                    iBinder9 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 23:
                    iBinder10 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 24:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new AdOverlayInfoParcel(zzbVar, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, zzaytVar, str4, zziVar, iBinder6, str5, iBinder7, iBinder8, iBinder9, iBinder10, str6);
    }
}
