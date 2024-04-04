package com.google.android.gms.internal.ads;

import com.kt.olleh.inapp.net.InAppError;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzahn implements zzahv<zzbdh> {
    @Override // com.google.android.gms.internal.ads.zzahv
    public final /* synthetic */ void zza(zzbdh zzbdhVar, Map map) {
        zzbdhVar.zzal(InAppError.FAILED.equals(map.get("custom_close")));
    }
}
