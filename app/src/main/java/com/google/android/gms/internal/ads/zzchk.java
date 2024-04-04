package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzchk extends FrameLayout {
    private final com.google.android.gms.ads.internal.util.zzag zzdqn;

    public zzchk(Context context, View view, com.google.android.gms.ads.internal.util.zzag zzagVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.zzdqn = zzagVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.zzdqn.zzd(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            KeyEvent.Callback childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof zzbdh)) {
                arrayList.add((zzbdh) childAt);
            }
        }
        super.removeAllViews();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((zzbdh) obj).destroy();
        }
    }
}
