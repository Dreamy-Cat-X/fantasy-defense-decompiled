package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzabt extends zzabs {
    @Override // com.google.android.gms.internal.ads.zzabs
    public final String zzf(String str, String str2) {
        String zzcs = zzcs(str);
        String zzcs2 = zzcs(str2);
        if (TextUtils.isEmpty(zzcs)) {
            return zzcs2;
        }
        if (TextUtils.isEmpty(zzcs2)) {
            return zzcs;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(zzcs).length() + 1 + String.valueOf(zzcs2).length());
        sb.append(zzcs);
        sb.append(",");
        sb.append(zzcs2);
        return sb.toString();
    }

    private static String zzcs(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        int length = str.length();
        while (i < str.length() && str.charAt(i) == ',') {
            i++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        if (length < i) {
            return null;
        }
        return (i == 0 && length == str.length()) ? str : str.substring(i, length);
    }
}
