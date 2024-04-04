package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbjx implements zzepq<View> {
    private final zzbju zzfrx;

    public zzbjx(zzbju zzbjuVar) {
        this.zzfrx = zzbjuVar;
    }

    public static View zza(zzbju zzbjuVar) {
        return (View) zzepw.zza(zzbjuVar.zzajc(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzfrx);
    }
}
