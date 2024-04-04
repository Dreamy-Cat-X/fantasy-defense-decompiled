package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzarv {

    @Nonnull
    private View zzaaq;
    private final Map<String, WeakReference<View>> zzdrt = new HashMap();

    public final zzarv zzk(View view) {
        this.zzaaq = view;
        return this;
    }

    public final zzarv zzh(Map<String, View> map) {
        this.zzdrt.clear();
        for (Map.Entry<String, View> entry : map.entrySet()) {
            View value = entry.getValue();
            if (value != null) {
                this.zzdrt.put(entry.getKey(), new WeakReference<>(value));
            }
        }
        return this;
    }
}
