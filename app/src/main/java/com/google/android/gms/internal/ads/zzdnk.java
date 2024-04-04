package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdnk {
    private final Pattern zzhju;

    public zzdnk() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) zzwo.zzqq().zzd(zzabh.zzcye));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.zzhju = pattern;
    }

    public final String zzgt(String str) {
        Pattern pattern = this.zzhju;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
