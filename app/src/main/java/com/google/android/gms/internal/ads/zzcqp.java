package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcqp extends TimerTask {
    private final /* synthetic */ AlertDialog zzgqy;
    private final /* synthetic */ Timer zzgqz;
    private final /* synthetic */ com.google.android.gms.ads.internal.overlay.zze zzgra;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcqp(AlertDialog alertDialog, Timer timer, com.google.android.gms.ads.internal.overlay.zze zzeVar) {
        this.zzgqy = alertDialog;
        this.zzgqz = timer;
        this.zzgra = zzeVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzgqy.dismiss();
        this.zzgqz.cancel();
        com.google.android.gms.ads.internal.overlay.zze zzeVar = this.zzgra;
        if (zzeVar != null) {
            zzeVar.close();
        }
    }
}
