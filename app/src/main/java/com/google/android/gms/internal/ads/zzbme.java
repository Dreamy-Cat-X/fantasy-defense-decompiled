package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbme implements zzepq<Boolean> {
    private final zzeqd<zzdmx> zzftm;

    public zzbme(zzeqd<zzdmx> zzeqdVar) {
        this.zzftm = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        boolean booleanValue;
        if (this.zzftm.get().zzavd() != null) {
            booleanValue = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcph)).booleanValue();
        } else {
            booleanValue = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcvr)).booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }
}
