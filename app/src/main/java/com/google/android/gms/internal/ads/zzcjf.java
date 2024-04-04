package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzuc;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcjf implements zzepq<Set<zzbxf<zzdre>>> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<Context> zzeuo;
    private final zzeqd<String> zzgjm;
    private final zzeqd<Map<zzdqz, zzcjg>> zzgjn;

    public zzcjf(zzeqd<String> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<Executor> zzeqdVar3, zzeqd<Map<zzdqz, zzcjg>> zzeqdVar4) {
        this.zzgjm = zzeqdVar;
        this.zzeuo = zzeqdVar2;
        this.zzeuj = zzeqdVar3;
        this.zzgjn = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        Set emptySet;
        final String str = this.zzgjm.get();
        Context context = this.zzeuo.get();
        Executor executor = this.zzeuj.get();
        Map<zzdqz, zzcjg> map = this.zzgjn.get();
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcuj)).booleanValue()) {
            zztu zztuVar = new zztu(new zztz(context));
            zztuVar.zza(new zztt(str) { // from class: com.google.android.gms.internal.ads.zzcjh
                private final String zzdjy;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdjy = str;
                }

                @Override // com.google.android.gms.internal.ads.zztt
                public final void zza(zzuc.zzi.zza zzaVar) {
                    zzaVar.zzbx(this.zzdjy);
                }
            });
            emptySet = Collections.singleton(new zzbxf(new zzcje(zztuVar, map), executor));
        } else {
            emptySet = Collections.emptySet();
        }
        return (Set) zzepw.zza(emptySet, "Cannot return null from a non-@Nullable @Provides method");
    }
}
