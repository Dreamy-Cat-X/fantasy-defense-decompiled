package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzejo {
    private final byte[] buffer;
    private final zzeka zziko;

    private zzejo(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zziko = zzeka.zzv(bArr);
    }

    public final zzejg zzbgt() {
        this.zziko.zzbhw();
        return new zzejq(this.buffer);
    }

    public final zzeka zzbgu() {
        return this.zziko;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzejo(int i, zzejf zzejfVar) {
        this(i);
    }
}
