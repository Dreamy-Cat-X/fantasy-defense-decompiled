package com.sncompany.newtower;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.internal.view.SupportMenu;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import java.io.InputStream;
import java.util.StringTokenizer;

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
    public static String myPhoneNumber;
    public static NetworkThread networkThread;
    public static TelephonyManager telephonyManager;
    public static Vibrator vibe;
    public static PowerManager.WakeLock wl;
    boolean isLoading;
    LinearLayout layout;
    private AdView mAdView;
    LinearLayout mainLayout;
    private RewardedAd rewardedAd;
    public static String[] PID_DATA = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17"};
    public static String[] CID_DATA = {"51200006591694", "51200006591695", "51200006591703", "51200006591704", "51200006591705", "51200006591706", "51200006591707", "51200006591708", "51200006591709", "51200006591710", "51200006591696", "51200006591697", "51200006591698", "51200006591699", "51200006591700", "51200006591701", "51200006591702"};
    private String ErrorTitle = "";
    private String ErrorMessage = "";
    private String rewardID = "ca-app-pub-1943198298123931/5668542964";
    private String bannerID = "ca-app-pub-1943198298123931/5313319745";
    public boolean bViewAdMob = false;
    boolean isAddView = false;
    boolean isAddMobInit = false;
    boolean isVewing = false;
    public static int randomNumber;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        doFullScreen();
        initActivity();
        MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: com.sncompany.newtower.NewTower.1
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                Log.d("MobileAds", "initialize -------------------------");
            }
        });
        initAdMob();
        loadRewardedVideoAd();
    }

    private void doFullScreen() {
        getWindow().getDecorView().setSystemUiVisibility(3846);
    }

    public void initAdMob() {
        AdView adView = new AdView(this);
        this.mAdView = adView;
        adView.setAdSize(AdSize.BANNER);
        this.mAdView.setAdUnitId(this.bannerID);
        if (this.isAddMobInit || this.mAdView == null) {
            return;
        }
        Log.d("initAdMob", "initAdMob -------------------------");
        glGameSurfaceView.post(new Runnable() { // from class: com.sncompany.newtower.NewTower.2
            @Override // java.lang.Runnable
            public void run() {
                Log.d("initAdMob", "postDelayed 1 -------------------------");
                if (NewTower.this.isAddView) {
                    return;
                }
                Log.d("initAdMob", "postDelayed 2 -------------------------");
                WindowManager windowManager = (WindowManager) NewTower.this.getSystemService("window");
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.type = 1000;
                layoutParams.width = -2;
                layoutParams.height = -2;
                layoutParams.flags |= 8;
                layoutParams.gravity = 80;
                layoutParams.horizontalMargin = -0.02f;
                windowManager.addView(NewTower.this.mAdView, layoutParams);
                NewTower.this.isAddView = true;
                Log.d("initAdMob", "postDelayed 2 -------------------------");
                new Bundle().putString("max_ad_content_rating", "PG");
                NewTower.this.mAdView.loadAd(new AdRequest.Builder().build());
                NewTower.this.mAdView.setVisibility(8);
                NewTower.this.isAddMobInit = true;
            }
        });
        this.mAdView.setAdListener(new AdListener() { // from class: com.sncompany.newtower.NewTower.3
            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Toast.makeText(NewTower.this, "onAdFailedToLoad", 1).show();
                loadAdError.getDomain();
                loadAdError.getCode();
                loadAdError.getMessage();
                Log.d(com.google.ads.AdRequest.LOGTAG, loadAdError.toString());
                super.onAdFailedToLoad(loadAdError);
            }
        });
    }

    public void ViewAdMob() {
        if (this.bViewAdMob) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: com.sncompany.newtower.NewTower.4
            @Override // java.lang.Runnable
            public void run() {
                if (NewTower.this.mAdView == null || NewTower.this.mAdView.isEnabled()) {
                    return;
                }
                Log.d("runOnUiThread", NewTower.this.mAdView.isEnabled() + " ViewAdMob --------------------------------------------------");
                NewTower.this.mAdView.setVisibility(0);
                NewTower.this.mAdView.setEnabled(true);
            }
        });
    }

    public void HideAdMob() {
        runOnUiThread(new Runnable() { // from class: com.sncompany.newtower.NewTower.5
            @Override // java.lang.Runnable
            public void run() {
                if (NewTower.this.mAdView != null) {
                    Log.d("runOnUiThread", "HideAdMob --------------------------------------------------");
                    NewTower.this.mAdView.setVisibility(8);
                    NewTower.this.mAdView.setEnabled(false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadRewardedVideoAd() {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd == null || !rewardedAd.isLoaded()) {
            this.isLoading = true;
            RewardedAd rewardedAd2 = new RewardedAd(this, this.rewardID);
            this.rewardedAd = rewardedAd2;
            rewardedAd2.loadAd(new PublisherAdRequest.Builder().build(), new RewardedAdLoadCallback() { // from class: com.sncompany.newtower.NewTower.6
                @Override // com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
                public void onRewardedAdLoaded() {
                    NewTower.this.isLoading = false;
                }

                @Override // com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
                public void onRewardedAdFailedToLoad(LoadAdError loadAdError) {
                    NewTower.this.isLoading = false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRewardedVideo() {
        if (this.rewardedAd.isLoaded()) {
            this.rewardedAd.show(this, new RewardedAdCallback() { // from class: com.sncompany.newtower.NewTower.7
                @Override // com.google.android.gms.ads.rewarded.RewardedAdCallback
                public void onRewardedAdClosed() {
                    NewTower.this.loadRewardedVideoAd();
                }

                @Override // com.google.android.gms.ads.rewarded.RewardedAdCallback
                public void onUserEarnedReward(RewardItem rewardItem) {
                    GameThread.myHeroism += rewardItem.getAmount();
                    Config.saveAll(GameThread.newTower);
                    NewTower.this.HideAdMob();
                }
            });
        }
    }

    public void startAd() {
        Log.d("startAd", "start ad--------------------------------------------------");
        runOnUiThread(new Runnable() { // from class: com.sncompany.newtower.NewTower.8
            @Override // java.lang.Runnable
            public void run() {
                Log.d("runOnUiThread", "--------------------------------------------------");
                NewTower.this.showRewardedVideo();
            }
        });
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
        this.mAdView.pause();
        super.onPause();
        glGameSurfaceView.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Log.d("RESUME", "NEWTOWER RESUME");
        this.mAdView.resume();
        super.onResume();
        GLGameSurfaceView gLGameSurfaceView = glGameSurfaceView;
        if (gLGameSurfaceView != null) {
            gLGameSurfaceView.onResume();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        try {
            if (wl != null) {
                wl.release();
            }
        } catch (Exception unused) {
            Log.d("DESTROY TRY", "DESTROY ERROR 1");
        }
        try {
            GameThread.stopLoopSound(0);
        } catch (Exception unused2) {
            Log.d("DESTROY TRY", "DESTROY ERROR 2");
        }
        try {
            GameThread.stopLoopSound(1);
        } catch (Exception unused3) {
            Log.d("DESTROY TRY", "DESTROY ERROR 3");
        }
        try {
            GameThread.stopLoopSound(2);
        } catch (Exception unused4) {
            Log.d("DESTROY TRY", "DESTROY ERROR 4");
        }
        try {
            this.mAdView.destroy();
            super.onDestroy();
        } catch (Exception unused5) {
            Log.d("DESTROY TRY", "DESTROY ERROR 6");
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
        if (GameThread.gameStatus == 3 && i == 4) {
            exitDialog();
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
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.sncompany.newtower.NewTower.13
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                System.exit(0);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() { // from class: com.sncompany.newtower.NewTower.14
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog create = builder.create();
        create.setTitle("Fantasy Defenders");
        create.setIcon(R.drawable.icon);
        create.show();
    }

    public void mainmenuDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you want to return to the Main menu?");
        builder.setCancelable(false);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.sncompany.newtower.NewTower.15
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                GameRenderer.loadCount_GAME_MENU_IMAGE_LOAD = 0;
                GameThread.gameStatus = 5;
                GameThread.gameLoadFlag = 0;
                GameThread.loadingStatus = 1006;
                GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                GameRenderer.loadingViewType = GameThread.getRandom(6);
                GameThread.stopLoopSound(2);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() { // from class: com.sncompany.newtower.NewTower.16
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog create = builder.create();
        create.setTitle("Fantasy Defenders");
        create.setIcon(R.drawable.icon);
        create.show();
    }

    /**
     * Shows when stage is over. Prompts ad play for 100 Heroism reward. Useless, delete after sorting this mess of a code out.
     */
    public void showRewardDialog() {
        ViewAdMob();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Watch a Video to 100 Heroism Point");
        builder.setCancelable(false);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.sncompany.newtower.NewTower.17
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Log.d("showRewardDialog", "start ad--------------------------------------------------");
                dialogInterface.cancel();
                NewTower.this.HideAdMob();
                NewTower.this.startAd();
                if (GameThread.gameSubStatus == 0) {
                    if (GameThread.myLife == GameThread.maxLife) {
                        GameThread.gameSubStatus = 5;
                        return;
                    }
                    if (GameThread.rewardShowFlag) {
                        GameThread.gameSubStatus = 4;
                        return;
                    } else if (GameThread.mapNumber % 10 == 9 && GameThread.mapNumber != 49) {
                        GameRenderer.darkViewCount = 0;
                        GameThread.gameSubStatus = 3;
                        return;
                    } else {
                        GameThread.gameSubStatus = 1;
                        return;
                    }
                }
                GameThread.playSound(14);
                GameThread.gameSubStatus = 1;
                GameRenderer.startViewCount = 0;
                GameThread.myOscillator[11].fastForward();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() { // from class: com.sncompany.newtower.NewTower.18
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                NewTower.this.HideAdMob();
                if (GameThread.gameSubStatus == 0) {
                    if (GameThread.myLife == GameThread.maxLife) {
                        GameThread.gameSubStatus = 5;
                        return;
                    }
                    if (GameThread.rewardShowFlag) {
                        GameThread.gameSubStatus = 4;
                        return;
                    } else if (GameThread.mapNumber % 10 == 9 && GameThread.mapNumber != 49) {
                        GameRenderer.darkViewCount = 0;
                        GameThread.gameSubStatus = 3;
                        return;
                    } else {
                        GameThread.gameSubStatus = 1;
                        return;
                    }
                }
                GameThread.playSound(14);
                GameThread.gameSubStatus = 1;
                GameRenderer.startViewCount = 0;
                GameThread.myOscillator[11].fastForward();
            }
        });
        AlertDialog create = builder.create();
        create.setTitle("Fantasy Defenders");
        create.setIcon(R.drawable.icon);
        create.show();
    }

    /**
     * Main menu ad. Useless, delete.
     */
    public void showMainMenuRewardDialog() {
        ViewAdMob();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Watch a Video to 100 Heroism Point");
        builder.setCancelable(false);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.sncompany.newtower.NewTower.19
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (NewTower.this.isLoading) {
                    return;
                }
                if (GameThread.freeAdViewCount == 5) {
                    GameThread.freeAdViewTime = System.currentTimeMillis();
                }
                GameThread.freeAdViewCount--;
                Config.saveAll(GameThread.newTower);
                dialogInterface.cancel();
                NewTower.this.HideAdMob();
                NewTower.this.startAd();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() { // from class: com.sncompany.newtower.NewTower.20
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                NewTower.this.HideAdMob();
            }
        });
        AlertDialog create = builder.create();
        create.setTitle("Fantasy Defenders");
        create.setIcon(R.drawable.icon);
        create.show();
    }

    /**
     * Appears on video wait. Useless, delete.
     */
    public void showNotRewardDialog() {
        ViewAdMob();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("You have to wait until you can watch video");
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.sncompany.newtower.NewTower.21
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog create = builder.create();
        create.setTitle("Fantasy Defenders");
        create.setIcon(R.drawable.icon);
        create.show();
    }

    public void keybackProcess() {
        Log.d("KEY PRESS", "CHECK THIS " + GameThread.gameStatus);
        int i = GameThread.gameLoadFlag;
        if (i == 0) {
            int i2 = GameThread.loadingStatus;
            return;
        }
        if (i != 1) {
            return;
        }
        switch (GameThread.gameStatus) {
            case 2:
                GameThread.playSound(14);
                GameThread.stopLoopSound(2);
                GameThread.gameLoadFlag = 0;
                GameThread.loadingStatus = 1002;
                GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                GameRenderer.loadCount_GAME_PRE_TOTAL_IMAGE_LOAD = 0;
                GameRenderer.loadingViewType = GameThread.getRandom(6);
                return;
            case 3:
            case 4:
            case 6:
            case 7:
            case 24:
            default:
                return;
            case 5:
                GameThread.playSound(15);
                GameThread.gameStatus = 3;
                GameThread.gameSubStatus = 12;
                GameThread.gameTitleViewCount = 0;
                GameThread.stopLoopSound(1);
                GameThread.playLoopSound(0);
                return;
            case 8:
                GameThread.gameStatus = 3;
                GameThread.gameSubStatus = 0;
                GameThread.gameTitleViewCount = 0;
                GameThread.stopLoopSound(0);
                GameThread.playSound(15);
                return;
            case 9:
                GameThread.gameStatus = 3;
                GameThread.gameSubStatus = 0;
                GameThread.gameTitleViewCount = 0;
                GameThread.stopLoopSound(0);
                GameThread.playSound(15);
                return;
            case 10:
                GameThread.playSound(15);
                GameRenderer.loadCount_GAME_MENU_IMAGE_LOAD = 0;
                GameThread.gameStatus = 5;
                GameThread.gameLoadFlag = 0;
                GameThread.loadingStatus = 1006;
                GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                GameRenderer.loadingViewType = GameThread.getRandom(6);
                return;
            case 11:
                GameRenderer.titlePressed = 11;
                GameThread.upgradeUnitSelectPos = 0;
                GameThread.gameStatus = 7;
                GameRenderer.titleCount = 0;
                GameThread.playSound(15);
                return;
            case 12:
                GameThread.gameStatus = 11;
                return;
            case 13:
                GameThread.gameStatus = 11;
                return;
            case 14:
                GameThread.myOscillator[11].initWithTwoWayStartPosition(-150, 0, 15, 30, 10);
                GameRenderer.titlePressed = 14;
                GameThread.shopShopChapterSelectPos = 0;
                GameThread.shopShopItemSelectPos = 0;
                GameThread.shopShopInventorySelectPos = 0;
                GameThread.gameStatus = 7;
                GameRenderer.titleCount = 0;
                GameThread.playSound(15);
                return;
            case 15:
                if (GameThread.gameSubStatus != 4) {
                    GameThread.myOscillator[11].initWithTwoWayStartPosition(-150, 0, 15, 30, 10);
                    GameRenderer.titlePressed = 15;
                    GameThread.shopShopChapterSelectPos = 0;
                    GameThread.shopShopItemSelectPos = 0;
                    GameThread.shopShopInventorySelectPos = 0;
                    GameThread.getShopList();
                    GameThread.gameStatus = 7;
                    GameRenderer.titleCount = 0;
                    GameThread.playSound(15);
                    return;
                }
                return;
            case 16:
                GameThread.myOscillator[11].initWithTwoWayStartPosition(-150, 0, 15, 30, 10);
                GameRenderer.titlePressed = 16;
                GameThread.upgradeHeroUnitSelectPos = 0;
                GameThread.shopShopInventorySelectPos = 0;
                GameThread.upgradeHeroEquipSelectPos = 0;
                GameThread.gameStatus = 7;
                GameRenderer.titleCount = 0;
                GameThread.playSound(15);
                return;
            case 17:
                int i3 = GameThread.gameSubStatus;
                if (i3 == 0 || i3 == 3) {
                    GameThread.myOscillator[11].initWithTwoWayStartPosition(-150, 0, 15, 30, 10);
                    GameRenderer.titlePressed = 17;
                    GameThread.gameStatus = 7;
                    GameRenderer.titleCount = 0;
                    GameThread.playSound(15);
                    return;
                }
                return;
            case 18:
                GameRenderer.titlePressed = 18;
                GameThread.gameStatus = 7;
                GameRenderer.titleCount = 0;
                GameThread.playSound(15);
                return;
            case 19:
                GameRenderer.titlePressed = 19;
                GameThread.gameStatus = 7;
                GameRenderer.titleCount = 0;
                GameThread.playSound(15);
                return;
            case 20:
                if (GameRenderer.startViewCount == 0) {
                    GameThread.playSound(14);
                    GameRenderer.startViewCount = 1;
                    return;
                }
                return;
            case 21:
                GameThread.gameStatus = 25;
                GameThread.playSound(15);
                return;
            case 22:
            case 23:
            case 25:
            case 26:
                GameThread.playSound(15);
                mainmenuDialog();
                return;
            case 27:
                GameThread.gameStatus = 10;
                GameThread.gameSubStatus = 0;
                GameRenderer.startViewCount = 0;
                GameThread.stageSelectChapterNumber = 4;
                GameThread.stageSelectStageNumber = 9;
                GameThread.mapAttackType = 0;
                GameThread.loadMap((GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber, true);
                GameThread.playLoopSound(1);
        }
    }

    public static int getRandom(int i) {
        int currentTimeMillis = (int) ((((randomNumber & SupportMenu.USER_MASK) * 93217) + 1 + (System.currentTimeMillis() & 65535)) & 65535);
        randomNumber = currentTimeMillis >> 1;
        if (i == 0)
            return 0;
        return randomNumber % i;
    }
}
