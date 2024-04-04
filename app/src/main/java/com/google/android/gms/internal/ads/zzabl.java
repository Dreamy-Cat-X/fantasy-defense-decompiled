package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.kt.olleh.inapp.net.InAppError;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzabl {
    private Context context;
    private String zzbrf;
    private String zzczr = zzacx.zzdby.get();
    private Map<String, String> zzczs;

    public zzabl(Context context, String str) {
        String packageName;
        this.context = null;
        this.zzbrf = null;
        this.context = context;
        this.zzbrf = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzczs = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.zzczs.put("v", "3");
        this.zzczs.put("os", Build.VERSION.RELEASE);
        this.zzczs.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.zzczs;
        com.google.android.gms.ads.internal.zzp.zzkq();
        map.put("device", com.google.android.gms.ads.internal.util.zzm.zzyx());
        Map<String, String> map2 = this.zzczs;
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        map2.put("app", packageName);
        Map<String, String> map3 = this.zzczs;
        com.google.android.gms.ads.internal.zzp.zzkq();
        map3.put("is_lite_sdk", com.google.android.gms.ads.internal.util.zzm.zzav(context) ? InAppError.FAILED : InAppError.SUCCESS);
        Future<zzatd> zzv = com.google.android.gms.ads.internal.zzp.zzlb().zzv(this.context);
        try {
            this.zzczs.put("network_coarse", Integer.toString(zzv.get().zzdwh));
            this.zzczs.put("network_fine", Integer.toString(zzv.get().zzdwi));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzp.zzku().zza(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzsf() {
        return this.zzczr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzlv() {
        return this.zzbrf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> zzsg() {
        return this.zzczs;
    }
}
