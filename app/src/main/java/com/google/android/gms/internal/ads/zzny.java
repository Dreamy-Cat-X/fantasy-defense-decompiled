package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserView;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzny {
    public final int viewportHeight;
    public final int viewportWidth;
    private final String zzbgx;
    private final String zzbgy;
    private final boolean zzbgz;
    private final boolean zzbha;
    public final int zzbhb;
    public final int zzbhc;
    public final int zzbhd;
    public final boolean zzbhe;
    public final boolean zzbhf;
    public final boolean zzbhg;

    public zzny() {
        this(null, null, false, true, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, true, true, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, true);
    }

    private zzny(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, int i4, int i5, boolean z5) {
        this.zzbgx = null;
        this.zzbgy = null;
        this.zzbgz = false;
        this.zzbha = true;
        this.zzbhb = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.zzbhc = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.zzbhd = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.zzbhe = true;
        this.zzbhf = true;
        this.viewportWidth = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.viewportHeight = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.zzbhg = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzny zznyVar = (zzny) obj;
            if (this.zzbha == zznyVar.zzbha && this.zzbhb == zznyVar.zzbhb && this.zzbhc == zznyVar.zzbhc && this.zzbhe == zznyVar.zzbhe && this.zzbhf == zznyVar.zzbhf && this.zzbhg == zznyVar.zzbhg && this.viewportWidth == zznyVar.viewportWidth && this.viewportHeight == zznyVar.viewportHeight && this.zzbhd == zznyVar.zzbhd && TextUtils.equals(null, null) && TextUtils.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = null;
        return (((((((((((((((((((str.hashCode() * 31) + str.hashCode()) * 31 * 31) + (this.zzbha ? 1 : 0)) * 31) + this.zzbhb) * 31) + this.zzbhc) * 31) + this.zzbhd) * 31) + (this.zzbhe ? 1 : 0)) * 31) + (this.zzbhf ? 1 : 0)) * 31) + (this.zzbhg ? 1 : 0)) * 31) + this.viewportWidth) * 31) + this.viewportHeight;
    }
}
