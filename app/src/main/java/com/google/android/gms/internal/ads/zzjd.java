package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzjd implements zziy {
    private final /* synthetic */ zzjb zzamt;

    private zzjd(zzjb zzjbVar) {
        this.zzamt = zzjbVar;
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final void zzx(int i) {
        zzjb.zza(this.zzamt).zzw(i);
        zzjb.zzx(i);
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final void zzek() {
        zzjb.zzgd();
        zzjb.zza(this.zzamt, true);
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final void zzc(int i, long j, long j2) {
        zzjb.zza(this.zzamt).zza(i, j, j2);
        zzjb.zzb(i, j, j2);
    }
}
