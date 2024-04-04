package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcmb implements zzepq<String> {
    private final zzeqd<Context> zzeuo;

    private zzcmb(zzeqd<Context> zzeqdVar) {
        this.zzeuo = zzeqdVar;
    }

    public static zzcmb zzad(zzeqd<Context> zzeqdVar) {
        return new zzcmb(zzeqdVar);
    }

    public static String zzci(Context context) {
        return (String) zzepw.zza(context.getPackageName(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzci(this.zzeuo.get());
    }
}
