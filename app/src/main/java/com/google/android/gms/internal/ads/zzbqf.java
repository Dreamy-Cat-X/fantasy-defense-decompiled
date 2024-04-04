package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbqf implements zzepq<Bundle> {
    private final zzbqd zzfxg;

    private zzbqf(zzbqd zzbqdVar) {
        this.zzfxg = zzbqdVar;
    }

    public static zzbqf zzj(zzbqd zzbqdVar) {
        return new zzbqf(zzbqdVar);
    }

    public static Bundle zzk(zzbqd zzbqdVar) {
        return zzbqdVar.zzalk();
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return this.zzfxg.zzalk();
    }
}
