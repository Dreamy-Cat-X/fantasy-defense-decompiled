package com.google.android.gms.internal.ads;

import android.os.Trace;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzpt {
    public static void beginSection(String str) {
        if (zzps.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void endSection() {
        if (zzps.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
