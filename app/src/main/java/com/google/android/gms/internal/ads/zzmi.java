package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzmi extends zzmn {
    public static final Parcelable.Creator<zzmi> CREATOR = new zzml();
    public final String description;
    public final String text;
    private final String zzahs;

    public zzmi(String str, String str2, String str3) {
        super("COMM");
        this.zzahs = str;
        this.description = str2;
        this.text = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmi(Parcel parcel) {
        super("COMM");
        this.zzahs = parcel.readString();
        this.description = parcel.readString();
        this.text = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmi zzmiVar = (zzmi) obj;
            if (zzps.zza(this.description, zzmiVar.description) && zzps.zza(this.zzahs, zzmiVar.zzahs) && zzps.zza(this.text, zzmiVar.text)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzahs;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.text;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.zzahs);
        parcel.writeString(this.text);
    }
}
