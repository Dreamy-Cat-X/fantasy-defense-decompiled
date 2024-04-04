package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzeiq extends WeakReference<Throwable> {
    private final int zzijp;

    public zzeiq(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.zzijp = System.identityHashCode(th);
    }

    public final int hashCode() {
        return this.zzijp;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            zzeiq zzeiqVar = (zzeiq) obj;
            if (this.zzijp == zzeiqVar.zzijp && get() == zzeiqVar.get()) {
                return true;
            }
        }
        return false;
    }
}
