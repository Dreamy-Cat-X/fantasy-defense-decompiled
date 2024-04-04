package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.ads.zzcf;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdtg implements zzdtj {
    private static final zzcf.zza zzhrq = (zzcf.zza) ((zzekq) zzcf.zza.zzaq().zzv("E").zzbiz());

    @Override // com.google.android.gms.internal.ads.zzdtj
    public final zzcf.zza zzcl(Context context) throws PackageManager.NameNotFoundException {
        return zzdsx.zzj(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    @Override // com.google.android.gms.internal.ads.zzdtj
    public final zzcf.zza zzayc() {
        return zzhrq;
    }
}
