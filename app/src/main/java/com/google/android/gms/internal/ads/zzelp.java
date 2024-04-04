package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzelp extends zzeln {
    private static final Class<?> zziqo = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzelp() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzeln
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzeln
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzenw.zzp(obj, j);
        if (list instanceof zzelk) {
            unmodifiableList = ((zzelk) list).zzbjq();
        } else {
            if (zziqo.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzemp) && (list instanceof zzela)) {
                zzela zzelaVar = (zzela) list;
                if (zzelaVar.zzbgh()) {
                    zzelaVar.zzbgi();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzenw.zza(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j, int i) {
        zzell zzellVar;
        List<L> arrayList;
        List<L> zzd = zzd(obj, j);
        if (zzd.isEmpty()) {
            if (zzd instanceof zzelk) {
                arrayList = new zzell(i);
            } else if ((zzd instanceof zzemp) && (zzd instanceof zzela)) {
                arrayList = ((zzela) zzd).zzfy(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            zzenw.zza(obj, j, arrayList);
            return arrayList;
        }
        if (zziqo.isAssignableFrom(zzd.getClass())) {
            ArrayList arrayList2 = new ArrayList(zzd.size() + i);
            arrayList2.addAll(zzd);
            zzenw.zza(obj, j, arrayList2);
            zzellVar = arrayList2;
        } else if (zzd instanceof zzenv) {
            zzell zzellVar2 = new zzell(zzd.size() + i);
            zzellVar2.addAll((zzenv) zzd);
            zzenw.zza(obj, j, zzellVar2);
            zzellVar = zzellVar2;
        } else {
            if (!(zzd instanceof zzemp) || !(zzd instanceof zzela)) {
                return zzd;
            }
            zzela zzelaVar = (zzela) zzd;
            if (zzelaVar.zzbgh()) {
                return zzd;
            }
            zzela zzfy = zzelaVar.zzfy(zzd.size() + i);
            zzenw.zza(obj, j, zzfy);
            return zzfy;
        }
        return zzellVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzeln
    public final <E> void zza(Object obj, Object obj2, long j) {
        List zzd = zzd(obj2, j);
        List zza = zza(obj, j, zzd.size());
        int size = zza.size();
        int size2 = zzd.size();
        if (size > 0 && size2 > 0) {
            zza.addAll(zzd);
        }
        if (size > 0) {
            zzd = zza;
        }
        zzenw.zza(obj, j, zzd);
    }

    private static <E> List<E> zzd(Object obj, long j) {
        return (List) zzenw.zzp(obj, j);
    }
}
