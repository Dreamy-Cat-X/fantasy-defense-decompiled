package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.kt.olleh.inapp.net.InAppError;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public final class zzcjs {
    private final zzayc zzeaa;
    private ConcurrentHashMap<String, String> zzgjy;

    public zzcjs(zzckd zzckdVar, zzayc zzaycVar) {
        this.zzgjy = new ConcurrentHashMap<>(zzckdVar.zzgka);
        this.zzeaa = zzaycVar;
    }

    public final void zzc(zzdmt zzdmtVar) {
        if (zzdmtVar.zzhiz.zzhiw.size() > 0) {
            switch (zzdmtVar.zzhiz.zzhiw.get(0).zzhhl) {
                case 1:
                    this.zzgjy.put("ad_format", "banner");
                    break;
                case 2:
                    this.zzgjy.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.zzgjy.put("ad_format", "native_express");
                    break;
                case 4:
                    this.zzgjy.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.zzgjy.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.zzgjy.put("ad_format", "app_open_ad");
                    this.zzgjy.put("as", this.zzeaa.zzyd() ? InAppError.FAILED : InAppError.SUCCESS);
                    break;
                default:
                    this.zzgjy.put("ad_format", EnvironmentCompat.MEDIA_UNKNOWN);
                    break;
            }
        }
        if (TextUtils.isEmpty(zzdmtVar.zzhiz.zzera.zzbvf)) {
            return;
        }
        this.zzgjy.put("gqi", zzdmtVar.zzhiz.zzera.zzbvf);
    }

    public final void zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zzgjy.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zzgjy.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map<String, String> zzsq() {
        return this.zzgjy;
    }
}
