package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaam> CREATOR = new zzaal();
    public final String zzbqr;

    public zzaam(SearchAdRequest searchAdRequest) {
        this.zzbqr = searchAdRequest.getQuery();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaam(String str) {
        this.zzbqr = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 15, this.zzbqr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
