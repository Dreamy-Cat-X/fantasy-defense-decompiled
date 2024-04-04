package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.instream.InstreamAd;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzajy {
    private final Context context;
    private final zzxd zzacp;

    public zzajy(Context context, String str) {
        this((Context) Preconditions.checkNotNull(context, "context cannot be null"), zzwo.zzqn().zzb(context, str, new zzamu()));
    }

    private zzajy(Context context, zzxd zzxdVar) {
        this.context = context;
        this.zzacp = zzxdVar;
    }

    public final zzajy zza(InstreamAd.InstreamAdLoadCallback instreamAdLoadCallback) {
        try {
            this.zzacp.zza(new zzajw(instreamAdLoadCallback));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
        return this;
    }

    public final zzajy zza(zzajt zzajtVar) {
        try {
            this.zzacp.zza(new zzajh(zzajtVar));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
        return this;
    }

    public final zzajv zzuh() {
        try {
            return new zzajv(this.context, this.zzacp.zzqy());
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return null;
        }
    }
}
