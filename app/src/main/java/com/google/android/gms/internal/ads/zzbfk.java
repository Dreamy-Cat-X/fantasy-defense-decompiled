package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbfk implements zzepq<Context> {
    private final zzbfh zzeuh;

    public zzbfk(zzbfh zzbfhVar) {
        this.zzeuh = zzbfhVar;
    }

    public static Context zza(zzbfh zzbfhVar) {
        return (Context) zzepw.zza(zzbfhVar.zzafo(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzeuh);
    }
}
