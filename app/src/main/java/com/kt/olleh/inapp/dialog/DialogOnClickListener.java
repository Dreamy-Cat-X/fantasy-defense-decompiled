package com.kt.olleh.inapp.dialog;

import android.app.Dialog;
import android.view.View;

/* loaded from: D:\decomp\classes.dex */
public class DialogOnClickListener implements View.OnClickListener {
    private Dialog mDialog;

    public DialogOnClickListener(Dialog dialog) {
        this.mDialog = dialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public Dialog getDialog() {
        return this.mDialog;
    }
}
