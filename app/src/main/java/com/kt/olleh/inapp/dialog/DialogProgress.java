package com.kt.olleh.inapp.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: D:\decomp\classes.dex */
public class DialogProgress {
    private Dialog dialog;

    public DialogProgress(Context context, String str) {
        this.dialog = null;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        textView.setTextColor(-1);
        textView.setTextSize(16.0f);
        textView.setPadding(10, 10, 10, 10);
        textView.setText(str);
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setPadding(10, 10, 10, 10);
        linearLayout.addView(progressBar);
        linearLayout.addView(textView);
        builder.setView(linearLayout);
        AlertDialog create = builder.create();
        this.dialog = create;
        WindowManager.LayoutParams attributes = create.getWindow().getAttributes();
        attributes.dimAmount = 0.7f;
        this.dialog.getWindow().setAttributes(attributes);
        this.dialog.getWindow().addFlags(2);
    }

    public void setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        this.dialog.setOnKeyListener(onKeyListener);
    }

    public void show() {
        this.dialog.show();
    }

    public void dismiss() {
        this.dialog.dismiss();
    }
}
