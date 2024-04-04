package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbrl extends zzbvk<zzbrm> {
    public zzbrl(Set<zzbxf<zzbrm>> set) {
        super(set);
    }

    public final void zzcc(final Context context) {
        zza(new zzbvm(context) { // from class: com.google.android.gms.internal.ads.zzbro
            private final Context zzczq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzczq = context;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                ((zzbrm) obj).zzcc(this.zzczq);
            }
        });
    }

    public final void zzcd(final Context context) {
        zza(new zzbvm(context) { // from class: com.google.android.gms.internal.ads.zzbrn
            private final Context zzczq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzczq = context;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                ((zzbrm) obj).zzcd(this.zzczq);
            }
        });
    }

    public final void zzce(final Context context) {
        zza(new zzbvm(context) { // from class: com.google.android.gms.internal.ads.zzbrq
            private final Context zzczq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzczq = context;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                ((zzbrm) obj).zzce(this.zzczq);
            }
        });
    }

    public final void zza(zzbxv zzbxvVar, Executor executor) {
        zza(zzbxf.zzb(new zzbrp(this, zzbxvVar), executor));
    }
}
