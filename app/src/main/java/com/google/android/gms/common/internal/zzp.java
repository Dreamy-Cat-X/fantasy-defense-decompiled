package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzp extends com.google.android.gms.internal.common.zza implements zzq {
    public static zzq zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof zzq) {
            return (zzq) queryLocalInterface;
        }
        return new zzr(iBinder);
    }
}
