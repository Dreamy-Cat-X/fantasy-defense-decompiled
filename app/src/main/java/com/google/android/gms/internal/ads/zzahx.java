package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzahx implements zzahv<Object> {
    private final Context context;

    public zzahx(Context context) {
        this.context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zza(Object obj, Map<String, String> map) {
        if (com.google.android.gms.ads.internal.zzp.zzlo().zzz(this.context)) {
            String str = map.get("eventName");
            String str2 = map.get("eventId");
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 94399) {
                if (hashCode != 94401) {
                    if (hashCode == 94407 && str.equals("_ai")) {
                        c = 1;
                    }
                } else if (str.equals("_ac")) {
                    c = 0;
                }
            } else if (str.equals("_aa")) {
                c = 2;
            }
            if (c == 0) {
                com.google.android.gms.ads.internal.zzp.zzlo().zzg(this.context, str2);
                return;
            }
            if (c == 1) {
                com.google.android.gms.ads.internal.zzp.zzlo().zzh(this.context, str2);
            } else if (c == 2) {
                com.google.android.gms.ads.internal.zzp.zzlo().zzj(this.context, str2);
            } else {
                com.google.android.gms.ads.internal.util.zzd.zzev("logScionEvent gmsg contained unsupported eventName");
            }
        }
    }
}
