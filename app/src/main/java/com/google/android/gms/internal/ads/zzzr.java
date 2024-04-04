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
public final class zzzr extends RemoteCreator<zzyd> {
    public zzzr() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    public final zzxy zzh(Context context) {
        try {
            IBinder zzb = getRemoteCreatorInstance(context).zzb(ObjectWrapper.wrap(context), ModuleDescriptor.MODULE_VERSION);
            if (zzb == null) {
                return null;
            }
            IInterface queryLocalInterface = zzb.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzxy) {
                return (zzxy) queryLocalInterface;
            }
            return new zzya(zzb);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzaym.zzd("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzyd getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof zzyd) {
            return (zzyd) queryLocalInterface;
        }
        return new zzyc(iBinder);
    }
}
