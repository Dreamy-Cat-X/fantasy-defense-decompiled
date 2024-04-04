package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzpx implements Parcelable {
    public static final Parcelable.Creator<zzpx> CREATOR = new zzpw();
    private int zzahu;
    public final int zzars;
    public final int zzart;
    public final int zzaru;
    public final byte[] zzbkq;

    public zzpx(int i, int i2, int i3, byte[] bArr) {
        this.zzars = i;
        this.zzaru = i2;
        this.zzart = i3;
        this.zzbkq = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpx(Parcel parcel) {
        this.zzars = parcel.readInt();
        this.zzaru = parcel.readInt();
        this.zzart = parcel.readInt();
        this.zzbkq = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzpx zzpxVar = (zzpx) obj;
            if (this.zzars == zzpxVar.zzars && this.zzaru == zzpxVar.zzaru && this.zzart == zzpxVar.zzart && Arrays.equals(this.zzbkq, zzpxVar.zzbkq)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int i = this.zzars;
        int i2 = this.zzaru;
        int i3 = this.zzart;
        boolean z = this.zzbkq != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.zzahu == 0) {
            this.zzahu = ((((((this.zzars + 527) * 31) + this.zzaru) * 31) + this.zzart) * 31) + Arrays.hashCode(this.zzbkq);
        }
        return this.zzahu;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzars);
        parcel.writeInt(this.zzaru);
        parcel.writeInt(this.zzart);
        parcel.writeInt(this.zzbkq != null ? 1 : 0);
        byte[] bArr = this.zzbkq;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
