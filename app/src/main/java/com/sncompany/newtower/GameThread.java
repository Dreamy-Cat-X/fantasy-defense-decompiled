package com.sncompany.newtower;

import android.content.Context;
import android.media.AudioManager;
import android.util.Log;

import com.sncompany.newtower.Pages.LoadingPage;

/* loaded from: D:\decomp\classes.dex */
public class GameThread extends Thread {
    public static final MediaManager[] bgmMedia = new MediaManager[3];
    public static long currentDate;
    public static long currentDrawDate;
    public static int currentFrameCount;
    public static final int total_SFX = 31;
    public static final MediaManager2 effectMedia = new MediaManager2(total_SFX);

    public static int gameSubStatus;
    public static int lastDrawCount;
    public static int lastFrameCount;
    public static int loadingStatus;
    public static boolean m_bStop;
    public static AudioManager mgr;
    public static NewTower newTower;
    public static boolean pauseFlag, touchFlag;
    public static long playTimeStartValue;
    public static int realDrawCount;
    public static final boolean soundFlag = true;
    public static final boolean[] soundPlayCheckFlag = new boolean[total_SFX];
    public static int[] soundPlayDelayCount = new int[total_SFX];
    public static long startDate;
    public static long startDrawDate;

    public static int gameTimeCount = 0;
    public static final String[] chapterName = {"Dark Forest", "Swamp of Despair", "Eternal Wasteland", "Infernal Volcano", "Nightmarish Demon World"};
    public static int TOWER_MAX_LEVEL_NORMAL = 3;
    public static int TOWER_MAX_LEVEL_HERO = 5;

    public GameThread(NewTower nt) {
        newTower = nt;
        m_bStop = false;
        pauseFlag = false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (!m_bStop)
            try {
                if (!pauseFlag && newTower.hasWindowFocus()) {
                    NewTower.glGameSurfaceView.requestRender();
                    if (NewTower.currentPage instanceof LoadingPage) {
                        sleep(12L); //Loading
                    } else
                        sleep(24L);
                } else
                    sleep(500L);
            } catch (Exception ignored) {
            }
    }

    public void updateGame() {
        if (touchFlag)
            touchCheckTOTAL();
        if (NewTower.currentPage != null)
            NewTower.currentPage.update();
        playSound2();
    }
    public void touchCheckTOTAL() {
        if (NewTower.currentPage != null)
            NewTower.currentPage.touchCheck();
        TouchManager.processTouchStatus();
        touchFlag = false;
    }

    public static void update_GAME_PRE_LOAD() {
        if (Texture2D.gl != null) {
            mgr = (AudioManager) newTower.getSystemService(Context.AUDIO_SERVICE);
            int streamMaxVolume = mgr.getStreamMaxVolume(3);
            Config.musicMaxVolume = streamMaxVolume;
            Config.musicVolume = streamMaxVolume / 2;
            Config.effectVolume = streamMaxVolume / 2;

            loadSounds();
            gameTimeCount = 0;
            startDate = System.currentTimeMillis();
            lastFrameCount = 0;
            currentFrameCount = 0;
            startDrawDate = System.currentTimeMillis();
            realDrawCount = 0;
            lastDrawCount = 0;
            GameRenderer.setFontColor(-65536);
            GameRenderer.setFontSize(50);
            GameRenderer.textTombstone.removeAllTombstones();
            GameRenderer.lastFontName = null;
            GameRenderer.makeBaseStruct();
            Config.readSaveData(newTower, 1);

            GameRenderer.lastCheckTime = System.currentTimeMillis();
            GameRenderer.loadCount_GAME_PRE_IMAGE_LOAD = 0;
            return;
        }
        Log.d("UPDATE", "GL NO!!!");
    }

