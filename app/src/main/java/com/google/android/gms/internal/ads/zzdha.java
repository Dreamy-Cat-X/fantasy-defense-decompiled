package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdha implements zzepq<zzdet<JSONObject>> {
    public static zzdet<JSONObject> zza(zzaxk zzaxkVar, Object obj, zzdfo zzdfoVar, zzdgl zzdglVar, zzepk<zzdfi> zzepkVar, zzepk<zzdfs> zzepkVar2, zzepk<zzdfw> zzepkVar3, zzepk<zzdgc> zzepkVar4, zzepk<zzdgh> zzepkVar5, zzepk<zzdgq> zzepkVar6, zzepk<zzdhc> zzepkVar7, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzdgd) obj);
        hashSet.add(zzdfoVar);
        hashSet.add(zzdglVar);
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcwa)).booleanValue()) {
            hashSet.add(zzepkVar.get());
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcwb)).booleanValue()) {
            hashSet.add(zzepkVar2.get());
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcwc)).booleanValue()) {
            hashSet.add(zzepkVar3.get());
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcwd)).booleanValue()) {
            hashSet.add(zzepkVar4.get());
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcwi)).booleanValue()) {
            hashSet.add(zzepkVar6.get());
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcwj)).booleanValue()) {
            hashSet.add(zzepkVar7.get());
        }
        return (zzdet) zzepw.zza(new zzdet(executor, hashSet), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        throw new NoSuchMethodError();
    }
}
