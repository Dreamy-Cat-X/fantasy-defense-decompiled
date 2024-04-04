package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public interface Clock {
    long currentThreadTimeMillis();

    long currentTimeMillis();

    long elapsedRealtime();

    long nanoTime();
}
