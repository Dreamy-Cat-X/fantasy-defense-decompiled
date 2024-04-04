package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzavg {
    public static zzauq zzd(Context context, String str, zzamt zzamtVar) {
        try {
            IBinder zzd = ((zzauw) zzayp.zza(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzavj.zzbxt)).zzd(ObjectWrapper.wrap(context), str, zzamtVar, ModuleDescriptor.MODULE_VERSION);
            if (zzd == null) {
                return null;
            }
            IInterface queryLocalInterface = zzd.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof zzauq) {
                return (zzauq) queryLocalInterface;
            }
            return new zzaus(zzd);
        } catch (RemoteException | zzayr e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return null;
        }
    }
}
