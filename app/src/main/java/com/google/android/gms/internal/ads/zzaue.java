package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaue> CREATOR = new zzauh();
    public final String zzbup;
    public final zzvi zzdsi;

    public zzaue(zzvi zzviVar, String str) {
        this.zzdsi = zzviVar;
        this.zzbup = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdsi, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzbup, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
