package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzgg extends zzgo {
    private final StackTraceElement[] zzabe;

    public zzgg(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzezVar, str, str2, c0009zza, i, 45);
        this.zzabe = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        zzcn zzcnVar;
        if (this.zzabe != null) {
            zzev zzevVar = new zzev((String) this.zzabj.invoke(null, this.zzabe));
            synchronized (this.zzaaz) {
                this.zzaaz.zzab(zzevVar.zzyk.longValue());
                if (zzevVar.zzyl.booleanValue()) {
                    zzcf.zza.C0009zza c0009zza = this.zzaaz;
                    if (zzevVar.zzym.booleanValue()) {
                        zzcnVar = zzcn.ENUM_FALSE;
                    } else {
                        zzcnVar = zzcn.ENUM_TRUE;
                    }
                    c0009zza.zzc(zzcnVar);
                } else {
                    this.zzaaz.zzc(zzcn.ENUM_FAILURE);
                }
            }
        }
    }
}
