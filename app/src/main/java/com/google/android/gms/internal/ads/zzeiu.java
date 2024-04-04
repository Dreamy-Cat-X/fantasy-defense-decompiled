package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzeiu extends zzeio {
    @Override // com.google.android.gms.internal.ads.zzeio
    public final void zza(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzeio
    public final void zza(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }
}
