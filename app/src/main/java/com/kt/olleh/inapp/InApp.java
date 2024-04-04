package com.kt.olleh.inapp;

import android.os.AsyncTask;
import com.kt.olleh.inapp.Config.Config;
import com.kt.olleh.inapp.crypt.AESCrypt;
import com.kt.olleh.inapp.net.InAppAPI;
import com.kt.olleh.inapp.net.InAppError;
import com.kt.olleh.inapp.net.NetworkManager;
import com.kt.olleh.inapp.net.ResCheckCoin;
import com.kt.olleh.inapp.net.ResCheckShowId;
import com.kt.olleh.inapp.net.ResDIApproveDown;
import com.kt.olleh.inapp.net.ResDIBuy;
import com.kt.olleh.inapp.net.ResDIDetail;
import com.kt.olleh.inapp.net.ResDIGetFile;
import com.kt.olleh.inapp.net.ResDIList;
import com.kt.olleh.inapp.net.ResDIListExpand;
import com.kt.olleh.inapp.net.ResDIesBuy;
import com.kt.olleh.inapp.net.ResGetSymKeyGen;
import com.kt.olleh.inapp.net.Response;
import com.kt.olleh.inapp.net.ResponseOld;
import com.kt.olleh.inapp.net.XMLParser;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: D:\decomp\classes.dex */
public class InApp {
    private static final String TAG = "InApp";
    private String mAES_URL;
    private volatile boolean mRun = false;
    private NetworkManager mNetManager = null;
    private final String TB_URL = "http://221.148.247.203:8888/INAP_GW/inap_gw/";
    private final String RS_URL = "http://inapppurchase.ollehmarket.com/INAP_GW/inap_gw/";
    private final String crypto_param = "crypto_param/";
    private final String seq_key = "/seq_key/";
    private final String mApp_id = "/app_id/";
    private final String mUser_info = "/user_info/";
    private final String mAuthen = "/authen/";
    private final String mPage_size = "/page_size/";
    private final String mPage = "/page/";
    private final String mRecipients = "/recipients/";
    private final String mDi_id = "/di_id/";
    private final String mBuy_type = "/buy_type/";
    private final String mTr_id = "/tr_id/";
    private final String mFile_name = "/file_name/";
    private final String mMime_type = "/mime_type/";
    private final String mShow_id = "/show_id/";
    private final String mPwd = "/pwd/";
    private final String mBuy_pwd = "/buy_pwd/";
    private final String mOpcode = "opcode=";
    private final String mIid = "&iid=";
    private final String mAppid = "&appid=";
    private final String mPhone = "&phone=";
    private String mAPI = null;
    private String mAPINext = null;
    private String mSymmetric_key = null;
    private String mSeq_key = null;
    private NetworkTask mRunningTask = null;

