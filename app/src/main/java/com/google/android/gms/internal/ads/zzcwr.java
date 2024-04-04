package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcwr implements zzepq<zzcwo> {
    private final zzeqd<zzchu> zzgul;

    private zzcwr(zzeqd<zzchu> zzeqdVar) {
        this.zzgul = zzeqdVar;
    }

    public static zzcwr zzaj(zzeqd<zzchu> zzeqdVar) {
        return new zzcwr(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcwo(this.zzgul.get());
    }
}
