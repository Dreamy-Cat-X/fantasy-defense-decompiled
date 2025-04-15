package com.sncompany.newtower.DataClasses;

import com.sncompany.newtower.R;/* loaded from: D:\decomp\classes.dex */
public class DataUpgradeHero {
    static final int VALUE_PER_LEVEL = 0;
    static final int COST_FIRST_LEVEL = 1;
    static final int COST_PER_LEVEL = 2;
    static final int MAX_LEVEL = 3;
    static final int EFFECT_TYPE = 4;
    static final int TYPE_TOTAL_COUNT = 5;
    static final int Hero_Up_00 = 0;
    static final int Hero_Up_01 = 1;
    static final int Hero_Up_02 = 2;
    static final int Hero_Up_03 = 3;
    static final int Hero_Up_04 = 4;
    static final int Hero_Up_05 = 5;
    static final int TOTAL_COUNT = 6;

    public static final int[] upgradeHeroName = {R.string.hero_upgrade0_name, R.string.hero_upgrade1_name, R.string.hero_upgrade2_name, R.string.hero_upgrade3_name, R.string.hero_upgrade4_name, R.string.hero_upgrade5_name};
    public static final int[] upgradeHeroDescription = {R.string.hero_upgrade0_desc, R.string.hero_upgrade1_desc, R.string.hero_upgrade2_desc, R.string.hero_upgrade3_desc, R.string.hero_upgrade4_desc, R.string.hero_upgrade5_desc};
    public static final int[][] upgradeHeroData = {new int[]{-4, 100, 100, 10, 6}, new int[]{8, 120, 100, 10, 7}, new int[]{5, 100, 100, 10, 8}, new int[]{20, 80, 100, 10, 16}, new int[]{-4, 80, 100, 10, 17}, new int[]{-3, 80, 100, 10, 18}};
}
