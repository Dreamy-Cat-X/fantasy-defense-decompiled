package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbzt implements zzbna<zzbnf> {
    private final zzcbt zzfsx;
    private final Map<String, zzcqq<zzbnf>> zzfur;
    private final zzeqd<zzbna<zzblb>> zzgab;
    private final Map<String, zzcqq<zzcaz>> zzgac;
    private final Map<String, zzctf<zzcaz>> zzgad;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzt(Map<String, zzcqq<zzbnf>> map, Map<String, zzcqq<zzcaz>> map2, Map<String, zzctf<zzcaz>> map3, zzeqd<zzbna<zzblb>> zzeqdVar, zzcbt zzcbtVar) {
        this.zzfur = map;
        this.zzgac = map2;
        this.zzgad = map3;
        this.zzgab = zzeqdVar;
        this.zzfsx = zzcbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final zzcqq<zzbnf> zze(int i, String str) {
        zzcqq<zzblb> zze;
        zzcqq<zzbnf> zzcqqVar = this.zzfur.get(str);
        if (zzcqqVar != null) {
            return zzcqqVar;
        }
        if (i == 1) {
            if (this.zzfsx.zzaok() == null || (zze = this.zzgab.get().zze(i, str)) == null) {
                return null;
            }
            return zzbnf.zza(zze);
        }
        if (i != 4) {
            return null;
        }
        zzctf<zzcaz> zzctfVar = this.zzgad.get(str);
        if (zzctfVar != null) {
            return zzbnf.zza((zzctf<? extends zzbmz>) zzctfVar);
        }
        zzcqq<zzcaz> zzcqqVar2 = this.zzgac.get(str);
        if (zzcqqVar2 != null) {
            return zzbnf.zza(zzcqqVar2);
        }
        return null;
    }
}
