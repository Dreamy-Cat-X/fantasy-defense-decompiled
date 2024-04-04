package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzgd extends zzgo {
    private final boolean zzabc;

    public zzgd(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2) {
        super(zzezVar, str, str2, c0009zza, i, 61);
        this.zzabc = zzezVar.zzcb();
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzabj.invoke(null, this.zzvx.getContext(), Boolean.valueOf(this.zzabc))).longValue();
        synchronized (this.zzaaz) {
            this.zzaaz.zzah(longValue);
        }
    }
}
