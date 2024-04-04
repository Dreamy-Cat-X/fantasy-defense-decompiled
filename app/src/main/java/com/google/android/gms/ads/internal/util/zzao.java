package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzao implements Runnable {
    final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzedt;
    private final /* synthetic */ boolean zzedu;
    private final /* synthetic */ boolean zzedv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzao(zzal zzalVar, Context context, String str, boolean z, boolean z2) {
        this.val$context = context;
        this.zzedt = str;
        this.zzedu = z;
        this.zzedv = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.val$context);
        builder.setMessage(this.zzedt);
        if (this.zzedu) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.zzedv) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new zzan(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
