package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzgk extends zzgo {
    public zzgk(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2) {
        super(zzezVar, str, str2, c0009zza, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        this.zzaaz.zza(zzcn.ENUM_FAILURE);
        boolean booleanValue = ((Boolean) this.zzabj.invoke(null, this.zzvx.getContext())).booleanValue();
        synchronized (this.zzaaz) {
            if (booleanValue) {
                this.zzaaz.zza(zzcn.ENUM_TRUE);
            } else {
                this.zzaaz.zza(zzcn.ENUM_FALSE);
            }
        }
    }
}
