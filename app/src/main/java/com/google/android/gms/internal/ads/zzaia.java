package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaia implements zzahv<zzbdh> {
    private static final Map<String, Integer> zzdha = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zza zzdgt;
    private final zzapv zzdgx;
    private final zzaqi zzdgz;

    public zzaia(com.google.android.gms.ads.internal.zza zzaVar, zzapv zzapvVar, zzaqi zzaqiVar) {
        this.zzdgt = zzaVar;
        this.zzdgx = zzapvVar;
        this.zzdgz = zzaqiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final /* synthetic */ void zza(zzbdh zzbdhVar, Map map) {
        com.google.android.gms.ads.internal.zza zzaVar;
        zzbdh zzbdhVar2 = zzbdhVar;
        int intValue = zzdha.get((String) map.get("a")).intValue();
        if (intValue != 5 && intValue != 7 && (zzaVar = this.zzdgt) != null && !zzaVar.zzjy()) {
            this.zzdgt.zzbk(null);
            return;
        }
        if (intValue == 1) {
            this.zzdgx.zzg(map);
            return;
        }
        if (intValue == 3) {
            new zzaqa(zzbdhVar2, map).execute();
            return;
        }
        if (intValue == 4) {
            new zzapu(zzbdhVar2, map).execute();
            return;
        }
        if (intValue == 5) {
            new zzapx(zzbdhVar2, map).execute();
            return;
        }
        if (intValue == 6) {
            this.zzdgx.zzac(true);
        } else if (intValue == 7) {
            this.zzdgz.zzvr();
        } else {
            com.google.android.gms.ads.internal.util.zzd.zzew("Unknown MRAID command called.");
        }
    }
}