    public String getMainURL() {
        return Config.bTBserver ? "http://221.148.247.203:8888/INAP_GW/inap_gw/" : "http://inapppurchase.ollehmarket.com/INAP_GW/inap_gw/";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void networkTaskStart(OnInAppListener onInAppListener, String str, String str2) {
        NetworkTask networkTask = new NetworkTask(onInAppListener);
        networkTask.execute(str, str2);
        this.mRunningTask = networkTask;
        this.mRun = true;
    }

    public void getDIUsableList(String str, String str2, String str3, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.getUseDiList;
        String str4 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: app_id = " + str + ", user_info = " + str2 + ", authen = " + str3);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "/app_id/" + str + "/user_info/" + str2 + "/authen/" + str3;
        networkTaskStart(onInAppListener, str4, this.mAPI);
    }

    public void getDIPurchaseList(String str, String str2, String str3, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.getBuyDiList;
        String str4 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: app_id = " + str + ", user_info = " + str2 + ", authen = " + str3);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "/app_id/" + str + "/user_info/" + str2 + "/authen/" + str3;
        networkTaskStart(onInAppListener, str4, this.mAPI);
    }

    public void getDIAllList(String str, String str2, String str3, int i, int i2, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.getAllDiList;
        String str4 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: app_id = " + str + ", user_info = " + str2 + ", authen = " + str3 + ", page_size = " + i + ", page = " + i2);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "/app_id/" + str + "/user_info/" + str2 + "/authen/" + str3 + "/page_size/" + i + "/page/" + i2;
        networkTaskStart(onInAppListener, str4, this.mAPI);
    }

    public void getDIAllList(String str, String str2, String str3, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.getAllDiList;
        String str4 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: app_id = " + str + ", user_info = " + str2 + ", authen = " + str3);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "/app_id/" + str + "/user_info/" + str2 + "/authen/" + str3;
        networkTaskStart(onInAppListener, str4, this.mAPI);
    }

    public void getDIGiftList(String str, String str2, String str3, String str4, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.getGiftDiList;
        String str5 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: app_id = " + str + ", user_info = " + str2 + ", authen = " + str3 + ", recipients = " + str4);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "/app_id/" + str + "/user_info/" + str2 + "/authen/" + str3 + "/recipients/" + str4;
        networkTaskStart(onInAppListener, str5, this.mAPI);
    }

    public void getDIGiftList(String str, String str2, String str3, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.getGiftDiList;
        String str4 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: app_id = " + str + ", user_info = " + str2 + ", authen = " + str3);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "/app_id/" + str + "/user_info/" + str2 + "/authen/" + str3;
        networkTaskStart(onInAppListener, str4, this.mAPI);
    }

    public void getDIReceiveList(String str, String str2, String str3, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.getReceiveDiList;
        String str4 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: app_id = " + str + ", user_info = " + str2 + ", authen = " + str3);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "/app_id/" + str + "/user_info/" + str2 + "/authen/" + str3;
        networkTaskStart(onInAppListener, str4, this.mAPI);
    }

    public void getDIInformation(String str, String str2, String str3, String str4, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.getDiDetail;
        String str5 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: app_id = " + str + ", di_id = " + str2 + ", user_info = " + str3 + ", authen = " + str4);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "/app_id/" + str + "/di_id/" + str2 + "/user_info/" + str3 + "/authen/" + str4;
        networkTaskStart(onInAppListener, str5, this.mAPI);
    }

    public void getDIDownloadableList(String str, String str2, String str3, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.getDownloadDiList;
        String str4 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: app_id = " + str + ", user_info = " + str2 + ", authen = " + str3);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "/app_id/" + str + "/user_info/" + str2 + "/authen/" + str3;
        networkTaskStart(onInAppListener, str4, this.mAPI);
    }

    public void requestDIBuy(String str, String str2, String str3, String str4, String str5, String str6, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.buyDi;
        String str7 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: app_id = " + str + ", di_id = " + str2 + ", user_info = " + str3 + ", authen = " + str4 + ", buy_type = " + str5 + ", buy_pwd = " + str6);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "/app_id/" + str + "/di_id/" + str2 + "/user_info/" + str3 + "/authen/" + str4 + "/buy_type/" + str5 + "/buy_pwd/" + str6;
        networkTaskStart(onInAppListener, str7, this.mAPI);
    }

    public void requestDIReBuy(String str, String str2, String str3, String str4, String str5, String str6, OnInAppListener onInAppListener) {
        this.mAPI = InAppAPI.buyDi;
        String str7 = null;
        this.mAPINext = null;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: app_id = " + str + ", di_id = " + str2 + ", user_info = " + str3 + ", authen = " + str4 + ", buy_type = " + str5 + ", buy_pwd = " + str6);
        }
        String str8 = String.valueOf(this.mAPI) + "/app_id/" + str + "/di_id/" + str2 + "/user_info/" + str3 + "/authen/" + str4 + "/buy_type/" + str5 + "/buy_pwd/" + str6;
        this.mAES_URL = str8;
        if (this.mSymmetric_key == null || str8 == null) {
            onInAppListener.OnError("0000", "이전 구매 내역 없음");
        }
        try {
            if (this.mAES_URL != null) {
                str7 = AESCrypt.encrypt(this.mSymmetric_key, this.mAES_URL);
            }
        } catch (Exception e) {
            Config.LogE(TAG, "AESCrypter ::" + e);
        }
        networkTaskStart(onInAppListener, String.valueOf(getMainURL()) + "crypto_param/" + str7 + "/seq_key/" + this.mSeq_key, this.mAPI);
    }

