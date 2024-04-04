package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzair extends zzaio {
    private final /* synthetic */ zzazc zzbvj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzair(zzais zzaisVar, zzazc zzazcVar) {
        this.zzbvj = zzazcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzail
    public final void zza(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        this.zzbvj.set(parcelFileDescriptor);
    }
}
