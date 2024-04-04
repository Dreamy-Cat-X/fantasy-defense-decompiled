package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdyl<V> extends zzdym<V, List<V>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyl(zzdwn<? extends zzdzl<? extends V>> zzdwnVar, boolean z) {
        super(zzdwnVar, true);
        zzazz();
    }

    @Override // com.google.android.gms.internal.ads.zzdym
    public final /* synthetic */ Object zzl(List list) {
        ArrayList zzet = zzdxa.zzet(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdyo zzdyoVar = (zzdyo) it.next();
            zzet.add(zzdyoVar != null ? zzdyoVar.value : null);
        }
        return Collections.unmodifiableList(zzet);
    }
}
