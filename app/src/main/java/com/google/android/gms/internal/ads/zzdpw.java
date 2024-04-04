package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdpw implements zzepq<zzdzk> {
    public static zzdpw zzawx() {
        zzdpw zzdpwVar;
        zzdpwVar = zzdpz.zzhnx;
        return zzdpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        zzdzk zzdzkVar;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcvy)).booleanValue()) {
            zzdzkVar = zzayv.zzegk;
        } else {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcvx)).booleanValue()) {
                zzdzkVar = zzayv.zzegi;
            } else {
                zzdzkVar = zzayv.zzegm;
            }
        }
        return (zzdzk) zzepw.zza(zzdzkVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
