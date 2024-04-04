package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdbl implements zzepq<zzdbj> {
    private final zzeqd<zzdjf> zzfwn;

    private zzdbl(zzeqd<zzdjf> zzeqdVar) {
        this.zzfwn = zzeqdVar;
    }

    public static zzdbl zzan(zzeqd<zzdjf> zzeqdVar) {
        return new zzdbl(zzeqdVar);
    }

    public static zzdbj zzb(zzdjf zzdjfVar) {
        return new zzdbj(zzdjfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzb(this.zzfwn.get());
    }
}
