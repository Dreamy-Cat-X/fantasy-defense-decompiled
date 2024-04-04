package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzasn extends zzgw implements zzasl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final zzash zza(zzasf zzasfVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzasfVar);
        Parcel zza = zza(1, zzdo);
        zzash zzashVar = (zzash) zzgy.zza(zza, zzash.CREATOR);
        zza.recycle();
        return zzashVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final void zza(zzasf zzasfVar, zzasm zzasmVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzasfVar);
        zzgy.zza(zzdo, zzasmVar);
        zzb(2, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final void zza(zzasu zzasuVar, zzaso zzasoVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzasuVar);
        zzgy.zza(zzdo, zzasoVar);
        zzb(4, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final void zzb(zzasu zzasuVar, zzaso zzasoVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzasuVar);
        zzgy.zza(zzdo, zzasoVar);
        zzb(5, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final void zzc(zzasu zzasuVar, zzaso zzasoVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzasuVar);
        zzgy.zza(zzdo, zzasoVar);
        zzb(6, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final void zza(String str, zzaso zzasoVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzgy.zza(zzdo, zzasoVar);
        zzb(7, zzdo);
    }
}
