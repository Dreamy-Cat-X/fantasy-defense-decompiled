package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzene extends zzenk {
    private final /* synthetic */ zzend zzitc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzene(zzend zzendVar) {
        super(zzendVar, null);
        this.zzitc = zzendVar;
    }

    @Override // com.google.android.gms.internal.ads.zzenk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzenf(this.zzitc, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzene(zzend zzendVar, zzenc zzencVar) {
        this(zzendVar);
    }
}
