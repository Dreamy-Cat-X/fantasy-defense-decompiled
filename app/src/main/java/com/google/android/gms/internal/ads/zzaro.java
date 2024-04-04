package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzaro {
    private static zzaxc zzdrs;
    private final Context context;
    private final zzzc zzact;
    private final AdFormat zzdrr;

    public static zzaxc zzp(Context context) {
        zzaxc zzaxcVar;
        synchronized (zzaro.class) {
            if (zzdrs == null) {
                zzdrs = zzwo.zzqn().zza(context, new zzamu());
            }
            zzaxcVar = zzdrs;
        }
        return zzaxcVar;
    }

    public zzaro(Context context, AdFormat adFormat, zzzc zzzcVar) {
        this.context = context;
        this.zzdrr = adFormat;
        this.zzact = zzzcVar;
    }

    public final void zza(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzvi zza;
        zzaxc zzp = zzp(this.context);
        if (zzp == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(this.context);
        zzzc zzzcVar = this.zzact;
        if (zzzcVar == null) {
            zza = new zzvl().zzqc();
        } else {
            zza = zzvn.zza(this.context, zzzcVar);
        }
        try {
            zzp.zza(wrap, new zzaxi(null, this.zzdrr.name(), null, zza), new zzarr(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
