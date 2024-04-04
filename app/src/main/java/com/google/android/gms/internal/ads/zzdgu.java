package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdgu implements zzepq<String> {
    private final zzdgr zzhdc;

    public zzdgu(zzdgr zzdgrVar) {
        this.zzhdc = zzdgrVar;
    }

    public static String zzb(zzdgr zzdgrVar) {
        return (String) zzepw.zza(zzdgrVar.zzatx(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzb(this.zzhdc);
    }
}
