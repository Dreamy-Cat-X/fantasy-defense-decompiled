package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzvp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvp> CREATOR = new zzvo();
    public final int height;
    public final int heightPixels;
    public final int width;
    public final int widthPixels;
    public final String zzacv;
    public final boolean zzbrh;
    public final boolean zzchq;
    public final zzvp[] zzchr;
    public final boolean zzchs;
    public boolean zzcht;
    public boolean zzchu;
    private boolean zzchv;
    public boolean zzchw;
    public boolean zzchx;

    public static int zzb(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int zzc(DisplayMetrics displayMetrics) {
        return (int) (zzd(displayMetrics) * displayMetrics.density);
    }

    private static int zzd(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    public static zzvp zzqd() {
        return new zzvp("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false);
    }

    public static zzvp zzqe() {
        return new zzvp("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false);
    }

    public static zzvp zzqf() {
        return new zzvp("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false);
    }

    public zzvp() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false);
    }

    public static zzvp zzqg() {
        return new zzvp("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false);
    }

    public zzvp(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzvp(Context context, AdSize[] adSizeArr) {
        int i;
        int i2;
        double d;
        double d2;
        AdSize adSize = adSizeArr[0];
        this.zzchq = false;
        this.zzchs = adSize.isFluid();
        this.zzchw = com.google.android.gms.ads.zza.zza(adSize);
        boolean zzb = com.google.android.gms.ads.zza.zzb(adSize);
        this.zzchx = zzb;
        if (this.zzchs) {
            this.width = AdSize.BANNER.getWidth();
            this.height = AdSize.BANNER.getHeight();
        } else if (zzb) {
            this.width = adSize.getWidth();
            this.height = com.google.android.gms.ads.zza.zzc(adSize);
        } else {
            this.width = adSize.getWidth();
            this.height = adSize.getHeight();
        }
        boolean z = this.width == -1;
        boolean z2 = this.height == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            zzwo.zzqm();
            if (zzayd.zzbp(context)) {
                zzwo.zzqm();
                if (zzayd.zzbq(context)) {
                    int i3 = displayMetrics.widthPixels;
                    zzwo.zzqm();
                    this.widthPixels = i3 - zzayd.zzbr(context);
                    d = this.widthPixels / displayMetrics.density;
                    i = (int) d;
                    d2 = i;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    if (d - d2 >= 0.01d) {
                        i++;
                    }
                }
            }
            this.widthPixels = displayMetrics.widthPixels;
            d = this.widthPixels / displayMetrics.density;
            i = (int) d;
            d2 = i;
            Double.isNaN(d);
            Double.isNaN(d2);
            if (d - d2 >= 0.01d) {
            }
        } else {
            i = this.width;
            zzwo.zzqm();
            this.widthPixels = zzayd.zza(displayMetrics, this.width);
        }
        if (z2) {
            i2 = zzd(displayMetrics);
        } else {
            i2 = this.height;
        }
        zzwo.zzqm();
        this.heightPixels = zzayd.zza(displayMetrics, i2);
        if (z || z2) {
            StringBuilder sb = new StringBuilder(26);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("_as");
            this.zzacv = sb.toString();
        } else if (this.zzchx) {
            int i4 = this.width;
            int i5 = this.height;
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append(i4);
            sb2.append("x");
            sb2.append(i5);
            sb2.append("_as");
            this.zzacv = sb2.toString();
        } else if (this.zzchs) {
            this.zzacv = "320x50_mb";
        } else {
            this.zzacv = adSize.toString();
        }
        if (adSizeArr.length > 1) {
            this.zzchr = new zzvp[adSizeArr.length];
            for (int i6 = 0; i6 < adSizeArr.length; i6++) {
                this.zzchr[i6] = new zzvp(context, adSizeArr[i6]);
            }
        } else {
            this.zzchr = null;
        }
        this.zzbrh = false;
        this.zzcht = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvp(String str, int i, int i2, boolean z, int i3, int i4, zzvp[] zzvpVarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.zzacv = str;
        this.height = i;
        this.heightPixels = i2;
        this.zzchq = z;
        this.width = i3;
        this.widthPixels = i4;
        this.zzchr = zzvpVarArr;
        this.zzbrh = z2;
        this.zzchs = z3;
        this.zzcht = z4;
        this.zzchu = z5;
        this.zzchv = z6;
        this.zzchw = z7;
        this.zzchx = z8;
    }

    public final AdSize zzqh() {
        return com.google.android.gms.ads.zza.zza(this.width, this.height, this.zzacv);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzacv, false);
        SafeParcelWriter.writeInt(parcel, 3, this.height);
        SafeParcelWriter.writeInt(parcel, 4, this.heightPixels);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzchq);
        SafeParcelWriter.writeInt(parcel, 6, this.width);
        SafeParcelWriter.writeInt(parcel, 7, this.widthPixels);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzchr, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzbrh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzchs);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzcht);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzchu);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzchv);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzchw);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzchx);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
