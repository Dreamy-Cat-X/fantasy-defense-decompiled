package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbii implements zzdyj<zzdmt, zzdmt> {
    private Map<String, zzbil> zzfpg;

    public zzbii(Map<String, zzbil> map) {
        this.zzfpg = map;
    }

    @Override // com.google.android.gms.internal.ads.zzdyj
    public final /* synthetic */ zzdzl<zzdmt> zzf(zzdmt zzdmtVar) throws Exception {
        zzdmt zzdmtVar2 = zzdmtVar;
        for (zzdmu zzdmuVar : zzdmtVar2.zzhiz.zzhix) {
            if (this.zzfpg.containsKey(zzdmuVar.name)) {
                this.zzfpg.get(zzdmuVar.name).zzm(zzdmuVar.zzhja);
            }
        }
        return zzdyz.zzag(zzdmtVar2);
    }
}
