package com.sncompany.newtower.DataClasses;

import static com.sncompany.newtower.DataClasses.DataStage.heroAvail;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.R;

/* loaded from: D:\decomp\classes.dex */
public class DataAward {
    public static final int AWARD_Cleared_Forest = 0;
    public static final int AWARD_Cleared_Swamp = 1;
    public static final int AWARD_Cleared_Wilderness = 2;
    public static final int AWARD_Cleared_Volcano = 3;
    public static final int AWARD_Cleared_Ether_Region = 4;
    public static final int AWARD_Crasto_s_guardian = 5;
    public static final int AWARD_No_more_Enemy = 6;
    public static final int AWARD_Destroyer = 7;
    public static final int AWARD_Champion = 8;
    public static final int AWARD_Bow_Master = 9;
    public static final int AWARD_Archmage = 10;
    public static final int AWARD_Upgrader = 11;
    public static final int AWARD_Perfect_Upgrader = 12;
    public static final int AWARD_Master_Blade = 13;
    public static final int AWARD_Master_Sniper = 14;
    public static final int AWARD_Master_Mage = 15;
    public static final int AWARD_Legend_Of_Hero = 16;
    public static final int AWARD_Maximum_morale = 17;
    public static final int AWARD_Brave = 18;//1K hero points
    public static final int AWARD_Fighter = 19;//10K hero points
    public static final int AWARD_Armed_To_The_Teeth = 20;//Fully-equipped
    public static final int AWARD_Rich = 21;
    public static final int AWARD_Wealthy = 22;
    public static final int AWARD_Narrowly_Victory = 23;
    public static final int AWARD_Awakening_Heros_Soul = 24; //All heros to Lv5 (Ingame) or just one hero?
    public static final int AWARD_Surplus = 25;
    public static final int AWARD_Full_Party = 26;
    public static final int AWARD_Warriors_March = 27;
    public static final int AWARD_Snipers_Toast = 28;
    public static final int AWARD_Mages_Rally = 29;
    public static final int AWARD_10_Title = 30;//10 awards
    public static final int AWARD_20_Title = 31;//20 awards
    public static final int AWARD_30_Title = 32;//30 awards
    public static final int AWARD_100_Kill = 33;
    public static final int AWARD_500_Kill = 34;
    public static final int AWARD_1_000_Kill = 35;
    public static final int AWARD_2_000_Kill = 36;
    public static final int AWARD_5_000_Kill = 37;
    public static final int AWARD_10_000_Kill = 38;
    public static final int AWARD_Guardian_Of_War = 39;
    public static final int AWARD_Sniper_Of_War = 40;
    public static final int AWARD_Fire_Of_War = 41;
    public static final int AWARD_Thrill_Of_The_Hammer = 42;
    public static final int AWARD_Eye_Of_Terror = 43;
    public static final int AWARD_Ice_Queen = 44;
    public static final int AWARD_War_GOD = 45;
    public static final int AWARD_Shadow_Of_Death = 46;
    public static final int AWARD_Chaos_Witch = 47;
    public static final int AWARD_Swords_Banquet = 48;
    public static final int AWARD_Rain_Of_Death = 49;
    public static final int AWARD_Frozen_Heart = 50;
    public static final int AWARD_Crossroads_Of_Destiny = 51;
    public static final int AWARD_Persevering = 52;
    public static final int AWARD_A_Perfectionist = 53;
    public static final int AWARD_Amateur_Defender = 54;
    public static final int AWARD_High_Class_Defender = 55;
    public static final int AWARD_Professional_Defender = 56;
    public static final int AWARD_Defense_Mania = 57;
    public static final int AWARD_Defense_Master = 58;
    public static final int AWARD_Defense_Hero = 59;
    public static final int AWARD_Defense_King = 60;
    public static final int AWARD_Defense_G_O_D = 61;
    public static final int AWARD_TOTAL_COUNT = 62;

