package com.sncompany.newtower;

import android.content.Context;
import android.media.MediaPlayer;

/* loaded from: D:\decomp\classes.dex */
public class MusicManager {
    MediaPlayer mPlayer;

    public MusicManager(Context context, int i) {
        mPlayer = MediaPlayer.create(context, i);
        mPlayer.setLooping(true);
    }

    public void setVolume(int vol, int max) {
        float f = (float)vol / max;
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
