package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzmd implements zzmb {
    private final int zzbdc;
    private MediaCodecInfo[] zzbdd;

    public zzmd(boolean z) {
        this.zzbdc = z ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final boolean zzhl() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final int getCodecCount() {
        zzhm();
        return this.zzbdd.length;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final MediaCodecInfo getCodecInfoAt(int i) {
        zzhm();
        return this.zzbdd[i];
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final boolean zza(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private final void zzhm() {
        if (this.zzbdd == null) {
            this.zzbdd = new MediaCodecList(this.zzbdc).getCodecInfos();
        }
    }
}
