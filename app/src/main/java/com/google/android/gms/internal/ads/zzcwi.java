package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcwi implements com.google.android.gms.ads.internal.zzg {
    private com.google.android.gms.ads.internal.zzg zzgvm;

    public final synchronized void zza(com.google.android.gms.ads.internal.zzg zzgVar) {
        this.zzgvm = zzgVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zzh(View view) {
        if (this.zzgvm != null) {
            this.zzgvm.zzh(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zzkb() {
        if (this.zzgvm != null) {
            this.zzgvm.zzkb();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zzkc() {
        if (this.zzgvm != null) {
            this.zzgvm.zzkc();
        }
    }
}
