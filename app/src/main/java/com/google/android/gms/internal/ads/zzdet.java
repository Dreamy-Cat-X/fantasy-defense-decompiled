package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdet<T> {
    private final Executor executor;
    private final Set<zzdeu<? extends zzder<T>>> zzhbt;

    public zzdet(Executor executor, Set<zzdeu<? extends zzder<T>>> set) {
        this.executor = executor;
        this.zzhbt = set;
    }

    public final zzdzl<T> zzs(final T t) {
        final ArrayList arrayList = new ArrayList(this.zzhbt.size());
        for (final zzdeu<? extends zzder<T>> zzdeuVar : this.zzhbt) {
            zzdzl<? extends zzder<T>> zzata = zzdeuVar.zzata();
            if (zzadd.zzdda.get().booleanValue()) {
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime();
                zzata.addListener(new Runnable(zzdeuVar, elapsedRealtime) { // from class: com.google.android.gms.internal.ads.zzdew
                    private final zzdeu zzhbu;
                    private final long zzhbv;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzhbu = zzdeuVar;
                        this.zzhbv = elapsedRealtime;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdeu zzdeuVar2 = this.zzhbu;
                        long j = this.zzhbv;
                        String canonicalName = zzdeuVar2.getClass().getCanonicalName();
                        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - j;
                        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
                        sb.append("Signal runtime : ");
                        sb.append(canonicalName);
                        sb.append(" = ");
                        sb.append(elapsedRealtime2);
                        com.google.android.gms.ads.internal.util.zzd.zzeb(sb.toString());
                    }
                }, zzayv.zzegn);
            }
            arrayList.add(zzata);
        }
        return zzdyz.zzk(arrayList).zzb(new Callable(arrayList, t) { // from class: com.google.android.gms.internal.ads.zzdev
            private final Object zzdkb;
            private final List zzhbb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhbb = arrayList;
                this.zzdkb = t;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = this.zzhbb;
                Object obj = this.zzdkb;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzder zzderVar = (zzder) ((zzdzl) it.next()).get();
                    if (zzderVar != null) {
                        zzderVar.zzr(obj);
                    }
                }
                return obj;
            }
        }, this.executor);
    }
}
