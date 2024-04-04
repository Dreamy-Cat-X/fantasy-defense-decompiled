package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzeo implements zzeu {
    private final /* synthetic */ Activity val$activity;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeo(zzem zzemVar, Activity activity) {
        this.val$activity = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzeu
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.val$activity);
    }
}
