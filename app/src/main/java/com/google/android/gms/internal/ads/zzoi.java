package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzoi {
    public final zznt zzbhu;
    public final zzoh zzbhv;
    public final Object zzbhw;
    public final zzhz[] zzbhx;

    public zzoi(zznt zzntVar, zzoh zzohVar, Object obj, zzhz[] zzhzVarArr) {
        this.zzbhu = zzntVar;
        this.zzbhv = zzohVar;
        this.zzbhw = obj;
        this.zzbhx = zzhzVarArr;
    }

    public final boolean zza(zzoi zzoiVar, int i) {
        return zzoiVar != null && zzps.zza(this.zzbhv.zzbe(i), zzoiVar.zzbhv.zzbe(i)) && zzps.zza(this.zzbhx[i], zzoiVar.zzbhx[i]);
    }
}
