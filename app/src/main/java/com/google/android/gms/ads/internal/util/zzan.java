package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzan implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzao zzeds;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzan(zzao zzaoVar) {
        this.zzeds = zzaoVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzp.zzkq();
        zzm.zzb(this.zzeds.val$context, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
