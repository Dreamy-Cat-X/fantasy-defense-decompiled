package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzm();
    private final String zza;

    @Nullable
    private final zzd zzb;
    private final boolean zzc;
    private final boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = zza(iBinder);
        this.zzc = z;
        this.zzd = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(String str, @Nullable zzd zzdVar, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = zzdVar;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        zzd zzdVar = this.zzb;
        if (zzdVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            asBinder = null;
        } else {
            asBinder = zzdVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, asBinder, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    private static zzd zza(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            IObjectWrapper zzb = com.google.android.gms.common.internal.zzn.zza(iBinder).zzb();
            byte[] bArr = zzb == null ? null : (byte[]) ObjectWrapper.unwrap(zzb);
            if (bArr != null) {
                return new zzg(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }
}
