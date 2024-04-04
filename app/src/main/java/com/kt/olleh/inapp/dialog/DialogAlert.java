package com.kt.olleh.inapp.dialog;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.text.Html;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kt.olleh.inapp.Purchase;
import com.kt.olleh.inapp.util.UIParser;

/* loaded from: D:\decomp\classes.dex */
public class DialogAlert extends Dialog {
    private int buttonCount;
    private DialogOnClickListener[] buttonOCLs;
    private String[] buttonTexts;
    private Context mContext;
    UIParser mParser;
    private String message;
    private String title;

    public DialogAlert(Context context, int i) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.buttonCount = -1;
        this.title = null;
        this.message = null;
        this.buttonTexts = null;
        this.buttonOCLs = null;
        this.mContext = context;
        this.buttonCount = i;
        if (i > 0) {
            this.buttonTexts = new String[i];
            this.buttonOCLs = new DialogOnClickListener[i];
        }
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
        int i = 0;
        if (this.buttonTexts != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.buttonTexts;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = null;
                i2++;
            }
            this.buttonTexts = null;
        }
        if (this.buttonOCLs == null) {
            return;
        }
        while (true) {
            DialogOnClickListener[] dialogOnClickListenerArr = this.buttonOCLs;
            if (i < dialogOnClickListenerArr.length) {
                dialogOnClickListenerArr[i] = null;
                i++;
            } else {
                this.buttonOCLs = null;
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
        setContentView(showMy("/layout/dialog_alert"));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = 0.7f;
        getWindow().setAttributes(attributes);
        getWindow().addFlags(2);
        LinearLayout linearLayout = (LinearLayout) findViewById(this.mParser.getID("dialog_Title"));
        ((TextView) findViewById(this.mParser.getID("dialogAlertTitleTextView"))).setText(this.title);
        String str = this.title;
        if (str == null || str.equals("")) {
            linearLayout.setVisibility(8);
        }
        TextView textView = (TextView) findViewById(this.mParser.getID("dialog_MessageTextView"));
        String str2 = this.message;
        if (str2 != null && str2 != "") {
            textView.setText(Html.fromHtml(str2));
        }
        if (this.buttonCount > 0) {
            ((LinearLayout) findViewById(this.mParser.getID("Button_Layout"))).setVisibility(0);
            int i = this.buttonCount;
            Button[] buttonArr = new Button[i];
            String[] strArr = {"Button_1", "Button_2", "Button_3"};
            for (int i2 = 0; i2 < i; i2++) {
                buttonArr[i2] = (Button) findViewById(this.mParser.getID(strArr[i2]));
            }
            if (this.buttonTexts != null) {
                for (int i3 = 0; i3 < this.buttonCount; i3++) {
                    buttonArr[i3].setVisibility(0);
                    buttonArr[i3].setText(this.buttonTexts[i3]);
                }
            }
            if (this.buttonOCLs != null) {
                for (int i4 = 0; i4 < this.buttonCount; i4++) {
                    buttonArr[i4].setOnClickListener(this.buttonOCLs[i4]);
                }
            }
        }
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.title = (String) charSequence;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setButton(int i, String str, DialogOnClickListener dialogOnClickListener) {
        setButtonText(i, str);
        setButtonOCL(i, dialogOnClickListener);
    }

    private void setButtonText(int i, String str) {
        String[] strArr = this.buttonTexts;
        if (strArr == null || strArr.length <= i || i < 0) {
            return;
        }
        strArr[i] = str;
    }

    private void setButtonOCL(int i, DialogOnClickListener dialogOnClickListener) {
        DialogOnClickListener[] dialogOnClickListenerArr = this.buttonOCLs;
        if (dialogOnClickListenerArr == null || dialogOnClickListenerArr.length <= i || i < 0) {
            return;
        }
        dialogOnClickListenerArr[i] = dialogOnClickListener;
    }
}
