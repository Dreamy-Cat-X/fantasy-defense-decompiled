package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
abstract class zzenq<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, zzejg zzejgVar);

    abstract void zza(B b, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(T t, zzeon zzeonVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zza(zzems zzemsVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzak(Object obj);

    abstract T zzaq(B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzau(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzay(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzaz(Object obj);

    abstract void zzb(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzba(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzblb();

    abstract void zzc(B b, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzc(T t, zzeon zzeonVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzi(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzj(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzk(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(B b, zzems zzemsVar) throws IOException {
        int tag = zzemsVar.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            zza((zzenq<T, B>) b, i, zzemsVar.zzbgx());
            return true;
        }
        if (i2 == 1) {
            zzb(b, i, zzemsVar.zzbgz());
            return true;
        }
        if (i2 == 2) {
            zza((zzenq<T, B>) b, i, zzemsVar.zzbhd());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                zzc(b, i, zzemsVar.zzbha());
                return true;
            }
            throw zzeld.zzbji();
        }
        B zzblb = zzblb();
        int i3 = 4 | (i << 3);
        while (zzemsVar.zzbht() != Integer.MAX_VALUE && zza((zzenq<T, B>) zzblb, zzemsVar)) {
        }
        if (i3 != zzemsVar.getTag()) {
            throw zzeld.zzbjh();
        }
        zza((zzenq<T, B>) b, i, (int) zzaq(zzblb));
        return true;
    }
}
