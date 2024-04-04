package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzta implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzsv zzbus;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzta(zzsv zzsvVar) {
        this.zzbus = zzsvVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzte zzteVar;
        zzte zzteVar2;
        obj = this.zzbus.lock;
        synchronized (obj) {
            try {
                zzteVar = this.zzbus.zzbum;
                if (zzteVar != null) {
                    zzsv zzsvVar = this.zzbus;
                    zzteVar2 = this.zzbus.zzbum;
                    zzsvVar.zzbun = zzteVar2.zznc();
                }
            } catch (DeadObjectException e) {
                com.google.android.gms.ads.internal.util.zzd.zzc("Unable to obtain a cache service instance.", e);
                this.zzbus.disconnect();
            }
            obj2 = this.zzbus.lock;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Object obj;
        Object obj2;
        obj = this.zzbus.lock;
        synchronized (obj) {
            this.zzbus.zzbun = null;
            obj2 = this.zzbus.lock;
            obj2.notifyAll();
        }
    }
}
