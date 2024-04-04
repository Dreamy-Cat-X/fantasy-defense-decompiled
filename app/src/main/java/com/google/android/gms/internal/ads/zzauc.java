package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzauc extends RemoteCreator<zzatw> {
    public zzauc() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    public final zzatv zzc(Context context, zzamt zzamtVar) {
        try {
            IBinder zzd = getRemoteCreatorInstance(context).zzd(ObjectWrapper.wrap(context), zzamtVar, ModuleDescriptor.MODULE_VERSION);
            if (zzd == null) {
                return null;
            }
            IInterface queryLocalInterface = zzd.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            if (queryLocalInterface instanceof zzatv) {
                return (zzatv) queryLocalInterface;
            }
            return new zzatx(zzd);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzaym.zzd("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzatw getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        if (queryLocalInterface instanceof zzatw) {
            return (zzatw) queryLocalInterface;
        }
        return new zzatz(iBinder);
    }
}
