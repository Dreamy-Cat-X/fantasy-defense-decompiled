package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzqi {
    private final Handler handler;
    private final zzqj zzbmw;

    public zzqi(Handler handler, zzqj zzqjVar) {
        this.handler = zzqjVar != null ? (Handler) zzpf.checkNotNull(handler) : null;
        this.zzbmw = zzqjVar;
    }

    public final void zza(zzjl zzjlVar) {
        if (this.zzbmw != null) {
            this.handler.post(new zzql(this, zzjlVar));
        }
    }

    public final void zza(String str, long j, long j2) {
        if (this.zzbmw != null) {
            this.handler.post(new zzqk(this, str, j, j2));
        }
    }

    public final void zzb(zzhs zzhsVar) {
        if (this.zzbmw != null) {
            this.handler.post(new zzqn(this, zzhsVar));
        }
    }

    public final void zzf(int i, long j) {
        if (this.zzbmw != null) {
            this.handler.post(new zzqm(this, i, j));
        }
    }

    public final void zza(int i, int i2, int i3, float f) {
        if (this.zzbmw != null) {
            this.handler.post(new zzqp(this, i, i2, i3, f));
        }
    }

    public final void zza(Surface surface) {
        if (this.zzbmw != null) {
            this.handler.post(new zzqo(this, surface));
        }
    }

    public final void zzb(zzjl zzjlVar) {
        if (this.zzbmw != null) {
            this.handler.post(new zzqq(this, zzjlVar));
        }
    }
}
