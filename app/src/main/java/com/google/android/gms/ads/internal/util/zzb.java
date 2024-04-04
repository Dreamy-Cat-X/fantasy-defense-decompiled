package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayy;
import com.google.android.gms.internal.ads.zzdzl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzb {
    public static void zzak(Context context) {
        if (zzayg.zzbt(context) && !zzayg.zzzy()) {
            zzdzl<?> zzyc = new zze(context).zzyc();
            zzd.zzew("Updating ad debug logging enablement.");
            zzayy.zza(zzyc, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
