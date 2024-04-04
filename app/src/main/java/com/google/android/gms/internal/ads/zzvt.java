package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzvt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvt> CREATOR = new zzvs();
    public String zzchy;
    public long zzchz;
    public zzvc zzcia;
    public Bundle zzcib;

    public zzvt(String str, long j, zzvc zzvcVar, Bundle bundle) {
        this.zzchy = str;
        this.zzchz = j;
        this.zzcia = zzvcVar;
        this.zzcib = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzchy, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzchz);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzcia, i, false);
        SafeParcelWriter.writeBundle(parcel, 4, this.zzcib, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
