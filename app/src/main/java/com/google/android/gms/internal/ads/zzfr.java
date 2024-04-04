package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzfr extends zzgo {
    private static volatile Long zzaaw;
    private static final Object zzaax = new Object();

    public zzfr(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2) {
        super(zzezVar, str, str2, c0009zza, i, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        if (zzaaw == null) {
            synchronized (zzaax) {
                if (zzaaw == null) {
                    zzaaw = (Long) this.zzabj.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzaaz) {
            this.zzaaz.zzaa(zzaaw.longValue());
        }
    }
}
