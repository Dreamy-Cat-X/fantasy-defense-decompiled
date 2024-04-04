package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbte extends zzbvk<zzbtf> implements zzbtf {
    public zzbte(Set<zzbxf<zzbtf>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzd(final zzasu zzasuVar) {
        zza(new zzbvm(zzasuVar) { // from class: com.google.android.gms.internal.ads.zzbtd
            private final zzasu zzfxz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxz = zzasuVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                ((zzbtf) obj).zzd(this.zzfxz);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzb(final zzdmt zzdmtVar) {
        zza(new zzbvm(zzdmtVar) { // from class: com.google.android.gms.internal.ads.zzbtg
            private final zzdmt zzfya;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfya = zzdmtVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                ((zzbtf) obj).zzb(this.zzfya);
            }
        });
    }
}
