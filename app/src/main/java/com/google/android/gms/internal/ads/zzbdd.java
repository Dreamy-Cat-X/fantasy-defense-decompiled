package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbdd implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsPromptResult zzeow;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdd(JsPromptResult jsPromptResult) {
        this.zzeow = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zzeow.cancel();
    }
}
