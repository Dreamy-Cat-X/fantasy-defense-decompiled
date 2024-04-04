package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbca implements zzbcr {
    @Override // com.google.android.gms.internal.ads.zzbcr
    public final zzbcj zza(zzbaq zzbaqVar, int i, String str, zzbar zzbarVar) {
        if (i > 0) {
            int zzaci = zzbbm.zzaci();
            if (zzaci < zzbarVar.zzekr) {
                return new zzbcu(zzbaqVar, zzbarVar);
            }
            if (zzaci < zzbarVar.zzekl) {
                return new zzbcv(zzbaqVar, zzbarVar);
            }
            return new zzbct(zzbaqVar);
        }
        return new zzbcq(zzbaqVar);
    }
}
