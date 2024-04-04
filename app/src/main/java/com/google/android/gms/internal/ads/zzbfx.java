package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbfx implements zzepq<zzati> {
    private final zzeqd<Context> zzeuo;

    public zzbfx(zzeqd<Context> zzeqdVar) {
        this.zzeuo = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        Context context = this.zzeuo.get();
        return (zzati) zzepw.zza(new zzatg(context, new zzatn(context).zzwi()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
