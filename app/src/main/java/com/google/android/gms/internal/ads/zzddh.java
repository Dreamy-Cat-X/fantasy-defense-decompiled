package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzddh implements zzder<Bundle>, zzdeu<zzder<Bundle>> {
    private final ApplicationInfo applicationInfo;
    private final PackageInfo zzdsj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzddh(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.applicationInfo = applicationInfo;
        this.zzdsj = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzder<Bundle>> zzata() {
        return zzdyz.zzag(this);
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = this.applicationInfo.packageName;
        PackageInfo packageInfo = this.zzdsj;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle2.putString("pn", str);
        if (valueOf != null) {
            bundle2.putInt("vc", valueOf.intValue());
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcwk)).booleanValue()) {
            PackageInfo packageInfo2 = this.zzdsj;
            String str2 = packageInfo2 != null ? packageInfo2.versionName : null;
            if (str2 != null) {
                bundle2.putString("vnm", str2);
            }
        }
    }
}
