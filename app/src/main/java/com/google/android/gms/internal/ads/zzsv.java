package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzsv {
    private Context context;
    private zzte zzbum;
    private zzti zzbun;
    private final Runnable zzbul = new zzsy(this);
    private final Object lock = new Object();

    public final void initialize(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.lock) {
            if (this.context != null) {
                return;
            }
            this.context = context.getApplicationContext();
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcti)).booleanValue()) {
                connect();
            } else {
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcth)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzp.zzkt().zza(new zzsx(this));
                }
            }
        }
    }

    public final void zzmt() {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzctj)).booleanValue()) {
            synchronized (this.lock) {
                connect();
                com.google.android.gms.ads.internal.util.zzm.zzecu.removeCallbacks(this.zzbul);
                com.google.android.gms.ads.internal.util.zzm.zzecu.postDelayed(this.zzbul, ((Long) zzwo.zzqq().zzd(zzabh.zzctk)).longValue());
            }
        }
    }

    public final zztc zza(zztd zztdVar) {
        synchronized (this.lock) {
            if (this.zzbun == null) {
                return new zztc();
            }
            try {
                if (this.zzbum.zznd()) {
                    return this.zzbun.zzc(zztdVar);
                }
                return this.zzbun.zza(zztdVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zzd.zzc("Unable to call into cache service.", e);
                return new zztc();
            }
        }
    }

    public final long zzb(zztd zztdVar) {
        synchronized (this.lock) {
            if (this.zzbun == null) {
                return -2L;
            }
            if (this.zzbum.zznd()) {
                try {
                    return this.zzbun.zzb(zztdVar);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zzd.zzc("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void connect() {
        synchronized (this.lock) {
            if (this.context != null && this.zzbum == null) {
                zzte zza = zza(new zzta(this), new zzsz(this));
                this.zzbum = zza;
                zza.checkAvailabilityAndConnect();
            }
        }
    }

    private final synchronized zzte zza(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzte(this.context, com.google.android.gms.ads.internal.zzp.zzle().zzzn(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnect() {
        synchronized (this.lock) {
            if (this.zzbum == null) {
                return;
            }
            if (this.zzbum.isConnected() || this.zzbum.isConnecting()) {
                this.zzbum.disconnect();
            }
            this.zzbum = null;
            this.zzbun = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzte zza(zzsv zzsvVar, zzte zzteVar) {
        zzsvVar.zzbum = null;
        return null;
    }
}
