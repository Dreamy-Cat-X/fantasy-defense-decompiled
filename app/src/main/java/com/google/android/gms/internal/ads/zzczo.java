package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzczo implements zzepq<Set<String>> {
    private final zzczi zzgyi;

    public zzczo(zzczi zzcziVar) {
        this.zzgyi = zzcziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(this.zzgyi.zzasx(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
