package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzaxi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaxi> CREATOR = new zzaxl();
    public final String zzbrc;

    @Deprecated
    public final String zzbup;

    @Deprecated
    public final zzvp zzdzu;
    public final zzvi zzdzv;

    public zzaxi(String str, String str2, zzvp zzvpVar, zzvi zzviVar) {
        this.zzbup = str;
        this.zzbrc = str2;
        this.zzdzu = zzvpVar;
        this.zzdzv = zzviVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzbup, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzbrc, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdzu, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzdzv, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
