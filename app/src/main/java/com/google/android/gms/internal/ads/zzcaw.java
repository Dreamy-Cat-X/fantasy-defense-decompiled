package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcaw implements zzepq<zzcax> {
    private final zzeqd<zzcbi> zzgbf;

    private zzcaw(zzeqd<zzcbi> zzeqdVar) {
        this.zzgbf = zzeqdVar;
    }

    public static zzcaw zzy(zzeqd<zzcbi> zzeqdVar) {
        return new zzcaw(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcax(this.zzgbf.get());
    }
}
