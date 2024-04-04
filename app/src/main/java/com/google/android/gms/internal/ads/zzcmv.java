package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcmv extends zzasr {
    private final /* synthetic */ zzcms zzgnb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcmv(zzcms zzcmsVar) {
        this.zzgnb = zzcmsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaso
    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        this.zzgnb.zzdjx.set(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.google.android.gms.internal.ads.zzaso
    public final void zza(com.google.android.gms.ads.internal.util.zzap zzapVar) {
        this.zzgnb.zzdjx.setException(new com.google.android.gms.ads.internal.util.zzas(zzapVar.zzack, zzapVar.errorCode));
    }
}
