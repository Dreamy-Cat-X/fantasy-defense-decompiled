package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzarf extends zzgv implements zzarc {
    public static zzarc zzaj(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        if (queryLocalInterface instanceof zzarc) {
            return (zzarc) queryLocalInterface;
        }
        return new zzare(iBinder);
    }
}
