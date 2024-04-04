package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaij extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaij> CREATOR = new zzaim();
    public final byte[] data;
    public final int statusCode;
    public final boolean zzam;
    public final long zzan;
    public final String zzcgs;
    public final String[] zzdhe;
    public final String[] zzdhf;
    public final boolean zzdhg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaij(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.zzdhg = z;
        this.zzcgs = str;
        this.statusCode = i;
        this.data = bArr;
        this.zzdhe = strArr;
        this.zzdhf = strArr2;
        this.zzam = z2;
        this.zzan = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zzdhg);
        SafeParcelWriter.writeString(parcel, 2, this.zzcgs, false);
        SafeParcelWriter.writeInt(parcel, 3, this.statusCode);
        SafeParcelWriter.writeByteArray(parcel, 4, this.data, false);
        SafeParcelWriter.writeStringArray(parcel, 5, this.zzdhe, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.zzdhf, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzam);
        SafeParcelWriter.writeLong(parcel, 8, this.zzan);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
