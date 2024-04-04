package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzad {
    private boolean zzdtd = false;
    private float zzdsy = 1.0f;

    public final synchronized void setAppVolume(float f) {
        this.zzdsy = f;
    }

    public final synchronized float zzqz() {
        if (!zzzf()) {
            return 1.0f;
        }
        return this.zzdsy;
    }

    public final synchronized void setAppMuted(boolean z) {
        this.zzdtd = z;
    }

    public final synchronized boolean zzra() {
        return this.zzdtd;
    }

    private final synchronized boolean zzzf() {
        return this.zzdsy >= 0.0f;
    }

    public static float zzbh(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }
}
