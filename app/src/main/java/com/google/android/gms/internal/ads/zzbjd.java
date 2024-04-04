package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbjd implements zzalr<zzbjh> {
    private final Context context;
    private final PowerManager zzaag;
    private final zzqs zzfqm;

    public zzbjd(Context context, zzqs zzqsVar) {
        this.context = context;
        this.zzfqm = zzqsVar;
        this.zzaag = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzalr
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzi(zzbjh zzbjhVar) throws JSONException {
        boolean isScreenOn;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        if (zzbjhVar.zzfre == null) {
            jSONObject = new JSONObject();
        } else {
            zzqw zzqwVar = zzbjhVar.zzfre;
            if (this.zzfqm.zzlw() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = zzqwVar.zzbrl;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.zzfqm.zzlv()).put("activeViewJSON", this.zzfqm.zzlw()).put("timestamp", zzbjhVar.timestamp).put("adFormat", this.zzfqm.zzlu()).put("hashCode", this.zzfqm.getUniqueId()).put("isMraid", false).put("isStopped", false).put("isPaused", zzbjhVar.zzfrb).put("isNative", this.zzfqm.isNative());
            if (Build.VERSION.SDK_INT >= 20) {
                isScreenOn = this.zzaag.isInteractive();
            } else {
                isScreenOn = this.zzaag.isScreenOn();
            }
            put.put("isScreenOn", isScreenOn).put("appMuted", com.google.android.gms.ads.internal.zzp.zzkv().zzra()).put("appVolume", com.google.android.gms.ads.internal.zzp.zzkv().zzqz()).put("deviceVolume", com.google.android.gms.ads.internal.util.zzad.zzbh(this.context.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.context.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzqwVar.zzaan).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzqwVar.zzbrm.top).put("bottom", zzqwVar.zzbrm.bottom).put("left", zzqwVar.zzbrm.left).put("right", zzqwVar.zzbrm.right)).put("adBox", new JSONObject().put("top", zzqwVar.zzbrn.top).put("bottom", zzqwVar.zzbrn.bottom).put("left", zzqwVar.zzbrn.left).put("right", zzqwVar.zzbrn.right)).put("globalVisibleBox", new JSONObject().put("top", zzqwVar.zzbro.top).put("bottom", zzqwVar.zzbro.bottom).put("left", zzqwVar.zzbro.left).put("right", zzqwVar.zzbro.right)).put("globalVisibleBoxVisible", zzqwVar.zzbrp).put("localVisibleBox", new JSONObject().put("top", zzqwVar.zzbrq.top).put("bottom", zzqwVar.zzbrq.bottom).put("left", zzqwVar.zzbrq.left).put("right", zzqwVar.zzbrq.right)).put("localVisibleBoxVisible", zzqwVar.zzbrr).put("hitBox", new JSONObject().put("top", zzqwVar.zzbrs.top).put("bottom", zzqwVar.zzbrs.bottom).put("left", zzqwVar.zzbrs.left).put("right", zzqwVar.zzbrs.right)).put("screenDensity", this.context.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzbjhVar.zzbqz);
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqc)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                if (zzqwVar.zzbru != null) {
                    for (Rect rect2 : zzqwVar.zzbru) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzbjhVar.zzfrd)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
