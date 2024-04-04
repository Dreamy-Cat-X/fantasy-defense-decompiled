package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzfs extends zzgo {
    public zzfs(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2) {
        super(zzezVar, str, str2, c0009zza, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        this.zzaaz.zzf(-1L);
        this.zzaaz.zzg(-1L);
        int[] iArr = (int[]) this.zzabj.invoke(null, this.zzvx.getContext());
        synchronized (this.zzaaz) {
            this.zzaaz.zzf(iArr[0]);
            this.zzaaz.zzg(iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.zzaaz.zzaf(iArr[2]);
            }
        }
    }
}
