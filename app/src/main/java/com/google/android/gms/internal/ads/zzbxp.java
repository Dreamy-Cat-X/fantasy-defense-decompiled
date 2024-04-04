package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbxp extends zzbvk<zzaif> implements zzaif {
    public zzbxp(Set<zzbxf<zzaif>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzaif
    public final synchronized void zzua() {
        zza(zzbxo.zzfxn);
    }

    @Override // com.google.android.gms.internal.ads.zzaif
    public final void zza(final zzaun zzaunVar) {
        zza(new zzbvm(zzaunVar) { // from class: com.google.android.gms.internal.ads.zzbxr
            private final zzaun zzfzk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfzk = zzaunVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                ((zzaif) obj).zza(this.zzfzk);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaif
    public final void zzub() {
        zza(zzbxq.zzfxn);
    }
}
