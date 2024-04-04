package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzavj implements zzayo {
    static final zzayo zzbxt = new zzavj();

    private zzavj() {
    }

    @Override // com.google.android.gms.internal.ads.zzayo
    public final Object apply(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        if (queryLocalInterface instanceof zzauw) {
            return (zzauw) queryLocalInterface;
        }
        return new zzauz(iBinder);
    }
}
