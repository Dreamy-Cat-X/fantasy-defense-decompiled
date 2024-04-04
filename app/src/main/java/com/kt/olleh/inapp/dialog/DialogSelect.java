package com.kt.olleh.inapp.dialog;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.kt.olleh.inapp.Purchase;
import com.kt.olleh.inapp.net.InAppError;
import com.kt.olleh.inapp.util.UIParser;

/* loaded from: D:\decomp\classes.dex */
public class DialogSelect extends Dialog {
    private Context mContext;
    private DialogOnClickListener mItemListener;
    private DialogOnClickListener mListener;
    UIParser mParser;

    public DialogSelect(Context context) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.mListener = null;
        this.mItemListener = null;
        this.mContext = context;
        this.mListener = null;
        this.mItemListener = null;
    }

    @Override // android.app.Dialog
    public void show() {
        create();
        super.show();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        unBind();
        Purchase.Dialog_Mode = -1;
        super.dismiss();
    }

    public void unBind() {
        if (this.mListener != null) {
            this.mListener = null;
        }
        UIParser uIParser = this.mParser;
        if (uIParser != null) {
            uIParser.clear();
            this.mParser = null;
        }
        this.mItemListener = null;
    }

    private View showMy(String str) {
        UIParser uIParser = new UIParser(this.mContext);
        this.mParser = uIParser;
        return uIParser.Start(str);
    }

    private void create() {
        setContentView(showMy("/layout/dialog_select.xml"));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = 0.7f;
        getWindow().setAttributes(attributes);
        getWindow().addFlags(2);
        TextView textView = (TextView) findViewById(this.mParser.getID("btn_select_1"));
        textView.setClickable(true);
        textView.setTag(InAppError.FAILED);
        textView.setOnClickListener(this.mItemListener);
        TextView textView2 = (TextView) findViewById(this.mParser.getID("btn_select_2"));
        textView2.setClickable(true);
        textView2.setTag("2");
        textView2.setOnClickListener(this.mItemListener);
        ((Button) findViewById(this.mParser.getID("btn_ok"))).setOnClickListener(this.mListener);
    }

    public void setOnCancelListener(DialogOnClickListener dialogOnClickListener) {
        this.mListener = dialogOnClickListener;
    }

    public void setOnItemClickListener(DialogOnClickListener dialogOnClickListener) {
        this.mItemListener = dialogOnClickListener;
    }
}
