package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzepo<T> implements zzepq<T> {
    private zzeqd<T> zzjah;

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final T get() {
        zzeqd<T> zzeqdVar = this.zzjah;
        if (zzeqdVar == null) {
            throw new IllegalStateException();
        }
        return zzeqdVar.get();
    }

    public static <T> void zzbe(zzeqd<T> zzeqdVar, zzeqd<T> zzeqdVar2) {
        zzepw.checkNotNull(zzeqdVar2);
        zzepo zzepoVar = (zzepo) zzeqdVar;
        if (zzepoVar.zzjah != null) {
            throw new IllegalStateException();
        }
        zzepoVar.zzjah = zzeqdVar2;
    }
}
