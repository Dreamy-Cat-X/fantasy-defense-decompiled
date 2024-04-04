package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdpf {
    private HashMap<zzdox, zzdpe<? extends zzbmz>> zzhmx = new HashMap<>();

    public final <AdT extends zzbmz> zzdpe<AdT> zza(zzdox zzdoxVar, Context context, zzdok zzdokVar, zzdpm<AdT> zzdpmVar) {
        zzdpe<AdT> zzdpeVar = (zzdpe) this.zzhmx.get(zzdoxVar);
        if (zzdpeVar != null) {
            return zzdpeVar;
        }
        zzdoq zzdoqVar = new zzdoq(zzdou.zza(zzdoxVar, context));
        zzdpe<AdT> zzdpeVar2 = new zzdpe<>(zzdoqVar, new zzdpj(zzdoqVar, zzdokVar, zzdpmVar));
        this.zzhmx.put(zzdoxVar, zzdpeVar2);
        return zzdpeVar2;
    }
}
