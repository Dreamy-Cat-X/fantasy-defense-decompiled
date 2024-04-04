package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzajv {
    private final Context context;
    private final zzvn zzacq;
    private final zzwy zzacr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajv(Context context, zzwy zzwyVar) {
        this(context, zzwyVar, zzvn.zzchp);
    }

    private zzajv(Context context, zzwy zzwyVar, zzvn zzvnVar) {
        this.context = context;
        this.zzacr = zzwyVar;
        this.zzacq = zzvnVar;
    }

    private final void zza(zzzc zzzcVar) {
        try {
            this.zzacr.zzb(zzvn.zza(this.context, zzzcVar));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final void loadAd(AdRequest adRequest) {
        zza(adRequest.zzds());
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        zza(publisherAdRequest.zzds());
    }
}
