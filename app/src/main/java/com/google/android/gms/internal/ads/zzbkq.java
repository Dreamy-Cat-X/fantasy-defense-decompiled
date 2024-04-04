package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbkq implements zzepq<String> {
    public static zzbkq zzajs() {
        zzbkq zzbkqVar;
        zzbkqVar = zzbkt.zzfso;
        return zzbkqVar;
    }

    public static String zzajm() {
        return (String) zzepw.zza("app_open_ad", "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzajm();
    }
}
