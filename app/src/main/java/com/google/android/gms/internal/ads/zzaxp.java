package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzaxp implements Runnable {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzazc zzdzw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxp(zzaxm zzaxmVar, Context context, zzazc zzazcVar) {
        this.val$context = context;
        this.zzdzw = zzazcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzdzw.set(AdvertisingIdClient.getAdvertisingIdInfo(this.val$context));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzdzw.setException(e);
            zzaym.zzc("Exception while getting advertising Id info", e);
        }
    }
}
