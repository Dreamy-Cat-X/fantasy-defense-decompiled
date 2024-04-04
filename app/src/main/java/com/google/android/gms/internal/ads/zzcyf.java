package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcyf {
    private zzyt zzads;
    private boolean zzafa = false;
    private final String zzbup;
    private final zzcyj<zzbmz> zzgxf;

    public zzcyf(zzcyj<zzbmz> zzcyjVar, String str) {
        this.zzgxf = zzcyjVar;
        this.zzbup = str;
    }

    public final synchronized boolean isLoading() throws RemoteException {
        return this.zzgxf.isLoading();
    }

    public final synchronized void zza(zzvi zzviVar, int i) throws RemoteException {
        this.zzads = null;
        this.zzafa = this.zzgxf.zza(zzviVar, this.zzbup, new zzcyk(i), new zzcye(this));
    }

    public final synchronized String getMediationAdapterClassName() {
        try {
            if (this.zzads == null) {
                return null;
            }
            return this.zzads.getMediationAdapterClassName();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final synchronized String zzkg() {
        try {
            if (this.zzads == null) {
                return null;
            }
            return this.zzads.getMediationAdapterClassName();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zza(zzcyf zzcyfVar, boolean z) {
        zzcyfVar.zzafa = false;
        return false;
    }
}
