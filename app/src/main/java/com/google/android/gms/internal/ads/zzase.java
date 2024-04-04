package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzase implements Parcelable.Creator<zzasf> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzasf[] newArray(int i) {
        return new zzasf[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzasf createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        Bundle bundle = null;
        zzvi zzviVar = null;
        zzvp zzvpVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzayt zzaytVar = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        zzadz zzadzVar = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        zzza zzzaVar = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        zzajh zzajhVar = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    bundle = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 3:
                    zzviVar = (zzvi) SafeParcelReader.createParcelable(parcel, readHeader, zzvi.CREATOR);
                    break;
                case 4:
                    zzvpVar = (zzvp) SafeParcelReader.createParcelable(parcel, readHeader, zzvp.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.createParcelable(parcel, readHeader, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.createParcelable(parcel, readHeader, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 10:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 11:
                    zzaytVar = (zzayt) SafeParcelReader.createParcelable(parcel, readHeader, zzayt.CREATOR);
                    break;
                case 12:
                    bundle2 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 13:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 14:
                    arrayList = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 16:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 38:
                case 62:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 18:
                    i3 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 19:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 20:
                    f = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 21:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 25:
                    j = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 26:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 27:
                    arrayList2 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 28:
                    str7 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 29:
                    zzadzVar = (zzadz) SafeParcelReader.createParcelable(parcel, readHeader, zzadz.CREATOR);
                    break;
                case 30:
                    arrayList3 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 31:
                    j2 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 33:
                    str8 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 34:
                    f2 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 35:
                    i5 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 36:
                    i6 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 37:
                    z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 39:
                    str9 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 40:
                    z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 41:
                    str10 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 42:
                    z4 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 43:
                    i7 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 44:
                    bundle4 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 45:
                    str11 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 46:
                    zzzaVar = (zzza) SafeParcelReader.createParcelable(parcel, readHeader, zzza.CREATOR);
                    break;
                case 47:
                    z5 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 48:
                    bundle5 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 49:
                    str12 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 50:
                    str13 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 51:
                    str14 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 52:
                    z6 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 53:
                    arrayList4 = SafeParcelReader.createIntegerList(parcel, readHeader);
                    break;
                case 54:
                    str15 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 55:
                    arrayList5 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 56:
                    i8 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 57:
                    z7 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 58:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 59:
                    z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 60:
                    arrayList6 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 61:
                    str16 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 63:
                    zzajhVar = (zzajh) SafeParcelReader.createParcelable(parcel, readHeader, zzajh.CREATOR);
                    break;
                case 64:
                    str17 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 65:
                    bundle6 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzasf(i, bundle, zzviVar, zzvpVar, str, applicationInfo, packageInfo, str2, str3, str4, zzaytVar, bundle2, i2, arrayList, bundle3, z, i3, i4, f, str5, j, str6, arrayList2, str7, zzadzVar, arrayList3, j2, str8, f2, z2, i5, i6, z3, str9, str10, z4, i7, bundle4, str11, zzzaVar, z5, bundle5, str12, str13, str14, z6, arrayList4, str15, arrayList5, i8, z7, z8, z9, arrayList6, str16, zzajhVar, str17, bundle6);
    }
}
