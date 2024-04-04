package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaqt extends RemoteCreator<zzaqx> {
    public zzaqt() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final zzaqs zze(Activity activity) {
        try {
            IBinder zzae = getRemoteCreatorInstance(activity).zzae(ObjectWrapper.wrap(activity));
            if (zzae == null) {
                return null;
            }
            IInterface queryLocalInterface = zzae.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzaqs) {
                return (zzaqs) queryLocalInterface;
            }
            return new zzaqu(zzae);
        } catch (RemoteException e) {
            zzaym.zzd("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            zzaym.zzd("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzaqx getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzaqx) {
            return (zzaqx) queryLocalInterface;
        }
        return new zzaqw(iBinder);
    }
}
