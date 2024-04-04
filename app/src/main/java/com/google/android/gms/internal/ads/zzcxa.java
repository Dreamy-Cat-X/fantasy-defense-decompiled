package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcxa extends zzxb {
    private final zzcyf zzgwa;

    public zzcxa(Context context, zzbff zzbffVar, zzdmz zzdmzVar, zzcbt zzcbtVar, zzwv zzwvVar) {
        zzcyh zzcyhVar = new zzcyh(zzcbtVar, zzbffVar.zzaes());
        zzcyhVar.zzd(zzwvVar);
        this.zzgwa = new zzcyf(new zzcyn(zzbffVar, context, zzcyhVar, zzdmzVar), zzdmzVar.zzavg());
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final synchronized boolean isLoading() throws RemoteException {
        return this.zzgwa.isLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final void zzb(zzvi zzviVar) throws RemoteException {
        this.zzgwa.zza(zzviVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final synchronized void zza(zzvi zzviVar, int i) throws RemoteException {
        this.zzgwa.zza(zzviVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final synchronized String getMediationAdapterClassName() {
        return this.zzgwa.getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final synchronized String zzkg() {
        return this.zzgwa.zzkg();
    }
}
