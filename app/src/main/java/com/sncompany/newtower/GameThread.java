package com.sncompany.newtower;

import android.media.AudioManager;
import android.util.Log;
import androidx.core.internal.view.SupportMenu;

import com.sncompany.newtower.Battle.ArrowUnit;
import com.sncompany.newtower.Battle.EffectUnit;
import com.sncompany.newtower.Battle.MonsterUnit;
import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.DataUpgradeItem;
import com.sncompany.newtower.DataClasses.DataUpgradeUnit;
import com.sncompany.newtower.Battle.ObjectUnit;
import com.sncompany.newtower.Battle.TowerUnit;

import java.lang.reflect.Array;

/* loaded from: D:\decomp\classes.dex */
public class GameThread extends Thread {
    public static final int GAME_PLAY2_IMAGE_LOAD = 1005;
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
    public static int characterMenuMonsterStartViewCount;
    public static int characterMenuMonsterViewCount;
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
    public static int[][] gamePlayedCount;
    public static int gameStatus;
    public static int gameSubStatus;
    public static int gameTitleViewCount;
    public static int[][] heroItemType;
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
    public static int myMana;
    public static NewTower newTower;
    public static ObjectUnit[] objectUnit;
    public static int objectUnitCount;
    public static boolean pauseFlag;
    public static long playTimeStartValue;
    public static int randomNumber;
    public static int realDrawCount;
    public static int[] rewardDataValue;
    public static boolean rewardShowFlag;
    public static int rewardShowOrder;
    public static final boolean soundFlag = true;
    public static final boolean[] soundPlayCheckFlag = new boolean[total_SFX];
    public static int[] soundPlayDelayCount = new int[total_SFX];
    public static int specialAttackFrameCount;
    public static boolean specialAttackSkipFlag;
    public static int[][] specialDataValue;
    public static int stageClearViewHeroism;
    public static long startDate;
    public static long startDrawDate;
    public static int tempCharacterRangeViewNumber;
    public static TowerUnit[] towerUnit;
    public static int towerUnitCount;
    public static final int[] upgradeUnitValue = new int[18];
    public static int[][] waveMobData;
    public static int gameTimeCount = 0;
    public static final String[] chapterName = {"Dark Forest", "Swamp of Despair", "Eternal Wasteland", "Infernal Volcano", "Nightmarish Demon World"};
    public static int TOWER_MAX_LEVEL_NORMAL = 3;
    public static int TOWER_MAX_LEVEL_HERO = 5;
    public static int WAVE_MAX_COUNT = 60;


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

            heroItemType = (int[][]) Array.newInstance(int.class, 3, 2);

