package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.zzazk;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbz {
    private final View view;
    private boolean zzbrl;
    private boolean zzbvu;
    private Activity zzefi;
    private boolean zzefj;
    private ViewTreeObserver.OnGlobalLayoutListener zzefk;
    private ViewTreeObserver.OnScrollChangedListener zzefl = null;

    public zzbz(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.zzefi = activity;
        this.view = view;
        this.zzefk = onGlobalLayoutListener;
    }

    public final void zzj(Activity activity) {
        this.zzefi = activity;
    }

    public final void zzzq() {
        this.zzbvu = true;
        if (this.zzbrl) {
            zzzs();
        }
    }

    public final void zzzr() {
        this.zzbvu = false;
        zzzt();
    }

    public final void onAttachedToWindow() {
        this.zzbrl = true;
        if (this.zzbvu) {
            zzzs();
        }
    }

    public final void onDetachedFromWindow() {
        this.zzbrl = false;
        zzzt();
    }

    private final void zzzs() {
        ViewTreeObserver zzk;
        if (this.zzefj) {
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzefk;
        if (onGlobalLayoutListener != null) {
            Activity activity = this.zzefi;
            if (activity != null && (zzk = zzk(activity)) != null) {
                zzk.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            com.google.android.gms.ads.internal.zzp.zzln();
            zzazk.zza(this.view, this.zzefk);
        }
        this.zzefj = true;
    }

    private final void zzzt() {
        ViewTreeObserver zzk;
        Activity activity = this.zzefi;
        if (activity != null && this.zzefj) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzefk;
            if (onGlobalLayoutListener != null && (zzk = zzk(activity)) != null) {
                com.google.android.gms.ads.internal.zzp.zzks();
                zzk.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.zzefj = false;
        }
    }

    private static ViewTreeObserver zzk(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }
}
