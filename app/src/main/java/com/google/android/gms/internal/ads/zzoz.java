package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzoz {
    private final ExecutorService zzbjf;
    private zzpb<? extends zzpa> zzbjg;
    private IOException zzbjh;

    public zzoz(String str) {
        this.zzbjf = zzps.zzbf(str);
    }

    public final <T extends zzpa> long zza(T t, zzoy<T> zzoyVar, int i) {
        Looper myLooper = Looper.myLooper();
        zzpf.checkState(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzpb(this, myLooper, t, zzoyVar, i, elapsedRealtime).zzek(0L);
        return elapsedRealtime;
    }

    public final boolean isLoading() {
        return this.zzbjg != null;
    }

    public final void zzit() {
        this.zzbjg.zzl(false);
    }

    public final void zza(Runnable runnable) {
        zzpb<? extends zzpa> zzpbVar = this.zzbjg;
        if (zzpbVar != null) {
            zzpbVar.zzl(true);
        }
        this.zzbjf.execute(runnable);
        this.zzbjf.shutdown();
    }

    public final void zzbg(int i) throws IOException {
        IOException iOException = this.zzbjh;
        if (iOException != null) {
            throw iOException;
        }
        zzpb<? extends zzpa> zzpbVar = this.zzbjg;
        if (zzpbVar != null) {
            zzpbVar.zzbg(zzpbVar.zzbjk);
        }
    }
}
