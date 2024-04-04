package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeqa<T> implements zzeqd<T> {
    private static final Object zzjai = new Object();
    private volatile Object zzeey = zzjai;
    private volatile zzeqd<T> zzjaj;

    private zzeqa(zzeqd<T> zzeqdVar) {
        this.zzjaj = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final T get() {
        T t = (T) this.zzeey;
        if (t != zzjai) {
            return t;
        }
        zzeqd<T> zzeqdVar = this.zzjaj;
        if (zzeqdVar == null) {
            return (T) this.zzeey;
        }
        T t2 = zzeqdVar.get();
        this.zzeey = t2;
        this.zzjaj = null;
        return t2;
    }

    public static <P extends zzeqd<T>, T> zzeqd<T> zzau(P p) {
        return ((p instanceof zzeqa) || (p instanceof zzepr)) ? p : new zzeqa((zzeqd) zzepw.checkNotNull(p));
    }
}
