package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzash extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzash> CREATOR = new zzasg();
    private final int errorCode;
    private final int orientation;
    private final int versionCode;
    private final zzasj zzbog;
    private final boolean zzbpb;
    private final boolean zzbpc;
    private final boolean zzbrh;
    private final String zzbvf;
    private final boolean zzchs;
    private final boolean zzcht;
    private final List<String> zzdlg;
    private final List<String> zzdlh;
    private final List<String> zzdli;
    private final List<String> zzdlk;
    private final boolean zzdll;
    private final long zzdln;
    private final String zzdrb;
    private final boolean zzdsp;
    private String zzdtc;
    private final boolean zzdto;
    private String zzdub;
    private final long zzduc;
    private final boolean zzdud;
    private final long zzdue;
    private final List<String> zzduf;
    private final String zzdug;
    private final long zzduh;
    private final String zzdui;
    private final boolean zzduj;
    private final String zzduk;
    private final String zzdul;
    private final boolean zzdum;
    private final boolean zzdun;
    private final boolean zzduo;
    private zzast zzdup;
    private String zzduq;
    private final zzaun zzdur;
    private final List<String> zzdus;
    private final List<String> zzdut;
    private final boolean zzduu;
    private final String zzduv;
    private final zzavy zzduw;
    private final String zzdux;
    private final boolean zzduy;
    private Bundle zzduz;
    private final int zzdva;
    private final boolean zzdvb;
    private final String zzdvc;
    private String zzdvd;
    private boolean zzdve;
    private boolean zzdvf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzash(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, zzast zzastVar, String str7, String str8, boolean z8, boolean z9, zzaun zzaunVar, List<String> list4, List<String> list5, boolean z10, zzasj zzasjVar, String str9, List<String> list6, boolean z11, String str10, zzavy zzavyVar, String str11, boolean z12, boolean z13, Bundle bundle, boolean z14, int i4, boolean z15, List<String> list7, boolean z16, String str12, String str13, boolean z17, boolean z18) {
        zzasw zzaswVar;
        this.versionCode = i;
        this.zzdrb = str;
        this.zzdub = str2;
        this.zzdlg = list != null ? Collections.unmodifiableList(list) : null;
        this.errorCode = i2;
        this.zzdlh = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.zzduc = j;
        this.zzdud = z;
        this.zzdue = j2;
        this.zzduf = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.zzdln = j3;
        this.orientation = i3;
        this.zzdug = str3;
        this.zzduh = j4;
        this.zzdui = str4;
        this.zzduj = z2;
        this.zzduk = str5;
        this.zzdul = str6;
        this.zzdum = z3;
        this.zzbrh = z4;
        this.zzdsp = z5;
        this.zzdun = z6;
        this.zzduy = z12;
        this.zzduo = z7;
        this.zzdup = zzastVar;
        this.zzduq = str7;
        this.zzbvf = str8;
        if (this.zzdub == null && zzastVar != null && (zzaswVar = (zzasw) zzastVar.zza(zzasw.CREATOR)) != null && !TextUtils.isEmpty(zzaswVar.zzdvr)) {
            this.zzdub = zzaswVar.zzdvr;
        }
        this.zzchs = z8;
        this.zzcht = z9;
        this.zzdur = zzaunVar;
        this.zzdus = list4;
        this.zzdut = list5;
        this.zzduu = z10;
        this.zzbog = zzasjVar;
        this.zzdtc = str9;
        this.zzdlk = list6;
        this.zzdll = z11;
        this.zzduv = str10;
        this.zzduw = zzavyVar;
        this.zzdux = str11;
        this.zzdto = z13;
        this.zzduz = bundle;
        this.zzbpb = z14;
        this.zzdva = i4;
        this.zzdvb = z15;
        this.zzdli = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.zzbpc = z16;
        this.zzdvc = str12;
        this.zzdvd = str13;
        this.zzdve = z17;
        this.zzdvf = z18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeString(parcel, 2, this.zzdrb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzdub, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.zzdlg, false);
        SafeParcelWriter.writeInt(parcel, 5, this.errorCode);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzdlh, false);
        SafeParcelWriter.writeLong(parcel, 7, this.zzduc);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdud);
        SafeParcelWriter.writeLong(parcel, 9, this.zzdue);
        SafeParcelWriter.writeStringList(parcel, 10, this.zzduf, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzdln);
        SafeParcelWriter.writeInt(parcel, 12, this.orientation);
        SafeParcelWriter.writeString(parcel, 13, this.zzdug, false);
        SafeParcelWriter.writeLong(parcel, 14, this.zzduh);
        SafeParcelWriter.writeString(parcel, 15, this.zzdui, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzduj);
        SafeParcelWriter.writeString(parcel, 19, this.zzduk, false);
        SafeParcelWriter.writeString(parcel, 21, this.zzdul, false);
        SafeParcelWriter.writeBoolean(parcel, 22, this.zzdum);
        SafeParcelWriter.writeBoolean(parcel, 23, this.zzbrh);
        SafeParcelWriter.writeBoolean(parcel, 24, this.zzdsp);
        SafeParcelWriter.writeBoolean(parcel, 25, this.zzdun);
        SafeParcelWriter.writeBoolean(parcel, 26, this.zzduo);
        SafeParcelWriter.writeParcelable(parcel, 28, this.zzdup, i, false);
        SafeParcelWriter.writeString(parcel, 29, this.zzduq, false);
        SafeParcelWriter.writeString(parcel, 30, this.zzbvf, false);
        SafeParcelWriter.writeBoolean(parcel, 31, this.zzchs);
        SafeParcelWriter.writeBoolean(parcel, 32, this.zzcht);
        SafeParcelWriter.writeParcelable(parcel, 33, this.zzdur, i, false);
        SafeParcelWriter.writeStringList(parcel, 34, this.zzdus, false);
        SafeParcelWriter.writeStringList(parcel, 35, this.zzdut, false);
        SafeParcelWriter.writeBoolean(parcel, 36, this.zzduu);
        SafeParcelWriter.writeParcelable(parcel, 37, this.zzbog, i, false);
        SafeParcelWriter.writeString(parcel, 39, this.zzdtc, false);
        SafeParcelWriter.writeStringList(parcel, 40, this.zzdlk, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.zzdll);
        SafeParcelWriter.writeString(parcel, 43, this.zzduv, false);
        SafeParcelWriter.writeParcelable(parcel, 44, this.zzduw, i, false);
        SafeParcelWriter.writeString(parcel, 45, this.zzdux, false);
        SafeParcelWriter.writeBoolean(parcel, 46, this.zzduy);
        SafeParcelWriter.writeBoolean(parcel, 47, this.zzdto);
        SafeParcelWriter.writeBundle(parcel, 48, this.zzduz, false);
        SafeParcelWriter.writeBoolean(parcel, 49, this.zzbpb);
        SafeParcelWriter.writeInt(parcel, 50, this.zzdva);
        SafeParcelWriter.writeBoolean(parcel, 51, this.zzdvb);
        SafeParcelWriter.writeStringList(parcel, 52, this.zzdli, false);
        SafeParcelWriter.writeBoolean(parcel, 53, this.zzbpc);
        SafeParcelWriter.writeString(parcel, 54, this.zzdvc, false);
        SafeParcelWriter.writeString(parcel, 55, this.zzdvd, false);
        SafeParcelWriter.writeBoolean(parcel, 56, this.zzdve);
        SafeParcelWriter.writeBoolean(parcel, 57, this.zzdvf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
