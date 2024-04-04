package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxz;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
abstract class zzdyh<OutputT> extends zzdxz.zzh<OutputT> {
    private static final Logger zzhxm = Logger.getLogger(zzdyh.class.getName());
    private static final zza zzhyi;
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    private static abstract class zza {
        private zza() {
        }

        abstract void zza(zzdyh zzdyhVar, Set<Throwable> set, Set<Throwable> set2);

        abstract int zzc(zzdyh zzdyhVar);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    private static final class zzb extends zza {
        private zzb() {
            super();
        }

        @Override // com.google.android.gms.internal.ads.zzdyh.zza
        final void zza(zzdyh zzdyhVar, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (zzdyhVar) {
                if (zzdyhVar.seenExceptions == null) {
                    zzdyhVar.seenExceptions = set2;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdyh.zza
        final int zzc(zzdyh zzdyhVar) {
            int zzb;
            synchronized (zzdyhVar) {
                zzb = zzdyh.zzb(zzdyhVar);
            }
            return zzb;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyh(int i) {
        this.remaining = i;
    }

    abstract void zzh(Set<Throwable> set);

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    private static final class zzc extends zza {
        private final AtomicReferenceFieldUpdater<zzdyh, Set<Throwable>> zzhym;
        private final AtomicIntegerFieldUpdater<zzdyh> zzhyn;

        zzc(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.zzhym = atomicReferenceFieldUpdater;
            this.zzhyn = atomicIntegerFieldUpdater;
        }

        @Override // com.google.android.gms.internal.ads.zzdyh.zza
        final void zza(zzdyh zzdyhVar, Set<Throwable> set, Set<Throwable> set2) {
            this.zzhym.compareAndSet(zzdyhVar, null, set2);
        }

        @Override // com.google.android.gms.internal.ads.zzdyh.zza
        final int zzc(zzdyh zzdyhVar) {
            return this.zzhyn.decrementAndGet(zzdyhVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Throwable> zzbab() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set<Throwable> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzh(newSetFromMap);
        zzhyi.zza(this, null, newSetFromMap);
        return this.seenExceptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzbac() {
        return zzhyi.zzc(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzbad() {
        this.seenExceptions = null;
    }

    static /* synthetic */ int zzb(zzdyh zzdyhVar) {
        int i = zzdyhVar.remaining - 1;
        zzdyhVar.remaining = i;
        return i;
    }

    static {
        zza zzbVar;
        Throwable th;
        try {
            zzbVar = new zzc(AtomicReferenceFieldUpdater.newUpdater(zzdyh.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzdyh.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzbVar = new zzb();
            th = th2;
        }
        zzhyi = zzbVar;
        if (th != null) {
            zzhxm.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }
}
