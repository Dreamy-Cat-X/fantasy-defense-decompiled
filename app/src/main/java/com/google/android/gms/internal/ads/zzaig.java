package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.kt.olleh.inapp.net.ResTags;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaig implements zzahv<Object> {
    private final zzaif zzdhd;

    public static void zza(zzbdh zzbdhVar, zzaif zzaifVar) {
        zzbdhVar.zza("/reward", new zzaig(zzaifVar));
    }

    private zzaig(zzaif zzaifVar) {
        this.zzdhd = zzaifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if ("grant".equals(str)) {
            zzaun zzaunVar = null;
            try {
                int parseInt = Integer.parseInt(map.get(ResTags.AMOUNT));
                String str2 = map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzaunVar = new zzaun(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                com.google.android.gms.ads.internal.util.zzd.zzd("Unable to parse reward amount.", e);
            }
            this.zzdhd.zza(zzaunVar);
            return;
        }
        if ("video_start".equals(str)) {
            this.zzdhd.zzua();
        } else if ("video_complete".equals(str)) {
            this.zzdhd.zzub();
        }
    }
}
