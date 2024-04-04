package com.kt.olleh.inapp;

import com.kt.olleh.inapp.net.Response;

/* loaded from: D:\decomp\classes.dex */
public interface OnInAppListener {
    void OnError(String str, String str2);

    void OnResultAPI(String str, Response response);

    void OnResultFileURL(String str, String str2);

    void OnResultOLDAPI(String str, String str2);

    void OnResultPurchase(String str);
}
