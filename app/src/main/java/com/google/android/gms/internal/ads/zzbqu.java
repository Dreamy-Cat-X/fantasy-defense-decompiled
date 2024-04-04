package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbqu extends zzbvk<zzbqw> implements zzbqw {
    public zzbqu(Set<zzbxf<zzbqw>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzd(final zzvc zzvcVar) {
        zza(new zzbvm(zzvcVar) { // from class: com.google.android.gms.internal.ads.zzbqt
            private final zzvc zzfxo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxo = zzvcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                ((zzbqw) obj).zzd(this.zzfxo);
            }
        });
    }
}
