package com.sncompany.newtower;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

/* loaded from: D:\decomp\classes.dex */
public class MediaManager2 {
    MediaPlayer[] mPlayer;

    public MediaManager2(int i) {
        this.mPlayer = new MediaPlayer[i];
    }

    //Z is always false lol
    public void setMediaFile(int i, Context context, int rid) {
        MediaPlayer[] mediaPlayerArr = this.mPlayer;
        if (i >= mediaPlayerArr.length)
            return;

        mediaPlayerArr[i] = MediaPlayer.create(context, rid);
        this.mPlayer[i].setLooping(false);
        // from class: com.sncompany.newtower.MediaManager2.1
// android.media.MediaPlayer.OnCompletionListener
        this.mPlayer[i].setOnCompletionListener(mediaPlayer -> {
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
        this.mPlayer[i].setVolume(f, f);
    }

    public void play(int i) {
        MediaPlayer[] mediaPlayerArr = this.mPlayer;
        if (mediaPlayerArr[i] == null || mediaPlayerArr[i].isPlaying()) {
            return;
        }
        try {
            this.mPlayer[i].start();
            Log.d("SOUND", "START");
        } catch (Exception unused) {
            Log.d("SOUND", "START ERROR2");
        }
    }

    public void stop(int i) {
        this.mPlayer[i].stop();
    }

    public void release(int i) {
        this.mPlayer[i].release();
    }
}
