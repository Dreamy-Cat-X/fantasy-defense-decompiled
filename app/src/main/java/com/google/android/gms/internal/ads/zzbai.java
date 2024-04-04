package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbai extends zzbaa {
    @Override // com.google.android.gms.internal.ads.zzbaa
    public final zzbab zza(Context context, zzbaq zzbaqVar, int i, boolean z, zzaby zzabyVar, zzbar zzbarVar) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(applicationInfo == null || applicationInfo.targetSdkVersion >= 11)) {
            return null;
        }
        zzbat zzbatVar = new zzbat(context, zzbaqVar.zzabf(), zzbaqVar.getRequestId(), zzabyVar, zzbaqVar.zzaaz());
        if (i == 2) {
            return new zzbax(context, zzbatVar, zzbaqVar, z, zza(zzbaqVar), zzbarVar);
        }
        return new zzazo(context, zzbaqVar, z, zza(zzbaqVar), zzbarVar, new zzbat(context, zzbaqVar.zzabf(), zzbaqVar.getRequestId(), zzabyVar, zzbaqVar.zzaaz()));
    }
}
