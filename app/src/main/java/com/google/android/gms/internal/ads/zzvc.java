package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzvc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvc> CREATOR = new zzvf();
    public final int errorCode;
    public final String zzcgs;
    public final String zzcgt;
    public zzvc zzcgu;
    public IBinder zzcgv;

    public zzvc(int i, String str, String str2, zzvc zzvcVar, IBinder iBinder) {
        this.errorCode = i;
        this.zzcgs = str;
        this.zzcgt = str2;
        this.zzcgu = zzvcVar;
        this.zzcgv = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.errorCode);
        SafeParcelWriter.writeString(parcel, 2, this.zzcgs, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzcgt, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzcgu, i, false);
        SafeParcelWriter.writeIBinder(parcel, 5, this.zzcgv, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final AdError zzqa() {
        AdError adError;
        if (this.zzcgu == null) {
            adError = null;
        } else {
            zzvc zzvcVar = this.zzcgu;
            adError = new AdError(zzvcVar.errorCode, zzvcVar.zzcgs, zzvcVar.zzcgt);
        }
        return new AdError(this.errorCode, this.zzcgs, this.zzcgt, adError);
    }

    public final LoadAdError zzqb() {
        AdError adError;
        zzyt zzytVar = null;
        if (this.zzcgu == null) {
            adError = null;
        } else {
            zzvc zzvcVar = this.zzcgu;
            adError = new AdError(zzvcVar.errorCode, zzvcVar.zzcgs, zzvcVar.zzcgt);
        }
        int i = this.errorCode;
        String str = this.zzcgs;
        String str2 = this.zzcgt;
        IBinder iBinder = this.zzcgv;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof zzyt) {
                zzytVar = (zzyt) queryLocalInterface;
            } else {
                zzytVar = new zzyv(iBinder);
            }
        }
        return new LoadAdError(i, str, str2, adError, ResponseInfo.zza(zzytVar));
    }
}
