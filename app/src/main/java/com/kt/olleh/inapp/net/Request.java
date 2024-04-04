package com.kt.olleh.inapp.net;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: D:\decomp\classes.dex */
public class Request {
    private static final String ADDINFO = "add_info";
    private static final String APP_ID = "app_id";
    private static final String APP_VER = "oscv";
    private static final String BRAND_ID = "brand_id";
    private static final String CHANNEL = "channel";
    private static final String CHARGE_YN = "charge_yn";
    private static final String CID = "cid";
    private static final String CNAME = "c_name";
    private static final String COMMAND = "c";
    private static final String CONTENT = "content";
    private static final String CONTENTS_TYPE = "contents_type";
    private static final String C_ID = "c_id";
    private static final String DEGREE = "degree";
    private static final String DEVICE_NUMBER = "dn";
    private static final String DEVICE_TYPE = "dt";
    private static final String EMAIL = "email";
    private static final String EVENTKEY = "eventKey";
    private static final String F_ID = "f_id";
    private static final String F_TYPE = "f_type";
    public static final String GETSYMKEYGEN = "getSymKeyGen";
    private static final String ID = "id";
    private static final String JUMIN_NUM = "jumin";
    private static final String KEYWORD = "keyword";
    private static final String LCDSIZE = "lcd";
    private static final String MAIN_YN = "main_yn";
    private static final String ME2_ID = "me2_id";
    private static final String ME2_KEY = "me2_key";
    private static final String MODEL = "model";
    private static final String MY_ONE_CODE = "code_id";
    private static final String MY_ONE_DEVICE_INFO = "device_info";
    private static final String MY_ONE_PNO = "pno";
    private static final String MY_ONE_QNA_TITLE = "qna_title";
    private static final String NEW_PWD = "new_pwd";
    private static final String NOTICE_ID = "notice_id";
    private static final String N_ID = "n_id";
    private static final String OFF_SET = "off_set";
    private static final String PARENT_ID = "parent_id";
    private static final String PAY_KEY = "pay_key";
    private static final String PAY_TYPE = "pay_type";
    private static final String PG = "pg";
    private static final String PG_SIZE = "pg_size";
    private static final String PHONENO = "phone";
    private static final String PWD = "pwd";
    private static final String P_ID = "p_id";
    private static final String P_TYPE = "p_type";
    private static final String QNA_CONTENT = "qna_content";
    private static final String QNA_ID = "qna_id";
    private static final String QNA_TYPE = "qna_type";
    private static final String REPLY_ID = "reply_id";
    private static final String REPORT_CONTENT = "report_content";
    private static final String REPORT_TYPE = "report_type";
    private static final String REQUIRY_ID = "requiry_id";
    private static final String REQ_TIME = "rt";
    private static final String SELLER_ID = "seller_id";
    private static final String STARSCORE = "starscore";
    private static final String TRAND_ID = "trand_id";
    private static final String TW_ID = "tw_id";
    private static final String TW_PW = "tw_pw";
    private static final String TYPE = "type";
    private static String mAppVer;
    private static String mChannel;
    private static int mCommand;
    private static String mDeviceNumber;
    private static String mDeviceType;
    private static String mLCDSize;
    private static String mMainUrl;
    private static String mModel;
    private static String mPageUrl;
    private static String mPhoneNo;
    private static List<NameValuePair> params;
    private static String streamData;

    public static void init(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        mMainUrl = str;
        mPageUrl = str2;
        mPhoneNo = str3;
        mDeviceNumber = str4;
        mDeviceType = str5;
        mModel = str6;
        mLCDSize = str7;
        mAppVer = str8;
        mChannel = str9;
    }

    public static void setMainURL(String str) {
        mMainUrl = str;
    }

    public static void setDeviceID(String str) {
        mDeviceNumber = str;
    }

