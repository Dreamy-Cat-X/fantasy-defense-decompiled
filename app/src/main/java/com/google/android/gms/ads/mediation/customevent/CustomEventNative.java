package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface CustomEventNative extends CustomEvent {
    void requestNativeAd(Context context, CustomEventNativeListener customEventNativeListener, String str, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle);
}
