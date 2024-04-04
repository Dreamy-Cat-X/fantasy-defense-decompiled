package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzabj {
    public static boolean zzcp(String str) {
        return zze((String) zzwo.zzqq().zzd(zzabh.zzcvg), str);
    }

    private static boolean zze(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzp.zzku().zza(e, "NonagonUtil.isPatternMatched");
            }
        }
        return false;
    }
}
