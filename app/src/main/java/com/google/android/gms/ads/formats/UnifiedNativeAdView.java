package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzady;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaei;
import com.google.android.gms.internal.ads.zzaen;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzwo;
import com.google.android.gms.internal.ads.zzzs;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class UnifiedNativeAdView extends FrameLayout {
    private final FrameLayout zzbny;
    private final zzaen zzbnz;

    public UnifiedNativeAdView(Context context) {
        super(context);
        this.zzbny = zzd(context);
        this.zzbnz = zzju();
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzbny = zzd(context);
        this.zzbnz = zzju();
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzbny = zzd(context);
        this.zzbnz = zzju();
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zzbny = zzd(context);
        this.zzbnz = zzju();
    }

    private final void zza(String str, View view) {
        try {
            this.zzbnz.zzb(str, ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzaym.zzc("Unable to call setAssetView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_HEADLINE, view);
    }

    public final void setCallToActionView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_CALL_TO_ACTION, view);
    }

    public final void setIconView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_ICON, view);
    }

    public final void setBodyView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_BODY, view);
    }

    public final void setAdvertiserView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_ADVERTISER, view);
    }

    public final void setStoreView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_STORE, view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzbnz.zzf(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzaym.zzc("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_PRICE, view);
    }

    public final void setImageView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_IMAGE, view);
    }

    public final void setStarRatingView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_STAR_RATING, view);
    }

    public final void setMediaView(MediaView mediaView) {
        zza(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO, mediaView);
        if (mediaView != null) {
            mediaView.zza(new zzady(this) { // from class: com.google.android.gms.ads.formats.zze
                private final UnifiedNativeAdView zzboc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzboc = this;
                }

                @Override // com.google.android.gms.internal.ads.zzady
                public final void setMediaContent(MediaContent mediaContent) {
                    this.zzboc.zza(mediaContent);
                }
            });
            mediaView.zza(new zzaea(this) { // from class: com.google.android.gms.ads.formats.zzf
                private final UnifiedNativeAdView zzboc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzboc = this;
                }

                @Override // com.google.android.gms.internal.ads.zzaea
                public final void setImageScaleType(ImageView.ScaleType scaleType) {
                    this.zzboc.zza(scaleType);
                }
            });
        }
    }

    public final void setAdChoicesView(AdChoicesView adChoicesView) {
        zza(UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW, adChoicesView);
    }

    public final void setNativeAd(UnifiedNativeAd unifiedNativeAd) {
        try {
            this.zzbnz.zza((IObjectWrapper) unifiedNativeAd.zzjs());
        } catch (RemoteException e) {
            zzaym.zzc("Unable to call setNativeAd on delegate", e);
        }
    }

    private final View zzbj(String str) {
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

    public final View getHeadlineView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_HEADLINE);
    }

    public final View getCallToActionView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_CALL_TO_ACTION);
    }

    public final View getIconView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_ICON);
    }

    public final View getBodyView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_BODY);
    }

    public final View getStoreView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_STORE);
    }

    public final View getPriceView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_PRICE);
    }

    public final View getAdvertiserView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_ADVERTISER);
    }

    public final View getImageView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_IMAGE);
    }

    public final View getStarRatingView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_STAR_RATING);
    }

    public final MediaView getMediaView() {
        View zzbj = zzbj(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO);
        if (zzbj instanceof MediaView) {
            return (MediaView) zzbj;
        }
        if (zzbj == null) {
            return null;
        }
        zzaym.zzdy("View is not an instance of MediaView");
        return null;
    }

    public final AdChoicesView getAdChoicesView() {
        View zzbj = zzbj(UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW);
        if (zzbj instanceof AdChoicesView) {
            return (AdChoicesView) zzbj;
        }
        return null;
    }

    public final void destroy() {
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
        Preconditions.checkNotNull(this.zzbny, "createDelegate must be called after overlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return zzwo.zzqn().zza(this.zzbny.getContext(), this, this.zzbny);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zzbny);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.zzbny == view) {
            return;
        }
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zzbny);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zzbny;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
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
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(ImageView.ScaleType scaleType) {
        if (scaleType != null) {
            try {
                this.zzbnz.zzh(ObjectWrapper.wrap(scaleType));
            } catch (RemoteException e) {
                zzaym.zzc("Unable to call setMediaViewImageScaleType on delegate", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(MediaContent mediaContent) {
        try {
            if (mediaContent instanceof zzzs) {
                this.zzbnz.zza(((zzzs) mediaContent).zzrs());
            } else if (mediaContent == null) {
                this.zzbnz.zza((zzaei) null);
            } else {
                zzaym.zzdy("Use MediaContent provided by UnifiedNativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            zzaym.zzc("Unable to call setMediaContent on delegate", e);
        }
    }
}
