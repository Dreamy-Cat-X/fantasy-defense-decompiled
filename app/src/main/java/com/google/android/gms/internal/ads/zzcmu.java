package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcmu extends zzcms {
    public zzcmu(Context context) {
        this.zzgmz = new zzasc(context, com.google.android.gms.ads.internal.zzp.zzle().zzzn(), this, this);
    }

    public final zzdzl<InputStream> zzj(zzasu zzasuVar) {
        synchronized (this.mLock) {
            if (this.zzgmw) {
                return this.zzdjx;
            }
            this.zzgmw = true;
            this.zzgmy = zzasuVar;
            this.zzgmz.checkAvailabilityAndConnect();
            this.zzdjx.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcmx
                private final zzcmu zzgnc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgnc = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgnc.zzarr();
                }
            }, zzayv.zzegn);
            return this.zzdjx;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.mLock) {
            if (!this.zzgmx) {
                this.zzgmx = true;
                try {
                    try {
                        this.zzgmz.zzwg().zzb(this.zzgmy, new zzcmv(this));
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzp.zzku().zza(th, "RemoteSignalsClientTask.onConnected");
                        this.zzdjx.setException(new zzcnj(zzdnu.INTERNAL_ERROR));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zzdjx.setException(new zzcnj(zzdnu.INTERNAL_ERROR));
                }
            }
        }
    }
}
