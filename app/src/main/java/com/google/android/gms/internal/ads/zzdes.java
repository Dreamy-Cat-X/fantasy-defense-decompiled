package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdes implements zzepq<zzdel> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<Context> zzfwd;

    private zzdes(zzeqd<zzdzk> zzeqdVar, zzeqd<Context> zzeqdVar2) {
        this.zzeuj = zzeqdVar;
        this.zzfwd = zzeqdVar2;
    }

    public static zzdes zzba(zzeqd<zzdzk> zzeqdVar, zzeqd<Context> zzeqdVar2) {
        return new zzdes(zzeqdVar, zzeqdVar2);
    }

    public static zzdel zza(zzdzk zzdzkVar, Context context) {
        return new zzdel(zzdzkVar, context);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzeuj.get(), this.zzfwd.get());
    }
}
