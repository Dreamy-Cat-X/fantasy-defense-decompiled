package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdjl {
    public static <T> void zza(AtomicReference<T> atomicReference, zzdjo<T> zzdjoVar) {
        T t = atomicReference.get();
        if (t == null) {
            return;
        }
        try {
            zzdjoVar.zzp(t);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zze("#007 Could not call remote method.", e);
        }
    }
}
