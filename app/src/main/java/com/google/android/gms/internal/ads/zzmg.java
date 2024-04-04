package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzmg implements Parcelable {
    public static final Parcelable.Creator<zzmg> CREATOR = new zzmf();
    private final zza[] zzbde;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public interface zza extends Parcelable {
    }

    public zzmg(List<? extends zza> list) {
        zza[] zzaVarArr = new zza[list.size()];
        this.zzbde = zzaVarArr;
        list.toArray(zzaVarArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmg(Parcel parcel) {
        this.zzbde = new zza[parcel.readInt()];
        int i = 0;
        while (true) {
            zza[] zzaVarArr = this.zzbde;
            if (i >= zzaVarArr.length) {
                return;
            }
            zzaVarArr[i] = (zza) parcel.readParcelable(zza.class.getClassLoader());
            i++;
        }
    }

    public final int length() {
        return this.zzbde.length;
    }

    public final zza zzay(int i) {
        return this.zzbde[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzbde, ((zzmg) obj).zzbde);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzbde);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzbde.length);
        for (zza zzaVar : this.zzbde) {
            parcel.writeParcelable(zzaVar, 0);
        }
    }
}
