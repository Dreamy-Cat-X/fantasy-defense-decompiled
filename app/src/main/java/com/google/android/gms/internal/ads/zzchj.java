package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzchj implements zzaqi {
    private final /* synthetic */ zzcgz zzgim;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchj(zzcgz zzcgzVar) {
        this.zzgim = zzcgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqi
    public final void zzc(int i, int i2, int i3, int i4) {
        zzbrr zzbrrVar;
        zzbrrVar = this.zzgim.zzfvb;
        zzbrrVar.onAdOpened();
    }

    @Override // com.google.android.gms.internal.ads.zzaqi
    public final void zzvq() {
        zzbrr zzbrrVar;
        zzbrrVar = this.zzgim.zzfvb;
        zzbrrVar.onAdClosed();
    }

    @Override // com.google.android.gms.internal.ads.zzaqi
    public final void zzvr() {
        zzbun zzbunVar;
        zzbunVar = this.zzgim.zzgij;
        zzbunVar.zzakc();
    }
}
