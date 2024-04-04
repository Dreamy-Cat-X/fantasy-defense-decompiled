package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaak> CREATOR = new zzaaj();
    private final int zzadl;
    private final int zzadm;

    public zzaak(int i, int i2) {
        this.zzadl = i;
        this.zzadm = i2;
    }

    public zzaak(RequestConfiguration requestConfiguration) {
        this.zzadl = requestConfiguration.getTagForChildDirectedTreatment();
        this.zzadm = requestConfiguration.getTagForUnderAgeOfConsent();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzadl);
        SafeParcelWriter.writeInt(parcel, 2, this.zzadm);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
