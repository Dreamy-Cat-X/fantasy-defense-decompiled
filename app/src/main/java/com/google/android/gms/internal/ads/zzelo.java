package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzelo extends zzeln {
    private zzelo() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzeln
    public final <L> List<L> zza(Object obj, long j) {
        zzela zzc = zzc(obj, j);
        if (zzc.zzbgh()) {
            return zzc;
        }
        int size = zzc.size();
        zzela zzfy = zzc.zzfy(size == 0 ? 10 : size << 1);
        zzenw.zza(obj, j, zzfy);
        return zzfy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzeln
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzbgi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzeln
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzela zzc = zzc(obj, j);
        zzela zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzbgh()) {
                zzc = zzc.zzfy(size2 + size);
            }
            zzc.addAll(zzc2);
        }
        if (size > 0) {
            zzc2 = zzc;
        }
        zzenw.zza(obj, j, zzc2);
    }

    private static <E> zzela<E> zzc(Object obj, long j) {
        return (zzela) zzenw.zzp(obj, j);
    }
}
