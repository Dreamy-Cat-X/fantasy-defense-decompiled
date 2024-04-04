package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcmf implements zzepq<zzdrp> {
    private final zzeqd<String> zzgjm;

    private zzcmf(zzeqd<String> zzeqdVar) {
        this.zzgjm = zzeqdVar;
    }

    public static zzcmf zzae(zzeqd<String> zzeqdVar) {
        return new zzcmf(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzdrp) zzepw.zza(zzdrp.zzha(this.zzgjm.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
