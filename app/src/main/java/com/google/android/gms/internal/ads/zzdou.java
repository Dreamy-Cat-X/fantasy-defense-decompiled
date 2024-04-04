package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzdou extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdou> CREATOR = new zzdoy();

    @Nullable
    public final Context context;
    private final zzdox[] zzhlt;
    private final int[] zzhlu;
    private final int[] zzhlv;
    private final int zzhlw;
    public final zzdox zzhlx;
    public final int zzhly;
    public final int zzhlz;
    public final int zzhma;
    public final String zzhmb;
    private final int zzhmc;
    public final int zzhmd;
    private final int zzhme;
    private final int zzhmf;

    private zzdou(@Nullable Context context, zzdox zzdoxVar, int i, int i2, int i3, String str, String str2, String str3) {
        int i4;
        this.zzhlt = zzdox.values();
        this.zzhlu = zzdow.zzawj();
        this.zzhlv = zzdoz.zzawk();
        this.context = context;
        this.zzhlw = zzdoxVar.ordinal();
        this.zzhlx = zzdoxVar;
        this.zzhly = i;
        this.zzhlz = i2;
        this.zzhma = i3;
        this.zzhmb = str;
        if ("oldest".equals(str2)) {
            i4 = zzdow.zzhmi;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = zzdow.zzhmk;
        } else {
            i4 = zzdow.zzhmj;
        }
        this.zzhmd = i4;
        this.zzhmc = i4 - 1;
        "onAdClosed".equals(str3);
        int i5 = zzdoz.zzhmq;
        this.zzhmf = i5;
        this.zzhme = i5 - 1;
    }

    public zzdou(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        this.zzhlt = zzdox.values();
        this.zzhlu = zzdow.zzawj();
        int[] zzawk = zzdoz.zzawk();
        this.zzhlv = zzawk;
        this.context = null;
        this.zzhlw = i;
        this.zzhlx = this.zzhlt[i];
        this.zzhly = i2;
        this.zzhlz = i3;
        this.zzhma = i4;
        this.zzhmb = str;
        this.zzhmc = i5;
        this.zzhmd = this.zzhlu[i5];
        this.zzhme = i6;
        this.zzhmf = zzawk[i6];
    }

    public static zzdou zza(zzdox zzdoxVar, Context context) {
        if (zzdoxVar == zzdox.Rewarded) {
            return new zzdou(context, zzdoxVar, ((Integer) zzwo.zzqq().zzd(zzabh.zzcxh)).intValue(), ((Integer) zzwo.zzqq().zzd(zzabh.zzcxn)).intValue(), ((Integer) zzwo.zzqq().zzd(zzabh.zzcxp)).intValue(), (String) zzwo.zzqq().zzd(zzabh.zzcxr), (String) zzwo.zzqq().zzd(zzabh.zzcxj), (String) zzwo.zzqq().zzd(zzabh.zzcxl));
        }
        if (zzdoxVar == zzdox.Interstitial) {
            return new zzdou(context, zzdoxVar, ((Integer) zzwo.zzqq().zzd(zzabh.zzcxi)).intValue(), ((Integer) zzwo.zzqq().zzd(zzabh.zzcxo)).intValue(), ((Integer) zzwo.zzqq().zzd(zzabh.zzcxq)).intValue(), (String) zzwo.zzqq().zzd(zzabh.zzcxs), (String) zzwo.zzqq().zzd(zzabh.zzcxk), (String) zzwo.zzqq().zzd(zzabh.zzcxm));
        }
        if (zzdoxVar != zzdox.AppOpen) {
            return null;
        }
        return new zzdou(context, zzdoxVar, ((Integer) zzwo.zzqq().zzd(zzabh.zzcxv)).intValue(), ((Integer) zzwo.zzqq().zzd(zzabh.zzcxx)).intValue(), ((Integer) zzwo.zzqq().zzd(zzabh.zzcxy)).intValue(), (String) zzwo.zzqq().zzd(zzabh.zzcxt), (String) zzwo.zzqq().zzd(zzabh.zzcxu), (String) zzwo.zzqq().zzd(zzabh.zzcxw));
    }

    public static boolean zzawh() {
        return ((Boolean) zzwo.zzqq().zzd(zzabh.zzcxg)).booleanValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzhlw);
        SafeParcelWriter.writeInt(parcel, 2, this.zzhly);
        SafeParcelWriter.writeInt(parcel, 3, this.zzhlz);
        SafeParcelWriter.writeInt(parcel, 4, this.zzhma);
        SafeParcelWriter.writeString(parcel, 5, this.zzhmb, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzhmc);
        SafeParcelWriter.writeInt(parcel, 7, this.zzhme);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
