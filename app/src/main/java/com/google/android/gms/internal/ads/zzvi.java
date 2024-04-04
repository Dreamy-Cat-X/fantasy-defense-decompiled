package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzvi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvi> CREATOR = new zzvk();
    public final Bundle extras;
    public final int versionCode;
    public final int zzadl;
    public final int zzadm;
    public final String zzadn;
    public final boolean zzbnf;

    @Deprecated
    public final long zzcgx;

    @Deprecated
    public final int zzcgy;
    public final List<String> zzcgz;
    public final boolean zzcha;
    public final String zzchb;
    public final zzaam zzchc;
    public final String zzchd;
    public final Bundle zzche;
    public final Bundle zzchf;
    public final List<String> zzchg;
    public final String zzchh;
    public final String zzchi;

    @Deprecated
    public final boolean zzchj;
    public final zzva zzchk;
    public final List<String> zzchl;
    public final int zzchm;
    public final Location zzmy;

    public zzvi(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, zzaam zzaamVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3, zzva zzvaVar, int i4, String str5, List<String> list3, int i5) {
        this.versionCode = i;
        this.zzcgx = j;
        this.extras = bundle == null ? new Bundle() : bundle;
        this.zzcgy = i2;
        this.zzcgz = list;
        this.zzcha = z;
        this.zzadl = i3;
        this.zzbnf = z2;
        this.zzchb = str;
        this.zzchc = zzaamVar;
        this.zzmy = location;
        this.zzchd = str2;
        this.zzche = bundle2 == null ? new Bundle() : bundle2;
        this.zzchf = bundle3;
        this.zzchg = list2;
        this.zzchh = str3;
        this.zzchi = str4;
        this.zzchj = z3;
        this.zzchk = zzvaVar;
        this.zzadm = i4;
        this.zzadn = str5;
        this.zzchl = list3 == null ? new ArrayList<>() : list3;
        this.zzchm = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeLong(parcel, 2, this.zzcgx);
        SafeParcelWriter.writeBundle(parcel, 3, this.extras, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzcgy);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzcgz, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzcha);
        SafeParcelWriter.writeInt(parcel, 7, this.zzadl);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzbnf);
        SafeParcelWriter.writeString(parcel, 9, this.zzchb, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzchc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzmy, i, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzchd, false);
        SafeParcelWriter.writeBundle(parcel, 13, this.zzche, false);
        SafeParcelWriter.writeBundle(parcel, 14, this.zzchf, false);
        SafeParcelWriter.writeStringList(parcel, 15, this.zzchg, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzchh, false);
        SafeParcelWriter.writeString(parcel, 17, this.zzchi, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzchj);
        SafeParcelWriter.writeParcelable(parcel, 19, this.zzchk, i, false);
        SafeParcelWriter.writeInt(parcel, 20, this.zzadm);
        SafeParcelWriter.writeString(parcel, 21, this.zzadn, false);
        SafeParcelWriter.writeStringList(parcel, 22, this.zzchl, false);
        SafeParcelWriter.writeInt(parcel, 23, this.zzchm);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzvi)) {
            return false;
        }
        zzvi zzviVar = (zzvi) obj;
        return this.versionCode == zzviVar.versionCode && this.zzcgx == zzviVar.zzcgx && Objects.equal(this.extras, zzviVar.extras) && this.zzcgy == zzviVar.zzcgy && Objects.equal(this.zzcgz, zzviVar.zzcgz) && this.zzcha == zzviVar.zzcha && this.zzadl == zzviVar.zzadl && this.zzbnf == zzviVar.zzbnf && Objects.equal(this.zzchb, zzviVar.zzchb) && Objects.equal(this.zzchc, zzviVar.zzchc) && Objects.equal(this.zzmy, zzviVar.zzmy) && Objects.equal(this.zzchd, zzviVar.zzchd) && Objects.equal(this.zzche, zzviVar.zzche) && Objects.equal(this.zzchf, zzviVar.zzchf) && Objects.equal(this.zzchg, zzviVar.zzchg) && Objects.equal(this.zzchh, zzviVar.zzchh) && Objects.equal(this.zzchi, zzviVar.zzchi) && this.zzchj == zzviVar.zzchj && this.zzadm == zzviVar.zzadm && Objects.equal(this.zzadn, zzviVar.zzadn) && Objects.equal(this.zzchl, zzviVar.zzchl) && this.zzchm == zzviVar.zzchm;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.versionCode), Long.valueOf(this.zzcgx), this.extras, Integer.valueOf(this.zzcgy), this.zzcgz, Boolean.valueOf(this.zzcha), Integer.valueOf(this.zzadl), Boolean.valueOf(this.zzbnf), this.zzchb, this.zzchc, this.zzmy, this.zzchd, this.zzche, this.zzchf, this.zzchg, this.zzchh, this.zzchi, Boolean.valueOf(this.zzchj), Integer.valueOf(this.zzadm), this.zzadn, this.zzchl, Integer.valueOf(this.zzchm));
    }
}
