package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdta implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final Object lock = new Object();
    private boolean zzgmw = false;
    private boolean zzgmx = false;
    private final zzdtw zzhri;
    private final zzdtp zzhrj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdta(Context context, Looper looper, zzdtp zzdtpVar) {
        this.zzhrj = zzdtpVar;
        this.zzhri = new zzdtw(context, looper, this, this, 12800000);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzaxy() {
        synchronized (this.lock) {
            if (!this.zzgmw) {
                this.zzgmw = true;
                this.zzhri.checkAvailabilityAndConnect();
            }
        }
    }

    private final void zzarr() {
        synchronized (this.lock) {
            if (this.zzhri.isConnected() || this.zzhri.isConnecting()) {
                this.zzhri.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.lock) {
            if (this.zzgmx) {
                return;
            }
            this.zzgmx = true;
            try {
                this.zzhri.zzayk().zza(new zzdtu(this.zzhrj.toByteArray()));
                zzarr();
            } catch (Exception unused) {
                zzarr();
            } catch (Throwable th) {
                zzarr();
                throw th;
            }
        }
    }
}
