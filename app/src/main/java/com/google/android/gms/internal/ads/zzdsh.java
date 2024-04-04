package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdsh {
    private final Executor executor;
    private final zzayq zzhqi;

    public zzdsh(Executor executor, zzayq zzayqVar) {
        this.executor = executor;
        this.zzhqi = zzayqVar;
    }

    public final void zzk(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            zzel(it.next());
        }
    }

    public final void zzel(final String str) {
        this.executor.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzdsg
            private final String zzdhw;
            private final zzdsh zzhjs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhjs = this;
                this.zzdhw = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzhjs.zzhe(this.zzdhw);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzhe(String str) {
        this.zzhqi.zzel(str);
    }
}
