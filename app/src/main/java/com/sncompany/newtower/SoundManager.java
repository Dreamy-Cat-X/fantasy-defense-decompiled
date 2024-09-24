package com.sncompany.newtower;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

/* loaded from: D:\decomp\classes.dex */
public class SoundManager {
    MediaPlayer[] mPlayer;

    public SoundManager(int i) {
        mPlayer = new MediaPlayer[i];
    }

    public void setMediaFile(int i, Context context, int rid) {
        if (i >= mPlayer.length)
            return;
        mPlayer[i] = MediaPlayer.create(context, rid);
        mPlayer[i].setLooping(false);
        mPlayer[i].setOnCompletionListener(mediaPlayer -> {
            try {
                mediaPlayer.stop();
                mediaPlayer.prepare();
            } catch (Exception unused) {
                mediaPlayer.reset();
                Log.d("SOUND", "PREPARE ERROR");
            }
        });
    }

    public void setVolume(int i, int vol, int max) {
        float f = (float)vol / max;
        mPlayer[i].setVolume(f, f);
    }

    public void play(int i) {
        if (mPlayer[i] == null || mPlayer[i].isPlaying())
            return;

        try {
            mPlayer[i].start();
            Log.d("SOUND", "START");
        } catch (Exception unused) {
            Log.d("SOUND", "START ERROR2");
        }
    }

    public void stop(int i) {
        mPlayer[i].stop();
    }
}
