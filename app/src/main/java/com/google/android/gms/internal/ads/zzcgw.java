package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcgw implements com.google.android.gms.ads.internal.zzk {
    private final /* synthetic */ zzcgx zzgie;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcgw(zzcgx zzcgxVar) {
        this.zzgie = zzcgxVar;
    }

    @Override // com.google.android.gms.ads.internal.zzk
    public final void zzkm() {
        zzbsx zzbsxVar;
        zzbsxVar = this.zzgie.zzgif;
        zzbsxVar.onPause();
    }

    @Override // com.google.android.gms.ads.internal.zzk
    public final void zzkn() {
        zzbsx zzbsxVar;
        zzbsxVar = this.zzgie.zzgif;
        zzbsxVar.onResume();
    }
}
