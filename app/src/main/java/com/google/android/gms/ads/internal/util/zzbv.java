package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbv implements Callable<String> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ Context zzefd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbv(zzbt zzbtVar, Context context, Context context2) {
        this.zzefd = context;
        this.val$context = context2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.zzefd != null) {
            zzd.zzeb("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.zzefd.getSharedPreferences("admob_user_agent", 0);
        } else {
            zzd.zzeb("Attempting to read user agent from local cache.");
            sharedPreferences = this.val$context.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            zzd.zzeb("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.val$context);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                zzd.zzeb("Persisting user agent.");
            }
        }
        return string;
    }
}
