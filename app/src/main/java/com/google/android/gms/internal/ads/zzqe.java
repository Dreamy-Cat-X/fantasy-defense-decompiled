package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzqe implements MediaCodec.OnFrameRenderedListener {
    private final /* synthetic */ zzqd zzbme;

    private zzqe(zzqd zzqdVar, MediaCodec mediaCodec) {
        this.zzbme = zzqdVar;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        if (this != this.zzbme.zzbmb) {
            return;
        }
        this.zzbme.zzjk();
    }
}
