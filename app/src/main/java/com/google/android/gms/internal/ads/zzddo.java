package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzddo implements zzepq<zzddm> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<Bundle> zzhau;

    private zzddo(zzeqd<zzdzk> zzeqdVar, zzeqd<Bundle> zzeqdVar2) {
        this.zzeuj = zzeqdVar;
        this.zzhau = zzeqdVar2;
    }

    public static zzddo zzay(zzeqd<zzdzk> zzeqdVar, zzeqd<Bundle> zzeqdVar2) {
        return new zzddo(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzddm(this.zzeuj.get(), this.zzhau.get());
    }
}
