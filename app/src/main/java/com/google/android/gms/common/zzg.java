package com.google.android.gms.common;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzg extends zzd {
    private final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.zza = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.zzd
    public final byte[] zza() {
        return this.zza;
    }
}
