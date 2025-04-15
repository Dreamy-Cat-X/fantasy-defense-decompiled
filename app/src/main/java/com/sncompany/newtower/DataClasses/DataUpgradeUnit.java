package com.sncompany.newtower.DataClasses;

import com.sncompany.newtower.R;

public class DataUpgradeUnit {
    static final int TARGET_TYPE_ARCHER = 2;
    static final int TARGET_TYPE_COMMON = 0;
    static final int TARGET_TYPE_WARRIOR = 1;
    static final int TARGET_TYPE_WIZARD = 3;
    static final int TYPE_BONUS_HEROISM = 4;
    static final int TYPE_CLASS_CHARGE = 5;
    static final int TYPE_COST_DOWN = 6;
    static final int TYPE_DAMAGE_UP = 7;
    static final int TYPE_FREEZE_RATE_UP = 14;
    static final int TYPE_FREEZE_TIME_UP = 15;
    static final int TYPE_GET_GOLD = 2;
    static final int TYPE_GET_GOLD_MANA = 19;
    static final int TYPE_GET_MANA = 3;
    static final int TYPE_HOLY_DAMAGE_UP = 12;
    static final int TYPE_HOLY_TIME_UP = 13;
    static final int TYPE_RANGE_UP = 9;
    static final int TYPE_SPECIAL_COOL_MINUS = 18;
    static final int TYPE_SPECIAL_COST_MINUS = 17;
    static final int TYPE_SPECIAL_DAMAGE_UP = 16;
    static final int TYPE_SPEED_UP = 8;
    static final int TYPE_START_GOLD = 0;
    static final int TYPE_START_MANA = 1;
    static final int TYPE_STUN_RATE_UP = 10;
    static final int TYPE_STUN_TIME_UP = 11;

    static final int VALUE_PER_LEVEL = 0; //Might be better-off hard-coded in practice
    static final int COST_FIRST_LEVEL = 1;
    static final int COST_PER_LEVEL = 2; //%-based, but this one was 100 every single so it got unused
    static final int MAX_LEVEL = 3; //This one was 10 every single so it got unused
    static final int EFFECT_TYPE = 4; //Irrelevant lol
    static final int TARGET_TYPE = 5; //Also irrelevant
    static final int TYPE_TOTAL_COUNT = 6;
    static final int Unit_Warrior_00 = 0;
    static final int Unit_Warrior_01 = 1;
    static final int Unit_Warrior_02 = 2;
    static final int Unit_Warrior_03 = 3;
    static final int Unit_Warrior_04 = 4;
    static final int Unit_Warrior_05 = 5;
    static final int Unit_Archer_00 = 6;
    static final int Unit_Archer_01 = 7;
    static final int Unit_Archer_02 = 8;
    static final int Unit_Archer_03 = 9;
    static final int Unit_Archer_04 = 10;
    static final int Unit_Archer_05 = 11;
    static final int Unit_Wizard_00 = 12;
    static final int Unit_Wizard_01 = 13;
    static final int Unit_Wizard_02 = 14;
    static final int Unit_Wizard_03 = 15;
    static final int Unit_Wizard_04 = 16;
    static final int Unit_Wizard_05 = 17;
    static final int TOTAL_COUNT = 18;
    public static final int[] upgradeUnitName = {R.string.unit_upgrade0_name, R.string.unit_upgrade1_name, R.string.unit_upgrade2_name, R.string.unit_upgrade3_name, R.string.unit_upgrade4_name, R.string.unit_upgrade5_name, R.string.unit_upgrade6_name, R.string.unit_upgrade7_name, R.string.unit_upgrade8_name, R.string.unit_upgrade9_name, R.string.unit_upgrade10_name, R.string.unit_upgrade11_name, R.string.unit_upgrade12_name, R.string.unit_upgrade13_name, R.string.unit_upgrade14_name, R.string.unit_upgrade15_name, R.string.unit_upgrade16_name, R.string.unit_upgrade17_name};
    public static final int[] upgradeUnitDescription = {R.string.unit_upgrade0_desc, R.string.unit_upgrade1_desc, R.string.unit_upgrade2_desc, R.string.unit_upgrade3_desc, R.string.unit_upgrade4_desc, R.string.unit_upgrade5_desc, R.string.unit_upgrade6_desc, R.string.unit_upgrade7_desc, R.string.unit_upgrade8_desc, R.string.unit_upgrade9_desc, R.string.unit_upgrade10_desc, R.string.unit_upgrade11_desc, R.string.unit_upgrade12_desc, R.string.unit_upgrade13_desc, R.string.unit_upgrade14_desc, R.string.unit_upgrade15_desc, R.string.unit_upgrade16_desc, R.string.unit_upgrade17_desc};
    public static final int[][] upgradeUnitData = {new int[]{-3, 120, 100, 10, 6, 1}, new int[]{8, 150, 100, 10, 7, 1}, new int[]{5, 100, 100, 10, 8, 1}, new int[]{3, 100, 100, 10, 9, 1}, new int[]{2, 80, 100, 10, 10, 1}, new int[]{3, 80, 100, 10, 11, 1}, new int[]{-3, 120, 100, 10, 6, 2}, new int[]{8, 150, 100, 10, 7, 2}, new int[]{5, 100, 100, 10, 8, 2}, new int[]{3, 100, 100, 10, 9, 2}, new int[]{8, 80, 100, 10, 12, 2}, new int[]{10, 80, 100, 10, 13, 2}, new int[]{-3, 120, 100, 10, 6, 3}, new int[]{8, 150, 100, 10, 7, 3}, new int[]{5, 100, 100, 10, 8, 3}, new int[]{3, 100, 100, 10, 9, 3}, new int[]{2, 80, 100, 10, 14, 3}, new int[]{3, 80, 100, 10, 15, 3}};
}
