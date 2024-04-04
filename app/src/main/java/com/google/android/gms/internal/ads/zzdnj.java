package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdnj {
    private final zzcpy zzdgy;
    private final zzdmi zzeqz;
    private final zzdmj zzera;
    private final zzdsh zzfpv;

    public zzdnj(zzcpy zzcpyVar, zzdsh zzdshVar, zzdmi zzdmiVar, zzdmj zzdmjVar) {
        this.zzeqz = zzdmiVar;
        this.zzera = zzdmjVar;
        this.zzdgy = zzcpyVar;
        this.zzfpv = zzdshVar;
    }

    public final void zzj(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            zzb(it.next(), zzcpz.zzgqc);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Ljava/lang/String;>;Ljava/lang/Integer;)V */
    public final void zza(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), i);
        }
    }

    private final void zzb(String str, int i) {
        if (!this.zzeqz.zzhim) {
            this.zzfpv.zzel(str);
        } else {
            this.zzdgy.zza(new zzcqj(com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis(), this.zzera.zzbvf, str, i));
        }
    }
}
