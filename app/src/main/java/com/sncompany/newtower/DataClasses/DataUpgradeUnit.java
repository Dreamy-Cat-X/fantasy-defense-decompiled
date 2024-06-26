package com.sncompany.newtower.DataClasses;

/* loaded from: D:\decomp\classes.dex */
public class DataUpgradeUnit {
    static final int DATA_UPGRADE_TARGET_TYPE_ARCHER = 2;
    static final int DATA_UPGRADE_TARGET_TYPE_COMMON = 0;
    static final int DATA_UPGRADE_TARGET_TYPE_WARRIOR = 1;
    static final int DATA_UPGRADE_TARGET_TYPE_WIZARD = 3;
    static final int DATA_UPGRADE_TYPE_BONUS_HEROISM = 4;
    static final int DATA_UPGRADE_TYPE_CLASS_CHARGE = 5;
    static final int DATA_UPGRADE_TYPE_COST_DOWN = 6;
    static final int DATA_UPGRADE_TYPE_DAMAGE_UP = 7;
    static final int DATA_UPGRADE_TYPE_FREEZE_RATE_UP = 14;
    static final int DATA_UPGRADE_TYPE_FREEZE_TIME_UP = 15;
    static final int DATA_UPGRADE_TYPE_GET_GOLD = 2;
    static final int DATA_UPGRADE_TYPE_GET_GOLD_MANA = 19;
    static final int DATA_UPGRADE_TYPE_GET_MANA = 3;
    static final int DATA_UPGRADE_TYPE_HOLY_DANAGE_UP = 12;
    static final int DATA_UPGRADE_TYPE_HOLY_TIME_UP = 13;
    static final int DATA_UPGRADE_TYPE_RANGE_UP = 9;
    static final int DATA_UPGRADE_TYPE_SPECIAL_COOL_MINUS = 18;
    static final int DATA_UPGRADE_TYPE_SPECIAL_COST_MINUS = 17;
    static final int DATA_UPGRADE_TYPE_SPECIAL_DAMAGE_UP = 16;
    static final int DATA_UPGRADE_TYPE_SPEED_UP = 8;
    static final int DATA_UPGRADE_TYPE_START_GOLD = 0;
    static final int DATA_UPGRADE_TYPE_START_MANA = 1;
    static final int DATA_UPGRADE_TYPE_STUN_RATE_UP = 10;
    static final int DATA_UPGRADE_TYPE_STUN_TIME_UP = 11;
    static final int DATA_UPGRADE_UNIT_VALUE_PER_LEVEL = 0; //Might be better-off hard-coded in practice
    static final int DATA_UPGRADE_UNIT_COST_FIRST_LEVEL = 1;
    static final int DATA_UPGRADE_UNIT_COST_PER_LEVEL = 2; //%-based, but this one was 100 every single so it got unused
    static final int DATA_UPGRADE_UNIT_MAX_LEVEL = 3; //This one was 10 every single so it got unused
    static final int DATA_UPGRADE_UNIT_EFFECT_TYPE = 4; //Irrelevant lol
    static final int DATA_UPGRADE_UNIT_TARGET_TYPE = 5; //Also irrelevant
    static final int DATA_UPGRADE_UNIT_TOTAL_COUNT = 18;
    static final int DATA_UPGRADE_UNIT_TYPE_TOTAL_COUNT = 6;
    static final int DATA_UPGRADE_UNIT_Unit_Warrior_00 = 0;
    static final int DATA_UPGRADE_UNIT_Unit_Warrior_01 = 1;
    static final int DATA_UPGRADE_UNIT_Unit_Warrior_02 = 2;
    static final int DATA_UPGRADE_UNIT_Unit_Warrior_03 = 3;
    static final int DATA_UPGRADE_UNIT_Unit_Warrior_04 = 4;
    static final int DATA_UPGRADE_UNIT_Unit_Warrior_05 = 5;
    static final int DATA_UPGRADE_UNIT_Unit_Archer_00 = 6;
    static final int DATA_UPGRADE_UNIT_Unit_Archer_01 = 7;
    static final int DATA_UPGRADE_UNIT_Unit_Archer_02 = 8;
    static final int DATA_UPGRADE_UNIT_Unit_Archer_03 = 9;
    static final int DATA_UPGRADE_UNIT_Unit_Archer_04 = 10;
    static final int DATA_UPGRADE_UNIT_Unit_Archer_05 = 11;
    static final int DATA_UPGRADE_UNIT_Unit_Wizard_00 = 12;
    static final int DATA_UPGRADE_UNIT_Unit_Wizard_01 = 13;
    static final int DATA_UPGRADE_UNIT_Unit_Wizard_02 = 14;
    static final int DATA_UPGRADE_UNIT_Unit_Wizard_03 = 15;
    static final int DATA_UPGRADE_UNIT_Unit_Wizard_04 = 16;
    static final int DATA_UPGRADE_UNIT_Unit_Wizard_05 = 17;
    public static final String[] upgradeUnitName = {"Hell Fist", "Bull Power", "Dashing Lion", "Bear Smite", "Rock Explosion", "Megalith Impact", "Silver Wings", "Eagle Claw", "Wind Strike", "Justice", "Holy Power", "Benediction", "Magical Collaboration", "Black Contract", "Concentrate Mana", "Raptor Slash", "Prison Sword ", "Slow Turn"};
    public static final String[] upgradeUnitDescription = {"Warrior Summon Cost %d%%", "Warrior Attack Strength +%d%%", "Warrior Attack Speed +%d%%", "Warrior Attack Range +%d%%", "Brandisher Stun Chance +%d%%", "Brandisher Stun Duration +%d%%", "Archer Summon Cost %d%%", "Archer Attack Strength +%d%%", "Archer Attack Speed +%d%%", "Archer Attack Range +%d%%", "Holy Eye DoT Strength +%d%%", "Holy Eye DoT Duration +%d%%", "Wizard Summon Cost %d%%", "Wizard Attack Strength +%d%%", "Wizard Attack Speed +%d%%", "Wizard Attack Range +%d%%", "Ice Slow Chance +%d%%", "Ice Slow Duration +%d%%"};
    public static final int[][] upgradeUnitData = {new int[]{-3, 120, 100, 10, 6, 1}, new int[]{8, 150, 100, 10, 7, 1}, new int[]{5, 100, 100, 10, 8, 1}, new int[]{3, 100, 100, 10, 9, 1}, new int[]{2, 80, 100, 10, 10, 1}, new int[]{3, 80, 100, 10, 11, 1}, new int[]{-3, 120, 100, 10, 6, 2}, new int[]{8, 150, 100, 10, 7, 2}, new int[]{5, 100, 100, 10, 8, 2}, new int[]{3, 100, 100, 10, 9, 2}, new int[]{8, 80, 100, 10, 12, 2}, new int[]{10, 80, 100, 10, 13, 2}, new int[]{-3, 120, 100, 10, 6, 3}, new int[]{8, 150, 100, 10, 7, 3}, new int[]{5, 100, 100, 10, 8, 3}, new int[]{3, 100, 100, 10, 9, 3}, new int[]{2, 80, 100, 10, 14, 3}, new int[]{3, 80, 100, 10, 15, 3}};
}
