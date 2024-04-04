package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaiv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaiv> CREATOR = new zzaiy();
    public final String description;
    public final String zzdhk;
    public final boolean zzdhl;
    public final int zzdhm;

    public zzaiv(String str, boolean z, int i, String str2) {
        this.zzdhk = str;
        this.zzdhl = z;
        this.zzdhm = i;
        this.description = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzdhk, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzdhl);
        SafeParcelWriter.writeInt(parcel, 3, this.zzdhm);
        SafeParcelWriter.writeString(parcel, 4, this.description, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
