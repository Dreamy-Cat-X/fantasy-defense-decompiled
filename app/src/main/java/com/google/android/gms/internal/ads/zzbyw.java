package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbyw implements zzepq<View> {
    private final zzbye zzfzr;

    private zzbyw(zzbye zzbyeVar) {
        this.zzfzr = zzbyeVar;
    }

    public static zzbyw zzc(zzbye zzbyeVar) {
        return new zzbyw(zzbyeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return this.zzfzr.zzams();
    }
}
