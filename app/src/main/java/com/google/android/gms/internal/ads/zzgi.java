package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzgi extends zzgo {
    private long zzaao;
    private final zzfk zzwn;

    public zzgi(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2, zzfk zzfkVar) {
        super(zzezVar, str, str2, c0009zza, i, 53);
        this.zzwn = zzfkVar;
        if (zzfkVar != null) {
            this.zzaao = zzfkVar.zzcu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        if (this.zzwn != null) {
            this.zzaaz.zzae(((Long) this.zzabj.invoke(null, Long.valueOf(this.zzaao))).longValue());
        }
    }
}
