package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zztl implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zztd zzbvi;
    private final /* synthetic */ zzazc zzbvj;
    final /* synthetic */ zztj zzbvk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztl(zztj zztjVar, zztd zztdVar, zzazc zzazcVar) {
        this.zzbvk = zztjVar;
        this.zzbvi = zztdVar;
        this.zzbvj = zzazcVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z;
        final zzte zzteVar;
        obj = this.zzbvk.lock;
        synchronized (obj) {
            z = this.zzbvk.zzbvh;
            if (z) {
                return;
            }
            zztj.zza(this.zzbvk, true);
            zzteVar = this.zzbvk.zzbum;
            if (zzteVar == null) {
                return;
            }
            zzdzk zzdzkVar = zzayv.zzegi;
            final zztd zztdVar = this.zzbvi;
            final zzazc zzazcVar = this.zzbvj;
            final zzdzl<?> submit = zzdzkVar.submit(new Runnable(this, zzteVar, zztdVar, zzazcVar) { // from class: com.google.android.gms.internal.ads.zzto
                private final zztl zzbvn;
                private final zzte zzbvo;
                private final zztd zzbvp;
                private final zzazc zzbvq;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbvn = this;
                    this.zzbvo = zzteVar;
                    this.zzbvp = zztdVar;
                    this.zzbvq = zzazcVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zztc zza;
                    zztl zztlVar = this.zzbvn;
                    zzte zzteVar2 = this.zzbvo;
                    zztd zztdVar2 = this.zzbvp;
                    zzazc zzazcVar2 = this.zzbvq;
                    try {
                        zzti zznc = zzteVar2.zznc();
                        if (zzteVar2.zznd()) {
                            zza = zznc.zzc(zztdVar2);
                        } else {
                            zza = zznc.zza(zztdVar2);
                        }
                        if (!zza.zzmv()) {
                            zzazcVar2.setException(new RuntimeException("No entry contents."));
                            zztlVar.zzbvk.disconnect();
                            return;
                        }
                        zztq zztqVar = new zztq(zztlVar, zza.zzmw(), 1);
                        int read = zztqVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zztqVar.unread(read);
                        zzazcVar2.set(zztr.zza(zztqVar, zza.zzmy(), zza.zznb(), zza.zzna(), zza.zzmz()));
                    } catch (RemoteException | IOException e) {
                        com.google.android.gms.ads.internal.util.zzd.zzc("Unable to obtain a cache service instance.", e);
                        zzazcVar2.setException(e);
                        zztlVar.zzbvk.disconnect();
                    }
                }
            });
            zzazc zzazcVar2 = this.zzbvj;
            final zzazc zzazcVar3 = this.zzbvj;
            zzazcVar2.addListener(new Runnable(zzazcVar3, submit) { // from class: com.google.android.gms.internal.ads.zztn
                private final zzazc zzbvl;
                private final Future zzbvm;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbvl = zzazcVar3;
                    this.zzbvm = submit;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzazc zzazcVar4 = this.zzbvl;
                    Future future = this.zzbvm;
                    if (zzazcVar4.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzayv.zzegn);
        }
    }
}