    protected static StringBuffer toURL(int i) {
        mCommand = i;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getMainURL());
        stringBuffer.append(getPageUrl());
        ArrayList arrayList = new ArrayList();
        params = arrayList;
        arrayList.add(new BasicNameValuePair(COMMAND, String.valueOf(i)));
        params.add(new BasicNameValuePair(PHONENO, mPhoneNo));
        params.add(new BasicNameValuePair(DEVICE_NUMBER, mDeviceNumber));
        params.add(new BasicNameValuePair(DEVICE_TYPE, mDeviceType));
        params.add(new BasicNameValuePair(MODEL, mModel));
        params.add(new BasicNameValuePair(LCDSIZE, mLCDSize));
        params.add(new BasicNameValuePair(APP_VER, mAppVer));
        params.add(new BasicNameValuePair(CHANNEL, mChannel));
        return stringBuffer;
    }

    public static String getMainURL() {
        return mMainUrl;
    }

    private static String getPageUrl() {
        return mPageUrl;
    }

    protected static int getCommand() {
        return mCommand;
    }

    public static List<NameValuePair> getParams() {
        return params;
    }

    public static void clearParams() {
        params.clear();
        params = null;
    }

    public static void setData(String str) {
        streamData = str;
    }

    public static String getData() {
        return streamData;
    }

    public static String request(int i) {
        return toURL(i).toString();
    }

    public static String requestContSearch(int i, int i2, int i3, String str, String str2) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PG, Integer.toString(i2)));
        params.add(new BasicNameValuePair(PG_SIZE, Integer.toString(i3)));
        params.add(new BasicNameValuePair(N_ID, str));
        params.add(new BasicNameValuePair(KEYWORD, str2));
        return toString(url.toString());
    }

    public static String requestContAllSearch(int i, int i2, int i3, String str) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PG, Integer.toString(i2)));
        params.add(new BasicNameValuePair(PG_SIZE, Integer.toString(i3)));
        params.add(new BasicNameValuePair(KEYWORD, str));
        return toString(url.toString());
    }

    public static String requestList(int i, int i2, int i3, String str, String str2, String str3) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PG, Integer.toString(i2)));
        params.add(new BasicNameValuePair(PG_SIZE, Integer.toString(i3)));
        params.add(new BasicNameValuePair(P_TYPE, str));
        params.add(new BasicNameValuePair(P_ID, str2));
        params.add(new BasicNameValuePair(N_ID, str3));
        return toString(url.toString());
    }

    public static String requestEventDetail(int i, int i2, int i3, String str, String str2) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PG, Integer.toString(i2)));
        params.add(new BasicNameValuePair(PG_SIZE, Integer.toString(i3)));
        params.add(new BasicNameValuePair(P_TYPE, str));
        params.add(new BasicNameValuePair(P_ID, str2));
        return toString(url.toString());
    }

    public static String requestList(int i, int i2, int i3) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PG, Integer.toString(i2)));
        params.add(new BasicNameValuePair(PG_SIZE, Integer.toString(i3)));
        return toString(url.toString());
    }

    public static String requestBrandList(int i, int i2, int i3, String str, String str2) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PG, Integer.toString(i2)));
        params.add(new BasicNameValuePair(PG_SIZE, Integer.toString(i3)));
        params.add(new BasicNameValuePair(MAIN_YN, str));
        params.add(new BasicNameValuePair(BRAND_ID, str2));
        return toString(url.toString());
    }

    public static String requestBrandCategory(int i, String str) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(BRAND_ID, str));
        return toString(url.toString());
    }

    public static String requestNIDList(int i, int i2, int i3, String str) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PG, Integer.toString(i2)));
        params.add(new BasicNameValuePair(PG_SIZE, Integer.toString(i3)));
        params.add(new BasicNameValuePair(N_ID, str));
        return toString(url.toString());
    }

    public static String requestList(int i, int i2, int i3, String str, String str2) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PG, Integer.toString(i2)));
        params.add(new BasicNameValuePair(PG_SIZE, Integer.toString(i3)));
        params.add(new BasicNameValuePair(MAIN_YN, str));
        params.add(new BasicNameValuePair(N_ID, str2));
        return toString(url.toString());
    }

    public static String requestBestList(int i, int i2, int i3, String str, String str2, String str3) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PG, Integer.toString(i2)));
        params.add(new BasicNameValuePair(PG_SIZE, Integer.toString(i3)));
        params.add(new BasicNameValuePair(MAIN_YN, str));
        params.add(new BasicNameValuePair(N_ID, str2));
        params.add(new BasicNameValuePair(CHARGE_YN, str3));
        return toString(url.toString());
    }

    public static String requestMusicList(int i, int i2, int i3, String str, String str2, String str3) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PG, Integer.toString(i2)));
        params.add(new BasicNameValuePair(PG_SIZE, Integer.toString(i3)));
        params.add(new BasicNameValuePair(MAIN_YN, str));
        params.add(new BasicNameValuePair(N_ID, str2));
        params.add(new BasicNameValuePair(CONTENTS_TYPE, str3));
        return toString(url.toString());
    }

    public static String requestCategory(int i, String str) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PARENT_ID, str));
        return toString(url.toString());
    }

    public static String requestDetail(int i, String str, String str2, String str3) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(P_TYPE, str));
        params.add(new BasicNameValuePair(P_ID, str2));
        params.add(new BasicNameValuePair(N_ID, str3));
        return toString(url.toString());
    }

    public static String requestDetail(int i, String str, String str2) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(P_TYPE, str));
        params.add(new BasicNameValuePair(P_ID, str2));
        return toString(url.toString());
    }

    public static String requestStarScore(int i, String str, String str2, String str3, String str4, int i2) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(P_TYPE, str));
        params.add(new BasicNameValuePair(P_ID, str2));
        params.add(new BasicNameValuePair(N_ID, str3));
        params.add(new BasicNameValuePair(SELLER_ID, str4));
        params.add(new BasicNameValuePair(STARSCORE, String.valueOf(i2)));
        return toString(url.toString());
    }

    public static String requestReplyList(int i, int i2, int i3, String str, String str2, String str3) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PG, Integer.toString(i2)));
        params.add(new BasicNameValuePair(PG_SIZE, Integer.toString(i3)));
        params.add(new BasicNameValuePair(P_TYPE, str));
        params.add(new BasicNameValuePair(P_ID, str2));
        params.add(new BasicNameValuePair(N_ID, str3));
        return toString(url.toString());
    }

    public static String requestReplyRegister(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(P_TYPE, str));
        params.add(new BasicNameValuePair(P_ID, str2));
        params.add(new BasicNameValuePair(N_ID, str3));
        params.add(new BasicNameValuePair(CONTENT, str4));
        if (str5 != null) {
            params.add(new BasicNameValuePair(ME2_ID, str5));
            params.add(new BasicNameValuePair(ME2_KEY, str6));
        }
        if (str7 != null) {
            params.add(new BasicNameValuePair(TW_ID, str7));
            params.add(new BasicNameValuePair(TW_PW, str8));
        }
        return toString(url.toString());
    }

    public static String requestSellerList(int i, int i2, int i3, String str, String str2) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PG, Integer.toString(i2)));
        params.add(new BasicNameValuePair(PG_SIZE, Integer.toString(i3)));
        params.add(new BasicNameValuePair(N_ID, str));
        params.add(new BasicNameValuePair(SELLER_ID, str2));
        return toString(url.toString());
    }

    public static String requestInquirySeller(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(QNA_TYPE, str));
        params.add(new BasicNameValuePair(QNA_CONTENT, str2));
        params.add(new BasicNameValuePair("email", str3));
        params.add(new BasicNameValuePair(P_TYPE, str4));
        params.add(new BasicNameValuePair(P_ID, str5));
        params.add(new BasicNameValuePair(N_ID, str6));
        params.add(new BasicNameValuePair(SELLER_ID, str7));
        return toString(url.toString());
    }

    public static String requestBuy(int i, String str, String str2, String str3, String str4, int i2, String str5) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(P_TYPE, str));
        params.add(new BasicNameValuePair(P_ID, str2));
        params.add(new BasicNameValuePair(N_ID, str3));
        params.add(new BasicNameValuePair(F_TYPE, str4));
        if (i2 != -1) {
            params.add(new BasicNameValuePair(PAY_TYPE, String.valueOf(i2)));
            params.add(new BasicNameValuePair(PAY_KEY, str5));
        }
        return toString(url.toString());
    }

    public static String requestContentRecommand(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(P_TYPE, str));
        params.add(new BasicNameValuePair(P_ID, str2));
        params.add(new BasicNameValuePair(N_ID, str3));
        params.add(new BasicNameValuePair(CNAME, str4));
        params.add(new BasicNameValuePair(ADDINFO, str5));
        params.add(new BasicNameValuePair(ME2_ID, str6));
        params.add(new BasicNameValuePair(ME2_KEY, str7));
        params.add(new BasicNameValuePair(TW_ID, str8));
        params.add(new BasicNameValuePair(TW_PW, str9));
        return toString(url.toString());
    }

    public static String requestStreaming(int i, String str, String str2, String str3, String str4, String str5) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(P_TYPE, str));
        params.add(new BasicNameValuePair(P_ID, str2));
        params.add(new BasicNameValuePair(C_ID, str3));
        params.add(new BasicNameValuePair(N_ID, str4));
        params.add(new BasicNameValuePair(F_TYPE, str5));
        return toString(url.toString());
    }

    public static String requestBeingSave(int i, String str, String str2) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(C_ID, str));
        params.add(new BasicNameValuePair(OFF_SET, str2));
        return toString(url.toString());
    }

    public static String requestAnroidManifest(int i, String str, String str2) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(C_ID, str));
        params.add(new BasicNameValuePair(F_ID, str2));
        return toString(url.toString());
    }

    public static String requestMyBuyList(int i, int i2, int i3, String str) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PG, Integer.toString(i2)));
        params.add(new BasicNameValuePair(PG_SIZE, Integer.toString(i3)));
        params.add(new BasicNameValuePair(N_ID, str));
        return toString(url.toString());
    }

    public static String requestMySellerDetail(int i, int i2) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(REQUIRY_ID, String.valueOf(i2)));
        return toString(url.toString());
    }

    public static String requestMyReplyDel(int i, String str) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(REPLY_ID, str));
        return toString(url.toString());
    }

    public static String requestMyReplyEvaluation(int i, int i2, int i3) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(REQUIRY_ID, String.valueOf(i2)));
        params.add(new BasicNameValuePair(DEGREE, String.valueOf(i3)));
        return toString(url.toString());
    }

    public static String requestMyOneInquiryReg(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(MY_ONE_CODE, str));
        params.add(new BasicNameValuePair(MY_ONE_QNA_TITLE, str2));
        params.add(new BasicNameValuePair(QNA_CONTENT, str3));
        params.add(new BasicNameValuePair("email", str4));
        params.add(new BasicNameValuePair(MY_ONE_PNO, str5));
        params.add(new BasicNameValuePair(MY_ONE_DEVICE_INFO, str6));
        return toString(url.toString());
    }

    public static String requestMyOneQuestionDetail(int i, int i2) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(QNA_ID, String.valueOf(i2)));
        return toString(url.toString());
    }

    public static String requestNotice(int i, String str) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(NOTICE_ID, str));
        return toString(url.toString());
    }

    public static String requestAppRecentVersionList(int i, int i2, int i3) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PG, String.valueOf(i2)));
        params.add(new BasicNameValuePair(PG_SIZE, String.valueOf(i3)));
        return toString(url.toString());
    }

    public static String requestAppRecentVersion(int i, String str) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair("app_id", str));
        return toString(url.toString());
    }

    public static String requestBuyPwd(int i, String str) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PWD, str));
        return toString(url.toString());
    }

    public static String requestBuyPwdInit(int i, String str, String str2, String str3) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(TYPE, str));
        params.add(new BasicNameValuePair(PWD, str2));
        params.add(new BasicNameValuePair(NEW_PWD, str3));
        return toString(url.toString());
    }

    public static String requestAdultPwd(int i, String str) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PWD, str));
        return toString(url.toString());
    }

    public static String requestAdultPwdInit(int i, String str, String str2, String str3) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(PWD, str2));
        params.add(new BasicNameValuePair(NEW_PWD, str3));
        return toString(url.toString());
    }

    public static String requestSnsPwd(int i, String str, String str2, String str3) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(TYPE, str));
        params.add(new BasicNameValuePair(ID, str2));
        params.add(new BasicNameValuePair(PWD, str3));
        return toString(url.toString());
    }

    public static String requestJuminNum(int i, String str) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(JUMIN_NUM, str));
        return toString(url.toString());
    }

    public static String requestTrandDetail(int i, String str, String str2) {
        StringBuffer url = toURL(i);
        params.add(new BasicNameValuePair(P_TYPE, str));
        params.add(new BasicNameValuePair(TRAND_ID, str2));
        return toString(url.toString());
    }

    public static String requestContentInfo(int i, String str, String str2) {
        StringBuffer url = toURL(i);
        if (str != null) {
            params.add(new BasicNameValuePair(C_ID, str));
        }
        if (str2 != null) {
            params.add(new BasicNameValuePair("app_id", str2));
        }
        return toString(url.toString());
    }

    private static String toString(String str) {
        return str.replaceAll(" ", "%20");
    }
}
