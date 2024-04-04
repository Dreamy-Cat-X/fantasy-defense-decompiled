package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcmz extends zzcms {
    private String zzgne;
    private int zzgnf = zzcna.zzgng;

    public zzcmz(Context context) {
        this.zzgmz = new zzasc(context, com.google.android.gms.ads.internal.zzp.zzle().zzzn(), this, this);
    }

    public final zzdzl<InputStream> zzk(zzasu zzasuVar) {
        synchronized (this.mLock) {
            if (this.zzgnf != zzcna.zzgng && this.zzgnf != zzcna.zzgnh) {
                return zzdyz.immediateFailedFuture(new zzcnj(zzdnu.INVALID_REQUEST));
            }
            if (this.zzgmw) {
                return this.zzdjx;
            }
            this.zzgnf = zzcna.zzgnh;
            this.zzgmw = true;
            this.zzgmy = zzasuVar;
            this.zzgmz.checkAvailabilityAndConnect();
            this.zzdjx.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcmy
                private final zzcmz zzgnd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgnd = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgnd.zzarr();
                }
            }, zzayv.zzegn);
            return this.zzdjx;
        }
    }

    public final zzdzl<InputStream> zzgi(String str) {
        synchronized (this.mLock) {
            if (this.zzgnf != zzcna.zzgng && this.zzgnf != zzcna.zzgni) {
                return zzdyz.immediateFailedFuture(new zzcnj(zzdnu.INVALID_REQUEST));
            }
            if (this.zzgmw) {
                return this.zzdjx;
            }
            this.zzgnf = zzcna.zzgni;
            this.zzgmw = true;
            this.zzgne = str;
            this.zzgmz.checkAvailabilityAndConnect();
            this.zzdjx.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcnb
                private final zzcmz zzgnd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgnd = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgnd.zzarr();
                }
            }, zzayv.zzegn);
            return this.zzdjx;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcms, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.zzd.zzdy("Cannot connect to remote service, fallback to local instance.");
        this.zzdjx.setException(new zzcnj(zzdnu.INTERNAL_ERROR));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.mLock) {
            if (!this.zzgmx) {
                this.zzgmx = true;
                try {
                    if (this.zzgnf == zzcna.zzgnh) {
                        this.zzgmz.zzwg().zzc(this.zzgmy, new zzcmv(this));
                    } else if (this.zzgnf == zzcna.zzgni) {
                        this.zzgmz.zzwg().zza(this.zzgne, new zzcmv(this));
                    } else {
                        this.zzdjx.setException(new zzcnj(zzdnu.INTERNAL_ERROR));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zzdjx.setException(new zzcnj(zzdnu.INTERNAL_ERROR));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzp.zzku().zza(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zzdjx.setException(new zzcnj(zzdnu.INTERNAL_ERROR));
                }
            }
        }
    }
}
