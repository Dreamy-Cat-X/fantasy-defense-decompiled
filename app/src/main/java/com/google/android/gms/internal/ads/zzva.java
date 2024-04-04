package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzva extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzva> CREATOR = new zzvd();
    public final String zzcgp;
    public final String zzcgq;

    public zzva(String str, String str2) {
        this.zzcgp = str;
        this.zzcgq = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzcgp, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzcgq, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
