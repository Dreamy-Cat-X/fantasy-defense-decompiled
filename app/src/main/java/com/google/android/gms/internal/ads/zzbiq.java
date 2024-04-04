package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbiq implements zzbrm {
    private final zzdno zzfpi;

    public zzbiq(zzdno zzdnoVar) {
        this.zzfpi = zzdnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzcc(Context context) {
        try {
            this.zzfpi.pause();
        } catch (zzdnf e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzcd(Context context) {
        try {
            this.zzfpi.resume();
            if (context != null) {
                this.zzfpi.onContextChanged(context);
            }
        } catch (zzdnf e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzce(Context context) {
        try {
            this.zzfpi.destroy();
        } catch (zzdnf e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }
}
