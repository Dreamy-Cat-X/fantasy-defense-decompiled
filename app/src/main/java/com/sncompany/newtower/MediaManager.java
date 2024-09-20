package com.sncompany.newtower;

import android.content.Context;
import android.media.MediaPlayer;

/* loaded from: D:\decomp\classes.dex */
public class MediaManager {
    MediaPlayer mPlayer;

    public MediaManager(Context context, int i) {
        mPlayer = MediaPlayer.create(context, i);
        mPlayer.setLooping(true);
    }

    public void setVolume(int i, int i2) {
        float f = (float)i / i2;
        mPlayer.setVolume(f, f);
    }

    public void play() {
        if (!mPlayer.isPlaying())
            mPlayer.start();
    }

    public void stop() {
        if (!mPlayer.isPlaying())
            return;
        mPlayer.stop();
        try {
            mPlayer.prepare();
            mPlayer.seekTo(0);
        } catch (Exception unused) {
        }
    }
}
