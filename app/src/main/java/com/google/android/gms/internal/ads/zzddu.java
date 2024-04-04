package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzddu implements zzepq<zzdds> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<String> zzfbn;

    private zzddu(zzeqd<Context> zzeqdVar, zzeqd<String> zzeqdVar2) {
        this.zzeuo = zzeqdVar;
        this.zzfbn = zzeqdVar2;
    }

    public static zzddu zzaz(zzeqd<Context> zzeqdVar, zzeqd<String> zzeqdVar2) {
        return new zzddu(zzeqdVar, zzeqdVar2);
    }

    public static zzdds zzs(Context context, String str) {
        return new zzdds(context, str);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzs(this.zzeuo.get(), this.zzfbn.get());
    }
}
