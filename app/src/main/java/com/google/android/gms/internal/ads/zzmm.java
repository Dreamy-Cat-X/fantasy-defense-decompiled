package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzmm extends zzmn {
    public static final Parcelable.Creator<zzmm> CREATOR = new zzmp();
    private final String description;
    private final String value;

    public zzmm(String str, String str2, String str3) {
        super(str);
        this.description = null;
        this.value = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmm(Parcel parcel) {
        super(parcel.readString());
        this.description = parcel.readString();
        this.value = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmm zzmmVar = (zzmm) obj;
            if (this.id.equals(zzmmVar.id) && zzps.zza(this.description, zzmmVar.description) && zzps.zza(this.value, zzmmVar.value)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.id.hashCode() + 527) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.value;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.description);
        parcel.writeString(this.value);
    }
}
