package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdam implements zzepq<zzdak> {
    private final zzeqd<Set<String>> zzgzf;

    private zzdam(zzeqd<Set<String>> zzeqdVar) {
        this.zzgzf = zzeqdVar;
    }

    public static zzdam zzam(zzeqd<Set<String>> zzeqdVar) {
        return new zzdam(zzeqdVar);
    }

    public static zzdak zzd(Set<String> set) {
        return new zzdak(set);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzd(this.zzgzf.get());
    }
}
