package com.sncompany.newtower;

import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;

import com.sncompany.newtower.DataClasses.ArrowUnit;
import com.sncompany.newtower.DataClasses.EnemyUnit;
import com.sncompany.newtower.DataClasses.ObjectUnit;
import com.sncompany.newtower.DataClasses.TowerUnit;

/**
 * Contains data for all stages, and the functions to play battles out
 */
/* loaded from: D:\decomp\classes.dex */
public class DataStage {
    static final int DATA_STAGE_HP_B = 3;
    static final int DATA_STAGE_HP_N = 2;
    static final int DATA_STAGE_START_MANA = 1;
    static final int DATA_STAGE_START_MONEY = 0;
    static final int DATA_STAGE_TOTAL_COUNT = 50;
    static final int DATA_STAGE_TYPE_COUNT = 4;
    static final int[][] stageData = {new int[]{700, 150, 150, 155}, new int[]{700, 150, 170, 181}, new int[]{700, 150, 180, 196}, new int[]{700, 150, 200, 222}, new int[]{1000, 200, 225, 252}, new int[]{1000, 200, 245, 278}, new int[]{1000, 200, 260, 298}, new int[]{1000, 200, GameRenderer.GAME_UPGRADE_UNIT_SKILL_START_X, 324}, new int[]{1000, 200, 300, 349}, new int[]{1000, 200, 350, 405}, new int[]{750, 150, 362, 422}, new int[]{750, 150, 383, 449}, new int[]{750, 150, 404, 475}, new int[]{1000, 200, 410, 487}, new int[]{1000, 200, 400, 482}, new int[]{1000, 200, 415, 503}, new int[]{1000, 200, 420, InputDeviceCompat.SOURCE_DPAD}, new int[]{1000, 200, 405, 504}, new int[]{1000, 200, 400, 504}, new int[]{1000, 200, 460, 570}, new int[]{Texture2D.SCRWIDTH_800, 150, 475, 590}, new int[]{1000, 200, Texture2D.SCRHEIGHT_480, 601}, new int[]{1000, 200, 490, 616}, new int[]{Texture2D.SCRWIDTH_800, 150, 500, 632}, new int[]{1000, 200, 500, 637}, new int[]{1000, 200, 510, 653}, new int[]{1000, 200, 520, 668}, new int[]{Texture2D.SCRWIDTH_800, 150, 530, 684}, new int[]{1000, 200, 570, 729}, new int[]{1200, 200, 620, 785}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 670, 840}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 665, 841}, new int[]{1050, 350, 685, 866}, new int[]{1050, 350, 690, 877}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 720, 912}, new int[]{1050, 350, 745, 943}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 770, 973}, new int[]{1250, 350, 810, PointerIconCompat.TYPE_ZOOM_OUT}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 840, 1054}, new int[]{1250, 350, 950, 1170}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 970, 1195}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 990, 1221}, new int[]{1050, 350, PointerIconCompat.TYPE_ALIAS, 1246}, new int[]{1050, 350, 1030, 1272}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 1050, 1297}, new int[]{1050, 350, 1070, 1323}, new int[]{1050, 350, 1090, 1348}, new int[]{1250, 350, 1110, 1374}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 1140, 1409}, new int[]{1250, 350, 1200, 1475}};

    public static final int maxLife = 20;

    public static ArrowUnit[] arrowUnit;
    public static EffectUnit[] effectUnit;

    public static MonsterUnit[] monsterUnit;
    public static ObjectUnit[] objectUnit;
    public static EnemyUnit selectedTarget;

    public static TowerUnit[] towerUnit;
    public static TowerUnit selectedUnit;
    public static int Life = maxLife;
    public static int Mana = 0, Money = 0, Wave = 0;

    public static boolean perfectClear() {
        return Life == maxLife;
    }
}