    public static final int[][] data = {
            {R.string.award0_name, R.string.award0_desc, 10},
            {R.string.award1_name, R.string.award1_desc, 10},
            {R.string.award2_name, R.string.award2_desc, 10},
            {R.string.award3_name, R.string.award3_desc, 10},
            {R.string.award4_name, R.string.award4_desc, 10},
            {R.string.award5_name, R.string.award5_desc, 15},
            {R.string.award6_name, R.string.award6_desc, 20},
            {R.string.award7_name, R.string.award7_desc, 20},
            {R.string.award8_name, R.string.award8_desc, 10},
            {R.string.award9_name, R.string.award9_desc, 10},
            {R.string.award10_name, R.string.award10_desc, 10},
            {R.string.award11_name, R.string.award11_desc, 5},
            {R.string.award12_name, R.string.award12_desc, 15},
            {R.string.award13_name, R.string.award13_desc, 20},
            {R.string.award14_name, R.string.award14_desc, 20},
            {R.string.award15_name, R.string.award15_desc, 20},
            {R.string.award16_name, R.string.award16_desc, 20},
            {R.string.award17_name, R.string.award17_desc, 20},
            {R.string.award18_name, R.string.award18_desc, 10},
            {R.string.award19_name, R.string.award19_desc, 15},
            {R.string.award20_name, R.string.award20_desc, 10},
            {R.string.award21_name, R.string.award21_desc, 10},
            {R.string.award22_name, R.string.award22_desc, 15},
            {R.string.award23_name, R.string.award23_desc, 10},
            {R.string.award24_name, R.string.award24_desc, 10},
            {R.string.award25_name, R.string.award25_desc, 5},
            {R.string.award26_name, R.string.award26_desc, 10},
            {R.string.award27_name, R.string.award27_desc, 10},
            {R.string.award28_name, R.string.award28_desc, 10},
            {R.string.award29_name, R.string.award29_desc, 10},
            {R.string.award30_name, R.string.award30_desc, 10},
            {R.string.award31_name, R.string.award31_desc, 15},
            {R.string.award32_name, R.string.award32_desc, 20},
            {R.string.award33_name, R.string.award33_desc, 5},
            {R.string.award34_name, R.string.award34_desc, 5},
            {R.string.award35_name, R.string.award35_desc, 10},
            {R.string.award36_name, R.string.award36_desc, 10},
            {R.string.award37_name, R.string.award37_desc, 15},
            {R.string.award38_name, R.string.award38_desc, 20},
            {R.string.award39_name, R.string.award39_desc, 5},
            {R.string.award40_name, R.string.award40_desc, 5},
            {R.string.award41_name, R.string.award41_desc, 5},
            {R.string.award42_name, R.string.award42_desc, 5},
            {R.string.award43_name, R.string.award43_desc, 5},
            {R.string.award44_name, R.string.award44_desc, 5},
            {R.string.award45_name, R.string.award45_desc, 5},
            {R.string.award46_name, R.string.award46_desc, 5},
            {R.string.award47_name, R.string.award47_desc, 5},
            {R.string.award48_name, R.string.award48_desc, 10},
            {R.string.award49_name, R.string.award49_desc, 10},
            {R.string.award50_name, R.string.award50_desc, 10},
            {R.string.award51_name, R.string.award51_desc, 10},
            {R.string.award52_name, R.string.award52_desc, 10},
            {R.string.award53_name, R.string.award53_desc, 10},
            {R.string.award54_name, R.string.award54_desc, 5},
            {R.string.award55_name, R.string.award55_desc, 5},
            {R.string.award56_name, R.string.award56_desc, 10},
            {R.string.award57_name, R.string.award57_desc, 10},
            {R.string.award58_name, R.string.award58_desc, 15},
            {R.string.award59_name, R.string.award59_desc, 15},
            {R.string.award60_name, R.string.award60_desc, 20},
            {R.string.award61_name, R.string.award61_desc, 20},
    };

    public static void check_upgrade() {
        boolean allMax = true;
        for (int i = 0; i < Config.s.unitUpgrades.length; i++) {
            boolean uAwd = true;
            for (int j = 0; j < Config.s.unitUpgrades[i].length; j++) {
                int lv = Config.s.unitUpgrades[i][j];
                Config.s.awardValues[AWARD_Upgrader] |= lv >= 3;
                Config.s.awardValues[AWARD_Perfect_Upgrader] |= lv >= 10;
                uAwd &= lv >= 10;
                allMax &= uAwd;
            }
            if (uAwd)
                Config.s.awardValues[AWARD_Master_Blade + i] = true;
        }
        for (int i = 0; i < Config.s.heroUpgrades.length; i++) {
            boolean uAwd = true;
            for (int j = 0; j < Config.s.heroUpgrades[i].length; j++) {
                int lv = Config.s.unitUpgrades[i][j];
                Config.s.awardValues[AWARD_Upgrader] |= lv >= 3;
                Config.s.awardValues[AWARD_Perfect_Upgrader] |= lv >= 10;
                uAwd &= lv >= 10;
                allMax &= uAwd;
            }
            if (uAwd)
                Config.s.awardValues[AWARD_Legend_Of_Hero] = true;
        }
        Config.s.awardValues[AWARD_Maximum_morale] = allMax;
    }

