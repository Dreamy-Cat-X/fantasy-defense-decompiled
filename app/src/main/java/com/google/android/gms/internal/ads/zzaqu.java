package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaqu extends zzgw implements zzaqs {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, bundle);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onRestart() throws RemoteException {
        zzb(2, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onStart() throws RemoteException {
        zzb(3, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onResume() throws RemoteException {
        zzb(4, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onPause() throws RemoteException {
        zzb(5, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, bundle);
        Parcel zza = zza(6, zzdo);
        if (zza.readInt() != 0) {
            bundle.readFromParcel(zza);
        }
        zza.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onStop() throws RemoteException {
        zzb(7, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onDestroy() throws RemoteException {
        zzb(8, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void zzdr() throws RemoteException {
        zzb(9, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onBackPressed() throws RemoteException {
        zzb(10, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final boolean zzvu() throws RemoteException {
        Parcel zza = zza(11, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onActivityResult(int i, int i2, Intent intent) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeInt(i);
        zzdo.writeInt(i2);
        zzgy.zza(zzdo, intent);
        zzb(12, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void zzad(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(13, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onUserLeaveHint() throws RemoteException {
        zzb(14, zzdo());
    }
}
