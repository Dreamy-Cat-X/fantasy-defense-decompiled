package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbdf implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult zzeow;
    private final /* synthetic */ EditText zzeoy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdf(JsPromptResult jsPromptResult, EditText editText) {
        this.zzeow = jsPromptResult;
        this.zzeoy = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzeow.confirm(this.zzeoy.getText().toString());
    }
}
