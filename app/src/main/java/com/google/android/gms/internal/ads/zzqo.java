package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzqo implements Runnable {
    private final /* synthetic */ zzqi zzbmx;
    private final /* synthetic */ Surface zzbna;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqo(zzqi zzqiVar, Surface surface) {
        this.zzbmx = zzqiVar;
        this.zzbna = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzqj zzqjVar;
        zzqjVar = this.zzbmx.zzbmw;
        zzqjVar.zzb(this.zzbna);
    }
}
