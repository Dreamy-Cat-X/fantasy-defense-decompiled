package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.zzum;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzac extends zzz {
    @Override // com.google.android.gms.ads.internal.util.zzu
    public final zzum zza(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzp.zzkq();
        if (zzm.zzp(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return telephonyManager.isDataEnabled() ? zzum.ENUM_TRUE : zzum.ENUM_FALSE;
        }
        return zzum.ENUM_FALSE;
    }
}
