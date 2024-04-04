package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbli implements zzepq<View> {
    private final zzble zzftk;

    public zzbli(zzble zzbleVar) {
        this.zzftk = zzbleVar;
    }

    public static View zza(zzble zzbleVar) {
        return (View) zzepw.zza(zzbleVar.zzajo(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzftk);
    }
}
