package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdrk implements zzdrl {
    private final Executor executor;
    private final zzayq zzeex;

    public zzdrk(Executor executor, zzayq zzayqVar) {
        this.executor = executor;
        this.zzeex = zzayqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdrl
    public final void zzgx(final String str) {
        this.executor.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzdrn
            private final String zzdhw;
            private final zzdrk zzhpt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhpt = this;
                this.zzdhw = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzhpt.zzgy(this.zzdhw);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzgy(String str) {
        this.zzeex.zzel(str);
    }
}
