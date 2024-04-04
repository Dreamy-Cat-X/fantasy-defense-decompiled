package com.kt.olleh.inapp;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.PointerIconCompat;
import com.kt.olleh.inapp.Config.Config;
import com.kt.olleh.inapp.dialog.DialogAlert;
import com.kt.olleh.inapp.dialog.DialogLogin;
import com.kt.olleh.inapp.dialog.DialogOnClickListener;
import com.kt.olleh.inapp.dialog.DialogPay;
import com.kt.olleh.inapp.dialog.DialogProgress;
import com.kt.olleh.inapp.dialog.DialogSelect;
import com.kt.olleh.inapp.net.InAppAPI;
import com.kt.olleh.inapp.net.InAppError;
import com.kt.olleh.inapp.net.ResDIBuy;
import com.kt.olleh.inapp.net.ResDIDetail;
import com.kt.olleh.inapp.net.Response;
import com.sncompany.newtower.GameThread;
import java.text.DecimalFormat;

/* loaded from: D:\decomp\classes.dex */
public class Purchase {
    public static int Dialog_Mode = -1;
    public static int Pay_Alert_Mode = -1;
    private String mAuthen;
    private Context mContext;
    private Dialog mDialog;
    private DialogProgress mDialog_progress;
    private DialogLogin mLoginDialog;
    private final int Dialog_Alert = 1000;
    private final int Dialog_List = 1001;
    private final int Dialog_Pay = 1002;
    private final int Dialog_Loding = 1003;
    private final int Dialog_Dismiss = 1004;
    private final int Dialog_Login = GameThread.GAME_PLAY2_IMAGE_LOAD;
    private final int Dialog_Select = 1006;
    private final int Pay_Alert_Mode_01 = PointerIconCompat.TYPE_COPY;
    private final int Pay_Alert_Mode_02 = PointerIconCompat.TYPE_NO_DROP;
    private final int Pay_Alert_Mode_03 = PointerIconCompat.TYPE_ALL_SCROLL;
    private final int Pay_Alert_Mode_04 = PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW;
    private int mDialog_BtnCnt = -1;
    private String mDialog_Title = null;
    private String mDialog_Message = null;
    private String mDialog_Btn_Text_01 = null;
    private String mDialog_Btn_Text_02 = null;
    private boolean mIsPayInformation = false;
    private boolean mIsPayMessage = false;
    private String mCardName = null;
    private String mItem_Name = null;
    private int mItem_Price = -1;
    private String mPay_Type = null;
    public final String TAG = "KTInAppActivity";
    public Handler handler = new Handler() { // from class: com.kt.olleh.inapp.Purchase.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1000:
                    Purchase.this.AlertDialog();
                    return;
                case 1001:
                default:
                    return;
                case 1002:
                    Purchase.this.PayDialog(Purchase.Pay_Alert_Mode);
                    return;
                case 1003:
                    Purchase.this.LodingDialog();
                    return;
                case 1004:
                    if (Purchase.this.mDialog_progress != null) {
                        Purchase.this.mDialog_progress.dismiss();
                        Purchase.this.mDialog_progress = null;
                        return;
                    }
                    return;
                case GameThread.GAME_PLAY2_IMAGE_LOAD /* 1005 */:
                    Purchase.this.LoginDialog();
                    return;
                case 1006:
                    Purchase.this.SelectDialog();
                    return;
            }
        }
    };
    OnInAppListener mInAppListener = new OnInAppListener() { // from class: com.kt.olleh.inapp.Purchase.2
        @Override // com.kt.olleh.inapp.OnInAppListener
        public void OnResultFileURL(String str, String str2) {
        }

        @Override // com.kt.olleh.inapp.OnInAppListener
        public void OnResultPurchase(String str) {
        }

        @Override // com.kt.olleh.inapp.OnInAppListener
        public void OnResultAPI(String str, Response response) {
            if (Purchase.this.mDialog_progress != null) {
                Purchase.this.SendMessage(1004);
            }
            if (str.equalsIgnoreCase(InAppAPI.getDiDetail)) {
                ResDIDetail resDIDetail = (ResDIDetail) response;
                Purchase.this.mItem_Price = Integer.parseInt(resDIDetail.getPrice());
                Purchase.this.mItem_Name = resDIDetail.getDiTitle();
                Purchase.this.mDialog_Message = "해당 아이템을 구매하시겠습니까?";
                Purchase.this.mDialog_BtnCnt = 2;
                Purchase.this.mDialog_Btn_Text_01 = "예";
                Purchase.this.mDialog_Btn_Text_02 = "아니오";
                Purchase.this.mIsPayInformation = true;
                Purchase.Pay_Alert_Mode = PointerIconCompat.TYPE_COPY;
                Purchase.this.SendMessage(1002);
                return;
            }
            if (str.equalsIgnoreCase(InAppAPI.buyDi)) {
                Purchase.this.mTr_ID = ((ResDIBuy) response).mTr_id;
                Purchase.Pay_Alert_Mode = PointerIconCompat.TYPE_ALL_SCROLL;
                Purchase.this.mDialog_BtnCnt = 1;
                Purchase.this.mDialog_Btn_Text_01 = "확인";
                Purchase.this.mDialog_Message = "결제가 완료되었습니다.";
                Purchase.this.mIsPayInformation = false;
                Purchase.this.SendMessage(1002);
                return;
            }
            if (str.equalsIgnoreCase(InAppAPI.checkShowId)) {
                Purchase.this.purchaseGetInfo();
            }
        }

        @Override // com.kt.olleh.inapp.OnInAppListener
        public void OnError(String str, String str2) {
            if (Purchase.this.mDialog_progress != null) {
                Purchase.this.SendMessage(1004);
            }
            if (Purchase.this.mListener != null) {
                Purchase.this.mListener.OnError(str, str2);
            }
        }

        @Override // com.kt.olleh.inapp.OnInAppListener
        public void OnResultOLDAPI(String str, String str2) {
            if (Purchase.this.mListener != null) {
                Purchase.this.mListener.OnResultOLDAPI(str, str2);
            }
        }
    };
    private InApp mInApp = null;
    private String mApplicationID = null;
    private String mDigitalID = null;
    private OnInAppListener mListener = null;
    private String mTr_ID = null;
    private int mLibMode = -1;

    public void onCreate(Context context, String str, String str2, OnInAppListener onInAppListener, int i) {
        this.mApplicationID = str;
        this.mDigitalID = str2;
        this.mContext = context;
        this.mListener = onInAppListener;
        this.mTr_ID = null;
        this.mLibMode = i;
        this.mInApp = new InApp();
        int i2 = this.mLibMode;
        if (i2 == 0) {
            this.mAuthen = "01";
            purchaseGetInfo();
            return;
        }
        if (i2 == 1) {
            this.mAuthen = "02";
            purchaseGetInfo();
        } else {
            if (i2 != 2) {
                return;
            }
            this.mAuthen = "03";
            if (InAppSettings.UserInfo == null) {
                SendMessage(GameThread.GAME_PLAY2_IMAGE_LOAD);
            } else {
                purchaseGetInfo();
            }
        }
    }

    public void onDestroy() {
        this.mDialog_BtnCnt = -1;
        this.mDialog_Title = null;
        this.mDialog_Message = null;
        this.mDialog_Btn_Text_01 = null;
        this.mDialog_Btn_Text_02 = null;
        this.mIsPayInformation = false;
        this.mIsPayMessage = false;
        this.mCardName = null;
        this.mItem_Name = null;
        this.mItem_Price = -1;
        this.mPay_Type = null;
        this.mAuthen = null;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            if (dialog.isShowing()) {
                this.mDialog.dismiss();
            }
            this.mDialog = null;
        }
        this.mContext = null;
        this.mInApp = null;
        this.mApplicationID = null;
        this.mDigitalID = null;
        this.mListener = null;
        this.mLibMode = -1;
    }

    public void LoginDialog() {
        Dialog_Mode = GameThread.GAME_PLAY2_IMAGE_LOAD;
        DialogLogin dialogLogin = new DialogLogin(this.mContext);
        this.mLoginDialog = dialogLogin;
        dialogLogin.setTitle("Olleh.com 로그인");
        this.mLoginDialog.setButton(0, new DialogOnClickListener(this.mLoginDialog) { // from class: com.kt.olleh.inapp.Purchase.3
            @Override // com.kt.olleh.inapp.dialog.DialogOnClickListener, android.view.View.OnClickListener
            public void onClick(View view) {
                super.onClick(view);
                Purchase purchase = Purchase.this;
                purchase.requestCheckShowId(purchase.mLoginDialog.getID(), Purchase.this.mLoginDialog.getPassword());
                Purchase.this.mDialog_Btn_Text_01 = "취소";
                Purchase.this.mDialog_Message = "로그인 중...";
                Purchase.this.SendMessage(1003);
            }
        });
        this.mLoginDialog.setButton(1, new DialogOnClickListener(this.mLoginDialog) { // from class: com.kt.olleh.inapp.Purchase.4
            @Override // com.kt.olleh.inapp.dialog.DialogOnClickListener, android.view.View.OnClickListener
            public void onClick(View view) {
                super.onClick(view);
            }
        });
        this.mLoginDialog.show();
        this.mDialog = this.mLoginDialog;
    }

    public void SelectDialog() {
        Dialog_Mode = 1006;
        DialogSelect dialogSelect = new DialogSelect(this.mContext);
        dialogSelect.setOnItemClickListener(new DialogOnClickListener(dialogSelect) { // from class: com.kt.olleh.inapp.Purchase.5
            @Override // com.kt.olleh.inapp.dialog.DialogOnClickListener, android.view.View.OnClickListener
            public void onClick(View view) {
                super.onClick(view);
                String obj = view.getTag().toString();
                if (InAppError.FAILED.equalsIgnoreCase(obj)) {
                    Purchase.this.mAuthen = "01";
                    Purchase.this.mPay_Type = "핸드폰 결제";
                } else if ("2".equalsIgnoreCase(obj)) {
                    Purchase.this.mAuthen = "02";
                    Purchase.this.mPay_Type = "인터넷전화 결제";
                }
                Purchase purchase = Purchase.this;
                purchase.getDIInformation(purchase.mApplicationID, Purchase.this.mDigitalID);
                Purchase.this.mDialog_Btn_Text_01 = "취소";
                Purchase.this.mDialog_Message = "정보요청중..";
                Purchase.this.SendMessage(1003);
            }

            @Override // com.kt.olleh.inapp.dialog.DialogOnClickListener
            public Dialog getDialog() {
                return super.getDialog();
            }
        });
        dialogSelect.setOnCancelListener(new DialogOnClickListener(dialogSelect) { // from class: com.kt.olleh.inapp.Purchase.6
            @Override // com.kt.olleh.inapp.dialog.DialogOnClickListener, android.view.View.OnClickListener
            public void onClick(View view) {
                super.onClick(view);
            }
        });
        dialogSelect.show();
        this.mDialog = dialogSelect;
    }

    public void AlertDialog() {
        Dialog_Mode = 1000;
        DialogAlert dialogAlert = new DialogAlert(this.mContext, this.mDialog_BtnCnt);
        dialogAlert.setTitle(this.mDialog_Title);
        dialogAlert.setMessage(this.mDialog_Message);
        dialogAlert.setButton(0, "확인", new DialogOnClickListener(dialogAlert) { // from class: com.kt.olleh.inapp.Purchase.7
            @Override // com.kt.olleh.inapp.dialog.DialogOnClickListener, android.view.View.OnClickListener
            public void onClick(View view) {
                super.onClick(view);
            }
        });
        dialogAlert.setButton(1, "취소", new DialogOnClickListener(dialogAlert) { // from class: com.kt.olleh.inapp.Purchase.8
            @Override // com.kt.olleh.inapp.dialog.DialogOnClickListener, android.view.View.OnClickListener
            public void onClick(View view) {
                super.onClick(view);
            }
        });
        dialogAlert.show();
        this.mDialog = dialogAlert;
    }

    public void PayDialog(final int i) {
        Dialog_Mode = 1002;
        DialogPay dialogPay = new DialogPay(this.mContext, this.mDialog_BtnCnt, "/layout/dialog_pay.xml");
        if (i == 1014) {
            dialogPay.setTitle("결제 확인");
            dialogPay.setMessage(this.mDialog_Message);
            dialogPay.setBgColor(false);
        } else if (i == 1012) {
            dialogPay.setTitle("결제 확인");
            dialogPay.setMessage(this.mDialog_Message);
            String format = String.format("%s을 결제하시겠습니까?", getPriceFormat(Integer.toString(this.mItem_Price)));
            dialogPay.setPayNameTitle(false);
            dialogPay.setPayNameMessage(1, null);
            dialogPay.setPayNameMessage(2, null);
            dialogPay.setPayMoneyMessage(format);
            dialogPay.setPayTypeMessage(null);
            this.mIsPayMessage = true;
            this.mIsPayInformation = false;
            dialogPay.setBgColor(true);
        } else {
            dialogPay.setTitle("결제 확인");
            dialogPay.setMessage(this.mDialog_Message);
            String priceFormat = getPriceFormat(Integer.toString(this.mItem_Price));
            dialogPay.setPayNameTitle(true);
            if (this.mItem_Name.length() > 12) {
                String substring = this.mItem_Name.substring(0, 12);
                String substring2 = this.mItem_Name.substring(12);
                dialogPay.setPayNameMessage(1, substring);
                dialogPay.setPayNameMessage(2, substring2);
            } else {
                dialogPay.setPayNameMessage(1, this.mItem_Name);
                dialogPay.setPayNameMessage(2, null);
            }
            dialogPay.setPayMoneyMessage(String.format("결제금액:%s(부가세별도)", priceFormat));
            dialogPay.setPayTypeMessage(String.format("결제방식:%s", this.mPay_Type));
            this.mIsPayMessage = true;
            dialogPay.setBgColor(false);
        }
        dialogPay.setButton(0, this.mDialog_Btn_Text_01, new DialogOnClickListener(dialogPay) { // from class: com.kt.olleh.inapp.Purchase.9
            @Override // com.kt.olleh.inapp.dialog.DialogOnClickListener, android.view.View.OnClickListener
            public void onClick(View view) {
                super.onClick(view);
                switch (i) {
                    case PointerIconCompat.TYPE_COPY /* 1011 */:
                        Purchase.Pay_Alert_Mode = PointerIconCompat.TYPE_NO_DROP;
                        Purchase.this.mDialog_BtnCnt = 2;
                        Purchase.this.mDialog_Btn_Text_01 = "예";
                        Purchase.this.mDialog_Btn_Text_02 = "아니오";
                        Purchase.this.mDialog_Message = "결제를 재확인합니다.";
                        Purchase.this.mIsPayInformation = false;
                        Purchase.this.SendMessage(1002);
                        return;
                    case PointerIconCompat.TYPE_NO_DROP /* 1012 */:
                        Purchase purchase = Purchase.this;
                        purchase.requestDIBuy(purchase.mApplicationID, Purchase.this.mDigitalID, "DP", "1111112222222");
                        Purchase.this.mDialog_Btn_Text_01 = "취소";
                        Purchase.this.mDialog_Message = "결제 요청 중...";
                        Purchase.this.SendMessage(1003);
                        return;
                    case PointerIconCompat.TYPE_ALL_SCROLL /* 1013 */:
                        if (Purchase.this.mListener != null) {
                            Purchase.this.mListener.OnResultPurchase(Purchase.this.mTr_ID);
                            return;
                        }
                        return;
                    case PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW /* 1014 */:
                        Purchase.this.userCancelResponse();
                        return;
                    default:
                        return;
                }
            }
        });
        dialogPay.setButton(1, this.mDialog_Btn_Text_02, new DialogOnClickListener(dialogPay) { // from class: com.kt.olleh.inapp.Purchase.10
            @Override // com.kt.olleh.inapp.dialog.DialogOnClickListener, android.view.View.OnClickListener
            public void onClick(View view) {
                super.onClick(view);
                int i2 = i;
                if (i2 == 1011 || i2 == 1012) {
                    Purchase.this.purchaseErrorDialog("결제를 하지 않으셨습니다.");
                }
            }
        });
        dialogPay.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.kt.olleh.inapp.Purchase.11
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                switch (i) {
                    case PointerIconCompat.TYPE_COPY /* 1011 */:
                    case PointerIconCompat.TYPE_NO_DROP /* 1012 */:
                        Purchase.this.purchaseErrorDialog("결제를 하지 않으셨습니다.");
                        return;
                    case PointerIconCompat.TYPE_ALL_SCROLL /* 1013 */:
                        if (Purchase.this.mListener != null) {
                            Purchase.this.mListener.OnResultPurchase(Purchase.this.mTr_ID);
                            return;
                        }
                        return;
                    case PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW /* 1014 */:
                        Purchase.this.userCancelResponse();
                        return;
                    default:
                        return;
                }
            }
        });
        dialogPay.setPayInformation(this.mIsPayInformation);
        dialogPay.setPayMessage(this.mIsPayMessage);
        dialogPay.show();
        this.mDialog = dialogPay;
    }

    public void userCancelResponse() {
        OnInAppListener onInAppListener = this.mListener;
        if (onInAppListener != null) {
            onInAppListener.OnError("I001", "사용자 요청에 의한 취소");
        }
    }

    public void LodingDialog() {
        Dialog_Mode = 1003;
        DialogProgress dialogProgress = new DialogProgress(this.mContext, this.mDialog_Message);
        this.mDialog_progress = dialogProgress;
        dialogProgress.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.kt.olleh.inapp.Purchase.12
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0 || i != 4 || keyEvent.getRepeatCount() != 0) {
                    return keyEvent.getAction() == 1 && i == 4 && keyEvent.isTracking() && !keyEvent.isCanceled();
                }
                keyEvent.startTracking();
                return true;
            }
        });
        this.mDialog_progress.show();
    }

    public void setData(Object obj) {
        Data data = (Data) obj;
        if (data != null) {
            this.mDialog_BtnCnt = data.Dialog_BtnCnt;
            Dialog_Mode = data.Dialog_Mode;
            this.mDialog_Message = data.Dialog_Message;
            this.mDialog_Btn_Text_01 = data.Dialog_Btn_Text_01;
            this.mDialog_Btn_Text_02 = data.Dialog_Btn_Text_02;
            this.mPay_Type = data.Pay_Type;
            this.mIsPayInformation = data.isPayInformation;
            this.mIsPayMessage = data.isPayMessage;
            this.mCardName = data.CardName;
            Pay_Alert_Mode = data.Pay_Alert_Mode;
            this.mItem_Name = data.Item_Name;
            this.mItem_Price = data.Item_Price;
            int i = Dialog_Mode;
            if (i > 0) {
                SendMessage(i);
            }
        }
    }

    public Object getData() {
        Data data = new Data();
        data.Dialog_BtnCnt = this.mDialog_BtnCnt;
        data.Dialog_Mode = Dialog_Mode;
        data.Dialog_Message = this.mDialog_Message;
        data.Dialog_Btn_Text_01 = this.mDialog_Btn_Text_01;
        data.Dialog_Btn_Text_02 = this.mDialog_Btn_Text_02;
        data.Pay_Type = this.mPay_Type;
        data.isPayInformation = this.mIsPayInformation;
        data.isPayMessage = this.mIsPayMessage;
        data.CardName = this.mCardName;
        data.Pay_Alert_Mode = Pay_Alert_Mode;
        data.Item_Name = this.mItem_Name;
        data.Item_Price = this.mItem_Price;
        return data;
    }

    /* loaded from: D:\decomp\classes.dex */
    class Data {
        String CardName;
        int Dialog_BtnCnt;
        String Dialog_Btn_Text_01;
        String Dialog_Btn_Text_02;
        String Dialog_Message;
        int Dialog_Mode;
        String Item_Name;
        int Item_Price;
        int Pay_Alert_Mode;
        String Pay_Type;
        boolean isPayInformation;
        boolean isPayMessage;

        Data() {
        }
    }

    public void SendMessage(int i) {
        Message obtainMessage = this.handler.obtainMessage();
        obtainMessage.what = i;
        this.handler.sendMessage(obtainMessage);
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public void purchaseGetInfo() {
        getDIInformation(this.mApplicationID, this.mDigitalID);
        this.mDialog_Btn_Text_01 = "취소";
        this.mDialog_Message = "처리 중...";
        this.mPay_Type = "핸드폰 결제";
        SendMessage(1003);
    }

    public void purchaseErrorDialog(String str) {
        Pay_Alert_Mode = PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW;
        this.mDialog_BtnCnt = 1;
        this.mDialog_Btn_Text_01 = "확인";
        this.mDialog_Message = str;
        this.mIsPayInformation = false;
        this.mIsPayMessage = false;
        SendMessage(1002);
    }

    private String getUserInfo() {
        if (InAppSettings.UserInfo == null) {
            int i = this.mLibMode;
            if (i == 0) {
                InAppSettings.UserInfo = ((TelephonyManager) this.mContext.getSystemService("phone")).getLine1Number();
            } else if (i == 1) {
                if (Config.DEBUG) {
                    Config.LogE("KTInAppActivity", "ILibMode.mode_SoIP number not exist");
                }
            } else if (i == 2 && Config.DEBUG) {
                Config.LogE("KTInAppActivity", "ILibMode.mode_KPAD Show ID not exist");
            }
        }
        if (InAppSettings.UserInfo != null && Config.DEBUG) {
            Config.LogE("KTInAppActivity", "UserInfo.information = " + InAppSettings.UserInfo);
        }
        return InAppSettings.UserInfo;
    }

    public void getDIInformation(String str, String str2) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        this.mInApp.getDIInformation(str, str2, getUserInfo(), this.mAuthen, this.mInAppListener);
    }

    public void requestDIBuy(String str, String str2, String str3, String str4) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        this.mInApp.requestDIBuy(str, str2, getUserInfo(), this.mAuthen, str3, str4, this.mInAppListener);
    }

    public void requestCheckShowId(String str, String str2) {
        if (this.mInApp == null) {
            this.mInApp = new InApp();
        }
        this.mInApp.requestCheckShowId(str, str2, this.mInAppListener);
    }

    public String getPriceFormat(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(new DecimalFormat("#,##0").format(Integer.parseInt(str)));
        return String.valueOf(stringBuffer.toString()) + "원";
    }
}
