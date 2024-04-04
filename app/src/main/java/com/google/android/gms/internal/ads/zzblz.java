package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzblz implements zzepq<zzcqq<zzblb>> {
    private final zzeqd<zzcrn> zzflb;
    private final zzeqd<zzcsh> zzflc;
    private final zzeqd<zzdmx> zzftm;

    public zzblz(zzeqd<zzdmx> zzeqdVar, zzeqd<zzcsh> zzeqdVar2, zzeqd<zzcrn> zzeqdVar3) {
        this.zzftm = zzeqdVar;
        this.zzflc = zzeqdVar2;
        this.zzflb = zzeqdVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzwo.zzqq().zzd(com.google.android.gms.internal.ads.zzabh.zzcph)).booleanValue() != false) goto L8;
     */
    @Override // com.google.android.gms.internal.ads.zzeqd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object get() {
        zzdmx zzdmxVar = this.zzftm.get();
        zzcqq zzcqqVar = (zzcsh) this.zzflc.get();
        zzcqq zzcqqVar2 = (zzcrn) this.zzflb.get();
        if (zzdmxVar.zzavd() != null) {
        }
        zzcqqVar = zzcqqVar2;
        return (zzcqq) zzepw.zza(zzcqqVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
