package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzij {
    private final Handler handler;
    private final zzik zzaja;

    public zzij(Handler handler, zzik zzikVar) {
        this.handler = zzikVar != null ? (Handler) zzpf.checkNotNull(handler) : null;
        this.zzaja = zzikVar;
    }

    public final void zza(zzjl zzjlVar) {
        if (this.zzaja != null) {
            this.handler.post(new zzim(this, zzjlVar));
        }
    }

    public final void zza(String str, long j, long j2) {
        if (this.zzaja != null) {
            this.handler.post(new zzil(this, str, j, j2));
        }
    }

    public final void zzb(zzhs zzhsVar) {
        if (this.zzaja != null) {
            this.handler.post(new zzio(this, zzhsVar));
        }
    }

    public final void zza(int i, long j, long j2) {
        if (this.zzaja != null) {
            this.handler.post(new zzin(this, i, j, j2));
        }
    }

    public final void zzb(zzjl zzjlVar) {
        if (this.zzaja != null) {
            this.handler.post(new zziq(this, zzjlVar));
        }
    }

    public final void zzw(int i) {
        if (this.zzaja != null) {
            this.handler.post(new zzip(this, i));
        }
    }
}
