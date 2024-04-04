package com.kt.olleh.inapp.dialog;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import com.kt.olleh.inapp.Purchase;
import com.kt.olleh.inapp.util.UIParser;

/* loaded from: D:\decomp\classes.dex */
public class DialogLogin extends Dialog {
    private Context mContext;
    private DialogOnClickListener[] mListener;
    UIParser mParser;

    public DialogLogin(Context context) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.mListener = null;
        this.mContext = context;
        this.mListener = new DialogOnClickListener[2];
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
        if (this.mListener == null) {
            return;
        }
        int i = 0;
        while (true) {
            DialogOnClickListener[] dialogOnClickListenerArr = this.mListener;
            if (i < dialogOnClickListenerArr.length) {
                dialogOnClickListenerArr[i] = null;
                i++;
            } else {
                this.mListener = null;
                return;
            }
        }
    }

    private View showMy(String str) {
        UIParser uIParser = new UIParser(this.mContext);
        this.mParser = uIParser;
        return uIParser.Start(str);
    }

    private void create() {
        setContentView(showMy("/layout/dialog_login.xml"));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = 0.7f;
        getWindow().setAttributes(attributes);
        getWindow().addFlags(2);
        ((EditText) findViewById(this.mParser.getID("login_id"))).setText("");
        ((EditText) findViewById(this.mParser.getID("login_password"))).setTag("");
        Button[] buttonArr = new Button[2];
        String[] strArr = new String[3];
        int i = 0;
        strArr[0] = "Button_1";
        strArr[1] = "Button_2";
        for (int i2 = 0; i2 < 2; i2++) {
            buttonArr[i2] = (Button) findViewById(this.mParser.getID(strArr[i2]));
        }
        if (this.mListener == null) {
            return;
        }
        while (true) {
            DialogOnClickListener[] dialogOnClickListenerArr = this.mListener;
            if (i >= dialogOnClickListenerArr.length) {
                return;
            }
            buttonArr[i].setOnClickListener(dialogOnClickListenerArr[i]);
            i++;
        }
    }

    public void setButton(int i, DialogOnClickListener dialogOnClickListener) {
        DialogOnClickListener[] dialogOnClickListenerArr = this.mListener;
        if (dialogOnClickListenerArr == null || dialogOnClickListenerArr.length <= i || i < 0) {
            return;
        }
        dialogOnClickListenerArr[i] = dialogOnClickListener;
    }

    public String getID() {
        return ((EditText) findViewById(this.mParser.getID("login_id"))).getText().toString();
    }

    public String getPassword() {
        return ((EditText) findViewById(this.mParser.getID("login_id"))).getText().toString();
    }
}
