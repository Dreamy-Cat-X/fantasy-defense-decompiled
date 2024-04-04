package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzvv extends zzxr {
    private final AppEventListener zzbob;

    public zzvv(AppEventListener appEventListener) {
        this.zzbob = appEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final void onAppEvent(String str, String str2) {
        this.zzbob.onAppEvent(str, str2);
    }

    public final AppEventListener getAppEventListener() {
        return this.zzbob;
    }
}
