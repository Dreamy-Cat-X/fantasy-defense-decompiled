package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzckc {
    private final Executor executor;
    private final boolean zzdai;
    protected final zzayq zzeex;
    private final zzdry zzgkk;
    private final String zzczr = zzacx.zzdby.get();
    protected final Map<String, String> zzgka = new HashMap();

    /* JADX INFO: Access modifiers changed from: protected */
    public zzckc(Executor executor, zzayq zzayqVar, zzdry zzdryVar) {
        boolean z;
        this.executor = executor;
        this.zzeex = zzayqVar;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqu)).booleanValue()) {
            z = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcqv)).booleanValue();
        } else {
            z = ((double) zzwo.zzqt().nextFloat()) <= zzacx.zzdbx.get().doubleValue();
        }
        this.zzdai = z;
        this.zzgkk = zzdryVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zzaqy();

    public final void zzo(Map<String, String> map) {
        final String zzp = zzp(map);
        if (this.zzdai) {
            this.executor.execute(new Runnable(this, zzp) { // from class: com.google.android.gms.internal.ads.zzckf
                private final String zzdhw;
                private final zzckc zzgkn;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgkn = this;
                    this.zzdhw = zzp;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzckc zzckcVar = this.zzgkn;
                    zzckcVar.zzeex.zzel(this.zzdhw);
                }
            });
        }
        com.google.android.gms.ads.internal.util.zzd.zzeb(zzp);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzp(Map<String, String> map) {
        return this.zzgkk.zzr(map);
    }
}
