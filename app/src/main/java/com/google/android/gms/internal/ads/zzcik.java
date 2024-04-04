package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zztw;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcik implements zzepq<zzcjg> {
    public static zzcik zzaqe() {
        zzcik zzcikVar;
        zzcikVar = zzcin.zzgjd;
        return zzcikVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzcjg) zzepw.zza(new zzcjg(zztw.zza.zzb.REQUEST_WILL_UPDATE_SIGNALS, zztw.zza.zzb.REQUEST_DID_UPDATE_SIGNALS, zztw.zza.zzb.REQUEST_FAILED_TO_UPDATE_SIGNALS), "Cannot return null from a non-@Nullable @Provides method");
    }
}
