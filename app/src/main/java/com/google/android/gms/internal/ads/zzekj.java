package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzekj<T extends zzekl<T>> {
    private static final zzekj zzimc = new zzekj(true);
    final zzend<T, Object> zzilz;
    private boolean zzima;
    private boolean zzimb;

    private zzekj() {
        this.zzilz = zzend.zzht(16);
    }

    private zzekj(boolean z) {
        this(zzend.zzht(0));
        zzbgi();
    }

    private zzekj(zzend<T, Object> zzendVar) {
        this.zzilz = zzendVar;
        zzbgi();
    }

    public static <T extends zzekl<T>> zzekj<T> zzbie() {
        return zzimc;
    }

    public final void zzbgi() {
        if (this.zzima) {
            return;
        }
        this.zzilz.zzbgi();
        this.zzima = true;
    }

    public final boolean isImmutable() {
        return this.zzima;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzekj) {
            return this.zzilz.equals(((zzekj) obj).zzilz);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzilz.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> iterator() {
        if (this.zzimb) {
            return new zzelj(this.zzilz.entrySet().iterator());
        }
        return this.zzilz.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> descendingIterator() {
        if (this.zzimb) {
            return new zzelj(this.zzilz.zzbkv().iterator());
        }
        return this.zzilz.zzbkv().iterator();
    }

    private final Object zza(T t) {
        Object obj = this.zzilz.get(t);
        if (!(obj instanceof zzele)) {
            return obj;
        }
        return zzele.zzbjm();
    }

    private final void zza(T t, Object obj) {
        if (t.zzbii()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(t.zzbig(), obj2);
            }
            obj = arrayList;
        } else {
            zza(t.zzbig(), obj);
        }
        if (obj instanceof zzele) {
            this.zzimb = true;
        }
        this.zzilz.zza((zzend<T, Object>) t, (T) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.ads.zzele) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.ads.zzekv) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzeoh zzeohVar, Object obj) {
        zzeks.checkNotNull(obj);
        boolean z = true;
        switch (zzeki.zzily[zzeohVar.zzbll().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof zzejg)) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof zzemd)) {
                    break;
                }
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzilz.zzbkt(); i++) {
            if (!zzb(this.zzilz.zzhu(i))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zzilz.zzbku().iterator();
        while (it.hasNext()) {
            if (!zzb(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static <T extends zzekl<T>> boolean zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzbih() == zzeok.MESSAGE) {
            if (key.zzbii()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((zzemd) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzemd) {
                    if (!((zzemd) value).isInitialized()) {
                        return false;
                    }
                } else {
                    if (value instanceof zzele) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzekj<T> zzekjVar) {
        for (int i = 0; i < zzekjVar.zzilz.zzbkt(); i++) {
            zzc(zzekjVar.zzilz.zzhu(i));
        }
        Iterator<Map.Entry<T, Object>> it = zzekjVar.zzilz.zzbku().iterator();
        while (it.hasNext()) {
            zzc(it.next());
        }
    }

    private static Object zzal(Object obj) {
        if (obj instanceof zzemi) {
            return ((zzemi) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final void zzc(Map.Entry<T, Object> entry) {
        zzemd zzbiz;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzele) {
            value = zzele.zzbjm();
        }
        if (key.zzbii()) {
            Object zza = zza((zzekj<T>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) zza).add(zzal(it.next()));
            }
            this.zzilz.zza((zzend<T, Object>) key, (T) zza);
            return;
        }
        if (key.zzbih() == zzeok.MESSAGE) {
            Object zza2 = zza((zzekj<T>) key);
            if (zza2 == null) {
                this.zzilz.zza((zzend<T, Object>) key, (T) zzal(value));
                return;
            }
            if (zza2 instanceof zzemi) {
                zzbiz = key.zza((zzemi) zza2, (zzemi) value);
            } else {
                zzbiz = key.zza(((zzemd) zza2).zzbir(), (zzemd) value).zzbiz();
            }
            this.zzilz.zza((zzend<T, Object>) key, (T) zzbiz);
            return;
        }
        this.zzilz.zza((zzend<T, Object>) key, (T) zzal(value));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzeka zzekaVar, zzeoh zzeohVar, int i, Object obj) throws IOException {
        if (zzeohVar == zzeoh.zziuv) {
            zzemd zzemdVar = (zzemd) obj;
            zzeks.zzk(zzemdVar);
            zzekaVar.writeTag(i, 3);
            zzemdVar.zzb(zzekaVar);
            zzekaVar.writeTag(i, 4);
            return;
        }
        zzekaVar.writeTag(i, zzeohVar.zzblm());
        switch (zzeki.zzili[zzeohVar.ordinal()]) {
            case 1:
                zzekaVar.zzc(((Double) obj).doubleValue());
                return;
            case 2:
                zzekaVar.zzf(((Float) obj).floatValue());
                return;
            case 3:
                zzekaVar.zzfh(((Long) obj).longValue());
                return;
            case 4:
                zzekaVar.zzfh(((Long) obj).longValue());
                return;
            case 5:
                zzekaVar.zzgr(((Integer) obj).intValue());
                return;
            case 6:
                zzekaVar.zzfj(((Long) obj).longValue());
                return;
            case 7:
                zzekaVar.zzgu(((Integer) obj).intValue());
                return;
            case 8:
                zzekaVar.zzbq(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzemd) obj).zzb(zzekaVar);
                return;
            case 10:
                zzekaVar.zzg((zzemd) obj);
                return;
            case 11:
                if (obj instanceof zzejg) {
                    zzekaVar.zzai((zzejg) obj);
                    return;
                } else {
                    zzekaVar.zzib((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzejg) {
                    zzekaVar.zzai((zzejg) obj);
                    return;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzekaVar.zzk(bArr, 0, bArr.length);
                    return;
                }
            case 13:
                zzekaVar.zzgs(((Integer) obj).intValue());
                return;
            case 14:
                zzekaVar.zzgu(((Integer) obj).intValue());
                return;
            case 15:
                zzekaVar.zzfj(((Long) obj).longValue());
                return;
            case 16:
                zzekaVar.zzgt(((Integer) obj).intValue());
                return;
            case 17:
                zzekaVar.zzfi(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzekv) {
                    zzekaVar.zzgr(((zzekv) obj).zzv());
                    return;
                } else {
                    zzekaVar.zzgr(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzbif() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzilz.zzbkt(); i2++) {
            i += zzd(this.zzilz.zzhu(i2));
        }
        Iterator<Map.Entry<T, Object>> it = this.zzilz.zzbku().iterator();
        while (it.hasNext()) {
            i += zzd(it.next());
        }
        return i;
    }

    private static int zzd(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzbih() == zzeok.MESSAGE && !key.zzbii() && !key.zzbij()) {
            if (value instanceof zzele) {
                return zzeka.zzb(entry.getKey().zzv(), (zzele) value);
            }
            return zzeka.zzb(entry.getKey().zzv(), (zzemd) value);
        }
        return zzb((zzekl<?>) key, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzeoh zzeohVar, int i, Object obj) {
        int zzgv = zzeka.zzgv(i);
        if (zzeohVar == zzeoh.zziuv) {
            zzeks.zzk((zzemd) obj);
            zzgv <<= 1;
        }
        return zzgv + zzb(zzeohVar, obj);
    }

    private static int zzb(zzeoh zzeohVar, Object obj) {
        switch (zzeki.zzili[zzeohVar.ordinal()]) {
            case 1:
                return zzeka.zzd(((Double) obj).doubleValue());
            case 2:
                return zzeka.zzg(((Float) obj).floatValue());
            case 3:
                return zzeka.zzfk(((Long) obj).longValue());
            case 4:
                return zzeka.zzfl(((Long) obj).longValue());
            case 5:
                return zzeka.zzgw(((Integer) obj).intValue());
            case 6:
                return zzeka.zzfn(((Long) obj).longValue());
            case 7:
                return zzeka.zzgz(((Integer) obj).intValue());
            case 8:
                return zzeka.zzbr(((Boolean) obj).booleanValue());
            case 9:
                return zzeka.zzi((zzemd) obj);
            case 10:
                if (obj instanceof zzele) {
                    return zzeka.zza((zzele) obj);
                }
                return zzeka.zzh((zzemd) obj);
            case 11:
                if (obj instanceof zzejg) {
                    return zzeka.zzaj((zzejg) obj);
                }
                return zzeka.zzic((String) obj);
            case 12:
                if (obj instanceof zzejg) {
                    return zzeka.zzaj((zzejg) obj);
                }
                return zzeka.zzw((byte[]) obj);
            case 13:
                return zzeka.zzgx(((Integer) obj).intValue());
            case 14:
                return zzeka.zzha(((Integer) obj).intValue());
            case 15:
                return zzeka.zzfo(((Long) obj).longValue());
            case 16:
                return zzeka.zzgy(((Integer) obj).intValue());
            case 17:
                return zzeka.zzfm(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzekv) {
                    return zzeka.zzhb(((zzekv) obj).zzv());
                }
                return zzeka.zzhb(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(zzekl<?> zzeklVar, Object obj) {
        zzeoh zzbig = zzeklVar.zzbig();
        int zzv = zzeklVar.zzv();
        if (zzeklVar.zzbii()) {
            int i = 0;
            if (zzeklVar.zzbij()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    i += zzb(zzbig, it.next());
                }
                return zzeka.zzgv(zzv) + i + zzeka.zzhd(i);
            }
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                i += zza(zzbig, zzv, it2.next());
            }
            return i;
        }
        return zza(zzbig, zzv, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzekj zzekjVar = new zzekj();
        for (int i = 0; i < this.zzilz.zzbkt(); i++) {
            Map.Entry<T, Object> zzhu = this.zzilz.zzhu(i);
            zzekjVar.zza((zzekj) zzhu.getKey(), zzhu.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zzilz.zzbku()) {
            zzekjVar.zza((zzekj) entry.getKey(), entry.getValue());
        }
        zzekjVar.zzimb = this.zzimb;
        return zzekjVar;
    }
}
