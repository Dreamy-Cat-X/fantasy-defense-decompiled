package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzcms implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected zzasu zzgmy;
    protected zzasc zzgmz;
    protected final zzazc<InputStream> zzdjx = new zzazc<>();
    protected final Object mLock = new Object();
    protected boolean zzgmw = false;
    protected boolean zzgmx = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzarr() {
        synchronized (this.mLock) {
            this.zzgmx = true;
            if (this.zzgmz.isConnected() || this.zzgmz.isConnecting()) {
                this.zzgmz.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i) {
        com.google.android.gms.ads.internal.util.zzd.zzdy("Cannot connect to remote service, fallback to local instance.");
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.zzd.zzdy("Disconnected from remote ad request service.");
        this.zzdjx.setException(new zzcnj(zzdnu.INTERNAL_ERROR));
    }
}
