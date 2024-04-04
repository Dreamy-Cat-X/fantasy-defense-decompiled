package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzddp implements zzepq<zzddq> {
    private final zzeqd<String> zzgjm;

    private zzddp(zzeqd<String> zzeqdVar) {
        this.zzgjm = zzeqdVar;
    }

    public static zzddp zzaq(zzeqd<String> zzeqdVar) {
        return new zzddp(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzddq(this.zzgjm.get());
    }
}
