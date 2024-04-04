package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdtu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdtu> CREATOR = new zzdtx();
    private final int versionCode;
    private final byte[] zzhsi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtu(int i, byte[] bArr) {
        this.versionCode = i;
        this.zzhsi = bArr;
    }

    public zzdtu(byte[] bArr) {
        this(1, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzhsi, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
