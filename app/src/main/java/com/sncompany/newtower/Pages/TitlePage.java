package com.sncompany.newtower.Pages;

import android.content.Intent;
import android.net.Uri;

import java.util.function.Consumer;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.DataClasses.CGRect;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.MyScrollbar;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

public class TitlePage extends TPage {

    enum MENUMODE {
        TITLE,
        OPTION,
        ABOUT
    }

    public static final int VOLUMEBAR_START_POS_X = 331;
    public static final int BACK = 0, DEVELOPER = 1, ABOUT_TOTAL = 2;
    public static final int BGM = 1, SFX = 2, INTRO = 3, VIBRATE = 4, CONFIG_TOTAL = 5;
    public static final int START = 0, CONFIG = 1, ABOUT = 2, FACEBOOK = 3, TWITTER = 4, TITLE_TOTAL = 5;
    static final float GLOW_MOVE_DG = 0.05f;
    public static final int[] BOSS_POS = {77, 26, 41, 21, -30};
    private static final int[] countLimit = {17, 2, 7, 2, 7, 2, 17, 2, 15, 30, 30, 10};
    public static final int[] titleResource = {R.drawable.ui_title_background, R.drawable.ui_title_background2, R.drawable.ui_title_mob0, R.drawable.ui_title_mob1, R.drawable.ui_title_mobeye, R.drawable.ui_title_title, R.drawable.ui_title_titleglow, R.drawable.ui_title_titlekorean, R.drawable.ui_title_startoff, R.drawable.ui_title_starton, R.drawable.ui_title_optionoff, R.drawable.ui_title_optionon, R.drawable.ui_title_sncompany, R.drawable.ui_title_about, R.drawable.ui_title_twitter, R.drawable.ui_title_facebook};
    public static final int title_bg = 0, title_bg2 = 1, title_mob0 = 2, title_mob1 = 3, title_mobeye = 4, title_title = 5, title_titleglow = 6, title_titleKR = 7, title_startoff = 8,
            title_starton = 9, title_optionoff = 10, title_optionon = 11, title_sncompany = 12, title_about = 13, title_twitter = 14, title_facebook = 15;
    public static final int[] titleBoss0Resource = {R.drawable.ui_title0_0, R.drawable.ui_title0_1, R.drawable.ui_title0_2, R.drawable.ui_title0_3};
    public static final int[] titleBoss1Resource = {R.drawable.ui_title1_0, R.drawable.ui_title1_1, R.drawable.ui_title1_2, R.drawable.ui_title1_3};
    public static final int[] titleBoss2Resource = {R.drawable.ui_title2_0, R.drawable.ui_title2_1, R.drawable.ui_title2_2, R.drawable.ui_title2_3};
    public static final int[] titleBoss3Resource = {R.drawable.ui_title3_0, R.drawable.ui_title3_1, R.drawable.ui_title3_2, R.drawable.ui_title3_3};
    public static final int[] titleBoss4Resource = {R.drawable.ui_title4_0, R.drawable.ui_title4_1, R.drawable.ui_title4_2, R.drawable.ui_title4_3};
    public static final int[][] BossResources = {titleBoss0Resource, titleBoss1Resource, titleBoss2Resource, titleBoss3Resource, titleBoss4Resource};

    private final Texture2D[] titleImage = new Texture2D[titleResource.length];
    private final Texture2D[] titleBossImage = new Texture2D[titleBoss0Resource.length];
    private int gameTitleViewCount = 0, gameSubStatus = 0, GAME_TITLE_BOSS_VIEW_POS = 0;
    private MENUMODE mode = MENUMODE.TITLE;
    private final MyScrollbar[] soundBars = new MyScrollbar[2];

    public TitlePage(TPage p) {
        super(p);
        soundBars[0] = new MyScrollbar(VOLUMEBAR_START_POS_X, 679, 0, Config.musicMaxVolume);
        soundBars[0].setReverseUpdatePosition(Config.musicVolume); //Used at title page, for music vol
        soundBars[1] = new MyScrollbar(VOLUMEBAR_START_POS_X, 679, 0, Config.musicMaxVolume); //Used at TitlePage, for SE vol
        soundBars[1].setReverseUpdatePosition(Config.effectVolume);
        for (int i = 0; i < titleBossImage.length; i++)
            titleBossImage[i] = new Texture2D();
        resetAnimations();
    }

    public void resetAnimations() {
        gameTitleViewCount = gameSubStatus = 0;
    }

