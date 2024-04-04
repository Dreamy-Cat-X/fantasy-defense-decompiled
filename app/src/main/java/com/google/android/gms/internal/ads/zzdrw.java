package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.kt.olleh.inapp.net.InAppError;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdrw {
    private final Context context;
    private final String packageName;
    private final String zzbrf;

    public zzdrw(Context context, zzayt zzaytVar) {
        this.context = context;
        this.packageName = context.getPackageName();
        this.zzbrf = zzaytVar.zzbrf;
    }

    public final void zzq(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzp.zzkq();
        map.put("device", com.google.android.gms.ads.internal.util.zzm.zzyx());
        map.put("app", this.packageName);
        com.google.android.gms.ads.internal.zzp.zzkq();
        map.put("is_lite_sdk", com.google.android.gms.ads.internal.util.zzm.zzav(this.context) ? InAppError.FAILED : InAppError.SUCCESS);
        map.put("e", TextUtils.join(",", zzabh.zzsc()));
        map.put("sdkVersion", this.zzbrf);
    }
}
