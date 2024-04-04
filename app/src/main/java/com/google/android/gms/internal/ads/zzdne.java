package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdne {
    public static <T extends zzbcw & zzajx & zzbec & zzbej & zzbeo & zzber & zzbeq> zzahv<T> zza(final zzcpy zzcpyVar, final zzdsh zzdshVar) {
        return new zzahv(zzdshVar, zzcpyVar) { // from class: com.google.android.gms.internal.ads.zzdnh
            private final zzdsh zzhjs;
            private final zzcpy zzhjt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhjs = zzdshVar;
                this.zzhjt = zzcpyVar;
            }

            /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.zzbcw, com.google.android.gms.internal.ads.zzbej] */
            @Override // com.google.android.gms.internal.ads.zzahv
            public final void zza(Object obj, Map map) {
                int i;
                zzdsh zzdshVar2 = this.zzhjs;
                zzcpy zzcpyVar2 = this.zzhjt;
                ?? r9 = (zzbcw) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    com.google.android.gms.ads.internal.util.zzd.zzex("URL missing from click GMSG.");
                    return;
                }
                String zza = zzahg.zza(r9, str);
                if (!r9.zzacn().zzhim) {
                    zzdshVar2.zzel(zza);
                    return;
                }
                long currentTimeMillis = com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis();
                String str2 = ((zzbec) r9).zzady().zzbvf;
                com.google.android.gms.ads.internal.zzp.zzkq();
                if (com.google.android.gms.ads.internal.util.zzm.zzbb(((zzbej) r9).getContext())) {
                    i = zzcpz.zzgqc;
                } else {
                    i = zzcpz.zzgqb;
                }
                zzcpyVar2.zza(new zzcqj(currentTimeMillis, str2, zza, i));
            }
        };
    }

    public static <T extends zzbcw & zzbec & zzbej & zzber> zzahv<T> zzb(final zzcpy zzcpyVar, final zzdsh zzdshVar) {
        return new zzahv(zzdshVar, zzcpyVar) { // from class: com.google.android.gms.internal.ads.zzdng
            private final zzdsh zzhjs;
            private final zzcpy zzhjt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhjs = zzdshVar;
                this.zzhjt = zzcpyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzahv
            public final void zza(Object obj, Map map) {
                zzdsh zzdshVar2 = this.zzhjs;
                zzcpy zzcpyVar2 = this.zzhjt;
                zzbcw zzbcwVar = (zzbcw) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    com.google.android.gms.ads.internal.util.zzd.zzex("URL missing from httpTrack GMSG.");
                } else if (!zzbcwVar.zzacn().zzhim) {
                    zzdshVar2.zzel(str);
                } else {
                    zzcpyVar2.zza(new zzcqj(com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis(), ((zzbec) zzbcwVar).zzady().zzbvf, str, zzcpz.zzgqc));
                }
            }
        };
    }
}
