package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaah extends zzyr {
    private final OnPaidEventListener zzclb;

    public zzaah(OnPaidEventListener onPaidEventListener) {
        this.zzclb = onPaidEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzyo
    public final void zza(zzvr zzvrVar) {
        if (this.zzclb != null) {
            this.zzclb.onPaidEvent(AdValue.zza(zzvrVar.zzacz, zzvrVar.zzada, zzvrVar.zzadb));
        }
    }
}
