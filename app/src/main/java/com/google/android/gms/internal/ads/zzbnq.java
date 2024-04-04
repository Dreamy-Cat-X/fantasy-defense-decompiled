package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbnq implements zzepq<zzdmj> {
    private final zzbnp zzfva;

    private zzbnq(zzbnp zzbnpVar) {
        this.zzfva = zzbnpVar;
    }

    public static zzbnq zzc(zzbnp zzbnpVar) {
        return new zzbnq(zzbnpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzdmj) zzepw.zza(this.zzfva.zzakv(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
