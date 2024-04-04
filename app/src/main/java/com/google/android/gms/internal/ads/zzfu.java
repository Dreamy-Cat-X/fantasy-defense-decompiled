package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzfu extends zzgo {
    private long startTime;

    public zzfu(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, long j, int i, int i2) {
        super(zzezVar, str, str2, c0009zza, i, 25);
        this.startTime = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzabj.invoke(null, new Object[0])).longValue();
        synchronized (this.zzaaz) {
            this.zzaaz.zzak(longValue);
            if (this.startTime != 0) {
                this.zzaaz.zzm(longValue - this.startTime);
                this.zzaaz.zzp(this.startTime);
            }
        }
    }
}
