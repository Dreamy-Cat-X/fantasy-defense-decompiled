package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcdo implements zzepq<zzbxf<VideoController.VideoLifecycleCallbacks>> {
    private final zzeqd<zzcgc> zzeui;
    private final zzeqd<Executor> zzftf;
    private final zzcdj zzgfn;

    public zzcdo(zzcdj zzcdjVar, zzeqd<zzcgc> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        this.zzgfn = zzcdjVar;
        this.zzeui = zzeqdVar;
        this.zzftf = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzeui.get(), this.zzftf.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
