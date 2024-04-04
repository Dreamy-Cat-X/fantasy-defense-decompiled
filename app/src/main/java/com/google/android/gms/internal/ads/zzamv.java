package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzamv extends zzgw implements zzamt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzamt
    public final zzamy zzdd(String str) throws RemoteException {
        zzamy zzanaVar;
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        Parcel zza = zza(1, zzdo);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzanaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (queryLocalInterface instanceof zzamy) {
                zzanaVar = (zzamy) queryLocalInterface;
            } else {
                zzanaVar = new zzana(readStrongBinder);
            }
        }
        zza.recycle();
        return zzanaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamt
    public final boolean zzde(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        Parcel zza = zza(2, zzdo);
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzamt
    public final zzaoz zzdf(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        Parcel zza = zza(3, zzdo);
        zzaoz zzaf = zzapc.zzaf(zza.readStrongBinder());
        zza.recycle();
        return zzaf;
    }
}
