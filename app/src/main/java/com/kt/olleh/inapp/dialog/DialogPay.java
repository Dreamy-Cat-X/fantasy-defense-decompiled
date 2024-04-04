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
public class DialogPay extends Dialog {
    private int buttonCount;
    private DialogOnClickListener[] buttonOCLs;
    private String[] buttonTexts;
    private boolean isBgChange;
    private boolean isPayInformation;
    private boolean isPayMessage;
    private boolean isPayNameTitle;
    private Context mContext;
    UIParser mParser;
    private String mXML;
    private String message;
    private String payMoney;
    private String payName1;
    private String payName2;
    private String payType;
    private String title;

    public DialogPay(Context context, int i, String str) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.buttonCount = -1;
        this.title = null;
        this.message = null;
        this.buttonTexts = null;
        this.buttonOCLs = null;
        this.isPayNameTitle = false;
        this.payName1 = null;
        this.payName2 = null;
        this.payMoney = null;
        this.payType = null;
        this.isPayInformation = false;
        this.isPayMessage = false;
        this.isBgChange = false;
        this.mContext = context;
        this.buttonCount = i;
        this.mXML = str;
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
        setContentView(showMy("/layout/dialog_pay.xml"));
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
        if (this.isPayMessage) {
            TextView textView2 = (TextView) findViewById(this.mParser.getID("dialog_PayNameTitle"));
            if (!this.isPayNameTitle) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            TextView textView3 = (TextView) findViewById(this.mParser.getID("dialog_PayName1"));
            String str3 = this.payName1;
            if (str3 != null) {
                textView3.setText(str3);
            } else {
                textView3.setVisibility(8);
            }
            TextView textView4 = (TextView) findViewById(this.mParser.getID("dialog_PayName2"));
            String str4 = this.payName2;
            if (str4 != null) {
                textView4.setText(str4);
            } else {
                textView4.setVisibility(8);
            }
            TextView textView5 = (TextView) findViewById(this.mParser.getID("dialog_PayMoney"));
            String str5 = this.payMoney;
            if (str5 != null) {
                textView5.setText(str5);
            } else {
                textView5.setVisibility(8);
            }
            TextView textView6 = (TextView) findViewById(this.mParser.getID("dialog_PayType"));
            String str6 = this.payType;
            if (str6 != null) {
                textView6.setText(str6);
            } else {
                textView6.setVisibility(8);
            }
            LinearLayout linearLayout2 = (LinearLayout) findViewById(this.mParser.getID("dialog_PayMessage"));
            linearLayout2.setVisibility(0);
            if (this.isBgChange) {
                linearLayout2.setBackgroundResource(R.color.transparent);
            } else {
                linearLayout2.setBackgroundResource(R.color.white);
            }
        } else {
            ((LinearLayout) findViewById(this.mParser.getID("dialog_PayMessage"))).setVisibility(8);
        }
        if (this.isPayInformation) {
            ((LinearLayout) findViewById(this.mParser.getID("dialog_PayInformation"))).setVisibility(0);
        } else {
            ((LinearLayout) findViewById(this.mParser.getID("dialog_PayInformation"))).setVisibility(8);
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

    public void setPayNameMessage(int i, String str) {
        if (i == 1) {
            this.payName1 = str;
        } else {
            if (i != 2) {
                return;
            }
            this.payName2 = str;
        }
    }

    public void setPayMoneyMessage(String str) {
        this.payMoney = str;
    }

    public void setPayTypeMessage(String str) {
        this.payType = str;
    }

    public void setPayNameTitle(boolean z) {
        this.isPayNameTitle = z;
    }

    public void setPayInformation(boolean z) {
        this.isPayInformation = z;
    }

    public void setPayMessage(boolean z) {
        this.isPayMessage = z;
    }

    public void setBgColor(boolean z) {
        this.isBgChange = z;
    }
}
