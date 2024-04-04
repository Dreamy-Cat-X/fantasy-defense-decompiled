package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzwo;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzab extends zzac {
    @Override // com.google.android.gms.ads.internal.util.zzu
    public final void zzi(final Activity activity) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcpc)).booleanValue() && com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzyr() == null && !activity.isInMultiWindowMode()) {
            zza(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this, activity) { // from class: com.google.android.gms.ads.internal.util.zzae
                private final zzab zzedd;
                private final Activity zzede;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzedd = this;
                    this.zzede = activity;
                }

                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return zzab.zza(this.zzede, view, windowInsets);
                }
            });
        }
    }

    private static void zza(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = z ? 1 : 2;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ WindowInsets zza(Activity activity, View view, WindowInsets windowInsets) {
        if (com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzyr() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                zzf zzxq = com.google.android.gms.ads.internal.zzp.zzku().zzxq();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(str)) {
                        str = String.valueOf(str).concat("|");
                    }
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(format);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                zzxq.zzef(str);
            } else {
                com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzef("");
            }
        }
        zza(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }
}
