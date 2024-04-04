package com.kt.olleh.inapp.Config;

import android.util.Log;

/* loaded from: D:\decomp\classes.dex */
public class Config {
    public static final String B007 = "B007";
    public static final String B007_msg = "구매한도를 초과하여 더 이상 구매하실 수 없습니다.";
    public static final String B009 = "B009";
    public static final String B009_msg = "일별 구매한도를 초과하여 더 이상 구매하실 수 없습니다.";
    public static final String B010 = "B010";
    public static final String B010_msg = "월별 구매한도를 초과하여 더 이상 구매하실 수 없습니다.";
    public static boolean DEBUG = false;
    public static String TAG = "Config";
    public static String VERSION = null;
    public static final boolean bIsStandAlone = false;
    public static boolean bTBserver = false;
    public static final int iLibSetting = 0;

    public static void LogD(String str, String str2) {
        if (DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");
            stringBuffer.append(str);
            stringBuffer.append("] ");
            stringBuffer.append(str2);
            Log.d(TAG, stringBuffer.toString());
        }
    }

    public static void LogI(String str, String str2) {
        if (DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");
            stringBuffer.append(str);
            stringBuffer.append("] ");
            stringBuffer.append(str2);
            Log.i(TAG, stringBuffer.toString());
        }
    }

    public static void LogE(String str, String str2) {
        if (DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");
            stringBuffer.append(str);
            stringBuffer.append("] ");
            stringBuffer.append(str2);
            Log.e(TAG, stringBuffer.toString());
        }
    }

    public static void LogW(String str, String str2) {
        if (DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");
            stringBuffer.append(str);
            stringBuffer.append("] ");
            stringBuffer.append(str2);
            Log.w(TAG, stringBuffer.toString());
        }
    }

    public static void LogD(String str, String str2, Throwable th) {
        if (DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");
            stringBuffer.append(str);
            stringBuffer.append("] ");
            stringBuffer.append(str2);
            Log.d(TAG, stringBuffer.toString(), th);
        }
    }

    public static void LogI(String str, String str2, Throwable th) {
        if (DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");
            stringBuffer.append(str);
            stringBuffer.append("] ");
            stringBuffer.append(str2);
            Log.i(TAG, stringBuffer.toString(), th);
        }
    }

    public static void LogE(String str, String str2, Throwable th) {
        if (DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");
            stringBuffer.append(str);
            stringBuffer.append("] ");
            stringBuffer.append(str2);
            Log.e(TAG, stringBuffer.toString(), th);
        }
    }

    public static void LogW(String str, String str2, Throwable th) {
        if (DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");
            stringBuffer.append(str);
            stringBuffer.append("] ");
            stringBuffer.append(str2);
            Log.w(TAG, stringBuffer.toString(), th);
        }
    }
}
