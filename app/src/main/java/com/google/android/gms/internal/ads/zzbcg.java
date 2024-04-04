package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbcg implements Iterable<zzbce> {
    private final List<zzbce> zzens = new ArrayList();

    public static boolean zzc(zzbaq zzbaqVar) {
        zzbce zzd = zzd(zzbaqVar);
        if (zzd == null) {
            return false;
        }
        zzd.zzenr.abort();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbce zzd(zzbaq zzbaqVar) {
        Iterator<zzbce> it = com.google.android.gms.ads.internal.zzp.zzlm().iterator();
        while (it.hasNext()) {
            zzbce next = it.next();
            if (next.zzehb == zzbaqVar) {
                return next;
            }
        }
        return null;
    }

    public final void zza(zzbce zzbceVar) {
        this.zzens.add(zzbceVar);
    }

    public final void zzb(zzbce zzbceVar) {
        this.zzens.remove(zzbceVar);
    }

    @Override // java.lang.Iterable
    public final Iterator<zzbce> iterator() {
        return this.zzens.iterator();
    }
}
