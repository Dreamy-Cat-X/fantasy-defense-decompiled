package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbjn implements zzepq<Set<zzbxf<zzbrm>>> {
    private final zzeqd<zzbjf> zzeui;
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<JSONObject> zzfrf;

    private zzbjn(zzeqd<zzbjf> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<JSONObject> zzeqdVar3) {
        this.zzeui = zzeqdVar;
        this.zzeuj = zzeqdVar2;
        this.zzfrf = zzeqdVar3;
    }

    public static zzbjn zzd(zzeqd<zzbjf> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<JSONObject> zzeqdVar3) {
        return new zzbjn(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        Set singleton;
        zzbjf zzbjfVar = this.zzeui.get();
        Executor executor = this.zzeuj.get();
        if (this.zzfrf.get() == null) {
            singleton = Collections.emptySet();
        } else {
            singleton = Collections.singleton(new zzbxf(zzbjfVar, executor));
        }
        return (Set) zzepw.zza(singleton, "Cannot return null from a non-@Nullable @Provides method");
    }
}
