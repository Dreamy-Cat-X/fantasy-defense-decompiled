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
public final class zzvg extends RemoteCreator<zzxl> {
    public zzvg() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final zzxg zza(Context context, zzvp zzvpVar, String str, zzamt zzamtVar, int i) {
        try {
            IBinder zza = getRemoteCreatorInstance(context).zza(ObjectWrapper.wrap(context), zzvpVar, str, zzamtVar, ModuleDescriptor.MODULE_VERSION, i);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzxg) {
                return (zzxg) queryLocalInterface;
            }
            return new zzxi(zza);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzaym.zzb("Could not create remote AdManager.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzxl getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzxl) {
            return (zzxl) queryLocalInterface;
        }
        return new zzxk(iBinder);
    }
}
