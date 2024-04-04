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
public final class zzvh extends RemoteCreator<zzxe> {
    public zzvh() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final zzxd zza(Context context, String str, zzamt zzamtVar) {
        try {
            IBinder zzc = getRemoteCreatorInstance(context).zzc(ObjectWrapper.wrap(context), str, zzamtVar, ModuleDescriptor.MODULE_VERSION);
            if (zzc == null) {
                return null;
            }
            IInterface queryLocalInterface = zzc.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzxd) {
                return (zzxd) queryLocalInterface;
            }
            return new zzxf(zzc);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzaym.zzd("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzxe getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof zzxe) {
            return (zzxe) queryLocalInterface;
        }
        return new zzxh(iBinder);
    }
}