    @Override
    public void load(Consumer<Float> prog) {
        int tot = titleImage.length + titleBossImage.length;
        //Due to how loading page works, it loads pre-emptively
        alwaysImage[ALWAYS_R_BG].initWithImageName(alwaysResource[ALWAYS_R_BG]);
        reloadBoss(prog, tot);
        loadP(titleImage, titleResource, prog, titleBossImage.length + 1, tot);
        loaded = true;
    }

    public void reloadBoss(Consumer<Float> prog, int tot) {
        int random = NewTower.getRandom(5);
        GAME_TITLE_BOSS_VIEW_POS = BOSS_POS[random];
        loadP(titleBossImage, BossResources[random], prog, 1, tot);
    }

    @Override
    public void onReload() {
        gameSubStatus = gameTitleViewCount = 0;
        reloadBoss(null, 0);
    }

    @Override
    public void unload() {
        for (Texture2D timg : titleImage)
            timg.dealloc();
        for (Texture2D timg : titleBossImage)
            timg.dealloc();
        loaded = false;
    }

    @Override
    public void update() {
        if (gameSubStatus == countLimit.length || mode != MENUMODE.TITLE) //countLimit length is 12
            return;
        gameTitleViewCount++;
        if (gameTitleViewCount >= countLimit[gameSubStatus]) {
            gameSubStatus++;
            gameTitleViewCount = 0;
            if (gameSubStatus == countLimit.length)
                GameThread.playLoopSound(0);
        }
    }

