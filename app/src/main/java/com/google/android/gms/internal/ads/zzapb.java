package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzapb extends zzgw implements zzaoz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zza(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzvp zzvpVar, zzape zzapeVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzdo.writeString(str);
        zzgy.zza(zzdo, bundle);
        zzgy.zza(zzdo, bundle2);
        zzgy.zza(zzdo, zzvpVar);
        zzgy.zza(zzdo, zzapeVar);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final zzapn zzvb() throws RemoteException {
        Parcel zza = zza(2, zzdo());
        zzapn zzapnVar = (zzapn) zzgy.zza(zza, zzapn.CREATOR);
        zza.recycle();
        return zzapnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final zzapn zzvc() throws RemoteException {
        Parcel zza = zza(3, zzdo());
        zzapn zzapnVar = (zzapn) zzgy.zza(zza, zzapn.CREATOR);
        zza.recycle();
        return zzapnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final zzyu getVideoController() throws RemoteException {
        Parcel zza = zza(5, zzdo());
        zzyu zzk = zzyx.zzk(zza.readStrongBinder());
        zza.recycle();
        return zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zzy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(10, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zza(String[] strArr, Bundle[] bundleArr) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeStringArray(strArr);
        zzdo.writeTypedArray(bundleArr, 0);
        zzb(11, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zza(String str, String str2, zzvi zzviVar, IObjectWrapper iObjectWrapper, zzaon zzaonVar, zzamz zzamzVar, zzvp zzvpVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzdo.writeString(str2);
        zzgy.zza(zzdo, zzviVar);
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzaonVar);
        zzgy.zza(zzdo, zzamzVar);
        zzgy.zza(zzdo, zzvpVar);
        zzb(13, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zza(String str, String str2, zzvi zzviVar, IObjectWrapper iObjectWrapper, zzaos zzaosVar, zzamz zzamzVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzdo.writeString(str2);
        zzgy.zza(zzdo, zzviVar);
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzaosVar);
        zzgy.zza(zzdo, zzamzVar);
        zzb(14, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final boolean zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        Parcel zza = zza(15, zzdo);
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zza(String str, String str2, zzvi zzviVar, IObjectWrapper iObjectWrapper, zzaoy zzaoyVar, zzamz zzamzVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzdo.writeString(str2);
        zzgy.zza(zzdo, zzviVar);
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzaoyVar);
        zzgy.zza(zzdo, zzamzVar);
        zzb(16, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final boolean zzaa(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        Parcel zza = zza(17, zzdo);
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zza(String str, String str2, zzvi zzviVar, IObjectWrapper iObjectWrapper, zzaot zzaotVar, zzamz zzamzVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzdo.writeString(str2);
        zzgy.zza(zzdo, zzviVar);
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzaotVar);
        zzgy.zza(zzdo, zzamzVar);
        zzb(18, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zzdm(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzb(19, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zzb(String str, String str2, zzvi zzviVar, IObjectWrapper iObjectWrapper, zzaoy zzaoyVar, zzamz zzamzVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzdo.writeString(str2);
        zzgy.zza(zzdo, zzviVar);
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzaoyVar);
        zzgy.zza(zzdo, zzamzVar);
        zzb(20, zzdo);
    }
}
