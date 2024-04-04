package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzagn extends RemoteCreator<zzaes> {
    public zzagn() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    public final zzaen zzb(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder zza = getRemoteCreatorInstance(context).zza(ObjectWrapper.wrap(context), ObjectWrapper.wrap(frameLayout), ObjectWrapper.wrap(frameLayout2), ModuleDescriptor.MODULE_VERSION);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof zzaen) {
                return (zzaen) queryLocalInterface;
            }
            return new zzaep(zza);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzaym.zzd("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzaes getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof zzaes) {
            return (zzaes) queryLocalInterface;
        }
        return new zzaer(iBinder);
    }
}
