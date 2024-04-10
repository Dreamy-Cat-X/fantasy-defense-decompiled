package com.sncompany.newtower.Pages;

import androidx.core.util.Consumer;

import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

public class LoadingPage extends TPage {

    static final String[] TIP_TEXT = {"Tip 1  : Equip the item on your Hero under the [Item] > [Equipment] menu.",
            "Tip 2  : Clear stages and acquire up to 3 Heroes.",
            "Tip 3  : Certain stages reward you with a Hero character.",
            "Tip 4  : Use Mana to increase the levels of your Heroes.",
            "Tip 5  : Heroes consume Mana to use their special skills.",
            "Tip 6  : Special skills have a downtime after each use.",
            "Tip 7  : Clear a stage to receive Hero Points.",
            "Tip 8  : Configure your game settings under the [Title Screen] > Settings.",
            "Tip 9  : Basic units can be upgraded up to Level 3.",
            "Tip 10 : Hero units can be upgraded up to Level 5.",
            "Tip 11 : Upgrade your units to give them stronger abilities.",
            "Tip 12 : Use gold to advance your units to higher classes or increase their levels.",
            "Tip 13 : Increase the level of your units to improve their combat capabilities.",
            "Tip 14 : Advance your units to higher classes for more versatile abilities. ",
            "Tip 15 : Reselling a unit returns to you a portion _ of the money that you spent to hire the unit.",
            "Tip 16 : You will fail a Boss stage if you fail to defeat the bosses.",
            "Tip 17 : Boss monsters have high HP, but they move slowly.",
            "Tip 18 : Monsters drop gold and mana upon death.",
            "Tip 19 : Use Hero Points to buy items under [Item] > [Shop].",
            "Tip 20 : Use Hero Points to upgrade your Hero and basic units under the [Skill] menu.",
            "Tip 21 : Knights, the 2nd advanced class of Warrior,_have high Attack Speed.",
            "Tip 22 : Warlords, the 3rd advanced class of Warrior,_inflict Splashed damage to multiple enemies.",
            "Tip 23 : Special Warrior Brandishers attack monsters with a chance of causing Stun.",
            "Tip 24 : Splatters, the 2nd advanced class of Archer,_shoot multi arrows and attack up to 3 enemies at the same time.",
            "Tip 25 : Sky Arrows, the 3rd advanced class of Archer,_strike enemies with their extremely Long Attack Range.",
            "Tip 26 : Special Archer Holy Eyes specialize in DoT (Damage over Time) attacks.",
            "Tip 27 : Sorceresses, the 2nd advanced class of Wizard, inflict Piercing damage.",
            "Tip 28 : Blasters, the 3rd advanced class of Wizard,_inflict Splashed damage with their Fire magic.",
            "Tip 29 : Special Wizard Ice Mages attack monsters with a chance of causing Slow.",
            "Tip 30 : Clear all the normal stages to unlock two special modes: _ Destroy the Moon and Infinite.",
            "Tip 31 : A stage's Infinite Mode is only opened_when you clear it with a perfect score.",
            "Tip 32 : The objective of Destroy the Moon is to destroy_the monster gates where monsters spawn.",
            "Tip 33 : Destroy stage objects to obtain gold and mana.",
            "Tip 34 : When clearing a normal stage more than twice,_you will receive only 70% of the Hero Point reward from the stage.",
            "Tip 35 : Touch a monster or object to manually attack it.",
            "Tip 36 : Blasters, the 3rd advanced class of Wizard,_inflict Splashed damage with their Fire magic.",
            "Tip 37 : Special Wizard Ice Mages attack monsters with a chance of causing Slow.",
            "Tip 38 : You will receive a Hero unit or additional ability_each time you clear 5 stages.",
            "Tip 39 : Clear 25 stages to upgrade your units up to 10 levels.",
            "Tip 40 : Clear 5 stages to unlock the special skill of your Hero units.",
            "Tip 41 : Clear 30 stages to unlock the special attack ability_of your Hero units. (Splashed damage or Double Shot)",
            "Tip 42 : Never hesitate to upgrade your Heroes and basic units_when facing a difficult stage.",
            "Tip 43 : Certain stages contain special items for you to discover.",
            "Tip 44 : Cash items endow special abilities."};
    private float prog = 0f;
    private final int loadingViewType;
    private int loadTipNumber;
    public static final int[] uiLoadingResource = {R.drawable.ui_loading_outline, R.drawable.ui_loading_blackline, R.drawable.ui_loading_loadingline, R.drawable.ui_loading_whiteline};
    public static final int[] uiCharFaceResource = {R.drawable.ui_char_face_warrior, R.drawable.ui_char_face_manatarms, R.drawable.ui_char_face_knight, R.drawable.ui_char_face_warlord, R.drawable.ui_char_face_archer, R.drawable.ui_char_face_holyeye, R.drawable.ui_char_face_splatter, R.drawable.ui_char_face_skybeholder, R.drawable.ui_char_face_wizard, R.drawable.ui_char_face_colddiviner, R.drawable.ui_char_face_warlock, R.drawable.ui_char_face_magmablaster, R.drawable.ui_char_face_hero0, R.drawable.ui_char_face_hero1, R.drawable.ui_char_face_hero2};
    public static final int[] uiCharNameResource = {R.drawable.ui_char_name_warrior, R.drawable.ui_char_name_manatarms, R.drawable.ui_char_name_knight, R.drawable.ui_char_name_warlord, R.drawable.ui_char_name_archer, R.drawable.ui_char_name_holyeye, R.drawable.ui_char_name_splatter, R.drawable.ui_char_name_skybeholder, R.drawable.ui_char_name_wizard, R.drawable.ui_char_name_colddiviner, R.drawable.ui_char_name_warlock, R.drawable.ui_char_name_blaster, R.drawable.ui_char_name_hero0, R.drawable.ui_char_name_hero1, R.drawable.ui_char_name_hero2};
    public static final int[] loadingUnitAdjustPos = {-57, -31, -54, -50, -45, -46, -36, -41, -30, -49, -43, -45};
    private final Texture2D[] uiLoadingImage = new Texture2D[uiLoadingResource.length];
    private final Texture2D[] uiCharNameImage = new Texture2D[uiCharNameResource.length];
    private final Texture2D[] uiCharFaceImage = new Texture2D[uiCharFaceResource.length];
    private final Consumer<Float> con = (d -> prog = d);

