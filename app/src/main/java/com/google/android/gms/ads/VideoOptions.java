package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzaaq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class VideoOptions {
    private final boolean zzadu;
    private final boolean zzadv;
    private final boolean zzadw;

    public VideoOptions(zzaaq zzaaqVar) {
        this.zzadu = zzaaqVar.zzadu;
        this.zzadv = zzaaqVar.zzadv;
        this.zzadw = zzaaqVar.zzadw;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class Builder {
        private boolean zzadu = true;
        private boolean zzadv = false;
        private boolean zzadw = false;

        public final Builder setStartMuted(boolean z) {
            this.zzadu = z;
            return this;
        }

        public final Builder setCustomControlsRequested(boolean z) {
            this.zzadv = z;
            return this;
        }

        public final Builder setClickToExpandRequested(boolean z) {
            this.zzadw = z;
            return this;
        }

        public final VideoOptions build() {
            return new VideoOptions(this);
        }
    }

    private VideoOptions(Builder builder) {
        this.zzadu = builder.zzadu;
        this.zzadv = builder.zzadv;
        this.zzadw = builder.zzadw;
    }

    public final boolean getStartMuted() {
        return this.zzadu;
    }

    public final boolean getCustomControlsRequested() {
        return this.zzadv;
    }

    public final boolean getClickToExpandRequested() {
        return this.zzadw;
    }
}
