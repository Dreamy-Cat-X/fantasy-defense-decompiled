package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaed extends zzgw implements zzaeb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaed(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final String getText() throws RemoteException {
        Parcel zza = zza(2, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final List<zzaej> zztc() throws RemoteException {
        Parcel zza = zza(3, zzdo());
        ArrayList zzb = zzgy.zzb(zza);
        zza.recycle();
        return zzb;
    }
}
