package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcxc implements zzcyl<zzblb> {
    private final /* synthetic */ zzcxd zzgwe;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcxc(zzcxd zzcxdVar) {
        this.zzgwe = zzcxdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzask() {
        synchronized (this.zzgwe) {
            this.zzgwe.zzgvz = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final /* synthetic */ void onSuccess(zzblb zzblbVar) {
        zzblb zzblbVar2;
        zzblb zzblbVar3;
        zzblb zzblbVar4;
        zzblb zzblbVar5 = zzblbVar;
        synchronized (this.zzgwe) {
            zzblbVar2 = this.zzgwe.zzgvz;
            if (zzblbVar2 != null) {
                zzblbVar4 = this.zzgwe.zzgvz;
                zzblbVar4.destroy();
            }
            this.zzgwe.zzgvz = zzblbVar5;
            zzblbVar3 = this.zzgwe.zzgvz;
            zzblbVar3.zzajy();
        }
    }
}
