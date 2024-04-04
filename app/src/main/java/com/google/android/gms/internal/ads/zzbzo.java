package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbzo implements zzepq<zzbzp> {
    private final zzeqd<zzbrl> zzfwm;

    private zzbzo(zzeqd<zzbrl> zzeqdVar) {
        this.zzfwm = zzeqdVar;
    }

    public static zzbzo zzx(zzeqd<zzbrl> zzeqdVar) {
        return new zzbzo(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbzp(this.zzfwm.get());
    }
}
