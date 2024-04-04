package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbcy implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsResult zzeov;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcy(JsResult jsResult) {
        this.zzeov = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zzeov.cancel();
    }
}
