package com.google.android.gms.ads;

import android.graphics.drawable.Drawable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface MediaContent {
    float getAspectRatio();

    float getCurrentTime();

    float getDuration();

    Drawable getMainImage();

    VideoController getVideoController();

    boolean hasVideoContent();

    void setMainImage(Drawable drawable);
}
