package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzsz implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzsv zzbus;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsz(zzsv zzsvVar) {
        this.zzbus = zzsvVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        zzte zzteVar;
        Object obj2;
        obj = this.zzbus.lock;
        synchronized (obj) {
            this.zzbus.zzbun = null;
            zzteVar = this.zzbus.zzbum;
            if (zzteVar != null) {
                zzsv.zza(this.zzbus, (zzte) null);
            }
            obj2 = this.zzbus.lock;
            obj2.notifyAll();
        }
    }
}
