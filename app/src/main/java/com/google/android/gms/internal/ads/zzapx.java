package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzapx {
    private final zzbdh zzdhu;
    private final boolean zzdom;
    private final String zzdon;

    public zzapx(zzbdh zzbdhVar, Map<String, String> map) {
        this.zzdhu = zzbdhVar;
        this.zzdon = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.zzdom = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.zzdom = true;
        }
    }

    public final void execute() {
        int zzza;
        if (this.zzdhu == null) {
            com.google.android.gms.ads.internal.util.zzd.zzex("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.zzdon)) {
            zzza = 7;
        } else if ("landscape".equalsIgnoreCase(this.zzdon)) {
            zzza = 6;
        } else {
            zzza = this.zzdom ? -1 : com.google.android.gms.ads.internal.zzp.zzks().zzza();
        }
        this.zzdhu.setRequestedOrientation(zzza);
    }
}
