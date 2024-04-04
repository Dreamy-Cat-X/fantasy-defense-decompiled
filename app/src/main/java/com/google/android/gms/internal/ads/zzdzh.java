package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
abstract class zzdzh<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable zzhza = new zzdzi();
    private static final Runnable zzhzb = new zzdzi();
    private static final Runnable zzhzc = new zzdzi();

    abstract boolean isDone();

    abstract void zzb(@NullableDecl T t, @NullableDecl Throwable th);

    abstract T zzbae() throws Exception;

    abstract String zzbaf();

    @Override // java.lang.Runnable
    public final void run() {
        T zzbae;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            boolean z = !isDone();
            if (z) {
                try {
                    zzbae = zzbae();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, zzhza)) {
                        Runnable runnable = get();
                        boolean z2 = false;
                        int i = 0;
                        while (true) {
                            if (runnable != zzhzb && runnable != zzhzc) {
                                break;
                            }
                            i++;
                            if (i > 1000) {
                                Runnable runnable2 = zzhzc;
                                if (runnable == runnable2 || compareAndSet(zzhzb, runnable2)) {
                                    z2 = Thread.interrupted() || z2;
                                    LockSupport.park(this);
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = get();
                        }
                        if (z2) {
                            currentThread.interrupt();
                        }
                    }
                    if (z) {
                        zzb(null, th);
                        return;
                    }
                    return;
                }
            } else {
                zzbae = null;
            }
            if (!compareAndSet(currentThread, zzhza)) {
                Runnable runnable3 = get();
                boolean z3 = false;
                int i2 = 0;
                while (true) {
                    if (runnable3 != zzhzb && runnable3 != zzhzc) {
                        break;
                    }
                    i2++;
                    if (i2 > 1000) {
                        Runnable runnable4 = zzhzc;
                        if (runnable3 == runnable4 || compareAndSet(zzhzb, runnable4)) {
                            z3 = Thread.interrupted() || z3;
                            LockSupport.park(this);
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable3 = get();
                }
                if (z3) {
                    currentThread.interrupt();
                }
            }
            if (z) {
                zzb(zzbae, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void interruptTask() {
        Runnable runnable = get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, zzhzb)) {
            try {
                ((Thread) runnable).interrupt();
            } finally {
                if (getAndSet(zzhza) == zzhzc) {
                    LockSupport.unpark((Thread) runnable);
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == zzhza) {
            str = "running=[DONE]";
        } else if (runnable == zzhzb) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String zzbaf = zzbaf();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(zzbaf).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(zzbaf);
        return sb2.toString();
    }
}
