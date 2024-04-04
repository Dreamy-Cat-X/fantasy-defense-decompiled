package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeqf extends CustomTabsServiceConnection {
    private WeakReference<zzeqe> zzjaq;

    public zzeqf(zzeqe zzeqeVar) {
        this.zzjaq = new WeakReference<>(zzeqeVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzeqe zzeqeVar = this.zzjaq.get();
        if (zzeqeVar != null) {
            zzeqeVar.zza(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzeqe zzeqeVar = this.zzjaq.get();
        if (zzeqeVar != null) {
            zzeqeVar.zzst();
        }
    }
}
