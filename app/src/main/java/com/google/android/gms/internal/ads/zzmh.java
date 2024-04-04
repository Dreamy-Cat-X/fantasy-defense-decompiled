package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzmh extends zzmn {
    public static final Parcelable.Creator<zzmh> CREATOR = new zzmj();
    private final String description;
    private final String mimeType;
    private final int zzbdf;
    private final byte[] zzbdg;

    public zzmh(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.mimeType = str;
        this.description = null;
        this.zzbdf = 3;
        this.zzbdg = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmh(Parcel parcel) {
        super("APIC");
        this.mimeType = parcel.readString();
        this.description = parcel.readString();
        this.zzbdf = parcel.readInt();
        this.zzbdg = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmh zzmhVar = (zzmh) obj;
            if (this.zzbdf == zzmhVar.zzbdf && zzps.zza(this.mimeType, zzmhVar.mimeType) && zzps.zza(this.description, zzmhVar.description) && Arrays.equals(this.zzbdg, zzmhVar.zzbdg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.zzbdf + 527) * 31;
        String str = this.mimeType;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.zzbdg);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.zzbdf);
        parcel.writeByteArray(this.zzbdg);
    }
}
