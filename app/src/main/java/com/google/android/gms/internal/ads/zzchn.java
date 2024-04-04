package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.common.util.PlatformVersion;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzchn {
    private Context context;
    private PopupWindow zzgio;

    public final void zzc(Context context, View view) {
        if (!PlatformVersion.isAtLeastKitKat() || PlatformVersion.isAtLeastLollipop()) {
            return;
        }
        PopupWindow zzd = zzd(context, view);
        this.zzgio = zzd;
        if (zzd == null) {
            context = null;
        }
        this.context = context;
    }

    public final void zzapu() {
        Context context = this.context;
        if (context == null || this.zzgio == null) {
            return;
        }
        if ((context instanceof Activity) && ((Activity) context).isDestroyed()) {
            this.context = null;
            this.zzgio = null;
        } else {
            if (this.zzgio.isShowing()) {
                this.zzgio.dismiss();
            }
            this.context = null;
            this.zzgio = null;
        }
    }

    private static PopupWindow zzd(Context context, View view) {
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(view, -1, -1);
        PopupWindow popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setClippingEnabled(false);
        com.google.android.gms.ads.internal.util.zzd.zzdy("Displaying the 1x1 popup off the screen.");
        try {
            popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            return popupWindow;
        } catch (Exception unused) {
            return null;
        }
    }
}
