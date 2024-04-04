package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzepi {
    public abstract void zziq(String str);

    public static zzepi zzn(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzepf(cls.getSimpleName());
        }
        return new zzeph(cls.getSimpleName());
    }
}
