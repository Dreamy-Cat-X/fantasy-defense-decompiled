package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbav implements AudioManager.OnAudioFocusChangeListener {
    private float zzdg = 1.0f;
    private boolean zzeii;
    private final AudioManager zzelh;
    private final zzbau zzeli;
    private boolean zzelj;
    private boolean zzelk;

    public zzbav(Context context, zzbau zzbauVar) {
        this.zzelh = (AudioManager) context.getSystemService("audio");
        this.zzeli = zzbauVar;
    }

    public final void setMuted(boolean z) {
        this.zzelk = z;
        zzabm();
    }

    public final void setVolume(float f) {
        this.zzdg = f;
        zzabm();
    }

    public final float getVolume() {
        float f = this.zzelk ? 0.0f : this.zzdg;
        if (this.zzelj) {
            return f;
        }
        return 0.0f;
    }

    public final void zzabk() {
        this.zzeii = true;
        zzabm();
    }

    public final void zzabl() {
        this.zzeii = false;
        zzabm();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.zzelj = i > 0;
        this.zzeli.zzaah();
    }

    private final void zzabm() {
        boolean z;
        boolean z2;
        boolean z3 = this.zzeii && !this.zzelk && this.zzdg > 0.0f;
        if (z3 && !(z2 = this.zzelj)) {
            AudioManager audioManager = this.zzelh;
            if (audioManager != null && !z2) {
                this.zzelj = audioManager.requestAudioFocus(this, 3, 2) == 1;
            }
            this.zzeli.zzaah();
            return;
        }
        if (z3 || !(z = this.zzelj)) {
            return;
        }
        AudioManager audioManager2 = this.zzelh;
        if (audioManager2 != null && z) {
            this.zzelj = audioManager2.abandonAudioFocus(this) == 0;
        }
        this.zzeli.zzaah();
    }
}
