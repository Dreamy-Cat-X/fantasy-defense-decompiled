package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzaqc implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzaqa zzdor;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqc(zzaqa zzaqaVar) {
        this.zzdor = zzaqaVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdor.zzds("User canceled the download.");
    }
}
