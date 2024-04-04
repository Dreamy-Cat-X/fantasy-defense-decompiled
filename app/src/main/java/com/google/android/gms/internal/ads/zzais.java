package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzais implements zzdyj<zzain, ParcelFileDescriptor> {
    private final /* synthetic */ zzaih zzdhi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzais(zzaip zzaipVar, zzaih zzaihVar) {
        this.zzdhi = zzaihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyj
    public final /* synthetic */ zzdzl<ParcelFileDescriptor> zzf(zzain zzainVar) throws Exception {
        zzazc zzazcVar = new zzazc();
        zzainVar.zza(this.zzdhi, new zzair(this, zzazcVar));
        return zzazcVar;
    }
}