    public void requestDIBuyCancel(String str, String str2, String str3, String str4, String str5, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.buyCancelDi;
        String str6 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: app_id = " + str + ", di_id = " + str2 + ", user_info = " + str3 + ", authen = " + str4 + ", tr_id = " + str5);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "/app_id/" + str + "/di_id/" + str2 + "/user_info/" + str3 + "/authen/" + str4 + "/tr_id/" + str5;
        networkTaskStart(onInAppListener, str6, this.mAPI);
    }

    public void requestDIesBuy(String str, String str2, String str3, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.esBuyDi;
        String str4 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: iid = " + str + ", appid = " + str2 + ", phone = " + str3);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "?opcode=1&iid=" + str + "&appid=" + str2 + "&phone=" + str3;
        networkTaskStart(onInAppListener, str4, this.mAPI);
    }

    public void requestDIGift(String str, String str2, String str3, String str4, String str5, String str6, String str7, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.giftDi;
        String str8 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: app_id = " + str + ", di_id = " + str2 + ", user_info = " + str3 + ", authen = " + str4 + ", buy_type = " + str5 + ", buy_pwd = " + str6 + ", recipients = " + str7);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "/app_id/" + str + "/di_id/" + str2 + "/user_info/" + str3 + "/authen/" + str4 + "/buy_type/" + str5 + "/buy_pwd/" + str6 + "/recipients/" + str7;
        networkTaskStart(onInAppListener, str8, this.mAPI);
    }

