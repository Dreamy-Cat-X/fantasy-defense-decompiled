package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzme implements zzmb {
    private zzme() {
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final boolean zzhl() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final int getCodecCount() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final MediaCodecInfo getCodecInfoAt(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final boolean zza(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
