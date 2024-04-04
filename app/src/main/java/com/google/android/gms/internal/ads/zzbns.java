package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbns implements com.google.android.gms.ads.internal.overlay.zzp {
    private final zzbrr zzfvb;
    private AtomicBoolean zzfvc = new AtomicBoolean(false);

    public zzbns(zzbrr zzbrrVar) {
        this.zzfvb = zzbrrVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onUserLeaveHint() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zza(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzfvc.set(true);
        this.zzfvb.onAdClosed();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzvn() {
        this.zzfvb.onAdOpened();
    }

    public final boolean isClosed() {
        return this.zzfvc.get();
    }
}
