package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzag;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzh extends RelativeLayout {
    private zzag zzdqn;
    boolean zzdqo;

    public zzh(Context context, String str, String str2) {
        super(context);
        zzag zzagVar = new zzag(context, str);
        this.zzdqn = zzagVar;
        zzagVar.zzad(str2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.zzdqo) {
            return false;
        }
        this.zzdqn.zzd(motionEvent);
        return false;
    }
}
