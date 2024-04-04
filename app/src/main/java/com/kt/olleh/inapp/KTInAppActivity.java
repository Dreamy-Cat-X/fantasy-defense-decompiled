package com.kt.olleh.inapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.kt.olleh.inapp.Config.Config;
import com.kt.olleh.inapp.IRemoteInapService;

/* loaded from: D:\decomp\classes.dex */
public abstract class KTInAppActivity extends Activity implements ILibMode {
    private String mAuthen;
    private InApp mInApp;
    private OnInAppListener mListener;
    private Purchase mPurchase;
    IRemoteInapService mService;
    private int mLibMode = -1;
    public final String TAG = "KTInAppActivity";
    ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.kt.olleh.inapp.KTInAppActivity.1
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Config.DEBUG) {
                Config.LogI("KTInAppActivity", " onServiceDisconnected");
            }
            KTInAppActivity.this.mService = null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Config.DEBUG) {
                Config.LogI("KTInAppActivity", " ** onServiceConnected");
            }
            KTInAppActivity.this.mService = IRemoteInapService.Stub.asInterface(iBinder);
            if (KTInAppActivity.this.mService != null) {
                try {
                    InAppSettings.UserInfo = KTInAppActivity.this.mService.getPhoneNumber();
                    if (Config.DEBUG) {
                        Config.LogI("KTInAppActivity", "SoIP Phone number = " + InAppSettings.UserInfo);
                    }
                    KTInAppActivity.this.onServiceStop();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    private String getUserInfo(String str) {
        return str;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getLastNonConfigurationInstance() != null) {
            Purchase purchase = new Purchase();
            this.mPurchase = purchase;
            purchase.setData(getLastNonConfigurationInstance());
            this.mPurchase.setContext(this);
        }
    }

    @Override // android.app.Activity
    public Object onRetainNonConfigurationInstance() {
        Purchase purchase = this.mPurchase;
        if (purchase != null) {
            return purchase.getData();
        }
        return null;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Purchase purchase = this.mPurchase;
        if (purchase != null) {
            purchase.onDestroy();
            this.mPurchase = null;
        }
        if (this.mInApp != null) {
            this.mInApp = null;
        }
        this.mLibMode = -1;
        this.mAuthen = null;
        super.onDestroy();
    }

    public void init(OnInAppListener onInAppListener) {
        this.mLibMode = 0;
        this.mAuthen = "01";
        this.mListener = onInAppListener;
    }

    private String getPhoneNumber() {
        return ((TelephonyManager) getSystemService("phone")).getLine1Number();
    }

    private String getUserInfo() {
        if (InAppSettings.UserInfo == null) {
            int i = this.mLibMode;
            if (i == 0) {
                InAppSettings.UserInfo = ((TelephonyManager) getSystemService("phone")).getLine1Number();
            } else if (i == 1) {
                if (Config.DEBUG) {
                    Config.LogE("KTInAppActivity", "ILibMode.mode_SoIP number not exist");
                }
            } else if (i == 2 && Config.DEBUG) {
                Config.LogE("KTInAppActivity", "ILibMode.mode_KPAD Show ID not exist");
            }
        }
        if (InAppSettings.UserInfo != null) {
            if (Config.DEBUG) {
                Config.LogD("KTInAppActivity", "UserInfo.information = " + InAppSettings.UserInfo);
            }
        } else if (Config.DEBUG) {
            Config.LogD("KTInAppActivity", "UserInfo.information = null");
        }
        return InAppSettings.UserInfo;
    }

    public boolean initListener() {
        if (this.mListener != null) {
            return true;
        }
        Log.e("KTInApp", "OnInAppListener 미등록 오류 발생");
        return false;
    }

    public void purchase(String str, String str2) {
        Purchase purchase = this.mPurchase;
        if (purchase != null) {
            purchase.onDestroy();
            this.mPurchase = null;
        }
        if (initListener()) {
            Purchase purchase2 = new Purchase();
            this.mPurchase = purchase2;
            purchase2.onCreate(this, str, str2, this.mListener, this.mLibMode);
        }
    }

    private void notExistUserInfo() {
        int i = this.mLibMode;
        if (i == 0 || i == 1 || i == 2) {
            this.mListener.OnError("CRAB2001", "ID or PhoneNumber 오류");
        }
    }

    public void getDIUsableList(String str) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else {
                this.mInApp.getDIUsableList(str, userInfo, this.mAuthen, this.mListener);
            }
        }
    }

    public void getDIPurchaseList(String str) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else {
                this.mInApp.getDIPurchaseList(str, userInfo, this.mAuthen, this.mListener);
            }
        }
    }

    public void getDIAllList(String str, int i, int i2) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else if (i <= 0 || i2 <= 0) {
                this.mInApp.getDIAllList(str, userInfo, this.mAuthen, this.mListener);
            } else {
                this.mInApp.getDIAllList(str, userInfo, this.mAuthen, i, i2, this.mListener);
            }
        }
    }

    public void getDIAllList(String str) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else {
                this.mInApp.getDIAllList(str, userInfo, this.mAuthen, this.mListener);
            }
        }
    }

    public void getDIGiftList(String str, String str2) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else if (str2 == null) {
                this.mInApp.getDIGiftList(str, userInfo, this.mAuthen, this.mListener);
            } else {
                this.mInApp.getDIGiftList(str, userInfo, this.mAuthen, getUserInfo(str2), this.mListener);
            }
        }
    }

    public void getDIGiftList(String str) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else {
                this.mInApp.getDIGiftList(str, userInfo, this.mAuthen, this.mListener);
            }
        }
    }

    public void getDIReceiveList(String str) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else {
                this.mInApp.getDIReceiveList(str, userInfo, this.mAuthen, this.mListener);
            }
        }
    }

    public void getDIInformation(String str, String str2) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else {
                this.mInApp.getDIInformation(str, str2, userInfo, this.mAuthen, this.mListener);
            }
        }
    }

    public void getDIDownloadableList(String str) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else {
                this.mInApp.getDIDownloadableList(str, userInfo, this.mAuthen, this.mListener);
            }
        }
    }

    public void requestDIBuy(String str, String str2, String str3, String str4) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else {
                this.mInApp.requestDIBuy(str, str2, userInfo, this.mAuthen, str3, str4, this.mListener);
            }
        }
    }

    public void requestDIReBuy(String str, String str2, String str3, String str4) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else {
                this.mInApp.requestDIReBuy(str, str2, userInfo, this.mAuthen, str3, str4, this.mListener);
            }
        }
    }

    public void requestDIBuyCancel(String str, String str2, String str3) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else {
                this.mInApp.requestDIBuyCancel(str, str2, userInfo, this.mAuthen, str3, this.mListener);
            }
        }
    }

    public void requestDIesBuy(String str, String str2) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else {
                this.mInApp.requestDIesBuy(str, str2, userInfo, this.mListener);
            }
        }
    }

    public void requestDIGift(String str, String str2, String str3, String str4, String str5) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else {
                this.mInApp.requestDIGift(str, str2, userInfo, this.mAuthen, str3, str4, getUserInfo(str5), this.mListener);
            }
        }
    }

    public void requestDIReGift(String str, String str2, String str3, String str4, String str5) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else {
                this.mInApp.requestDIReGift(str, str2, userInfo, this.mAuthen, str3, str4, getUserInfo(str5), this.mListener);
            }
        }
    }

    public void requestDIApproveUse(String str, String str2) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else {
                this.mInApp.requestDIApproveUse(str, str2, userInfo, this.mAuthen, this.mListener);
            }
        }
    }

    public void requestDIApproveDown(String str, String str2) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else {
                this.mInApp.requestDIApproveDown(str, str2, userInfo, this.mAuthen, this.mListener);
            }
        }
    }

    public void requestDIgetFile(String str, String str2) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else {
                this.mInApp.requestDIgetFile(str, str2, userInfo, this.mAuthen, this.mListener);
            }
        }
    }

    public void requestCheckShowId(String str, String str2) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            this.mInApp.requestCheckShowId(str, str2, this.mListener);
        }
    }

    public void requestCheckCoin() {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        if (initListener()) {
            String userInfo = getUserInfo();
            if (userInfo == null) {
                notExistUserInfo();
            } else {
                this.mInApp.requestCheckCoin(userInfo, this.mAuthen, this.mListener);
            }
        }
    }

    public void requestCancel() {
        this.mInApp.requestCancel();
    }

    public void settingSoIPNumber() {
        onServiceStart();
    }

    private void onServiceStart() {
        bindService(new Intent("com.kt.olleh.inapp.IRemoteInapService"), this.serviceConnection, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onServiceStop() {
        unbindService(this.serviceConnection);
    }
}
