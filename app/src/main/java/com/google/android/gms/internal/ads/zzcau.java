package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcau implements zzepq<zzbjo> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<Context> zzeuo;
    private final zzeqd<Clock> zzfra;
    private final zzeqd<zzqs> zzgbl;

    public zzcau(zzeqd<zzqs> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<Context> zzeqdVar3, zzeqd<Clock> zzeqdVar4) {
        this.zzgbl = zzeqdVar;
        this.zzeuj = zzeqdVar2;
        this.zzeuo = zzeqdVar3;
        this.zzfra = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        zzqs zzqsVar = this.zzgbl.get();
        Executor executor = this.zzeuj.get();
        Context context = this.zzeuo.get();
        return (zzbjo) zzepw.zza(new zzbjo(executor, new zzbjd(context, zzqsVar), this.zzfra.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
