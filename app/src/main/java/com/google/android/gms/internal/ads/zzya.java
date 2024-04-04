package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzya extends zzgw implements zzxy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzya(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void initialize() throws RemoteException {
        zzb(1, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void setAppVolume(float f) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeFloat(f);
        zzb(2, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zzcd(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzb(3, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void setAppMuted(boolean z) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.writeBoolean(zzdo, z);
        zzb(4, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zzb(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzdo.writeString(str);
        zzb(5, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zza(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(6, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final float zzqz() throws RemoteException {
        Parcel zza = zza(7, zzdo());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final boolean zzra() throws RemoteException {
        Parcel zza = zza(8, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final String getVersionString() throws RemoteException {
        Parcel zza = zza(9, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zzce(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzb(10, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zza(zzamt zzamtVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzamtVar);
        zzb(11, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zza(zzajc zzajcVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzajcVar);
        zzb(12, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final List<zzaiv> zzrb() throws RemoteException {
        Parcel zza = zza(13, zzdo());
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzaiv.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zza(zzaak zzaakVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzaakVar);
        zzb(14, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zzrc() throws RemoteException {
        zzb(15, zzdo());
    }
}