    public static void loadSounds() {
        bgmMedia[0] = new MediaManager(newTower, R.raw.bgm_1);
        bgmMedia[1] = new MediaManager(newTower, R.raw.bgm_2);
        bgmMedia[2] = new MediaManager(newTower, R.raw.bgm_3);
        effectMedia.setMediaFile(0, newTower, R.raw.snlogo);
        effectMedia.setMediaFile(1, newTower, R.raw.att_1);
        effectMedia.setMediaFile(2, newTower, R.raw.att_2);
        effectMedia.setMediaFile(3, newTower, R.raw.att_3);
        effectMedia.setMediaFile(4, newTower, R.raw.att_4);
        effectMedia.setMediaFile(5, newTower, R.raw.att_5);
        effectMedia.setMediaFile(6, newTower, R.raw.att_6);
        effectMedia.setMediaFile(7, newTower, R.raw.att_7);
        effectMedia.setMediaFile(8, newTower, R.raw.att_8);
        effectMedia.setMediaFile(9, newTower, R.raw.att_9);
        effectMedia.setMediaFile(10, newTower, R.raw.etc_1);
        effectMedia.setMediaFile(11, newTower, R.raw.etc_2);
        effectMedia.setMediaFile(12, newTower, R.raw.etc_3);
        effectMedia.setMediaFile(13, newTower, R.raw.etc_4);
        effectMedia.setMediaFile(14, newTower, R.raw.etc_5);
        effectMedia.setMediaFile(15, newTower, R.raw.etc_6);
        effectMedia.setMediaFile(16, newTower, R.raw.etc_7);
        effectMedia.setMediaFile(17, newTower, R.raw.etc_8);
        effectMedia.setMediaFile(18, newTower, R.raw.etc_9);
        effectMedia.setMediaFile(19, newTower, R.raw.etc_10);
        effectMedia.setMediaFile(20, newTower, R.raw.etc_11);
        effectMedia.setMediaFile(21, newTower, R.raw.voice_1);
        effectMedia.setMediaFile(22, newTower, R.raw.voice_2);
        effectMedia.setMediaFile(23, newTower, R.raw.voice_3);
        effectMedia.setMediaFile(24, newTower, R.raw.voice_4);
        effectMedia.setMediaFile(25, newTower, R.raw.voice_5);
        effectMedia.setMediaFile(26, newTower, R.raw.voice_6);
        effectMedia.setMediaFile(27, newTower, R.raw.voice_7);
        effectMedia.setMediaFile(28, newTower, R.raw.voice_8);
        effectMedia.setMediaFile(29, newTower, R.raw.voice_9);
        effectMedia.setMediaFile(30, newTower, R.raw.spebladehit);
    }

    public static void playSound(int i) {
        if (Config.effectVolume > 0)
            soundPlayCheckFlag[i] = true;
    }

    public static void playSound2() {
        int ind = 0;
        for (int i = 0; i < 31; i++) {
            if (soundPlayCheckFlag[i]) {
                soundPlayDelayCount[i]++;
                if (soundPlayDelayCount[i] >= 12) {
                    if (soundFlag) {
                        try {
                            effectMedia.setVolume(i, Config.effectVolume, Config.musicMaxVolume);
                            effectMedia.play(i);
                            ind++;
                        } catch (Exception ignored) {
                        }
                    }
                    soundPlayCheckFlag[i] = false;
                    soundPlayDelayCount[i] = 0;
                }
            }
            if (ind >= 5) {
                return;
            }
        }
    }

    public static void killSound(int i) {
        try {
            effectMedia.stop(i);
        } catch (Exception ignored) {
        }
    }

    public static void playLoopSound(int i) {
        if (soundFlag) {
            try {
                bgmMedia[i].setVolume(Config.musicVolume, Config.musicMaxVolume);
                bgmMedia[i].play();
            } catch (Exception ignored) {
            }
        }
    }

    public static void stopLoopSound(int i) {
        try {
            bgmMedia[i].stop();
        } catch (Exception ignored) {
        }
    }

    public static String getString(int id) {
        return newTower.getString(id);
    }
}
