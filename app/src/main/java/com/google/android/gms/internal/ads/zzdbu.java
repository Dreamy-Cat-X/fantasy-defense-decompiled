package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdbu implements zzepq<zzdbo<zzdbf>> {
    private final zzeqd<Clock> zzfra;
    private final zzeqd<zzdbi> zzhab;

    public zzdbu(zzeqd<zzdbi> zzeqdVar, zzeqd<Clock> zzeqdVar2) {
        this.zzhab = zzeqdVar;
        this.zzfra = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzdbo) zzepw.zza(new zzdbo(this.zzhab.get(), WorkRequest.MIN_BACKOFF_MILLIS, this.zzfra.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
