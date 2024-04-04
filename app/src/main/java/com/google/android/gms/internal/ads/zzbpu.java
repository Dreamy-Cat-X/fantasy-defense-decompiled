package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbpu implements zzbrm, zzbsg {
    private final Context context;
    private final zzard zzbol;
    private final zzdmi zzeqz;

    public zzbpu(Context context, zzdmi zzdmiVar, zzard zzardVar) {
        this.context = context;
        this.zzeqz = zzdmiVar;
        this.zzbol = zzardVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzcc(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzcd(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void onAdLoaded() {
        if (this.zzeqz.zzhih == null || !this.zzeqz.zzhih.zzdrp) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!this.zzeqz.zzhih.zzdrq.isEmpty()) {
            arrayList.add(this.zzeqz.zzhih.zzdrq);
        }
        this.zzbol.zza(this.context, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzce(Context context) {
        this.zzbol.detach();
    }
}
