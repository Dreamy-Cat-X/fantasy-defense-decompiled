package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaaq> CREATOR = new zzaap();
    public final boolean zzadu;
    public final boolean zzadv;
    public final boolean zzadw;

    public zzaaq(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    public zzaaq(boolean z, boolean z2, boolean z3) {
        this.zzadu = z;
        this.zzadv = z2;
        this.zzadw = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzadu);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzadv);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzadw);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
