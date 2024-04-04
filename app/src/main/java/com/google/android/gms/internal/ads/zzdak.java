package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdak implements zzdeu<zzder<Bundle>> {
    private final Set<String> zzgzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdak(Set<String> set) {
        this.zzgzd = set;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzder<Bundle>> zzata() {
        final ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.zzgzd.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return zzdyz.zzag(new zzder(arrayList) { // from class: com.google.android.gms.internal.ads.zzdaj
            private final ArrayList zzgzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgzc = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzder
            public final void zzr(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", this.zzgzc);
            }
        });
    }
}
