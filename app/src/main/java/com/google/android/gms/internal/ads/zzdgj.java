package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdgj implements zzepq<zzdgh> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<zzaxk> zzewc;
    private final zzeqd<String> zzfww;

    public zzdgj(zzeqd<zzaxk> zzeqdVar, zzeqd<zzdzk> zzeqdVar2, zzeqd<String> zzeqdVar3) {
        this.zzewc = zzeqdVar;
        this.zzeuj = zzeqdVar2;
        this.zzfww = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdgh(this.zzewc.get(), this.zzeuj.get(), this.zzfww.get());
    }
}
