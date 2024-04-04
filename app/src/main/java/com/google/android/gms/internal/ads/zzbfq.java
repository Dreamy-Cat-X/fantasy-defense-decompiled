package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbfq implements zzepq<zzbij> {
    private final zzbfh zzeuh;
    private final zzeqd<zzbff> zzeul;

    public zzbfq(zzbfh zzbfhVar, zzeqd<zzbff> zzeqdVar) {
        this.zzeuh = zzbfhVar;
        this.zzeul = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbij) zzepw.zza(this.zzeul.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
