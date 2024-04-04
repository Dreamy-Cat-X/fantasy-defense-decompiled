package com.kt.olleh.inapp.util;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kt.olleh.inapp.Config.Config;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Stack;
import junit.framework.Assert;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: D:\decomp\classes.dex */
public class UIParser {
    private static final String TAG = "UIParser";
    private Context mContext;
    private Hashtable<String, Integer> mHash = new Hashtable<>();
    private Stack mLayoutStack = new Stack();
    private int mIndex = 0;

    public UIParser(Context context) {
        this.mContext = context;
    }

    public void clear() {
        Hashtable<String, Integer> hashtable = this.mHash;
        if (hashtable != null) {
            hashtable.clear();
            this.mHash = null;
        }
        this.mContext = null;
    }

    public int getID(String str) {
        Hashtable<String, Integer> hashtable = this.mHash;
        if (hashtable == null) {
            return -1;
        }
        return hashtable.get(str).intValue();
    }

    public void setID(View view, String str) {
        String[] split = str.split("/");
        if (split.length <= 0) {
            return;
        }
        view.setId(this.mIndex);
        this.mHash.put(split[1], new Integer(this.mIndex));
        this.mIndex++;
    }

    public View Start(String str) {
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(getClass().getResourceAsStream(str), "utf-8");
            return inflate(newPullParser);
        } catch (IOException e) {
            Config.LogD(TAG, e.toString(), e);
            return null;
        } catch (XmlPullParserException e2) {
            Config.LogD(TAG, e2.toString(), e2);
            return null;
        }
    }

    private View inflate(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.mLayoutStack.clear();
        this.mHash.clear();
        this.mIndex = 0;
        Stack stack = new Stack();
        int eventType = xmlPullParser.getEventType();
        View view = null;
        while (eventType != 1) {
            if (eventType == 0) {
                stack.clear();
            } else if (eventType == 2) {
                stack.push(new StringBuffer());
                View createView = createView(xmlPullParser);
                if (createView != null) {
                    if (view == null) {
                        view = createView;
                    } else {
                        ((ViewGroup) this.mLayoutStack.peek()).addView(createView);
                    }
                    if (createView instanceof ViewGroup) {
                        this.mLayoutStack.push((ViewGroup) createView);
                    }
                }
            } else if (eventType == 3) {
                stack.pop();
                if (isLayout(xmlPullParser.getName())) {
                    this.mLayoutStack.pop();
                }
            } else if (eventType == 4) {
                ((StringBuffer) stack.peek()).append(xmlPullParser.getText());
            }
            eventType = xmlPullParser.next();
        }
        return view;
    }

    private boolean isLayout(String str) {
        return str.endsWith("Layout");
    }

    private View createView(XmlPullParser xmlPullParser) {
        View view;
        String name = xmlPullParser.getName();
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        if (name.equals("LinearLayout")) {
            view = new LinearLayout(this.mContext);
        } else if (name.equals("TextView")) {
            view = new TextView(this.mContext);
        } else if (name.equals("ImageView")) {
            view = new ImageView(this.mContext);
        } else if (name.equals("Button")) {
            view = new Button(this.mContext);
        } else if (name.equals("EditText")) {
            view = new EditText(this.mContext);
        } else {
            Assert.fail("Unhandled tag:" + name);
            view = null;
        }
        if (view == null) {
            return null;
        }
        String findAttribute = findAttribute(asAttributeSet, "android:id");
        if (findAttribute != null) {
            setID(view, findAttribute);
        }
        String findAttribute2 = findAttribute(asAttributeSet, "android:background");
        if (findAttribute2 != null) {
            if (findAttribute2.startsWith("#")) {
                view.setBackgroundColor(Color.parseColor(findAttribute2));
            } else if (view instanceof EditText) {
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{R.attr.state_pressed}, Drawable.createFromStream(getClass().getResourceAsStream("/drawable-hdpi/a_inputbox_p.png"), "a_inputbox_p"));
                stateListDrawable.addState(new int[]{R.attr.state_focused}, Drawable.createFromStream(getClass().getResourceAsStream("/drawable-hdpi/a_inputbox_f.png"), "a_inputbox_f"));
                stateListDrawable.addState(new int[0], Drawable.createFromStream(getClass().getResourceAsStream("/drawable-hdpi/a_inputbox_n.png"), "a_inputbox_n"));
                ((EditText) view).setBackgroundDrawable(stateListDrawable);
            } else if (view instanceof Button) {
                StateListDrawable stateListDrawable2 = new StateListDrawable();
                stateListDrawable2.addState(new int[]{R.attr.state_pressed}, Drawable.createFromStream(getClass().getResourceAsStream("/drawable-hdpi/popup_btn_sel.png"), "popup_btn_sel"));
                stateListDrawable2.addState(new int[0], Drawable.createFromStream(getClass().getResourceAsStream("/drawable-hdpi/popup_btn.png"), "popup_btn"));
                ((Button) view).setBackgroundDrawable(stateListDrawable2);
            } else {
                view.setBackgroundDrawable(Drawable.createFromStream(openFile(findAttribute2), findAttribute2));
            }
        }
        String findAttribute3 = findAttribute(asAttributeSet, "android:visibility");
        if (findAttribute3 != null) {
            if (findAttribute3.equals("gone")) {
                view.setVisibility(8);
            } else if (findAttribute3.equals("visible")) {
                view.setVisibility(0);
            } else if (findAttribute3.equals("invisible")) {
                view.setVisibility(4);
            }
        }
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            String findAttribute4 = findAttribute(asAttributeSet, "android:orientation");
            if (findAttribute4 != null) {
                if (findAttribute4.equals("horizontal")) {
                    linearLayout.setOrientation(0);
                } else if (findAttribute4.equals("vertical")) {
                    linearLayout.setOrientation(1);
                }
            }
            String findAttribute5 = findAttribute(asAttributeSet, "android:gravity");
            if (findAttribute5 != null) {
                if (findAttribute5.equals("center")) {
                    linearLayout.setGravity(17);
                } else {
                    linearLayout.setGravity(5);
                }
            }
        } else if (view instanceof EditText) {
            EditText editText = (EditText) view;
            String findAttribute6 = findAttribute(asAttributeSet, "android:text");
            String findAttribute7 = findAttribute(asAttributeSet, "android:textSize");
            String findAttribute8 = findAttribute(asAttributeSet, "android:textColor");
            String findAttribute9 = findAttribute(asAttributeSet, "android:gravity");
            if (findAttribute6 != null) {
                editText.setText(findAttribute6.replace("\\n", "\n"));
            }
            if (findAttribute7 != null) {
                editText.setTextSize(readSize(findAttribute7));
            }
            if (findAttribute8 != null) {
                editText.setTextColor(Color.parseColor(findAttribute8));
            }
            if (findAttribute9 != null) {
                setGravity(editText, findAttribute9);
            } else {
                editText.setGravity(19);
            }
            setPadding(editText, asAttributeSet);
            String findAttribute10 = findAttribute(asAttributeSet, "android:maxLines");
            if (findAttribute10 != null) {
                editText.setMaxLines(readInt(findAttribute10));
            }
            String findAttribute11 = findAttribute(asAttributeSet, "android:singleLine");
            if (findAttribute11 != null && findAttribute11.equals("true")) {
                editText.setSingleLine(true);
            }
            String findAttribute12 = findAttribute(asAttributeSet, "android:imeOptions");
            if (findAttribute12 != null) {
                if (findAttribute12.equals("actionNext")) {
                    editText.setImeOptions(5);
                } else {
                    editText.setImeOptions(6);
                }
            }
            if (findAttribute(asAttributeSet, "android:inputType") != null) {
                editText.setInputType(129);
            }
        } else if (view instanceof TextView) {
            TextView textView = (TextView) view;
            String findAttribute13 = findAttribute(asAttributeSet, "android:text");
            String findAttribute14 = findAttribute(asAttributeSet, "android:textSize");
            String findAttribute15 = findAttribute(asAttributeSet, "android:textColor");
            String findAttribute16 = findAttribute(asAttributeSet, "android:gravity");
            String findAttribute17 = findAttribute(asAttributeSet, "android:ellipsize");
            String findAttribute18 = findAttribute(asAttributeSet, "android:singleLine");
            if (findAttribute13 != null) {
                textView.setText(findAttribute13.replace("\\n", "\n"));
            }
            if (findAttribute18 != null) {
                if (findAttribute18.equals("true")) {
                    textView.setSingleLine(true);
                } else {
                    textView.setSingleLine(false);
                }
            }
            if (findAttribute17 != null) {
                if (findAttribute17.equals("end")) {
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                } else if (findAttribute17.equals("marque")) {
                    textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                }
            }
            if (findAttribute14 != null) {
                textView.setTextSize(readSize(findAttribute14));
            }
            if (findAttribute15 != null) {
                if (findAttribute15.startsWith("#")) {
                    textView.setTextColor(Color.parseColor(findAttribute15));
                } else {
                    ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[1]}, new int[]{Color.parseColor("#FFFFFF"), Color.parseColor("#171717")});
                    textView.setClickable(true);
                    textView.setTextColor(colorStateList);
                    StateListDrawable stateListDrawable3 = new StateListDrawable();
                    stateListDrawable3.addState(new int[]{R.attr.state_pressed}, Drawable.createFromStream(getClass().getResourceAsStream("/drawable-hdpi/e_popup_list_p.png"), "e_popup_list_bg"));
                    stateListDrawable3.addState(new int[0], Drawable.createFromStream(getClass().getResourceAsStream("/drawable-hdpi/e_popup_list_bg.png"), "e_popup_list_bg"));
                    textView.setBackgroundDrawable(stateListDrawable3);
                }
            }
            if (findAttribute16 != null) {
                textView.setGravity(17);
            } else {
                textView.setGravity(19);
            }
            textView.setLineSpacing(0.0f, 1.15f);
        } else if (view instanceof Button) {
            Button button = (Button) view;
            String findAttribute19 = findAttribute(asAttributeSet, "android:gravity");
            if (findAttribute19 != null) {
                if (findAttribute19.equals("center")) {
                    button.setGravity(17);
                } else {
                    button.setGravity(5);
                }
            }
            if (findAttribute(asAttributeSet, "android:textSize") != null) {
                button.setTextSize(readSize(r4));
            }
            String findAttribute20 = findAttribute(asAttributeSet, "android:textColor");
            if (findAttribute20 != null) {
                button.setTextColor(Color.parseColor(findAttribute20));
            }
        }
        if (this.mLayoutStack.size() > 0) {
            setPadding(view, asAttributeSet);
            view.setLayoutParams(loadLayoutParams(asAttributeSet, (ViewGroup) this.mLayoutStack.peek()));
        }
        return view;
    }

    private int setGravity(View view, String str) {
        String[] split;
        if (str == null || (split = str.split("|")) == null) {
            return 17;
        }
        int i = 0;
        for (int i2 = 0; i2 < split.length; i2++) {
            if (split[i2].equalsIgnoreCase("top")) {
                i |= 48;
            } else if (split[i2].equalsIgnoreCase("bottom")) {
                i |= 80;
            } else if (split[i2].equalsIgnoreCase("left")) {
                i |= 3;
            } else if (split[i2].equalsIgnoreCase("right")) {
                i |= 5;
            } else if (split[i2].equalsIgnoreCase("center_vertical")) {
                i |= 16;
            } else if (split[i2].equalsIgnoreCase("fill_vertical")) {
                i |= 112;
            } else if (split[i2].equalsIgnoreCase("center_horizontal")) {
                i |= 1;
            } else if (split[i2].equalsIgnoreCase("fill_horizontal")) {
                i |= 7;
            } else if (split[i2].equalsIgnoreCase("center")) {
                i |= 17;
            } else if (split[i2].equalsIgnoreCase("fill")) {
                i |= 119;
            } else if (split[i2].equalsIgnoreCase("clip_vertical")) {
                i |= 128;
            } else if (split[i2].equalsIgnoreCase("clip_horizontal")) {
                i |= 8;
            }
        }
        return i;
    }

    private void setPadding(View view, AttributeSet attributeSet) {
        int i;
        int i2;
        int i3;
        String findAttribute = findAttribute(attributeSet, "android:padding");
        int i4 = 0;
        if (findAttribute != null) {
            i4 = readDPSize(findAttribute);
            i = i4;
            i2 = i;
            i3 = i2;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        String findAttribute2 = findAttribute(attributeSet, "android:paddingTop");
        if (findAttribute2 != null) {
            i2 = readDPSize(findAttribute2);
        }
        String findAttribute3 = findAttribute(attributeSet, "android:paddingBottom");
        if (findAttribute3 != null) {
            i3 = readDPSize(findAttribute3);
        }
        String findAttribute4 = findAttribute(attributeSet, "android:paddingLeft");
        if (findAttribute4 != null) {
            i4 = readDPSize(findAttribute4);
        }
        String findAttribute5 = findAttribute(attributeSet, "android:paddingRight");
        if (findAttribute5 != null) {
            i = readDPSize(findAttribute5);
        }
        view.setPadding(i4, i2, i, i3);
    }

    private String findAttribute(AttributeSet attributeSet, String str) {
        for (int i = 0; i < attributeSet.getAttributeCount(); i++) {
            if (attributeSet.getAttributeName(i).equals(str)) {
                return attributeSet.getAttributeValue(i);
            }
        }
        int indexOf = str.indexOf(":");
        if (indexOf != -1) {
            return attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", str.substring(indexOf + 1));
        }
        return null;
    }

    private ViewGroup.LayoutParams loadLayoutParams(AttributeSet attributeSet, ViewGroup viewGroup) {
        LinearLayout.LayoutParams layoutParams = viewGroup instanceof LinearLayout ? new LinearLayout.LayoutParams(readSize(findAttribute(attributeSet, "android:layout_width")), readSize(findAttribute(attributeSet, "android:layout_height"))) : null;
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            layoutParams = layoutParams;
            String findAttribute = findAttribute(attributeSet, "android:layout_gravity");
            if (findAttribute != null) {
                if (findAttribute.equals("center")) {
                    layoutParams.gravity = 17;
                } else {
                    layoutParams.gravity = 5;
                }
            }
            String findAttribute2 = findAttribute(attributeSet, "android:layout_weight");
            if (findAttribute2 != null) {
                layoutParams.weight = Float.parseFloat(findAttribute2);
            }
            String findAttribute3 = findAttribute(attributeSet, "android:layout_marginTop");
            String findAttribute4 = findAttribute(attributeSet, "android:layout_marginLeft");
            String findAttribute5 = findAttribute(attributeSet, "android:layout_marginRight");
            String findAttribute6 = findAttribute(attributeSet, "android:layout_marginBottom");
            if (findAttribute3 != null) {
                layoutParams.topMargin = readDPSize(findAttribute3);
            }
            if (findAttribute4 != null) {
                layoutParams.leftMargin = readDPSize(findAttribute4);
            }
            if (findAttribute5 != null) {
                layoutParams.rightMargin = readDPSize(findAttribute5);
            }
            if (findAttribute6 != null) {
                layoutParams.bottomMargin = readDPSize(findAttribute6);
            }
        }
        return layoutParams;
    }

    private int readSize(String str) {
        if ("wrap_content".equals(str)) {
            return -2;
        }
        if ("fill_parent".equals(str)) {
            return -1;
        }
        if (str != null) {
            try {
                if (str.length() > 3 && str.endsWith("dip")) {
                    return dipToInt(Float.parseFloat(str.substring(0, str.length() - 3)));
                }
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
        if (str != null && str.length() > 2 && str.endsWith("pt")) {
            double parseFloat = Float.parseFloat(str.substring(0, str.length() - 2));
            Double.isNaN(parseFloat);
            return (int) (((float) (parseFloat / 1.5d)) * 1.0f);
        }
        return Integer.parseInt(str);
    }

    private int readFontSize(String str) {
        try {
            Double.isNaN(Float.parseFloat(str.substring(0, str.length() - 3)));
            return (int) (r0 / 1.5d);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private int readDPSize(String str) {
        if (str != null) {
            try {
                if (str.length() > 3 && str.endsWith("dip")) {
                    return dipToInt(Float.parseFloat(str.substring(0, str.length() - 3)));
                }
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
        return Integer.parseInt(str);
    }

    private int dipToInt(float f) {
        if (f == 0.0f) {
            return 0;
        }
        return (int) TypedValue.applyDimension(1, f, this.mContext.getResources().getDisplayMetrics());
    }

    private int readInt(String str) {
        if (str != null) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                Config.LogD(TAG, e.toString(), e);
            }
        }
        return 0;
    }

    private String findPath(String str, boolean z) {
        String[] split;
        if (str == null) {
            return null;
        }
        if (!str.startsWith("@drawable/") || (split = str.split("/")) == null || split.length <= 1) {
            return str;
        }
        if (z) {
            return "/drawable-hdpi/" + split[1] + ".9.png";
        }
        return "/drawable-hdpi/" + split[1] + ".png";
    }

    private String findPath(String str) {
        return findPath(str, false);
    }

    private InputStream openFile(String str) {
        InputStream resourceAsStream = getClass().getResourceAsStream(findPath(str));
        return resourceAsStream == null ? getClass().getResourceAsStream(findPath(str, true)) : resourceAsStream;
    }
}
