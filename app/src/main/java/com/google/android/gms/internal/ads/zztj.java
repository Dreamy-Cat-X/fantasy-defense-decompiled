package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zztj {
    private final Context context;
    private final Object lock = new Object();
    private zzte zzbum;
    private boolean zzbvh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztj(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Future<zztr> zzd(zztd zztdVar) {
        zztm zztmVar = new zztm(this);
        zztl zztlVar = new zztl(this, zztdVar, zztmVar);
        zztp zztpVar = new zztp(this, zztmVar);
        synchronized (this.lock) {
            zzte zzteVar = new zzte(this.context, com.google.android.gms.ads.internal.zzp.zzle().zzzn(), zztlVar, zztpVar);
            this.zzbum = zzteVar;
            zzteVar.checkAvailabilityAndConnect();
        }
        return zztmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnect() {
        synchronized (this.lock) {
            if (this.zzbum == null) {
                return;
            }
            this.zzbum.disconnect();
            this.zzbum = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zza(zztj zztjVar, boolean z) {
        zztjVar.zzbvh = true;
        return true;
    }
}
