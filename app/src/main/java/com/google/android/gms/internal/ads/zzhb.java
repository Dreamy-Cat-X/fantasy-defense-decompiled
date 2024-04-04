package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzhb extends zzgw implements zzha {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public final void zza(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzdo.writeString(str);
        zzb(2, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public final void log() throws RemoteException {
        zzb(3, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public final void zza(int[] iArr) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeIntArray(null);
        zzb(4, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public final void zzc(byte[] bArr) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeByteArray(bArr);
        zzb(5, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public final void zzs(int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeInt(i);
        zzb(6, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public final void zzt(int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeInt(i);
        zzb(7, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public final void zza(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzdo.writeString(str);
        zzdo.writeString(null);
        zzb(8, zzdo);
    }
}
