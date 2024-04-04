package com.google.android.gms.ads.internal.util;

import android.R;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbdh;
import com.google.android.gms.internal.ads.zzbek;
import com.google.android.gms.internal.ads.zztu;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzaa extends zzx {
    @Override // com.google.android.gms.ads.internal.util.zzu
    public final int zzzd() {
        return R.style.Theme.Material.Dialog.Alert;
    }

    @Override // com.google.android.gms.ads.internal.util.zzu
    public final CookieManager zzbg(Context context) {
        if (zzzc()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzd.zzc("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzp.zzku().zza(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzu
    public final zzbdg zza(zzbdh zzbdhVar, zztu zztuVar, boolean z) {
        return new zzbek(zzbdhVar, zztuVar, z);
    }

    @Override // com.google.android.gms.ads.internal.util.zzu
    public final WebResourceResponse zza(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }
}
