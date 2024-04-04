package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzrc implements zzrg {
    private final /* synthetic */ Activity val$activity;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrc(zzqy zzqyVar, Activity activity) {
        this.val$activity = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzrg
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.val$activity);
    }
}
