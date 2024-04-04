package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzepr<T> implements zzepk<T>, zzeqd<T> {
    private static final Object zzjai = new Object();
    private volatile Object zzeey = zzjai;
    private volatile zzeqd<T> zzjaj;

    private zzepr(zzeqd<T> zzeqdVar) {
        this.zzjaj = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepk, com.google.android.gms.internal.ads.zzeqd
    public final T get() {
        T t = (T) this.zzeey;
        if (t == zzjai) {
            synchronized (this) {
                t = (T) this.zzeey;
                if (t == zzjai) {
                    t = this.zzjaj.get();
                    Object obj = this.zzeey;
                    if (((obj == zzjai || (obj instanceof zzepx)) ? false : true) && obj != t) {
                        String valueOf = String.valueOf(obj);
                        String valueOf2 = String.valueOf(t);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.zzeey = t;
                    this.zzjaj = null;
                }
            }
        }
        return t;
    }

    public static <P extends zzeqd<T>, T> zzeqd<T> zzau(P p) {
        zzepw.checkNotNull(p);
        return p instanceof zzepr ? p : new zzepr(p);
    }

    public static <P extends zzeqd<T>, T> zzepk<T> zzav(P p) {
        if (p instanceof zzepk) {
            return (zzepk) p;
        }
        return new zzepr((zzeqd) zzepw.checkNotNull(p));
    }
}
