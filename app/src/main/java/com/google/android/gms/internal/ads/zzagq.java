package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzagq extends RemoteCreator<zzaev> {
    public zzagq() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    public final zzaeu zzb(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        try {
            IBinder zzb = getRemoteCreatorInstance(view.getContext()).zzb(ObjectWrapper.wrap(view), ObjectWrapper.wrap(hashMap), ObjectWrapper.wrap(hashMap2));
            if (zzb == null) {
                return null;
            }
            IInterface queryLocalInterface = zzb.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            if (queryLocalInterface instanceof zzaeu) {
                return (zzaeu) queryLocalInterface;
            }
            return new zzaew(zzb);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzaym.zzd("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzaev getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof zzaev) {
            return (zzaev) queryLocalInterface;
        }
        return new zzaey(iBinder);
    }
}
