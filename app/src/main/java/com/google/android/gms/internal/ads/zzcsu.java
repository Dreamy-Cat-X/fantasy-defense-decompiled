package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcsu implements zzbzl {
    private zzbri zzfwh = null;
    private final zzdmi zzfwi;
    private final zzaoz zzgst;
    private final boolean zzgsu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsu(zzdmi zzdmiVar, zzaoz zzaozVar, boolean z) {
        this.zzfwi = zzdmiVar;
        this.zzgst = zzaozVar;
        this.zzgsu = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zza(boolean z, Context context) throws zzbzk {
        boolean zzz;
        try {
            if (this.zzgsu) {
                zzz = this.zzgst.zzaa(ObjectWrapper.wrap(context));
            } else {
                zzz = this.zzgst.zzz(ObjectWrapper.wrap(context));
            }
            if (!zzz) {
                throw new zzbzk("Adapter failed to show.");
            }
            if (this.zzfwh == null) {
                return;
            }
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqm)).booleanValue() || this.zzfwi.zzhif != 2) {
                return;
            }
            this.zzfwh.onAdImpression();
        } catch (Throwable th) {
            throw new zzbzk(th);
        }
    }

    public final void zza(zzbri zzbriVar) {
        this.zzfwh = zzbriVar;
    }
}
