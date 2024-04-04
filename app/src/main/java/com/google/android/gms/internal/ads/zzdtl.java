package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdti;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdtl implements zzeky<Integer, zzdti.zza> {
    @Override // com.google.android.gms.internal.ads.zzeky
    public final /* synthetic */ zzdti.zza convert(Integer num) {
        zzdti.zza zzei = zzdti.zza.zzei(num.intValue());
        return zzei == null ? zzdti.zza.BLOCKED_REASON_UNKNOWN : zzei;
    }
}
