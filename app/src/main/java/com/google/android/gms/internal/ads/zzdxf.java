package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdxf<K, V> extends zzdww<K, V> {
    private static final zzdww<Object, Object> zzhwp = new zzdxf(null, new Object[0], 0);
    private final transient int size;
    private final transient Object zzhwq;
    private final transient Object[] zzhwr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cc, code lost:
    
        r2[r7] = r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <K, V> zzdxf<K, V> zzc(int i, Object[] objArr) {
        byte[] bArr;
        if (i == 0) {
            return (zzdxf) zzhwp;
        }
        Object obj = null;
        int i2 = 0;
        if (i == 1) {
            zzdwm.zzb(objArr[0], objArr[1]);
            return new zzdxf<>(null, objArr, 1);
        }
        zzdwa.zzu(i, objArr.length >> 1);
        int zzer = zzdwv.zzer(i);
        if (i == 1) {
            zzdwm.zzb(objArr[0], objArr[1]);
        } else {
            int i3 = zzer - 1;
            if (zzer <= 128) {
                bArr = new byte[zzer];
                Arrays.fill(bArr, (byte) -1);
                while (i2 < i) {
                    int i4 = i2 * 2;
                    Object obj2 = objArr[i4];
                    Object obj3 = objArr[i4 ^ 1];
                    zzdwm.zzb(obj2, obj3);
                    int zzep = zzdwo.zzep(obj2.hashCode());
                    while (true) {
                        int i5 = zzep & i3;
                        int i6 = bArr[i5] & 255;
                        if (i6 == 255) {
                            break;
                        }
                        if (objArr[i6].equals(obj2)) {
                            throw zza(obj2, obj3, objArr, i6);
                        }
                        zzep = i5 + 1;
                    }
                }
            } else if (zzer <= 32768) {
                bArr = new short[zzer];
                Arrays.fill(bArr, (short) -1);
                while (i2 < i) {
                    int i7 = i2 * 2;
                    Object obj4 = objArr[i7];
                    Object obj5 = objArr[i7 ^ 1];
                    zzdwm.zzb(obj4, obj5);
                    int zzep2 = zzdwo.zzep(obj4.hashCode());
                    while (true) {
                        int i8 = zzep2 & i3;
                        int i9 = bArr[i8] & 65535;
                        if (i9 == 65535) {
                            break;
                        }
                        if (objArr[i9].equals(obj4)) {
                            throw zza(obj4, obj5, objArr, i9);
                        }
                        zzep2 = i8 + 1;
                    }
                }
            } else {
                bArr = new int[zzer];
                Arrays.fill((int[]) bArr, -1);
                while (i2 < i) {
                    int i10 = i2 * 2;
                    Object obj6 = objArr[i10];
                    Object obj7 = objArr[i10 ^ 1];
                    zzdwm.zzb(obj6, obj7);
                    int zzep3 = zzdwo.zzep(obj6.hashCode());
                    while (true) {
                        int i11 = zzep3 & i3;
                        ?? r8 = bArr[i11];
                        if (r8 == -1) {
                            break;
                        }
                        if (objArr[r8].equals(obj6)) {
                            throw zza(obj6, obj7, objArr, r8);
                        }
                        zzep3 = i11 + 1;
                    }
                }
            }
            obj = bArr;
        }
        return new zzdxf<>(obj, objArr, i);
    }

    private static IllegalArgumentException zza(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    private zzdxf(Object obj, Object[] objArr, int i) {
        this.zzhwq = obj;
        this.zzhwr = objArr;
        this.size = i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.ads.zzdww, java.util.Map
    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        Object obj2 = this.zzhwq;
        Object[] objArr = this.zzhwr;
        int i = this.size;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        }
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof byte[]) {
            byte[] bArr = (byte[]) obj2;
            int length = bArr.length - 1;
            int zzep = zzdwo.zzep(obj.hashCode());
            while (true) {
                int i2 = zzep & length;
                int i3 = bArr[i2] & 255;
                if (i3 == 255) {
                    return null;
                }
                if (objArr[i3].equals(obj)) {
                    return (V) objArr[i3 ^ 1];
                }
                zzep = i2 + 1;
            }
        } else if (obj2 instanceof short[]) {
            short[] sArr = (short[]) obj2;
            int length2 = sArr.length - 1;
            int zzep2 = zzdwo.zzep(obj.hashCode());
            while (true) {
                int i4 = zzep2 & length2;
                int i5 = sArr[i4] & 65535;
                if (i5 == 65535) {
                    return null;
                }
                if (objArr[i5].equals(obj)) {
                    return (V) objArr[i5 ^ 1];
                }
                zzep2 = i4 + 1;
            }
        } else {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length - 1;
            int zzep3 = zzdwo.zzep(obj.hashCode());
            while (true) {
                int i6 = zzep3 & length3;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    return null;
                }
                if (objArr[i7].equals(obj)) {
                    return (V) objArr[i7 ^ 1];
                }
                zzep3 = i6 + 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdww
    final zzdwv<Map.Entry<K, V>> zzazs() {
        return new zzdxi(this, this.zzhwr, 0, this.size);
    }

    @Override // com.google.android.gms.internal.ads.zzdww
    final zzdwv<K> zzazt() {
        return new zzdxk(this, new zzdxj(this.zzhwr, 0, this.size));
    }

    @Override // com.google.android.gms.internal.ads.zzdww
    final zzdwn<V> zzazu() {
        return new zzdxj(this.zzhwr, 1, this.size);
    }
}
