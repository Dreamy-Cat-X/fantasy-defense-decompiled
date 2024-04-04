package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzena {
    private static final Class<?> zziss = zzbkr();
    private static final zzenq<?, ?> zzist = zzbt(false);
    private static final zzenq<?, ?> zzisu = zzbt(true);
    private static final zzenq<?, ?> zzisv = new zzens();

    public static void zzi(Class<?> cls) {
        Class<?> cls2;
        if (!zzekq.class.isAssignableFrom(cls) && (cls2 = zziss) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, List<Double> list, zzeon zzeonVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zzg(i, list, z);
    }

    public static void zzb(int i, List<Float> list, zzeon zzeonVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zzf(i, list, z);
    }

    public static void zzc(int i, List<Long> list, zzeon zzeonVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zzc(i, list, z);
    }

    public static void zzd(int i, List<Long> list, zzeon zzeonVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zzd(i, list, z);
    }

    public static void zze(int i, List<Long> list, zzeon zzeonVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zzn(i, list, z);
    }

    public static void zzf(int i, List<Long> list, zzeon zzeonVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zze(i, list, z);
    }

    public static void zzg(int i, List<Long> list, zzeon zzeonVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zzl(i, list, z);
    }

    public static void zzh(int i, List<Integer> list, zzeon zzeonVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zza(i, list, z);
    }

    public static void zzi(int i, List<Integer> list, zzeon zzeonVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zzj(i, list, z);
    }

    public static void zzj(int i, List<Integer> list, zzeon zzeonVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zzm(i, list, z);
    }

    public static void zzk(int i, List<Integer> list, zzeon zzeonVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zzb(i, list, z);
    }

    public static void zzl(int i, List<Integer> list, zzeon zzeonVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zzk(i, list, z);
    }

    public static void zzm(int i, List<Integer> list, zzeon zzeonVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zzh(i, list, z);
    }

    public static void zzn(int i, List<Boolean> list, zzeon zzeonVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zzi(i, list, z);
    }

    public static void zza(int i, List<String> list, zzeon zzeonVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zza(i, list);
    }

    public static void zzb(int i, List<zzejg> list, zzeon zzeonVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zzb(i, list);
    }

    public static void zza(int i, List<?> list, zzeon zzeonVar, zzemy zzemyVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zza(i, list, zzemyVar);
    }

    public static void zzb(int i, List<?> list, zzeon zzeonVar, zzemy zzemyVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeonVar.zzb(i, list, zzemyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzac(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzelr) {
            zzelr zzelrVar = (zzelr) list;
            i = 0;
            while (i2 < size) {
                i += zzeka.zzfk(zzelrVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzeka.zzfk(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzac(list) + (list.size() * zzeka.zzgv(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzad(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzelr) {
            zzelr zzelrVar = (zzelr) list;
            i = 0;
            while (i2 < size) {
                i += zzeka.zzfl(zzelrVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzeka.zzfl(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzad(list) + (size * zzeka.zzgv(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzae(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzelr) {
            zzelr zzelrVar = (zzelr) list;
            i = 0;
            while (i2 < size) {
                i += zzeka.zzfm(zzelrVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzeka.zzfm(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzae(list) + (size * zzeka.zzgv(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzaf(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzekt) {
            zzekt zzektVar = (zzekt) list;
            i = 0;
            while (i2 < size) {
                i += zzeka.zzhb(zzektVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzeka.zzhb(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaf(list) + (size * zzeka.zzgv(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzag(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzekt) {
            zzekt zzektVar = (zzekt) list;
            i = 0;
            while (i2 < size) {
                i += zzeka.zzgw(zzektVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzeka.zzgw(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzs(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzag(list) + (size * zzeka.zzgv(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzah(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzekt) {
            zzekt zzektVar = (zzekt) list;
            i = 0;
            while (i2 < size) {
                i += zzeka.zzgx(zzektVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzeka.zzgx(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzah(list) + (size * zzeka.zzgv(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzai(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzekt) {
            zzekt zzektVar = (zzekt) list;
            i = 0;
            while (i2 < size) {
                i += zzeka.zzgy(zzektVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzeka.zzgy(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzai(list) + (size * zzeka.zzgv(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzaj(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzeka.zzaj(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzak(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzeka.zzo(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzal(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzeka.zzi(i, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<?> list) {
        int zzic;
        int zzic2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzgv = zzeka.zzgv(i) * size;
        if (list instanceof zzelk) {
            zzelk zzelkVar = (zzelk) list;
            while (i2 < size) {
                Object zzhj = zzelkVar.zzhj(i2);
                if (zzhj instanceof zzejg) {
                    zzic2 = zzeka.zzaj((zzejg) zzhj);
                } else {
                    zzic2 = zzeka.zzic((String) zzhj);
                }
                zzgv += zzic2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzejg) {
                    zzic = zzeka.zzaj((zzejg) obj);
                } else {
                    zzic = zzeka.zzic((String) obj);
                }
                zzgv += zzic;
                i2++;
            }
        }
        return zzgv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, Object obj, zzemy zzemyVar) {
        if (obj instanceof zzeli) {
            return zzeka.zza(i, (zzeli) obj);
        }
        return zzeka.zzb(i, (zzemd) obj, zzemyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<?> list, zzemy zzemyVar) {
        int zza;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzgv = zzeka.zzgv(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzeli) {
                zza = zzeka.zza((zzeli) obj);
            } else {
                zza = zzeka.zza((zzemd) obj, zzemyVar);
            }
            zzgv += zza;
        }
        return zzgv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List<zzejg> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzgv = size * zzeka.zzgv(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgv += zzeka.zzaj(list.get(i2));
        }
        return zzgv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List<zzemd> list, zzemy zzemyVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzeka.zzc(i, list.get(i3), zzemyVar);
        }
        return i2;
    }

    public static zzenq<?, ?> zzbko() {
        return zzist;
    }

    public static zzenq<?, ?> zzbkp() {
        return zzisu;
    }

    public static zzenq<?, ?> zzbkq() {
        return zzisv;
    }

    private static zzenq<?, ?> zzbt(boolean z) {
        try {
            Class<?> zzbks = zzbks();
            if (zzbks == null) {
                return null;
            }
            return (zzenq) zzbks.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzbkr() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzbks() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzh(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void zza(zzelw zzelwVar, T t, T t2, long j) {
        zzenw.zza(t, j, zzelwVar.zzf(zzenw.zzp(t, j), zzenw.zzp(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzekl<FT>> void zza(zzekf<FT> zzekfVar, T t, T t2) {
        zzekj<FT> zzai = zzekfVar.zzai(t2);
        if (zzai.zzilz.isEmpty()) {
            return;
        }
        zzekfVar.zzaj(t).zza(zzai);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zza(zzenq<UT, UB> zzenqVar, T t, T t2) {
        zzenqVar.zzi(t, zzenqVar.zzk(zzenqVar.zzay(t), zzenqVar.zzay(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, List<Integer> list, zzekx zzekxVar, UB ub, zzenq<UT, UB> zzenqVar) {
        if (zzekxVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzekxVar.zzi(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(i, intValue, ub, zzenqVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzekxVar.zzi(intValue2)) {
                    ub = (UB) zza(i, intValue2, ub, zzenqVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, int i2, UB ub, zzenq<UT, UB> zzenqVar) {
        if (ub == null) {
            ub = zzenqVar.zzblb();
        }
        zzenqVar.zza((zzenq<UT, UB>) ub, i, i2);
        return ub;
    }
}
