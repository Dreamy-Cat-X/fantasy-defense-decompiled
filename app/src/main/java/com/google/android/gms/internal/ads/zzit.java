package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzit extends zziu {
    private final AudioTimestamp zzalq;
    private long zzalr;
    private long zzals;
    private long zzalt;

    public zzit() {
        super(null);
        this.zzalq = new AudioTimestamp();
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zza(AudioTrack audioTrack, boolean z) {
        super.zza(audioTrack, z);
        this.zzalr = 0L;
        this.zzals = 0L;
        this.zzalt = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final boolean zzfy() {
        boolean timestamp = this.zzajz.getTimestamp(this.zzalq);
        if (timestamp) {
            long j = this.zzalq.framePosition;
            if (this.zzals > j) {
                this.zzalr++;
            }
            this.zzals = j;
            this.zzalt = j + (this.zzalr << 32);
        }
        return timestamp;
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final long zzfz() {
        return this.zzalq.nanoTime;
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final long zzga() {
        return this.zzalt;
    }
}
