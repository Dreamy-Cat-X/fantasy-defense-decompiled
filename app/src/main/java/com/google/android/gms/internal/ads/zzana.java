package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzana extends zzgw implements zzamy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzana(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzvp zzvpVar, zzvi zzviVar, String str, zzamz zzamzVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzvpVar);
        zzgy.zza(zzdo, zzviVar);
        zzdo.writeString(str);
        zzgy.zza(zzdo, zzamzVar);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final IObjectWrapper zzut() throws RemoteException {
        Parcel zza = zza(2, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, zzamz zzamzVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzviVar);
        zzdo.writeString(str);
        zzgy.zza(zzdo, zzamzVar);
        zzb(3, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void showInterstitial() throws RemoteException {
        zzb(4, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void destroy() throws RemoteException {
        zzb(5, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzvp zzvpVar, zzvi zzviVar, String str, String str2, zzamz zzamzVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzvpVar);
        zzgy.zza(zzdo, zzviVar);
        zzdo.writeString(str);
        zzdo.writeString(str2);
        zzgy.zza(zzdo, zzamzVar);
        zzb(6, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, String str2, zzamz zzamzVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzviVar);
        zzdo.writeString(str);
        zzdo.writeString(str2);
        zzgy.zza(zzdo, zzamzVar);
        zzb(7, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void pause() throws RemoteException {
        zzb(8, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void resume() throws RemoteException {
        zzb(9, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, zzauj zzaujVar, String str2) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzviVar);
        zzdo.writeString(str);
        zzgy.zza(zzdo, zzaujVar);
        zzdo.writeString(str2);
        zzb(10, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(zzvi zzviVar, String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzviVar);
        zzdo.writeString(str);
        zzb(11, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void showVideo() throws RemoteException {
        zzb(12, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final boolean isInitialized() throws RemoteException {
        Parcel zza = zza(13, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, String str2, zzamz zzamzVar, zzadz zzadzVar, List<String> list) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzviVar);
        zzdo.writeString(str);
        zzdo.writeString(str2);
        zzgy.zza(zzdo, zzamzVar);
        zzgy.zza(zzdo, zzadzVar);
        zzdo.writeStringList(list);
        zzb(14, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzang zzuu() throws RemoteException {
        zzang zzaniVar;
        Parcel zza = zza(15, zzdo());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzaniVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            if (queryLocalInterface instanceof zzang) {
                zzaniVar = (zzang) queryLocalInterface;
            } else {
                zzaniVar = new zzani(readStrongBinder);
            }
        }
        zza.recycle();
        return zzaniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzanh zzuv() throws RemoteException {
        zzanh zzanjVar;
        Parcel zza = zza(16, zzdo());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzanjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            if (queryLocalInterface instanceof zzanh) {
                zzanjVar = (zzanh) queryLocalInterface;
            } else {
                zzanjVar = new zzanj(readStrongBinder);
            }
        }
        zza.recycle();
        return zzanjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final Bundle zzuw() throws RemoteException {
        Parcel zza = zza(17, zzdo());
        Bundle bundle = (Bundle) zzgy.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final Bundle getInterstitialAdapterInfo() throws RemoteException {
        Parcel zza = zza(18, zzdo());
        Bundle bundle = (Bundle) zzgy.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final Bundle zzux() throws RemoteException {
        Parcel zza = zza(19, zzdo());
        Bundle bundle = (Bundle) zzgy.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(zzvi zzviVar, String str, String str2) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzviVar);
        zzdo.writeString(str);
        zzdo.writeString(str2);
        zzb(20, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(21, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final boolean zzuy() throws RemoteException {
        Parcel zza = zza(22, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzauj zzaujVar, List<String> list) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzaujVar);
        zzdo.writeStringList(list);
        zzb(23, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzaff zzuz() throws RemoteException {
        Parcel zza = zza(24, zzdo());
        zzaff zzr = zzafi.zzr(zza.readStrongBinder());
        zza.recycle();
        return zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.writeBoolean(zzdo, z);
        zzb(25, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzyu getVideoController() throws RemoteException {
        Parcel zza = zza(26, zzdo());
        zzyu zzk = zzyx.zzk(zza.readStrongBinder());
        zza.recycle();
        return zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzanm zzva() throws RemoteException {
        zzanm zzanoVar;
        Parcel zza = zza(27, zzdo());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzanoVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            if (queryLocalInterface instanceof zzanm) {
                zzanoVar = (zzanm) queryLocalInterface;
            } else {
                zzanoVar = new zzano(readStrongBinder);
            }
        }
        zza.recycle();
        return zzanoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzb(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, zzamz zzamzVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzviVar);
        zzdo.writeString(str);
        zzgy.zza(zzdo, zzamzVar);
        zzb(28, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(30, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzaix zzaixVar, List<zzajf> list) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzaixVar);
        zzdo.writeTypedList(list);
        zzb(31, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzc(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, zzamz zzamzVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzviVar);
        zzdo.writeString(str);
        zzgy.zza(zzdo, zzamzVar);
        zzb(32, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzapn zzvb() throws RemoteException {
        Parcel zza = zza(33, zzdo());
        zzapn zzapnVar = (zzapn) zzgy.zza(zza, zzapn.CREATOR);
        zza.recycle();
        return zzapnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzapn zzvc() throws RemoteException {
        Parcel zza = zza(34, zzdo());
        zzapn zzapnVar = (zzapn) zzgy.zza(zza, zzapn.CREATOR);
        zza.recycle();
        return zzapnVar;
    }
}
