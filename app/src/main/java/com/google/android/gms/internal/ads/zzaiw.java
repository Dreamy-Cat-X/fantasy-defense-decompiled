package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaiw implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzazc zzbvj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaiw(zzaip zzaipVar, zzazc zzazcVar) {
        this.zzbvj = zzazcVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzbvj.setException(new RuntimeException("Connection failed."));
    }
}
