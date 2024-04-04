package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzayg;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zze extends zza {
    private Context context;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zze(Context context) {
        this.context = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zza
    public final void zzwc() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.context);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            zzd.zzc("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        zzayg.zzar(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        zzd.zzex(sb.toString());
    }
}
