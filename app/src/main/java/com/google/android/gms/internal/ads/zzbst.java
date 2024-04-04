package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbst extends zzbvk<zzbsy> implements zzbrj, zzbsl {
    private final zzdmi zzfpm;
    private AtomicBoolean zzfxv;

    public zzbst(Set<zzbxf<zzbsy>> set, zzdmi zzdmiVar) {
        super(set);
        this.zzfxv = new AtomicBoolean();
        this.zzfpm = zzdmiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final void onAdImpression() {
        if (this.zzfpm.zzhhl == 2 || this.zzfpm.zzhhl == 5 || this.zzfpm.zzhhl == 4) {
            zzalp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final void zzalo() {
        if (this.zzfpm.zzhhl == 1) {
            zzalp();
        }
    }

    private final void zzalp() {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyj)).booleanValue() && this.zzfxv.compareAndSet(false, true) && this.zzfpm.zzhii != null && this.zzfpm.zzhii.type == 3) {
            zza(new zzbvm(this) { // from class: com.google.android.gms.internal.ads.zzbsw
                private final zzbst zzfxw;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfxw = this;
                }

                @Override // com.google.android.gms.internal.ads.zzbvm
                public final void zzo(Object obj) {
                    this.zzfxw.zza((zzbsy) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbsy zzbsyVar) throws Exception {
        zzbsyVar.zzb(this.zzfpm.zzhii);
    }
}
