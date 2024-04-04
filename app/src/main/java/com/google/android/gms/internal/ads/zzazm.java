package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzazm extends zzazp implements ViewTreeObserver.OnScrollChangedListener {
    private final WeakReference<ViewTreeObserver.OnScrollChangedListener> zzegz;

    public zzazm(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.zzegz = new WeakReference<>(onScrollChangedListener);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.zzegz.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            detach();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final void zza(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final void zzb(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }
}
