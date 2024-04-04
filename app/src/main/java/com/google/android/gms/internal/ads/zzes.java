package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzes implements zzeu {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ Bundle zzyc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzes(zzem zzemVar, Activity activity, Bundle bundle) {
        this.val$activity = activity;
        this.zzyc = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeu
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.val$activity, this.zzyc);
    }
}
