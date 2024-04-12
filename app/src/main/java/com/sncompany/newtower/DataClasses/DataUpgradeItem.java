package com.sncompany.newtower.DataClasses;

import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;

import com.sncompany.newtower.Texture2D;

/* loaded from: D:\decomp\classes.dex */
public class DataUpgradeItem {
    static final int DATA_UPGRADE_ITEM_BASE_TYPE = 0;
    static final int DATA_UPGRADE_ITEM_EQUIP_TYPE = 1;
    static final int DATA_UPGRADE_ITEM_STAT_VALUE = 2;
    static final int DATA_UPGRADE_ITEM_BUY_TYPE = 3;
    static final int DATA_UPGRADE_ITEM_BUY_VALUE = 4;
    static final int DATA_UPGRADE_ITEM_EFFECT_TYPE = 5;
    static final int DATA_UPGRADE_ITEM_Item_Hero_spe_00 = 25;
    static final int DATA_UPGRADE_ITEM_Item_Hero_spe_01 = 26;
    static final int DATA_UPGRADE_ITEM_Item_Hero_spe_02 = 27;
    static final int DATA_UPGRADE_ITEM_Item_Hero_spe_03 = 28;
    static final int DATA_UPGRADE_ITEM_Item_Limit_00 = 29;
    static final int DATA_UPGRADE_ITEM_Item_Reset_00 = 0;
    static final int DATA_UPGRADE_ITEM_Item_Spe_attack_00 = 17;
    static final int DATA_UPGRADE_ITEM_Item_Spe_attack_01 = 18;
    static final int DATA_UPGRADE_ITEM_Item_Spe_attack_02 = 19;
    static final int DATA_UPGRADE_ITEM_Item_Spe_attack_03 = 20;
    static final int DATA_UPGRADE_ITEM_Item_Spe_attack_12 = 21;
    static final int DATA_UPGRADE_ITEM_Item_Spe_attack_13 = 22;
    static final int DATA_UPGRADE_ITEM_Item_Spe_attack_14 = 23;
    static final int DATA_UPGRADE_ITEM_Item_Spe_attack_15 = 24;
    static final int DATA_UPGRADE_ITEM_Item_Unit_00 = 1;
    static final int DATA_UPGRADE_ITEM_Item_Unit_01 = 2;
    static final int DATA_UPGRADE_ITEM_Item_Unit_02 = 3;
    static final int DATA_UPGRADE_ITEM_Item_Unit_03 = 4;
    static final int DATA_UPGRADE_ITEM_Item_Unit_04 = 5;
    static final int DATA_UPGRADE_ITEM_Item_Unit_05 = 6;
    static final int DATA_UPGRADE_ITEM_Item_Unit_06 = 7;
    static final int DATA_UPGRADE_ITEM_Item_Unit_07 = 8;
    static final int DATA_UPGRADE_ITEM_Item_Unit_08 = 9;
    static final int DATA_UPGRADE_ITEM_Item_Unit_09 = 10;
    static final int DATA_UPGRADE_ITEM_Item_Unit_10 = 11;
    static final int DATA_UPGRADE_ITEM_Item_Unit_11 = 12;
    static final int DATA_UPGRADE_ITEM_Item_Unit_12 = 13;
    static final int DATA_UPGRADE_ITEM_Item_Unit_13 = 14;
    static final int DATA_UPGRADE_ITEM_Item_Unit_14 = 15;
    static final int DATA_UPGRADE_ITEM_Item_Unit_15 = 16;
    static final int DATA_UPGRADE_ITEM_TOTAL_COUNT = 30;
    static final int DATA_UPGRADE_ITEM_TYPE_ADD_HEROISM = 0;
    static final int DATA_UPGRADE_ITEM_TYPE_ADD_DOT = 10;
    static final int DATA_UPGRADE_ITEM_TYPE_ADD_DEATH = 11;
    static final int DATA_UPGRADE_ITEM_TYPE_ADD_STUN = 12;
    static final int DATA_UPGRADE_ITEM_TYPE_ADD_SLOW = 13;
    static final int DATA_UPGRADE_ITEM_TYPE_BUY_DOLLAR = 0; //A lot of these look like paid stuff from the game's now gone storefront
    static final int DATA_UPGRADE_ITEM_TYPE_BUY_HEROISM = 1;
    static final int DATA_UPGRADE_ITEM_TYPE_COST_DOWN = 1;
    static final int DATA_UPGRADE_ITEM_TYPE_DAMAGE_UP = 2;
    static final int DATA_UPGRADE_ITEM_TYPE_EQUIP_ARCHER = 3;
    static final int DATA_UPGRADE_ITEM_TYPE_EQUIP_HERO = 1;
    static final int DATA_UPGRADE_ITEM_TYPE_EQUIP_NONE = 0;
    static final int DATA_UPGRADE_ITEM_TYPE_EQUIP_WARRIOR = 2;
    static final int DATA_UPGRADE_ITEM_TYPE_EQUIP_WIZARD = 4;
    static final int DATA_UPGRADE_ITEM_TYPE_GET_GOLD_MANA = 8;
    static final int DATA_UPGRADE_ITEM_TYPE_LIMIT_UP = 14;
    static final int DATA_UPGRADE_ITEM_TYPE_RANGE_UP = 4;
    static final int DATA_UPGRADE_ITEM_TYPE_SPECIAL_COOL_MINUS = 6;
    static final int DATA_UPGRADE_ITEM_TYPE_SPECIAL_COST_MINUS = 7;
    static final int DATA_UPGRADE_ITEM_TYPE_SPECIAL_DAMAGE_UP = 5;
    static final int DATA_UPGRADE_ITEM_TYPE_SPEED_UP = 3;
    static final int DATA_UPGRADE_ITEM_TYPE_STAT_RESET = 9;
    static final int DATA_UPGRADE_ITEM_TYPE_TOTAL_COUNT = 6;
    static final int DATA_UPGRADE_Item_Hero_spe = 4;
    static final int DATA_UPGRADE_Item_Heroism = 0;
    static final int DATA_UPGRADE_Item_Limit = 5;
    static final int DATA_UPGRADE_Item_Reset = 1;
    static final int DATA_UPGRADE_Item_Spe_attack = 3;
    static final int DATA_UPGRADE_Item_Unit = 2;
    static final String[] upgradeItemName = {"Upgrade Reset", "Battle Helm", "Gigantes Helm", "Zeus Armor", "Ares Armor", "Battle Ring", "Angel Ring", "Athena Ring", "Ares Ring", "Battle Boots", "War Horse Boots", "Titan Boots", "Ares Boots", "Lunar Amulet", "Solar Amulet", "Zephyrus Amulet", "Ares Amulet", "Concentration Helm", "War Helm", "Faithful Helm", "Demon God Helm", "Gold Charm", "Ruby Charm", "Lich Charm", "Demon God Charm", "Demon Bane", "Godly Smash", "Titan Hammer", "Ice Terror", "Uncap Upgrade Limit"};
    static final String[] upgradeItemDescription = {"Upon purchasing this item, the upgrade status of your Hero and basic units is reset _and their Hero Points will be returned to you.", "Hero Level Upgrade Cost %d%%", "Hero Level Upgrade Cost %d%%", "Hero Level Upgrade Cost %d%%", "Hero Level Upgrade Cost %d%%", "Hero Attack Strength +%d%%", "Hero Attack Strength +%d%%", "Hero Attack Strength +%d%%", "Hero Attack Strength +%d%%", "Hero Attack Speed +%d%%", "Hero Attack Speed +%d%%", "Hero Attack Speed +%d%%", "Hero Attack Speed +%d%%", "Hero Attack Range +%d%%", "Hero Attack Range +%d%%", "Hero Attack Range +%d%%", "Hero Attack Range +%d%%", "Special Skill Attack Strength +%d%%", "Special Skill Attack Strength +%d%%", "Special Skill Attack Strength +%d%%", "Special Skill Attack Strength +%d%%", "Gold Gain +%d%%", "Gold Gain +%d%%", "Gold Gain +%d%%", "Gold Gain +%d%%", "%d%%Add the DoT effect.", "%d%%Add the Instant Death effect.", "%d%%Add the Stun effect.", "%d%%Add the Slow effect.", "Immediately increase your unit upgrade limit by 5 points upon purchase._ (Up to 2 times. Not applicable to Heroes.)"};
    static final int[][] upgradeItemData = {new int[]{1, 0, 0, 1, 300, 9}, new int[]{2, 1, -5, 1, 300, 1}, new int[]{2, 1, -8, 1, 500, 1}, new int[]{2, 1, -10, 1, Texture2D.SCRWIDTH_800, 1}, new int[]{2, 1, -20, 1, 1200, 1}, new int[]{2, 1, 15, 1, 300, 2}, new int[]{2, 1, 25, 1, 500, 2}, new int[]{2, 1, 35, 1, Texture2D.SCRWIDTH_800, 2}, new int[]{2, 1, 50, 1, 1200, 2}, new int[]{2, 1, 10, 1, 300, 3}, new int[]{2, 1, 15, 1, 500, 3}, new int[]{2, 1, 20, 1, Texture2D.SCRWIDTH_800, 3}, new int[]{2, 1, 30, 1, 1200, 3}, new int[]{2, 1, 10, 1, 300, 4}, new int[]{2, 1, 18, 1, 500, 4}, new int[]{2, 1, 25, 1, Texture2D.SCRWIDTH_800, 4}, new int[]{2, 1, 40, 1, 1200, 4}, new int[]{3, 1, 50, 1, 300, 5}, new int[]{3, 1, 80, 1, 500, 5}, new int[]{3, 1, 120, 1, Texture2D.SCRWIDTH_800, 5}, new int[]{3, 1, 250, 1, 1200, 5}, new int[]{3, 1, 4, 1, 300, 8}, new int[]{3, 1, 8, 1, 500, 8}, new int[]{3, 1, 12, 1, Texture2D.SCRWIDTH_800, 8}, new int[]{3, 1, 25, 1, 1200, 8}, new int[]{4, 1, 35, 1, 2000, 10}, new int[]{4, 1, 3, 1, PathInterpolatorCompat.MAX_NUM_POINTS, 11}, new int[]{4, 1, 25, 1, 2000, 12}, new int[]{4, 1, 40, 1, 2000, 13}, new int[]{5, 0, 5, 1, 2000, 14}};

    public static final int EQ_ARMOR = 0, EQ_RING = 1, EQ_BOOT = 2, EQ_AMLT = 3, EQ_HELM = 4, EQ_CHARM = 5, EQ_MISC = 6;
    public static final int[][] equipData = {{-5, -8, -10, -20}, {15, 25, 35, 50}, {10, 15, 20, 30}, {10, 18, 25, 40}, {50, 80, 120, 250}, {4, 8, 12, 25}, {35, 3, 25, 40}};
}
