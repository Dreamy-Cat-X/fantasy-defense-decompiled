package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbok implements zzepq<zzbol> {
    private final zzeqd<Clock> zzfra;
    private final zzeqd<zzaxr> zzfvu;

    private zzbok(zzeqd<Clock> zzeqdVar, zzeqd<zzaxr> zzeqdVar2) {
        this.zzfra = zzeqdVar;
        this.zzfvu = zzeqdVar2;
    }

    public static zzbok zzd(zzeqd<Clock> zzeqdVar, zzeqd<zzaxr> zzeqdVar2) {
        return new zzbok(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbol(this.zzfra.get(), this.zzfvu.get());
    }
}
