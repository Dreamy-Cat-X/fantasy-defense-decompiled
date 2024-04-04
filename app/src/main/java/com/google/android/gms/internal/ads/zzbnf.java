package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbnf {
    public final List<? extends zzdzl<? extends zzbmz>> zzfus;

    public zzbnf(List<? extends zzdzl<? extends zzbmz>> list) {
        this.zzfus = list;
    }

    public zzbnf(zzbmz zzbmzVar) {
        this.zzfus = Collections.singletonList(zzdyz.zzag(zzbmzVar));
    }

    public static zzcqq<zzbnf> zza(zzctf<? extends zzbmz> zzctfVar) {
        return new zzcqt(zzctfVar, zzbne.zzdyn);
    }

    public static zzcqq<zzbnf> zza(zzcqq<? extends zzbmz> zzcqqVar) {
        return new zzcqt(zzcqqVar, zzbnh.zzdyn);
    }
}
