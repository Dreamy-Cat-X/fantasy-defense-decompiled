package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzge extends zzgo {
    private List<Long> zzabd;

    public zzge(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2) {
        super(zzezVar, str, str2, c0009zza, i, 31);
        this.zzabd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        this.zzaaz.zzq(-1L);
        this.zzaaz.zzr(-1L);
        if (this.zzabd == null) {
            this.zzabd = (List) this.zzabj.invoke(null, this.zzvx.getContext());
        }
        List<Long> list = this.zzabd;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zzaaz) {
            this.zzaaz.zzq(this.zzabd.get(0).longValue());
            this.zzaaz.zzr(this.zzabd.get(1).longValue());
        }
    }
}
