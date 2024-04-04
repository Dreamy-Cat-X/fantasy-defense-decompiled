package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzatf {
    private WeakHashMap<Context, zzath> zzdxb = new WeakHashMap<>();

    public final Future<zzatd> zzv(Context context) {
        return zzayv.zzegi.submit(new zzate(this, context));
    }
}
