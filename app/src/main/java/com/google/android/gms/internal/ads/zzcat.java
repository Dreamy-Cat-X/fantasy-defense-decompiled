package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcat implements zzepq<zzbxe> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdmi> zzfue;

    public zzcat(zzeqd<Context> zzeqdVar, zzeqd<zzdmi> zzeqdVar2) {
        this.zzeuo = zzeqdVar;
        this.zzfue = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxe) zzepw.zza(new zzbxe(this.zzeuo.get(), new HashSet(), this.zzfue.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
