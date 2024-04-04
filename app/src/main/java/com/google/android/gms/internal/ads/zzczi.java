package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzuc;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzczi {
    private String zzgyg;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static class zza {
        private String zzgyg;

        public final zza zzgr(String str) {
            this.zzgyg = str;
            return this;
        }
    }

    private zzczi(zza zzaVar) {
        this.zzgyg = zzaVar.zzgyg;
    }

    public final Set<String> zzasx() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zzgyg.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzasy() {
        return this.zzgyg.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zzuc.zza.EnumC0024zza zzasz() {
        char c;
        String str = this.zzgyg;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return zzuc.zza.EnumC0024zza.BANNER;
        }
        if (c == 1) {
            return zzuc.zza.EnumC0024zza.INTERSTITIAL;
        }
        if (c == 2) {
            return zzuc.zza.EnumC0024zza.AD_LOADER;
        }
        if (c == 3) {
            return zzuc.zza.EnumC0024zza.REWARD_BASED_VIDEO_AD;
        }
        return zzuc.zza.EnumC0024zza.AD_INITIATER_UNSPECIFIED;
    }
}
