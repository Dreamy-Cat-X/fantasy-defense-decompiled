package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzbvk<ListenerT> {
    private final Map<ListenerT, Executor> zzfym = new HashMap();

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbvk(Set<zzbxf<ListenerT>> set) {
        zzb(set);
    }

    public final synchronized void zza(zzbxf<ListenerT> zzbxfVar) {
        zza(zzbxfVar.zzfzh, zzbxfVar.executor);
    }

    public final synchronized void zza(ListenerT listenert, Executor executor) {
        this.zzfym.put(listenert, executor);
    }

    private final synchronized void zzb(Set<zzbxf<ListenerT>> set) {
        Iterator<zzbxf<ListenerT>> it = set.iterator();
        while (it.hasNext()) {
            zza(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zza(final zzbvm<ListenerT> zzbvmVar) {
        for (Map.Entry<ListenerT, Executor> entry : this.zzfym.entrySet()) {
            final ListenerT key = entry.getKey();
            entry.getValue().execute(new Runnable(zzbvmVar, key) { // from class: com.google.android.gms.internal.ads.zzbvj
                private final Object zzdkb;
                private final zzbvm zzfyl;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfyl = zzbvmVar;
                    this.zzdkb = key;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.zzfyl.zzo(this.zzdkb);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzp.zzku().zzb(th, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zzd.zza("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
