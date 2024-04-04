package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzdav implements zzdvo {
    static final zzdvo zzdyn = new zzdav();

    private zzdav() {
    }

    @Override // com.google.android.gms.internal.ads.zzdvo
    public final Object apply(Object obj) {
        final ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzder(arrayList) { // from class: com.google.android.gms.internal.ads.zzday
            private final ArrayList zzgzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgzc = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzder
            public final void zzr(Object obj2) {
                ((Bundle) obj2).putStringArrayList("android_permissions", this.zzgzc);
            }
        };
    }
}
