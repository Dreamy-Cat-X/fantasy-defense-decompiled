package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbip implements zzbil {
    private final com.google.android.gms.ads.internal.util.zzf zzdza = com.google.android.gms.ads.internal.zzp.zzku().zzxq();

    @Override // com.google.android.gms.internal.ads.zzbil
    public final void zzm(Map<String, String> map) {
        if (map.isEmpty()) {
            return;
        }
        String str = map.get("gad_idless");
        if (str != null) {
            map.remove("gad_idless");
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcoa)).booleanValue()) {
                this.zzdza.zzaq(Boolean.parseBoolean(str));
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcnz)).booleanValue()) {
            com.google.android.gms.ads.internal.zzp.zzlo().setConsent(bundle);
        }
    }
}
