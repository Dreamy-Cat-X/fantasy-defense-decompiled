package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzdmi;
import com.google.android.gms.internal.ads.zzdvj;
import com.google.android.gms.internal.ads.zzdvz;
import com.google.android.gms.internal.ads.zzwo;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nonnull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbq {
    public static boolean zzdi(int i) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcru)).booleanValue()) {
            return ((Boolean) zzwo.zzqq().zzd(zzabh.zzcrv)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d A[Catch: JSONException -> 0x0151, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0151, blocks: (B:25:0x011c, B:33:0x0144, B:34:0x0148, B:35:0x014d, B:36:0x012b, B:39:0x0135), top: B:24:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0135 A[Catch: JSONException -> 0x0151, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0151, blocks: (B:25:0x011c, B:33:0x0144, B:34:0x0148, B:35:0x014d, B:36:0x012b, B:39:0x0135), top: B:24:0x011c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject zza(Context context, View view) {
        String str;
        char c;
        int hashCode;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view == null) {
            return jSONObject2;
        }
        try {
            int[] zzu = zzu(view);
            int[] iArr = new int[2];
            if (view != null) {
                iArr[0] = view.getMeasuredWidth();
                iArr[1] = view.getMeasuredHeight();
                for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    iArr[0] = Math.min(((ViewGroup) parent).getMeasuredWidth(), iArr[0]);
                    iArr[1] = Math.min(((ViewGroup) parent).getMeasuredHeight(), iArr[1]);
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", zzd(context, view.getMeasuredWidth()));
            jSONObject3.put("height", zzd(context, view.getMeasuredHeight()));
            jSONObject3.put("x", zzd(context, zzu[0]));
            jSONObject3.put("y", zzd(context, zzu[1]));
            jSONObject3.put("maximum_visible_width", zzd(context, iArr[0]));
            jSONObject3.put("maximum_visible_height", zzd(context, iArr[1]));
            jSONObject3.put("relative_to", "window");
            jSONObject2.put("frame", jSONObject3);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                jSONObject = zza(context, rect);
            } else {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("width", 0);
                jSONObject4.put("height", 0);
                jSONObject4.put("x", zzd(context, zzu[0]));
                jSONObject4.put("y", zzd(context, zzu[1]));
                jSONObject4.put("relative_to", "window");
                jSONObject = jSONObject4;
            }
            jSONObject2.put("visible_bounds", jSONObject);
        } catch (Exception unused) {
            zzd.zzex("Unable to get native ad view bounding box");
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcxd)).booleanValue()) {
            ViewParent parent2 = view.getParent();
            try {
                if (parent2 != null) {
                    try {
                        str = (String) parent2.getClass().getMethod("getTemplateTypeName", new Class[0]).invoke(parent2, new Object[0]);
                    } catch (IllegalAccessException e) {
                        e = e;
                        zzd.zzc("Cannot access method getTemplateTypeName: ", e);
                        str = "";
                        c = 65535;
                        hashCode = str.hashCode();
                        if (hashCode != -2066603854) {
                        }
                        if (c == 0) {
                        }
                        return jSONObject2;
                    } catch (NoSuchMethodException unused2) {
                    } catch (SecurityException e2) {
                        e = e2;
                        zzd.zzc("Cannot access method getTemplateTypeName: ", e);
                        str = "";
                        c = 65535;
                        hashCode = str.hashCode();
                        if (hashCode != -2066603854) {
                        }
                        if (c == 0) {
                        }
                        return jSONObject2;
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        zzd.zzc("Cannot access method getTemplateTypeName: ", e);
                        str = "";
                        c = 65535;
                        hashCode = str.hashCode();
                        if (hashCode != -2066603854) {
                        }
                        if (c == 0) {
                        }
                        return jSONObject2;
                    }
                    c = 65535;
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                        if (hashCode == 2019754500 && str.equals("medium_template")) {
                            c = 1;
                        }
                    } else if (str.equals("small_template")) {
                        c = 0;
                    }
                    if (c == 0) {
                        jSONObject2.put("native_template_type", 1);
                    } else if (c == 1) {
                        jSONObject2.put("native_template_type", 2);
                    } else {
                        jSONObject2.put("native_template_type", 0);
                    }
                }
                hashCode = str.hashCode();
                if (hashCode != -2066603854) {
                }
                if (c == 0) {
                }
            } catch (JSONException e4) {
                zzd.zzc("Could not log native template signal to JSON", e4);
            }
            str = "";
            c = 65535;
        }
        return jSONObject2;
    }

    public static JSONObject zzt(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcym)).booleanValue()) {
                com.google.android.gms.ads.internal.zzp.zzkq();
                jSONObject.put("contained_in_scroll_view", zzm.zzs(view));
            } else {
                com.google.android.gms.ads.internal.zzp.zzkq();
                jSONObject.put("contained_in_scroll_view", zzm.zzr(view) != -1);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject zzb(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            com.google.android.gms.ads.internal.zzp.zzkq();
            jSONObject.put("can_show_on_lock_screen", zzm.zzq(view));
            com.google.android.gms.ads.internal.zzp.zzkq();
            jSONObject.put("is_keyguard_locked", zzm.zzau(context));
        } catch (JSONException unused) {
            zzd.zzex("Unable to get lock screen information");
        }
        return jSONObject;
    }

    public static JSONObject zza(Context context, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        String str;
        String str2;
        JSONObject jSONObject;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int[] zzu = zzu(view);
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, WeakReference<View>> next = it.next();
                View view2 = next.getValue().get();
                if (view2 != null) {
                    int[] zzu2 = zzu(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                    try {
                        jSONObject4.put("width", zzd(context, view2.getMeasuredWidth()));
                        jSONObject4.put("height", zzd(context, view2.getMeasuredHeight()));
                        jSONObject4.put("x", zzd(context, zzu2[0] - zzu[0]));
                        jSONObject4.put("y", zzd(context, zzu2[1] - zzu[1]));
                        jSONObject4.put(str4, str3);
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = zza(context, rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", zzd(context, zzu2[0] - zzu[0]));
                            jSONObject.put("y", zzd(context, zzu2[1] - zzu[1]));
                            jSONObject.put(str4, str3);
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            str = str3;
                            str2 = str4;
                            try {
                                jSONObject3.put("font_size", textView.getTextSize());
                                jSONObject3.put("text", textView.getText());
                            } catch (JSONException unused) {
                                zzd.zzex("Unable to get asset views information");
                                it = it2;
                                str3 = str;
                                str4 = str2;
                            }
                        } else {
                            str = str3;
                            str2 = str4;
                        }
                        jSONObject3.put("is_clickable", map2 != null && map2.containsKey(next.getKey()) && view2.isClickable());
                        jSONObject2.put(next.getKey(), jSONObject3);
                    } catch (JSONException unused2) {
                        str = str3;
                        str2 = str4;
                    }
                    it = it2;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject zza(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("click_point", zza(context, point, point2));
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e) {
                e = e;
                jSONObject = jSONObject2;
                zzd.zzc("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private static int[] zzu(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static Point zza(MotionEvent motionEvent, View view) {
        int[] zzu = zzu(view);
        return new Point(((int) motionEvent.getRawX()) - zzu[0], ((int) motionEvent.getRawY()) - zzu[1]);
    }

    private static JSONObject zza(Context context, Point point, Point point2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", zzd(context, point2.x));
            jSONObject.put("y", zzd(context, point2.y));
            jSONObject.put("start_x", zzd(context, point.x));
            jSONObject.put("start_y", zzd(context, point.y));
            return jSONObject;
        } catch (JSONException e) {
            zzd.zzc("Error occurred while putting signals into JSON object.", e);
            return null;
        }
    }

    public static boolean zza(Context context, zzdmi zzdmiVar) {
        if (!zzdmiVar.zzhib) {
            return false;
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyn)).booleanValue()) {
            return ((Boolean) zzwo.zzqq().zzd(zzabh.zzcyq)).booleanValue();
        }
        String str = (String) zzwo.zzqq().zzd(zzabh.zzcyo);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator<String> it = zzdvz.zza(zzdvj.zzb(';')).zza(str).iterator();
            while (it.hasNext()) {
                if (it.next().equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject zzbl(@Nonnull Context context) {
        JSONObject jSONObject = new JSONObject();
        com.google.android.gms.ads.internal.zzp.zzkq();
        DisplayMetrics zza = zzm.zza((WindowManager) context.getSystemService("window"));
        try {
            jSONObject.put("width", zzd(context, zza.widthPixels));
            jSONObject.put("height", zzd(context, zza.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams zzzo() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) zzwo.zzqq().zzd(zzabh.zzcyp)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    private static int zzd(Context context, int i) {
        return zzwo.zzqm().zzd(context, i);
    }

    private static JSONObject zza(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", zzd(context, rect.right - rect.left));
        jSONObject.put("height", zzd(context, rect.bottom - rect.top));
        jSONObject.put("x", zzd(context, rect.left));
        jSONObject.put("y", zzd(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }
}
