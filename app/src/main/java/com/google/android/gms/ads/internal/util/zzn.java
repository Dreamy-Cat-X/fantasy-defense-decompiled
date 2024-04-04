package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzach;
import com.google.android.gms.internal.ads.zzack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzn implements zzack {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ Uri val$uri;
    private final /* synthetic */ zzach zzecz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzm zzmVar, zzach zzachVar, Context context, Uri uri) {
        this.zzecz = zzachVar;
        this.val$context = context;
        this.val$uri = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzsv() {
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzsu() {
        new CustomTabsIntent.Builder(this.zzecz.zzss()).build().launchUrl(this.val$context, this.val$uri);
        this.zzecz.zzc((Activity) this.val$context);
    }
}
