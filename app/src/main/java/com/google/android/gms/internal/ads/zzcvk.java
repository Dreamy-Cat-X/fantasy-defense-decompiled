package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcvk implements zzepq<zzcvl> {
    private final zzeqd<zzcwo> zzgul;

    private zzcvk(zzeqd<zzcwo> zzeqdVar) {
        this.zzgul = zzeqdVar;
    }

    public static zzcvk zzai(zzeqd<zzcwo> zzeqdVar) {
        return new zzcvk(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcvl(this.zzgul.get());
    }
}
