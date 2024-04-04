package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.kt.olleh.inapp.net.InAppError;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzccu {
    private final zzcfp zzgel;
    private final zzcgx zzger;
    private ViewTreeObserver.OnScrollChangedListener zzgeu = null;

    public zzccu(zzcgx zzcgxVar, zzcfp zzcfpVar) {
        this.zzger = zzcgxVar;
        this.zzgel = zzcfpVar;
    }

    public final View zza(final View view, final WindowManager windowManager) throws zzbdt {
        zzbdh zza = this.zzger.zza(zzvp.zzqd(), null, null);
        zza.getView().setVisibility(4);
        zza.getView().setContentDescription("policy_validator");
        zza.zza("/sendMessageToSdk", new zzahv(this) { // from class: com.google.android.gms.internal.ads.zzccx
            private final zzccu zzgex;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgex = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahv
            public final void zza(Object obj, Map map) {
                this.zzgex.zze((zzbdh) obj, map);
            }
        });
        zza.zza("/hideValidatorOverlay", new zzahv(this, windowManager, view) { // from class: com.google.android.gms.internal.ads.zzccw
            private final zzccu zzgex;
            private final WindowManager zzgey;
            private final View zzgez;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgex = this;
                this.zzgey = windowManager;
                this.zzgez = view;
            }

            @Override // com.google.android.gms.internal.ads.zzahv
            public final void zza(Object obj, Map map) {
                this.zzgex.zza(this.zzgey, this.zzgez, (zzbdh) obj, map);
            }
        });
        zza.zza("/open", new zzahz(null, null, null, null, null));
        this.zzgel.zza(new WeakReference(zza), "/loadNativeAdPolicyViolations", new zzahv(this, view, windowManager) { // from class: com.google.android.gms.internal.ads.zzccz
            private final zzccu zzgex;
            private final View zzgfa;
            private final WindowManager zzgfb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgex = this;
                this.zzgfa = view;
                this.zzgfb = windowManager;
            }

            @Override // com.google.android.gms.internal.ads.zzahv
            public final void zza(Object obj, Map map) {
                this.zzgex.zza(this.zzgfa, this.zzgfb, (zzbdh) obj, map);
            }
        });
        this.zzgel.zza(new WeakReference(zza), "/showValidatorOverlay", zzccy.zzdfy);
        return zza.getView();
    }

    private static int zza(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        zzwo.zzqm();
        return zzayd.zze(context, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(final View view, final WindowManager windowManager, final zzbdh zzbdhVar, final Map map) {
        int i;
        zzbdhVar.zzadi().zza(new zzbes(this, map) { // from class: com.google.android.gms.internal.ads.zzcda
            private final Map zzega;
            private final zzccu zzgex;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgex = this;
                this.zzega = map;
            }

            @Override // com.google.android.gms.internal.ads.zzbes
            public final void zzai(boolean z) {
                this.zzgex.zzb(this.zzega, z);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int zza = zza(context, (String) map.get("validator_width"), ((Integer) zzwo.zzqq().zzd(zzabh.zzcyr)).intValue());
        int zza2 = zza(context, (String) map.get("validator_height"), ((Integer) zzwo.zzqq().zzd(zzabh.zzcys)).intValue());
        int zza3 = zza(context, (String) map.get("validator_x"), 0);
        int zza4 = zza(context, (String) map.get("validator_y"), 0);
        zzbdhVar.zza(zzbew.zzq(zza, zza2));
        try {
            zzbdhVar.getWebView().getSettings().setUseWideViewPort(((Boolean) zzwo.zzqq().zzd(zzabh.zzcyt)).booleanValue());
            zzbdhVar.getWebView().getSettings().setLoadWithOverviewMode(((Boolean) zzwo.zzqq().zzd(zzabh.zzcyu)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams zzzo = com.google.android.gms.ads.internal.util.zzbq.zzzo();
        zzzo.x = zza3;
        zzzo.y = zza4;
        windowManager.updateViewLayout(zzbdhVar.getView(), zzzo);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            if (InAppError.FAILED.equals(str) || "2".equals(str)) {
                i = rect.bottom;
            } else {
                i = rect.top;
            }
            final int i2 = i - zza4;
            this.zzgeu = new ViewTreeObserver.OnScrollChangedListener(view, zzbdhVar, str, zzzo, i2, windowManager) { // from class: com.google.android.gms.internal.ads.zzcdb
                private final String zzdkf;
                private final View zzgfc;
                private final zzbdh zzgfd;
                private final WindowManager.LayoutParams zzgfe;
                private final int zzgff;
                private final WindowManager zzgfg;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgfc = view;
                    this.zzgfd = zzbdhVar;
                    this.zzdkf = str;
                    this.zzgfe = zzzo;
                    this.zzgff = i2;
                    this.zzgfg = windowManager;
                }

                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = this.zzgfc;
                    zzbdh zzbdhVar2 = this.zzgfd;
                    String str2 = this.zzdkf;
                    WindowManager.LayoutParams layoutParams = this.zzgfe;
                    int i3 = this.zzgff;
                    WindowManager windowManager2 = this.zzgfg;
                    Rect rect2 = new Rect();
                    if (!view2.getGlobalVisibleRect(rect2) || zzbdhVar2.getView().getWindowToken() == null) {
                        return;
                    }
                    if (InAppError.FAILED.equals(str2) || "2".equals(str2)) {
                        layoutParams.y = rect2.bottom - i3;
                    } else {
                        layoutParams.y = rect2.top - i3;
                    }
                    windowManager2.updateViewLayout(zzbdhVar2.getView(), layoutParams);
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzgeu);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzbdhVar.loadUrl(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzgel.zza("sendMessageToNativeJs", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(WindowManager windowManager, View view, zzbdh zzbdhVar, Map map) {
        com.google.android.gms.ads.internal.util.zzd.zzdy("Hide native ad policy validator overlay.");
        zzbdhVar.getView().setVisibility(8);
        if (zzbdhVar.getView().getWindowToken() != null) {
            windowManager.removeView(zzbdhVar.getView());
        }
        zzbdhVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzgeu == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzgeu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzbdh zzbdhVar, Map map) {
        this.zzgel.zza("sendMessageToNativeJs", (Map<String, ?>) map);
    }
}
