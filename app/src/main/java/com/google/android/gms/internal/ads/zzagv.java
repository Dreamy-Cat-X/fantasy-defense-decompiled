package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzagv extends zzaga {
    private final OnPublisherAdViewLoadedListener zzdfp;

    public zzagv(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener) {
        this.zzdfp = onPublisherAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafx
    public final void zza(zzxg zzxgVar, IObjectWrapper iObjectWrapper) {
        if (zzxgVar == null || iObjectWrapper == null) {
            return;
        }
        PublisherAdView publisherAdView = new PublisherAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
        try {
            if (zzxgVar.zzkj() instanceof zzve) {
                zzve zzveVar = (zzve) zzxgVar.zzkj();
                publisherAdView.setAdListener(zzveVar != null ? zzveVar.getAdListener() : null);
            }
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
        try {
            if (zzxgVar.zzki() instanceof zzvv) {
                zzvv zzvvVar = (zzvv) zzxgVar.zzki();
                publisherAdView.setAppEventListener(zzvvVar != null ? zzvvVar.getAppEventListener() : null);
            }
        } catch (RemoteException e2) {
            zzaym.zzc("", e2);
        }
        zzayd.zzaae.post(new zzagy(this, publisherAdView, zzxgVar));
    }
}