    @Override
    public void paint(GL10 gl10, boolean init) {
        int cTLS = TouchManager.checkTouchListStatus();
        TouchManager.clearTouchMap();

        if (mode == MENUMODE.TITLE) {
            float f = GameThread.gameTimeCount % 40 <= 20 ? (GameThread.gameTimeCount % 40) * GLOW_MOVE_DG : 1 - (((GameThread.gameTimeCount % 40) - 20) * GLOW_MOVE_DG);
            if (gameSubStatus == 12) {
                TouchManager.addTouchRectListData(START, CGRect.make(296, 337, 208, 48));
                TouchManager.addTouchRectListData(CONFIG, CGRect.make(326, 412, 148, 36));
                TouchManager.addTouchRectListData(ABOUT, CGRect.make(9, 429, 42, 42));
                TouchManager.addTouchRectListData(TWITTER, CGRect.make(56, 429, 42, 42));
                TouchManager.addTouchRectListData(FACEBOOK, CGRect.make(104, 429, 42, 42));
            } else
                TouchManager.addTouchRectListData(START, CGRect.make(0, 0, 800, 480));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = TITLE_TOTAL;

            if (gameSubStatus >= 8) switch (gameSubStatus) {
                case 8: {
                    float bPos = (((GAME_TITLE_BOSS_VIEW_POS - ((int) titleBossImage[0]._sizeY)) - ((int) titleBossImage[1]._sizeY)) - ((int) titleBossImage[2]._sizeY)) - ((int) titleBossImage[3]._sizeY);

                    float alpha = 1 - (gameTitleViewCount * 0.066f);
                    titleImage[title_bg].drawAtPointOption(0, 0, 18);
                    titleBossImage[2].drawAtPointOption(0, ((int) titleBossImage[0]._sizeY) + bPos + ((int) titleBossImage[1]._sizeY), 18);
                    titleBossImage[3].drawAtPointOption(0, bPos + ((int) titleBossImage[0]._sizeY) + ((int) titleBossImage[1]._sizeY) + ((int) titleBossImage[2]._sizeY), 18);
                    if (alpha > 0) {
                        Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                        Texture2D.setColors(alpha);
                        fillWhiteImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                        Texture2D.setColors(1);
                    }
                    titleImage[title_mob1].drawAtPointOption(0, 9, 18);
                    titleImage[title_mobeye].drawAtPointOption(64, 38, 18);
                    break;
                } case 9: {
                    float bPos = Math.min(GAME_TITLE_BOSS_VIEW_POS, ((((GAME_TITLE_BOSS_VIEW_POS - ((int) titleBossImage[0]._sizeY)) - ((int) titleBossImage[1]._sizeY)) - ((int) titleBossImage[2]._sizeY)) - ((int) titleBossImage[3]._sizeY)) + (gameTitleViewCount * 54));

                    titleImage[title_bg].drawAtPointOption(0, 0, 18);
                    titleBossImage[0].drawAtPointOption(0, bPos, 18);
                    titleBossImage[1].drawAtPointOption(0, ((int) titleBossImage[0]._sizeY) + bPos, 18);
                    titleBossImage[2].drawAtPointOption(0, ((int) titleBossImage[0]._sizeY) + bPos + ((int) titleBossImage[1]._sizeY), 18);
                    titleBossImage[3].drawAtPointOption(0, bPos + ((int) titleBossImage[0]._sizeY) + ((int) titleBossImage[1]._sizeY) + ((int) titleBossImage[2]._sizeY), 18);

                    int y1 = (gameTitleViewCount * 108) + 9;
                    titleImage[title_mob1].drawAtPointOption(0, y1, 18);
                    int y2 = (gameTitleViewCount * 108) + 38;
                    titleImage[title_mobeye].drawAtPointOption(64, y2, 18);
                    break;
                } case 10:
                    titleImage[title_bg].drawAtPointOption(0, 0, 18);
                    titleImage[title_bg2].drawAtPointOption(0, 0, 18);
                    titleBossImage[0].drawAtPointOption(0, GAME_TITLE_BOSS_VIEW_POS, 18);
                    titleBossImage[1].drawAtPointOption(0, GAME_TITLE_BOSS_VIEW_POS + ((int) titleBossImage[0]._sizeY), 18);
                    titleImage[title_titleKR].drawAtPointOption(277, 30, 18);
                    titleImage[title_title].drawAtPointOption(41, 22, 18);

                    Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                    Texture2D.setColors(f);
                    titleImage[title_titleglow].drawAtPointOption(24, 6, 18);
                    Texture2D.setColors(1);
                    if (f > 0) {
                        Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                        Texture2D.setColors(f);
                        fillWhiteImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                        Texture2D.setColors(1);
                        break;
                    }
                    break;
                case 11:
                    titleImage[title_bg].drawAtPointOption(0, 0, 18);
                    titleImage[title_bg2].drawAtPointOption(0, 0, 18);
                    titleBossImage[0].drawAtPointOption(0, GAME_TITLE_BOSS_VIEW_POS, 18);
                    titleBossImage[1].drawAtPointOption(0, GAME_TITLE_BOSS_VIEW_POS + ((int) titleBossImage[0]._sizeY), 18);
                    titleImage[title_titleKR].drawAtPointOption(277, 30, 18);
                    titleImage[title_title].drawAtPointOption(41, 22, 18);

                    Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                    Texture2D.setColors(f);
                    titleImage[title_titleglow].drawAtPointOption(24, 6, 18);
                    Texture2D.setColors(1f);
                    float alp = gameTitleViewCount * 0.1f;
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                    Texture2D.setColors(alp);
                    titleImage[title_startoff].drawAtPointOption(296, 337, 18);
                    titleImage[title_optionoff].drawAtPointOption(326, 412, 18);
                    titleImage[title_sncompany].drawAtPointOption(GameRenderer.CX, 456, 17);
                    titleImage[title_about].drawAtPointOption(9, 429, 18);
                    titleImage[title_twitter].drawAtPointOption(56, 429, 18);
                    titleImage[title_facebook].drawAtPointOption(104, 429, 18);
                    Texture2D.setColors(1);
                    break;
                case 12:
                    titleImage[title_bg].drawAtPointOption(0, 0, 18);
                    titleImage[title_bg2].drawAtPointOption(0, 0, 18);
                    titleBossImage[0].drawAtPointOption(0, GAME_TITLE_BOSS_VIEW_POS, 18);
                    titleBossImage[1].drawAtPointOption(0, GAME_TITLE_BOSS_VIEW_POS + ((int) titleBossImage[0]._sizeY), 18);
                    titleImage[title_titleKR].drawAtPointOption(277, 30, 18);
                    titleImage[title_title].drawAtPointOption(41, 22, 18);

                    Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                    Texture2D.setColors(f);
                    titleImage[title_titleglow].drawAtPointOption(24, 6, 18);
                    Texture2D.setColors(1);

                    titleImage[cTLS == 0 ? 9 : 8].drawAtPointOption(296, 337, 18);
                    titleImage[cTLS == 1 ? 11 : 10].drawAtPointOption(326, 412, 18);
                    titleImage[title_sncompany].drawAtPointOption(GameRenderer.CX, 456, 17);
                    titleImage[title_about].drawAtPointOption(9, 429, 18);
                    titleImage[title_twitter].drawAtPointOption(56, 429, 18);
                    titleImage[title_facebook].drawAtPointOption(104, 429, 18);
                    break;
            } else if (gameSubStatus % 2 == 0) {
                titleImage[title_bg].drawAtPointOption(0, 0, 18);
                titleImage[title_mob0].drawAtPointOption(0, 9, 18);
                titleImage[title_mobeye].drawAtPointOption(64, 38, 18);
            } else {
                fillWhiteImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                titleImage[title_mob1].drawAtPointOption(0, 9, 18);
                titleImage[title_mobeye].drawAtPointOption(64, 38, 18);
            }
        } else if (mode == MENUMODE.OPTION) {
            TouchManager.addTouchRectListData(BACK, CGRect.make(11, 412, 68, 58));
            TouchManager.addTouchRectListData(BGM, CGRect.make(310, 140, 390, 40));
            TouchManager.addTouchRectListData(SFX, CGRect.make(310, 225, 390, 40));
            TouchManager.addTouchRectListData(INTRO, CGRect.make(218, 307, 118, 46));
            TouchManager.addTouchRectListData(VIBRATE, CGRect.make(583, 307, 118, 46));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = CONFIG_TOTAL;

            alwaysImage[ALWAYS_R_BG].drawAtPointOption(0, 0, 18);
            uiEtcImage[etc_option].drawAtPointOption(GameRenderer.CX, 6, 17);
            uiEtcImage[etc_optionbody].drawAtPointOption(GameRenderer.CX, 77, 17);

            uiEtcImage[Config.movie ? etc_onon : etc_offoff].drawAtPointOption(218, 307, 18);
            uiEtcImage[Config.vibration ? etc_onon : etc_offoff].drawAtPointOption(583, 307, 18);

            uiEtcImage[etc_scrollbutton].drawAtPointOption(soundBars[0].BarLastPosition, 159, 9);
            uiEtcImage[etc_scrollbutton].drawAtPointOption(soundBars[1].BarLastPosition, 244, 9);
            uiEtcImage[cTLS == 0 ? etc_back_on : etc_back_off].drawAtPointOption(11, 412, 18);
        } else {
            TouchManager.addTouchRectListData(BACK, CGRect.make(11, 412, 68, 58));
            TouchManager.addTouchRectListData(DEVELOPER, CGRect.make(340, 130, 260, 50));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = ABOUT_TOTAL;

            alwaysImage[ALWAYS_R_BG].drawAtPointOption(0, 0, 18);
            uiEtcImage[etc_window].drawAtPointOption(GameRenderer.CX, 77, 17);
            if (gameSubStatus == 0) {
                uiEtcImage[etc_about].drawAtPointOption(GameRenderer.CX, 5, 17);
                GameRenderer.setFontSize(20);
                GameRenderer.setFontColor(-1);
                GameRenderer.drawStringM("'Fantasy Defence' Version 2.0.1", GameRenderer.CX, 100, 17);
                GameRenderer.drawStringM("Developed by SN Mobile Technology Inc.", GameRenderer.CX, 150, 17);
                GameRenderer.drawStringM("Copyright 2011", GameRenderer.CX, 175, 17);
                GameRenderer.drawStringM("SN Mobile Technology", GameRenderer.CX, 200, 17);
                GameRenderer.drawStringM("All rights reserved", GameRenderer.CX, 225, 17);
                GameRenderer.drawStringM("For support, please contact", GameRenderer.CX, 250, 17);
                GameRenderer.drawStringM("cs@sncompany.com", GameRenderer.CX, 275, 17);
            } else if (gameSubStatus == 1) {
                uiEtcImage[etc_developer].drawAtPointOption(GameRenderer.CX, 5, 17);
                GameRenderer.setFontSize(20);
                GameRenderer.setFontColor(-1);
                GameRenderer.drawStringM("General Director : Dong Hwa, Woo.", GameRenderer.CX, 140, 17);
                GameRenderer.drawStringM("Producer : Min Young, Han.", GameRenderer.CX, 165, 17);
                GameRenderer.drawStringM("Programmer : Haeng Bok, Lee.", GameRenderer.CX, 190, 17);
                GameRenderer.drawStringM("Artist : Han Joo, Kang.", GameRenderer.CX, 215, 17);
                GameRenderer.drawStringM("Game Designer : Min Young, Han.", GameRenderer.CX, 240, 17);
                GameRenderer.drawStringM("Sub. Game Designer : Jin Kook, Park.", GameRenderer.CX, 265, 17);
                GameRenderer.drawStringM("Production Company : SN Mobile Technology.", GameRenderer.CX, 290, 17);
            }
            uiEtcImage[cTLS == 0 ? etc_back_on : etc_back_off].drawAtPointOption(11, 412, 18);
        }
        TouchManager.swapTouchMap();
    }

