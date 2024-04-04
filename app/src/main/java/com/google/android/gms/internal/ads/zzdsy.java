package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbw;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdsy implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final long startTime;
    private final HandlerThread zzeev;
    private zzdtw zzhrc;
    private final LinkedBlockingQueue<zzdul> zzhre;
    private final String zzhrf;
    private final String zzhrg;
    private final int zzhrh = 1;
    private final zzdsn zzvo;
    private final zzgq zzvq;

    public zzdsy(Context context, int i, zzgq zzgqVar, String str, String str2, String str3, zzdsn zzdsnVar) {
        this.zzhrf = str;
        this.zzvq = zzgqVar;
        this.zzhrg = str2;
        this.zzvo = zzdsnVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zzeev = handlerThread;
        handlerThread.start();
        this.startTime = System.currentTimeMillis();
        this.zzhrc = new zzdtw(context, this.zzeev.getLooper(), this, this, 19621000);
        this.zzhre = new LinkedBlockingQueue<>();
        this.zzhrc.checkAvailabilityAndConnect();
    }

    public final zzdul zzeh(int i) {
        zzdul zzdulVar;
        try {
            zzdulVar = this.zzhre.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zzb(2009, this.startTime, e);
            zzdulVar = null;
        }
        zzb(3004, this.startTime, null);
        if (zzdulVar != null) {
            if (zzdulVar.status == 7) {
                zzdsn.zzb(zzbw.zza.zzc.DISABLED);
            } else {
                zzdsn.zzb(zzbw.zza.zzc.ENABLED);
            }
        }
        return zzdulVar == null ? zzaxx() : zzdulVar;
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
            zzb(4011, this.startTime, null);
            this.zzhre.put(zzaxx());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzdud zzaxv = zzaxv();
        if (zzaxv != null) {
            try {
                zzdul zza = zzaxv.zza(new zzduj(this.zzhrh, this.zzvq, this.zzhrf, this.zzhrg));
                zzb(5011, this.startTime, null);
                this.zzhre.put(zza);
            } catch (Throwable th) {
                try {
                    zzb(2010, this.startTime, new Exception(th));
                } finally {
                    zzarr();
                    this.zzeev.quit();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zzb(4012, this.startTime, null);
            this.zzhre.put(zzaxx());
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

    private static zzdul zzaxx() {
        return new zzdul(null, 1);
    }

    private final void zzb(int i, long j, Exception exc) {
        zzdsn zzdsnVar = this.zzvo;
        if (zzdsnVar != null) {
            zzdsnVar.zza(i, System.currentTimeMillis() - j, exc);
        }
    }
}
