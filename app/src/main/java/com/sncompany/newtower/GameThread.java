package com.sncompany.newtower;

import android.media.AudioManager;
import android.media.SoundPool;
import android.util.Log;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;

import com.sncompany.newtower.Battle.ArrowUnit;
import com.sncompany.newtower.Battle.EffectUnit;
import com.sncompany.newtower.Battle.HeroUnit;
import com.sncompany.newtower.Battle.MonsterUnit;
import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.DataHero;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.DataClasses.DataUpgradeHero;
import com.sncompany.newtower.DataClasses.DataUpgradeItem;
import com.sncompany.newtower.DataClasses.DataUpgradeUnit;
import com.sncompany.newtower.Battle.ObjectUnit;
import com.sncompany.newtower.Battle.TowerUnit;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: D:\decomp\classes.dex */
public class GameThread extends Thread {
    public static final int GAME_PLAY2_IMAGE_LOAD = 1005;
    public static final int SAVEFILE_SIZE = 27392;
    public static final int SPECIAL_ATTACK_ARROW_LEG_POS_X = 403;
    public static final int SPECIAL_ATTACK_ARROW_LEG_POS_Y = 558;
    public static final int SPECIAL_ATTACK_ARROW_UNIT_START_FRAME = 165;
    public static ArrowUnit[] arrowUnit;
    public static int arrowUnitCount;
    public static int[] awardDataFlag;
    public static int[] awardDataValue;
    public static final MediaManager[] bgmMedia = new MediaManager[3];
    public static boolean characterAddBoolean;
    public static boolean characterAddHeroFlag;
    public static int characterAddNumber;
    public static int characterAddOrder;
    public static float characterAddPosX;
    public static float characterAddPosY;
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
    public static final MediaManager2 effectMedia = new MediaManager2(31);
    public static EffectUnit[] effectUnit;
    public static int effectUnitCount;

