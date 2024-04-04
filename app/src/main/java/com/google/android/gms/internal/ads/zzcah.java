package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzcah implements zzcbq {
    private final Context context;
    private final zzayt zzbpd;
    private final Clock zzbpw;
    private final zzef zzequ;
    private final zzdmi zzeqz;
    private final zzdsh zzfpv;
    private final zzcbt zzfsx;
    private final zzdmx zzfve;
    private final JSONObject zzgam;
    private final zzcfp zzgan;
    private final zzcbi zzgao;
    private final zzbri zzgap;
    private final zzbqq zzgaq;
    private final zzbjf zzgar;
    private final zzccl zzgas;
    private final zzbxe zzgat;
    private boolean zzgav;
    private zzyf zzgbc;
    private boolean zzgau = false;
    private boolean zzgaw = false;
    private boolean zzgax = false;
    private Point zzgay = new Point();
    private Point zzgaz = new Point();
    private long zzgba = 0;
    private long zzgbb = 0;

    public zzcah(Context context, zzcbt zzcbtVar, JSONObject jSONObject, zzcfp zzcfpVar, zzcbi zzcbiVar, zzef zzefVar, zzbri zzbriVar, zzbqq zzbqqVar, zzdmi zzdmiVar, zzayt zzaytVar, zzdmx zzdmxVar, zzbjf zzbjfVar, zzccl zzcclVar, Clock clock, zzbxe zzbxeVar, zzdsh zzdshVar) {
        this.context = context;
        this.zzfsx = zzcbtVar;
        this.zzgam = jSONObject;
        this.zzgan = zzcfpVar;
        this.zzgao = zzcbiVar;
        this.zzequ = zzefVar;
        this.zzgap = zzbriVar;
        this.zzgaq = zzbqqVar;
        this.zzeqz = zzdmiVar;
        this.zzbpd = zzaytVar;
        this.zzfve = zzdmxVar;
        this.zzgar = zzbjfVar;
        this.zzgas = zzcclVar;
        this.zzbpw = clock;
        this.zzgat = zzbxeVar;
        this.zzfpv = zzdshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzgay = new Point();
        this.zzgaz = new Point();
        if (!this.zzgav) {
            this.zzgat.zzv(view);
            this.zzgav = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzgar.zzn(this);
        boolean zzdi = com.google.android.gms.ads.internal.util.zzbq.zzdi(this.zzbpd.zzegf);
        if (map != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = it.next().getValue().get();
                if (view2 != null) {
                    if (zzdi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = it2.next().getValue().get();
                if (view3 != null) {
                    if (zzdi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zza(View view, Map<String, WeakReference<View>> map) {
        this.zzgay = new Point();
        this.zzgaz = new Point();
        this.zzgat.zzw(view);
        this.zzgav = false;
    }

    private final boolean zzfv(String str) {
        JSONObject optJSONObject = this.zzgam.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zza(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        JSONObject zza = com.google.android.gms.ads.internal.util.zzbq.zza(this.context, map, map2, view2);
        JSONObject zza2 = com.google.android.gms.ads.internal.util.zzbq.zza(this.context, view2);
        JSONObject zzt = com.google.android.gms.ads.internal.util.zzbq.zzt(view2);
        JSONObject zzb = com.google.android.gms.ads.internal.util.zzbq.zzb(this.context, view2);
        String zzb2 = zzb(view, map);
        zza(((Boolean) zzwo.zzqq().zzd(zzabh.zzcrx)).booleanValue() ? view2 : view, zza2, zza, zzt, zzb, zzb2, com.google.android.gms.ads.internal.util.zzbq.zza(zzb2, this.context, this.zzgaz, this.zzgay), null, z, false);
    }

    private final String zzb(View view, Map<String, WeakReference<View>> map) {
        if (map != null && view != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                if (view.equals(entry.getValue().get())) {
                    return entry.getKey();
                }
            }
        }
        int zzans = this.zzgao.zzans();
        if (zzans == 1) {
            return "1099";
        }
        if (zzans == 2) {
            return "2099";
        }
        if (zzans != 6) {
            return null;
        }
        return "3099";
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzfw(String str) {
        zza(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzf(Bundle bundle) {
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.zzd.zzdy("Click data is null. No click is reported.");
        } else if (!zzfv("click_reporting")) {
            com.google.android.gms.ads.internal.util.zzd.zzev("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zza(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.zzp.zzkq().zza(bundle, (JSONObject) null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.zzgax) {
            com.google.android.gms.ads.internal.util.zzd.zzdy("Custom click reporting failed. enableCustomClickGesture is not set.");
            return;
        }
        if (!zzang()) {
            com.google.android.gms.ads.internal.util.zzd.zzdy("Custom click reporting failed. Ad unit id not in the allow list.");
            return;
        }
        JSONObject zza = com.google.android.gms.ads.internal.util.zzbq.zza(this.context, map, map2, view);
        JSONObject zza2 = com.google.android.gms.ads.internal.util.zzbq.zza(this.context, view);
        JSONObject zzt = com.google.android.gms.ads.internal.util.zzbq.zzt(view);
        JSONObject zzb = com.google.android.gms.ads.internal.util.zzbq.zzb(this.context, view);
        String zzb2 = zzb(null, map);
        zza(view, zza2, zza, zzt, zzb, zzb2, com.google.android.gms.ads.internal.util.zzbq.zza(zzb2, this.context, this.zzgaz, this.zzgay), null, z, true);
    }

    private final boolean zzang() {
        return this.zzgam.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zztw() {
        this.zzgax = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final boolean isCustomClickGestureEnabled() {
        return zzang();
    }

    private final void zza(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        Preconditions.checkMainThread("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzgam);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.zzfsx.zzgb(this.zzgao.getCustomTemplateId()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zzgao.zzans());
            jSONObject8.put("view_aware_api_used", z);
            jSONObject8.put("custom_mute_requested", this.zzfve.zzdmv != null && this.zzfve.zzdmv.zzbnu);
            jSONObject8.put("custom_mute_enabled", (this.zzgao.getMuteThisAdReasons().isEmpty() || this.zzgao.zzanv() == null) ? false : true);
            if (this.zzgas.zzapb() != null && this.zzgam.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.zzbpw.currentTimeMillis());
            if (this.zzgax && zzang()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.zzfsx.zzgb(this.zzgao.getCustomTemplateId()) != null);
            jSONObject8.put("click_signals", zzx(view));
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzctx)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.zzbpw.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.zzgba);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.zzgbb);
            jSONObject7.put("touch_signal", jSONObject9);
            zzayy.zza(this.zzgan.zzc("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Unable to create click JSON.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zza(View view, MotionEvent motionEvent, View view2) {
        this.zzgay = com.google.android.gms.ads.internal.util.zzbq.zza(motionEvent, view2);
        long currentTimeMillis = this.zzbpw.currentTimeMillis();
        this.zzgbb = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzgba = currentTimeMillis;
            this.zzgaz = this.zzgay;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(this.zzgay.x, this.zzgay.y);
        this.zzequ.zza(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzg(Bundle bundle) {
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.zzd.zzdy("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!zzfv("touch_reporting")) {
            com.google.android.gms.ads.internal.util.zzd.zzev("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.zzequ.zzca().zza((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final JSONObject zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject zza = com.google.android.gms.ads.internal.util.zzbq.zza(this.context, map, map2, view);
        JSONObject zza2 = com.google.android.gms.ads.internal.util.zzbq.zza(this.context, view);
        JSONObject zzt = com.google.android.gms.ads.internal.util.zzbq.zzt(view);
        JSONObject zzb = com.google.android.gms.ads.internal.util.zzbq.zzb(this.context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zza);
            jSONObject.put("ad_view_signal", zza2);
            jSONObject.put("scroll_view_signal", zzt);
            jSONObject.put("lock_screen_signal", zzb);
            return jSONObject;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzanh() {
        zza(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void setClickConfirmingView(View view) {
        if (!this.zzgam.optBoolean("custom_one_point_five_click_enabled", false)) {
            com.google.android.gms.ads.internal.util.zzd.zzex("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzccl zzcclVar = this.zzgas;
        if (view != null) {
            view.setOnClickListener(zzcclVar);
            view.setClickable(true);
            zzcclVar.zzgeq = new WeakReference<>(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zza(zzagi zzagiVar) {
        if (!this.zzgam.optBoolean("custom_one_point_five_click_enabled", false)) {
            com.google.android.gms.ads.internal.util.zzd.zzex("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.zzgas.zza(zzagiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void cancelUnconfirmedClick() {
        if (this.zzgam.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzgas.cancelUnconfirmedClick();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zza(zzyj zzyjVar) {
        try {
            if (this.zzgaw) {
                return;
            }
            if (zzyjVar == null && this.zzgao.zzanv() != null) {
                this.zzgaw = true;
                this.zzfpv.zzel(this.zzgao.zzanv().zzrd());
                zzani();
            } else {
                this.zzgaw = true;
                this.zzfpv.zzel(zzyjVar.zzrd());
                zzani();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zza(zzyf zzyfVar) {
        this.zzgbc = zzyfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzani() {
        try {
            if (this.zzgbc != null) {
                this.zzgbc.onAdMuted();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzb(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        zza(com.google.android.gms.ads.internal.util.zzbq.zza(this.context, view), com.google.android.gms.ads.internal.util.zzbq.zza(this.context, map, map2, view), com.google.android.gms.ads.internal.util.zzbq.zzt(view), com.google.android.gms.ads.internal.util.zzbq.zzb(this.context, view), zzy(view), null, com.google.android.gms.ads.internal.util.zzbq.zza(this.context, this.zzeqz));
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzanj() {
        Preconditions.checkMainThread("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzgam);
            zzayy.zza(this.zzgan.zzc("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final boolean zzh(Bundle bundle) {
        if (!zzfv("impression_reporting")) {
            com.google.android.gms.ads.internal.util.zzd.zzev("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return zza(null, null, null, null, null, com.google.android.gms.ads.internal.zzp.zzkq().zza(bundle, (JSONObject) null), false);
    }

    private final boolean zza(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzgam);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcrw)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            jSONObject6.put("screen", com.google.android.gms.ads.internal.util.zzbq.zzbl(this.context));
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzczi)).booleanValue()) {
                this.zzgan.zza("/clickRecorded", new zzcai(this));
            } else {
                this.zzgan.zza("/logScionEvent", new zzcaj(this));
            }
            this.zzgan.zza("/nativeImpression", new zzcal(this));
            zzayy.zza(this.zzgan.zzc("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzgau || this.zzeqz.zzhhy == null) {
                return true;
            }
            this.zzgau |= com.google.android.gms.ads.internal.zzp.zzla().zzb(this.context, this.zzbpd.zzbrf, this.zzeqz.zzhhy.toString(), this.zzfve.zzhje);
            return true;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Unable to create impression JSON.", e);
            return false;
        }
    }

    private final String zzx(View view) {
        try {
            JSONObject optJSONObject = this.zzgam.optJSONObject("tracking_urls_and_actions");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            return this.zzequ.zzca().zza(this.context, optJSONObject.optString("click_string"), view);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Exception obtaining click signals", e);
            return null;
        }
    }

    private final String zzy(View view) {
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcrw)).booleanValue()) {
            return null;
        }
        try {
            return this.zzequ.zzca().zza(this.context, view, (Activity) null);
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.zzd.zzev("Exception getting data.");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void destroy() {
        this.zzgan.destroy();
    }
}
