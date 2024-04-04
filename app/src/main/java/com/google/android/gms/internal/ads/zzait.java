package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzait implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzazc zzbvj;
    private final /* synthetic */ zzaip zzdhj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzait(zzaip zzaipVar, zzazc zzazcVar) {
        this.zzdhj = zzaipVar;
        this.zzbvj = zzazcVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzaii zzaiiVar;
        try {
            zzazc zzazcVar = this.zzbvj;
            zzaiiVar = this.zzdhj.zzdhh;
            zzazcVar.set(zzaiiVar.zzuc());
        } catch (DeadObjectException e) {
            this.zzbvj.setException(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzazc zzazcVar = this.zzbvj;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        zzazcVar.setException(new RuntimeException(sb.toString()));
    }
}
