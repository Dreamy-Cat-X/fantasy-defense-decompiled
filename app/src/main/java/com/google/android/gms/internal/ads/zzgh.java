package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzgh extends zzgo {
    private static final Object zzaax = new Object();
    private static volatile Long zzabf;

    public zzgh(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2) {
        super(zzezVar, str, str2, c0009zza, i, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        if (zzabf == null) {
            synchronized (zzaax) {
                if (zzabf == null) {
                    zzabf = (Long) this.zzabj.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzaaz) {
            this.zzaaz.zzs(zzabf.longValue());
        }
    }
}
