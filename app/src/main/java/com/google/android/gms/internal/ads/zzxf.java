package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzxf extends zzgw implements zzxd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final zzwy zzqy() throws RemoteException {
        zzwy zzxaVar;
        Parcel zza = zza(1, zzdo());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzxaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            if (queryLocalInterface instanceof zzwy) {
                zzxaVar = (zzwy) queryLocalInterface;
            } else {
                zzxaVar = new zzxa(readStrongBinder);
            }
        }
        zza.recycle();
        return zzxaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzb(zzwv zzwvVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzwvVar);
        zzb(2, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzafj zzafjVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzafjVar);
        zzb(3, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzafo zzafoVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzafoVar);
        zzb(4, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(String str, zzafu zzafuVar, zzafp zzafpVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzgy.zza(zzdo, zzafuVar);
        zzgy.zza(zzdo, zzafpVar);
        zzb(5, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzadz zzadzVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzadzVar);
        zzb(6, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzb(zzxu zzxuVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzxuVar);
        zzb(7, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzafx zzafxVar, zzvp zzvpVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzafxVar);
        zzgy.zza(zzdo, zzvpVar);
        zzb(8, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, publisherAdViewOptions);
        zzb(9, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzagc zzagcVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzagcVar);
        zzb(10, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzajh zzajhVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzajhVar);
        zzb(13, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzajp zzajpVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzajpVar);
        zzb(14, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, adManagerAdViewOptions);
        zzb(15, zzdo);
    }
}
