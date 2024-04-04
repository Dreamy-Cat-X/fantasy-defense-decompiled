package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzasj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasj> CREATOR = new zzasi();
    public final boolean zzdvg;
    public final List<String> zzdvh;

    public zzasj() {
        this(false, Collections.emptyList());
    }

    public zzasj(boolean z, List<String> list) {
        this.zzdvg = z;
        this.zzdvh = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzdvg);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzdvh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
