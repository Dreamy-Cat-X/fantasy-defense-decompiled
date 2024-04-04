package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzwo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class NativeAdViewHolder {
    public static WeakHashMap<View, NativeAdViewHolder> zzbnw = new WeakHashMap<>();
    private zzaeu zzbnv;
    private WeakReference<View> zzbnx;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        Preconditions.checkNotNull(view, "ContainerView must not be null");
        if ((view instanceof NativeAdView) || (view instanceof UnifiedNativeAdView)) {
            zzaym.zzev("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        if (zzbnw.get(view) != null) {
            zzaym.zzev("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        zzbnw.put(view, this);
        this.zzbnx = new WeakReference<>(view);
        this.zzbnv = zzwo.zzqn().zza(view, zzb(map), zzb(map2));
    }

    private static HashMap<String, View> zzb(Map<String, View> map) {
        if (map == null) {
            return new HashMap<>();
        }
        return new HashMap<>(map);
    }

    public final void setNativeAd(NativeAd nativeAd) {
        zza((IObjectWrapper) nativeAd.zzjs());
    }

    public final void setNativeAd(UnifiedNativeAd unifiedNativeAd) {
        zza((IObjectWrapper) unifiedNativeAd.zzjs());
    }

    private final void zza(IObjectWrapper iObjectWrapper) {
        WeakReference<View> weakReference = this.zzbnx;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null) {
            zzaym.zzex("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!zzbnw.containsKey(view)) {
            zzbnw.put(view, this);
        }
        zzaeu zzaeuVar = this.zzbnv;
        if (zzaeuVar != null) {
            try {
                zzaeuVar.zza(iObjectWrapper);
            } catch (RemoteException e) {
                zzaym.zzc("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void unregisterNativeAd() {
        zzaeu zzaeuVar = this.zzbnv;
        if (zzaeuVar != null) {
            try {
                zzaeuVar.unregisterNativeAd();
            } catch (RemoteException e) {
                zzaym.zzc("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        WeakReference<View> weakReference = this.zzbnx;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null) {
            zzbnw.remove(view);
        }
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzbnv.zzf(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzaym.zzc("Unable to call setClickConfirmingView on delegate", e);
        }
    }
}
