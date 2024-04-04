package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbdc implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult zzeow;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdc(JsPromptResult jsPromptResult) {
        this.zzeow = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzeow.cancel();
    }
}
