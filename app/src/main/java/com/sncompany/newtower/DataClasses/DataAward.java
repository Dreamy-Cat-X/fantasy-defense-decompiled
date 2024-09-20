package com.sncompany.newtower.DataClasses;

import static com.sncompany.newtower.DataClasses.DataStage.heroAvail;

import com.sncompany.newtower.Config;

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

    public static final int[] awardScoreValue = {10, 10, 10, 10, 10, 15, 20, 20, 10, 10, 10, 5, 15, 20, 20, 20, 20, 20, 10, 15, 10, 10, 15, 10, 10, 5, 10, 10, 10, 10, 10, 15, 20, 5, 5, 10, 10, 15, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 10, 10, 10, 10, 10, 5, 5, 10, 10, 15, 15, 20, 20};
    public static final String[] awardTitle = {"Purifying the Forest", "Purifying the Swamp", "Purifying the Desert", "Purifying the Volcano", "Purifying the Demon World", "Guardian of Crasto", "The Almighty", "Gate Destroyer", "Champion", "Bow Master", "Archmage","Upgrader", "Perfectly Upgraded", "Fighter", "Robin Hood", "Sage", "Legendary Hero", "High Spirit", "Brave", "Brawler", "Fully Armed", "Rich", "Filthy Rich", "Whew, that was close~", "Awakened Hero", "Surplus Soldiers?", "Pool Party", "March of Soldiers", "Celebration of Snipers", "Rally of Wizards", "10 Titles", "20 Titles", "30 Titles", "100 Kill", "500 Kill", "1,000 Kill", "2,000 Kill", "5,000 Kill", "10,000 Kill", "Battlefield Guardian", "Battlefield Sniper", "Battlefield Light", "Lurid Hammer", "Glance of Terror", "Ice Queen", "Battlefield Guardian", "Deathly Shadow", "Chaos Witch", "Banquet of Swords", "Deathly Arrow Shower", "Frozen Heart", "Crossroads of Destiny", "Unyielding", "Perfectionist", "Amateur Defender", "High-class Defender", "Professional Defender", "World-class Defender", "Defense Master", "Defense Hero", "Defense King", "Defense God"};
    public static final String[] awardDescription = {"Theme 1 - All stages cleared.", "Theme 2 - All stages cleared.", "Theme 3 - All stages cleared.", "Theme 4 - All stages cleared.", "Theme 5 - All stages cleared.", "All stages cleared.", "All stages perfect-cleared.", "Destroy the Moon - All stages cleared.", "Hero [Champion] acquired.", "Hero [Bow Master] acquired.", "Hero [Archmage] acquired.", "Upgraded 3 or more times.", "1 upgrade menu has been perfectly upgraded.", "All the upgrades for the Warrior unit have been perfectly upgraded.", "All the upgrades for the Archer unit have been perfectly upgraded.", "All the upgrades for the Wizard unit have been perfectly upgraded.", "1 or more Hero units have been perfectly upgraded.", "All the upgrades have been perfectly upgraded.", "You have 1,000 or more Hero Points", "You have 1,0000 or more Hero Points", "All of your Heroes are armed with items.", "You have 5,000 or more gold.", "You have 10,000 or more gold.", "You just barely cleared a stage.", "You upgraded your Heroes to Level 5.", "One or more of your units were idle until a stage was cleared.", "You used all types of a unit in one stage. (The 12 types of Heroes are not included.)", "You cleared a stage by only using Warrior units. The (4 types of Heroes not included.)", "You cleared a stage by only using Archer units. The (4 types of Heroes not included.)", "You cleared a stage by only using Wizard units. The (4 types of Heroes not included.)", "You acquired 10 or more titles.", "You acquired 20 or more titles.", "You acquired 30 or more titles.", "You defeated 100 enemies.", "You defeated 500 enemies.", "You defeated 1,000 enemies.", "You defeated 2,000 enemies.", "You defeated 5,000 enemies.", "You defeated 10,000 enemies.", "Your Warlord reached the maximum Level.", "Your Sky Arrows reached the maximum Level.", "Your Blasters reached the maximum Level.", "Your Brandishers reached the maximum Level.", "Your Holy Eyes reached the maximum Level.", "Your Ice Mages reached the maximum Level.", "Your Champion reached the maximum Level.", "Your Bow Master reached the maximum Level.", "Your Archmage reached the maximum Level.", "You eliminated 5 or more enemies by using Champion's special skill.", "You eliminated 5 or more enemies by using Bow Master's special skill.", "You eliminated 5 or more enemies by using Archmage's special skill.", "You entered a map with crossroads for the first time.", "You challenged one stage 3 or more times.", "You perfect-cleared Stages 1 to 15.", "Your accumulated playtime has reached 30 minutes.", "Your accumulated playtime has reached 2 hours.", "Your accumulated playtime has reached 5 hours.", "Your accumulated playtime has reached 10 hours.", "Your accumulated playtime has reached 20 hours.", "Your accumulated playtime has reached 50 hours.", "Your accumulated playtime has reached 100 hours.", "Your accumulated playtime has reached 200 hours."};

    public static void check_upgrade() {
        boolean allMax = true;
        for (int i = 0; i < Config.unitUpgrades.length; i++) {
            boolean uAwd = true;
            for (int j = 0; j < Config.unitUpgrades[i].length; j++) {
                int lv = Config.unitUpgrades[i][j];
                Config.awardValues[AWARD_Upgrader] |= lv >= 3;
                Config.awardValues[AWARD_Perfect_Upgrader] |= lv >= 10;
                uAwd &= lv >= 10;
                allMax &= uAwd;
            }
            if (uAwd)
                Config.awardValues[AWARD_Master_Blade + i] = true;
        }
        for (int i = 0; i < Config.heroUpgrades.length; i++) {
            boolean uAwd = true;
            for (int j = 0; j < Config.heroUpgrades[i].length; j++) {
                int lv = Config.unitUpgrades[i][j];
                Config.awardValues[AWARD_Upgrader] |= lv >= 3;
                Config.awardValues[AWARD_Perfect_Upgrader] |= lv >= 10;
                uAwd &= lv >= 10;
                allMax &= uAwd;
            }
            if (uAwd)
                Config.awardValues[AWARD_Legend_Of_Hero] = true;
        }
        Config.awardValues[AWARD_Maximum_morale] = allMax;
    }

    public static void check_time() {
        int mins = (int)(Config.totalPlaytime / 60);
        Config.awardValues[AWARD_Amateur_Defender] |= mins >= 30;

        int hours = mins / 60;
        Config.awardValues[AWARD_High_Class_Defender] |= hours >= 2;
        Config.awardValues[AWARD_Professional_Defender] |= hours >= 5;
        Config.awardValues[AWARD_Defense_Mania] |= hours >= 10;
        Config.awardValues[AWARD_Defense_Master] |= hours >= 20;
        Config.awardValues[AWARD_Defense_Hero] |= hours >= 50;
        Config.awardValues[AWARD_Defense_King] |= hours >= 100;
        Config.awardValues[AWARD_Defense_G_O_D] |= hours >= 200;
    }

    public static void clear_award(int SID) {
        Config.awardValues[AWARD_Champion] |= Config.rewardValues[0];
        Config.awardValues[AWARD_Bow_Master] |= Config.rewardValues[2];
        Config.awardValues[AWARD_Archmage] |= Config.rewardValues[4];
        Config.awardValues[AWARD_Cleared_Forest] |= SID == 9;
        Config.awardValues[AWARD_Cleared_Swamp] |= SID == 19;
        Config.awardValues[AWARD_Cleared_Wilderness] |= SID == 29;
        Config.awardValues[AWARD_Cleared_Volcano] |= SID == 39;
        Config.awardValues[AWARD_Cleared_Ether_Region] |= SID == 49;
        for (int i = 0; i <= 2; i++)
            heroAvail[i] = Config.rewardValues[i * 2];

        check_heroPoint();
        boolean all = true, perfect = true, moon = true;
        for (int j = 0; j < Config.stageProg.length; j++) {//In the real game, time attack and base destroyer clear aren't required for the Crasto Guardian trophy, but that made it no different than EtherRegion clear trophy
            byte[] scores = Config.stageProg[j];
            for (int i = 0; i < 3; i += 2)
                if (scores[i] <= 0) {
                    all = perfect = false; //moonbreak isn't required for perfect either in real game lol
                    moon &= i != 2;
                } else if (scores[i] < 2)
                    perfect = false;
            if (!all && !moon)
                break;
            if (perfect && j == 14)
                Config.awardValues[AWARD_A_Perfectionist] = true;
        }
        if (all)
            Config.awardValues[AWARD_Crasto_s_guardian] = true;
        if (perfect)
            Config.awardValues[AWARD_No_more_Enemy] = true;
        if (moon)
            Config.awardValues[AWARD_Destroyer] = true;
    }

    public static void check_heroPoint() {
        Config.awardValues[AWARD_Brave] |= Config.heroPoints >= 1000;
        Config.awardValues[AWARD_Fighter] |= Config.heroPoints >= 10000;
    }

    public static void check_money(int money) {
        if (money <= Config.top_money)
            return;
        Config.top_money = money;

        Config.awardValues[AWARD_Rich] = Config.top_money >= 5000;
        Config.awardValues[AWARD_Wealthy] = Config.top_money >= 10000;
    }

    public static void check_kill() {
        Config.killCount++;

        Config.awardValues[AWARD_100_Kill] = Config.killCount >= 100;
        Config.awardValues[AWARD_500_Kill] = Config.killCount >= 500;
        Config.awardValues[AWARD_1_000_Kill] = Config.killCount >= 1000;
        Config.awardValues[AWARD_2_000_Kill] = Config.killCount >= 2000;
        Config.awardValues[AWARD_5_000_Kill] = Config.killCount >= 5000;
        Config.awardValues[AWARD_10_000_Kill] = Config.killCount >= 10000;
    }
}
