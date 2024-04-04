package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzjk {
    public byte[] iv;
    private byte[] key;
    private int mode;
    public int[] numBytesOfClearData;
    public int[] numBytesOfEncryptedData;
    private int numSubSamples;
    private int zzant;
    private int zzanu;
    private final MediaCodec.CryptoInfo zzanv;
    private final zzjm zzanw;

    public zzjk() {
        this.zzanv = zzps.SDK_INT >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.zzanw = zzps.SDK_INT >= 24 ? new zzjm(this.zzanv) : null;
    }

    public final void set(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.numSubSamples = i;
        this.numBytesOfClearData = iArr;
        this.numBytesOfEncryptedData = iArr2;
        this.key = bArr;
        this.iv = bArr2;
        this.mode = i2;
        this.zzant = 0;
        this.zzanu = 0;
        if (zzps.SDK_INT >= 16) {
            this.zzanv.numSubSamples = this.numSubSamples;
            this.zzanv.numBytesOfClearData = this.numBytesOfClearData;
            this.zzanv.numBytesOfEncryptedData = this.numBytesOfEncryptedData;
            this.zzanv.key = this.key;
            this.zzanv.iv = this.iv;
            this.zzanv.mode = this.mode;
            if (zzps.SDK_INT >= 24) {
                this.zzanw.set(0, 0);
            }
        }
    }

    public final MediaCodec.CryptoInfo zzgm() {
        return this.zzanv;
    }
}
