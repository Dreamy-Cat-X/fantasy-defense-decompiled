package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcvz implements com.google.android.gms.ads.internal.zzg {
    private final zzbxj zzfsy;
    private final zzbri zzgap;
    private final zzbqq zzgaq;
    private final zzbjf zzgar;
    private final zzbxe zzgat;
    private AtomicBoolean zzgvb = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvz(zzbqq zzbqqVar, zzbri zzbriVar, zzbxj zzbxjVar, zzbxe zzbxeVar, zzbjf zzbjfVar) {
        this.zzgaq = zzbqqVar;
        this.zzgap = zzbriVar;
        this.zzfsy = zzbxjVar;
        this.zzgat = zzbxeVar;
        this.zzgar = zzbjfVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zzh(View view) {
        if (this.zzgvb.compareAndSet(false, true)) {
            this.zzgar.onAdImpression();
            this.zzgat.zzv(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzkb() {
        if (this.zzgvb.get()) {
            this.zzgaq.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzkc() {
        if (this.zzgvb.get()) {
            this.zzgap.onAdImpression();
            this.zzfsy.zzamp();
        }
    }
}
