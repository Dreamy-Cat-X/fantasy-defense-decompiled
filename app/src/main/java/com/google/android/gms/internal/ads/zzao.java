package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzao extends Exception {
    private long zzan;
    private final zzy zzbt;

    public zzao() {
        this.zzbt = null;
    }

    public zzao(zzy zzyVar) {
        this.zzbt = zzyVar;
    }

    public zzao(String str) {
        super(str);
        this.zzbt = null;
    }

    public zzao(Throwable th) {
        super(th);
        this.zzbt = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(long j) {
        this.zzan = j;
    }
}
