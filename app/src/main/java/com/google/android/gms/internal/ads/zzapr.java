package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzapr implements Runnable {
    private final /* synthetic */ AdOverlayInfoParcel zzdnr;
    private final /* synthetic */ zzapp zzdns;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapr(zzapp zzappVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzdns = zzappVar;
        this.zzdnr = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        com.google.android.gms.ads.internal.zzp.zzkp();
        activity = this.zzdns.zzdnp;
        com.google.android.gms.ads.internal.overlay.zzo.zza(activity, this.zzdnr, true);
    }
}
