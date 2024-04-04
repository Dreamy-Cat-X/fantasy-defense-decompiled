package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbkv extends zzsk {
    private final zzxg zzbuo;
    private final zzbks zzfsp;
    private final zzdht zzfsq;

    public zzbkv(zzbks zzbksVar, zzxg zzxgVar, zzdht zzdhtVar) {
        this.zzfsp = zzbksVar;
        this.zzbuo = zzxgVar;
        this.zzfsq = zzdhtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final void zza(zzsn zzsnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final zzxg zzdx() {
        return this.zzbuo;
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final void zza(IObjectWrapper iObjectWrapper, zzsr zzsrVar) {
        try {
            this.zzfsq.zza(zzsrVar);
            this.zzfsp.zza((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzsrVar);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final zzyt zzkh() {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyb)).booleanValue()) {
            return this.zzfsp.zzako();
        }
        return null;
    }
}
