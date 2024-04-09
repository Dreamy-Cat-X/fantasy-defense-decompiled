package com.sncompany.newtower;

import android.content.Intent;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.util.Log;
import android.view.MotionEvent;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;

import com.sncompany.newtower.DataClasses.CGPoint;

/* loaded from: D:\decomp\classes.dex */
public class GLGameSurfaceView extends GLSurfaceView {
    public static final int GAME_DRAW_DRAWING = 1;
    public static final int GAME_DRAW_FINISHED = 2;
    public static final int GAME_DRAW_REQUEST = 0;
    public static boolean firstResumeDone = false;
    public static NewTower newTower;
    public static TouchManager touchManager;
    public static int touchStart_GAME_SHOP_EQUIP_NUM;

    public GLGameSurfaceView(NewTower newTower2, GameRenderer gameRenderer) {
        super(newTower2);
        getHolder().setType(0);
        getHolder().setKeepScreenOn(true);
        setRenderer(gameRenderer);
        setRenderMode(0);
        setFocusableInTouchMode(true);
        touchManager = new TouchManager(true);
        newTower = newTower2;
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        super.onPause();
        GameThread.stopLoopSound(0);
        GameThread.stopLoopSound(1);
        GameThread.stopLoopSound(2);
        GameThread.pauseFlag = true;
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        GameThread.pauseFlag = false;
        if (firstResumeDone) {
            Log.d("RESUME", "STATUS " + GameThread.gameLoadFlag + "," + GameThread.loadingStatus + "," + GameThread.gameStatus);
            int i = GameThread.gameLoadFlag;
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                switch (GameThread.gameStatus) {
                    case 0:
                    case 1:
                    case 2:
                        GameThread.gameLoadFlag = 0;
                        GameThread.loadingStatus = 1001;
                        GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                        GameRenderer.loadCount_GAME_PRE_IMAGE_LOAD = 0;
                        GameRenderer.loadingViewType = GameThread.getRandom(6);
                        return;
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        GameRenderer.loadCount_GAME_RESUME_TO_MENU = 0;
                        GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                        GameRenderer.loadingViewType = GameThread.getRandom(6);
                        GameThread.gameLoadFlag = 0;
                        GameThread.loadingStatus = 1007;
                        return;
                    case 4:
                    default:
                        return;
                    case 10:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        GameThread.myWaveRunFlag = false;
                        GameRenderer.loadCount_GAME_RESUME_TO_PLAY = 0;
                        GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                        GameRenderer.loadingViewType = GameThread.getRandom(6);
                        GameThread.gameLoadFlag = 0;
                        GameThread.loadingStatus = 1008;
                        return;
                }
            }
            switch (GameThread.loadingStatus) {
                case 1001:
                    GameThread.gameLoadFlag = 0;
                    GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                    GameRenderer.loadCount_GAME_PRE_IMAGE_LOAD = 0;
                    GameRenderer.loadingViewType = GameThread.getRandom(6);
                    return;
                case 1002:
                    GameThread.gameLoadFlag = 0;
                    GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                    GameRenderer.loadCount_GAME_PRE_TOTAL_IMAGE_LOAD = 0;
                    GameRenderer.loadingViewType = GameThread.getRandom(6);
                    return;
                case 1003:
                    GameThread.gameStatus = 3;
                    GameThread.gameSubStatus = 0;
                    GameThread.gameTitleViewCount = 0;
                    GameRenderer.loadCount_GAME_RESUME_TO_MENU = 0;
                    GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                    GameRenderer.loadingViewType = GameThread.getRandom(6);
                    GameThread.gameLoadFlag = 0;
                    GameThread.loadingStatus = 1007;
                    return;
                case 1004:
                    GameThread.gameStatus = 10;
                    GameThread.gameSubStatus = 0;
                    GameRenderer.startViewCount = 0;
                    GameThread.mapAttackType = 0;
                    GameThread.loadMap((GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber, true);
                    GameThread.playLoopSound(1);
                    GameRenderer.loadCount_GAME_RESUME_TO_PLAY = 0;
                    GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                    GameRenderer.loadingViewType = GameThread.getRandom(6);
                    GameThread.gameLoadFlag = 0;
                    GameThread.loadingStatus = 1008;
                    return;
                case GameThread.GAME_PLAY2_IMAGE_LOAD /* 1005 */:
                    GameThread.characterMenuSelectFlag = 0;
                    GameThread.clearMonsterUnit();
                    GameThread.clearTowerUnit();
                    GameThread.clearEffectUnit();
                    GameThread.clearArrowUnit();
                    GameThread.myMoney = PathInterpolatorCompat.MAX_NUM_POINTS;
                    GameThread.myMana = 1000;
                    GameThread.myLife = 20;
                    GameThread.maxLife = GameThread.myLife;
                    GameThread.commonTargetType = -1;
                    GameThread.myOscillator[0].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                    GameThread.myOscillator[1].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                    GameThread.myOscillator[2].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                    GameThread.myOscillator[3].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                    GameThread.myOscillator[4].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                    GameThread.myOscillator[5].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                    GameThread.myOscillator[6].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                    GameThread.myOscillator[7].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                    GameThread.myOscillator[8].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                    GameThread.myOscillator[9].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                    GameThread.myOscillator[10].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                    for (int i2 = 0; i2 < 11; i2++) {
                        GameThread.myOscillator[i2].fastForward();
                    }
                    GameThread.gameStatus = 26;
                    GameThread.gameSubStatus = 1;
                    GameThread.characterMenuSelectFlag = 0;
                    GameThread.stopLoopSound(1);
                    GameRenderer.loadCount_GAME_RESUME_TO_PLAY = 0;
                    GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                    GameRenderer.loadingViewType = GameThread.getRandom(6);
                    GameThread.gameLoadFlag = 0;
                    GameThread.loadingStatus = 1008;
                    return;
                case 1006:
                    GameThread.gameStatus = 5;
                    GameThread.myOscillator[11].initWithTwoWayStartPosition(-150, 0, 15, 30, 10);
                    GameRenderer.loadCount_GAME_RESUME_TO_MENU = 0;
                    GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                    GameRenderer.loadingViewType = GameThread.getRandom(6);
                    GameThread.gameLoadFlag = 0;
                    GameThread.loadingStatus = 1007;
                    return;
                case 1007:
                    GameRenderer.loadCount_GAME_RESUME_TO_MENU = 0;
                    return;
                case 1008:
                    GameRenderer.loadCount_GAME_RESUME_TO_PLAY = 0;
                    return;
                default:
                    return;
            }
        }
        firstResumeDone = true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action >= 0 && action <= 2) {
            touchManager.addLastInputPoint(1, 0, GameRenderer.CGPointMake((int) ((x / GameRenderer.DRAW_SCALE_SIZE) - GameRenderer.DRAW_SCALE_X_MOVE), (int) ((y / GameRenderer.DRAW_SCALE_SIZE) - GameRenderer.DRAW_SCALE_Y_MOVE)), 1);
            if (action == 0)
                touchManager.processTouchEvent(0);
            else
                touchManager.processTouchEvent(action == 1 ? 2 : 1);
            touchCheckTOTAL();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void touchCheckTOTAL() {
        if (NewTower.currentPage != null)
            NewTower.currentPage.touchCheck();
        TouchManager.processTouchStatus();
    }
}
