package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzmv implements Runnable {
    private final /* synthetic */ zzmr zzbdi;
    private final /* synthetic */ IOException zzbeo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmv(zzmr zzmrVar, IOException iOException) {
        this.zzbdi = zzmrVar;
        this.zzbeo = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmy zzmyVar;
        zzmyVar = this.zzbdi.zzbdk;
        zzmyVar.zzb(this.zzbeo);
    }
}
