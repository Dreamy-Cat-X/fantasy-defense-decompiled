package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzgb extends zzgo {
    public zzgb(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2) {
        super(zzezVar, str, str2, c0009zza, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        try {
            this.zzaaz.zzd(((Boolean) this.zzabj.invoke(null, this.zzvx.getContext())).booleanValue() ? zzcn.ENUM_TRUE : zzcn.ENUM_FALSE);
        } catch (InvocationTargetException unused) {
            this.zzaaz.zzd(zzcn.ENUM_FAILURE);
        }
    }
}
