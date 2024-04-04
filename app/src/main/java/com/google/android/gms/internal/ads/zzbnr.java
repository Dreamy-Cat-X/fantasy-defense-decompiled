package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbnr implements zzepq<String> {
    private final zzbnp zzfva;

    private zzbnr(zzbnp zzbnpVar) {
        this.zzfva = zzbnpVar;
    }

    public static zzbnr zzd(zzbnp zzbnpVar) {
        return new zzbnr(zzbnpVar);
    }

    public static String zze(zzbnp zzbnpVar) {
        return (String) zzepw.zza(zzbnpVar.zzakw(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zze(this.zzfva);
    }
}
