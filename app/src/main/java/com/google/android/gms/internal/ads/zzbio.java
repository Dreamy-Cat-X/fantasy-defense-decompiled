package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbio implements zzbil {
    private final zzdmg zzfph;

    public zzbio(zzdmg zzdmgVar) {
        this.zzfph = zzdmgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbil
    public final void zzm(Map<String, String> map) {
        String str = map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zzfph.zzbk(Boolean.parseBoolean(str));
        } catch (Exception unused) {
            throw new IllegalStateException("Invalid render_in_browser state");
        }
    }
}
