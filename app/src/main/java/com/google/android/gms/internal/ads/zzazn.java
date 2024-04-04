package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzazn extends zzazp implements ViewTreeObserver.OnGlobalLayoutListener {
    private final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> zzegz;

    public zzazn(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.zzegz = new WeakReference<>(onGlobalLayoutListener);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzegz.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            detach();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final void zza(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final void zzb(ViewTreeObserver viewTreeObserver) {
        com.google.android.gms.ads.internal.zzp.zzks();
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
