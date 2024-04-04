package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzmg;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzkd {
    private static final zzmk zzaov = new zzkc();
    private static final Pattern zzaow = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zzaho = -1;
    public int zzahp = -1;

    public final boolean zzb(zzmg zzmgVar) {
        for (int i = 0; i < zzmgVar.length(); i++) {
            zzmg.zza zzay = zzmgVar.zzay(i);
            if (zzay instanceof zzmi) {
                zzmi zzmiVar = (zzmi) zzay;
                if (zzb(zzmiVar.description, zzmiVar.text)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean zzb(String str, String str2) {
        if (!"iTunSMPB".equals(str)) {
            return false;
        }
        Matcher matcher = zzaow.matcher(str2);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.zzaho = parseInt;
                    this.zzahp = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public final boolean zzgt() {
        return (this.zzaho == -1 || this.zzahp == -1) ? false : true;
    }
}
