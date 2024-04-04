package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaxm implements zzaxo {
    @Override // com.google.android.gms.internal.ads.zzaxo
    public final zzdzl<String> zza(String str, PackageInfo packageInfo, int i) {
        return zzdyz.zzag(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final zzdzl<AdvertisingIdClient.Info> zza(Context context, int i) {
        zzazc zzazcVar = new zzazc();
        zzwo.zzqm();
        if (zzayd.zzbo(context)) {
            zzayv.zzegi.execute(new zzaxp(this, context, zzazcVar));
        }
        return zzazcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final zzdzl<String> zzb(Context context, int i) {
        return zzdyz.zzag(null);
    }
}
