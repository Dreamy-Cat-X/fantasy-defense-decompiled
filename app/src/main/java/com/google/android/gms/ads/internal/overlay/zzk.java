package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzbdh;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzk {
    public final Context context;
    public final int index;
    public final ViewGroup parent;
    public final ViewGroup.LayoutParams zzdqq;

    public zzk(zzbdh zzbdhVar) throws zzi {
        this.zzdqq = zzbdhVar.getLayoutParams();
        ViewParent parent = zzbdhVar.getParent();
        this.context = zzbdhVar.zzadd();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.parent = viewGroup;
            this.index = viewGroup.indexOfChild(zzbdhVar.getView());
            this.parent.removeView(zzbdhVar.getView());
            zzbdhVar.zzba(true);
            return;
        }
        throw new zzi("Could not get the parent of the WebView for an overlay.");
    }
}
