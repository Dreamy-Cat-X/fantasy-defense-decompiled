package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzo extends com.google.android.gms.internal.common.zzb implements IGmsCallbacks {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel a_ = a_();
        a_.writeInt(i);
        a_.writeStrongBinder(iBinder);
        com.google.android.gms.internal.common.zzd.zza(a_, bundle);
        zzb(1, a_);
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zza(int i, Bundle bundle) throws RemoteException {
        Parcel a_ = a_();
        a_.writeInt(i);
        com.google.android.gms.internal.common.zzd.zza(a_, bundle);
        zzb(2, a_);
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zza(int i, IBinder iBinder, zzc zzcVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeInt(i);
        a_.writeStrongBinder(iBinder);
        com.google.android.gms.internal.common.zzd.zza(a_, zzcVar);
        zzb(3, a_);
    }
}
