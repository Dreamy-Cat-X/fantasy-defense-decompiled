package com.sncompany.newtower;

import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

import com.sncompany.newtower.DataClasses.CGPoint;

/* loaded from: D:\decomp\classes.dex */
public class GLGameSurfaceView extends GLSurfaceView {
    public static final int GAME_DRAW_DRAWING = 1;
    public static final int GAME_DRAW_FINISHED = 2;
    public static final int GAME_DRAW_REQUEST = 0;
    public static NewTower newTower;
    public static TouchManager touchManager;

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
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (MotionEvent.ACTION_DOWN >= 0 && action <= MotionEvent.ACTION_MOVE) {
            touchManager.addLastInputPoint(1, 0, CGPoint.CGPointMake((int) ((x / GameRenderer.DRAW_SCALE_SIZE) - GameRenderer.DRAW_SCALE_X_MOVE), (int) ((y / GameRenderer.DRAW_SCALE_SIZE) - GameRenderer.DRAW_SCALE_Y_MOVE)), 1);
            if (action == MotionEvent.ACTION_DOWN)
                touchManager.processTouchEvent(MotionEvent.ACTION_DOWN);
            else
                touchManager.processTouchEvent(action == MotionEvent.ACTION_UP ? MotionEvent.ACTION_MOVE : MotionEvent.ACTION_UP);
            GameThread.touchFlag = true;
        } else
            TouchManager.clearTouchStatus();
        return true;
    }
}
