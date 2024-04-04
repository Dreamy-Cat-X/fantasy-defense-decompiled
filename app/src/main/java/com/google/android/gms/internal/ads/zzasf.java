package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzasf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasf> CREATOR = new zzase();
    private final ApplicationInfo applicationInfo;
    private final int versionCode;
    private final zzayt zzbpd;
    private final zzvp zzbpe;
    private final float zzbrt;
    private final String zzbup;
    private final String zzcix;
    private final boolean zzdll;
    private final zzadz zzdmv;
    private final List<String> zzdmw;
    private final int zzdoz;
    private final int zzdpa;
    private final Bundle zzdsh;
    private final zzvi zzdsi;
    private final PackageInfo zzdsj;
    private final String zzdsk;
    private final String zzdsl;
    private final Bundle zzdsm;
    private final int zzdsn;
    private final Bundle zzdso;
    private final boolean zzdsp;
    private final String zzdsq;
    private final long zzdsr;
    private final String zzdss;
    private final List<String> zzdst;
    private final String zzdsu;
    private final List<String> zzdsv;
    private final long zzdsw;
    private final String zzdsx;
    private final float zzdsy;
    private final int zzdsz;
    private final int zzdta;
    private final boolean zzdtb;
    private final String zzdtc;
    private final boolean zzdtd;
    private final String zzdte;
    private final int zzdtf;
    private final Bundle zzdtg;
    private final String zzdth;
    private final zzza zzdti;
    private final boolean zzdtj;
    private final Bundle zzdtk;
    private final String zzdtl;
    private final String zzdtm;
    private final String zzdtn;
    private final boolean zzdto;
    private final List<Integer> zzdtp;
    private final String zzdtq;
    private final List<String> zzdtr;
    private final int zzdts;
    private final boolean zzdtt;
    private final boolean zzdtu;
    private final boolean zzdtv;
    private final ArrayList<String> zzdtw;
    private final String zzdtx;
    private final zzajh zzdty;
    private final String zzdtz;
    private final Bundle zzdua;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasf(int i, Bundle bundle, zzvi zzviVar, zzvp zzvpVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzayt zzaytVar, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, zzadz zzadzVar, List<String> list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, String str9, String str10, boolean z4, int i7, Bundle bundle4, String str11, zzza zzzaVar, boolean z5, Bundle bundle5, String str12, String str13, String str14, boolean z6, List<Integer> list4, String str15, List<String> list5, int i8, boolean z7, boolean z8, boolean z9, ArrayList<String> arrayList, String str16, zzajh zzajhVar, String str17, Bundle bundle6) {
        List<String> unmodifiableList;
        List<String> unmodifiableList2;
        this.versionCode = i;
        this.zzdsh = bundle;
        this.zzdsi = zzviVar;
        this.zzbpe = zzvpVar;
        this.zzbup = str;
        this.applicationInfo = applicationInfo;
        this.zzdsj = packageInfo;
        this.zzdsk = str2;
        this.zzdsl = str3;
        this.zzcix = str4;
        this.zzbpd = zzaytVar;
        this.zzdsm = bundle2;
        this.zzdsn = i2;
        this.zzdmw = list;
        if (list3 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list3);
        }
        this.zzdsv = unmodifiableList;
        this.zzdso = bundle3;
        this.zzdsp = z;
        this.zzdoz = i3;
        this.zzdpa = i4;
        this.zzbrt = f;
        this.zzdsq = str5;
        this.zzdsr = j;
        this.zzdss = str6;
        if (list2 == null) {
            unmodifiableList2 = Collections.emptyList();
        } else {
            unmodifiableList2 = Collections.unmodifiableList(list2);
        }
        this.zzdst = unmodifiableList2;
        this.zzdsu = str7;
        this.zzdmv = zzadzVar;
        this.zzdsw = j2;
        this.zzdsx = str8;
        this.zzdsy = f2;
        this.zzdtd = z2;
        this.zzdsz = i5;
        this.zzdta = i6;
        this.zzdtb = z3;
        this.zzdtc = str9;
        this.zzdte = str10;
        this.zzdll = z4;
        this.zzdtf = i7;
        this.zzdtg = bundle4;
        this.zzdth = str11;
        this.zzdti = zzzaVar;
        this.zzdtj = z5;
        this.zzdtk = bundle5;
        this.zzdtl = str12;
        this.zzdtm = str13;
        this.zzdtn = str14;
        this.zzdto = z6;
        this.zzdtp = list4;
        this.zzdtq = str15;
        this.zzdtr = list5;
        this.zzdts = i8;
        this.zzdtt = z7;
        this.zzdtu = z8;
        this.zzdtv = z9;
        this.zzdtw = arrayList;
        this.zzdtx = str16;
        this.zzdty = zzajhVar;
        this.zzdtz = str17;
        this.zzdua = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzdsh, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdsi, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzbpe, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbup, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.applicationInfo, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzdsj, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzdsk, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzdsl, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzcix, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzbpd, i, false);
        SafeParcelWriter.writeBundle(parcel, 12, this.zzdsm, false);
        SafeParcelWriter.writeInt(parcel, 13, this.zzdsn);
        SafeParcelWriter.writeStringList(parcel, 14, this.zzdmw, false);
        SafeParcelWriter.writeBundle(parcel, 15, this.zzdso, false);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzdsp);
        SafeParcelWriter.writeInt(parcel, 18, this.zzdoz);
        SafeParcelWriter.writeInt(parcel, 19, this.zzdpa);
        SafeParcelWriter.writeFloat(parcel, 20, this.zzbrt);
        SafeParcelWriter.writeString(parcel, 21, this.zzdsq, false);
        SafeParcelWriter.writeLong(parcel, 25, this.zzdsr);
        SafeParcelWriter.writeString(parcel, 26, this.zzdss, false);
        SafeParcelWriter.writeStringList(parcel, 27, this.zzdst, false);
        SafeParcelWriter.writeString(parcel, 28, this.zzdsu, false);
        SafeParcelWriter.writeParcelable(parcel, 29, this.zzdmv, i, false);
        SafeParcelWriter.writeStringList(parcel, 30, this.zzdsv, false);
        SafeParcelWriter.writeLong(parcel, 31, this.zzdsw);
        SafeParcelWriter.writeString(parcel, 33, this.zzdsx, false);
        SafeParcelWriter.writeFloat(parcel, 34, this.zzdsy);
        SafeParcelWriter.writeInt(parcel, 35, this.zzdsz);
        SafeParcelWriter.writeInt(parcel, 36, this.zzdta);
        SafeParcelWriter.writeBoolean(parcel, 37, this.zzdtb);
        SafeParcelWriter.writeString(parcel, 39, this.zzdtc, false);
        SafeParcelWriter.writeBoolean(parcel, 40, this.zzdtd);
        SafeParcelWriter.writeString(parcel, 41, this.zzdte, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.zzdll);
        SafeParcelWriter.writeInt(parcel, 43, this.zzdtf);
        SafeParcelWriter.writeBundle(parcel, 44, this.zzdtg, false);
        SafeParcelWriter.writeString(parcel, 45, this.zzdth, false);
        SafeParcelWriter.writeParcelable(parcel, 46, this.zzdti, i, false);
        SafeParcelWriter.writeBoolean(parcel, 47, this.zzdtj);
        SafeParcelWriter.writeBundle(parcel, 48, this.zzdtk, false);
        SafeParcelWriter.writeString(parcel, 49, this.zzdtl, false);
        SafeParcelWriter.writeString(parcel, 50, this.zzdtm, false);
        SafeParcelWriter.writeString(parcel, 51, this.zzdtn, false);
        SafeParcelWriter.writeBoolean(parcel, 52, this.zzdto);
        SafeParcelWriter.writeIntegerList(parcel, 53, this.zzdtp, false);
        SafeParcelWriter.writeString(parcel, 54, this.zzdtq, false);
        SafeParcelWriter.writeStringList(parcel, 55, this.zzdtr, false);
        SafeParcelWriter.writeInt(parcel, 56, this.zzdts);
        SafeParcelWriter.writeBoolean(parcel, 57, this.zzdtt);
        SafeParcelWriter.writeBoolean(parcel, 58, this.zzdtu);
        SafeParcelWriter.writeBoolean(parcel, 59, this.zzdtv);
        SafeParcelWriter.writeStringList(parcel, 60, this.zzdtw, false);
        SafeParcelWriter.writeString(parcel, 61, this.zzdtx, false);
        SafeParcelWriter.writeParcelable(parcel, 63, this.zzdty, i, false);
        SafeParcelWriter.writeString(parcel, 64, this.zzdtz, false);
        SafeParcelWriter.writeBundle(parcel, 65, this.zzdua, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
