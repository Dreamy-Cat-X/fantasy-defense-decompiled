package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzejj extends zzejq {
    private final int zzikm;
    private final int zzikn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejj(byte[] bArr, int i, int i2) {
        super(bArr);
        zzi(i, i + i2, bArr.length);
        this.zzikm = i;
        this.zzikn = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzejq, com.google.android.gms.internal.ads.zzejg
    public final byte zzfz(int i) {
        zzab(i, size());
        return this.zziku[this.zzikm + i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejq, com.google.android.gms.internal.ads.zzejg
    public final byte zzga(int i) {
        return this.zziku[this.zzikm + i];
    }

    @Override // com.google.android.gms.internal.ads.zzejq, com.google.android.gms.internal.ads.zzejg
    public final int size() {
        return this.zzikn;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzejq
    public final int zzbgs() {
        return this.zzikm;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzejq, com.google.android.gms.internal.ads.zzejg
    public final void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zziku, zzbgs() + i, bArr, i2, i3);
    }
}
