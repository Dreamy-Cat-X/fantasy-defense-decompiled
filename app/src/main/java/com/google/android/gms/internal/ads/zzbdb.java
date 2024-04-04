package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbdb implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsResult zzeov;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdb(JsResult jsResult) {
        this.zzeov = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzeov.cancel();
    }
}