    public void requestDIReGift(String str, String str2, String str3, String str4, String str5, String str6, String str7, OnInAppListener onInAppListener) {
        this.mAPI = InAppAPI.reGiftDi;
        String str8 = null;
        this.mAPINext = null;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: app_id = " + str + ", di_id = " + str2 + ", user_info = " + str3 + ", authen = " + str4 + ", buy_type = " + str5 + ", buy_pwd = " + str6 + ", recipients = " + str7);
        }
        String str9 = String.valueOf(this.mAPI) + "/app_id/" + str + "/di_id/" + str2 + "/user_info/" + str3 + "/authen/" + str4 + "/buy_type/" + str5 + "/buy_pwd/" + str6 + "/recipients/" + str7;
        this.mAES_URL = str9;
        if (this.mSymmetric_key == null || str9 == null) {
            onInAppListener.OnError("0000", "이전 선물 구매 내역 없음");
        }
        try {
            if (this.mAES_URL != null) {
                str8 = AESCrypt.encrypt(this.mSymmetric_key, this.mAES_URL);
            }
        } catch (Exception e) {
            Config.LogE(TAG, "AESCrypter ::" + e);
        }
        networkTaskStart(onInAppListener, String.valueOf(getMainURL()) + "crypto_param/" + str8 + "/seq_key/" + this.mSeq_key, this.mAPI);
    }

    public void requestDIApproveUse(String str, String str2, String str3, String str4, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.approvedUseDi;
        String str5 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: app_id = " + str + ", di_id = " + str2 + ", user_info = " + str3 + ", authen = " + str4);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "/app_id/" + str + "/di_id/" + str2 + "/user_info/" + str3 + "/authen/" + str4;
        networkTaskStart(onInAppListener, str5, this.mAPI);
    }

    public void requestDIApproveDown(String str, String str2, String str3, String str4, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.approvedDownDi;
        String str5 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: app_id = " + str + ", di_id = " + str2 + ", user_info = " + str3 + ", authen = " + str4);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "/app_id/" + str + "/di_id/" + str2 + "/user_info/" + str3 + "/authen/" + str4;
        networkTaskStart(onInAppListener, str5, this.mAPI);
    }

    public void requestDIgetFile(String str, String str2, String str3, String str4, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.getFile;
        String str5 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: file_name = " + str + ", mime_type = " + str2 + ", user_info = " + str3 + ", authen = " + str4);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "/file_name/" + str + "/mime_type/" + str2 + "/user_info/" + str3 + "/authen/" + str4;
        networkTaskStart(onInAppListener, str5, this.mAPI);
    }

    public void requestCheckShowId(String str, String str2, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.checkShowId;
        String str3 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: show_id = " + str + ", pwd = " + str2);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "/show_id/" + str + "/pwd/" + str2;
        networkTaskStart(onInAppListener, str3, this.mAPI);
    }

    public void requestCheckCoin(String str, String str2, OnInAppListener onInAppListener) {
        this.mAPI = "getSymKeyGen";
        this.mAPINext = InAppAPI.checkCoin;
        String str3 = String.valueOf(getMainURL()) + this.mAPI;
        if (Config.DEBUG) {
            Config.LogD(TAG, "Parameter :: user_info = " + str + ", authen = " + str2);
        }
        this.mAES_URL = String.valueOf(this.mAPINext) + "/user_info/" + str + "/authen/" + str2;
        networkTaskStart(onInAppListener, str3, this.mAPI);
    }

    public void requestCancel() {
        NetworkTask networkTask = this.mRunningTask;
        if (networkTask != null) {
            networkTask.cancel(true);
        }
        this.mRunningTask = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: D:\decomp\classes.dex */
    public class NetworkTask extends AsyncTask<String, Void, InputStream> {
        private String mCurrentAPI = null;
        private int mLastError;
        private int mLastHttpCode;
        private OnInAppListener mListener;

        public NetworkTask(OnInAppListener onInAppListener) {
            this.mListener = onInAppListener;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public InputStream doInBackground(String... strArr) {
            String str = strArr[0];
            this.mCurrentAPI = strArr[1];
            InApp.this.mNetManager = new NetworkManager();
            return InApp.this.mNetManager.getData(str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01d3  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0209  */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onPostExecute(InputStream inputStream) {
            String str;
            String str2;
            if (isCancelled()) {
                return;
            }
            if (inputStream != null) {
                if (InApp.this.mRun) {
                    if (this.mCurrentAPI.equalsIgnoreCase(InAppAPI.esBuyDi)) {
                        ResponseOld parseXML_OLD = XMLParser.parseXML_OLD(inputStream, this.mCurrentAPI);
                        if (parseXML_OLD != null) {
                            if (InApp.this.mRun) {
                                this.mListener.OnResultOLDAPI(parseXML_OLD.mResultCode, parseXML_OLD.mResultMessage);
                                return;
                            }
                            return;
                        } else {
                            this.mLastError = InApp.this.mNetManager.getLastError();
                            this.mLastHttpCode = InApp.this.mNetManager.getLastHttpCode();
                            if (InApp.this.mRun) {
                                sendErrorReason("A015", "서버 요청 응답 시간 초과");
                                return;
                            }
                            return;
                        }
                    }
                    Response parseXML = XMLParser.parseXML(inputStream, this.mCurrentAPI);
                    if (parseXML != null) {
                        if (!InAppError.SUCCESS.equalsIgnoreCase(parseXML.mCode)) {
                            if (InApp.this.mRun) {
                                sendErrorReason(parseXML.mCode, parseXML.mReason);
                                return;
                            }
                            return;
                        }
                        if (Config.DEBUG) {
                            Config.LogD(InApp.TAG, "onPostExecute(" + InApp.this.mAPI + ") called");
                        }
                        if (!InApp.this.mAPI.equalsIgnoreCase("getSymKeyGen")) {
                            if (!InApp.this.mAPI.equalsIgnoreCase(InAppAPI.getUseDiList) && !InApp.this.mAPI.equalsIgnoreCase(InAppAPI.getDownloadDiList)) {
                                if (!InApp.this.mAPI.equalsIgnoreCase(InAppAPI.getBuyDiList) && !InApp.this.mAPI.equalsIgnoreCase(InAppAPI.getAllDiList) && !InApp.this.mAPI.equalsIgnoreCase(InAppAPI.getGiftDiList) && !InApp.this.mAPI.equalsIgnoreCase(InAppAPI.getReceiveDiList)) {
                                    if (!InApp.this.mAPI.equalsIgnoreCase(InAppAPI.getDiDetail)) {
                                        if (!InApp.this.mAPI.equalsIgnoreCase(InAppAPI.buyDi) && !InApp.this.mAPI.equalsIgnoreCase(InAppAPI.buyCancelDi) && !InApp.this.mAPI.equalsIgnoreCase(InAppAPI.giftDi) && !InApp.this.mAPI.equalsIgnoreCase(InAppAPI.reGiftDi) && !InApp.this.mAPI.equalsIgnoreCase(InAppAPI.approvedUseDi)) {
                                            if (!InApp.this.mAPI.equalsIgnoreCase(InAppAPI.esBuyDi)) {
                                                if (!InApp.this.mAPI.equalsIgnoreCase(InAppAPI.approvedDownDi)) {
                                                    if (!InApp.this.mAPI.equalsIgnoreCase(InAppAPI.getFile)) {
                                                        if (!InApp.this.mAPI.equalsIgnoreCase(InAppAPI.checkShowId)) {
                                                            if (InApp.this.mAPI.equalsIgnoreCase(InAppAPI.checkCoin)) {
                                                                ResCheckCoin resCheckCoin = (ResCheckCoin) parseXML;
                                                                if (InApp.this.mRun) {
                                                                    this.mListener.OnResultAPI(InApp.this.mAPI, resCheckCoin);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        ResCheckShowId resCheckShowId = (ResCheckShowId) parseXML;
                                                        InAppSettings.UserInfo = resCheckShowId.mShow_id;
                                                        if (InApp.this.mRun) {
                                                            this.mListener.OnResultAPI(InApp.this.mAPI, resCheckShowId);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    ResDIGetFile resDIGetFile = (ResDIGetFile) parseXML;
                                                    if (InApp.this.mRun) {
                                                        this.mListener.OnResultAPI(InApp.this.mAPI, resDIGetFile);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                ResDIApproveDown resDIApproveDown = (ResDIApproveDown) parseXML;
                                                if (InApp.this.mRun) {
                                                    this.mListener.OnResultAPI(InApp.this.mAPI, resDIApproveDown);
                                                    return;
                                                }
                                                return;
                                            }
                                            ResDIesBuy resDIesBuy = (ResDIesBuy) parseXML;
                                            if (InApp.this.mRun) {
                                                this.mListener.OnResultAPI(InApp.this.mAPI, resDIesBuy);
                                                return;
                                            }
                                            return;
                                        }
                                        ResDIBuy resDIBuy = (ResDIBuy) parseXML;
                                        if (InApp.this.mRun) {
                                            this.mListener.OnResultAPI(InApp.this.mAPI, resDIBuy);
                                            return;
                                        }
                                        return;
                                    }
                                    ResDIDetail resDIDetail = (ResDIDetail) parseXML;
                                    if (InApp.this.mRun) {
                                        this.mListener.OnResultAPI(InApp.this.mAPI, resDIDetail);
                                        return;
                                    }
                                    return;
                                }
                                ResDIList resDIList = (ResDIList) parseXML;
                                if (InApp.this.mRun) {
                                    this.mListener.OnResultAPI(InApp.this.mAPI, resDIList);
                                    return;
                                }
                                return;
                            }
                            ResDIListExpand resDIListExpand = (ResDIListExpand) parseXML;
                            if (InApp.this.mRun) {
                                this.mListener.OnResultAPI(InApp.this.mAPI, resDIListExpand);
                                return;
                            }
                            return;
                        }
                        ResGetSymKeyGen resGetSymKeyGen = (ResGetSymKeyGen) parseXML;
                        if (!InApp.this.mAPINext.equalsIgnoreCase(InAppAPI.buyDi) && !InApp.this.mAPINext.equalsIgnoreCase(InAppAPI.giftDi)) {
                            InApp.this.mSymmetric_key = null;
                            InApp.this.mSeq_key = null;
                        } else {
                            InApp.this.mSymmetric_key = resGetSymKeyGen.mSymmetric_key;
                            InApp.this.mSeq_key = resGetSymKeyGen.mSeq_key;
                        }
                        if (Config.DEBUG) {
                            Config.LogI(InApp.TAG, "onPostExecute(" + resGetSymKeyGen.mSymmetric_key + "," + resGetSymKeyGen.mSeq_key + ")");
                        }
                        if (!InAppError.SUCCESS.equalsIgnoreCase(resGetSymKeyGen.mCode)) {
                            if (InApp.this.mRun) {
                                sendErrorReason(resGetSymKeyGen.mCode, resGetSymKeyGen.mReason);
                                return;
                            }
                            return;
                        }
                        try {
                            if (InApp.this.mAES_URL != null) {
                                String encrypt = AESCrypt.encrypt(resGetSymKeyGen.mSymmetric_key, InApp.this.mAES_URL);
                                if (Config.DEBUG) {
                                    Config.LogI(InApp.TAG, "#################################################################");
                                }
                                if (Config.DEBUG) {
                                    Config.LogI(InApp.TAG, "mAES_URL = " + InApp.this.mAES_URL);
                                }
                                if (Config.DEBUG) {
                                    Config.LogI(InApp.TAG, "aesURL = " + encrypt);
                                }
                                str2 = encrypt.replace('/', '$');
                                try {
                                    if (Config.DEBUG) {
                                        Config.LogI(InApp.TAG, "aesReplaceURL = " + str2);
                                    }
                                    if (Config.DEBUG) {
                                        Config.LogI(InApp.TAG, "#################################################################");
                                    }
                                } catch (Exception e) {
                                    str = str2;
                                    e = e;
                                    Config.LogE(InApp.TAG, "AESCrypter ::" + e);
                                    str2 = str;
                                    String str3 = String.valueOf(InApp.this.getMainURL()) + "crypto_param/" + str2 + "/seq_key/" + resGetSymKeyGen.mSeq_key;
                                    if (InApp.this.mAPINext != null) {
                                    }
                                }
                            } else {
                                str2 = null;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = null;
                        }
                        String str32 = String.valueOf(InApp.this.getMainURL()) + "crypto_param/" + str2 + "/seq_key/" + resGetSymKeyGen.mSeq_key;
                        if (InApp.this.mAPINext != null) {
                            if (InApp.this.mRun) {
                                this.mListener.OnResultAPI(InApp.this.mAPI, parseXML);
                                return;
                            }
                            return;
                        }
                        InApp inApp = InApp.this;
                        inApp.mAPI = inApp.mAPINext;
                        InApp.this.mAPINext = null;
                        if (InApp.this.mRun) {
                            if (InApp.this.mAPI.equalsIgnoreCase(InAppAPI.getFile)) {
                                this.mListener.OnResultFileURL(InAppError.SUCCESS, str32);
                                return;
                            } else {
                                InApp inApp2 = InApp.this;
                                inApp2.networkTaskStart(this.mListener, str32, inApp2.mAPI);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            this.mLastError = InApp.this.mNetManager.getLastError();
            this.mLastHttpCode = InApp.this.mNetManager.getLastHttpCode();
            if (InApp.this.mAPI.equalsIgnoreCase(InAppAPI.getFile) || !InApp.this.mRun) {
                return;
            }
            sendErrorReason("A015", "서버에 접속할 수 없습니다. 네트워크 상태를 확인해주세요.");
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            super.onCancelled();
            InApp.this.mRun = false;
            InApp.this.mNetManager.cancel();
        }

        private void sendErrorReason(String str, String str2) {
            if (str == null) {
                str = "code null";
            }
            if (str2 == null) {
                str2 = "reason null";
            }
            if (this.mListener != null) {
                if (str.equalsIgnoreCase(Config.B007)) {
                    str2 = Config.B007_msg;
                } else if (str.equalsIgnoreCase(Config.B009)) {
                    str2 = Config.B009_msg;
                } else if (str.equalsIgnoreCase(Config.B010)) {
                    str2 = Config.B010_msg;
                }
                this.mListener.OnError(str, str2);
            }
        }
    }
}
