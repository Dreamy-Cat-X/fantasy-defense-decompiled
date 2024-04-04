package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzjm {
    private final MediaCodec.CryptoInfo zzanv;
    private final MediaCodec.CryptoInfo.Pattern zzaoe;

    private zzjm(MediaCodec.CryptoInfo cryptoInfo) {
        this.zzanv = cryptoInfo;
        this.zzaoe = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set(int i, int i2) {
        this.zzaoe.set(0, 0);
        this.zzanv.setPattern(this.zzaoe);
    }
}
