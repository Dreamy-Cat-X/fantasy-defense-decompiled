package com.google.android.gms.ads.nativead;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class NativeAd {
    public abstract void performClick(Bundle bundle);

    public abstract boolean recordImpression(Bundle bundle);

    public abstract void reportTouchEvent(Bundle bundle);
}
