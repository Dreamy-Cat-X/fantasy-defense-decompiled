package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzeir {
    private final ConcurrentHashMap<zzeiq, List<Throwable>> zzijq = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> zzijr = new ReferenceQueue<>();

    public final List<Throwable> zza(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.zzijr.poll();
        while (poll != null) {
            this.zzijq.remove(poll);
            poll = this.zzijr.poll();
        }
        List<Throwable> list = this.zzijq.get(new zzeiq(th, null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.zzijq.putIfAbsent(new zzeiq(th, this.zzijr), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
