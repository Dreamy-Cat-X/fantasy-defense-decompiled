package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zztz {
    zzha zzbxu;
    boolean zzbxv;

    public final zzud zzf(byte[] bArr) {
        return new zzud(this, bArr);
    }

    public zztz(Context context, String str, String str2) {
        zzabh.initialize(context);
        try {
            this.zzbxu = (zzha) zzayp.zza(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzty.zzbxt);
            ObjectWrapper.wrap(context);
            this.zzbxu.zza(ObjectWrapper.wrap(context), str, null);
            this.zzbxv = true;
        } catch (RemoteException | zzayr | NullPointerException unused) {
            zzaym.zzdy("Cannot dynamite load clearcut");
        }
    }

    public zztz(Context context) {
        zzabh.initialize(context);
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcuj)).booleanValue()) {
            try {
                this.zzbxu = (zzha) zzayp.zza(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzub.zzbxt);
                ObjectWrapper.wrap(context);
                this.zzbxu.zza(ObjectWrapper.wrap(context), "GMA_SDK");
                this.zzbxv = true;
            } catch (RemoteException | zzayr | NullPointerException unused) {
                zzaym.zzdy("Cannot dynamite load clearcut");
            }
        }
    }

    public zztz() {
    }
}
