package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzrj implements Runnable {
    private final /* synthetic */ zzrk zzbsp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrj(zzrk zzrkVar) {
        this.zzbsp = zzrkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List list;
        obj = this.zzbsp.lock;
        synchronized (obj) {
            z = this.zzbsp.foreground;
            if (z) {
                z2 = this.zzbsp.zzbsq;
                if (z2) {
                    zzrk.zza(this.zzbsp, false);
                    com.google.android.gms.ads.internal.util.zzd.zzdy("App went background");
                    list = this.zzbsp.zzbsr;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzrm) it.next()).zzp(false);
                        } catch (Exception e) {
                            zzaym.zzc("", e);
                        }
                    }
                }
            }
            com.google.android.gms.ads.internal.util.zzd.zzdy("App is still foreground");
        }
    }
}
