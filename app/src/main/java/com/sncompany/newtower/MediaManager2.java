package com.sncompany.newtower;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

/* loaded from: D:\decomp\classes.dex */
public class MediaManager2 {
    MediaPlayer[] mPlayer;

    public MediaManager2(int i) {
        mPlayer = new MediaPlayer[i];
    }

    public void setMediaFile(int i, Context context, int rid) {
        if (i >= mPlayer.length)
            return;

        mPlayer[i] = MediaPlayer.create(context, rid);
        mPlayer[i].setLooping(false);
        // from class: com.sncompany.newtower.MediaManager2.1
// android.media.MediaPlayer.OnCompletionListener
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

    public void setVolume(int i, int i2, int i3) {
        float f = i2 / i3;
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

    public void release(int i) {
        mPlayer[i].release();
    }
}
