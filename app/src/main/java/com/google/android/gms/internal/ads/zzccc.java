package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzccc extends zzaeq implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcdc {
    public static final String[] zzgdp = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};
    private FrameLayout zzbny;
    private zzaei zzcks;
    private final String zzgdo;
    private FrameLayout zzgdq;
    private zzdzk zzgdr;
    private View zzgds;
    private zzcaz zzgdt;
    private zzqr zzgdu;
    private boolean zzgdw;
    private Map<String, WeakReference<View>> zzdrt = new HashMap();
    private IObjectWrapper zzgdv = null;
    private boolean zzerh = false;
    private final int zzegf = ModuleDescriptor.MODULE_VERSION;

    public zzccc(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.zzgdq = frameLayout;
        this.zzbny = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = NativeAppInstallAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzgdo = str;
        com.google.android.gms.ads.internal.zzp.zzln();
        zzazk.zza((View) frameLayout, (ViewTreeObserver.OnGlobalLayoutListener) this);
        com.google.android.gms.ads.internal.zzp.zzln();
        zzazk.zza((View) frameLayout, (ViewTreeObserver.OnScrollChangedListener) this);
        this.zzgdr = zzayv.zzegm;
        this.zzgdu = new zzqr(this.zzgdq.getContext(), this.zzgdq);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final synchronized void zzb(String str, IObjectWrapper iObjectWrapper) {
        zza(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized void zza(String str, View view, boolean z) {
        if (this.zzerh) {
            return;
        }
        if (view == null) {
            this.zzdrt.remove(str);
            return;
        }
        this.zzdrt.put(str, new WeakReference<>(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
            if (com.google.android.gms.ads.internal.util.zzbq.zzdi(this.zzegf)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final synchronized IObjectWrapper zzco(String str) {
        return ObjectWrapper.wrap(zzgc(str));
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized View zzgc(String str) {
        if (this.zzerh) {
            return null;
        }
        WeakReference<View> weakReference = this.zzdrt.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final synchronized void zza(IObjectWrapper iObjectWrapper) {
        if (this.zzerh) {
            return;
        }
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzcaz)) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        if (this.zzgdt != null) {
            this.zzgdt.zzc(this);
        }
        zzaos();
        zzcaz zzcazVar = (zzcaz) unwrap;
        this.zzgdt = zzcazVar;
        zzcazVar.zza(this);
        this.zzgdt.zzaa(this.zzgdq);
        this.zzgdt.zzab(this.zzbny);
        if (this.zzgdw) {
            this.zzgdt.zzanp().zza(this.zzcks);
        }
    }

    private final synchronized void zzaos() {
        this.zzgdr.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzccf
            private final zzccc zzged;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzged = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzged.zzapa();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final synchronized void destroy() {
        if (this.zzerh) {
            return;
        }
        if (this.zzgdt != null) {
            this.zzgdt.zzc(this);
            this.zzgdt = null;
        }
        this.zzdrt.clear();
        this.zzgdq.removeAllViews();
        this.zzbny.removeAllViews();
        this.zzdrt = null;
        this.zzgdq = null;
        this.zzbny = null;
        this.zzgds = null;
        this.zzgdu = null;
        this.zzerh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final synchronized void zzc(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        if (this.zzgdt != null) {
            this.zzgdt.cancelUnconfirmedClick();
            this.zzgdt.zza(view, this.zzgdq, zzaot(), zzaou(), false);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zzgdt != null) {
            this.zzgdt.zza(view, motionEvent, this.zzgdq);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized JSONObject zztj() {
        if (this.zzgdt == null) {
            return null;
        }
        return this.zzgdt.zza(this.zzgdq, zzaot(), zzaou());
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        if (this.zzgdt != null) {
            this.zzgdt.zzb(this.zzgdq, zzaot(), zzaou(), zzcaz.zzz(this.zzgdq));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        if (this.zzgdt != null) {
            this.zzgdt.zzb(this.zzgdq, zzaot(), zzaou(), zzcaz.zzz(this.zzgdq));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized Map<String, WeakReference<View>> zzaot() {
        return this.zzdrt;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized Map<String, WeakReference<View>> zzaou() {
        return this.zzdrt;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized Map<String, WeakReference<View>> zzaov() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized String zzaow() {
        return this.zzgdo;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final FrameLayout zzaox() {
        return this.zzbny;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final zzqr zzaoy() {
        return this.zzgdu;
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        this.zzgdt.setClickConfirmingView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) {
        if (this.zzerh) {
            return;
        }
        this.zzgdv = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final IObjectWrapper zzaoz() {
        return this.zzgdv;
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final void zzg(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzgdq, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final synchronized void zza(zzaei zzaeiVar) {
        if (this.zzerh) {
            return;
        }
        this.zzgdw = true;
        this.zzcks = zzaeiVar;
        if (this.zzgdt != null) {
            this.zzgdt.zzanp().zza(zzaeiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final /* synthetic */ View zzajo() {
        return this.zzgdq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzapa() {
        if (this.zzgds == null) {
            View view = new View(this.zzgdq.getContext());
            this.zzgds = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzgdq != this.zzgds.getParent()) {
            this.zzgdq.addView(this.zzgds);
        }
    }
}
