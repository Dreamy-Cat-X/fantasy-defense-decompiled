package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdcl implements zzepq<zzdcj> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdzk> zzgys;
    private final zzeqd<Set<String>> zzgzf;
    private final zzeqd<ViewGroup> zzhak;

    private zzdcl(zzeqd<zzdzk> zzeqdVar, zzeqd<ViewGroup> zzeqdVar2, zzeqd<Context> zzeqdVar3, zzeqd<Set<String>> zzeqdVar4) {
        this.zzgys = zzeqdVar;
        this.zzhak = zzeqdVar2;
        this.zzeuo = zzeqdVar3;
        this.zzgzf = zzeqdVar4;
    }

    public static zzdcl zzj(zzeqd<zzdzk> zzeqdVar, zzeqd<ViewGroup> zzeqdVar2, zzeqd<Context> zzeqdVar3, zzeqd<Set<String>> zzeqdVar4) {
        return new zzdcl(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdcj(this.zzgys.get(), this.zzhak.get(), this.zzeuo.get(), this.zzgzf.get());
    }
}