    public static int gameHelpViewNum;
    public static int gameLoadFlag;
    public static int[][] gamePlayedCount;
    public static int gameStatus;
    public static int gameSubStatus;
    public static int gameTitleViewCount;
    public static int[][] heroItemType;
    public static int[] heroUnitType;
    public static int[][] heroUpgradeValue;
    public static int[][] highScoreValue;
    public static int[] itemUnitValue;
    public static int lastDrawCount;
    public static int lastFrameCount;
    public static int limitCashBuyCount;
    public static int loadTipNumber;
    public static int loadingStatus;
    public static boolean m_bStop;
    public static int mapAttackType;
    public static final int[] mapEndDirection = new int[10];
    public static final int[][] mapEndPosition = new int[10][2];
    public static int mapNumber;
    public static final int[][] mapTileData = new int[15][10];
    public static int maxLife;
    public static AudioManager mgr;
    public static int monsterOpenTime;
    public static boolean monsterSortCheckFlag;
    public static int monsterSortDrawCount;
    public static MonsterUnit[] monsterSortUnit;
    public static final MonsterUnit[] monsterUnit = new MonsterUnit[100];
    public static int monsterUnitCount;
    public static int myHeroism;
    public static int myLife;
    public static int myMana;
    public static int myMoney;
    public static final MyOscillator[] myOscillator = new MyOscillator[20];
    public static int myScore;
    public static MyScrollbar[] myScrollbar;
    public static int myWave;
    public static boolean myWaveRunFlag;
    public static NewTower newTower;
    public static boolean objectSortCheckFlag;
    public static int objectSortDrawCount;
    public static ObjectUnit[] objectSortUnit;
    public static ObjectUnit[] objectUnit;
    public static int objectUnitCount;
    public static boolean pauseFlag;
    public static long playTimeCurrentValue;
    public static long playTimeStartValue;
    public static int playTimeTotalValue;
    public static int randomNumber;
    public static int realDrawCount;
    public static int[] rewardDataValue;
    public static boolean rewardShowFlag;
    public static int rewardShowOrder;
    static byte[] saveTotalBuffer;
    public static int[] shopUnitValue;
    public static final boolean soundFlag = true;
    public static final boolean[] soundPlayCheckFlag = new boolean[31];
    public static int[] soundPlayDelayCount = new int[31];
    public static HashMap<Integer, Integer> soundPoolMap;
    public static int specialAttackFrameCount;
    public static boolean specialAttackSkipFlag;
    public static int[][] specialDataValue;
    public static int stageClearViewHeroism;
    public static int stageSelectChapterNumber;
    public static int stageSelectStageNumber;
    public static long startDate;
    public static long startDrawDate;
    public static int tempCharacterRangeViewNumber;
    public static boolean towerSortCheckFlag;
    public static int towerSortDrawCount;
    public static TowerUnit[] towerSortUnit;
    public static TowerUnit[] towerUnit;
    public static int towerUnitCount;
    public static int turboFlag;
    public static int[] tutorialBoxTouchFlag;
    public static int tutorialFlag;
    public static int tutorialViewCount;
    public static final int[] upgradeUnitValue = new int[18];
    public static int[][] waveMobData;
    public static int[] waveMonsterRemainCount;
    public static int[] waveMonsterShowCurrent;
    public static int[] waveMonsterShowTime;
    public static int[] waveMonsterType;
    public static int wavePattern;
    public static int gameTimeCount = 0;
    public static final String[] chapterName = {"Dark Forest", "Swamp of Despair", "Eternal Wasteland", "Infernal Volcano", "Nightmarish Demon World"};
    public static int shopShopChapterSelectPos = 0;
    public static int shopShopItemSelectPos = 0;
    public static int shopShopInventorySelectPos = 0;
    public static int TOWER_MAX_LEVEL_NORMAL = 3;
    public static int TOWER_MAX_LEVEL_HERO = 5;
    public static int WAVE_MAX_COUNT = 60;
    public static final int[][] tutorialUnitPos = {new int[]{2, 7, 0, 177, 111, 770, 111, 177, 367}, new int[]{4, 7, 1, 266, 171, 770, 176, 266, 367}, new int[]{6, 7, 2, 356, 231, 770, 241, 356, 367}, new int[]{8, 7, 3, 444, 289, 770, 306, 444, 367}, new int[]{10, 7, 4, 536, 349, 770, 371, 536, 367}, new int[]{12, 7, 5, 627, 374, 770, 436, 627, 367}, new int[]{7, 7, 6, 402, 77, 580, 40, 402, 367}};
    public static final int[][] tutorialBoxLinePos = {new int[]{78, 30, 6, 203, 33, 233, 257, 81}, new int[]{194, 30, 6, 114, 127, 145, 257, 81}, new int[]{340, 30, 6, 27, 265, 57, 257, 81}, new int[]{47, 408, 12, 6, 59, 338, 371, 134}, new int[]{723, 404, 14, 6, 465, 365, 257, 81}, new int[]{125, 127, 6, 115, 58, 242, 271, 81}, new int[]{663, 153, 6, 89, 452, 242, 271, 81}, new int[]{568, 114, 60, 6, 297, 76, 271, 81}, new int[]{0, 0, 0, 0, 144, 70, 512, 226}, new int[]{0, 0, 0, 0, 150, 70, 226, 226}, new int[]{0, 0, 0, 0, 144, 70, 512, 226}, new int[]{0, 0, 0, 0, 240, 70, 226, 226}, new int[]{0, 0, 0, 0, 144, 70, 512, 226}, new int[]{0, 0, 0, 0, 330, 70, 226, 226}, new int[]{0, 0, 0, 0, 179, 70, 442, 226}, new int[]{0, 0, 0, 0, 89, 174, 348, 230}, new int[]{0, 0, 0, 0, 323, 176, 350, 226}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}};
    public static final int[][] tutorialRectPos = {new int[]{737, 4, 60, 457}, new int[]{3, 336, 46, 140}, new int[]{190, 115, 152, 57}, new int[]{416, 115, 152, 57}};

    /**
     * Contains all the dialog for reward attaining.
     */
    static final String[] rewardDataString = {
            "You've acquired a Hero.", "Hero: Champion acquired.", "Check for more info under the Item> Equipment menu.",
            "Hero Points obtained.", "You obtained 1,500 Hero Points.", " ",
            "You've acquired a Hero.", "Hero: Bow Master acquired.", "Check for more info under the Item> Equipment menu.",
            "You acquired special skills.", "You can now use the special skill for all of your Heroes.", "Select a Hero character while playing.",
            "You've acquired a Hero.", "Hero: Archmage acquired.", "Check for more info under the Item> Equipment menu.",
            "The upgrade limit is now uncapped.", "The upgrade limit of your Hero units has increased.(+5)", " ",
            "A Hero's normal attack has been upgraded.", "All of your Heroes now cause a special effect with their Normal attacks.", " ",
            "Hero Points obtained.", "You obtained 2,000 Hero Points.", " ",
            "You obtained a Hero item.", "You obtained a Zephyrus Amulet.", " ",
            "Hero Points obtained.", "You obtained 3,500 Hero Points.", " "
    };
    static final String[] TIP_TEXT = {"Tip 1  : Equip the item on your Hero under the [Item] > [Equipment] menu.", "Tip 2  : Clear stages and acquire up to 3 Heroes.", "Tip 3  : Certain stages reward you with a Hero character.", "Tip 4  : Use Mana to increase the levels of your Heroes.", "Tip 5  : Heroes consume Mana to use their special skills.", "Tip 6  : Special skills have a downtime after each use.", "Tip 7  : Clear a stage to receive Hero Points.", "Tip 8  : Configure your game settings under the [Title Screen] > Settings.", "Tip 9  : Basic units can be upgraded up to Level 3.", "Tip 10 : Hero units can be upgraded up to Level 5.", "Tip 11 : Upgrade your units to give them stronger abilities.", "Tip 12 : Use gold to advance your units to higher classes or increase their levels.", "Tip 13 : Increase the level of your units to improve their combat capabilities.", "Tip 14 : Advance your units to higher classes for more versatile abilities. ", "Tip 15 : Reselling a unit returns to you a portion _ of the money that you spent to hire the unit.", "Tip 16 : You will fail a Boss stage if you fail to defeat the bosses.", "Tip 17 : Boss monsters have high HP, but they move slowly.", "Tip 18 : Monsters drop gold and mana upon death.", "Tip 19 : Use Hero Points to buy items under [Item] > [Shop].", "Tip 20 : Use Hero Points to upgrade your Hero and basic units under the [Skill] menu.", "Tip 21 : Knights, the 2nd advanced class of Warrior, _ have high Attack Speed.", "Tip 22 : Warlords, the 3rd advanced class of Warrior, _ inflict Splashed damage to multiple enemies.", "Tip 23 : Special Warrior Brandishers attack monsters with a chance of causing Stun.", "Tip 24 : Splatters, the 2nd advanced class of Archer, _ shoot multi arrows and attack up to 3 enemies at the same time.", "Tip 25 : Sky Arrows, the 3rd advanced class of Archer, _ strike enemies with their extremely Long Attack Range.", "Tip 26 : Special Archer Holy Eyes specialize in DoT (Damage over Time) attacks.", "Tip 27 : Sorceresses, the 2nd advanced class of Wizard, inflict Piercing damage.", "Tip 28 : Blasters, the 3rd advanced class of Wizard, _ inflict Splashed damage with their Fire magic.", "Tip 29 : Special Wizard Ice Mages attack monsters with a chance of causing Slow.", "Tip 30 : Clear all the normal stages to unlock two special modes: _ Destroy the Moon and Infinite.", "Tip 31 : A stage's Infinite Mode is only opened _ when you clear it with a perfect score.", "Tip 32 : The objective of Destroy the Moon is to destroy _ the monster gates where monsters spawn.", "Tip 33 : Destroy stage objects to obtain gold and mana.", "Tip 34 : When clearing a normal stage more than twice,_ you will receive only 70% of the Hero Point reward from the stage.", "Tip 35 : Touch a monster or object to manually attack it.", "Tip 36 : Blasters, the 3rd advanced class of Wizard, _ inflict Splashed damage with their Fire magic.", "Tip 37 : Special Wizard Ice Mages attack monsters with a chance of causing Slow.", "Tip 38 : You will receive a Hero unit or additional ability _each time you clear 5 stages.", "Tip 39 : Clear 25 stages to upgrade your units up to 10 levels.", "Tip 40 : Clear 5 stages to unlock the special skill of your Hero units.", "Tip 41 : Clear 30 stages to unlock the special attack ability _of your Hero units. (Splashed damage or Double Shot)", "Tip 42 : Never hesitate to upgrade your Heroes and basic units _ when facing a difficult stage.", "Tip 43 : Certain stages contain special items for you to discover.", "Tip 43 : Cash items endow special abilities."};
    public static boolean[] cheatData = new boolean[5];

    public static int getAttackSpeed(int i) {
        int i2 = Math.max(0,60 - i);
        return (i2 * 5) + 70;
    }

    public static int getLevelupHeroType(int i) {
        if (i < 0 || i % 5 == 4)
            return -1;
        return i + 1;
    }

    public static int getLevelupType(int i) {
        if (i < 0 || i % 3 == 2)
            return -1;
        return i + 1;
    }

    public GameThread(NewTower nt) {
        newTower = nt;
        m_bStop = false;
        pauseFlag = false;
        saveTotalBuffer = new byte[SAVEFILE_SIZE];
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

            for (int i2 = 0; i2 < myOscillator.length; i2++)
                myOscillator[i2] = new MyOscillator(0, 100, 10);

            myScrollbar[4] = new MyScrollbar(90, GameRenderer.GAME_SHOP_SHOP_SIDEBAR_END_Y, 0, 1820); //Used at Shop, for ???

            waveMonsterType = new int[2];
            waveMonsterRemainCount = new int[2];
            waveMonsterShowTime = new int[2];
            waveMonsterShowCurrent = new int[2];
            specialDataValue = (int[][]) Array.newInstance(int.class, 20, 4);

            heroItemType = (int[][]) Array.newInstance(int.class, 3, 2);
            heroUpgradeValue = (int[][]) Array.newInstance(int.class, 3, 6);
            itemUnitValue = new int[24];
            shopUnitValue = new int[30];

            for (int i12 = 0; i12 < 30; i12++) {
                shopUnitValue[i12] = -1;
            }
            for (int i13 = 0; i13 < 24; i13++) {
                itemUnitValue[i13] = -1;
            }
            waveMobData = (int[][]) Array.newInstance(int.class, WAVE_MAX_COUNT, 8);

            tutorialBoxTouchFlag = new int[22];

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

    public static void clearMonsterUnit() {
        for (int i = 0; i < 100; i++) {
            monsterUnit[i].monsterType = -1;
        }
        monsterUnitCount = 0;
    }

    public static void clearTowerUnit() {
        for (int i = 0; i < 150; i++) {
            towerUnit[i].towerType = -1;
        }
        towerUnitCount = 0;
    }

    public static void clearObjectUnit() {
        for (int i = 0; i < 100; i++) {
            objectUnit[i].objectType = -1;
        }
        objectUnitCount = 0;
    }

    public static int getUpgradeType(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = DataCharacter.charData[i][12];
        if (i2 == 0) {
            return 6;
        }
        if (i2 == 2) {
            return 9;
        }
        if (i2 == 4) {
            return 18;
        }
        if (i2 == 6) {
            return 21;
        }
        if (i2 != 8) {
            return i2 != 10 ? -1 : 33;
        }
        return 30;
    }

    public static int getDowngradeType(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = DataCharacter.charData[i][12];
        if (i2 == 2) {
            return 0;
        }
        if (i2 == 3) {
            return 6;
        }
        if (i2 == 6) {
            return 12;
        }
        if (i2 == 7) {
            return 18;
        }
        if (i2 != 10) {
            return i2 != 11 ? -1 : 30;
        }
        return 24;
    }

    public static void levelUpUnit(int i) {
        int levelupType;
        if (i < 0) {
            return;
        }
        int i2 = towerUnit[i].towerType;
        if (towerUnit[i].heroFlag == 1) {
            levelupType = getLevelupHeroType(i2);
        } else {
            levelupType = getLevelupType(i2);
        }
        if (levelupType == -1) {
            return;
        }
        int i3 = towerUnit[i].heroFlag;
        if (i3 == 0) {
            myMoney -= getLevelupPrice(i2);
        } else if (i3 == 1) {
            myMana -= getLevelupHeroPrice(i2, towerUnit[i].heroOrder);
        }
        towerUnit[i].towerType = levelupType;
        int i4 = towerUnit[i].heroFlag;
        if (i4 != 0) {
            if (i4 == 1) {
                if (levelupType == 4) {
                    int[] iArr = awardDataValue;
                    iArr[45] = iArr[45] + 1;
                    iArr[24] = iArr[24] + 1;
                    recheckAwardData();
                } else if (levelupType == 9) {
                    int[] iArr2 = awardDataValue;
                    iArr2[46] = iArr2[46] + 1;
                    iArr2[24] = iArr2[24] + 1;
                    recheckAwardData();
                } else if (levelupType == 14) {
                    int[] iArr3 = awardDataValue;
                    iArr3[47] = iArr3[47] + 1;
                    iArr3[24] = iArr3[24] + 1;
                    recheckAwardData();
                }
            }
        } else if (levelupType == 5) {
            int[] iArr4 = awardDataValue;
            iArr4[42] = iArr4[42] + 1;
            recheckAwardData();
        } else if (levelupType == 11) {
            int[] iArr5 = awardDataValue;
            iArr5[39] = iArr5[39] + 1;
            recheckAwardData();
        } else if (levelupType == 17) {
            int[] iArr6 = awardDataValue;
            iArr6[43] = iArr6[43] + 1;
            recheckAwardData();
        } else if (levelupType == 23) {
            int[] iArr7 = awardDataValue;
            iArr7[40] = iArr7[40] + 1;
            recheckAwardData();
        } else if (levelupType == 29) {
            int[] iArr8 = awardDataValue;
            iArr8[44] = iArr8[44] + 1;
            recheckAwardData();
        } else if (levelupType == 35) {
            int[] iArr9 = awardDataValue;
            iArr9[41] = iArr9[41] + 1;
            recheckAwardData();
        }
        towerUnit[i].restatTowerUnit();
        addEffectUnit(14, towerUnit[i].posX, towerUnit[i].posY, true);
        playSound(13);
        GameRenderer.levelUpCount = 10;
    }

    public static void upgradeUnit(int i) {
        int upgradeType;
        int upgradePrice;
        int i2;
        if (i >= 0 && (upgradeType = getUpgradeType(towerUnit[i].towerType)) != -1 && (i2 = myMoney) >= (upgradePrice = getUpgradePrice(towerUnit[i].towerType, towerUnit[i].heroFlag))) {
            myMoney = i2 - upgradePrice;
            towerUnit[i].towerType = upgradeType;
            towerUnit[i].restatTowerUnit();
            addEffectUnit(14, towerUnit[i].posX, towerUnit[i].posY, true);
            playSound(13);
            GameRenderer.upgradeCount = 10;
        }
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

    public static int getHeroBuyPrice(int i) {
        int i2;
        if (i == -1 || (i2 = heroUnitType[i]) == -1) {
            return 0;
        }
        int i3 = DataHero.heroData[i2][0];
        return i3 + ((getUpgradeHeroRate(i, 6) * i3) / 100);
    }

    public static int getUpgradePrice(int i, int i2) {
        if (i == -1 || i2 == 1)
            return 0;

        return DataCharacter.charData[i][1] + ((DataCharacter.charData[i][1] * getUpgradeUnitRate(0, 5)) / 100);
    }

    public static int getLevelupPrice(int i) {
        int levelupType = getLevelupType(i);
        if (levelupType == -1)
            return 0;

        return DataCharacter.charData[levelupType][0];
    }

    public static int getLevelupHeroPrice(int i, int i2) {
        int levelupHeroType = getLevelupHeroType(i);
        if (levelupHeroType == -1) {
            return 0;
        }
        int i3 = DataHero.heroData[levelupHeroType][0];
        return i3 + ((getUpgradeItemRate(i2, 1) * i3) / 100);
    }

    public static int getUpgradeUnitMax(int i) {
        if (rewardDataValue[5] == 1) {
            return DataUpgradeUnit.upgradeUnitData[i][3] + (limitCashBuyCount * 5);
        }
        return (limitCashBuyCount * 5) + 5;
    }

    public static int getUpgradeHeroMax(int i, int i2) {
        if (rewardDataValue[5] == 1) {
            return DataUpgradeHero.upgradeHeroData[i2][3];
        }
        return 5;
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
        if (!cheatData[4]) {
            myMana -= towerUnit[i].specialMana;
        }
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
                return;
            default:
                return;
        }
    }

    public static void sellTowerUnit(int i) {
        if (towerUnit[i].towerType == -1 || towerUnit[i].heroFlag == 1) {
            return;
        }
        int sellPrice = myMoney + getSellPrice(towerUnit[i].towerType);
        myMoney = sellPrice;
        int[] iArr = awardDataValue;
        if (sellPrice >= iArr[21]) {
            iArr[21] = sellPrice;
            recheckAwardData();
        }
        towerUnit[i].towerType = -1;
        towerUnit[i].unitStatus = 2;
        for (int i2 = 0; i2 < arrowUnitCount; i2++) {
            if (arrowUnit[i2].arrowType != -1 && arrowUnit[i2].shootNumber == i) {
                arrowUnit[i2].arrowType = -1;
            }
        }
    }

    public static void clearEffectUnit() {
        for (int i = 0; i < 200; i++) {
            effectUnit[i].effectType = -1;
        }
        effectUnitCount = 0;
    }

    public static void clearArrowUnit() {
        for (int i = 0; i < 200; i++)
            arrowUnit[i].arrowType = -1;
        arrowUnitCount = 0;
    }

    public static void clearSpecialArrowUnit() {
        for (int i = 0; i < arrowUnitCount; i++) {
            if (arrowUnit[i].arrowType >= 15 && arrowUnit[i].arrowType <= 35)
                arrowUnit[i].arrowType = -1;
        }
    }

    public static int addSpecialArrowUnit(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        if (z) {
            i5 = 0;
            while (i5 < arrowUnitCount) {
                if (arrowUnit[i5].arrowType == -1) {
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
        arrowUnit[i5].arrowType = i;
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
            if (objectUnit[i4].objectType != -1 && objectUnit[i4].objectType != -2) {
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
            if (monsterUnit[i].monsterType != -1 && firstLastActionTouch.x >= ((float) (((monsterUnit[i].posX / 50) + 62) - 20)) && firstLastActionTouch.y >= ((float) (((monsterUnit[i].posY / 50) + 30) - 30)) && firstLastActionTouch.x < (monsterUnit[i].posX / 50) + 62 + 40 && firstLastActionTouch.y < (monsterUnit[i].posY / 50) + 30 + 40) {
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
            if (objectUnit[i3].objectType != -1 && objectUnit[i3].objectType != -2 && objectUnit[i3].destroyEnableFlag == 0) {
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

    public static void rewindTowerEnemyUnit() {
        monsterSortDrawCount = 0;
        towerSortDrawCount = 0;
        objectSortDrawCount = 0;
        monsterSortCheckFlag = true;
        towerSortCheckFlag = true;
        objectSortCheckFlag = true;
    }

    public static int getNextDrawObject() {
        int i;
        int i2 = objectSortDrawCount;
        int i3 = -1;
        if (i2 >= objectUnitCount || objectSortUnit[i2].objectType == -1) {
            objectSortCheckFlag = false;
        }
        int i4 = monsterSortDrawCount;
        if (i4 >= monsterUnitCount || monsterSortUnit[i4].monsterType == -1) {
            monsterSortCheckFlag = false;
        }
        int i5 = towerSortDrawCount;
        if (i5 >= towerUnitCount || towerSortUnit[i5].towerType == -1) {
            towerSortCheckFlag = false;
        }
        if (objectSortCheckFlag) {
            i = objectSortUnit[objectSortDrawCount].posY;
            i3 = 2;
        } else if (monsterSortCheckFlag) {
            i = monsterSortUnit[monsterSortDrawCount].posY;
            i3 = 0;
        } else {
            if (towerSortCheckFlag) {
                i = towerSortUnit[towerSortDrawCount].posY;
                i3 = 1;
            }
            return i3;
        }
        for (int i6 = i3 + 1; i6 < 3; i6++) {
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2 && objectSortCheckFlag && i > objectSortUnit[objectSortDrawCount].posY) {
                        i = objectSortUnit[objectSortDrawCount].posY;
                        i3 = 2;
                    }
                } else if (towerSortCheckFlag && i > towerSortUnit[towerSortDrawCount].posY) {
                    i = towerSortUnit[towerSortDrawCount].posY;
                    i3 = 1;
                }
            } else if (monsterSortCheckFlag && i > monsterSortUnit[monsterSortDrawCount].posY) {
                i = monsterSortUnit[monsterSortDrawCount].posY;
                i3 = 0;
            }
        }
        return i3;
    }

    public static boolean checkEnableBuyUnit(int i) {
        return myMoney >= getBuyPrice(i);
    }

    public static boolean checkEnableHeroBuyUnit(int i) {
        for (int i2 = 0; i2 < towerUnitCount; i2++) {
            if (towerUnit[i2].towerType != -1 && towerUnit[i2].heroFlag == 1 && towerUnit[i2].heroOrder == i) {
                return false;
            }
        }
        return myMana >= getHeroBuyPrice(i);
    }

    public static void getAddSettingPosition() {
        CGPoint firstLastActionTouch = TouchManager.getFirstLastActionTouch();
        if (firstLastActionTouch.x < 62.0f || firstLastActionTouch.y - 25.0f < 30.0f || firstLastActionTouch.x >= 737.0f || firstLastActionTouch.y - 25.0f >= 480.0f) {
            characterAddBoolean = false;
            characterAddPosX = firstLastActionTouch.x;
            characterAddPosY = firstLastActionTouch.y - 25.0f;
            return;
        }
        int i = (int) ((firstLastActionTouch.x - 62.0f) / 45.0f);
        int i2 = (int) (((firstLastActionTouch.y - 25.0f) - 30.0f) / 45.0f);
        characterAddPosX = (i * 45) + 62 + 22;
        characterAddPosY = (i2 * 45) + 30 + 22;
        if (mapTileData[i][i2] != -1) {
            characterAddBoolean = false;
            return;
        }
        for (int i3 = 0; i3 < towerUnitCount; i3++) {
            if (towerUnit[i3].towerType != -1 && towerUnit[i3].blockX == i && towerUnit[i3].blockY == i2) {
                characterAddBoolean = false;
                return;
            }
        }
        for (int i4 = 0; i4 < objectUnitCount; i4++) {
            if (objectUnit[i4].objectType != -1 && objectUnit[i4].objectType != -2) {
                int i5 = objectUnit[i4].blockSize;
                if (i5 == 0) {
                    int i6 = (objectUnit[i4].posX / 50) / 45;
                    int i7 = (objectUnit[i4].posY / 50) / 45;
                    if (i == i6 && i2 == i7) {
                        characterAddBoolean = false;
                        return;
                    }
                } else if (i5 == 1) {
                    int i8 = (objectUnit[i4].posX / 50) / 45;
                    int i9 = (objectUnit[i4].posY / 50) / 45;
                    int i10 = i9 - 1;
                    if (i == i8 && i2 >= i10 && i2 <= i9) {
                        characterAddBoolean = false;
                        return;
                    }
                } else if (i5 == 2) {
                    int i11 = (objectUnit[i4].posX / 50) / 45;
                    int i12 = (objectUnit[i4].posY / 50) / 45;
                    int i13 = i12 - 1;
                    if (i >= i11 - 1 && i <= i11 && i2 >= i13 && i2 <= i12) {
                        characterAddBoolean = false;
                        return;
                    }
                } else if (i5 == 3) {
                    int i14 = (objectUnit[i4].posX / 50) / 45;
                    int i15 = ((objectUnit[i4].posY / 50) / 45) - 1;
                    int i16 = i14 + 1;
                    int i17 = i15 + 2;
                    if (i >= i14 && i <= i16 && i2 >= i15 && i2 <= i17) {
                        characterAddBoolean = false;
                        return;
                    }
                } else if (i5 == 4) {
                    int i18 = ((objectUnit[i4].posX / 50) / 45) - 1;
                    int i19 = ((objectUnit[i4].posY / 50) / 45) - 1;
                    int i20 = i18 + 1;
                    int i21 = i19 + 2;
                    if (i >= i18 && i <= i20 && i2 >= i19 && i2 <= i21) {
                        characterAddBoolean = false;
                        return;
                    }
                } else if (i5 != 5) {
                    continue;
                } else {
                    int i22 = ((objectUnit[i4].posX / 50) / 45) - 1;
                    int i23 = ((objectUnit[i4].posY / 50) / 45) - 1;
                    int i24 = i22 + 2;
                    int i25 = i23 + 1;
                    if (i >= i22 && i <= i24 && i2 >= i23 && i2 <= i25) {
                        characterAddBoolean = false;
                        return;
                    }
                }
            }
        }
        characterAddBoolean = true;
    }

    public static boolean checkInvenEmpty() {
        for (int i = 0; i < 24; i++) {
            if (itemUnitValue[i] == -1) {
                return true;
            }
        }
        return false;
    }

    public static void getItem(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= 24) {
                i3 = -1;
                break;
            } else if (itemUnitValue[i3] == -1) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return;
        }
        itemUnitValue[i3] = i;
        while (i2 < 23) {
            int i4 = i2 + 1;
            for (int i5 = i4; i5 < 24; i5++) {
                int[] iArr = itemUnitValue;
                if (iArr[i2] == -1 || (iArr[i5] != -1 && iArr[i2] > iArr[i5])) {
                    int[] iArr2 = itemUnitValue;
                    int i6 = iArr2[i5];
                    iArr2[i5] = iArr2[i2];
                    iArr2[i2] = i6;
                }
            }
            i2 = i4;
        }
    }

    public static int getSoundHitType(TowerUnit tu) {
        if (tu instanceof HeroUnit)
            return 1 + (tu.type * 3);
        return switch (tu.type) {
            case 0, 2, 3 -> 1; //Warrior, Knight, Warlord
            case 1 -> 2; //Brandisher
            case 4, 6, 7 -> 3; //Archer, Sharpshooter, Sky Arrow
            case 5 -> 4; //Holy Eye
            case 8 -> 5; //Mage
            case 9 -> 7; //IceMage
            case 10, 11 -> 6; //Sorceress, Blaster
            default -> -1;
        };
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

    public static int getUpgradeHeroRate(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < 6; i4++) {
            if (DataUpgradeHero.upgradeHeroData[i4][4] == i2) {
                i3 += heroUpgradeValue[i][i4] * DataUpgradeHero.upgradeHeroData[i4][0];
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
            int[][] iArr = heroItemType;
            if (iArr[i][i4] != -1) {
                int i5 = iArr[i][i4];
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
        if (soundPlayCheckFlag == null) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < 31; i2++) {
            int[] iArr = soundPlayDelayCount;
            iArr[i2] = iArr[i2] + 1;
            boolean[] zArr = soundPlayCheckFlag;
            if (zArr[i2]) {
                if (iArr[i2] >= 12) {
                    if (soundFlag) {
                        try {
                            effectMedia.setVolume(i2, Config.effectVolume, Config.musicMaxVolume);
                            effectMedia.play(i2);
                            i++;
                        } catch (Exception ignored) {
                        }
                    }
                    soundPlayCheckFlag[i2] = false;
                    soundPlayDelayCount[i2] = 0;
                } else {
                    zArr[i2] = false;
                }
            }
            if (i >= 5) {
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

    public static void recheckAwardData() {
        int i23 = 0;
        boolean z14 = true;
        for (int i24 = 3; i23 < i24; i24 = 3) {
            int i25 = 0;
            while (true) {
                if (i25 >= 2) {
                    break;
                }
                if (heroItemType[i23][i25] == -1) {
                    z14 = false;
                    break;
                }
                i25++;
            }
            if (!z14) {
                break;
            }
            i23++;
        }
        if (z14) {
            awardDataFlag[20] = 1;
        }
        if (awardDataValue[24] >= 1) {
            awardDataFlag[24] = 1;
        }
        if (awardDataValue[39] >= 1) {
            awardDataFlag[39] = 1;
        }
        if (awardDataValue[40] >= 1) {
            awardDataFlag[40] = 1;
        }
        if (awardDataValue[41] >= 1) {
            awardDataFlag[41] = 1;
        }
        if (awardDataValue[42] >= 1) {
            awardDataFlag[42] = 1;
        }
        if (awardDataValue[43] >= 1) {
            awardDataFlag[43] = 1;
        }
        if (awardDataValue[44] >= 1) {
            awardDataFlag[44] = 1;
        }
        if (awardDataValue[45] >= 1) {
            awardDataFlag[45] = 1;
        }
        if (awardDataValue[46] >= 1) {
            awardDataFlag[46] = 1;
        }
        if (awardDataValue[47] >= 1) {
            awardDataFlag[47] = 1;
        }
        if (awardDataValue[48] >= 1) {
            awardDataFlag[48] = 1;
        }
        if (awardDataValue[49] >= 1) {
            awardDataFlag[49] = 1;
        }
        if (awardDataValue[50] >= 1) {
            awardDataFlag[50] = 1;
        }
        if (gamePlayedCount[4][0] > 0) {
            awardDataFlag[51] = 1;
        }
        if (awardDataValue[52] >= 1) {
            awardDataFlag[52] = 1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        playTimeCurrentValue = currentTimeMillis;
        playTimeTotalValue = playTimeTotalValue + ((int) ((currentTimeMillis - playTimeStartValue) / 1000));
        playTimeStartValue = currentTimeMillis;
    }

    public static void resetUpgrade() {
        for (int i = 0; i < 18; i++) {
            while (upgradeUnitValue[i] > 0) {
                int i2 = myHeroism;
                int i3 = DataUpgradeUnit.upgradeUnitData[i][1];
                int i4 = DataUpgradeUnit.upgradeUnitData[i][2];
                int[] iArr = upgradeUnitValue;
                myHeroism = i2 + ((i3 * ((i4 * (iArr[i] - 1)) + 100)) / 100);
                iArr[i] = iArr[i] - 1;
            }
        }
        for (int i5 = 0; i5 < 3; i5++) {
            for (int i6 = 0; i6 < 6; i6++) {
                while (heroUpgradeValue[i5][i6] > 0) {
                    int i7 = myHeroism;
                    int i8 = DataUpgradeHero.upgradeHeroData[i6][1];
                    int i9 = DataUpgradeHero.upgradeHeroData[i6][2];
                    int[][] iArr2 = heroUpgradeValue;
                    myHeroism = i7 + ((i8 * ((i9 * (iArr2[i5][i6] - 1)) + 100)) / 100);
                    int[] iArr3 = iArr2[i5];
                    iArr3[i6] = iArr3[i6] - 1;
                }
            }
        }
    }
}
