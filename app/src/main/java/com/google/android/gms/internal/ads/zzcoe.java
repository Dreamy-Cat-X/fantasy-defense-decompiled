package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcoe implements zzdza<ParcelFileDescriptor> {
    private final /* synthetic */ zzaso zzgoa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcoe(zzcns zzcnsVar, zzaso zzasoVar) {
        this.zzgoa = zzasoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        try {
            this.zzgoa.zza(com.google.android.gms.ads.internal.util.zzap.zzc(th));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zza("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.zzgoa.zzb(parcelFileDescriptor);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zza("Service can't call client", e);
        }
    }
}
