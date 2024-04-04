package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzcej implements zzdvo {
    static final zzdvo zzdyn = new zzcej();

    private zzcej() {
    }

    @Override // com.google.android.gms.internal.ads.zzdvo
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzcel zzcelVar : (List) obj) {
            if (zzcelVar != null) {
                arrayList.add(zzcelVar);
            }
        }
        return arrayList;
    }
}
