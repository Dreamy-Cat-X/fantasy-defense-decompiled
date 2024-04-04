package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzclw implements zzepq<List<String>> {
    public static zzclw zzark() {
        zzclw zzclwVar;
        zzclwVar = zzclz.zzgmj;
        return zzclwVar;
    }

    public static List<String> zzarl() {
        return (List) zzepw.zza(zzabh.zzsb(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzarl();
    }
}
