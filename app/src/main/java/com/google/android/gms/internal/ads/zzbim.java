package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbim implements zzbil {
    private com.google.android.gms.ads.internal.util.zzf zzebk;

    public zzbim(com.google.android.gms.ads.internal.util.zzf zzfVar) {
        this.zzebk = zzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbil
    public final void zzm(Map<String, String> map) {
        this.zzebk.zzap(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}
