package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzro implements Runnable {
    private final /* synthetic */ zzrl zzbtl;
    private final /* synthetic */ View zzbtm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzro(zzrl zzrlVar, View view) {
        this.zzbtl = zzrlVar;
        this.zzbtm = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbtl.zzj(this.zzbtm);
    }
}
