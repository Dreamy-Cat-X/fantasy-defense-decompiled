package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzddg implements zzepq<zzdde> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdzk> zzgys;
    private final zzeqd<Set<String>> zzgzf;

    private zzddg(zzeqd<zzdzk> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<Set<String>> zzeqdVar3) {
        this.zzgys = zzeqdVar;
        this.zzeuo = zzeqdVar2;
        this.zzgzf = zzeqdVar3;
    }

    public static zzddg zzab(zzeqd<zzdzk> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<Set<String>> zzeqdVar3) {
        return new zzddg(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdde(this.zzgys.get(), this.zzeuo.get(), this.zzgzf.get());
    }
}
