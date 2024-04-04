package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzdns;
import com.google.android.gms.internal.ads.zzdwi;
import com.google.android.gms.internal.ads.zzvc;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzap> CREATOR = new zzar();
    public final int errorCode;
    public final String zzack;

    public static zzap zzc(Throwable th) {
        String message;
        zzvc zzh = zzdns.zzh(th);
        if (zzdwi.zzar(th.getMessage())) {
            message = zzh.zzcgs;
        } else {
            message = th.getMessage();
        }
        return new zzap(message, zzh.errorCode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzap(String str, int i) {
        this.zzack = str == null ? "" : str;
        this.errorCode = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzack, false);
        SafeParcelWriter.writeInt(parcel, 2, this.errorCode);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
