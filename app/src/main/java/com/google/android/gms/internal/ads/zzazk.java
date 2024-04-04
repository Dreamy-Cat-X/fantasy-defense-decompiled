package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzazk {
    public static void zza(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        new zzazn(view, onGlobalLayoutListener).attach();
    }

    public static void zza(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        new zzazm(view, onScrollChangedListener).attach();
    }
}
