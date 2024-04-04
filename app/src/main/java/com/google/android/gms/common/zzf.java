package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
abstract class zzf extends zzd {
    private static final WeakReference<byte[]> zzb = new WeakReference<>(null);
    private WeakReference<byte[]> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf(byte[] bArr) {
        super(bArr);
        this.zza = zzb;
    }

    protected abstract byte[] zzd();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.zzd
    public final byte[] zza() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.zza.get();
            if (bArr == null) {
                bArr = zzd();
                this.zza = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
