package com.sncompany.newtower;

import android.content.Context;
import android.media.MediaPlayer;

/* loaded from: D:\decomp\classes.dex */
public class MediaManager {
    MediaPlayer mPlayer;

    public MediaManager(Context context, int i) {
        MediaPlayer create = MediaPlayer.create(context, i);
        this.mPlayer = create;
        create.setLooping(true);
    }

    public void setVolume(int i, int i2) {
        float f = (float)i / i2;
        this.mPlayer.setVolume(f, f);
    }

    public void play() {
        this.mPlayer.start();
    }

    public void stop() {
        this.mPlayer.stop();
        try {
            this.mPlayer.prepare();
            this.mPlayer.seekTo(0);
        } catch (Exception unused) {
        }
    }
}
