package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbqb;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdji<R extends zzbqb<AdT>, AdT extends zzbmz> implements zzdjv<R, zzdjm<AdT>> {
    private final Executor executor;
    private final zzdor zzhft;
    private zzdza<Void> zzhfu = new zzdjj(this);

    public zzdji(zzdor zzdorVar, Executor executor) {
        this.zzhft = zzdorVar;
        this.executor = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdjv
    public final /* bridge */ /* synthetic */ Object zzaup() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjv
    public final zzdzl<zzdjm<AdT>> zza(final zzdka zzdkaVar, final zzdjx<R> zzdjxVar) {
        return zzdyu.zzg(new zzdjp(this.zzhft, zzdkaVar.zzhgb, zzdjxVar, this.executor).zzauu()).zzb(new zzdyj(this, zzdkaVar, zzdjxVar) { // from class: com.google.android.gms.internal.ads.zzdjh
            private final zzdka zzhfi;
            private final zzdji zzhfr;
            private final zzdjx zzhfs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhfr = this;
                this.zzhfi = zzdkaVar;
                this.zzhfs = zzdjxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzhfr.zza(this.zzhfi, this.zzhfs, (zzdjt) obj);
            }
        }, this.executor).zza(Exception.class, new zzdjk(this), this.executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(zzdka zzdkaVar, zzdjx zzdjxVar, zzdjt zzdjtVar) throws Exception {
        zzdpa zzdpaVar = zzdjtVar.zzhfq;
        zzasu zzasuVar = zzdjtVar.zzgmy;
        zzdpb<?> zza = zzdpaVar != null ? this.zzhft.zza(zzdpaVar) : null;
        if (zzdpaVar == null) {
            return zzdyz.zzag(null);
        }
        if (zza != null && zzasuVar != null) {
            zzdyz.zza(((zzbqb) zzdjxVar.zzc(zzdkaVar.zzhgb).zzagd()).zzagu().zzc(zzasuVar), this.zzhfu, this.executor);
        }
        return zzdyz.zzag(new zzdjm(zzdpaVar, zzasuVar, zza));
    }
}
