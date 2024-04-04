package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.common.util.PlatformVersion;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzo {
    public static void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.zzdrf == 4 && adOverlayInfoParcel.zzdra == null) {
            if (adOverlayInfoParcel.zzcgr != null) {
                adOverlayInfoParcel.zzcgr.onAdClicked();
            }
            com.google.android.gms.ads.internal.zzp.zzko();
            zza.zza(context, adOverlayInfoParcel.zzdqz, adOverlayInfoParcel.zzdre);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzbpd.zzegg);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.zza(intent, adOverlayInfoParcel);
        if (!PlatformVersion.isAtLeastLollipop()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        com.google.android.gms.ads.internal.zzp.zzkq();
        com.google.android.gms.ads.internal.util.zzm.zza(context, intent);
    }
}
