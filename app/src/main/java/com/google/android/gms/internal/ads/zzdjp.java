package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqb;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdjp<R extends zzbqb<? extends zzbmz>> {
    private final Executor executor;
    private final zzdjx<R> zzhfo;
    private final zzdor zzhft;
    private final zzdjy zzhfw;
    private zzdjt zzhfx;

    public zzdjp(zzdor zzdorVar, zzdjy zzdjyVar, zzdjx<R> zzdjxVar, Executor executor) {
        this.zzhft = zzdorVar;
        this.zzhfw = zzdjyVar;
        this.zzhfo = zzdjxVar;
        this.executor = executor;
    }

    public final zzdzl<zzdjt> zzauu() {
        zzdzl zza;
        zzdjt zzdjtVar = this.zzhfx;
        if (zzdjtVar != null) {
            return zzdyz.zzag(zzdjtVar);
        }
        if (!zzadi.zzddk.get().booleanValue()) {
            zzdjt zzdjtVar2 = new zzdjt(null, zzauv(), null);
            this.zzhfx = zzdjtVar2;
            zza = zzdyz.zzag(zzdjtVar2);
        } else {
            zza = zzdyu.zzg(this.zzhfo.zzc(this.zzhfw).zza(new zzdjf(this.zzhft.zzavz().zzhmb)).zzagd().zzagu().zza(this.zzhft.zzavz())).zza(new zzdju(this), this.executor).zza(zzcnj.class, new zzdjr(this), this.executor);
        }
        return zzdyz.zzb(zza, zzdjs.zzdyn, this.executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzdpa zzauv() {
        zzdmx zzahb = this.zzhfo.zzc(this.zzhfw).zzagd().zzahb();
        return this.zzhft.zza(zzahb.zzhjd, zzahb.zzhje, zzahb.zzhjh);
    }
}
