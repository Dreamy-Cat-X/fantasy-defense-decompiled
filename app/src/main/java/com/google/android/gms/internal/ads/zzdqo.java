package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdqo {
    private final E zzhof;
    private final /* synthetic */ zzdqk zzhoj;

    private zzdqo(zzdqk zzdqkVar, E e) {
        this.zzhoj = zzdqkVar;
        this.zzhof = e;
    }

    public final <O> zzdqq<O> zze(zzdzl<O> zzdzlVar) {
        zzdzl zzdzlVar2;
        zzdqk zzdqkVar = this.zzhoj;
        E e = this.zzhof;
        zzdzlVar2 = zzdqk.zzhod;
        return new zzdqq<>(zzdqkVar, e, zzdzlVar2, Collections.emptyList(), zzdzlVar);
    }

    public final <O> zzdqq<O> zzc(Callable<O> callable) {
        zzdzk zzdzkVar;
        zzdzkVar = this.zzhoj.zzgfs;
        return zza(callable, zzdzkVar);
    }

    private final <O> zzdqq<O> zza(Callable<O> callable, zzdzk zzdzkVar) {
        zzdzl zzdzlVar;
        zzdqk zzdqkVar = this.zzhoj;
        E e = this.zzhof;
        zzdzlVar = zzdqk.zzhod;
        return new zzdqq<>(zzdqkVar, e, zzdzlVar, Collections.emptyList(), zzdzkVar.submit(callable));
    }

    public final zzdqq<?> zza(final zzdqi zzdqiVar, zzdzk zzdzkVar) {
        return zza(new Callable(zzdqiVar) { // from class: com.google.android.gms.internal.ads.zzdqr
            private final zzdqi zzhom;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhom = zzdqiVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.zzhom.run();
                return null;
            }
        }, zzdzkVar);
    }
}
