package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzdab implements zzdyj {
    static final zzdyj zzbon = new zzdab();

    private zzdab() {
    }

    @Override // com.google.android.gms.internal.ads.zzdyj
    public final zzdzl zzf(Object obj) {
        final String str = (String) obj;
        return zzdyz.zzag(new zzder(str) { // from class: com.google.android.gms.internal.ads.zzdae
            private final String zzdjy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdjy = str;
            }

            @Override // com.google.android.gms.internal.ads.zzder
            public final void zzr(Object obj2) {
                ((Bundle) obj2).putString("ms", this.zzdjy);
            }
        });
    }
}
