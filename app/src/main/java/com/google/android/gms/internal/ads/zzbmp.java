package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbmp extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private final Context context;
    private View zzaaq;

    public static zzbmp zza(Context context, View view, zzdmi zzdmiVar) {
        zzbmp zzbmpVar = new zzbmp(context);
        zzbmpVar.zzaaq = view;
        zzbmpVar.addView(view);
        com.google.android.gms.ads.internal.zzp.zzln();
        zzazk.zza((View) zzbmpVar, (ViewTreeObserver.OnScrollChangedListener) zzbmpVar);
        com.google.android.gms.ads.internal.zzp.zzln();
        zzazk.zza((View) zzbmpVar, (ViewTreeObserver.OnGlobalLayoutListener) zzbmpVar);
        JSONObject jSONObject = zzdmiVar.zzhil;
        if (jSONObject != null) {
            RelativeLayout relativeLayout = new RelativeLayout(zzbmpVar.context);
            JSONObject optJSONObject = jSONObject.optJSONObject("header");
            if (optJSONObject != null) {
                zzbmpVar.zza(optJSONObject, relativeLayout, 10);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
            if (optJSONObject2 != null) {
                zzbmpVar.zza(optJSONObject2, relativeLayout, 12);
            }
            zzbmpVar.addView(relativeLayout);
        }
        return zzbmpVar;
    }

    private zzbmp(Context context) {
        super(context);
        this.context = context;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.zzaaq.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.zzaaq.setY(-r0[1]);
    }

    private final void zza(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzb, 0, zzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    private final int zzb(double d) {
        zzwo.zzqm();
        return zzayd.zze(this.context, (int) d);
    }
}
