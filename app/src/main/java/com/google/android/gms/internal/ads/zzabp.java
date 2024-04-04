package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public final class zzabp {
    public static boolean zza(zzaby zzabyVar, zzabw zzabwVar, String... strArr) {
        if (zzabyVar == null || zzabwVar == null || !zzabyVar.zzdai || zzabwVar == null) {
            return false;
        }
        return zzabyVar.zza(zzabwVar, com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime(), strArr);
    }

    public static zzabw zzb(zzaby zzabyVar) {
        if (zzabyVar == null) {
            return null;
        }
        return zzabyVar.zzex(com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime());
    }
}
