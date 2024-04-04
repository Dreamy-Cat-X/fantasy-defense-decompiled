package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbfn implements zzepq<zzcqv<zzdno, zzcsn>> {
    private final zzbfh zzeuh;
    private final zzeqd<zzchu> zzeuk;

    public zzbfn(zzbfh zzbfhVar, zzeqd<zzchu> zzeqdVar) {
        this.zzeuh = zzbfhVar;
        this.zzeuk = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzcqv) zzepw.zza(new zzcus(this.zzeuk.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
