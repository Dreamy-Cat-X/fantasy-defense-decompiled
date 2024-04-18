package com.sncompany.newtower;

import android.media.AudioManager;
import android.util.Log;

import androidx.core.internal.view.SupportMenu;

import com.sncompany.newtower.Battle.EffectUnit;
import com.sncompany.newtower.Battle.ObjectUnit;
import com.sncompany.newtower.Battle.TowerUnit;
import com.sncompany.newtower.DataClasses.CGPoint;

import java.lang.reflect.Array;

/* loaded from: D:\decomp\classes.dex */
public class GameThread extends Thread {
    public static final int SPECIAL_ATTACK_ARROW_LEG_POS_X = 403;
    public static final int SPECIAL_ATTACK_ARROW_LEG_POS_Y = 558;
    public static final MediaManager[] bgmMedia = new MediaManager[3];
    public static boolean characterAddHeroFlag;
    public static int characterAddNumber;
    public static int characterAddOrder;
    public static int characterAddType;
    public static int characterMenuSelectFlag;
    public static int characterSelectNumber;
    public static long currentDate;
    public static long currentDrawDate;
    public static int currentFrameCount;
    public static float destroyScore;
    public static final int total_SFX = 31;
    public static final MediaManager2 effectMedia = new MediaManager2(total_SFX);
    public static EffectUnit[] effectUnit;

    public static int gameHelpViewNum;
    public static int gameLoadFlag;
    public static int gameStatus;
    public static int gameSubStatus;
    public static int gameTitleViewCount;
    public static int[] heroUnitType;
    public static int[][] highScoreValue;
    public static int lastDrawCount;
    public static int lastFrameCount;
    public static int loadingStatus;
    public static boolean m_bStop;
    public static int mapAttackType;
    public static final int[] mapEndDirection = new int[10];
    public static final int[][] mapEndPosition = new int[10][2];
    public static int mapNumber;
    public static AudioManager mgr;
    public static NewTower newTower;
    public static boolean pauseFlag;
    public static long playTimeStartValue;
    public static int randomNumber;
    public static int realDrawCount;
    public static int rewardShowOrder = -1;
    public static final boolean soundFlag = true;
    public static final boolean[] soundPlayCheckFlag = new boolean[total_SFX];
    public static int[] soundPlayDelayCount = new int[total_SFX];
    public static int specialAttackFrameCount;
    public static boolean specialAttackSkipFlag;
    public static int[][] specialDataValue;
    public static int stageClearViewHeroism;
    public static long startDate;
    public static long startDrawDate;
    public static TowerUnit[] towerUnit;
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
                    int i = gameLoadFlag;
                    if (i == 0 && loadingStatus >= 1000 && loadingStatus <= 1008) {
                        sleep(12L); //Loading
                        break;
                    } else if (i == 1)
                        sleep(24L);
                } else
                    sleep(1000L);
            } catch (Exception ignored) {
            }
    }

    public void updateGame() {
        if (NewTower.currentPage != null)
            NewTower.currentPage.update();
        playSound2();
    }

    public static void update_GAME_PRE_LOAD() {
        if (Texture2D.gl != null) {
            mgr = (AudioManager) newTower.getSystemService("audio");
            int streamMaxVolume = mgr.getStreamMaxVolume(3);
            Config.musicMaxVolume = streamMaxVolume;
            Config.musicVolume = streamMaxVolume / 2;
            Config.effectVolume = streamMaxVolume / 2;

            specialDataValue = (int[][]) Array.newInstance(int.class, 20, 4);

            loadSounds();
            gameTimeCount = 0;
            startDate = System.currentTimeMillis();
            lastFrameCount = 0;
            currentFrameCount = 0;
            startDrawDate = System.currentTimeMillis();
            realDrawCount = 0;
            lastDrawCount = 0;
            characterMenuSelectFlag = 0;
            GameRenderer.setFontColor(SupportMenu.CATEGORY_MASK);
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

    public static int getRandom(int i) {
        int currentTimeMillis = (int) ((((randomNumber & SupportMenu.USER_MASK) * 93217) + 1 + (System.currentTimeMillis() & 65535)) & 65535);
        randomNumber = currentTimeMillis;
        int i2 = currentTimeMillis >> 1;
        randomNumber = i2;
        if (i == 0) {
            return 0;
        }
        return i2 % i;
    }

    public static void playSound(int i) {
        soundPlayCheckFlag[i] = true;
    }

    public static void playSound2() {
        int ind = 0;
        for (int i = 0; i < 31; i++) {
            soundPlayDelayCount[i]++;
            if (soundPlayCheckFlag[i]) {
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
                } else
                    soundPlayCheckFlag[i] = false;
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
}
