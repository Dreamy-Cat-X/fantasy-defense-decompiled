package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdod {
    private final Context zzaaf;
    private final zzayt zzbos;
    private final zzaxs zzbpt;
    private final Map<String, zzdof> zzhkt = new HashMap();

    public zzdod(Context context, zzayt zzaytVar, zzaxs zzaxsVar) {
        this.zzaaf = context;
        this.zzbos = zzaytVar;
        this.zzbpt = zzaxsVar;
    }

    public final zzdof zzgu(String str) {
        if (str == null) {
            return zzavq();
        }
        if (this.zzhkt.containsKey(str)) {
            return this.zzhkt.get(str);
        }
        zzdof zzgv = zzgv(str);
        this.zzhkt.put(str, zzgv);
        return zzgv;
    }

    private final zzdof zzavq() {
        return new zzdof(this.zzaaf, this.zzbpt.zzxq(), this.zzbpt.zzxs());
    }

    private final zzdof zzgv(String str) {
        zzatp zzx = zzatp.zzx(this.zzaaf);
        try {
            zzx.setAppPackageName(str);
            com.google.android.gms.ads.internal.util.zzi zziVar = new com.google.android.gms.ads.internal.util.zzi();
            zziVar.zza(this.zzaaf, str, false);
            com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj(this.zzbpt.zzxq(), zziVar);
            return new zzdof(zzx, zzjVar, new zzayc(zzayd.zzzw(), zzjVar));
        } catch (PackageManager.NameNotFoundException unused) {
            return zzavq();
        }
    }
}
