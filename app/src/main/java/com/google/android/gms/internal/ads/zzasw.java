package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzasw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasw> CREATOR = new zzasz();
    String zzdvr;

    public zzasw(String str) {
        this.zzdvr = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzdvr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
