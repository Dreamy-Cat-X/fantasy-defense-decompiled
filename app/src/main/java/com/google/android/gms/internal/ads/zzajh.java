package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzajh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzajh> CREATOR = new zzajk();
    public final int versionCode;
    public final int zzbnq;
    public final int zzdhq;
    public final String zzdhr;

    public zzajh(zzajt zzajtVar) {
        this(2, 1, zzajtVar.zzue(), zzajtVar.getMediaAspectRatio());
    }

    public zzajh(int i, int i2, String str, int i3) {
        this.versionCode = i;
        this.zzdhq = i2;
        this.zzdhr = str;
        this.zzbnq = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzdhq);
        SafeParcelWriter.writeString(parcel, 2, this.zzdhr, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzbnq);
        SafeParcelWriter.writeInt(parcel, 1000, this.versionCode);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
