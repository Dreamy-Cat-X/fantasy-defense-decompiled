package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqv;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzv extends zzaqv {
    private Activity zzaap;
    private AdOverlayInfoParcel zzdrn;
    private boolean zzdqc = false;
    private boolean zzdro = false;

    public zzv(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzdrn = adOverlayInfoParcel;
        this.zzaap = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onActivityResult(int i, int i2, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onBackPressed() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onRestart() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onStart() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void zzad(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void zzdr() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final boolean zzvu() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onCreate(Bundle bundle) {
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdrn;
        if (adOverlayInfoParcel == null) {
            this.zzaap.finish();
            return;
        }
        if (z) {
            this.zzaap.finish();
            return;
        }
        if (bundle == null) {
            if (adOverlayInfoParcel.zzcgr != null) {
                this.zzdrn.zzcgr.onAdClicked();
            }
            if (this.zzaap.getIntent() != null && this.zzaap.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && this.zzdrn.zzdra != null) {
                this.zzdrn.zzdra.zzvn();
            }
        }
        com.google.android.gms.ads.internal.zzp.zzko();
        if (zza.zza(this.zzaap, this.zzdrn.zzdqz, this.zzdrn.zzdre)) {
            return;
        }
        this.zzaap.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onResume() throws RemoteException {
        if (this.zzdqc) {
            this.zzaap.finish();
            return;
        }
        this.zzdqc = true;
        if (this.zzdrn.zzdra != null) {
            this.zzdrn.zzdra.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdqc);
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onPause() throws RemoteException {
        if (this.zzdrn.zzdra != null) {
            this.zzdrn.zzdra.onPause();
        }
        if (this.zzaap.isFinishing()) {
            zzwf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onUserLeaveHint() throws RemoteException {
        if (this.zzdrn.zzdra != null) {
            this.zzdrn.zzdra.onUserLeaveHint();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onStop() throws RemoteException {
        if (this.zzaap.isFinishing()) {
            zzwf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onDestroy() throws RemoteException {
        if (this.zzaap.isFinishing()) {
            zzwf();
        }
    }

    private final synchronized void zzwf() {
        if (!this.zzdro) {
            if (this.zzdrn.zzdra != null) {
                this.zzdrn.zzdra.zza(zzl.OTHER);
            }
            this.zzdro = true;
        }
    }
}
