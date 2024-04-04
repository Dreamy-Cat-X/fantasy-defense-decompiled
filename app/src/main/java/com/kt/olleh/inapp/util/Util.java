package com.kt.olleh.inapp.util;

/* loaded from: D:\decomp\classes.dex */
public class Util {
    public static void addString(StringBuffer stringBuffer, String str, String str2) {
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(str2);
        stringBuffer.append("\n");
    }

    public static void addString(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(i);
        stringBuffer.append("\n");
    }

    public static void addString(StringBuffer stringBuffer, String str, boolean z) {
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(z);
        stringBuffer.append("\n");
    }

    public static void addString(StringBuffer stringBuffer, String str, float f) {
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(f);
        stringBuffer.append("\n");
    }

    public static void addUrlString(StringBuffer stringBuffer, String str, String str2, boolean z) {
        stringBuffer.append(str);
        stringBuffer.append("=");
        stringBuffer.append(str2);
        if (z) {
            stringBuffer.append("&");
        }
    }
}
