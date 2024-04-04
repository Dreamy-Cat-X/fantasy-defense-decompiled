package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcfx implements com.google.android.gms.ads.internal.overlay.zzp, com.google.android.gms.ads.internal.overlay.zzu, zzahc, zzahe, zzuz {
    private zzuz zzcgr;
    private zzahc zzdfv;
    private zzahe zzdfx;
    private com.google.android.gms.ads.internal.overlay.zzp zzdra;
    private com.google.android.gms.ads.internal.overlay.zzu zzdre;

    private zzcfx() {
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final synchronized void onAdClicked() {
        if (this.zzcgr != null) {
            this.zzcgr.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zza(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        if (this.zzdra != null) {
            this.zzdra.zza(zzlVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void onUserLeaveHint() {
        if (this.zzdra != null) {
            this.zzdra.onUserLeaveHint();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void onPause() {
        if (this.zzdra != null) {
            this.zzdra.onPause();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void onResume() {
        if (this.zzdra != null) {
            this.zzdra.onResume();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzvn() {
        if (this.zzdra != null) {
            this.zzdra.zzvn();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzu
    public final synchronized void zzwe() {
        if (this.zzdre != null) {
            this.zzdre.zzwe();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final synchronized void zza(String str, Bundle bundle) {
        if (this.zzdfv != null) {
            this.zzdfv.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahe
    public final synchronized void onAppEvent(String str, String str2) {
        if (this.zzdfx != null) {
            this.zzdfx.onAppEvent(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zza(zzuz zzuzVar, zzahc zzahcVar, com.google.android.gms.ads.internal.overlay.zzp zzpVar, zzahe zzaheVar, com.google.android.gms.ads.internal.overlay.zzu zzuVar) {
        this.zzcgr = zzuzVar;
        this.zzdfv = zzahcVar;
        this.zzdra = zzpVar;
        this.zzdfx = zzaheVar;
        this.zzdre = zzuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcfx(zzcfq zzcfqVar) {
        this();
    }
}
