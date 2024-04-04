package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbyi implements zzepq<View> {
    private final zzbye zzfzr;

    private zzbyi(zzbye zzbyeVar) {
        this.zzfzr = zzbyeVar;
    }

    public static zzbyi zza(zzbye zzbyeVar) {
        return new zzbyi(zzbyeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return this.zzfzr.zzamt();
    }
}
