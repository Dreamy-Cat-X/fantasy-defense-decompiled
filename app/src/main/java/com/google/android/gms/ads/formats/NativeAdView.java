package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzaen;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzwo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public class NativeAdView extends FrameLayout {
    private final FrameLayout zzbny;
    private final zzaen zzbnz;

    public NativeAdView(Context context) {
        super(context);
        this.zzbny = zzd(context);
        this.zzbnz = zzju();
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzbny = zzd(context);
        this.zzbnz = zzju();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzbny = zzd(context);
        this.zzbnz = zzju();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zzbny = zzd(context);
        this.zzbnz = zzju();
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        zza(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, adChoicesView);
    }

    public AdChoicesView getAdChoicesView() {
        View zzbj = zzbj(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW);
        if (zzbj instanceof AdChoicesView) {
            return (AdChoicesView) zzbj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(String str, View view) {
        try {
            this.zzbnz.zzb(str, ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzaym.zzc("Unable to call setAssetView on delegate", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View zzbj(String str) {
        try {
            IObjectWrapper zzco = this.zzbnz.zzco(str);
            if (zzco != null) {
                return (View) ObjectWrapper.unwrap(zzco);
            }
            return null;
        } catch (RemoteException e) {
            zzaym.zzc("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        try {
            this.zzbnz.zza((IObjectWrapper) nativeAd.zzjs());
        } catch (RemoteException e) {
            zzaym.zzc("Unable to call setNativeAd on delegate", e);
        }
    }

    public void destroy() {
        try {
            this.zzbnz.destroy();
        } catch (RemoteException e) {
            zzaym.zzc("Unable to destroy native ad view", e);
        }
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final zzaen zzju() {
        Preconditions.checkNotNull(this.zzbny, "createDelegate must be called after mOverlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return zzwo.zzqn().zza(this.zzbny.getContext(), this, this.zzbny);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zzbny);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.zzbny == view) {
            return;
        }
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zzbny);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zzbny;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        zzaen zzaenVar = this.zzbnz;
        if (zzaenVar != null) {
            try {
                zzaenVar.zzc(ObjectWrapper.wrap(view), i);
            } catch (RemoteException e) {
                zzaym.zzc("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzaen zzaenVar;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcru)).booleanValue() && (zzaenVar = this.zzbnz) != null) {
            try {
                zzaenVar.zzg(ObjectWrapper.wrap(motionEvent));
            } catch (RemoteException e) {
                zzaym.zzc("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
