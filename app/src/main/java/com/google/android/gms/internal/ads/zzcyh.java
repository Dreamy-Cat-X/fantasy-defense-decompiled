package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcyh {
    private final zzcxf zzfyd;
    private final zzcbt zzgxi;
    private final zzbqw zzgxj;

    public zzcyh(zzcbt zzcbtVar, zzdro zzdroVar) {
        this.zzgxi = zzcbtVar;
        final zzcxf zzcxfVar = new zzcxf(zzdroVar);
        this.zzfyd = zzcxfVar;
        final zzajp zzaol = this.zzgxi.zzaol();
        this.zzgxj = new zzbqw(zzcxfVar, zzaol) { // from class: com.google.android.gms.internal.ads.zzcyg
            private final zzcxf zzgxg;
            private final zzajp zzgxh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgxg = zzcxfVar;
                this.zzgxh = zzaol;
            }

            @Override // com.google.android.gms.internal.ads.zzbqw
            public final void zzd(zzvc zzvcVar) {
                zzcxf zzcxfVar2 = this.zzgxg;
                zzajp zzajpVar = this.zzgxh;
                zzcxfVar2.zzd(zzvcVar);
                if (zzajpVar != null) {
                    try {
                        zzajpVar.zze(zzvcVar);
                    } catch (RemoteException e) {
                        zzaym.zze("#007 Could not call remote method.", e);
                    }
                }
                if (zzajpVar != null) {
                    try {
                        zzajpVar.onInstreamAdFailedToLoad(zzvcVar.errorCode);
                    } catch (RemoteException e2) {
                        zzaym.zze("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final void zzd(zzwv zzwvVar) {
        this.zzfyd.zzc(zzwvVar);
    }

    public final zzbzv zzasq() {
        return new zzbzv(this.zzgxi, this.zzfyd.zzasl());
    }

    public final zzcxf zzasr() {
        return this.zzfyd;
    }

    public final zzbsg zzass() {
        return this.zzfyd;
    }

    public final zzbqw zzast() {
        return this.zzgxj;
    }
}
