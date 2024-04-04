package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzbfa extends zzgv implements zzbfb {
    public static zzbfb zzau(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        if (queryLocalInterface instanceof zzbfb) {
            return (zzbfb) queryLocalInterface;
        }
        return new zzbfc(iBinder);
    }
}
