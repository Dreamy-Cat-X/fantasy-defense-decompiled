package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbiz implements zzahv<Object> {
    final /* synthetic */ zzbiw zzfqj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbiz(zzbiw zzbiwVar) {
        this.zzfqj = zzbiwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zza(Object obj, Map<String, String> map) {
        boolean zzn;
        Executor executor;
        zzn = this.zzfqj.zzn(map);
        if (zzn) {
            executor = this.zzfqj.executor;
            executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbiy
                private final zzbiz zzfqi;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfqi = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbjf zzbjfVar;
                    zzbjfVar = this.zzfqi.zzfqj.zzfpz;
                    zzbjfVar.zzaiv();
                }
            });
        }
    }
}
