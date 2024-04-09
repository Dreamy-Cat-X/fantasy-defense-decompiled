package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzgc extends zzgo {
    public zzgc(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2) {
        super(zzezVar, str, str2, c0009zza, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        zzej zzejVar = new zzej((String) this.zzabj.invoke(null, this.zzvx.getContext(), Boolean.valueOf(((Boolean) zzwo.zzqq().zzd(zzabh.zzcrj)).booleanValue())));
        synchronized (this.zzaaz) {
            this.zzaaz.zze(zzejVar.zzya);
            this.zzaaz.zzag(zzejVar.zzyb);
        }
    }
}