package com.sncompany.newtower;

import android.media.AudioManager;
import android.util.Log;
import androidx.core.internal.view.SupportMenu;

import com.sncompany.newtower.Battle.ArrowUnit;
import com.sncompany.newtower.Battle.EffectUnit;
import com.sncompany.newtower.Battle.MonsterUnit;
import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.DataClasses.DataUpgradeItem;
import com.sncompany.newtower.Battle.ObjectUnit;
import com.sncompany.newtower.Battle.TowerUnit;

import java.lang.reflect.Array;

/* loaded from: D:\decomp\classes.dex */
public class GameThread extends Thread {
    public static final int SPECIAL_ATTACK_ARROW_LEG_POS_X = 403;
    public static final int SPECIAL_ATTACK_ARROW_LEG_POS_Y = 558;
    public static final int SPECIAL_ATTACK_ARROW_UNIT_START_FRAME = 165;
    public static ArrowUnit[] arrowUnit;
    public static int arrowUnitCount;
    public static final MediaManager[] bgmMedia = new MediaManager[3];
    public static boolean characterAddHeroFlag;
    public static int characterAddNumber;
    public static int characterAddOrder;
    public static int characterAddType;
    public static int characterMenuSelectFlag;
    public static int characterSelectNumber;
    public static boolean cheatFlag;
    public static int commonTargetNumber;
    public static int commonTargetType;
    public static TowerUnit compareTowerUnit;
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
    public static final int[][] mapTileData = new int[15][10];
    public static AudioManager mgr;
    public static final MonsterUnit[] monsterUnit = new MonsterUnit[100];
    public static int monsterUnitCount;
    public static NewTower newTower;
    public static ObjectUnit[] objectUnit;
    public static int objectUnitCount;
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
    public static int towerUnitCount;
    public static int gameTimeCount = 0;
    public static final String[] chapterName = {"Dark Forest", "Swamp of Despair", "Eternal Wasteland", "Infernal Volcano", "Nightmarish Demon World"};
    public static int TOWER_MAX_LEVEL_NORMAL = 3;
    public static int TOWER_MAX_LEVEL_HERO = 5;


    public static boolean[] cheatData = new boolean[5];

    public static int getAttackSpeed(int i) {
        int i2 = Math.max(0,60 - i);
        return (i2 * 5) + 70;
    }

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
            cheatFlag = false;
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

    public boolean enableAddUnit() {
        CGPoint firstLastActionTouch = TouchManager.getFirstLastActionTouch();
        if (firstLastActionTouch.x < 62.0f || firstLastActionTouch.y - 25.0f < 30.0f || firstLastActionTouch.x >= 737.0f || firstLastActionTouch.y - 25.0f >= 480.0f) {
            return false;
        }
        int i = (int) ((firstLastActionTouch.x - 62.0f) / 45.0f);
        int i2 = (int) (((firstLastActionTouch.y - 25.0f) - 30.0f) / 45.0f);
        if (mapTileData[i][i2] != -1) {
            return false;
        }
        for (int i3 = 0; i3 < towerUnitCount; i3++) {
            if (towerUnit[i3].towerType != -1 && towerUnit[i3].blockX == i && towerUnit[i3].blockY == i2) {
                return false;
            }
        }
        for (int i4 = 0; i4 < objectUnitCount; i4++) {
            if (objectUnit[i4].type != -1 && objectUnit[i4].type != -2) {
                int i5 = objectUnit[i4].blockSize;
                if (i5 == 0) {
                    int i6 = (objectUnit[i4].posX / 50) / 45;
                    int i7 = (objectUnit[i4].posY / 50) / 45;
                    if (i == i6 && i2 == i7) {
                        return false;
                    }
                } else if (i5 == 1) {
                    int i8 = (objectUnit[i4].posX / 50) / 45;
                    int i9 = (objectUnit[i4].posY / 50) / 45;
                    int i10 = i9 - 1;
                    if (i == i8 && i2 >= i10 && i2 <= i9) {
                        return false;
                    }
                } else if (i5 == 2) {
                    int i11 = (objectUnit[i4].posX / 50) / 45;
                    int i12 = (objectUnit[i4].posY / 50) / 45;
                    int i13 = i12 - 1;
                    if (i >= i11 - 1 && i <= i11 && i2 >= i13 && i2 <= i12) {
                        return false;
                    }
                } else if (i5 == 3) {
                    int i14 = (objectUnit[i4].posX / 50) / 45;
                    int i15 = ((objectUnit[i4].posY / 50) / 45) - 1;
                    int i16 = i14 + 1;
                    int i17 = i15 + 2;
                    if (i >= i14 && i <= i16 && i2 >= i15 && i2 <= i17) {
                        return false;
                    }
                } else if (i5 == 4) {
                    int i18 = ((objectUnit[i4].posX / 50) / 45) - 1;
                    int i19 = ((objectUnit[i4].posY / 50) / 45) - 1;
                    int i20 = i18 + 1;
                    int i21 = i19 + 2;
                    if (i >= i18 && i <= i20 && i2 >= i19 && i2 <= i21) {
                        return false;
                    }
                } else if (i5 == 5) {
                    int i22 = ((objectUnit[i4].posX / 50) / 45) - 1;
                    int i23 = ((objectUnit[i4].posY / 50) / 45) - 1;
                    int i24 = i22 + 2;
                    int i25 = i23 + 1;
                    if (i >= i22 && i <= i24 && i2 >= i23 && i2 <= i25) {
                        return false;
                    }
                }
            }
        }
        return true;
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
