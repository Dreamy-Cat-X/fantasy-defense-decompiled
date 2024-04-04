package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzddm implements zzdeu<zzddj> {
    private final Bundle zzfxd;
    private final zzdzk zzgfs;

    public zzddm(zzdzk zzdzkVar, Bundle bundle) {
        this.zzgfs = zzdzkVar;
        this.zzfxd = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzddj> zzata() {
        return this.zzgfs.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzddl
            private final zzddm zzhat;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhat = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzhat.zzatm();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddj zzatm() throws Exception {
        return new zzddj(this.zzfxd);
    }
}
