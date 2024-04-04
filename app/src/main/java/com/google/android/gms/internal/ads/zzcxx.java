package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzcxx implements zzbsy {
    private final AtomicReference<zzyo> zzgwr = new AtomicReference<>();

    public final void zzc(zzyo zzyoVar) {
        this.zzgwr.set(zzyoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzb(final zzvr zzvrVar) {
        zzdjl.zza(this.zzgwr, new zzdjo(zzvrVar) { // from class: com.google.android.gms.internal.ads.zzcxw
            private final zzvr zzfyh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfyh = zzvrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdjo
            public final void zzp(Object obj) {
                ((zzyo) obj).zza(this.zzfyh);
            }
        });
    }
}
