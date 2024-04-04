package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbqy extends zzbvk<zzbqv> implements zzbqv {
    public zzbqy(zzbrc zzbrcVar, Set<zzbxf<zzbqv>> set, Executor executor) {
        super(set);
        zza(zzbrcVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzl(final zzvc zzvcVar) {
        zza(new zzbvm(zzvcVar) { // from class: com.google.android.gms.internal.ads.zzbqx
            private final zzvc zzfxo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxo = zzvcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                ((zzbqv) obj).zzl(this.zzfxo);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zza(final zzbzk zzbzkVar) {
        zza(new zzbvm(zzbzkVar) { // from class: com.google.android.gms.internal.ads.zzbra
            private final zzbzk zzfxp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxp = zzbzkVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                ((zzbqv) obj).zza(this.zzfxp);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzaln() {
        zza(zzbqz.zzfxn);
    }
}
