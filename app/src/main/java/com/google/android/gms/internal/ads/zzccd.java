package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzccd extends zzaet implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcdc {
    private zzcaz zzgdt;
    private zzqr zzgdu;
    private final WeakReference<View> zzgdx;
    private final Map<String, WeakReference<View>> zzgdy = new HashMap();
    private final Map<String, WeakReference<View>> zzgdz = new HashMap();
    private final Map<String, WeakReference<View>> zzgea = new HashMap();

    public zzccd(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzp.zzln();
        zzazk.zza(view, (ViewTreeObserver.OnGlobalLayoutListener) this);
        com.google.android.gms.ads.internal.zzp.zzln();
        zzazk.zza(view, (ViewTreeObserver.OnScrollChangedListener) this);
        this.zzgdx = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.zzgdy.put(key, new WeakReference<>(value));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(key) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.zzgea.putAll(this.zzgdy);
        for (Map.Entry<String, View> entry2 : hashMap2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.zzgdz.put(entry2.getKey(), new WeakReference<>(value2));
                value2.setOnTouchListener(this);
                value2.setClickable(false);
            }
        }
        this.zzgea.putAll(this.zzgdz);
        this.zzgdu = new zzqr(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final FrameLayout zzaox() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final synchronized void unregisterNativeAd() {
        if (this.zzgdt != null) {
            this.zzgdt.zzc(this);
            this.zzgdt = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final synchronized void zza(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzcaz)) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        if (this.zzgdt != null) {
            this.zzgdt.zzc(this);
        }
        if (((zzcaz) unwrap).zzann()) {
            zzcaz zzcazVar = (zzcaz) unwrap;
            this.zzgdt = zzcazVar;
            zzcazVar.zza(this);
            this.zzgdt.zzaa(zzajo());
            return;
        }
        com.google.android.gms.ads.internal.util.zzd.zzev("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final View zzajo() {
        return this.zzgdx.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final zzqr zzaoy() {
        return this.zzgdu;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized void zza(String str, View view, boolean z) {
        if (view == null) {
            this.zzgea.remove(str);
            this.zzgdy.remove(str);
            this.zzgdz.remove(str);
            return;
        }
        this.zzgea.put(str, new WeakReference<>(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
            this.zzgdy.put(str, new WeakReference<>(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized Map<String, WeakReference<View>> zzaot() {
        return this.zzgea;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized Map<String, WeakReference<View>> zzaou() {
        return this.zzgdy;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized Map<String, WeakReference<View>> zzaov() {
        return this.zzgdz;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized View zzgc(String str) {
        WeakReference<View> weakReference = this.zzgea.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized String zzaow() {
        return NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized IObjectWrapper zzaoz() {
        return null;
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zzgdt != null) {
            this.zzgdt.zza(view, motionEvent, zzajo());
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        if (this.zzgdt != null) {
            this.zzgdt.zza(view, zzajo(), zzaot(), zzaou(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        if (this.zzgdt != null) {
            this.zzgdt.zzb(zzajo(), zzaot(), zzaou(), zzcaz.zzz(zzajo()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        if (this.zzgdt != null) {
            this.zzgdt.zzb(zzajo(), zzaot(), zzaou(), zzcaz.zzz(zzajo()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        if (this.zzgdt != null) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (!(unwrap instanceof View)) {
                com.google.android.gms.ads.internal.util.zzd.zzex("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.zzgdt.setClickConfirmingView((View) unwrap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized JSONObject zztj() {
        return null;
    }
}
