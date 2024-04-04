package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzczq implements zzdyj<zzasu, zzczr> {
    private Executor executor;
    private zzcme zzgyl;

    public zzczq(Executor executor, zzcme zzcmeVar) {
        this.executor = executor;
        this.zzgyl = zzcmeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyj
    public final /* synthetic */ zzdzl<zzczr> zzf(zzasu zzasuVar) throws Exception {
        final zzasu zzasuVar2 = zzasuVar;
        return zzdyz.zzb(this.zzgyl.zzg(zzasuVar2), new zzdyj(zzasuVar2) { // from class: com.google.android.gms.internal.ads.zzczp
            private final zzasu zzfxz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxz = zzasuVar2;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return zzdyz.zzag(new zzczr(new JsonReader(new InputStreamReader((InputStream) obj))).zzn(this.zzfxz.zzdvn));
            }
        }, this.executor);
    }
}
