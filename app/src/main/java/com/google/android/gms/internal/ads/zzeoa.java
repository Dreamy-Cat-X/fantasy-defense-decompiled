package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
abstract class zzeoa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzb(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzb(CharSequence charSequence, byte[] bArr, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String zzo(byte[] bArr, int i, int i2) throws zzeld;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzm(byte[] bArr, int i, int i2) {
        return zzb(0, bArr, i, i2) == 0;
    }
}
