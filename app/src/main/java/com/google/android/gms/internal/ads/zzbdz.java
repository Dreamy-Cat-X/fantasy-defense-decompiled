package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbdz implements zzahv<zzbdh> {
    private final /* synthetic */ zzbdx zzesd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdz(zzbdx zzbdxVar) {
        this.zzesd = zzbdxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final /* synthetic */ void zza(zzbdh zzbdhVar, Map map) {
        int i;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zzesd) {
                    i = this.zzesd.zzeru;
                    if (i != parseInt) {
                        this.zzesd.zzeru = parseInt;
                        this.zzesd.requestLayout();
                    }
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zzd.zzd("Exception occurred while getting webview content height", e);
            }
        }
    }
}