    public static void check_time() {
        int mins = (int)(Config.s.totalPlaytime / 60);
        Config.s.awardValues[AWARD_Amateur_Defender] |= mins >= 30;

        int hours = mins / 60;
        Config.s.awardValues[AWARD_High_Class_Defender] |= hours >= 2;
        Config.s.awardValues[AWARD_Professional_Defender] |= hours >= 5;
        Config.s.awardValues[AWARD_Defense_Mania] |= hours >= 10;
        Config.s.awardValues[AWARD_Defense_Master] |= hours >= 20;
        Config.s.awardValues[AWARD_Defense_Hero] |= hours >= 50;
        Config.s.awardValues[AWARD_Defense_King] |= hours >= 100;
        Config.s.awardValues[AWARD_Defense_G_O_D] |= hours >= 200;
    }

    public static void clear_award(int SID) {
        Config.s.awardValues[AWARD_Champion] |= Config.s.rewardValues[0];
        Config.s.awardValues[AWARD_Bow_Master] |= Config.s.rewardValues[2];
        Config.s.awardValues[AWARD_Archmage] |= Config.s.rewardValues[4];
        Config.s.awardValues[AWARD_Cleared_Forest] |= SID == 9;
        Config.s.awardValues[AWARD_Cleared_Swamp] |= SID == 19;
        Config.s.awardValues[AWARD_Cleared_Wilderness] |= SID == 29;
        Config.s.awardValues[AWARD_Cleared_Volcano] |= SID == 39;
        Config.s.awardValues[AWARD_Cleared_Ether_Region] |= SID == 49;
        for (int i = 0; i <= 2; i++)
            heroAvail[i] = Config.s.rewardValues[i * 2];

        boolean all = true, perfect = true, moon = true;
        for (int j = 0; j < Config.s.stageProg.length; j++) {//In the real game, time attack and base destroyer clear aren't required for the Crasto Guardian trophy, but that made it no different than EtherRegion clear trophy
            byte[] scores = Config.s.stageProg[j];
            for (int i = 0; i < 3; i += 2)
                if (scores[i] <= 0) {
                    all = perfect = false; //moonbreak isn't required for perfect either in real game lol
                    moon &= i != 2;
                } else if (scores[i] < 2)
                    perfect = false;
            if (!all && !moon)
                break;
            if (perfect && j == 14)
                Config.s.awardValues[AWARD_A_Perfectionist] = true;
        }
        if (all)
            Config.s.awardValues[AWARD_Crasto_s_guardian] = true;
        if (perfect)
            Config.s.awardValues[AWARD_No_more_Enemy] = true;
        if (moon)
            Config.s.awardValues[AWARD_Destroyer] = true;
    }

    public static void check_heroPoint(int amount) {
        Config.s.heroPoints += amount;
        Config.s.awardValues[AWARD_Brave] |= Config.s.heroPoints >= 1000;
        Config.s.awardValues[AWARD_Fighter] |= Config.s.heroPoints >= 10000;
    }

    public static void check_money(int money) {
        Config.s.awardValues[AWARD_Rich] |= money >= 5000;
        Config.s.awardValues[AWARD_Wealthy] |= money >= 10000;
    }

    public static void check_kill() {
        Config.s.killCount++;

        Config.s.awardValues[AWARD_100_Kill] = Config.s.killCount >= 100;
        Config.s.awardValues[AWARD_500_Kill] = Config.s.killCount >= 500;
        Config.s.awardValues[AWARD_1_000_Kill] = Config.s.killCount >= 1000;
        Config.s.awardValues[AWARD_2_000_Kill] = Config.s.killCount >= 2000;
        Config.s.awardValues[AWARD_5_000_Kill] = Config.s.killCount >= 5000;
        Config.s.awardValues[AWARD_10_000_Kill] = Config.s.killCount >= 10000;
    }
}
