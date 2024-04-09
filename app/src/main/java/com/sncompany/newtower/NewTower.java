package com.sncompany.newtower;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.internal.view.SupportMenu;

import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.sncompany.newtower.Pages.CinematicPage;
import com.sncompany.newtower.Pages.LoadingPage;
import com.sncompany.newtower.Pages.MenuPage;
import com.sncompany.newtower.Pages.TPage;
import com.sncompany.newtower.Pages.TitlePage;

/* loaded from: D:\decomp\classes.dex */
public class NewTower extends AppCompatActivity {
    public static int LAST_PURCHASE_POS = 0;
    static final int PID_DATA_TYPE_1100 = 2;
    static final int PID_DATA_TYPE_13000 = 1;
    static final int PID_DATA_TYPE_27500 = 3;
    static final int PID_DATA_TYPE_40000 = 4;
    static final int PID_DATA_TYPE_6000 = 0;
    static final int PID_DATA_TYPE_HERO_SPE0 = 13;
    static final int PID_DATA_TYPE_HERO_SPE1 = 14;
    static final int PID_DATA_TYPE_HERO_SPE2 = 15;
    static final int PID_DATA_TYPE_HERO_SPE3 = 16;
    static final int PID_DATA_TYPE_LIMIT0 = 5;
    static final int PID_DATA_TYPE_RESET = 6;
    static final int PID_DATA_TYPE_SPE_ATT15 = 12;
    static final int PID_DATA_TYPE_SPE_ATT3 = 11;
    static final int PID_DATA_TYPE_UNIT_11 = 9;
    static final int PID_DATA_TYPE_UNIT_15 = 10;
    static final int PID_DATA_TYPE_UNIT_3 = 7;
    static final int PID_DATA_TYPE_UNIT_7 = 8;
    private static final int PURCHASE_ERROR_DIALOG = 0;
    public static GameRenderer gameRenderer = null;
    public static GameThread gameThread = null;
    public static GLGameSurfaceView glGameSurfaceView = null;
    public static boolean initActivityFirstFlag = false;
    public static String myImei;
    public static String myImsi;
    public static String myPhoneNumber; //TODO - Delete
    public static NetworkThread networkThread; //TODO - Delete
    public static TelephonyManager telephonyManager; //TODO - Delete
    public static Vibrator vibe;
    public static PowerManager.WakeLock wl;
    boolean isLoading;
    LinearLayout layout;
    LinearLayout mainLayout;
    public static String[] PID_DATA = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17"};
    public static String[] CID_DATA = {"51200006591694", "51200006591695", "51200006591703", "51200006591704", "51200006591705", "51200006591706", "51200006591707", "51200006591708", "51200006591709", "51200006591710", "51200006591696", "51200006591697", "51200006591698", "51200006591699", "51200006591700", "51200006591701", "51200006591702"};
    private String ErrorTitle = "";
    private String ErrorMessage = "";
    private String rewardID = "ca-app-pub-1943198298123931/5668542964";
    private String bannerID = "ca-app-pub-1943198298123931/5313319745";
    public static int randomNumber;

    public static TPage currentPage;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        doFullScreen();
        initActivity();
    }

    private void doFullScreen() {
        getWindow().getDecorView().setSystemUiVisibility(3846);
    }

    public static void switchPage(TPage p, boolean unload) {
        TPage par = currentPage;
        currentPage = p;
        if (unload)
            unloadRec(par);
        if (!currentPage.loaded)
            currentPage.load(null);
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
        builder.setPositiveButton("종료", new DialogInterface.OnClickListener() { // from class: com.sncompany.newtower.NewTower.9
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                NewTower.this.finish();
                System.exit(1);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.sncompany.newtower.NewTower.10
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                NewTower.this.finish();
                System.exit(1);
            }
        });
        builder.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.sncompany.newtower.NewTower.11
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                NewTower.this.finish();
                System.exit(1);
                return true;
            }
        });
        builder.show();
    }

    public void shopPopPurchaseDlg(int i) {
        LAST_PURCHASE_POS = i;
        GameThread.buyPurchaseItem(i);
    }

    public void initActivity() {
        if (!initActivityFirstFlag) {
            GameThread.playTimeStartValue = System.currentTimeMillis();
            gameRenderer = new GameRenderer(this);
        } else {
            GameRenderer.newTower = this;
        }
        GLGameSurfaceView gLGameSurfaceView = new GLGameSurfaceView(this, gameRenderer);
        glGameSurfaceView = gLGameSurfaceView;
        setContentView(gLGameSurfaceView);
        if (!initActivityFirstFlag) {
            gameThread = new GameThread(this);
            networkThread = new NetworkThread(this);
            GameRenderer.drawFont = new Paint(1);
            GameRenderer.setDefaultFont();
            GameRenderer.textTombstone = new Tombstone(this);
            GameRenderer.isPaused = false;
            gameThread.start();
            networkThread.start();
            PowerManager powerManager = (PowerManager) getSystemService("power");
            telephonyManager = (TelephonyManager) getSystemService("phone");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(536870922, "My Tag");
            wl = newWakeLock;
            newWakeLock.acquire();
            vibe = (Vibrator) getSystemService("vibrator");
            GameThread.gameLoadFlag = 0;
            GameThread.loadingStatus = 1000;
            initActivityFirstFlag = true;
            return;
        }
        GameThread.newTower = this;
    }

    @Override // android.app.Activity
    protected void onPrepareDialog(int i, Dialog dialog) {
        super.onPrepareDialog(i, dialog);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Log.d("PAUSE", "NEWTOWER PAUSE");
        GameRenderer.loadViewFlag = false;
        super.onPause();
        glGameSurfaceView.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Log.d("RESUME", "NEWTOWER RESUME");
        super.onResume();
        GLGameSurfaceView glView = glGameSurfaceView;
        if (glView != null)
            glView.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
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
            Log.d("STACK TRACE", unused.getStackTrace().toString());
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 82 && keyEvent.isLongPress()) {
            return true;
        }
        if (i == 24) {
            GameThread.mgr.adjustStreamVolume(3, 1, 1);
            return true;
        }
        if (i == 25) {
            GameThread.mgr.adjustStreamVolume(3, -1, 1);
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

            switchPage(new LoadingPage(p), true);
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
        int currentTimeMillis = (int) ((((randomNumber & SupportMenu.USER_MASK) * 93217) + 1 + (System.currentTimeMillis() & 65535)) & 65535);
        randomNumber = currentTimeMillis >> 1;
        if (i == 0)
            return 0;
        return randomNumber % i;
    }
}