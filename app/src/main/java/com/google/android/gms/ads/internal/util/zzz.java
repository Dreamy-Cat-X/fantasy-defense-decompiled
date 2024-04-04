package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzwo;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzz extends zzaa {
    @Override // com.google.android.gms.ads.internal.util.zzu
    public final boolean zza(Activity activity, Configuration configuration) {
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcuf)).booleanValue()) {
            return false;
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcuh)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        zzwo.zzqm();
        int zze = zzayd.zze(activity, configuration.screenHeightDp);
        int zze2 = zzayd.zze(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzp.zzkq();
        DisplayMetrics zza = zzm.zza(windowManager);
        int i = zza.heightPixels;
        int i2 = zza.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        double d = activity.getResources().getDisplayMetrics().density;
        Double.isNaN(d);
        int round = ((int) Math.round(d + 0.5d)) * ((Integer) zzwo.zzqq().zzd(zzabh.zzcue)).intValue();
        return !(zze(i, zze + dimensionPixelSize, round) && zze(i2, zze2, round));
    }

    private static boolean zze(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }
}
