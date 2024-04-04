package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzqx implements zzrg {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ Bundle zzyc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqx(zzqy zzqyVar, Activity activity, Bundle bundle) {
        this.val$activity = activity;
        this.zzyc = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzrg
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.val$activity, this.zzyc);
    }
}
