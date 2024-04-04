package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbdm implements com.google.android.gms.ads.internal.overlay.zzp {
    private com.google.android.gms.ads.internal.overlay.zzp zzdra;
    private zzbdh zzepu;

    public zzbdm(zzbdh zzbdhVar, com.google.android.gms.ads.internal.overlay.zzp zzpVar) {
        this.zzepu = zzbdhVar;
        this.zzdra = zzpVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzvn() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzdra;
        if (zzpVar != null) {
            zzpVar.zzvn();
        }
        this.zzepu.zzvz();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zza(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzdra;
        if (zzpVar != null) {
            zzpVar.zza(zzlVar);
        }
        this.zzepu.zzadb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onUserLeaveHint() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzdra;
        if (zzpVar != null) {
            zzpVar.onUserLeaveHint();
        }
    }
}
