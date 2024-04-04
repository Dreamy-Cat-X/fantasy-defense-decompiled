package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzacp<T> {
    private final String zzck;
    private final T zzclf;
    private final int zzdbg;

    public static zzacp<Boolean> zzg(String str, boolean z) {
        return new zzacp<>(str, Boolean.valueOf(z), zzacr.zzdbh);
    }

    public static zzacp<Long> zzb(String str, long j) {
        return new zzacp<>(str, Long.valueOf(j), zzacr.zzdbi);
    }

    public static zzacp<Double> zzb(String str, double d) {
        return new zzacp<>(str, Double.valueOf(d), zzacr.zzdbj);
    }

    public static zzacp<String> zzh(String str, String str2) {
        return new zzacp<>(str, str2, zzacr.zzdbk);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;Ljava/lang/Integer;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public zzacp(String str, Object obj, int i) {
        this.zzck = str;
        this.zzclf = obj;
        this.zzdbg = i;
    }

    public T get() {
        zzadp zztb = zzads.zztb();
        if (zztb == null) {
            throw new IllegalStateException("Flag is not initialized.");
        }
        int i = zzacs.zzdbm[this.zzdbg - 1];
        if (i == 1) {
            return (T) zztb.zzf(this.zzck, ((Boolean) this.zzclf).booleanValue());
        }
        if (i == 2) {
            return (T) zztb.getLong(this.zzck, ((Long) this.zzclf).longValue());
        }
        if (i == 3) {
            return (T) zztb.zza(this.zzck, ((Double) this.zzclf).doubleValue());
        }
        if (i == 4) {
            return (T) zztb.get(this.zzck, (String) this.zzclf);
        }
        throw new IllegalStateException();
    }
}