    @Override
    public void touchCheck() {
        if (mode == MENUMODE.OPTION) {
            if (TouchManager.lastActionStatus == TouchManager.TOUCH_STATUS_NO_INPUT) {
                CGPoint action = TouchManager.getFirstFirstActionTouch();
                int cTLS = TouchManager.checkTouchListStatus();
                if (cTLS == BGM) {
                    soundBars[0].setUpdatePosition(action.x);
                    Config.updateVolume(soundBars[0].BarLastValue);
                } else if (cTLS == SFX) {
                    soundBars[1].setUpdatePosition(action.x);
                    Config.effectVolume = soundBars[1].BarLastValue;
                }
            } else if (TouchManager.lastActionStatus == TouchManager.TOUCH_STATUS_START_INPUTED) {
                int cTLP = TouchManager.checkTouchListPressed(TouchManager.getFirstFirstActionTouch());
                if (cTLP == BGM) {
                    soundBars[0].setUpdatePosition(TouchManager.getFirstLastActionTouch().x);
                    Config.updateVolume(soundBars[0].BarLastValue);
                    return;
                }
                if (cTLP != SFX)
                    return;

                soundBars[1].setUpdatePosition(TouchManager.getFirstLastActionTouch().x);
                Config.effectVolume = soundBars[1].BarLastValue;
                return;
            }
            if (TouchManager.lastActionStatus != TouchManager.TOUCH_STATUS_START_PROCESSED)
                return;

            int cTLS = TouchManager.checkTouchListStatus();
            if (cTLS == BACK) {
                mode = MENUMODE.TITLE;
                gameSubStatus = countLimit.length;
                gameTitleViewCount = 0;
                reloadBoss(null, 0);
                GameThread.playSound(15);
            } else if (cTLS == INTRO) {
                GameThread.playSound(14);
                Config.movie = !Config.movie;
            } else if (cTLS == VIBRATE) {
                GameThread.playSound(14);
                Config.vibration = !Config.vibration;
            }
            int cTLP = TouchManager.checkTouchListPressed(TouchManager.getFirstFirstActionTouch());
            if (cTLP == BGM) {
                soundBars[0].setUpdatePosition(TouchManager.getFirstLastActionTouch().x);
                Config.updateVolume(soundBars[0].BarLastValue);
            } else if (cTLP == SFX) {
                soundBars[1].setUpdatePosition(TouchManager.getFirstLastActionTouch().x);
                Config.effectVolume = soundBars[1].BarLastValue;
            }
            Config.saveAll();
            return;
        }
        if (TouchManager.lastActionStatus != TouchManager.TOUCH_STATUS_START_PROCESSED)
            return;

        int cTLS = TouchManager.checkTouchListStatus();
        if (mode == MENUMODE.TITLE) {
            if (gameSubStatus < countLimit.length) {
                if (TouchManager.checkTouchListStatus() == 0) {
                    gameSubStatus = countLimit.length;
                    gameTitleViewCount = 0;
                    GameThread.playLoopSound(0);
                }
            } else {
                if (cTLS == START) {
                    GameThread.playSound(14);
                    GameThread.stopLoopSound(0);
                    NewTower.switchPage(new MenuPage(this), true);
                    TouchManager.curruptFlag = true;
                } else if (cTLS == CONFIG) {
                    GameThread.playSound(14);
                    mode = MENUMODE.OPTION;
                } else if (cTLS == ABOUT) {
                    GameThread.playSound(14);
                    mode = MENUMODE.ABOUT;
                    gameSubStatus = 0;
                } else if (cTLS == FACEBOOK) //TODO - Delete
                    GameThread.newTower.startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("http://www.facebook.com/fandikor")), 1);
                else if (cTLS == TWITTER) //TODO - Delete
                    GameThread.newTower.startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("http://www.twitter.com/fandi_kor")), 1);
            }
        } else {
            if (gameSubStatus != 0) {
                if (cTLS == BACK) {
                    gameSubStatus = 0;
                    GameThread.playSound(15);
                }
            } else if (cTLS == BACK) {
                mode = MENUMODE.TITLE;
                gameSubStatus = countLimit.length;
                gameTitleViewCount = 0;
                reloadBoss(null, 0);
                GameThread.playSound(15);
            } else if (cTLS == DEVELOPER)
                gameSubStatus = 1;
        }
    }
}
