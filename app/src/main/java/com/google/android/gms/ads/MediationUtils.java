package com.google.android.gms.ads;

import android.content.Context;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class MediationUtils {
    protected static final double MIN_HEIGHT_RATIO = 0.7d;
    protected static final double MIN_WIDTH_RATIO = 0.5d;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (r12.zzdv() < r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r4 >= r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AdSize findClosestSize(Context context, AdSize adSize, List<AdSize> list) {
        AdSize adSize2 = null;
        if (list != null && adSize != null) {
            if (!adSize.zzdu()) {
                float f = context.getResources().getDisplayMetrics().density;
                adSize = new AdSize(Math.round(adSize.getWidthInPixels(context) / f), Math.round(adSize.getHeightInPixels(context) / f));
            }
            for (AdSize adSize3 : list) {
                boolean z = false;
                if (adSize3 != null) {
                    int width = adSize.getWidth();
                    int width2 = adSize3.getWidth();
                    int height = adSize.getHeight();
                    int height2 = adSize3.getHeight();
                    double d = width;
                    Double.isNaN(d);
                    if (d * MIN_WIDTH_RATIO <= width2 && width >= width2) {
                        if (!adSize.zzdu()) {
                            double d2 = height;
                            Double.isNaN(d2);
                            if (d2 * MIN_HEIGHT_RATIO <= height2) {
                            }
                        }
                    }
                }
                if (z && (adSize2 == null || adSize2.getWidth() * adSize2.getHeight() <= adSize3.getWidth() * adSize3.getHeight())) {
                    adSize2 = adSize3;
                }
            }
        }
        return adSize2;
    }
}
