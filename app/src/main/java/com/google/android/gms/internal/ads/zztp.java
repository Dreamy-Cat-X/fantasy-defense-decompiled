package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zztp implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzazc zzbvj;
    private final /* synthetic */ zztj zzbvk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztp(zztj zztjVar, zzazc zzazcVar) {
        this.zzbvk = zztjVar;
        this.zzbvj = zzazcVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzbvk.lock;
        synchronized (obj) {
            this.zzbvj.setException(new RuntimeException("Connection failed."));
        }
    }
}
