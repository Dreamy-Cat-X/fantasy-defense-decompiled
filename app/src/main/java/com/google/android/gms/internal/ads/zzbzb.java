package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbzb implements com.google.android.gms.ads.internal.overlay.zzp {
    private final zzbso zzfzs;
    private final zzbxb zzfzt;

    public zzbzb(zzbso zzbsoVar, zzbxb zzbxbVar) {
        this.zzfzs = zzbsoVar;
        this.zzfzt = zzbxbVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zza(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzfzs.zza(zzlVar);
        this.zzfzt.onHide();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onPause() {
        this.zzfzs.onPause();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onResume() {
        this.zzfzs.onResume();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzvn() {
        this.zzfzs.zzvn();
        this.zzfzt.zzamn();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onUserLeaveHint() {
        this.zzfzs.onUserLeaveHint();
    }
}
