package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzpa;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzpb<T extends zzpa> extends Handler implements Runnable {
    private volatile boolean zzaft;
    private final T zzbji;
    private final zzoy<T> zzbjj;
    public final int zzbjk;
    private final long zzbjl;
    private IOException zzbjm;
    private int zzbjn;
    private volatile Thread zzbjo;
    private final /* synthetic */ zzoz zzbjp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzpb(zzoz zzozVar, Looper looper, T t, zzoy<T> zzoyVar, int i, long j) {
        super(looper);
        this.zzbjp = zzozVar;
        this.zzbji = t;
        this.zzbjj = zzoyVar;
        this.zzbjk = i;
        this.zzbjl = j;
    }

    public final void zzbg(int i) throws IOException {
        IOException iOException = this.zzbjm;
        if (iOException != null && this.zzbjn > i) {
            throw iOException;
        }
    }

    public final void zzek(long j) {
        zzpb zzpbVar;
        zzpbVar = this.zzbjp.zzbjg;
        zzpf.checkState(zzpbVar == null);
        this.zzbjp.zzbjg = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            execute();
        }
    }

    public final void zzl(boolean z) {
        this.zzaft = z;
        this.zzbjm = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.zzbji.cancelLoad();
            if (this.zzbjo != null) {
                this.zzbjo.interrupt();
            }
        }
        if (z) {
            finish();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzbjj.zza((zzoy<T>) this.zzbji, elapsedRealtime, elapsedRealtime - this.zzbjl, true);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzbjo = Thread.currentThread();
            if (!this.zzbji.zzhx()) {
                String valueOf = String.valueOf(this.zzbji.getClass().getSimpleName());
                zzpt.beginSection(valueOf.length() != 0 ? "load:".concat(valueOf) : new String("load:"));
                try {
                    this.zzbji.zzhy();
                    zzpt.endSection();
                } catch (Throwable th) {
                    zzpt.endSection();
                    throw th;
                }
            }
            if (this.zzaft) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.zzaft) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (this.zzaft) {
                return;
            }
            obtainMessage(3, new zzpd(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (this.zzaft) {
                return;
            }
            obtainMessage(3, new zzpd(e3)).sendToTarget();
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.zzaft) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (InterruptedException unused) {
            zzpf.checkState(this.zzbji.zzhx());
            if (this.zzaft) {
                return;
            }
            sendEmptyMessage(2);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzaft) {
            return;
        }
        if (message.what == 0) {
            execute();
            return;
        }
        if (message.what == 4) {
            throw ((Error) message.obj);
        }
        finish();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.zzbjl;
        if (this.zzbji.zzhx()) {
            this.zzbjj.zza((zzoy<T>) this.zzbji, elapsedRealtime, j, false);
            return;
        }
        int i = message.what;
        if (i == 1) {
            this.zzbjj.zza((zzoy<T>) this.zzbji, elapsedRealtime, j, false);
            return;
        }
        if (i == 2) {
            this.zzbjj.zza(this.zzbji, elapsedRealtime, j);
            return;
        }
        if (i != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zzbjm = iOException;
        int zza = this.zzbjj.zza((zzoy<T>) this.zzbji, elapsedRealtime, j, iOException);
        if (zza == 3) {
            this.zzbjp.zzbjh = this.zzbjm;
        } else if (zza != 2) {
            this.zzbjn = zza == 1 ? 1 : this.zzbjn + 1;
            zzek(Math.min((r12 - 1) * 1000, 5000));
        }
    }

    private final void execute() {
        ExecutorService executorService;
        zzpb zzpbVar;
        this.zzbjm = null;
        executorService = this.zzbjp.zzbjf;
        zzpbVar = this.zzbjp.zzbjg;
        executorService.execute(zzpbVar);
    }

    private final void finish() {
        this.zzbjp.zzbjg = null;
    }
}
