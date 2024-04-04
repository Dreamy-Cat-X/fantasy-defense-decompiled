package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.kt.olleh.inapp.net.InAppError;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdrp {
    private final HashMap<String, String> zzhpu = new HashMap<>();
    private final zzdrs zzhpv = new zzdrs(com.google.android.gms.ads.internal.zzp.zzkx());

    private zzdrp() {
    }

    public static zzdrp zzgz(String str) {
        zzdrp zzdrpVar = new zzdrp();
        zzdrpVar.zzhpu.put("action", str);
        return zzdrpVar;
    }

    public static zzdrp zzha(String str) {
        zzdrp zzdrpVar = new zzdrp();
        zzdrpVar.zzu("request_id", str);
        return zzdrpVar;
    }

    public final zzdrp zzu(String str, String str2) {
        this.zzhpu.put(str, str2);
        return this;
    }

    public final zzdrp zzhb(String str) {
        this.zzhpv.zzhc(str);
        return this;
    }

    public final zzdrp zzv(String str, String str2) {
        this.zzhpv.zzw(str, str2);
        return this;
    }

    public final zzdrp zzr(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zzhpu.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zzhpu.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final zzdrp zza(zzdmt zzdmtVar, zzayc zzaycVar) {
        if (zzdmtVar.zzhiz == null) {
            return this;
        }
        zzdmr zzdmrVar = zzdmtVar.zzhiz;
        if (zzdmrVar.zzera != null) {
            zzb(zzdmrVar.zzera);
        }
        if (!zzdmrVar.zzhiw.isEmpty()) {
            switch (zzdmrVar.zzhiw.get(0).zzhhl) {
                case 1:
                    this.zzhpu.put("ad_format", "banner");
                    break;
                case 2:
                    this.zzhpu.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.zzhpu.put("ad_format", "native_express");
                    break;
                case 4:
                    this.zzhpu.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.zzhpu.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.zzhpu.put("ad_format", "app_open_ad");
                    if (zzaycVar != null) {
                        this.zzhpu.put("as", zzaycVar.zzyd() ? InAppError.FAILED : InAppError.SUCCESS);
                        break;
                    }
                    break;
                default:
                    this.zzhpu.put("ad_format", EnvironmentCompat.MEDIA_UNKNOWN);
                    break;
            }
        }
        return this;
    }

    public final zzdrp zzb(zzdmj zzdmjVar) {
        if (!TextUtils.isEmpty(zzdmjVar.zzbvf)) {
            this.zzhpu.put("gqi", zzdmjVar.zzbvf);
        }
        return this;
    }

    public final zzdrp zzf(zzdmi zzdmiVar) {
        this.zzhpu.put("aai", zzdmiVar.zzdkl);
        return this;
    }

    public final Map<String, String> zzlr() {
        HashMap hashMap = new HashMap(this.zzhpu);
        for (zzdrv zzdrvVar : this.zzhpv.zzaxo()) {
            hashMap.put(zzdrvVar.label, zzdrvVar.value);
        }
        return hashMap;
    }
}
