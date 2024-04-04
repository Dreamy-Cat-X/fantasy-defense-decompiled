package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzapt implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzapu zzdnt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapt(zzapu zzapuVar) {
        this.zzdnt = zzapuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        Intent createIntent = this.zzdnt.createIntent();
        com.google.android.gms.ads.internal.zzp.zzkq();
        context = this.zzdnt.context;
        com.google.android.gms.ads.internal.util.zzm.zza(context, createIntent);
    }
}
