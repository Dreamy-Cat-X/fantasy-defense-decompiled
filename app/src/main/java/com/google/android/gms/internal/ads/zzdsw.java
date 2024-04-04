package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzcf;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdsw implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final String packageName;
    private final HandlerThread zzeev;
    private zzdtw zzhrc;
    private final String zzhrd;
    private final LinkedBlockingQueue<zzcf.zza> zzhre;

    public zzdsw(Context context, String str, String str2) {
        this.packageName = str;
        this.zzhrd = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zzeev = handlerThread;
        handlerThread.start();
        this.zzhrc = new zzdtw(context, this.zzeev.getLooper(), this, this, 9200000);
        this.zzhre = new LinkedBlockingQueue<>();
        this.zzhrc.checkAvailabilityAndConnect();
    }

    public final zzcf.zza zzeg(int i) {
        zzcf.zza zzaVar;
        try {
            zzaVar = this.zzhre.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzaVar = null;
        }
        return zzaVar == null ? zzaxw() : zzaVar;
    }

    private final zzdud zzaxv() {
        try {
            return this.zzhrc.zzayk();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.zzhre.put(zzaxw());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzdud zzaxv = zzaxv();
        if (zzaxv != null) {
            try {
                try {
                    this.zzhre.put(zzaxv.zza(new zzdtz(this.packageName, this.zzhrd)).zzayl());
                    zzarr();
                    this.zzeev.quit();
                } catch (InterruptedException unused) {
                    zzarr();
                    this.zzeev.quit();
                } catch (Throwable th) {
                    zzarr();
                    this.zzeev.quit();
                    throw th;
                }
            } catch (Throwable unused2) {
                this.zzhre.put(zzaxw());
                zzarr();
                this.zzeev.quit();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzhre.put(zzaxw());
        } catch (InterruptedException unused) {
        }
    }

    private final void zzarr() {
        zzdtw zzdtwVar = this.zzhrc;
        if (zzdtwVar != null) {
            if (zzdtwVar.isConnected() || this.zzhrc.isConnecting()) {
                this.zzhrc.disconnect();
            }
        }
    }

    private static zzcf.zza zzaxw() {
        return (zzcf.zza) ((zzekq) zzcf.zza.zzaq().zzn(32768L).zzbiz());
    }
}
