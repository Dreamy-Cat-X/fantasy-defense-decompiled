package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdul extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdul> CREATOR = new zzduk();
    public final int status;
    private final int versionCode;
    public final byte[] zzhsy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdul(int i, byte[] bArr, int i2) {
        this.versionCode = i;
        this.zzhsy = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.status = i2;
    }

    public zzdul(byte[] bArr, int i) {
        this(1, null, 1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzhsy, false);
        SafeParcelWriter.writeInt(parcel, 3, this.status);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
