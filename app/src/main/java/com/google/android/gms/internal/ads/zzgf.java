package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzgf extends zzgo {
    public zzgf(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2) {
        super(zzezVar, str, str2, c0009zza, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zzaaz) {
            zzfa zzfaVar = new zzfa((String) this.zzabj.invoke(null, new Object[0]));
            this.zzaaz.zzac(zzfaVar.zzzf.longValue());
            this.zzaaz.zzad(zzfaVar.zzzg.longValue());
        }
    }
}
