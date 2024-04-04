package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdgc implements zzdeu<zzdfz> {
    Context context;
    private zzdzk zzgfs;
    zztf zzhcs;

    public zzdgc(zztf zztfVar, zzdzk zzdzkVar, Context context) {
        this.zzhcs = zztfVar;
        this.zzgfs = zzdzkVar;
        this.context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdfz> zzata() {
        return this.zzgfs.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdgb
            private final zzdgc zzhcr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhcr = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdgc zzdgcVar = this.zzhcr;
                return new zzdfz(zzdgcVar.zzhcs.zzf(zzdgcVar.context));
            }
        });
    }
}
