package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzarq {

    @Nonnull
    private final View zzaaq;
    private final Map<String, WeakReference<View>> zzdrt;
    private final zzaxc zzdru;

    public zzarq(zzarv zzarvVar) {
        View view;
        Map<String, WeakReference<View>> map;
        View view2;
        Map<String, WeakReference<View>> map2;
        view = zzarvVar.zzaaq;
        this.zzaaq = view;
        map = zzarvVar.zzdrt;
        this.zzdrt = map;
        view2 = zzarvVar.zzaaq;
        zzaxc zzp = zzaro.zzp(view2.getContext());
        this.zzdru = zzp;
        if (zzp == null || (map2 = this.zzdrt) == null || map2.isEmpty()) {
            return;
        }
        try {
            this.zzdru.zza(new zzaru(ObjectWrapper.wrap(this.zzaaq).asBinder(), ObjectWrapper.wrap(this.zzdrt).asBinder()));
        } catch (RemoteException unused) {
            zzaym.zzev("Failed to call remote method.");
        }
    }

    public final void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzdru == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzdru.zza(list, ObjectWrapper.wrap(this.zzaaq), new zzart(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Internal error: ");
            sb.append(valueOf);
            updateImpressionUrlsCallback.onFailure(sb.toString());
        }
    }

    public final void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzdru == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzdru.zzb(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zzaaq), new zzars(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Internal error: ");
            sb.append(valueOf);
            updateClickUrlCallback.onFailure(sb.toString());
        }
    }

    public final void reportTouchEvent(MotionEvent motionEvent) {
        zzaxc zzaxcVar = this.zzdru;
        if (zzaxcVar == null) {
            zzaym.zzdy("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzaxcVar.zzan(ObjectWrapper.wrap(motionEvent));
        } catch (RemoteException unused) {
            zzaym.zzev("Failed to call remote method.");
        }
    }
}
