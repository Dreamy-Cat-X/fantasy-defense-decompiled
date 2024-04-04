package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzdti;
import com.google.android.gms.internal.ads.zzdtp;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdtb {
    private final Context context;
    private final Looper zzhrk;

    public zzdtb(Context context, Looper looper) {
        this.context = context;
        this.zzhrk = looper;
    }

    public final void zzhh(String str) {
        new zzdta(this.context, this.zzhrk, (zzdtp) ((zzekq) zzdtp.zzayf().zzhk(this.context.getPackageName()).zzb(zzdtp.zza.BLOCKED_IMPRESSION).zza(zzdti.zzayd().zzhj(str).zzb(zzdti.zza.BLOCKED_REASON_BACKGROUND)).zzbiz())).zzaxy();
    }
}
