package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzga extends zzgo {
    private long zzabb;

    public zzga(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2) {
        super(zzezVar, str, str2, c0009zza, i, 12);
        this.zzabb = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        this.zzaaz.zzi(-1L);
        this.zzaaz.zzi(((Long) this.zzabj.invoke(null, this.zzvx.getContext())).longValue());
    }
}
