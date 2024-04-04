package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzavl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzavl> CREATOR = new zzavk();
    public final String zzdxo;
    public final String zzdxp;

    public zzavl(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }

    public zzavl(String str, String str2) {
        this.zzdxo = str;
        this.zzdxp = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzdxo, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzdxp, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
