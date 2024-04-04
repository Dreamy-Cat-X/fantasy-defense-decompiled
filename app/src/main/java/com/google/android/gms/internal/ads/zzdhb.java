package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzdhb implements Callable {
    static final Callable zzhah = new zzdhb();

    private zzdhb() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) zzwo.zzqq().zzd(zzabh.zzcmu);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) zzwo.zzqq().zzd(zzabh.zzcmv)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, com.google.android.gms.ads.internal.util.zzca.zzep(str2));
                }
            }
        }
        return new zzdgz(hashMap);
    }
}
