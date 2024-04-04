package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbrc extends zzbvk<zzbrf> implements zzbqv {
    public zzbrc(Set<zzbxf<zzbrf>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zza(zzbzk zzbzkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzl(final zzvc zzvcVar) {
        zza(new zzbvm(zzvcVar) { // from class: com.google.android.gms.internal.ads.zzbrb
            private final zzvc zzfxo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxo = zzvcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                ((zzbrf) obj).zzk(this.zzfxo);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzaln() {
        zza(zzbre.zzfxn);
    }
}
