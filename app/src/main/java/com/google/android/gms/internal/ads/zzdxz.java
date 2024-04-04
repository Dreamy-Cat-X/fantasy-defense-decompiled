package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzdxz<V> extends zzead implements zzdzl<V> {
    private static final boolean GENERATE_CANCELLATION_CAUSES;
    private static final Object NULL;
    private static final Logger zzhxm;
    private static final zzb zzhxn;

    @NullableDecl
    private volatile zze listeners;

    @NullableDecl
    private volatile Object value;

    @NullableDecl
    private volatile zzk waiters;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static abstract class zzb {
        private zzb() {
        }

        abstract void zza(zzk zzkVar, zzk zzkVar2);

        abstract void zza(zzk zzkVar, Thread thread);

        abstract boolean zza(zzdxz<?> zzdxzVar, zze zzeVar, zze zzeVar2);

        abstract boolean zza(zzdxz<?> zzdxzVar, zzk zzkVar, zzk zzkVar2);

        abstract boolean zza(zzdxz<?> zzdxzVar, Object obj, Object obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zzc {
        static final zzc zzhxq = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzdxz.zzc.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable exception;

        zzc(Throwable th) {
            this.exception = (Throwable) zzdwa.checkNotNull(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zze {
        static final zze zzhxr = new zze(null, null);
        final Executor executor;

        @NullableDecl
        zze next;
        final Runnable task;

        zze(Runnable runnable, Executor executor) {
            this.task = runnable;
            this.executor = executor;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    private static final class zzf extends zzb {
        private zzf() {
            super();
        }

        @Override // com.google.android.gms.internal.ads.zzdxz.zzb
        final void zza(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzdxz.zzb
        final void zza(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzdxz.zzb
        final boolean zza(zzdxz<?> zzdxzVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zzdxzVar) {
                if (((zzdxz) zzdxzVar).waiters != zzkVar) {
                    return false;
                }
                ((zzdxz) zzdxzVar).waiters = zzkVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdxz.zzb
        final boolean zza(zzdxz<?> zzdxzVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzdxzVar) {
                if (((zzdxz) zzdxzVar).listeners != zzeVar) {
                    return false;
                }
                ((zzdxz) zzdxzVar).listeners = zzeVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdxz.zzb
        final boolean zza(zzdxz<?> zzdxzVar, Object obj, Object obj2) {
            synchronized (zzdxzVar) {
                if (((zzdxz) zzdxzVar).value != obj) {
                    return false;
                }
                ((zzdxz) zzdxzVar).value = obj2;
                return true;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    static abstract class zzh<V> extends zzdxz<V> implements zzi<V> {
        @Override // com.google.android.gms.internal.ads.zzdxz, java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public interface zzi<V> extends zzdzl<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    private static final class zzj extends zzb {
        static final Unsafe zzhxt;
        static final long zzhxu;
        static final long zzhxv;
        static final long zzhxw;
        static final long zzhxx;
        static final long zzhxy;

        private zzj() {
            super();
        }

        @Override // com.google.android.gms.internal.ads.zzdxz.zzb
        final void zza(zzk zzkVar, Thread thread) {
            zzhxt.putObject(zzkVar, zzhxx, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzdxz.zzb
        final void zza(zzk zzkVar, zzk zzkVar2) {
            zzhxt.putObject(zzkVar, zzhxy, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzdxz.zzb
        final boolean zza(zzdxz<?> zzdxzVar, zzk zzkVar, zzk zzkVar2) {
            return zzhxt.compareAndSwapObject(zzdxzVar, zzhxv, zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzdxz.zzb
        final boolean zza(zzdxz<?> zzdxzVar, zze zzeVar, zze zzeVar2) {
            return zzhxt.compareAndSwapObject(zzdxzVar, zzhxu, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzdxz.zzb
        final boolean zza(zzdxz<?> zzdxzVar, Object obj, Object obj2) {
            return zzhxt.compareAndSwapObject(zzdxzVar, zzhxw, obj, obj2);
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzdxz.zzj.1
                        @Override // java.security.PrivilegedExceptionAction
                        public /* synthetic */ Unsafe run() throws Exception {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
                try {
                    zzhxv = unsafe.objectFieldOffset(zzdxz.class.getDeclaredField("waiters"));
                    zzhxu = unsafe.objectFieldOffset(zzdxz.class.getDeclaredField("listeners"));
                    zzhxw = unsafe.objectFieldOffset(zzdxz.class.getDeclaredField("value"));
                    zzhxx = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                    zzhxy = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                    zzhxt = unsafe;
                } catch (Exception e) {
                    zzdwk.zzi(e);
                    throw new RuntimeException(e);
                }
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zzk {
        static final zzk zzhxz = new zzk(false);

        @NullableDecl
        volatile zzk next;

        @NullableDecl
        volatile Thread thread;

        private zzk(boolean z) {
        }

        zzk() {
            zzdxz.zzhxn.zza(this, Thread.currentThread());
        }

        final void zzb(zzk zzkVar) {
            zzdxz.zzhxn.zza(this, zzkVar);
        }
    }

    private final void zza(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 == zzk.zzhxz) {
                return;
            }
            zzk zzkVar3 = null;
            while (zzkVar2 != null) {
                zzk zzkVar4 = zzkVar2.next;
                if (zzkVar2.thread != null) {
                    zzkVar3 = zzkVar2;
                } else if (zzkVar3 != null) {
                    zzkVar3.next = zzkVar4;
                    if (zzkVar3.thread == null) {
                        break;
                    }
                } else if (zzhxn.zza((zzdxz<?>) this, zzkVar2, zzkVar4)) {
                }
                zzkVar2 = zzkVar4;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void afterDone() {
    }

    protected void interruptTask() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza {
        static final zza zzhxo;
        static final zza zzhxp;

        @NullableDecl
        final Throwable cause;
        final boolean wasInterrupted;

        zza(boolean z, @NullableDecl Throwable th) {
            this.wasInterrupted = z;
            this.cause = th;
        }

        static {
            if (zzdxz.GENERATE_CANCELLATION_CAUSES) {
                zzhxp = null;
                zzhxo = null;
            } else {
                zzhxp = new zza(false, null);
                zzhxo = new zza(true, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zzg<V> implements Runnable {
        final zzdzl<? extends V> future;
        final zzdxz<V> zzhxs;

        zzg(zzdxz<V> zzdxzVar, zzdzl<? extends V> zzdzlVar) {
            this.zzhxs = zzdxzVar;
            this.future = zzdzlVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzdxz) this.zzhxs).value != this) {
                return;
            }
            if (zzdxz.zzhxn.zza((zzdxz<?>) this.zzhxs, (Object) this, zzdxz.getFutureValue(this.future))) {
                zzdxz.zza((zzdxz<?>) this.zzhxs);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    private static final class zzd extends zzb {
        final AtomicReferenceFieldUpdater<zzdxz, zze> listenersUpdater;
        final AtomicReferenceFieldUpdater<zzdxz, Object> valueUpdater;
        final AtomicReferenceFieldUpdater<zzk, zzk> waiterNextUpdater;
        final AtomicReferenceFieldUpdater<zzk, Thread> waiterThreadUpdater;
        final AtomicReferenceFieldUpdater<zzdxz, zzk> waitersUpdater;

        zzd(AtomicReferenceFieldUpdater<zzk, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<zzk, zzk> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<zzdxz, zzk> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<zzdxz, zze> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<zzdxz, Object> atomicReferenceFieldUpdater5) {
            super();
            this.waiterThreadUpdater = atomicReferenceFieldUpdater;
            this.waiterNextUpdater = atomicReferenceFieldUpdater2;
            this.waitersUpdater = atomicReferenceFieldUpdater3;
            this.listenersUpdater = atomicReferenceFieldUpdater4;
            this.valueUpdater = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzdxz.zzb
        final void zza(zzk zzkVar, Thread thread) {
            this.waiterThreadUpdater.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzdxz.zzb
        final void zza(zzk zzkVar, zzk zzkVar2) {
            this.waiterNextUpdater.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzdxz.zzb
        final boolean zza(zzdxz<?> zzdxzVar, zzk zzkVar, zzk zzkVar2) {
            return this.waitersUpdater.compareAndSet(zzdxzVar, zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzdxz.zzb
        final boolean zza(zzdxz<?> zzdxzVar, zze zzeVar, zze zzeVar2) {
            return this.listenersUpdater.compareAndSet(zzdxzVar, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzdxz.zzb
        final boolean zza(zzdxz<?> zzdxzVar, Object obj, Object obj2) {
            return this.valueUpdater.compareAndSet(zzdxzVar, obj, obj2);
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) & (!(obj instanceof zzg))) {
            return (V) zzaf(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zzk zzkVar = this.waiters;
            if (zzkVar != zzk.zzhxz) {
                zzk zzkVar2 = new zzk();
                do {
                    zzkVar2.zzb(zzkVar);
                    if (zzhxn.zza((zzdxz<?>) this, zzkVar, zzkVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzkVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) & (!(obj2 instanceof zzg))) {
                                return (V) zzaf(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzkVar2);
                    } else {
                        zzkVar = this.waiters;
                    }
                } while (zzkVar != zzk.zzhxz);
            }
            return (V) zzaf(this.value);
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) & (!(obj3 instanceof zzg))) {
                return (V) zzaf(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String zzdxzVar = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append("Waited ");
        sb.append(j);
        sb.append(" ");
        sb.append(lowerCase2);
        String sb2 = sb.toString();
        if (nanos + 1000 < 0) {
            String concat = String.valueOf(sb2).concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String valueOf = String.valueOf(concat);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(lowerCase).length());
                sb3.append(valueOf);
                sb3.append(convert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String sb4 = sb3.toString();
                if (z) {
                    sb4 = String.valueOf(sb4).concat(",");
                }
                concat = String.valueOf(sb4).concat(" ");
            }
            if (z) {
                String valueOf2 = String.valueOf(concat);
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                sb5.append(valueOf2);
                sb5.append(nanos2);
                sb5.append(" nanoseconds ");
                concat = sb5.toString();
            }
            sb2 = String.valueOf(concat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
        }
        StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(zzdxzVar).length());
        sb6.append(sb2);
        sb6.append(" for ");
        sb6.append(zzdxzVar);
        throw new TimeoutException(sb6.toString());
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) & (!(obj2 instanceof zzg))) {
            return (V) zzaf(obj2);
        }
        zzk zzkVar = this.waiters;
        if (zzkVar != zzk.zzhxz) {
            zzk zzkVar2 = new zzk();
            do {
                zzkVar2.zzb(zzkVar);
                if (zzhxn.zza((zzdxz<?>) this, zzkVar, zzkVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzkVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof zzg))));
                    return (V) zzaf(obj);
                }
                zzkVar = this.waiters;
            } while (zzkVar != zzk.zzhxz);
        }
        return (V) zzaf(this.value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static V zzaf(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            Throwable th = ((zza) obj).cause;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).exception);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof zzg)) & (this.value != null);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        zza zzaVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof zzg)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            zzaVar = new zza(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            zzaVar = zza.zzhxo;
        } else {
            zzaVar = zza.zzhxp;
        }
        boolean z2 = false;
        zzdxz<V> zzdxzVar = this;
        while (true) {
            if (zzhxn.zza((zzdxz<?>) zzdxzVar, obj, (Object) zzaVar)) {
                if (z) {
                    zzdxzVar.interruptTask();
                }
                zza((zzdxz<?>) zzdxzVar);
                if (!(obj instanceof zzg)) {
                    return true;
                }
                zzdzl<? extends V> zzdzlVar = ((zzg) obj).future;
                if (zzdzlVar instanceof zzi) {
                    zzdxzVar = (zzdxz) zzdzlVar;
                    obj = zzdxzVar.value;
                    if (!(obj == null) && !(obj instanceof zzg)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    zzdzlVar.cancel(z);
                    return true;
                }
            } else {
                obj = zzdxzVar.value;
                if (!(obj instanceof zzg)) {
                    return z2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof zza) && ((zza) obj).wasInterrupted;
    }

    @Override // com.google.android.gms.internal.ads.zzdzl
    public void addListener(Runnable runnable, Executor executor) {
        zze zzeVar;
        zzdwa.checkNotNull(runnable, "Runnable was null.");
        zzdwa.checkNotNull(executor, "Executor was null.");
        if (!isDone() && (zzeVar = this.listeners) != zze.zzhxr) {
            zze zzeVar2 = new zze(runnable, executor);
            do {
                zzeVar2.next = zzeVar;
                if (zzhxn.zza((zzdxz<?>) this, zzeVar, zzeVar2)) {
                    return;
                } else {
                    zzeVar = this.listeners;
                }
            } while (zzeVar != zze.zzhxr);
        }
        zza(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean set(@NullableDecl V v) {
        if (v == null) {
            v = (V) NULL;
        }
        if (!zzhxn.zza((zzdxz<?>) this, (Object) null, (Object) v)) {
            return false;
        }
        zza((zzdxz<?>) this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean setException(Throwable th) {
        if (!zzhxn.zza((zzdxz<?>) this, (Object) null, (Object) new zzc((Throwable) zzdwa.checkNotNull(th)))) {
            return false;
        }
        zza((zzdxz<?>) this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean setFuture(zzdzl<? extends V> zzdzlVar) {
        zzc zzcVar;
        zzdwa.checkNotNull(zzdzlVar);
        Object obj = this.value;
        if (obj == null) {
            if (zzdzlVar.isDone()) {
                if (!zzhxn.zza((zzdxz<?>) this, (Object) null, getFutureValue(zzdzlVar))) {
                    return false;
                }
                zza((zzdxz<?>) this);
                return true;
            }
            zzg zzgVar = new zzg(this, zzdzlVar);
            if (zzhxn.zza((zzdxz<?>) this, (Object) null, (Object) zzgVar)) {
                try {
                    zzdzlVar.addListener(zzgVar, zzdys.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Throwable unused) {
                        zzcVar = zzc.zzhxq;
                    }
                    zzhxn.zza((zzdxz<?>) this, (Object) zzgVar, (Object) zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zza) {
            zzdzlVar.cancel(((zza) obj).wasInterrupted);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object getFutureValue(zzdzl<?> zzdzlVar) {
        Throwable zza2;
        if (zzdzlVar instanceof zzi) {
            Object obj = ((zzdxz) zzdzlVar).value;
            if (!(obj instanceof zza)) {
                return obj;
            }
            zza zzaVar = (zza) obj;
            if (!zzaVar.wasInterrupted) {
                return obj;
            }
            if (zzaVar.cause != null) {
                return new zza(false, zzaVar.cause);
            }
            return zza.zzhxp;
        }
        if ((zzdzlVar instanceof zzead) && (zza2 = zzeac.zza((zzead) zzdzlVar)) != null) {
            return new zzc(zza2);
        }
        boolean isCancelled = zzdzlVar.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) & isCancelled) {
            return zza.zzhxp;
        }
        try {
            Object uninterruptibly = getUninterruptibly(zzdzlVar);
            if (!isCancelled) {
                return uninterruptibly == null ? NULL : uninterruptibly;
            }
            String valueOf = String.valueOf(zzdzlVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(valueOf);
            return new zza(false, new IllegalArgumentException(sb.toString()));
        } catch (CancellationException e) {
            if (!isCancelled) {
                String valueOf2 = String.valueOf(zzdzlVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 77);
                sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb2.append(valueOf2);
                return new zzc(new IllegalArgumentException(sb2.toString(), e));
            }
            return new zza(false, e);
        } catch (ExecutionException e2) {
            if (isCancelled) {
                String valueOf3 = String.valueOf(zzdzlVar);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 84);
                sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb3.append(valueOf3);
                return new zza(false, new IllegalArgumentException(sb3.toString(), e2));
            }
            return new zzc(e2.getCause());
        } catch (Throwable th) {
            return new zzc(th);
        }
    }

    private static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(zzdxz<?> zzdxzVar) {
        zze zzeVar;
        zze zzeVar2;
        zze zzeVar3 = null;
        while (true) {
            zzk zzkVar = ((zzdxz) zzdxzVar).waiters;
            if (zzhxn.zza(zzdxzVar, zzkVar, zzk.zzhxz)) {
                while (zzkVar != null) {
                    Thread thread = zzkVar.thread;
                    if (thread != null) {
                        zzkVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    zzkVar = zzkVar.next;
                }
                zzdxzVar.afterDone();
                do {
                    zzeVar = ((zzdxz) zzdxzVar).listeners;
                } while (!zzhxn.zza(zzdxzVar, zzeVar, zze.zzhxr));
                while (true) {
                    zzeVar2 = zzeVar3;
                    zzeVar3 = zzeVar;
                    if (zzeVar3 == null) {
                        break;
                    }
                    zzeVar = zzeVar3.next;
                    zzeVar3.next = zzeVar2;
                }
                while (zzeVar2 != null) {
                    zzeVar3 = zzeVar2.next;
                    Runnable runnable = zzeVar2.task;
                    if (runnable instanceof zzg) {
                        zzg zzgVar = (zzg) runnable;
                        zzdxzVar = zzgVar.zzhxs;
                        if (((zzdxz) zzdxzVar).value == zzgVar) {
                            if (!zzhxn.zza((zzdxz<?>) zzdxzVar, (Object) zzgVar, getFutureValue(zzgVar.future))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        zza(runnable, zzeVar2.executor);
                    }
                    zzeVar2 = zzeVar3;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzead
    @NullableDecl
    public final Throwable zzazw() {
        if (!(this instanceof zzi)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).exception;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void maybePropagateCancellationTo(@NullableDecl Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    public String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            zza(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.value;
            if (obj instanceof zzg) {
                sb2.append(", setFuture=[");
                zza(sb2, ((zzg) obj).future);
                sb2.append("]");
            } else {
                try {
                    sb = zzdwi.emptyToNull(pendingToString());
                } catch (RuntimeException | StackOverflowError e) {
                    String valueOf = String.valueOf(e.getClass());
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 38);
                    sb3.append("Exception thrown from implementation: ");
                    sb3.append(valueOf);
                    sb = sb3.toString();
                }
                if (sb != null) {
                    sb2.append(", info=[");
                    sb2.append(sb);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                zza(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @NullableDecl
    public String pendingToString() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    private final void zza(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            zza(sb, uninterruptibly);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    private final void zza(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    private static void zza(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = zzhxm;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e);
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zzb zzfVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        GENERATE_CANCELLATION_CAUSES = z;
        zzhxm = Logger.getLogger(zzdxz.class.getName());
        try {
            zzfVar = new zzj();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th2 = th3;
                zzfVar = new zzd(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzdxz.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzdxz.class, zze.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzdxz.class, Object.class, "value"));
                th = null;
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                zzfVar = new zzf();
            }
        }
        zzhxn = zzfVar;
        if (th != null) {
            zzhxm.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzhxm.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }
}
