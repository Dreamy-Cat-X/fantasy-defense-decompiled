package com.sncompany.newtower;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Paint;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Vibrator;
import android.util.Log;
import android.view.KeyEvent;

import com.sncompany.newtower.Pages.CinematicPage;
import com.sncompany.newtower.Pages.LoadingPage;
import com.sncompany.newtower.Pages.MenuPage;
import com.sncompany.newtower.Pages.TPage;
import com.sncompany.newtower.Pages.TitlePage;

import java.util.Arrays;

/* loaded from: D:\decomp\classes.dex */
public class NewTower extends Activity {

    public static GameRenderer gameRenderer = null;
    public static GameThread gameThread = null;
    public static GLGameSurfaceView glGameSurfaceView = null;
    public static boolean initActivityFirstFlag = false;
    public static Vibrator vibe;
    public static PowerManager.WakeLock wl;
    private String ErrorTitle = "";
    private String ErrorMessage = "";

    public static TPage currentPage;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        doFullScreen();
        initActivity();
    }

    private void doFullScreen() {
        getWindow().getDecorView().setSystemUiVisibility(3846);
    }

    public static void switchPage(TPage p, boolean unload) {
        if (!p.loaded) {
            LoadingPage lp = new LoadingPage(p);
            lp.load(null);
            switchPage(lp, unload);
            return;
        } else
            p.onReload();

        TPage par = currentPage;
        currentPage = p;
        if (unload)
            unloadRec(par);
    }

    private static boolean checkAncestry(TPage p, TPage targ) {
        if (p == targ)
            return true;
        if (p.parent == null)
            return false;
        return checkAncestry(p.parent, targ);
    }

    private static void unloadRec(TPage p) {
        if (p != null && p.loaded && !checkAncestry(currentPage, p)) {
            p.unload();
            unloadRec(p.parent);
        }
    }

    public void onExit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.alert_dialog_icon);
        builder.setCancelable(false);
        builder.setTitle(this.ErrorTitle);
        builder.setMessage(this.ErrorMessage);

        builder.setPositiveButton("종료", (dialogInterface, i) -> {
            NewTower.this.finish();
            System.exit(1);
        });
        builder.setOnCancelListener(dialogInterface -> {
            NewTower.this.finish();
            System.exit(1);
        });
        builder.setOnKeyListener((dialogInterface, i, keyEvent) -> {
            NewTower.this.finish();
            System.exit(1);
            return true;
        });
        builder.show();
    }

    public void initActivity() {
        if (!initActivityFirstFlag) {
            GameThread.playTimeStartValue = System.currentTimeMillis();
            gameRenderer = new GameRenderer(this);
        } else
            GameRenderer.newTower = this;

        GLGameSurfaceView gLGameSurfaceView = new GLGameSurfaceView(this, gameRenderer);
        glGameSurfaceView = gLGameSurfaceView;
        setContentView(gLGameSurfaceView);
        if (!initActivityFirstFlag) {
            gameThread = new GameThread(this);
            GameRenderer.drawFont = new Paint(1);
            GameRenderer.setDefaultFont();
            GameRenderer.textTombstone = new Tombstone(this);
            GameRenderer.isPaused = false;
            gameThread.start();
            PowerManager powerManager = (PowerManager) getSystemService(POWER_SERVICE);
            wl = powerManager.newWakeLock(536870922, "Def:Tag");
            wl.acquire();
            vibe = (Vibrator) getSystemService(VIBRATOR_SERVICE);
            GameThread.loadingStatus = 1000;
            initActivityFirstFlag = true;
            return;
        }
        GameThread.newTower = this;
    }

    @Override
    public void onPause() {
        Log.d("PAUSE", "NEWTOWER PAUSE");
        super.onPause();
        glGameSurfaceView.onPause();
    }

    @Override
    public void onResume() {
        Log.d("RESUME", "NEWTOWER RESUME");
        super.onResume();
        GLGameSurfaceView glView = glGameSurfaceView;
        if (glView != null)
            glView.onResume();
    }

    @Override
    public void onDestroy() {
        try {
            if (wl != null)
                wl.release();
            GameThread.stopLoopSound(0);
            GameThread.stopLoopSound(1);
            GameThread.stopLoopSound(2);
            super.onDestroy();
        } catch (Exception unused) {
            Log.d("DESTROY TRY", "DESTROY ERROR 1");
            Log.d("STACK TRACE", Arrays.toString(unused.getStackTrace()));
        }
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 82 && keyEvent.isLongPress()) {
            return true;
        }
        if (i == 24) {
            GameThread.mgr.adjustStreamVolume(3, 1, AudioManager.FLAG_SHOW_UI);
            return true;
        }
        if (i == 25) {
            GameThread.mgr.adjustStreamVolume(3, -1, AudioManager.FLAG_SHOW_UI);
            return true;
        }
        if (i == 4) {
            keybackProcess();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void exitDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you really want to quit?");
        builder.setCancelable(false);

        builder.setPositiveButton("Yes", (dialogInterface, i) -> System.exit(0));
        builder.setNegativeButton("No", (dialogInterface, i) -> dialogInterface.cancel());

        AlertDialog create = builder.create();
        create.setTitle("Fantasy Defenders");
        create.setIcon(R.drawable.icon);
        create.show();
    }

    public void mainmenuDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you want to return to the Main menu?");
        builder.setCancelable(false);

        builder.setPositiveButton("Yes", (dialogInterface, i) -> {
            TPage p = currentPage;
            while (!(p instanceof MenuPage) && p != null)
                p = p.parent;

            switchPage(p, true);
            GameThread.stopLoopSound(2);
        });
        builder.setNegativeButton("No", (dialogInterface, i) -> dialogInterface.cancel());

        AlertDialog create = builder.create();
        create.setTitle("Fantasy Defenders");
        create.setIcon(R.drawable.icon);
        create.show();
    }

    public void keybackProcess() {
        //TODO - give pages specialized keyback managers to exit menu and such
        if (currentPage == null || currentPage instanceof LoadingPage)
            return;
        if (currentPage instanceof CinematicPage || currentPage instanceof TitlePage || currentPage instanceof MenuPage)
            exitDialog();
        else
            mainmenuDialog();
    }

    /**
     * Gets a random number between 0 and i (exclusive)
     * @param i The upper limit for the number (exclusive).
     */
    public static int getRandom(int i) {
        return (int)(Math.random() * i);
    }
}
