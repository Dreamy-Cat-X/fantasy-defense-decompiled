package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzh();
    public final boolean zzbou;
    public final boolean zzbov;
    private final String zzbow;
    public final boolean zzbox;
    public final float zzboy;
    public final int zzboz;
    public final boolean zzbpa;
    public final boolean zzbpb;
    public final boolean zzbpc;

    public zzi(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, false, 0.0f, -1, z4, z5, z6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzi(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.zzbou = z;
        this.zzbov = z2;
        this.zzbow = str;
        this.zzbox = z3;
        this.zzboy = f;
        this.zzboz = i;
        this.zzbpa = z4;
        this.zzbpb = z5;
        this.zzbpc = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzbou);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzbov);
        SafeParcelWriter.writeString(parcel, 4, this.zzbow, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzbox);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzboy);
        SafeParcelWriter.writeInt(parcel, 7, this.zzboz);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzbpa);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzbpb);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzbpc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
