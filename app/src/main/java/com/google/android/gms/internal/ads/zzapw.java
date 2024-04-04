package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzapw implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzapu zzdnt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapw(zzapu zzapuVar) {
        this.zzdnt = zzapuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdnt.zzds("Operation denied by user.");
    }
}
