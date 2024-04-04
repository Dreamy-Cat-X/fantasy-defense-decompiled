package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbqe implements zzepq<String> {
    private final zzbqd zzfxg;

    private zzbqe(zzbqd zzbqdVar) {
        this.zzfxg = zzbqdVar;
    }

    public static zzbqe zzh(zzbqd zzbqdVar) {
        return new zzbqe(zzbqdVar);
    }

    public static String zzi(zzbqd zzbqdVar) {
        return zzbqdVar.zzall();
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return this.zzfxg.zzall();
    }
}
