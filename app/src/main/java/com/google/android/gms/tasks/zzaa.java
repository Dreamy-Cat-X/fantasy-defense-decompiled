package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [TResult] */
/* compiled from: com.google.android.gms:play-services-tasks@@17.1.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzaa<TResult> implements Continuation<Void, List<TResult>> {
    private final /* synthetic */ Collection zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaa(Collection collection) {
        this.zza = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task<Void> task) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add(((Task) it.next()).getResult());
        }
        return arrayList;
    }
}
