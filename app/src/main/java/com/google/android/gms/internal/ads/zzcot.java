package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcot implements zzepq<zzcoq> {
    private final zzeqd<zzdro> zzghw;
    private final zzeqd<String> zzgko;

    public zzcot(zzeqd<String> zzeqdVar, zzeqd<zzdro> zzeqdVar2) {
        this.zzgko = zzeqdVar;
        this.zzghw = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcoq(this.zzgko.get(), this.zzghw.get());
    }
}