            waveMobData = (int[][]) Array.newInstance(int.class, WAVE_MAX_COUNT, 8);

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
        effectMedia.setMediaFile(0, newTower, R.raw.snlogo, false);
        effectMedia.setMediaFile(1, newTower, R.raw.att_1, false);
        effectMedia.setMediaFile(2, newTower, R.raw.att_2, false);
        effectMedia.setMediaFile(3, newTower, R.raw.att_3, false);
        effectMedia.setMediaFile(4, newTower, R.raw.att_4, false);
        effectMedia.setMediaFile(5, newTower, R.raw.att_5, false);
        effectMedia.setMediaFile(6, newTower, R.raw.att_6, false);
        effectMedia.setMediaFile(7, newTower, R.raw.att_7, false);
        effectMedia.setMediaFile(8, newTower, R.raw.att_8, false);
        effectMedia.setMediaFile(9, newTower, R.raw.att_9, false);
        effectMedia.setMediaFile(10, newTower, R.raw.etc_1, false);
        effectMedia.setMediaFile(11, newTower, R.raw.etc_2, false);
        effectMedia.setMediaFile(12, newTower, R.raw.etc_3, false);
        effectMedia.setMediaFile(13, newTower, R.raw.etc_4, false);
        effectMedia.setMediaFile(14, newTower, R.raw.etc_5, false);
        effectMedia.setMediaFile(15, newTower, R.raw.etc_6, false);
        effectMedia.setMediaFile(16, newTower, R.raw.etc_7, false);
        effectMedia.setMediaFile(17, newTower, R.raw.etc_8, false);
        effectMedia.setMediaFile(18, newTower, R.raw.etc_9, false);
        effectMedia.setMediaFile(19, newTower, R.raw.etc_10, false);
        effectMedia.setMediaFile(20, newTower, R.raw.etc_11, false);
        effectMedia.setMediaFile(21, newTower, R.raw.voice_1, false);
        effectMedia.setMediaFile(22, newTower, R.raw.voice_2, false);
        effectMedia.setMediaFile(23, newTower, R.raw.voice_3, false);
        effectMedia.setMediaFile(24, newTower, R.raw.voice_4, false);
        effectMedia.setMediaFile(25, newTower, R.raw.voice_5, false);
        effectMedia.setMediaFile(26, newTower, R.raw.voice_6, false);
        effectMedia.setMediaFile(27, newTower, R.raw.voice_7, false);
        effectMedia.setMediaFile(28, newTower, R.raw.voice_8, false);
        effectMedia.setMediaFile(29, newTower, R.raw.voice_9, false);
        effectMedia.setMediaFile(30, newTower, R.raw.spebladehit, false);
    }

    public static int getBuyPrice(int i) {
        int upgradeUnitRate;
        if (i == -1)
            return 0;

        int i2 = DataCharacter.charData[i][0];
        int i3 = DataCharacter.charData[i][11];
        if (i3 == 0) {
            upgradeUnitRate = (DataCharacter.charData[i][0] * getUpgradeUnitRate(1, 6)) / 100;
        } else if (i3 == 1) {
            upgradeUnitRate = (DataCharacter.charData[i][0] * getUpgradeUnitRate(2, 6)) / 100;
        } else {
            if (i3 != 2) {
                return i2;
            }
            upgradeUnitRate = (DataCharacter.charData[i][0] * getUpgradeUnitRate(3, 6)) / 100;
        }
        return i2 + upgradeUnitRate;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0043. Please report as an issue. */
    public static void useSpecialAttack(int i) {
        if (i < 0) {
            return;
        }
        playSound(19);
        int i2 = towerUnit[i].specialType;
        if (i2 == 0) {
            characterMenuSelectFlag = 8;
        } else if (i2 == 1) {
            characterMenuSelectFlag = 9;
        } else if (i2 == 2) {
            characterMenuSelectFlag = 10;
        }
        int i3 = 0;
        specialAttackFrameCount = 0;
        specialAttackSkipFlag = false;

        myMana -= towerUnit[i].specialMana;
        switch (characterMenuSelectFlag) {
            case 8:
                for (int i4 = 0; i4 < 60; i4++) {
                    addSpecialArrowUnit(getRandom(4) + 15, 33750, getRandom(450) * 50, -(i4 + 65), true);
                }
                for (int i5 = 0; i5 < 20; i5++) {
                    int[][] iArr = specialDataValue;
                    int i6 = i5 % 3;
                    iArr[i5][0] = i6;
                    iArr[i5][1] = getRandom(GameRenderer.SCRWIDTH_SMALL);
                    specialDataValue[i5][2] = getRandom(GameRenderer.SCRHEIGHT_SMALL);
                    if (i6 == 0) {
                        specialDataValue[i5][3] = 100;
                    } else if (i6 == 1) {
                        specialDataValue[i5][3] = 160;
                    } else if (i6 == 2) {
                        specialDataValue[i5][3] = 200;
                    }
                }
                return;
            case 9:
                while (i3 < 75) {
                    addSpecialArrowUnit(getRandom(3) + 33, getRandom(675) * 50, getRandom(450) * 50, -(i3 + 60), true);
                    i3++;
                }
                return;
            case 10:
                while (i3 < 60) {
                    addSpecialArrowUnit(getRandom(14) + 19, (getRandom(337) + GameRenderer.GAME_STAGE_CLEAR_THEME_ARROW_BLINK_END_POS) * 50, (getRandom(225) + 112) * 50, -(i3 + 65), true);
                    i3++;
                }
                break;
        }
    }

    public static void clearSpecialArrowUnit() {
        for (int i = 0; i < arrowUnitCount; i++) {
            if (arrowUnit[i].type >= 15 && arrowUnit[i].type <= 35)
                arrowUnit[i].type = -1;
        }
    }

    public static int addSpecialArrowUnit(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        if (z) {
            i5 = 0;
            while (i5 < arrowUnitCount) {
                if (arrowUnit[i5].type == -1) {
                    break;
                }
                i5++;
            }
        }
        i5 = -1;
        if (i5 == -1 && arrowUnitCount == 199) {
            return -1;
        }
        if (i5 == -1) {
            i5 = arrowUnitCount;
            arrowUnitCount = i5 + 1;
        }
        arrowUnit[i5].type = i;
        arrowUnit[i5].targetType = 1;
        arrowUnit[i5].endX = i2;
        arrowUnit[i5].endY = i3;
        ArrowUnit[] arrowUnitArr = arrowUnit;
        arrowUnitArr[i5].startX = arrowUnitArr[i5].endX;
        ArrowUnit[] arrowUnitArr2 = arrowUnit;
        arrowUnitArr2[i5].startY = arrowUnitArr2[i5].endY;
        arrowUnit[i5].moveCount = i4;
        switch (i) {
            case 15:
                arrowUnit[i5].moveSpeed = 5000;
                arrowUnit[i5].startX -= i4 * arrowUnit[i5].moveSpeed;
                break;
            case 16:
                arrowUnit[i5].moveSpeed = 3750;
                arrowUnit[i5].startX -= i4 * arrowUnit[i5].moveSpeed;
                break;
            case 17:
                arrowUnit[i5].moveSpeed = 2750;
                arrowUnit[i5].startX -= i4 * arrowUnit[i5].moveSpeed;
                break;
            case 18:
                arrowUnit[i5].moveSpeed = 1750;
                arrowUnit[i5].startX -= i4 * arrowUnit[i5].moveSpeed;
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                arrowUnit[i5].moveSpeed = 3500;
                arrowUnit[i5].moveRotateDegree = getRandom(360);
                float abs = Math.abs(((float) Math.cos(Math.toRadians(arrowUnit[i5].moveRotateDegree))) * arrowUnit[i5].moveSpeed);
                float abs2 = Math.abs(((float) Math.sin(Math.toRadians(arrowUnit[i5].moveRotateDegree))) * arrowUnit[i5].moveSpeed);
                if (arrowUnit[i5].moveRotateDegree >= 0.0f && arrowUnit[i5].moveRotateDegree < 180.0f) {
                    arrowUnit[i5].startX = (int) (r2.startX + (abs2 * i4));
                } else {
                    arrowUnit[i5].startX = (int) (r2.startX - (abs2 * i4));
                }
                if ((arrowUnit[i5].moveRotateDegree >= 0.0f && arrowUnit[i5].moveRotateDegree < 90.0f) || (arrowUnit[i5].moveRotateDegree >= 270.0f && arrowUnit[i5].moveRotateDegree < 360.0f)) {
                    arrowUnit[i5].startY = (int) (r7.startY - (abs * i4));
                } else {
                    arrowUnit[i5].startY = (int) (r7.startY + (abs * i4));
                }
                break;
            break;
            case 33:
                arrowUnit[i5].moveSpeed = 7000;
                arrowUnit[i5].moveRotateDegree = 165.0f;
                float abs3 = Math.abs(((float) Math.cos(Math.toRadians(arrowUnit[i5].moveRotateDegree))) * arrowUnit[i5].moveSpeed);
                float abs4 = Math.abs(((float) Math.sin(Math.toRadians(arrowUnit[i5].moveRotateDegree))) * arrowUnit[i5].moveSpeed);
                if (arrowUnit[i5].moveRotateDegree >= 0.0f && arrowUnit[i5].moveRotateDegree < 180.0f) {
                    arrowUnit[i5].startX = (int) (r2.startX + (abs4 * i4));
                } else {
                    arrowUnit[i5].startX = (int) (r2.startX - (abs4 * i4));
                }
                if ((arrowUnit[i5].moveRotateDegree >= 0.0f && arrowUnit[i5].moveRotateDegree < 90.0f) || (arrowUnit[i5].moveRotateDegree >= 270.0f && arrowUnit[i5].moveRotateDegree < 360.0f)) {
                    arrowUnit[i5].startY = (int) (r7.startY - (abs3 * i4));
                } else {
                    arrowUnit[i5].startY = (int) (r7.startY + (abs3 * i4));
                }
                break;
            break;
            case 34:
                arrowUnit[i5].moveSpeed = 7000;
                arrowUnit[i5].moveRotateDegree = 180.0f;
                float abs5 = Math.abs(((float) Math.cos(Math.toRadians(arrowUnit[i5].moveRotateDegree))) * arrowUnit[i5].moveSpeed);
                float abs6 = Math.abs(((float) Math.sin(Math.toRadians(arrowUnit[i5].moveRotateDegree))) * arrowUnit[i5].moveSpeed);
                if (arrowUnit[i5].moveRotateDegree >= 0.0f && arrowUnit[i5].moveRotateDegree < 180.0f) {
                    arrowUnit[i5].startX = (int) (r2.startX + (abs6 * i4));
                } else {
                    arrowUnit[i5].startX = (int) (r2.startX - (abs6 * i4));
                }
                if ((arrowUnit[i5].moveRotateDegree >= 0.0f && arrowUnit[i5].moveRotateDegree < 90.0f) || (arrowUnit[i5].moveRotateDegree >= 270.0f && arrowUnit[i5].moveRotateDegree < 360.0f)) {
                    arrowUnit[i5].startY = (int) (r7.startY - (abs5 * i4));
                } else {
                    arrowUnit[i5].startY = (int) (r7.startY + (abs5 * i4));
                }
                break;
            break;
            case 35:
                arrowUnit[i5].moveSpeed = 7000;
                arrowUnit[i5].moveRotateDegree = 195.0f;
                float abs7 = Math.abs(((float) Math.cos(Math.toRadians(arrowUnit[i5].moveRotateDegree))) * arrowUnit[i5].moveSpeed);
                float abs8 = Math.abs(((float) Math.sin(Math.toRadians(arrowUnit[i5].moveRotateDegree))) * arrowUnit[i5].moveSpeed);
                if (arrowUnit[i5].moveRotateDegree >= 0.0f && arrowUnit[i5].moveRotateDegree < 180.0f) {
                    arrowUnit[i5].startX = (int) (r2.startX + (abs8 * i4));
                } else {
                    arrowUnit[i5].startX = (int) (r2.startX - (abs8 * i4));
                }
                if ((arrowUnit[i5].moveRotateDegree >= 0.0f && arrowUnit[i5].moveRotateDegree < 90.0f) || (arrowUnit[i5].moveRotateDegree >= 270.0f && arrowUnit[i5].moveRotateDegree < 360.0f)) {
                    arrowUnit[i5].startY = (int) (r7.startY - (abs7 * i4));
                } else {
                    arrowUnit[i5].startY = (int) (r7.startY + (abs7 * i4));
                }
                break;
            break;
        }
        return i5;
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

    public static int checkTowerUnit() {
        CGPoint firstLastActionTouch = TouchManager.getFirstLastActionTouch();
        if (firstLastActionTouch.x >= 62.0f && firstLastActionTouch.y >= 30.0f && firstLastActionTouch.x < 737.0f && firstLastActionTouch.y < 480.0f) {
            int i = (int) ((firstLastActionTouch.x - 62.0f) / 45.0f);
            int i2 = (int) ((firstLastActionTouch.y - 30.0f) / 45.0f);
            for (int i3 = 0; i3 < towerUnitCount; i3++) {
                if (towerUnit[i3].towerType != -1 && towerUnit[i3].blockX == i && towerUnit[i3].blockY == i2) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static int searchEnemyTouch() {
        CGPoint firstLastActionTouch = TouchManager.getFirstLastActionTouch();
        for (int i = 0; i < monsterUnitCount; i++) {
            if (monsterUnit[i].type != -1 && firstLastActionTouch.x >= ((float) (((monsterUnit[i].posX / 50) + 62) - 20)) && firstLastActionTouch.y >= ((float) (((monsterUnit[i].posY / 50) + 30) - 30)) && firstLastActionTouch.x < (monsterUnit[i].posX / 50) + 62 + 40 && firstLastActionTouch.y < (monsterUnit[i].posY / 50) + 30 + 40) {
                return i;
            }
        }
        return -1;
    }

    public static int searchObjectTouch() {
        CGPoint firstLastActionTouch = TouchManager.getFirstLastActionTouch();
        int i = (int) ((firstLastActionTouch.x - 62.0f) / 45.0f);
        int i2 = (int) ((firstLastActionTouch.y - 30.0f) / 45.0f);
        for (int i3 = 0; i3 < objectUnitCount; i3++) {
            if (objectUnit[i3].type != -1 && objectUnit[i3].type != -2 && objectUnit[i3].destroyEnableFlag == 0) {
                int i4 = objectUnit[i3].blockSize;
                if (i4 == 0) {
                    int i5 = (objectUnit[i3].posX / 50) / 45;
                    int i6 = (objectUnit[i3].posY / 50) / 45;
                    if (i == i5 && i2 == i6) {
                        return i3;
                    }
                } else if (i4 == 1) {
                    int i7 = (objectUnit[i3].posX / 50) / 45;
                    int i8 = (objectUnit[i3].posY / 50) / 45;
                    int i9 = i8 - 1;
                    if (i == i7 && i2 >= i9 && i2 <= i8) {
                        return i3;
                    }
                } else if (i4 == 2) {
                    int i10 = (objectUnit[i3].posX / 50) / 45;
                    int i11 = (objectUnit[i3].posY / 50) / 45;
                    int i12 = i11 - 1;
                    if (i >= i10 - 1 && i <= i10 && i2 >= i12 && i2 <= i11) {
                        return i3;
                    }
                } else if (i4 == 3) {
                    int i13 = (objectUnit[i3].posX / 50) / 45;
                    int i14 = ((objectUnit[i3].posY / 50) / 45) - 1;
                    int i15 = i13 + 1;
                    int i16 = i14 + 2;
                    if (i >= i13 && i <= i15 && i2 >= i14 && i2 <= i16) {
                        return i3;
                    }
                } else if (i4 == 4) {
                    int i17 = ((objectUnit[i3].posX / 50) / 45) - 1;
                    int i18 = ((objectUnit[i3].posY / 50) / 45) - 1;
                    int i19 = i17 + 1;
                    int i20 = i18 + 2;
                    if (i >= i17 && i <= i19 && i2 >= i18 && i2 <= i20) {
                        return i3;
                    }
                } else if (i4 != 5) {
                    continue;
                } else {
                    int i21 = ((objectUnit[i3].posX / 50) / 45) - 1;
                    int i22 = ((objectUnit[i3].posY / 50) / 45) - 1;
                    int i23 = i21 + 2;
                    int i24 = i22 + 1;
                    if (i >= i21 && i <= i23 && i2 >= i22 && i2 <= i24) {
                        return i3;
                    }
                }
            }
        }
        return -1;
    }

    public static int getUpgradeUnitRate(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < 18; i4++) {
            if ((DataUpgradeUnit.upgradeUnitData[i4][5] == i || DataUpgradeUnit.upgradeUnitData[i4][5] == 0) && DataUpgradeUnit.upgradeUnitData[i4][4] == i2) {
                i3 += upgradeUnitValue[i4] * DataUpgradeUnit.upgradeUnitData[i4][0];
            }
        }
        return i3;
    }

    public static int getUpgradeItemRate(int i, int i2) {
        if (i < 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            if (heroItemType[i][i4] != -1) {
                int i5 = heroItemType[i][i4];
                if (DataUpgradeItem.upgradeItemData[i5][5] == i2) {
                    i3 += DataUpgradeItem.upgradeItemData[i5][2];
                }
            }
        }
        return i3;
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
