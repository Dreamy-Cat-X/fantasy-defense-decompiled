package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdbz implements zzepq<zzdbv> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<Context> zzfwd;

    private zzdbz(zzeqd<Context> zzeqdVar, zzeqd<zzdzk> zzeqdVar2) {
        this.zzfwd = zzeqdVar;
        this.zzeuj = zzeqdVar2;
    }

    public static zzdbz zzau(zzeqd<Context> zzeqdVar, zzeqd<zzdzk> zzeqdVar2) {
        return new zzdbz(zzeqdVar, zzeqdVar2);
    }

    public static zzdbv zza(Context context, zzdzk zzdzkVar) {
        return new zzdbv(context, zzdzkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzfwd.get(), this.zzeuj.get());
    }
}
