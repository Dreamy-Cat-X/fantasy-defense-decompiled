package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zziu {
    private int zzahm;
    protected AudioTrack zzajz;
    private boolean zzalu;
    private long zzalv;
    private long zzalw;
    private long zzalx;
    private long zzaly;
    private long zzalz;
    private long zzama;

    private zziu() {
    }

    public boolean zzfy() {
        return false;
    }

    public void zza(AudioTrack audioTrack, boolean z) {
        this.zzajz = audioTrack;
        this.zzalu = z;
        this.zzaly = -9223372036854775807L;
        this.zzalv = 0L;
        this.zzalw = 0L;
        this.zzalx = 0L;
        if (audioTrack != null) {
            this.zzahm = audioTrack.getSampleRate();
        }
    }

    public final void zzdy(long j) {
        this.zzalz = zzgb();
        this.zzaly = SystemClock.elapsedRealtime() * 1000;
        this.zzama = j;
        this.zzajz.stop();
    }

    public final void pause() {
        if (this.zzaly != -9223372036854775807L) {
            return;
        }
        this.zzajz.pause();
    }

    public final long zzgb() {
        if (this.zzaly != -9223372036854775807L) {
            return Math.min(this.zzama, this.zzalz + ((((SystemClock.elapsedRealtime() * 1000) - this.zzaly) * this.zzahm) / 1000000));
        }
        int playState = this.zzajz.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & this.zzajz.getPlaybackHeadPosition();
        if (this.zzalu) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.zzalx = this.zzalv;
            }
            playbackHeadPosition += this.zzalx;
        }
        if (this.zzalv > playbackHeadPosition) {
            this.zzalw++;
        }
        this.zzalv = playbackHeadPosition;
        return playbackHeadPosition + (this.zzalw << 32);
    }

    public final long zzgc() {
        return (zzgb() * 1000000) / this.zzahm;
    }

    public long zzfz() {
        throw new UnsupportedOperationException();
    }

    public long zzga() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zziu(zzir zzirVar) {
        this();
    }
}
