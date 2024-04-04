package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbn {
    private Map<Integer, Bitmap> zzeet = new ConcurrentHashMap();
    private AtomicInteger zzeeu = new AtomicInteger(0);

    public final Bitmap zza(Integer num) {
        return this.zzeet.get(num);
    }
}