    public LoadingPage(TPage par) {
        super(par);
        reloadTip();
        loadingViewType = NewTower.getRandom(6);

        //Due to how loading page works, it loads pre-emptively
        alwaysImage[0].initWithImageName(alwaysResource[0]);
        for (int i = 0; i < uiLoadingImage.length; i++)
            uiLoadingImage[i] = new Texture2D(uiLoadingResource[i]);

        if (loadingViewType < 3) {
            alwaysImage[loadingViewType + 1].initWithImageName(alwaysResource[loadingViewType + 1]);
            uiCharNameImage[loadingViewType + 12] = new Texture2D(uiCharNameResource[loadingViewType + 12]);
        } else {
            for (int tp = 0; tp < 4; tp++) {
                int cat = ((loadingViewType - 3) * 4) + tp;
                uiCharFaceImage[cat] = new Texture2D(uiCharFaceResource[cat]);
                uiCharNameImage[cat] = new Texture2D(uiCharNameResource[cat]);
            }
        }
        loaded = true;
    }

    @Override
    public void load(Consumer<Float> prog) {
        parent.load(con);
        NewTower.switchPage(parent, true);
    }

    @Override
    public void unload() {
        alwaysImage[0].dealloc();
        for (Texture2D t2d : uiLoadingImage)
            t2d.dealloc();

        if (loadingViewType < 3) {
            alwaysImage[loadingViewType + 1].dealloc();
            uiCharNameImage[loadingViewType + 12].dealloc();
        } else {
            for (int tp = 0; tp < 4; tp++) {
                int cat = ((loadingViewType - 3) * 4) + tp;
                uiCharFaceImage[cat].dealloc();
                uiCharNameImage[cat].dealloc();
            }
        }
        loaded = true;
    }

    @Override
    public void update() {
    }

    @Override
    public void paint(GL10 gl10, boolean init) {
        if (alwaysImage[0].name == -1 || uiLoadingImage[0].name == -1 || uiLoadingImage[1].name == -1 || uiLoadingImage[2].name == -1)
            return;
        int uiname = loadingViewType < 3 ? 12 + loadingViewType : (loadingViewType - 3) * 4;

        alwaysImage[0].drawAtPointOption(0.0f, 0.0f, 18);
        if (loadingViewType < 3) {
            alwaysImage[loadingViewType + 1].drawAtPointOption(GameRenderer.CX, GameRenderer.SCRHEIGHT_SMALL, 33);
            uiCharNameImage[uiname].drawAtPointOption(9.0f, 10.0f, 18);
        } else {
            uiLoadingImage[3].drawAtPointOption(0.0f, 329.0f, 18);
            for (int i = 0; i < 4; i++) {
                int uin = uiname + i;
                int px = (GameRenderer.SCRHEIGHT_SMALL / 4) * i;
                uiCharFaceImage[uin].drawAtPointOptionGuide(loadingUnitAdjustPos[uin] + px, 328.0f, 34, GameRenderer.CGRectMake(px, 0.0f, 200.0f, 328.0f));
                uiCharNameImage[uin].drawAtPointOption(px + 100, 335.0f, 17);
            }
        }
        uiLoadingImage[0].drawAtPointOption(7.0f, 428.0f, 18);
        uiLoadingImage[1].drawAtPointOption(10.0f, 460.0f, 18);
        uiLoadingImage[2].drawAtPointOptionGuide(10.0f, 460.0f, 18, GameRenderer.CGRectMake(10.0f, 460.0f, prog * 780, 10.0f));
        GameRenderer.setFontColor(-1);
        GameRenderer.setFontSize(17);
        String[] split = TIP_TEXT[loadTipNumber].split("_");
        GameRenderer.drawFont.getTextBounds(TIP_TEXT[loadTipNumber], 0, TIP_TEXT[loadTipNumber].length(), Texture2D.bounds_);
        int boundsize = Texture2D.bounds_.right - Texture2D.bounds_.left;
        Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
        Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
        fillBlackImage.fillRect((GameRenderer.CX - (boundsize / 2f)) - 5, 380.0f, boundsize + 10, split.length * 27);
        Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        for (int part = 0; part < split.length; part++)
            GameRenderer.drawStringDoubleM(split[part], 385.0f, (part * 21) + 387, 17);
    }

    @Override
    public void touchCheck() {
        if (TouchManager.lastActionStatus != TouchManager.TOUCH_STATUS_START_PROCESSED)
            return;

        reloadTip();
    }

    private void reloadTip() {
        loadTipNumber = NewTower.getRandom(TIP_TEXT.length);
    }
}
