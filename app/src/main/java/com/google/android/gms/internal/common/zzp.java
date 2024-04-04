package com.google.android.gms.internal.common;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzp<T> implements zzo<T> {
    private volatile zzo<T> zza;
    private volatile boolean zzb;

    @NullableDecl
    private T zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(zzo<T> zzoVar) {
        this.zza = (zzo) zzl.zza(zzoVar);
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final T zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    T zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    this.zza = null;
                    return zza;
                }
            }
        }
        return this.zzc;
    }

    public final String toString() {
        Object obj = this.zza;
        if (obj == null) {
            String valueOf = String.valueOf(this.zzc);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
