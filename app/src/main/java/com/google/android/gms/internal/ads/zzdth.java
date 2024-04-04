package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzcf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdth implements zzdtj {
    private static final zzcf.zza zzhrq = zzcf.zza.zzar();

    @Override // com.google.android.gms.internal.ads.zzdtj
    public final zzcf.zza zzcl(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        zzcf.zza.C0009zza zzaq = zzcf.zza.zzaq();
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context);
        advertisingIdClient.start();
        AdvertisingIdClient.Info info = advertisingIdClient.getInfo();
        String id = info.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zzaq.zzab(id);
            zzaq.zza(info.isLimitAdTrackingEnabled());
            zzaq.zza(zzcf.zza.zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
        }
        return (zzcf.zza) ((zzekq) zzaq.zzbiz());
    }

    @Override // com.google.android.gms.internal.ads.zzdtj
    public final zzcf.zza zzayc() {
        return zzhrq;
    }
}
