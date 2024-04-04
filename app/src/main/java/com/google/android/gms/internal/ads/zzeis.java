package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzeis extends zzeio {
    private final zzeir zzijs = new zzeir();

    @Override // com.google.android.gms.internal.ads.zzeio
    public final void zza(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.zzijs.zza(th, true).add(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzeio
    public final void zza(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> zza = this.zzijs.zza(th, false);
        if (zza == null) {
            return;
        }
        synchronized (zza) {
            for (Throwable th2 : zza) {
                printWriter.print("Suppressed: ");
                th2.printStackTrace(printWriter);
            }
        }
    }
}
