package com.google.android.gms.ads.internal.util;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzx extends zzy {
    @Override // com.google.android.gms.ads.internal.util.zzy, com.google.android.gms.ads.internal.util.zzu
    public final boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }

    @Override // com.google.android.gms.ads.internal.util.zzu
    public final ViewGroup.LayoutParams zzzb() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
