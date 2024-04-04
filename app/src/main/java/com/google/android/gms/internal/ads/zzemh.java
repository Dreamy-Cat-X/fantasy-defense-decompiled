package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzemh<T> implements zzemy<T> {
    private final int[] zzirb;
    private final Object[] zzirc;
    private final int zzird;
    private final int zzire;
    private final zzemd zzirf;
    private final boolean zzirg;
    private final boolean zzirh;
    private final boolean zziri;
    private final boolean zzirj;
    private final int[] zzirk;
    private final int zzirl;
    private final int zzirm;
    private final zzeml zzirn;
    private final zzeln zziro;
    private final zzenq<?, ?> zzirp;
    private final zzekf<?> zzirq;
    private final zzelw zzirr;
    private static final int[] zzira = new int[0];
    private static final Unsafe zzhxt = zzenw.zzblh();

    private zzemh(int[] iArr, Object[] objArr, int i, int i2, zzemd zzemdVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzeml zzemlVar, zzeln zzelnVar, zzenq<?, ?> zzenqVar, zzekf<?> zzekfVar, zzelw zzelwVar) {
        this.zzirb = iArr;
        this.zzirc = objArr;
        this.zzird = i;
        this.zzire = i2;
        this.zzirh = zzemdVar instanceof zzekq;
        this.zziri = z;
        this.zzirg = zzekfVar != null && zzekfVar.zzj(zzemdVar);
        this.zzirj = false;
        this.zzirk = iArr2;
        this.zzirl = i3;
        this.zzirm = i4;
        this.zzirn = zzemlVar;
        this.zziro = zzelnVar;
        this.zzirp = zzenqVar;
        this.zzirq = zzekfVar;
        this.zzirf = zzemdVar;
        this.zzirr = zzelwVar;
    }

    private static boolean zzhp(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x039c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> zzemh<T> zza(Class<T> cls, zzemb zzembVar, zzeml zzemlVar, zzeln zzelnVar, zzenq<?, ?> zzenqVar, zzekf<?> zzekfVar, zzelw zzelwVar) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int charAt5;
        int i2;
        int[] iArr;
        int i3;
        char charAt6;
        int i4;
        char charAt7;
        int i5;
        char charAt8;
        int i6;
        char charAt9;
        int i7;
        char charAt10;
        int i8;
        char charAt11;
        int i9;
        char charAt12;
        int i10;
        char charAt13;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int objectFieldOffset;
        String str;
        boolean z;
        Object[] objArr;
        int i16;
        int i17;
        int i18;
        Field zza;
        int i19;
        char charAt14;
        int i20;
        int i21;
        Field zza2;
        Field zza3;
        int i22;
        char charAt15;
        int i23;
        char charAt16;
        int i24;
        char charAt17;
        int i25;
        char charAt18;
        if (zzembVar instanceof zzemt) {
            zzemt zzemtVar = (zzemt) zzembVar;
            int i26 = 0;
            boolean z2 = zzemtVar.zzbkb() == zzemo.zzirv;
            String zzbkj = zzemtVar.zzbkj();
            int length = zzbkj.length();
            if (zzbkj.charAt(0) >= 55296) {
                int i27 = 1;
                while (true) {
                    i = i27 + 1;
                    if (zzbkj.charAt(i27) < 55296) {
                        break;
                    }
                    i27 = i;
                }
            } else {
                i = 1;
            }
            int i28 = i + 1;
            int charAt19 = zzbkj.charAt(i);
            if (charAt19 >= 55296) {
                int i29 = charAt19 & 8191;
                int i30 = 13;
                while (true) {
                    i25 = i28 + 1;
                    charAt18 = zzbkj.charAt(i28);
                    if (charAt18 < 55296) {
                        break;
                    }
                    i29 |= (charAt18 & 8191) << i30;
                    i30 += 13;
                    i28 = i25;
                }
                charAt19 = i29 | (charAt18 << i30);
                i28 = i25;
            }
            if (charAt19 == 0) {
                iArr = zzira;
                i2 = 0;
                charAt = 0;
                charAt2 = 0;
                charAt3 = 0;
                charAt4 = 0;
                charAt5 = 0;
            } else {
                int i31 = i28 + 1;
                int charAt20 = zzbkj.charAt(i28);
                if (charAt20 >= 55296) {
                    int i32 = charAt20 & 8191;
                    int i33 = 13;
                    while (true) {
                        i10 = i31 + 1;
                        charAt13 = zzbkj.charAt(i31);
                        if (charAt13 < 55296) {
                            break;
                        }
                        i32 |= (charAt13 & 8191) << i33;
                        i33 += 13;
                        i31 = i10;
                    }
                    charAt20 = i32 | (charAt13 << i33);
                    i31 = i10;
                }
                int i34 = i31 + 1;
                int charAt21 = zzbkj.charAt(i31);
                if (charAt21 >= 55296) {
                    int i35 = charAt21 & 8191;
                    int i36 = 13;
                    while (true) {
                        i9 = i34 + 1;
                        charAt12 = zzbkj.charAt(i34);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i35 |= (charAt12 & 8191) << i36;
                        i36 += 13;
                        i34 = i9;
                    }
                    charAt21 = i35 | (charAt12 << i36);
                    i34 = i9;
                }
                int i37 = i34 + 1;
                charAt = zzbkj.charAt(i34);
                if (charAt >= 55296) {
                    int i38 = charAt & 8191;
                    int i39 = 13;
                    while (true) {
                        i8 = i37 + 1;
                        charAt11 = zzbkj.charAt(i37);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i38 |= (charAt11 & 8191) << i39;
                        i39 += 13;
                        i37 = i8;
                    }
                    charAt = i38 | (charAt11 << i39);
                    i37 = i8;
                }
                int i40 = i37 + 1;
                charAt2 = zzbkj.charAt(i37);
                if (charAt2 >= 55296) {
                    int i41 = charAt2 & 8191;
                    int i42 = 13;
                    while (true) {
                        i7 = i40 + 1;
                        charAt10 = zzbkj.charAt(i40);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i41 |= (charAt10 & 8191) << i42;
                        i42 += 13;
                        i40 = i7;
                    }
                    charAt2 = i41 | (charAt10 << i42);
                    i40 = i7;
                }
                int i43 = i40 + 1;
                charAt3 = zzbkj.charAt(i40);
                if (charAt3 >= 55296) {
                    int i44 = charAt3 & 8191;
                    int i45 = 13;
                    while (true) {
                        i6 = i43 + 1;
                        charAt9 = zzbkj.charAt(i43);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i44 |= (charAt9 & 8191) << i45;
                        i45 += 13;
                        i43 = i6;
                    }
                    charAt3 = i44 | (charAt9 << i45);
                    i43 = i6;
                }
                int i46 = i43 + 1;
                charAt4 = zzbkj.charAt(i43);
                if (charAt4 >= 55296) {
                    int i47 = charAt4 & 8191;
                    int i48 = 13;
                    while (true) {
                        i5 = i46 + 1;
                        charAt8 = zzbkj.charAt(i46);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i47 |= (charAt8 & 8191) << i48;
                        i48 += 13;
                        i46 = i5;
                    }
                    charAt4 = i47 | (charAt8 << i48);
                    i46 = i5;
                }
                int i49 = i46 + 1;
                int charAt22 = zzbkj.charAt(i46);
                if (charAt22 >= 55296) {
                    int i50 = charAt22 & 8191;
                    int i51 = 13;
                    while (true) {
                        i4 = i49 + 1;
                        charAt7 = zzbkj.charAt(i49);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i50 |= (charAt7 & 8191) << i51;
                        i51 += 13;
                        i49 = i4;
                    }
                    charAt22 = i50 | (charAt7 << i51);
                    i49 = i4;
                }
                int i52 = i49 + 1;
                charAt5 = zzbkj.charAt(i49);
                if (charAt5 >= 55296) {
                    int i53 = charAt5 & 8191;
                    int i54 = i52;
                    int i55 = 13;
                    while (true) {
                        i3 = i54 + 1;
                        charAt6 = zzbkj.charAt(i54);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i53 |= (charAt6 & 8191) << i55;
                        i55 += 13;
                        i54 = i3;
                    }
                    charAt5 = i53 | (charAt6 << i55);
                    i52 = i3;
                }
                i2 = (charAt20 << 1) + charAt21;
                iArr = new int[charAt5 + charAt4 + charAt22];
                i26 = charAt20;
                i28 = i52;
            }
            Unsafe unsafe = zzhxt;
            Object[] zzbkk = zzemtVar.zzbkk();
            Class<?> cls2 = zzemtVar.zzbkd().getClass();
            int i56 = i28;
            int[] iArr2 = new int[charAt3 * 3];
            Object[] objArr2 = new Object[charAt3 << 1];
            int i57 = charAt5 + charAt4;
            int i58 = i2;
            int i59 = charAt5;
            int i60 = i56;
            int i61 = i57;
            int i62 = 0;
            int i63 = 0;
            while (i60 < length) {
                int i64 = i60 + 1;
                int charAt23 = zzbkj.charAt(i60);
                if (charAt23 >= 55296) {
                    int i65 = charAt23 & 8191;
                    int i66 = i64;
                    int i67 = 13;
                    while (true) {
                        i24 = i66 + 1;
                        charAt17 = zzbkj.charAt(i66);
                        i11 = length;
                        if (charAt17 < 55296) {
                            break;
                        }
                        i65 |= (charAt17 & 8191) << i67;
                        i67 += 13;
                        i66 = i24;
                        length = i11;
                    }
                    charAt23 = i65 | (charAt17 << i67);
                    i12 = i24;
                } else {
                    i11 = length;
                    i12 = i64;
                }
                int i68 = i12 + 1;
                int charAt24 = zzbkj.charAt(i12);
                if (charAt24 >= 55296) {
                    int i69 = charAt24 & 8191;
                    int i70 = i68;
                    int i71 = 13;
                    while (true) {
                        i23 = i70 + 1;
                        charAt16 = zzbkj.charAt(i70);
                        i13 = charAt5;
                        if (charAt16 < 55296) {
                            break;
                        }
                        i69 |= (charAt16 & 8191) << i71;
                        i71 += 13;
                        i70 = i23;
                        charAt5 = i13;
                    }
                    charAt24 = i69 | (charAt16 << i71);
                    i14 = i23;
                } else {
                    i13 = charAt5;
                    i14 = i68;
                }
                int i72 = charAt24 & 255;
                int i73 = charAt2;
                if ((charAt24 & 1024) != 0) {
                    iArr[i62] = i63;
                    i62++;
                }
                int i74 = charAt;
                if (i72 >= 51) {
                    int i75 = i14 + 1;
                    int charAt25 = zzbkj.charAt(i14);
                    char c = 55296;
                    if (charAt25 >= 55296) {
                        int i76 = charAt25 & 8191;
                        int i77 = 13;
                        while (true) {
                            i22 = i75 + 1;
                            charAt15 = zzbkj.charAt(i75);
                            if (charAt15 < c) {
                                break;
                            }
                            i76 |= (charAt15 & 8191) << i77;
                            i77 += 13;
                            i75 = i22;
                            c = 55296;
                        }
                        charAt25 = i76 | (charAt15 << i77);
                        i75 = i22;
                    }
                    int i78 = i72 - 51;
                    int i79 = i75;
                    if (i78 == 9 || i78 == 17) {
                        i21 = 1;
                        objArr2[((i63 / 3) << 1) + 1] = zzbkk[i58];
                        i58++;
                    } else {
                        if (i78 == 12 && !z2) {
                            objArr2[((i63 / 3) << 1) + 1] = zzbkk[i58];
                            i58++;
                        }
                        i21 = 1;
                    }
                    int i80 = charAt25 << i21;
                    Object obj = zzbkk[i80];
                    if (obj instanceof Field) {
                        zza2 = (Field) obj;
                    } else {
                        zza2 = zza(cls2, (String) obj);
                        zzbkk[i80] = zza2;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zza2);
                    int i81 = i80 + 1;
                    Object obj2 = zzbkk[i81];
                    if (obj2 instanceof Field) {
                        zza3 = (Field) obj2;
                    } else {
                        zza3 = zza(cls2, (String) obj2);
                        zzbkk[i81] = zza3;
                    }
                    str = zzbkj;
                    i16 = (int) unsafe.objectFieldOffset(zza3);
                    z = z2;
                    objArr = objArr2;
                    objectFieldOffset = objectFieldOffset2;
                    i17 = i79;
                    i18 = 0;
                } else {
                    int i82 = i58 + 1;
                    Field zza4 = zza(cls2, (String) zzbkk[i58]);
                    if (i72 == 9 || i72 == 17) {
                        objArr2[((i63 / 3) << 1) + 1] = zza4.getType();
                    } else {
                        if (i72 == 27 || i72 == 49) {
                            i20 = i82 + 1;
                            objArr2[((i63 / 3) << 1) + 1] = zzbkk[i82];
                        } else {
                            if (i72 == 12 || i72 == 30 || i72 == 44) {
                                if (!z2) {
                                    i20 = i82 + 1;
                                    objArr2[((i63 / 3) << 1) + 1] = zzbkk[i82];
                                }
                            } else if (i72 == 50) {
                                int i83 = i59 + 1;
                                iArr[i59] = i63;
                                int i84 = (i63 / 3) << 1;
                                i20 = i82 + 1;
                                objArr2[i84] = zzbkk[i82];
                                if ((charAt24 & 2048) != 0) {
                                    i82 = i20 + 1;
                                    objArr2[i84 + 1] = zzbkk[i20];
                                    i59 = i83;
                                } else {
                                    i59 = i83;
                                }
                            }
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zza4);
                            int i85 = i15;
                            if ((charAt24 & 4096) == 4096 || i72 > 17) {
                                str = zzbkj;
                                z = z2;
                                objArr = objArr2;
                                i16 = 1048575;
                                i17 = i14;
                                i18 = 0;
                            } else {
                                int i86 = i14 + 1;
                                int charAt26 = zzbkj.charAt(i14);
                                if (charAt26 >= 55296) {
                                    int i87 = charAt26 & 8191;
                                    int i88 = 13;
                                    while (true) {
                                        i19 = i86 + 1;
                                        charAt14 = zzbkj.charAt(i86);
                                        if (charAt14 < 55296) {
                                            break;
                                        }
                                        i87 |= (charAt14 & 8191) << i88;
                                        i88 += 13;
                                        i86 = i19;
                                    }
                                    charAt26 = i87 | (charAt14 << i88);
                                    i86 = i19;
                                }
                                int i89 = (i26 << 1) + (charAt26 / 32);
                                Object obj3 = zzbkk[i89];
                                str = zzbkj;
                                if (obj3 instanceof Field) {
                                    zza = (Field) obj3;
                                } else {
                                    zza = zza(cls2, (String) obj3);
                                    zzbkk[i89] = zza;
                                }
                                z = z2;
                                objArr = objArr2;
                                i18 = charAt26 % 32;
                                i17 = i86;
                                i16 = (int) unsafe.objectFieldOffset(zza);
                            }
                            if (i72 >= 18 && i72 <= 49) {
                                iArr[i61] = objectFieldOffset;
                                i61++;
                            }
                            i58 = i85;
                        }
                        i15 = i20;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zza4);
                        int i852 = i15;
                        if ((charAt24 & 4096) == 4096) {
                        }
                        str = zzbkj;
                        z = z2;
                        objArr = objArr2;
                        i16 = 1048575;
                        i17 = i14;
                        i18 = 0;
                        if (i72 >= 18) {
                            iArr[i61] = objectFieldOffset;
                            i61++;
                        }
                        i58 = i852;
                    }
                    i15 = i82;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza4);
                    int i8522 = i15;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = zzbkj;
                    z = z2;
                    objArr = objArr2;
                    i16 = 1048575;
                    i17 = i14;
                    i18 = 0;
                    if (i72 >= 18) {
                    }
                    i58 = i8522;
                }
                int i90 = i63 + 1;
                iArr2[i63] = charAt23;
                int i91 = i90 + 1;
                int i92 = i26;
                iArr2[i90] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i72 << 20) | objectFieldOffset;
                int i93 = i91 + 1;
                iArr2[i91] = (i18 << 20) | i16;
                i60 = i17;
                i26 = i92;
                charAt2 = i73;
                objArr2 = objArr;
                charAt5 = i13;
                charAt = i74;
                z2 = z;
                i63 = i93;
                length = i11;
                zzbkj = str;
            }
            return new zzemh<>(iArr2, objArr2, charAt, charAt2, zzemtVar.zzbkd(), z2, false, iArr, charAt5, i57, zzemlVar, zzelnVar, zzenqVar, zzekfVar, zzelwVar);
        }
        ((zzenn) zzembVar).zzbkb();
        int i94 = zzemo.zzirv;
        throw new NoSuchMethodError();
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemy
    public final T newInstance() {
        return (T) this.zzirn.newInstance(this.zzirf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (com.google.android.gms.internal.ads.zzena.zzh(com.google.android.gms.internal.ads.zzenw.zzp(r10, r6), com.google.android.gms.internal.ads.zzenw.zzp(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.ads.zzenw.zzl(r10, r6) == com.google.android.gms.internal.ads.zzenw.zzl(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (com.google.android.gms.internal.ads.zzenw.zzk(r10, r6) == com.google.android.gms.internal.ads.zzenw.zzk(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (com.google.android.gms.internal.ads.zzenw.zzl(r10, r6) == com.google.android.gms.internal.ads.zzenw.zzl(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (com.google.android.gms.internal.ads.zzenw.zzk(r10, r6) == com.google.android.gms.internal.ads.zzenw.zzk(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (com.google.android.gms.internal.ads.zzenw.zzk(r10, r6) == com.google.android.gms.internal.ads.zzenw.zzk(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if (com.google.android.gms.internal.ads.zzenw.zzk(r10, r6) == com.google.android.gms.internal.ads.zzenw.zzk(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        if (com.google.android.gms.internal.ads.zzena.zzh(com.google.android.gms.internal.ads.zzenw.zzp(r10, r6), com.google.android.gms.internal.ads.zzenw.zzp(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        if (com.google.android.gms.internal.ads.zzena.zzh(com.google.android.gms.internal.ads.zzenw.zzp(r10, r6), com.google.android.gms.internal.ads.zzenw.zzp(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (com.google.android.gms.internal.ads.zzena.zzh(com.google.android.gms.internal.ads.zzenw.zzp(r10, r6), com.google.android.gms.internal.ads.zzenw.zzp(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012e, code lost:
    
        if (com.google.android.gms.internal.ads.zzenw.zzm(r10, r6) == com.google.android.gms.internal.ads.zzenw.zzm(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
    
        if (com.google.android.gms.internal.ads.zzenw.zzk(r10, r6) == com.google.android.gms.internal.ads.zzenw.zzk(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        if (com.google.android.gms.internal.ads.zzenw.zzl(r10, r6) == com.google.android.gms.internal.ads.zzenw.zzl(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
    
        if (com.google.android.gms.internal.ads.zzenw.zzk(r10, r6) == com.google.android.gms.internal.ads.zzenw.zzk(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0178, code lost:
    
        if (com.google.android.gms.internal.ads.zzenw.zzl(r10, r6) == com.google.android.gms.internal.ads.zzenw.zzl(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
    
        if (com.google.android.gms.internal.ads.zzenw.zzl(r10, r6) == com.google.android.gms.internal.ads.zzenw.zzl(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.zzenw.zzn(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.zzenw.zzn(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.zzenw.zzo(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.zzenw.zzo(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.ads.zzena.zzh(com.google.android.gms.internal.ads.zzenw.zzp(r10, r6), com.google.android.gms.internal.ads.zzenw.zzp(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c5 A[LOOP:0: B:2:0x0005->B:86:0x01c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c4 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzemy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(T t, T t2) {
        int length = this.zzirb.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int zzhn = zzhn(i);
                long j = zzhn & 1048575;
                switch ((zzhn & 267386880) >>> 20) {
                    case 0:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                            return false;
                        }
                        i += 3;
                    case 1:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    case 2:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    case 3:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    case 4:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    case 5:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    case 6:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    case 7:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    case 8:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    case 9:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    case 10:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    case 11:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    case 12:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    case 13:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    case 14:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    case 15:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    case 16:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    case 17:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        z = zzena.zzh(zzenw.zzp(t, j), zzenw.zzp(t2, j));
                        if (z) {
                        }
                        break;
                    case 50:
                        z = zzena.zzh(zzenw.zzp(t, j), zzenw.zzp(t2, j));
                        if (z) {
                        }
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long zzho = zzho(i) & 1048575;
                        if (zzenw.zzk(t, zzho) == zzenw.zzk(t2, zzho)) {
                            break;
                        }
                        z = false;
                        if (z) {
                        }
                        break;
                    default:
                        if (z) {
                        }
                        break;
                }
            } else {
                if (!this.zzirp.zzay(t).equals(this.zzirp.zzay(t2))) {
                    return false;
                }
                if (this.zzirg) {
                    return this.zzirq.zzai(t).equals(this.zzirq.zzai(t2));
                }
                return true;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzemy
    public final int hashCode(T t) {
        int i;
        int zzfq;
        int length = this.zzirb.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzhn = zzhn(i3);
            int i4 = this.zzirb[i3];
            long j = 1048575 & zzhn;
            int i5 = 37;
            switch ((zzhn & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zzfq = zzeks.zzfq(Double.doubleToLongBits(zzenw.zzo(t, j)));
                    i2 = i + zzfq;
                    break;
                case 1:
                    i = i2 * 53;
                    zzfq = Float.floatToIntBits(zzenw.zzn(t, j));
                    i2 = i + zzfq;
                    break;
                case 2:
                    i = i2 * 53;
                    zzfq = zzeks.zzfq(zzenw.zzl(t, j));
                    i2 = i + zzfq;
                    break;
                case 3:
                    i = i2 * 53;
                    zzfq = zzeks.zzfq(zzenw.zzl(t, j));
                    i2 = i + zzfq;
                    break;
                case 4:
                    i = i2 * 53;
                    zzfq = zzenw.zzk(t, j);
                    i2 = i + zzfq;
                    break;
                case 5:
                    i = i2 * 53;
                    zzfq = zzeks.zzfq(zzenw.zzl(t, j));
                    i2 = i + zzfq;
                    break;
                case 6:
                    i = i2 * 53;
                    zzfq = zzenw.zzk(t, j);
                    i2 = i + zzfq;
                    break;
                case 7:
                    i = i2 * 53;
                    zzfq = zzeks.zzbs(zzenw.zzm(t, j));
                    i2 = i + zzfq;
                    break;
                case 8:
                    i = i2 * 53;
                    zzfq = ((String) zzenw.zzp(t, j)).hashCode();
                    i2 = i + zzfq;
                    break;
                case 9:
                    Object zzp = zzenw.zzp(t, j);
                    if (zzp != null) {
                        i5 = zzp.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzfq = zzenw.zzp(t, j).hashCode();
                    i2 = i + zzfq;
                    break;
                case 11:
                    i = i2 * 53;
                    zzfq = zzenw.zzk(t, j);
                    i2 = i + zzfq;
                    break;
                case 12:
                    i = i2 * 53;
                    zzfq = zzenw.zzk(t, j);
                    i2 = i + zzfq;
                    break;
                case 13:
                    i = i2 * 53;
                    zzfq = zzenw.zzk(t, j);
                    i2 = i + zzfq;
                    break;
                case 14:
                    i = i2 * 53;
                    zzfq = zzeks.zzfq(zzenw.zzl(t, j));
                    i2 = i + zzfq;
                    break;
                case 15:
                    i = i2 * 53;
                    zzfq = zzenw.zzk(t, j);
                    i2 = i + zzfq;
                    break;
                case 16:
                    i = i2 * 53;
                    zzfq = zzeks.zzfq(zzenw.zzl(t, j));
                    i2 = i + zzfq;
                    break;
                case 17:
                    Object zzp2 = zzenw.zzp(t, j);
                    if (zzp2 != null) {
                        i5 = zzp2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    zzfq = zzenw.zzp(t, j).hashCode();
                    i2 = i + zzfq;
                    break;
                case 50:
                    i = i2 * 53;
                    zzfq = zzenw.zzp(t, j).hashCode();
                    i2 = i + zzfq;
                    break;
                case 51:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = zzeks.zzfq(Double.doubleToLongBits(zzf(t, j)));
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = Float.floatToIntBits(zzg(t, j));
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = zzeks.zzfq(zzi(t, j));
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = zzeks.zzfq(zzi(t, j));
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = zzh(t, j);
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = zzeks.zzfq(zzi(t, j));
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = zzh(t, j);
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = zzeks.zzbs(zzj(t, j));
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = ((String) zzenw.zzp(t, j)).hashCode();
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = zzenw.zzp(t, j).hashCode();
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = zzenw.zzp(t, j).hashCode();
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = zzh(t, j);
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = zzh(t, j);
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = zzh(t, j);
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = zzeks.zzfq(zzi(t, j));
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = zzh(t, j);
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = zzeks.zzfq(zzi(t, j));
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza((zzemh<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfq = zzenw.zzp(t, j).hashCode();
                        i2 = i + zzfq;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzirp.zzay(t).hashCode();
        return this.zzirg ? (hashCode * 53) + this.zzirq.zzai(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzemy
    public final void zzg(T t, T t2) {
        if (t2 == null) {
            throw null;
        }
        for (int i = 0; i < this.zzirb.length; i += 3) {
            int zzhn = zzhn(i);
            long j = 1048575 & zzhn;
            int i2 = this.zzirb[i];
            switch ((zzhn & 267386880) >>> 20) {
                case 0:
                    if (zze((zzemh<T>) t2, i)) {
                        zzenw.zza(t, j, zzenw.zzo(t2, j));
                        zzf((zzemh<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zze((zzemh<T>) t2, i)) {
                        zzenw.zza((Object) t, j, zzenw.zzn(t2, j));
                        zzf((zzemh<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zze((zzemh<T>) t2, i)) {
                        zzenw.zza((Object) t, j, zzenw.zzl(t2, j));
                        zzf((zzemh<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zze((zzemh<T>) t2, i)) {
                        zzenw.zza((Object) t, j, zzenw.zzl(t2, j));
                        zzf((zzemh<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zze((zzemh<T>) t2, i)) {
                        zzenw.zzb(t, j, zzenw.zzk(t2, j));
                        zzf((zzemh<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zze((zzemh<T>) t2, i)) {
                        zzenw.zza((Object) t, j, zzenw.zzl(t2, j));
                        zzf((zzemh<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zze((zzemh<T>) t2, i)) {
                        zzenw.zzb(t, j, zzenw.zzk(t2, j));
                        zzf((zzemh<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zze((zzemh<T>) t2, i)) {
                        zzenw.zza(t, j, zzenw.zzm(t2, j));
                        zzf((zzemh<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zze((zzemh<T>) t2, i)) {
                        zzenw.zza(t, j, zzenw.zzp(t2, j));
                        zzf((zzemh<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zze((zzemh<T>) t2, i)) {
                        zzenw.zza(t, j, zzenw.zzp(t2, j));
                        zzf((zzemh<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zze((zzemh<T>) t2, i)) {
                        zzenw.zzb(t, j, zzenw.zzk(t2, j));
                        zzf((zzemh<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zze((zzemh<T>) t2, i)) {
                        zzenw.zzb(t, j, zzenw.zzk(t2, j));
                        zzf((zzemh<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zze((zzemh<T>) t2, i)) {
                        zzenw.zzb(t, j, zzenw.zzk(t2, j));
                        zzf((zzemh<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zze((zzemh<T>) t2, i)) {
                        zzenw.zza((Object) t, j, zzenw.zzl(t2, j));
                        zzf((zzemh<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zze((zzemh<T>) t2, i)) {
                        zzenw.zzb(t, j, zzenw.zzk(t2, j));
                        zzf((zzemh<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zze((zzemh<T>) t2, i)) {
                        zzenw.zza((Object) t, j, zzenw.zzl(t2, j));
                        zzf((zzemh<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zziro.zza(t, t2, j);
                    break;
                case 50:
                    zzena.zza(this.zzirr, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zza((zzemh<T>) t2, i2, i)) {
                        zzenw.zza(t, j, zzenw.zzp(t2, j));
                        zzb((zzemh<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza((zzemh<T>) t2, i2, i)) {
                        zzenw.zza(t, j, zzenw.zzp(t2, j));
                        zzb((zzemh<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzena.zza(this.zzirp, t, t2);
        if (this.zzirg) {
            zzena.zza(this.zzirq, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long zzhn = zzhn(i) & 1048575;
        if (zze((zzemh<T>) t2, i)) {
            Object zzp = zzenw.zzp(t, zzhn);
            Object zzp2 = zzenw.zzp(t2, zzhn);
            if (zzp != null && zzp2 != null) {
                zzenw.zza(t, zzhn, zzeks.zze(zzp, zzp2));
                zzf((zzemh<T>) t, i);
            } else if (zzp2 != null) {
                zzenw.zza(t, zzhn, zzp2);
                zzf((zzemh<T>) t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int zzhn = zzhn(i);
        int i2 = this.zzirb[i];
        long j = zzhn & 1048575;
        if (zza((zzemh<T>) t2, i2, i)) {
            Object zzp = zza((zzemh<T>) t, i2, i) ? zzenw.zzp(t, j) : null;
            Object zzp2 = zzenw.zzp(t2, j);
            if (zzp != null && zzp2 != null) {
                zzenw.zza(t, j, zzeks.zze(zzp, zzp2));
                zzb((zzemh<T>) t, i2, i);
            } else if (zzp2 != null) {
                zzenw.zza(t, j, zzp2);
                zzb((zzemh<T>) t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x003f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:255:0x04b4. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzemy
    public final int zzau(T t) {
        int i;
        long j;
        int zzl;
        int zzj;
        int zzak;
        int zzv;
        int zzak2;
        int zzgv;
        int zzgx;
        int zzc;
        int zzak3;
        int zzgv2;
        int zzgx2;
        int i2 = 267386880;
        int i3 = 1048575;
        int i4 = 1;
        if (this.zziri) {
            Unsafe unsafe = zzhxt;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.zzirb.length) {
                int zzhn = zzhn(i5);
                int i7 = (zzhn & i2) >>> 20;
                int i8 = this.zzirb[i5];
                long j2 = zzhn & 1048575;
                if (i7 >= zzekk.DOUBLE_LIST_PACKED.id() && i7 <= zzekk.SINT64_LIST_PACKED.id()) {
                    int i9 = this.zzirb[i5 + 2];
                }
                switch (i7) {
                    case 0:
                        if (zze((zzemh<T>) t, i5)) {
                            zzc = zzeka.zzc(i8, 0.0d);
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zze((zzemh<T>) t, i5)) {
                            zzc = zzeka.zzb(i8, 0.0f);
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zze((zzemh<T>) t, i5)) {
                            zzc = zzeka.zzl(i8, zzenw.zzl(t, j2));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zze((zzemh<T>) t, i5)) {
                            zzc = zzeka.zzm(i8, zzenw.zzl(t, j2));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zze((zzemh<T>) t, i5)) {
                            zzc = zzeka.zzag(i8, zzenw.zzk(t, j2));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zze((zzemh<T>) t, i5)) {
                            zzc = zzeka.zzo(i8, 0L);
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zze((zzemh<T>) t, i5)) {
                            zzc = zzeka.zzaj(i8, 0);
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zze((zzemh<T>) t, i5)) {
                            zzc = zzeka.zzi(i8, true);
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zze((zzemh<T>) t, i5)) {
                            Object zzp = zzenw.zzp(t, j2);
                            if (zzp instanceof zzejg) {
                                zzc = zzeka.zzc(i8, (zzejg) zzp);
                            } else {
                                zzc = zzeka.zzj(i8, (String) zzp);
                            }
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zze((zzemh<T>) t, i5)) {
                            zzc = zzena.zzc(i8, zzenw.zzp(t, j2), zzhk(i5));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zze((zzemh<T>) t, i5)) {
                            zzc = zzeka.zzc(i8, (zzejg) zzenw.zzp(t, j2));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zze((zzemh<T>) t, i5)) {
                            zzc = zzeka.zzah(i8, zzenw.zzk(t, j2));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zze((zzemh<T>) t, i5)) {
                            zzc = zzeka.zzal(i8, zzenw.zzk(t, j2));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zze((zzemh<T>) t, i5)) {
                            zzc = zzeka.zzak(i8, 0);
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zze((zzemh<T>) t, i5)) {
                            zzc = zzeka.zzp(i8, 0L);
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zze((zzemh<T>) t, i5)) {
                            zzc = zzeka.zzai(i8, zzenw.zzk(t, j2));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zze((zzemh<T>) t, i5)) {
                            zzc = zzeka.zzn(i8, zzenw.zzl(t, j2));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zze((zzemh<T>) t, i5)) {
                            zzc = zzeka.zzc(i8, (zzemd) zzenw.zzp(t, j2), zzhk(i5));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzc = zzena.zzw(i8, zze(t, j2), false);
                        i6 += zzc;
                        break;
                    case 19:
                        zzc = zzena.zzv(i8, zze(t, j2), false);
                        i6 += zzc;
                        break;
                    case 20:
                        zzc = zzena.zzo(i8, zze(t, j2), false);
                        i6 += zzc;
                        break;
                    case 21:
                        zzc = zzena.zzp(i8, zze(t, j2), false);
                        i6 += zzc;
                        break;
                    case 22:
                        zzc = zzena.zzs(i8, zze(t, j2), false);
                        i6 += zzc;
                        break;
                    case 23:
                        zzc = zzena.zzw(i8, zze(t, j2), false);
                        i6 += zzc;
                        break;
                    case 24:
                        zzc = zzena.zzv(i8, zze(t, j2), false);
                        i6 += zzc;
                        break;
                    case 25:
                        zzc = zzena.zzx(i8, zze(t, j2), false);
                        i6 += zzc;
                        break;
                    case 26:
                        zzc = zzena.zzc(i8, zze(t, j2));
                        i6 += zzc;
                        break;
                    case 27:
                        zzc = zzena.zzc(i8, zze(t, j2), zzhk(i5));
                        i6 += zzc;
                        break;
                    case 28:
                        zzc = zzena.zzd(i8, zze(t, j2));
                        i6 += zzc;
                        break;
                    case 29:
                        zzc = zzena.zzt(i8, zze(t, j2), false);
                        i6 += zzc;
                        break;
                    case 30:
                        zzc = zzena.zzr(i8, zze(t, j2), false);
                        i6 += zzc;
                        break;
                    case 31:
                        zzc = zzena.zzv(i8, zze(t, j2), false);
                        i6 += zzc;
                        break;
                    case 32:
                        zzc = zzena.zzw(i8, zze(t, j2), false);
                        i6 += zzc;
                        break;
                    case 33:
                        zzc = zzena.zzu(i8, zze(t, j2), false);
                        i6 += zzc;
                        break;
                    case 34:
                        zzc = zzena.zzq(i8, zze(t, j2), false);
                        i6 += zzc;
                        break;
                    case 35:
                        zzak3 = zzena.zzak((List) unsafe.getObject(t, j2));
                        if (zzak3 > 0) {
                            zzgv2 = zzeka.zzgv(i8);
                            zzgx2 = zzeka.zzgx(zzak3);
                            zzc = zzgv2 + zzgx2 + zzak3;
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        zzak3 = zzena.zzaj((List) unsafe.getObject(t, j2));
                        if (zzak3 > 0) {
                            zzgv2 = zzeka.zzgv(i8);
                            zzgx2 = zzeka.zzgx(zzak3);
                            zzc = zzgv2 + zzgx2 + zzak3;
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        zzak3 = zzena.zzac((List) unsafe.getObject(t, j2));
                        if (zzak3 > 0) {
                            zzgv2 = zzeka.zzgv(i8);
                            zzgx2 = zzeka.zzgx(zzak3);
                            zzc = zzgv2 + zzgx2 + zzak3;
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        zzak3 = zzena.zzad((List) unsafe.getObject(t, j2));
                        if (zzak3 > 0) {
                            zzgv2 = zzeka.zzgv(i8);
                            zzgx2 = zzeka.zzgx(zzak3);
                            zzc = zzgv2 + zzgx2 + zzak3;
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        zzak3 = zzena.zzag((List) unsafe.getObject(t, j2));
                        if (zzak3 > 0) {
                            zzgv2 = zzeka.zzgv(i8);
                            zzgx2 = zzeka.zzgx(zzak3);
                            zzc = zzgv2 + zzgx2 + zzak3;
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        zzak3 = zzena.zzak((List) unsafe.getObject(t, j2));
                        if (zzak3 > 0) {
                            zzgv2 = zzeka.zzgv(i8);
                            zzgx2 = zzeka.zzgx(zzak3);
                            zzc = zzgv2 + zzgx2 + zzak3;
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        zzak3 = zzena.zzaj((List) unsafe.getObject(t, j2));
                        if (zzak3 > 0) {
                            zzgv2 = zzeka.zzgv(i8);
                            zzgx2 = zzeka.zzgx(zzak3);
                            zzc = zzgv2 + zzgx2 + zzak3;
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        zzak3 = zzena.zzal((List) unsafe.getObject(t, j2));
                        if (zzak3 > 0) {
                            zzgv2 = zzeka.zzgv(i8);
                            zzgx2 = zzeka.zzgx(zzak3);
                            zzc = zzgv2 + zzgx2 + zzak3;
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        zzak3 = zzena.zzah((List) unsafe.getObject(t, j2));
                        if (zzak3 > 0) {
                            zzgv2 = zzeka.zzgv(i8);
                            zzgx2 = zzeka.zzgx(zzak3);
                            zzc = zzgv2 + zzgx2 + zzak3;
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        zzak3 = zzena.zzaf((List) unsafe.getObject(t, j2));
                        if (zzak3 > 0) {
                            zzgv2 = zzeka.zzgv(i8);
                            zzgx2 = zzeka.zzgx(zzak3);
                            zzc = zzgv2 + zzgx2 + zzak3;
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        zzak3 = zzena.zzaj((List) unsafe.getObject(t, j2));
                        if (zzak3 > 0) {
                            zzgv2 = zzeka.zzgv(i8);
                            zzgx2 = zzeka.zzgx(zzak3);
                            zzc = zzgv2 + zzgx2 + zzak3;
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        zzak3 = zzena.zzak((List) unsafe.getObject(t, j2));
                        if (zzak3 > 0) {
                            zzgv2 = zzeka.zzgv(i8);
                            zzgx2 = zzeka.zzgx(zzak3);
                            zzc = zzgv2 + zzgx2 + zzak3;
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        zzak3 = zzena.zzai((List) unsafe.getObject(t, j2));
                        if (zzak3 > 0) {
                            zzgv2 = zzeka.zzgv(i8);
                            zzgx2 = zzeka.zzgx(zzak3);
                            zzc = zzgv2 + zzgx2 + zzak3;
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        zzak3 = zzena.zzae((List) unsafe.getObject(t, j2));
                        if (zzak3 > 0) {
                            zzgv2 = zzeka.zzgv(i8);
                            zzgx2 = zzeka.zzgx(zzak3);
                            zzc = zzgv2 + zzgx2 + zzak3;
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        zzc = zzena.zzd(i8, zze(t, j2), zzhk(i5));
                        i6 += zzc;
                        break;
                    case 50:
                        zzc = this.zzirr.zzb(i8, zzenw.zzp(t, j2), zzhl(i5));
                        i6 += zzc;
                        break;
                    case 51:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            zzc = zzeka.zzc(i8, 0.0d);
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            zzc = zzeka.zzb(i8, 0.0f);
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            zzc = zzeka.zzl(i8, zzi(t, j2));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            zzc = zzeka.zzm(i8, zzi(t, j2));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            zzc = zzeka.zzag(i8, zzh(t, j2));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            zzc = zzeka.zzo(i8, 0L);
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            zzc = zzeka.zzaj(i8, 0);
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            zzc = zzeka.zzi(i8, true);
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            Object zzp2 = zzenw.zzp(t, j2);
                            if (zzp2 instanceof zzejg) {
                                zzc = zzeka.zzc(i8, (zzejg) zzp2);
                            } else {
                                zzc = zzeka.zzj(i8, (String) zzp2);
                            }
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            zzc = zzena.zzc(i8, zzenw.zzp(t, j2), zzhk(i5));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            zzc = zzeka.zzc(i8, (zzejg) zzenw.zzp(t, j2));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            zzc = zzeka.zzah(i8, zzh(t, j2));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            zzc = zzeka.zzal(i8, zzh(t, j2));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            zzc = zzeka.zzak(i8, 0);
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            zzc = zzeka.zzp(i8, 0L);
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            zzc = zzeka.zzai(i8, zzh(t, j2));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            zzc = zzeka.zzn(i8, zzi(t, j2));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zza((zzemh<T>) t, i8, i5)) {
                            zzc = zzeka.zzc(i8, (zzemd) zzenw.zzp(t, j2), zzhk(i5));
                            i6 += zzc;
                            break;
                        } else {
                            break;
                        }
                }
                i5 += 3;
                i2 = 267386880;
            }
            return i6 + zza(this.zzirp, t);
        }
        Unsafe unsafe2 = zzhxt;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        int i13 = 0;
        while (i10 < this.zzirb.length) {
            int zzhn2 = zzhn(i10);
            int[] iArr = this.zzirb;
            int i14 = iArr[i10];
            int i15 = (zzhn2 & 267386880) >>> 20;
            if (i15 <= 17) {
                int i16 = iArr[i10 + 2];
                int i17 = i16 & i3;
                i = i4 << (i16 >>> 20);
                if (i17 != i12) {
                    i13 = unsafe2.getInt(t, i17);
                    i12 = i17;
                }
            } else {
                i = 0;
            }
            long j3 = zzhn2 & i3;
            switch (i15) {
                case 0:
                    j = 0;
                    if ((i13 & i) != 0) {
                        i11 += zzeka.zzc(i14, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    j = 0;
                    if ((i13 & i) != 0) {
                        i11 += zzeka.zzb(i14, 0.0f);
                    }
                    break;
                case 2:
                    j = 0;
                    if ((i & i13) != 0) {
                        zzl = zzeka.zzl(i14, unsafe2.getLong(t, j3));
                        i11 += zzl;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i & i13) != 0) {
                        zzl = zzeka.zzm(i14, unsafe2.getLong(t, j3));
                        i11 += zzl;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i & i13) != 0) {
                        zzl = zzeka.zzag(i14, unsafe2.getInt(t, j3));
                        i11 += zzl;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i13 & i) != 0) {
                        zzl = zzeka.zzo(i14, 0L);
                        i11 += zzl;
                    }
                    break;
                case 6:
                    if ((i13 & i) != 0) {
                        i11 += zzeka.zzaj(i14, 0);
                    }
                    j = 0;
                    break;
                case 7:
                    if ((i13 & i) != 0) {
                        i11 += zzeka.zzi(i14, true);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 8:
                    if ((i13 & i) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof zzejg) {
                            zzj = zzeka.zzc(i14, (zzejg) object);
                        } else {
                            zzj = zzeka.zzj(i14, (String) object);
                        }
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 9:
                    if ((i13 & i) != 0) {
                        zzj = zzena.zzc(i14, unsafe2.getObject(t, j3), zzhk(i10));
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 10:
                    if ((i13 & i) != 0) {
                        zzj = zzeka.zzc(i14, (zzejg) unsafe2.getObject(t, j3));
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 11:
                    if ((i13 & i) != 0) {
                        zzj = zzeka.zzah(i14, unsafe2.getInt(t, j3));
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 12:
                    if ((i13 & i) != 0) {
                        zzj = zzeka.zzal(i14, unsafe2.getInt(t, j3));
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 13:
                    if ((i13 & i) != 0) {
                        zzak = zzeka.zzak(i14, 0);
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 14:
                    if ((i13 & i) != 0) {
                        zzj = zzeka.zzp(i14, 0L);
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 15:
                    if ((i13 & i) != 0) {
                        zzj = zzeka.zzai(i14, unsafe2.getInt(t, j3));
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 16:
                    if ((i13 & i) != 0) {
                        zzj = zzeka.zzn(i14, unsafe2.getLong(t, j3));
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 17:
                    if ((i13 & i) != 0) {
                        zzj = zzeka.zzc(i14, (zzemd) unsafe2.getObject(t, j3), zzhk(i10));
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 18:
                    zzj = zzena.zzw(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzj;
                    j = 0;
                    break;
                case 19:
                    zzv = zzena.zzv(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzv;
                    j = 0;
                    break;
                case 20:
                    zzv = zzena.zzo(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzv;
                    j = 0;
                    break;
                case 21:
                    zzv = zzena.zzp(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzv;
                    j = 0;
                    break;
                case 22:
                    zzv = zzena.zzs(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzv;
                    j = 0;
                    break;
                case 23:
                    zzv = zzena.zzw(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzv;
                    j = 0;
                    break;
                case 24:
                    zzv = zzena.zzv(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzv;
                    j = 0;
                    break;
                case 25:
                    zzv = zzena.zzx(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzv;
                    j = 0;
                    break;
                case 26:
                    zzj = zzena.zzc(i14, (List) unsafe2.getObject(t, j3));
                    i11 += zzj;
                    j = 0;
                    break;
                case 27:
                    zzj = zzena.zzc(i14, (List<?>) unsafe2.getObject(t, j3), zzhk(i10));
                    i11 += zzj;
                    j = 0;
                    break;
                case 28:
                    zzj = zzena.zzd(i14, (List) unsafe2.getObject(t, j3));
                    i11 += zzj;
                    j = 0;
                    break;
                case 29:
                    zzj = zzena.zzt(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzj;
                    j = 0;
                    break;
                case 30:
                    zzv = zzena.zzr(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzv;
                    j = 0;
                    break;
                case 31:
                    zzv = zzena.zzv(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzv;
                    j = 0;
                    break;
                case 32:
                    zzv = zzena.zzw(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzv;
                    j = 0;
                    break;
                case 33:
                    zzv = zzena.zzu(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzv;
                    j = 0;
                    break;
                case 34:
                    zzv = zzena.zzq(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzv;
                    j = 0;
                    break;
                case 35:
                    zzak2 = zzena.zzak((List) unsafe2.getObject(t, j3));
                    if (zzak2 > 0) {
                        zzgv = zzeka.zzgv(i14);
                        zzgx = zzeka.zzgx(zzak2);
                        zzak = zzgv + zzgx + zzak2;
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 36:
                    zzak2 = zzena.zzaj((List) unsafe2.getObject(t, j3));
                    if (zzak2 > 0) {
                        zzgv = zzeka.zzgv(i14);
                        zzgx = zzeka.zzgx(zzak2);
                        zzak = zzgv + zzgx + zzak2;
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 37:
                    zzak2 = zzena.zzac((List) unsafe2.getObject(t, j3));
                    if (zzak2 > 0) {
                        zzgv = zzeka.zzgv(i14);
                        zzgx = zzeka.zzgx(zzak2);
                        zzak = zzgv + zzgx + zzak2;
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 38:
                    zzak2 = zzena.zzad((List) unsafe2.getObject(t, j3));
                    if (zzak2 > 0) {
                        zzgv = zzeka.zzgv(i14);
                        zzgx = zzeka.zzgx(zzak2);
                        zzak = zzgv + zzgx + zzak2;
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 39:
                    zzak2 = zzena.zzag((List) unsafe2.getObject(t, j3));
                    if (zzak2 > 0) {
                        zzgv = zzeka.zzgv(i14);
                        zzgx = zzeka.zzgx(zzak2);
                        zzak = zzgv + zzgx + zzak2;
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 40:
                    zzak2 = zzena.zzak((List) unsafe2.getObject(t, j3));
                    if (zzak2 > 0) {
                        zzgv = zzeka.zzgv(i14);
                        zzgx = zzeka.zzgx(zzak2);
                        zzak = zzgv + zzgx + zzak2;
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 41:
                    zzak2 = zzena.zzaj((List) unsafe2.getObject(t, j3));
                    if (zzak2 > 0) {
                        zzgv = zzeka.zzgv(i14);
                        zzgx = zzeka.zzgx(zzak2);
                        zzak = zzgv + zzgx + zzak2;
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 42:
                    zzak2 = zzena.zzal((List) unsafe2.getObject(t, j3));
                    if (zzak2 > 0) {
                        zzgv = zzeka.zzgv(i14);
                        zzgx = zzeka.zzgx(zzak2);
                        zzak = zzgv + zzgx + zzak2;
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 43:
                    zzak2 = zzena.zzah((List) unsafe2.getObject(t, j3));
                    if (zzak2 > 0) {
                        zzgv = zzeka.zzgv(i14);
                        zzgx = zzeka.zzgx(zzak2);
                        zzak = zzgv + zzgx + zzak2;
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 44:
                    zzak2 = zzena.zzaf((List) unsafe2.getObject(t, j3));
                    if (zzak2 > 0) {
                        zzgv = zzeka.zzgv(i14);
                        zzgx = zzeka.zzgx(zzak2);
                        zzak = zzgv + zzgx + zzak2;
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 45:
                    zzak2 = zzena.zzaj((List) unsafe2.getObject(t, j3));
                    if (zzak2 > 0) {
                        zzgv = zzeka.zzgv(i14);
                        zzgx = zzeka.zzgx(zzak2);
                        zzak = zzgv + zzgx + zzak2;
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 46:
                    zzak2 = zzena.zzak((List) unsafe2.getObject(t, j3));
                    if (zzak2 > 0) {
                        zzgv = zzeka.zzgv(i14);
                        zzgx = zzeka.zzgx(zzak2);
                        zzak = zzgv + zzgx + zzak2;
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 47:
                    zzak2 = zzena.zzai((List) unsafe2.getObject(t, j3));
                    if (zzak2 > 0) {
                        zzgv = zzeka.zzgv(i14);
                        zzgx = zzeka.zzgx(zzak2);
                        zzak = zzgv + zzgx + zzak2;
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 48:
                    zzak2 = zzena.zzae((List) unsafe2.getObject(t, j3));
                    if (zzak2 > 0) {
                        zzgv = zzeka.zzgv(i14);
                        zzgx = zzeka.zzgx(zzak2);
                        zzak = zzgv + zzgx + zzak2;
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 49:
                    zzj = zzena.zzd(i14, (List) unsafe2.getObject(t, j3), zzhk(i10));
                    i11 += zzj;
                    j = 0;
                    break;
                case 50:
                    zzj = this.zzirr.zzb(i14, unsafe2.getObject(t, j3), zzhl(i10));
                    i11 += zzj;
                    j = 0;
                    break;
                case 51:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        zzj = zzeka.zzc(i14, 0.0d);
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 52:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        zzak = zzeka.zzb(i14, 0.0f);
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 53:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        zzj = zzeka.zzl(i14, zzi(t, j3));
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 54:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        zzj = zzeka.zzm(i14, zzi(t, j3));
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 55:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        zzj = zzeka.zzag(i14, zzh(t, j3));
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 56:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        zzj = zzeka.zzo(i14, 0L);
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 57:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        zzak = zzeka.zzaj(i14, 0);
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 58:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        zzak = zzeka.zzi(i14, true);
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 59:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof zzejg) {
                            zzj = zzeka.zzc(i14, (zzejg) object2);
                        } else {
                            zzj = zzeka.zzj(i14, (String) object2);
                        }
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 60:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        zzj = zzena.zzc(i14, unsafe2.getObject(t, j3), zzhk(i10));
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 61:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        zzj = zzeka.zzc(i14, (zzejg) unsafe2.getObject(t, j3));
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 62:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        zzj = zzeka.zzah(i14, zzh(t, j3));
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 63:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        zzj = zzeka.zzal(i14, zzh(t, j3));
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 64:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        zzak = zzeka.zzak(i14, 0);
                        i11 += zzak;
                    }
                    j = 0;
                    break;
                case 65:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        zzj = zzeka.zzp(i14, 0L);
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 66:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        zzj = zzeka.zzai(i14, zzh(t, j3));
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 67:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        zzj = zzeka.zzn(i14, zzi(t, j3));
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                case 68:
                    if (zza((zzemh<T>) t, i14, i10)) {
                        zzj = zzeka.zzc(i14, (zzemd) unsafe2.getObject(t, j3), zzhk(i10));
                        i11 += zzj;
                    }
                    j = 0;
                    break;
                default:
                    j = 0;
                    break;
            }
            i10 += 3;
            i3 = 1048575;
            i4 = 1;
        }
        int i18 = 0;
        int zza = i11 + zza(this.zzirp, t);
        if (!this.zzirg) {
            return zza;
        }
        zzekj<?> zzai = this.zzirq.zzai(t);
        for (int i19 = 0; i19 < zzai.zzilz.zzbkt(); i19++) {
            Map.Entry<?, Object> zzhu = zzai.zzilz.zzhu(i19);
            i18 += zzekj.zzb((zzekl<?>) zzhu.getKey(), zzhu.getValue());
        }
        for (Map.Entry<?, Object> entry : zzai.zzilz.zzbku()) {
            i18 += zzekj.zzb((zzekl<?>) entry.getKey(), entry.getValue());
        }
        return zza + i18;
    }

    private static <UT, UB> int zza(zzenq<UT, UB> zzenqVar, T t) {
        return zzenqVar.zzau(zzenqVar.zzay(t));
    }

    private static List<?> zze(Object obj, long j) {
        return (List) zzenw.zzp(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0a2a  */
    @Override // com.google.android.gms.internal.ads.zzemy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzeon zzeonVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, ?> entry;
        int length;
        int i;
        Iterator<Map.Entry<?, Object>> it2;
        Map.Entry<?, ?> entry2;
        int length2;
        if (zzeonVar.zzbhy() == zzeom.zzivs) {
            zza(this.zzirp, t, zzeonVar);
            if (this.zzirg) {
                zzekj<?> zzai = this.zzirq.zzai(t);
                if (!zzai.zzilz.isEmpty()) {
                    it2 = zzai.descendingIterator();
                    entry2 = (Map.Entry) it2.next();
                    for (length2 = this.zzirb.length - 3; length2 >= 0; length2 -= 3) {
                        int zzhn = zzhn(length2);
                        int i2 = this.zzirb[length2];
                        while (entry2 != null && this.zzirq.zza(entry2) > i2) {
                            this.zzirq.zza(zzeonVar, entry2);
                            entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                        }
                        switch ((zzhn & 267386880) >>> 20) {
                            case 0:
                                if (zze((zzemh<T>) t, length2)) {
                                    zzeonVar.zzb(i2, zzenw.zzo(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zze((zzemh<T>) t, length2)) {
                                    zzeonVar.zza(i2, zzenw.zzn(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zze((zzemh<T>) t, length2)) {
                                    zzeonVar.zzq(i2, zzenw.zzl(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zze((zzemh<T>) t, length2)) {
                                    zzeonVar.zzi(i2, zzenw.zzl(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zze((zzemh<T>) t, length2)) {
                                    zzeonVar.zzac(i2, zzenw.zzk(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zze((zzemh<T>) t, length2)) {
                                    zzeonVar.zzk(i2, zzenw.zzl(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zze((zzemh<T>) t, length2)) {
                                    zzeonVar.zzaf(i2, zzenw.zzk(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zze((zzemh<T>) t, length2)) {
                                    zzeonVar.zzh(i2, zzenw.zzm(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zze((zzemh<T>) t, length2)) {
                                    zza(i2, zzenw.zzp(t, zzhn & 1048575), zzeonVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zze((zzemh<T>) t, length2)) {
                                    zzeonVar.zza(i2, zzenw.zzp(t, zzhn & 1048575), zzhk(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zze((zzemh<T>) t, length2)) {
                                    zzeonVar.zza(i2, (zzejg) zzenw.zzp(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zze((zzemh<T>) t, length2)) {
                                    zzeonVar.zzad(i2, zzenw.zzk(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zze((zzemh<T>) t, length2)) {
                                    zzeonVar.zzan(i2, zzenw.zzk(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zze((zzemh<T>) t, length2)) {
                                    zzeonVar.zzam(i2, zzenw.zzk(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zze((zzemh<T>) t, length2)) {
                                    zzeonVar.zzr(i2, zzenw.zzl(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zze((zzemh<T>) t, length2)) {
                                    zzeonVar.zzae(i2, zzenw.zzk(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zze((zzemh<T>) t, length2)) {
                                    zzeonVar.zzj(i2, zzenw.zzl(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zze((zzemh<T>) t, length2)) {
                                    zzeonVar.zzb(i2, zzenw.zzp(t, zzhn & 1048575), zzhk(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzena.zza(this.zzirb[length2], (List<Double>) zzenw.zzp(t, zzhn & 1048575), zzeonVar, false);
                                break;
                            case 19:
                                zzena.zzb(this.zzirb[length2], (List<Float>) zzenw.zzp(t, zzhn & 1048575), zzeonVar, false);
                                break;
                            case 20:
                                zzena.zzc(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, false);
                                break;
                            case 21:
                                zzena.zzd(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, false);
                                break;
                            case 22:
                                zzena.zzh(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, false);
                                break;
                            case 23:
                                zzena.zzf(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, false);
                                break;
                            case 24:
                                zzena.zzk(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, false);
                                break;
                            case 25:
                                zzena.zzn(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, false);
                                break;
                            case 26:
                                zzena.zza(this.zzirb[length2], (List<String>) zzenw.zzp(t, zzhn & 1048575), zzeonVar);
                                break;
                            case 27:
                                zzena.zza(this.zzirb[length2], (List<?>) zzenw.zzp(t, zzhn & 1048575), zzeonVar, zzhk(length2));
                                break;
                            case 28:
                                zzena.zzb(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar);
                                break;
                            case 29:
                                zzena.zzi(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, false);
                                break;
                            case 30:
                                zzena.zzm(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, false);
                                break;
                            case 31:
                                zzena.zzl(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, false);
                                break;
                            case 32:
                                zzena.zzg(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, false);
                                break;
                            case 33:
                                zzena.zzj(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, false);
                                break;
                            case 34:
                                zzena.zze(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, false);
                                break;
                            case 35:
                                zzena.zza(this.zzirb[length2], (List<Double>) zzenw.zzp(t, zzhn & 1048575), zzeonVar, true);
                                break;
                            case 36:
                                zzena.zzb(this.zzirb[length2], (List<Float>) zzenw.zzp(t, zzhn & 1048575), zzeonVar, true);
                                break;
                            case 37:
                                zzena.zzc(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, true);
                                break;
                            case 38:
                                zzena.zzd(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, true);
                                break;
                            case 39:
                                zzena.zzh(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, true);
                                break;
                            case 40:
                                zzena.zzf(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, true);
                                break;
                            case 41:
                                zzena.zzk(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, true);
                                break;
                            case 42:
                                zzena.zzn(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, true);
                                break;
                            case 43:
                                zzena.zzi(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, true);
                                break;
                            case 44:
                                zzena.zzm(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, true);
                                break;
                            case 45:
                                zzena.zzl(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, true);
                                break;
                            case 46:
                                zzena.zzg(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, true);
                                break;
                            case 47:
                                zzena.zzj(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, true);
                                break;
                            case 48:
                                zzena.zze(this.zzirb[length2], (List) zzenw.zzp(t, zzhn & 1048575), zzeonVar, true);
                                break;
                            case 49:
                                zzena.zzb(this.zzirb[length2], (List<?>) zzenw.zzp(t, zzhn & 1048575), zzeonVar, zzhk(length2));
                                break;
                            case 50:
                                zza(zzeonVar, i2, zzenw.zzp(t, zzhn & 1048575), length2);
                                break;
                            case 51:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zzeonVar.zzb(i2, zzf(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zzeonVar.zza(i2, zzg(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zzeonVar.zzq(i2, zzi(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zzeonVar.zzi(i2, zzi(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zzeonVar.zzac(i2, zzh(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zzeonVar.zzk(i2, zzi(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zzeonVar.zzaf(i2, zzh(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zzeonVar.zzh(i2, zzj(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zza(i2, zzenw.zzp(t, zzhn & 1048575), zzeonVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zzeonVar.zza(i2, zzenw.zzp(t, zzhn & 1048575), zzhk(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zzeonVar.zza(i2, (zzejg) zzenw.zzp(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zzeonVar.zzad(i2, zzh(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zzeonVar.zzan(i2, zzh(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zzeonVar.zzam(i2, zzh(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zzeonVar.zzr(i2, zzi(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zzeonVar.zzae(i2, zzh(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zzeonVar.zzj(i2, zzi(t, zzhn & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zza((zzemh<T>) t, i2, length2)) {
                                    zzeonVar.zzb(i2, zzenw.zzp(t, zzhn & 1048575), zzhk(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry2 != null) {
                        this.zzirq.zza(zzeonVar, entry2);
                        entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                    }
                    return;
                }
            }
            it2 = null;
            entry2 = null;
            while (length2 >= 0) {
            }
            while (entry2 != null) {
            }
            return;
        }
        if (this.zziri) {
            if (this.zzirg) {
                zzekj<?> zzai2 = this.zzirq.zzai(t);
                if (!zzai2.zzilz.isEmpty()) {
                    it = zzai2.iterator();
                    entry = (Map.Entry) it.next();
                    length = this.zzirb.length;
                    for (i = 0; i < length; i += 3) {
                        int zzhn2 = zzhn(i);
                        int i3 = this.zzirb[i];
                        while (entry != null && this.zzirq.zza(entry) <= i3) {
                            this.zzirq.zza(zzeonVar, entry);
                            entry = it.hasNext() ? (Map.Entry) it.next() : null;
                        }
                        switch ((zzhn2 & 267386880) >>> 20) {
                            case 0:
                                if (zze((zzemh<T>) t, i)) {
                                    zzeonVar.zzb(i3, zzenw.zzo(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zze((zzemh<T>) t, i)) {
                                    zzeonVar.zza(i3, zzenw.zzn(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zze((zzemh<T>) t, i)) {
                                    zzeonVar.zzq(i3, zzenw.zzl(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zze((zzemh<T>) t, i)) {
                                    zzeonVar.zzi(i3, zzenw.zzl(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zze((zzemh<T>) t, i)) {
                                    zzeonVar.zzac(i3, zzenw.zzk(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zze((zzemh<T>) t, i)) {
                                    zzeonVar.zzk(i3, zzenw.zzl(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zze((zzemh<T>) t, i)) {
                                    zzeonVar.zzaf(i3, zzenw.zzk(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zze((zzemh<T>) t, i)) {
                                    zzeonVar.zzh(i3, zzenw.zzm(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zze((zzemh<T>) t, i)) {
                                    zza(i3, zzenw.zzp(t, zzhn2 & 1048575), zzeonVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zze((zzemh<T>) t, i)) {
                                    zzeonVar.zza(i3, zzenw.zzp(t, zzhn2 & 1048575), zzhk(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zze((zzemh<T>) t, i)) {
                                    zzeonVar.zza(i3, (zzejg) zzenw.zzp(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zze((zzemh<T>) t, i)) {
                                    zzeonVar.zzad(i3, zzenw.zzk(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zze((zzemh<T>) t, i)) {
                                    zzeonVar.zzan(i3, zzenw.zzk(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zze((zzemh<T>) t, i)) {
                                    zzeonVar.zzam(i3, zzenw.zzk(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zze((zzemh<T>) t, i)) {
                                    zzeonVar.zzr(i3, zzenw.zzl(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zze((zzemh<T>) t, i)) {
                                    zzeonVar.zzae(i3, zzenw.zzk(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zze((zzemh<T>) t, i)) {
                                    zzeonVar.zzj(i3, zzenw.zzl(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zze((zzemh<T>) t, i)) {
                                    zzeonVar.zzb(i3, zzenw.zzp(t, zzhn2 & 1048575), zzhk(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzena.zza(this.zzirb[i], (List<Double>) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, false);
                                break;
                            case 19:
                                zzena.zzb(this.zzirb[i], (List<Float>) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, false);
                                break;
                            case 20:
                                zzena.zzc(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, false);
                                break;
                            case 21:
                                zzena.zzd(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, false);
                                break;
                            case 22:
                                zzena.zzh(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, false);
                                break;
                            case 23:
                                zzena.zzf(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, false);
                                break;
                            case 24:
                                zzena.zzk(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, false);
                                break;
                            case 25:
                                zzena.zzn(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, false);
                                break;
                            case 26:
                                zzena.zza(this.zzirb[i], (List<String>) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar);
                                break;
                            case 27:
                                zzena.zza(this.zzirb[i], (List<?>) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, zzhk(i));
                                break;
                            case 28:
                                zzena.zzb(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar);
                                break;
                            case 29:
                                zzena.zzi(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, false);
                                break;
                            case 30:
                                zzena.zzm(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, false);
                                break;
                            case 31:
                                zzena.zzl(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, false);
                                break;
                            case 32:
                                zzena.zzg(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, false);
                                break;
                            case 33:
                                zzena.zzj(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, false);
                                break;
                            case 34:
                                zzena.zze(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, false);
                                break;
                            case 35:
                                zzena.zza(this.zzirb[i], (List<Double>) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, true);
                                break;
                            case 36:
                                zzena.zzb(this.zzirb[i], (List<Float>) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, true);
                                break;
                            case 37:
                                zzena.zzc(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, true);
                                break;
                            case 38:
                                zzena.zzd(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, true);
                                break;
                            case 39:
                                zzena.zzh(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, true);
                                break;
                            case 40:
                                zzena.zzf(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, true);
                                break;
                            case 41:
                                zzena.zzk(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, true);
                                break;
                            case 42:
                                zzena.zzn(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, true);
                                break;
                            case 43:
                                zzena.zzi(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, true);
                                break;
                            case 44:
                                zzena.zzm(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, true);
                                break;
                            case 45:
                                zzena.zzl(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, true);
                                break;
                            case 46:
                                zzena.zzg(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, true);
                                break;
                            case 47:
                                zzena.zzj(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, true);
                                break;
                            case 48:
                                zzena.zze(this.zzirb[i], (List) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, true);
                                break;
                            case 49:
                                zzena.zzb(this.zzirb[i], (List<?>) zzenw.zzp(t, zzhn2 & 1048575), zzeonVar, zzhk(i));
                                break;
                            case 50:
                                zza(zzeonVar, i3, zzenw.zzp(t, zzhn2 & 1048575), i);
                                break;
                            case 51:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zzeonVar.zzb(i3, zzf(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zzeonVar.zza(i3, zzg(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zzeonVar.zzq(i3, zzi(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zzeonVar.zzi(i3, zzi(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zzeonVar.zzac(i3, zzh(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zzeonVar.zzk(i3, zzi(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zzeonVar.zzaf(i3, zzh(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zzeonVar.zzh(i3, zzj(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zza(i3, zzenw.zzp(t, zzhn2 & 1048575), zzeonVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zzeonVar.zza(i3, zzenw.zzp(t, zzhn2 & 1048575), zzhk(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zzeonVar.zza(i3, (zzejg) zzenw.zzp(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zzeonVar.zzad(i3, zzh(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zzeonVar.zzan(i3, zzh(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zzeonVar.zzam(i3, zzh(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zzeonVar.zzr(i3, zzi(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zzeonVar.zzae(i3, zzh(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zzeonVar.zzj(i3, zzi(t, zzhn2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zza((zzemh<T>) t, i3, i)) {
                                    zzeonVar.zzb(i3, zzenw.zzp(t, zzhn2 & 1048575), zzhk(i));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry != null) {
                        this.zzirq.zza(zzeonVar, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    zza(this.zzirp, t, zzeonVar);
                    return;
                }
            }
            it = null;
            entry = null;
            length = this.zzirb.length;
            while (i < length) {
            }
            while (entry != null) {
            }
            zza(this.zzirp, t, zzeonVar);
            return;
        }
        zzb(t, zzeonVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzb(T t, zzeon zzeonVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, ?> entry;
        int length;
        int i;
        int i2;
        if (this.zzirg) {
            zzekj<?> zzai = this.zzirq.zzai(t);
            if (!zzai.zzilz.isEmpty()) {
                it = zzai.iterator();
                entry = (Map.Entry) it.next();
                length = this.zzirb.length;
                Unsafe unsafe = zzhxt;
                int i3 = 1048575;
                int i4 = 0;
                for (i = 0; i < length; i += 3) {
                    int zzhn = zzhn(i);
                    int[] iArr = this.zzirb;
                    int i5 = iArr[i];
                    int i6 = (zzhn & 267386880) >>> 20;
                    if (i6 <= 17) {
                        int i7 = iArr[i + 2];
                        int i8 = i7 & 1048575;
                        if (i8 != i3) {
                            i4 = unsafe.getInt(t, i8);
                            i3 = i8;
                        }
                        i2 = 1 << (i7 >>> 20);
                    } else {
                        i2 = 0;
                    }
                    while (entry != null && this.zzirq.zza(entry) <= i5) {
                        this.zzirq.zza(zzeonVar, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzhn & 1048575;
                    switch (i6) {
                        case 0:
                            if ((i2 & i4) == 0) {
                                break;
                            } else {
                                zzeonVar.zzb(i5, zzenw.zzo(t, j));
                                continue;
                            }
                        case 1:
                            if ((i2 & i4) != 0) {
                                zzeonVar.zza(i5, zzenw.zzn(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if ((i2 & i4) != 0) {
                                zzeonVar.zzq(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if ((i2 & i4) != 0) {
                                zzeonVar.zzi(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if ((i2 & i4) != 0) {
                                zzeonVar.zzac(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if ((i2 & i4) != 0) {
                                zzeonVar.zzk(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if ((i2 & i4) != 0) {
                                zzeonVar.zzaf(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if ((i2 & i4) != 0) {
                                zzeonVar.zzh(i5, zzenw.zzm(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if ((i2 & i4) != 0) {
                                zza(i5, unsafe.getObject(t, j), zzeonVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if ((i2 & i4) != 0) {
                                zzeonVar.zza(i5, unsafe.getObject(t, j), zzhk(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if ((i2 & i4) != 0) {
                                zzeonVar.zza(i5, (zzejg) unsafe.getObject(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if ((i2 & i4) != 0) {
                                zzeonVar.zzad(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if ((i2 & i4) != 0) {
                                zzeonVar.zzan(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if ((i2 & i4) != 0) {
                                zzeonVar.zzam(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if ((i2 & i4) != 0) {
                                zzeonVar.zzr(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if ((i2 & i4) != 0) {
                                zzeonVar.zzae(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if ((i2 & i4) != 0) {
                                zzeonVar.zzj(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if ((i2 & i4) != 0) {
                                zzeonVar.zzb(i5, unsafe.getObject(t, j), zzhk(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            zzena.zza(this.zzirb[i], (List<Double>) unsafe.getObject(t, j), zzeonVar, false);
                            break;
                        case 19:
                            zzena.zzb(this.zzirb[i], (List<Float>) unsafe.getObject(t, j), zzeonVar, false);
                            break;
                        case 20:
                            zzena.zzc(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, false);
                            break;
                        case 21:
                            zzena.zzd(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, false);
                            break;
                        case 22:
                            zzena.zzh(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, false);
                            break;
                        case 23:
                            zzena.zzf(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, false);
                            break;
                        case 24:
                            zzena.zzk(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, false);
                            break;
                        case 25:
                            zzena.zzn(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, false);
                            break;
                        case 26:
                            zzena.zza(this.zzirb[i], (List<String>) unsafe.getObject(t, j), zzeonVar);
                            break;
                        case 27:
                            zzena.zza(this.zzirb[i], (List<?>) unsafe.getObject(t, j), zzeonVar, zzhk(i));
                            break;
                        case 28:
                            zzena.zzb(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar);
                            break;
                        case 29:
                            zzena.zzi(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, false);
                            break;
                        case 30:
                            zzena.zzm(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, false);
                            break;
                        case 31:
                            zzena.zzl(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, false);
                            break;
                        case 32:
                            zzena.zzg(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, false);
                            break;
                        case 33:
                            zzena.zzj(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, false);
                            break;
                        case 34:
                            zzena.zze(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, false);
                            break;
                        case 35:
                            zzena.zza(this.zzirb[i], (List<Double>) unsafe.getObject(t, j), zzeonVar, true);
                            break;
                        case 36:
                            zzena.zzb(this.zzirb[i], (List<Float>) unsafe.getObject(t, j), zzeonVar, true);
                            break;
                        case 37:
                            zzena.zzc(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, true);
                            break;
                        case 38:
                            zzena.zzd(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, true);
                            break;
                        case 39:
                            zzena.zzh(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, true);
                            break;
                        case 40:
                            zzena.zzf(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, true);
                            break;
                        case 41:
                            zzena.zzk(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, true);
                            break;
                        case 42:
                            zzena.zzn(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, true);
                            break;
                        case 43:
                            zzena.zzi(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, true);
                            break;
                        case 44:
                            zzena.zzm(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, true);
                            break;
                        case 45:
                            zzena.zzl(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, true);
                            break;
                        case 46:
                            zzena.zzg(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, true);
                            break;
                        case 47:
                            zzena.zzj(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, true);
                            break;
                        case 48:
                            zzena.zze(this.zzirb[i], (List) unsafe.getObject(t, j), zzeonVar, true);
                            break;
                        case 49:
                            zzena.zzb(this.zzirb[i], (List<?>) unsafe.getObject(t, j), zzeonVar, zzhk(i));
                            break;
                        case 50:
                            zza(zzeonVar, i5, unsafe.getObject(t, j), i);
                            break;
                        case 51:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zzeonVar.zzb(i5, zzf(t, j));
                                break;
                            }
                            break;
                        case 52:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zzeonVar.zza(i5, zzg(t, j));
                                break;
                            }
                            break;
                        case 53:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zzeonVar.zzq(i5, zzi(t, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zzeonVar.zzi(i5, zzi(t, j));
                                break;
                            }
                            break;
                        case 55:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zzeonVar.zzac(i5, zzh(t, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zzeonVar.zzk(i5, zzi(t, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zzeonVar.zzaf(i5, zzh(t, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zzeonVar.zzh(i5, zzj(t, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zza(i5, unsafe.getObject(t, j), zzeonVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zzeonVar.zza(i5, unsafe.getObject(t, j), zzhk(i));
                                break;
                            }
                            break;
                        case 61:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zzeonVar.zza(i5, (zzejg) unsafe.getObject(t, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zzeonVar.zzad(i5, zzh(t, j));
                                break;
                            }
                            break;
                        case 63:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zzeonVar.zzan(i5, zzh(t, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zzeonVar.zzam(i5, zzh(t, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zzeonVar.zzr(i5, zzi(t, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zzeonVar.zzae(i5, zzh(t, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zzeonVar.zzj(i5, zzi(t, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zza((zzemh<T>) t, i5, i)) {
                                zzeonVar.zzb(i5, unsafe.getObject(t, j), zzhk(i));
                                break;
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.zzirq.zza(zzeonVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                zza(this.zzirp, t, zzeonVar);
            }
        }
        it = null;
        entry = null;
        length = this.zzirb.length;
        Unsafe unsafe2 = zzhxt;
        int i32 = 1048575;
        int i42 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        zza(this.zzirp, t, zzeonVar);
    }

    private final <K, V> void zza(zzeon zzeonVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzeonVar.zza(i, this.zzirr.zzas(zzhl(i2)), this.zzirr.zzao(obj));
        }
    }

    private static <UT, UB> void zza(zzenq<UT, UB> zzenqVar, T t, zzeon zzeonVar) throws IOException {
        zzenqVar.zza((zzenq<UT, UB>) zzenqVar.zzay(t), zzeonVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0083. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzemy
    public final void zza(T t, zzems zzemsVar, zzekd zzekdVar) throws IOException {
        if (zzekdVar == null) {
            throw null;
        }
        zzenq zzenqVar = this.zzirp;
        zzekf<?> zzekfVar = this.zzirq;
        zzekj<?> zzekjVar = null;
        Object obj = null;
        while (true) {
            try {
                int zzbht = zzemsVar.zzbht();
                int zzhq = zzhq(zzbht);
                if (zzhq < 0) {
                    if (zzbht == Integer.MAX_VALUE) {
                        for (int i = this.zzirl; i < this.zzirm; i++) {
                            obj = zza((Object) t, this.zzirk[i], (int) obj, (zzenq<UT, int>) zzenqVar);
                        }
                        if (obj != null) {
                            zzenqVar.zzj(t, obj);
                            return;
                        }
                        return;
                    }
                    Object zza = !this.zzirg ? null : zzekfVar.zza(zzekdVar, this.zzirf, zzbht);
                    if (zza != null) {
                        if (zzekjVar == null) {
                            zzekjVar = zzekfVar.zzaj(t);
                        }
                        zzekj<?> zzekjVar2 = zzekjVar;
                        obj = zzekfVar.zza(zzemsVar, zza, zzekdVar, zzekjVar2, obj, zzenqVar);
                        zzekjVar = zzekjVar2;
                    } else {
                        zzenqVar.zza(zzemsVar);
                        if (obj == null) {
                            obj = zzenqVar.zzaz(t);
                        }
                        if (!zzenqVar.zza((zzenq) obj, zzemsVar)) {
                            for (int i2 = this.zzirl; i2 < this.zzirm; i2++) {
                                obj = zza((Object) t, this.zzirk[i2], (int) obj, (zzenq<UT, int>) zzenqVar);
                            }
                            if (obj != null) {
                                zzenqVar.zzj(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    int zzhn = zzhn(zzhq);
                    switch ((267386880 & zzhn) >>> 20) {
                        case 0:
                            zzenw.zza(t, zzhn & 1048575, zzemsVar.readDouble());
                            zzf((zzemh<T>) t, zzhq);
                            break;
                        case 1:
                            zzenw.zza((Object) t, zzhn & 1048575, zzemsVar.readFloat());
                            zzf((zzemh<T>) t, zzhq);
                            break;
                        case 2:
                            zzenw.zza((Object) t, zzhn & 1048575, zzemsVar.zzbgx());
                            zzf((zzemh<T>) t, zzhq);
                            break;
                        case 3:
                            zzenw.zza((Object) t, zzhn & 1048575, zzemsVar.zzbgw());
                            zzf((zzemh<T>) t, zzhq);
                            break;
                        case 4:
                            zzenw.zzb(t, zzhn & 1048575, zzemsVar.zzbgy());
                            zzf((zzemh<T>) t, zzhq);
                            break;
                        case 5:
                            zzenw.zza((Object) t, zzhn & 1048575, zzemsVar.zzbgz());
                            zzf((zzemh<T>) t, zzhq);
                            break;
                        case 6:
                            zzenw.zzb(t, zzhn & 1048575, zzemsVar.zzbha());
                            zzf((zzemh<T>) t, zzhq);
                            break;
                        case 7:
                            zzenw.zza(t, zzhn & 1048575, zzemsVar.zzbhb());
                            zzf((zzemh<T>) t, zzhq);
                            break;
                        case 8:
                            zza(t, zzhn, zzemsVar);
                            zzf((zzemh<T>) t, zzhq);
                            break;
                        case 9:
                            if (zze((zzemh<T>) t, zzhq)) {
                                long j = zzhn & 1048575;
                                zzenw.zza(t, j, zzeks.zze(zzenw.zzp(t, j), zzemsVar.zza(zzhk(zzhq), zzekdVar)));
                                break;
                            } else {
                                zzenw.zza(t, zzhn & 1048575, zzemsVar.zza(zzhk(zzhq), zzekdVar));
                                zzf((zzemh<T>) t, zzhq);
                                break;
                            }
                        case 10:
                            zzenw.zza(t, zzhn & 1048575, zzemsVar.zzbhd());
                            zzf((zzemh<T>) t, zzhq);
                            break;
                        case 11:
                            zzenw.zzb(t, zzhn & 1048575, zzemsVar.zzbhe());
                            zzf((zzemh<T>) t, zzhq);
                            break;
                        case 12:
                            int zzbhf = zzemsVar.zzbhf();
                            zzekx zzhm = zzhm(zzhq);
                            if (zzhm != null && !zzhm.zzi(zzbhf)) {
                                obj = zzena.zza(zzbht, zzbhf, obj, (zzenq<UT, Object>) zzenqVar);
                                break;
                            }
                            zzenw.zzb(t, zzhn & 1048575, zzbhf);
                            zzf((zzemh<T>) t, zzhq);
                            break;
                        case 13:
                            zzenw.zzb(t, zzhn & 1048575, zzemsVar.zzbhg());
                            zzf((zzemh<T>) t, zzhq);
                            break;
                        case 14:
                            zzenw.zza((Object) t, zzhn & 1048575, zzemsVar.zzbhh());
                            zzf((zzemh<T>) t, zzhq);
                            break;
                        case 15:
                            zzenw.zzb(t, zzhn & 1048575, zzemsVar.zzbhi());
                            zzf((zzemh<T>) t, zzhq);
                            break;
                        case 16:
                            zzenw.zza((Object) t, zzhn & 1048575, zzemsVar.zzbhj());
                            zzf((zzemh<T>) t, zzhq);
                            break;
                        case 17:
                            if (zze((zzemh<T>) t, zzhq)) {
                                long j2 = zzhn & 1048575;
                                zzenw.zza(t, j2, zzeks.zze(zzenw.zzp(t, j2), zzemsVar.zzb(zzhk(zzhq), zzekdVar)));
                                break;
                            } else {
                                zzenw.zza(t, zzhn & 1048575, zzemsVar.zzb(zzhk(zzhq), zzekdVar));
                                zzf((zzemh<T>) t, zzhq);
                                break;
                            }
                        case 18:
                            zzemsVar.zzm(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 19:
                            zzemsVar.zzn(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 20:
                            zzemsVar.zzp(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 21:
                            zzemsVar.zzo(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 22:
                            zzemsVar.zzq(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 23:
                            zzemsVar.zzr(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 24:
                            zzemsVar.zzs(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 25:
                            zzemsVar.zzt(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 26:
                            if (zzhp(zzhn)) {
                                zzemsVar.zzu(this.zziro.zza(t, zzhn & 1048575));
                                break;
                            } else {
                                zzemsVar.readStringList(this.zziro.zza(t, zzhn & 1048575));
                                break;
                            }
                        case 27:
                            zzemsVar.zza(this.zziro.zza(t, zzhn & 1048575), zzhk(zzhq), zzekdVar);
                            break;
                        case 28:
                            zzemsVar.zzv(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 29:
                            zzemsVar.zzw(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 30:
                            List<Integer> zza2 = this.zziro.zza(t, zzhn & 1048575);
                            zzemsVar.zzx(zza2);
                            obj = zzena.zza(zzbht, zza2, zzhm(zzhq), obj, zzenqVar);
                            break;
                        case 31:
                            zzemsVar.zzy(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 32:
                            zzemsVar.zzz(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 33:
                            zzemsVar.zzaa(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 34:
                            zzemsVar.zzab(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 35:
                            zzemsVar.zzm(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 36:
                            zzemsVar.zzn(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 37:
                            zzemsVar.zzp(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 38:
                            zzemsVar.zzo(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 39:
                            zzemsVar.zzq(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 40:
                            zzemsVar.zzr(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 41:
                            zzemsVar.zzs(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 42:
                            zzemsVar.zzt(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 43:
                            zzemsVar.zzw(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 44:
                            List<Integer> zza3 = this.zziro.zza(t, zzhn & 1048575);
                            zzemsVar.zzx(zza3);
                            obj = zzena.zza(zzbht, zza3, zzhm(zzhq), obj, zzenqVar);
                            break;
                        case 45:
                            zzemsVar.zzy(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 46:
                            zzemsVar.zzz(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 47:
                            zzemsVar.zzaa(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 48:
                            zzemsVar.zzab(this.zziro.zza(t, zzhn & 1048575));
                            break;
                        case 49:
                            zzemsVar.zzb(this.zziro.zza(t, zzhn & 1048575), zzhk(zzhq), zzekdVar);
                            break;
                        case 50:
                            Object zzhl = zzhl(zzhq);
                            long zzhn2 = zzhn(zzhq) & 1048575;
                            Object zzp = zzenw.zzp(t, zzhn2);
                            if (zzp == null) {
                                zzp = this.zzirr.zzar(zzhl);
                                zzenw.zza(t, zzhn2, zzp);
                            } else if (this.zzirr.zzap(zzp)) {
                                Object zzar = this.zzirr.zzar(zzhl);
                                this.zzirr.zzf(zzar, zzp);
                                zzenw.zza(t, zzhn2, zzar);
                                zzp = zzar;
                            }
                            zzemsVar.zza(this.zzirr.zzan(zzp), this.zzirr.zzas(zzhl), zzekdVar);
                            break;
                        case 51:
                            zzenw.zza(t, zzhn & 1048575, Double.valueOf(zzemsVar.readDouble()));
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        case 52:
                            zzenw.zza(t, zzhn & 1048575, Float.valueOf(zzemsVar.readFloat()));
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        case 53:
                            zzenw.zza(t, zzhn & 1048575, Long.valueOf(zzemsVar.zzbgx()));
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        case 54:
                            zzenw.zza(t, zzhn & 1048575, Long.valueOf(zzemsVar.zzbgw()));
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        case 55:
                            zzenw.zza(t, zzhn & 1048575, Integer.valueOf(zzemsVar.zzbgy()));
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        case 56:
                            zzenw.zza(t, zzhn & 1048575, Long.valueOf(zzemsVar.zzbgz()));
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        case 57:
                            zzenw.zza(t, zzhn & 1048575, Integer.valueOf(zzemsVar.zzbha()));
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        case 58:
                            zzenw.zza(t, zzhn & 1048575, Boolean.valueOf(zzemsVar.zzbhb()));
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        case 59:
                            zza(t, zzhn, zzemsVar);
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        case 60:
                            if (zza((zzemh<T>) t, zzbht, zzhq)) {
                                long j3 = zzhn & 1048575;
                                zzenw.zza(t, j3, zzeks.zze(zzenw.zzp(t, j3), zzemsVar.zza(zzhk(zzhq), zzekdVar)));
                            } else {
                                zzenw.zza(t, zzhn & 1048575, zzemsVar.zza(zzhk(zzhq), zzekdVar));
                                zzf((zzemh<T>) t, zzhq);
                            }
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        case 61:
                            zzenw.zza(t, zzhn & 1048575, zzemsVar.zzbhd());
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        case 62:
                            zzenw.zza(t, zzhn & 1048575, Integer.valueOf(zzemsVar.zzbhe()));
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        case 63:
                            int zzbhf2 = zzemsVar.zzbhf();
                            zzekx zzhm2 = zzhm(zzhq);
                            if (zzhm2 != null && !zzhm2.zzi(zzbhf2)) {
                                obj = zzena.zza(zzbht, zzbhf2, obj, (zzenq<UT, Object>) zzenqVar);
                                break;
                            }
                            zzenw.zza(t, zzhn & 1048575, Integer.valueOf(zzbhf2));
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        case 64:
                            zzenw.zza(t, zzhn & 1048575, Integer.valueOf(zzemsVar.zzbhg()));
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        case 65:
                            zzenw.zza(t, zzhn & 1048575, Long.valueOf(zzemsVar.zzbhh()));
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        case 66:
                            zzenw.zza(t, zzhn & 1048575, Integer.valueOf(zzemsVar.zzbhi()));
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        case 67:
                            zzenw.zza(t, zzhn & 1048575, Long.valueOf(zzemsVar.zzbhj()));
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        case 68:
                            zzenw.zza(t, zzhn & 1048575, zzemsVar.zzb(zzhk(zzhq), zzekdVar));
                            zzb((zzemh<T>) t, zzbht, zzhq);
                            break;
                        default:
                            if (obj == null) {
                                try {
                                    obj = zzenqVar.zzblb();
                                } catch (zzelc unused) {
                                    zzenqVar.zza(zzemsVar);
                                    if (obj == null) {
                                        obj = zzenqVar.zzaz(t);
                                    }
                                    if (!zzenqVar.zza((zzenq) obj, zzemsVar)) {
                                        for (int i3 = this.zzirl; i3 < this.zzirm; i3++) {
                                            obj = zza((Object) t, this.zzirk[i3], (int) obj, (zzenq<UT, int>) zzenqVar);
                                        }
                                        if (obj != null) {
                                            zzenqVar.zzj(t, obj);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!zzenqVar.zza((zzenq) obj, zzemsVar)) {
                                for (int i4 = this.zzirl; i4 < this.zzirm; i4++) {
                                    obj = zza((Object) t, this.zzirk[i4], (int) obj, (zzenq<UT, int>) zzenqVar);
                                }
                                if (obj != null) {
                                    zzenqVar.zzj(t, obj);
                                    return;
                                }
                                return;
                            }
                            break;
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzirl; i5 < this.zzirm; i5++) {
                    obj = zza((Object) t, this.zzirk[i5], (int) obj, (zzenq<UT, int>) zzenqVar);
                }
                if (obj != null) {
                    zzenqVar.zzj(t, obj);
                }
                throw th;
            }
        }
    }

    private static zzent zzav(Object obj) {
        zzekq zzekqVar = (zzekq) obj;
        zzent zzentVar = zzekqVar.zziou;
        if (zzentVar != zzent.zzblc()) {
            return zzentVar;
        }
        zzent zzbld = zzent.zzbld();
        zzekqVar.zziou = zzbld;
        return zzbld;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    private static int zza(byte[] bArr, int i, int i2, zzeoh zzeohVar, Class<?> cls, zzejb zzejbVar) throws IOException {
        switch (zzemg.zzili[zzeohVar.ordinal()]) {
            case 1:
                int zzb = zzejc.zzb(bArr, i, zzejbVar);
                zzejbVar.zzike = Boolean.valueOf(zzejbVar.zzikd != 0);
                return zzb;
            case 2:
                return zzejc.zze(bArr, i, zzejbVar);
            case 3:
                zzejbVar.zzike = Double.valueOf(zzejc.zzj(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzejbVar.zzike = Integer.valueOf(zzejc.zzh(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzejbVar.zzike = Long.valueOf(zzejc.zzi(bArr, i));
                return i + 8;
            case 8:
                zzejbVar.zzike = Float.valueOf(zzejc.zzk(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zza = zzejc.zza(bArr, i, zzejbVar);
                zzejbVar.zzike = Integer.valueOf(zzejbVar.zzikc);
                return zza;
            case 12:
            case 13:
                int zzb2 = zzejc.zzb(bArr, i, zzejbVar);
                zzejbVar.zzike = Long.valueOf(zzejbVar.zzikd);
                return zzb2;
            case 14:
                return zzejc.zza(zzemr.zzbki().zzh(cls), bArr, i, i2, zzejbVar);
            case 15:
                int zza2 = zzejc.zza(bArr, i, zzejbVar);
                zzejbVar.zzike = Integer.valueOf(zzejr.zzgh(zzejbVar.zzikc));
                return zza2;
            case 16:
                int zzb3 = zzejc.zzb(bArr, i, zzejbVar);
                zzejbVar.zzike = Long.valueOf(zzejr.zzfg(zzejbVar.zzikd));
                return zzb3;
            case 17:
                return zzejc.zzd(bArr, i, zzejbVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x003a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0171  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x01e8 -> B:92:0x01e9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0236 -> B:110:0x0237). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x016e -> B:63:0x016f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzejb zzejbVar) throws IOException {
        int zza;
        int i8;
        int i9 = i;
        zzela zzelaVar = (zzela) zzhxt.getObject(t, j2);
        if (!zzelaVar.zzbgh()) {
            int size = zzelaVar.size();
            zzelaVar = zzelaVar.zzfy(size == 0 ? 10 : size << 1);
            zzhxt.putObject(t, j2, zzelaVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzekb zzekbVar = (zzekb) zzelaVar;
                    int zza2 = zzejc.zza(bArr, i9, zzejbVar);
                    int i10 = zzejbVar.zzikc + zza2;
                    while (zza2 < i10) {
                        zzekbVar.zze(zzejc.zzj(bArr, zza2));
                        zza2 += 8;
                    }
                    if (zza2 == i10) {
                        return zza2;
                    }
                    throw zzeld.zzbjd();
                }
                if (i5 == 1) {
                    zzekb zzekbVar2 = (zzekb) zzelaVar;
                    zzekbVar2.zze(zzejc.zzj(bArr, i));
                    while (true) {
                        int i11 = i9 + 8;
                        if (i11 >= i2) {
                            return i11;
                        }
                        i9 = zzejc.zza(bArr, i11, zzejbVar);
                        if (i3 != zzejbVar.zzikc) {
                            return i11;
                        }
                        zzekbVar2.zze(zzejc.zzj(bArr, i9));
                    }
                }
                return i9;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzekp zzekpVar = (zzekp) zzelaVar;
                    int zza3 = zzejc.zza(bArr, i9, zzejbVar);
                    int i12 = zzejbVar.zzikc + zza3;
                    while (zza3 < i12) {
                        zzekpVar.zzh(zzejc.zzk(bArr, zza3));
                        zza3 += 4;
                    }
                    if (zza3 == i12) {
                        return zza3;
                    }
                    throw zzeld.zzbjd();
                }
                if (i5 == 5) {
                    zzekp zzekpVar2 = (zzekp) zzelaVar;
                    zzekpVar2.zzh(zzejc.zzk(bArr, i));
                    while (true) {
                        int i13 = i9 + 4;
                        if (i13 >= i2) {
                            return i13;
                        }
                        i9 = zzejc.zza(bArr, i13, zzejbVar);
                        if (i3 != zzejbVar.zzikc) {
                            return i13;
                        }
                        zzekpVar2.zzh(zzejc.zzk(bArr, i9));
                    }
                }
                return i9;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzelr zzelrVar = (zzelr) zzelaVar;
                    int zza4 = zzejc.zza(bArr, i9, zzejbVar);
                    int i14 = zzejbVar.zzikc + zza4;
                    while (zza4 < i14) {
                        zza4 = zzejc.zzb(bArr, zza4, zzejbVar);
                        zzelrVar.zzfr(zzejbVar.zzikd);
                    }
                    if (zza4 == i14) {
                        return zza4;
                    }
                    throw zzeld.zzbjd();
                }
                if (i5 == 0) {
                    zzelr zzelrVar2 = (zzelr) zzelaVar;
                    int zzb = zzejc.zzb(bArr, i9, zzejbVar);
                    zzelrVar2.zzfr(zzejbVar.zzikd);
                    while (zzb < i2) {
                        int zza5 = zzejc.zza(bArr, zzb, zzejbVar);
                        if (i3 != zzejbVar.zzikc) {
                            return zzb;
                        }
                        zzb = zzejc.zzb(bArr, zza5, zzejbVar);
                        zzelrVar2.zzfr(zzejbVar.zzikd);
                    }
                    return zzb;
                }
                return i9;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzejc.zza(bArr, i9, (zzela<?>) zzelaVar, zzejbVar);
                }
                if (i5 == 0) {
                    return zzejc.zza(i3, bArr, i, i2, (zzela<?>) zzelaVar, zzejbVar);
                }
                return i9;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzelr zzelrVar3 = (zzelr) zzelaVar;
                    int zza6 = zzejc.zza(bArr, i9, zzejbVar);
                    int i15 = zzejbVar.zzikc + zza6;
                    while (zza6 < i15) {
                        zzelrVar3.zzfr(zzejc.zzi(bArr, zza6));
                        zza6 += 8;
                    }
                    if (zza6 == i15) {
                        return zza6;
                    }
                    throw zzeld.zzbjd();
                }
                if (i5 == 1) {
                    zzelr zzelrVar4 = (zzelr) zzelaVar;
                    zzelrVar4.zzfr(zzejc.zzi(bArr, i));
                    while (true) {
                        int i16 = i9 + 8;
                        if (i16 >= i2) {
                            return i16;
                        }
                        i9 = zzejc.zza(bArr, i16, zzejbVar);
                        if (i3 != zzejbVar.zzikc) {
                            return i16;
                        }
                        zzelrVar4.zzfr(zzejc.zzi(bArr, i9));
                    }
                }
                return i9;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzekt zzektVar = (zzekt) zzelaVar;
                    int zza7 = zzejc.zza(bArr, i9, zzejbVar);
                    int i17 = zzejbVar.zzikc + zza7;
                    while (zza7 < i17) {
                        zzektVar.zzhh(zzejc.zzh(bArr, zza7));
                        zza7 += 4;
                    }
                    if (zza7 == i17) {
                        return zza7;
                    }
                    throw zzeld.zzbjd();
                }
                if (i5 == 5) {
                    zzekt zzektVar2 = (zzekt) zzelaVar;
                    zzektVar2.zzhh(zzejc.zzh(bArr, i));
                    while (true) {
                        int i18 = i9 + 4;
                        if (i18 >= i2) {
                            return i18;
                        }
                        i9 = zzejc.zza(bArr, i18, zzejbVar);
                        if (i3 != zzejbVar.zzikc) {
                            return i18;
                        }
                        zzektVar2.zzhh(zzejc.zzh(bArr, i9));
                    }
                }
                return i9;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzeje zzejeVar = (zzeje) zzelaVar;
                    zza = zzejc.zza(bArr, i9, zzejbVar);
                    int i19 = zzejbVar.zzikc + zza;
                    while (zza < i19) {
                        zza = zzejc.zzb(bArr, zza, zzejbVar);
                        zzejeVar.addBoolean(zzejbVar.zzikd != 0);
                    }
                    if (zza != i19) {
                        throw zzeld.zzbjd();
                    }
                    return zza;
                }
                if (i5 == 0) {
                    zzeje zzejeVar2 = (zzeje) zzelaVar;
                    i9 = zzejc.zzb(bArr, i9, zzejbVar);
                    zzejeVar2.addBoolean(zzejbVar.zzikd != 0);
                    while (i9 < i2) {
                        int zza8 = zzejc.zza(bArr, i9, zzejbVar);
                        if (i3 == zzejbVar.zzikc) {
                            i9 = zzejc.zzb(bArr, zza8, zzejbVar);
                            zzejeVar2.addBoolean(zzejbVar.zzikd != 0);
                        }
                    }
                }
                return i9;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        i9 = zzejc.zza(bArr, i9, zzejbVar);
                        int i20 = zzejbVar.zzikc;
                        if (i20 < 0) {
                            throw zzeld.zzbje();
                        }
                        if (i20 == 0) {
                            zzelaVar.add("");
                            while (i9 < i2) {
                                int zza9 = zzejc.zza(bArr, i9, zzejbVar);
                                if (i3 == zzejbVar.zzikc) {
                                    i9 = zzejc.zza(bArr, zza9, zzejbVar);
                                    i20 = zzejbVar.zzikc;
                                    if (i20 < 0) {
                                        throw zzeld.zzbje();
                                    }
                                    if (i20 == 0) {
                                        zzelaVar.add("");
                                    } else {
                                        zzelaVar.add(new String(bArr, i9, i20, zzeks.UTF_8));
                                        i9 += i20;
                                        while (i9 < i2) {
                                        }
                                    }
                                }
                            }
                        } else {
                            zzelaVar.add(new String(bArr, i9, i20, zzeks.UTF_8));
                            i9 += i20;
                            while (i9 < i2) {
                            }
                        }
                    } else {
                        i9 = zzejc.zza(bArr, i9, zzejbVar);
                        int i21 = zzejbVar.zzikc;
                        if (i21 < 0) {
                            throw zzeld.zzbje();
                        }
                        if (i21 == 0) {
                            zzelaVar.add("");
                            while (i9 < i2) {
                                int zza10 = zzejc.zza(bArr, i9, zzejbVar);
                                if (i3 == zzejbVar.zzikc) {
                                    i9 = zzejc.zza(bArr, zza10, zzejbVar);
                                    int i22 = zzejbVar.zzikc;
                                    if (i22 < 0) {
                                        throw zzeld.zzbje();
                                    }
                                    if (i22 == 0) {
                                        zzelaVar.add("");
                                    } else {
                                        i8 = i9 + i22;
                                        if (!zzenz.zzm(bArr, i9, i8)) {
                                            throw zzeld.zzbjl();
                                        }
                                        zzelaVar.add(new String(bArr, i9, i22, zzeks.UTF_8));
                                        i9 = i8;
                                        while (i9 < i2) {
                                        }
                                    }
                                }
                            }
                        } else {
                            i8 = i9 + i21;
                            if (!zzenz.zzm(bArr, i9, i8)) {
                                throw zzeld.zzbjl();
                            }
                            zzelaVar.add(new String(bArr, i9, i21, zzeks.UTF_8));
                            i9 = i8;
                            while (i9 < i2) {
                            }
                        }
                    }
                }
                return i9;
            case 27:
                if (i5 == 2) {
                    return zzejc.zza(zzhk(i6), i3, bArr, i, i2, zzelaVar, zzejbVar);
                }
                return i9;
            case 28:
                if (i5 == 2) {
                    int zza11 = zzejc.zza(bArr, i9, zzejbVar);
                    int i23 = zzejbVar.zzikc;
                    if (i23 < 0) {
                        throw zzeld.zzbje();
                    }
                    if (i23 > bArr.length - zza11) {
                        throw zzeld.zzbjd();
                    }
                    if (i23 == 0) {
                        zzelaVar.add(zzejg.zzikj);
                        while (zza11 < i2) {
                            int zza12 = zzejc.zza(bArr, zza11, zzejbVar);
                            if (i3 != zzejbVar.zzikc) {
                                return zza11;
                            }
                            zza11 = zzejc.zza(bArr, zza12, zzejbVar);
                            i23 = zzejbVar.zzikc;
                            if (i23 < 0) {
                                throw zzeld.zzbje();
                            }
                            if (i23 > bArr.length - zza11) {
                                throw zzeld.zzbjd();
                            }
                            if (i23 == 0) {
                                zzelaVar.add(zzejg.zzikj);
                            } else {
                                zzelaVar.add(zzejg.zzi(bArr, zza11, i23));
                                zza11 += i23;
                                while (zza11 < i2) {
                                }
                            }
                        }
                        return zza11;
                    }
                    zzelaVar.add(zzejg.zzi(bArr, zza11, i23));
                    zza11 += i23;
                    while (zza11 < i2) {
                    }
                    return zza11;
                }
                return i9;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zza = zzejc.zza(i3, bArr, i, i2, (zzela<?>) zzelaVar, zzejbVar);
                    }
                    return i9;
                }
                zza = zzejc.zza(bArr, i9, (zzela<?>) zzelaVar, zzejbVar);
                zzekq zzekqVar = (zzekq) t;
                zzent zzentVar = zzekqVar.zziou;
                if (zzentVar == zzent.zzblc()) {
                    zzentVar = null;
                }
                zzent zzentVar2 = (zzent) zzena.zza(i4, zzelaVar, zzhm(i6), zzentVar, this.zzirp);
                if (zzentVar2 != null) {
                    zzekqVar.zziou = zzentVar2;
                }
                return zza;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzekt zzektVar3 = (zzekt) zzelaVar;
                    int zza13 = zzejc.zza(bArr, i9, zzejbVar);
                    int i24 = zzejbVar.zzikc + zza13;
                    while (zza13 < i24) {
                        zza13 = zzejc.zza(bArr, zza13, zzejbVar);
                        zzektVar3.zzhh(zzejr.zzgh(zzejbVar.zzikc));
                    }
                    if (zza13 == i24) {
                        return zza13;
                    }
                    throw zzeld.zzbjd();
                }
                if (i5 == 0) {
                    zzekt zzektVar4 = (zzekt) zzelaVar;
                    int zza14 = zzejc.zza(bArr, i9, zzejbVar);
                    zzektVar4.zzhh(zzejr.zzgh(zzejbVar.zzikc));
                    while (zza14 < i2) {
                        int zza15 = zzejc.zza(bArr, zza14, zzejbVar);
                        if (i3 != zzejbVar.zzikc) {
                            return zza14;
                        }
                        zza14 = zzejc.zza(bArr, zza15, zzejbVar);
                        zzektVar4.zzhh(zzejr.zzgh(zzejbVar.zzikc));
                    }
                    return zza14;
                }
                return i9;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzelr zzelrVar5 = (zzelr) zzelaVar;
                    int zza16 = zzejc.zza(bArr, i9, zzejbVar);
                    int i25 = zzejbVar.zzikc + zza16;
                    while (zza16 < i25) {
                        zza16 = zzejc.zzb(bArr, zza16, zzejbVar);
                        zzelrVar5.zzfr(zzejr.zzfg(zzejbVar.zzikd));
                    }
                    if (zza16 == i25) {
                        return zza16;
                    }
                    throw zzeld.zzbjd();
                }
                if (i5 == 0) {
                    zzelr zzelrVar6 = (zzelr) zzelaVar;
                    int zzb2 = zzejc.zzb(bArr, i9, zzejbVar);
                    zzelrVar6.zzfr(zzejr.zzfg(zzejbVar.zzikd));
                    while (zzb2 < i2) {
                        int zza17 = zzejc.zza(bArr, zzb2, zzejbVar);
                        if (i3 != zzejbVar.zzikc) {
                            return zzb2;
                        }
                        zzb2 = zzejc.zzb(bArr, zza17, zzejbVar);
                        zzelrVar6.zzfr(zzejr.zzfg(zzejbVar.zzikd));
                    }
                    return zzb2;
                }
                return i9;
            case 49:
                if (i5 == 3) {
                    zzemy zzhk = zzhk(i6);
                    int i26 = (i3 & (-8)) | 4;
                    i9 = zzejc.zza(zzhk, bArr, i, i2, i26, zzejbVar);
                    zzelaVar.add(zzejbVar.zzike);
                    while (i9 < i2) {
                        int zza18 = zzejc.zza(bArr, i9, zzejbVar);
                        if (i3 == zzejbVar.zzikc) {
                            i9 = zzejc.zza(zzhk, bArr, zza18, i2, i26, zzejbVar);
                            zzelaVar.add(zzejbVar.zzike);
                        }
                    }
                }
                return i9;
            default:
                return i9;
        }
    }

    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zzejb zzejbVar) throws IOException {
        Unsafe unsafe = zzhxt;
        Object zzhl = zzhl(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzirr.zzap(object)) {
            Object zzar = this.zzirr.zzar(zzhl);
            this.zzirr.zzf(zzar, object);
            unsafe.putObject(t, j, zzar);
            object = zzar;
        }
        zzelu<?, ?> zzas = this.zzirr.zzas(zzhl);
        Map<?, ?> zzan = this.zzirr.zzan(object);
        int zza = zzejc.zza(bArr, i, zzejbVar);
        int i4 = zzejbVar.zzikc;
        if (i4 < 0 || i4 > i2 - zza) {
            throw zzeld.zzbjd();
        }
        int i5 = i4 + zza;
        K k = zzas.zziqv;
        V v = zzas.zzclf;
        while (zza < i5) {
            int i6 = zza + 1;
            int i7 = bArr[zza];
            if (i7 < 0) {
                i6 = zzejc.zza(i7, bArr, i6, zzejbVar);
                i7 = zzejbVar.zzikc;
            }
            int i8 = i6;
            int i9 = i7 >>> 3;
            int i10 = i7 & 7;
            if (i9 == 1) {
                if (i10 == zzas.zziqu.zzblm()) {
                    zza = zza(bArr, i8, i2, zzas.zziqu, (Class<?>) null, zzejbVar);
                    k = (K) zzejbVar.zzike;
                } else {
                    zza = zzejc.zza(i7, bArr, i8, i2, zzejbVar);
                }
            } else {
                if (i9 == 2 && i10 == zzas.zziqw.zzblm()) {
                    zza = zza(bArr, i8, i2, zzas.zziqw, zzas.zzclf.getClass(), zzejbVar);
                    v = zzejbVar.zzike;
                }
                zza = zzejc.zza(i7, bArr, i8, i2, zzejbVar);
            }
        }
        if (zza != i5) {
            throw zzeld.zzbjk();
        }
        zzan.put(k, v);
        return i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzejb zzejbVar) throws IOException {
        int zzb;
        Unsafe unsafe = zzhxt;
        long j2 = this.zzirb[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(zzejc.zzj(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(zzejc.zzk(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    zzb = zzejc.zzb(bArr, i, zzejbVar);
                    unsafe.putObject(t, j, Long.valueOf(zzejbVar.zzikd));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    zzb = zzejc.zza(bArr, i, zzejbVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzejbVar.zzikc));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zzejc.zzi(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zzejc.zzh(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    zzb = zzejc.zzb(bArr, i, zzejbVar);
                    unsafe.putObject(t, j, Boolean.valueOf(zzejbVar.zzikd != 0));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int zza = zzejc.zza(bArr, i, zzejbVar);
                    int i9 = zzejbVar.zzikc;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !zzenz.zzm(bArr, zza, zza + i9)) {
                            throw zzeld.zzbjl();
                        }
                        unsafe.putObject(t, j, new String(bArr, zza, i9, zzeks.UTF_8));
                        zza += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int zza2 = zzejc.zza(zzhk(i8), bArr, i, i2, zzejbVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzejbVar.zzike);
                    } else {
                        unsafe.putObject(t, j, zzeks.zze(object, zzejbVar.zzike));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    zzb = zzejc.zze(bArr, i, zzejbVar);
                    unsafe.putObject(t, j, zzejbVar.zzike);
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int zza3 = zzejc.zza(bArr, i, zzejbVar);
                    int i10 = zzejbVar.zzikc;
                    zzekx zzhm = zzhm(i8);
                    if (zzhm == null || zzhm.zzi(i10)) {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        zzb = zza3;
                        unsafe.putInt(t, j2, i4);
                        return zzb;
                    }
                    zzav(t).zzd(i3, Long.valueOf(i10));
                    return zza3;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    zzb = zzejc.zza(bArr, i, zzejbVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzejr.zzgh(zzejbVar.zzikc)));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    zzb = zzejc.zzb(bArr, i, zzejbVar);
                    unsafe.putObject(t, j, Long.valueOf(zzejr.zzfg(zzejbVar.zzikd)));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    zzb = zzejc.zza(zzhk(i8), bArr, i, i2, (i3 & (-8)) | 4, zzejbVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzejbVar.zzike);
                    } else {
                        unsafe.putObject(t, j, zzeks.zze(object2, zzejbVar.zzike));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            default:
                return i;
        }
    }

    private final zzemy zzhk(int i) {
        int i2 = (i / 3) << 1;
        zzemy zzemyVar = (zzemy) this.zzirc[i2];
        if (zzemyVar != null) {
            return zzemyVar;
        }
        zzemy<T> zzh = zzemr.zzbki().zzh((Class) this.zzirc[i2 + 1]);
        this.zzirc[i2] = zzh;
        return zzh;
    }

    private final Object zzhl(int i) {
        return this.zzirc[(i / 3) << 1];
    }

    private final zzekx zzhm(int i) {
        return (zzekx) this.zzirc[((i / 3) << 1) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x04d7, code lost:
    
        if (r6 == 1048575) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x04d9, code lost:
    
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x04df, code lost:
    
        r1 = null;
        r2 = r9.zzirl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x04e4, code lost:
    
        if (r2 >= r9.zzirm) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x04e6, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzent) r9.zza(r12, r9.zzirk[r2], (int) r1, (com.google.android.gms.internal.ads.zzenq<UT, int>) r9.zzirp);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x04f5, code lost:
    
        if (r1 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x04f7, code lost:
    
        r9.zzirp.zzj(r12, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x04fc, code lost:
    
        if (r7 != 0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0500, code lost:
    
        if (r0 != r31) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0507, code lost:
    
        throw com.google.android.gms.internal.ads.zzeld.zzbjk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x050e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x050a, code lost:
    
        if (r0 > r31) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x050c, code lost:
    
        if (r3 != r7) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0514, code lost:
    
        throw com.google.android.gms.internal.ads.zzeld.zzbjk();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:111:0x0088. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(T t, byte[] bArr, int i, int i2, int i3, zzejb zzejbVar) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj;
        zzemh<T> zzemhVar;
        int i5;
        int zzhq;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Object obj2;
        int i11;
        zzejb zzejbVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        zzejb zzejbVar3;
        zzejb zzejbVar4;
        int zzb;
        int i16;
        zzejb zzejbVar5;
        int i17;
        int i18;
        int i19;
        zzemh<T> zzemhVar2 = this;
        Object obj3 = t;
        byte[] bArr2 = bArr;
        int i20 = i2;
        int i21 = i3;
        zzejb zzejbVar6 = zzejbVar;
        Unsafe unsafe2 = zzhxt;
        int i22 = i;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 1048575;
        while (true) {
            if (i22 < i20) {
                int i28 = i22 + 1;
                byte b = bArr2[i22];
                if (b < 0) {
                    int zza = zzejc.zza(b, bArr2, i28, zzejbVar6);
                    i5 = zzejbVar6.zzikc;
                    i28 = zza;
                } else {
                    i5 = b;
                }
                int i29 = i5 >>> 3;
                int i30 = i5 & 7;
                if (i29 > i23) {
                    zzhq = zzemhVar2.zzao(i29, i24 / 3);
                } else {
                    zzhq = zzemhVar2.zzhq(i29);
                }
                int i31 = zzhq;
                if (i31 == -1) {
                    i6 = i29;
                    i7 = i28;
                    i8 = i5;
                    i9 = i26;
                    unsafe = unsafe2;
                    i4 = i21;
                    i10 = 0;
                } else {
                    int[] iArr = zzemhVar2.zzirb;
                    int i32 = iArr[i31 + 1];
                    int i33 = (i32 & 267386880) >>> 20;
                    int i34 = i5;
                    long j = i32 & 1048575;
                    if (i33 <= 17) {
                        int i35 = iArr[i31 + 2];
                        int i36 = 1 << (i35 >>> 20);
                        int i37 = i35 & 1048575;
                        if (i37 != i27) {
                            if (i27 != 1048575) {
                                unsafe2.putInt(obj3, i27, i26);
                            }
                            i26 = unsafe2.getInt(obj3, i37);
                            i12 = i37;
                        } else {
                            i12 = i27;
                        }
                        int i38 = i26;
                        switch (i33) {
                            case 0:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzejbVar4 = zzejbVar;
                                if (i30 != 1) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    zzenw.zza(obj3, j, zzejc.zzj(bArr2, i28));
                                    i22 = i28 + 8;
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    i24 = i14;
                                    zzejbVar6 = zzejbVar4;
                                    i20 = i2;
                                    i21 = i3;
                                }
                            case 1:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzejbVar4 = zzejbVar;
                                if (i30 != 5) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    zzenw.zza(obj3, j, zzejc.zzk(bArr2, i28));
                                    i22 = i28 + 4;
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    i24 = i14;
                                    zzejbVar6 = zzejbVar4;
                                    i20 = i2;
                                    i21 = i3;
                                }
                            case 2:
                            case 3:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzejbVar4 = zzejbVar;
                                if (i30 != 0) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    zzb = zzejc.zzb(bArr2, i28, zzejbVar4);
                                    unsafe2.putLong(t, j, zzejbVar4.zzikd);
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i22 = zzb;
                                    i25 = i8;
                                    i23 = i13;
                                    i24 = i14;
                                    zzejbVar6 = zzejbVar4;
                                    i20 = i2;
                                    i21 = i3;
                                }
                            case 4:
                            case 11:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzejbVar4 = zzejbVar;
                                if (i30 != 0) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    i22 = zzejc.zza(bArr2, i28, zzejbVar4);
                                    unsafe2.putInt(obj3, j, zzejbVar4.zzikc);
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    i24 = i14;
                                    zzejbVar6 = zzejbVar4;
                                    i20 = i2;
                                    i21 = i3;
                                }
                            case 5:
                            case 14:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzejbVar4 = zzejbVar;
                                if (i30 != 1) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    unsafe2.putLong(t, j, zzejc.zzi(bArr2, i28));
                                    i22 = i28 + 8;
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    i24 = i14;
                                    zzejbVar6 = zzejbVar4;
                                    i20 = i2;
                                    i21 = i3;
                                }
                            case 6:
                            case 13:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                i16 = i2;
                                zzejbVar5 = zzejbVar;
                                if (i30 != 5) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, j, zzejc.zzh(bArr2, i28));
                                    i22 = i28 + 4;
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    zzejbVar6 = zzejbVar5;
                                    i20 = i16;
                                    i24 = i14;
                                    i21 = i3;
                                }
                            case 7:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                i16 = i2;
                                zzejbVar5 = zzejbVar;
                                if (i30 != 0) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    int zzb2 = zzejc.zzb(bArr2, i28, zzejbVar5);
                                    zzenw.zza(obj3, j, zzejbVar5.zzikd != 0);
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i22 = zzb2;
                                    i25 = i8;
                                    i23 = i13;
                                    zzejbVar6 = zzejbVar5;
                                    i20 = i16;
                                    i24 = i14;
                                    i21 = i3;
                                }
                            case 8:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                i16 = i2;
                                zzejbVar5 = zzejbVar;
                                if (i30 != 2) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    if ((i32 & 536870912) == 0) {
                                        i22 = zzejc.zzc(bArr2, i28, zzejbVar5);
                                    } else {
                                        i22 = zzejc.zzd(bArr2, i28, zzejbVar5);
                                    }
                                    unsafe2.putObject(obj3, j, zzejbVar5.zzike);
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    zzejbVar6 = zzejbVar5;
                                    i20 = i16;
                                    i24 = i14;
                                    i21 = i3;
                                }
                            case 9:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzejbVar5 = zzejbVar;
                                if (i30 != 2) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    i16 = i2;
                                    i22 = zzejc.zza(zzemhVar2.zzhk(i14), bArr2, i28, i16, zzejbVar5);
                                    if ((i38 & i36) == 0) {
                                        unsafe2.putObject(obj3, j, zzejbVar5.zzike);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzeks.zze(unsafe2.getObject(obj3, j), zzejbVar5.zzike));
                                    }
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    zzejbVar6 = zzejbVar5;
                                    i20 = i16;
                                    i24 = i14;
                                    i21 = i3;
                                }
                            case 10:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzejbVar4 = zzejbVar;
                                if (i30 != 2) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    i22 = zzejc.zze(bArr2, i28, zzejbVar4);
                                    unsafe2.putObject(obj3, j, zzejbVar4.zzike);
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    i24 = i14;
                                    zzejbVar6 = zzejbVar4;
                                    i20 = i2;
                                    i21 = i3;
                                }
                            case 12:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzejbVar4 = zzejbVar;
                                if (i30 != 0) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    i22 = zzejc.zza(bArr2, i28, zzejbVar4);
                                    int i39 = zzejbVar4.zzikc;
                                    zzekx zzhm = zzemhVar2.zzhm(i14);
                                    if (zzhm == null || zzhm.zzi(i39)) {
                                        unsafe2.putInt(obj3, j, i39);
                                        i26 = i38 | i36;
                                        i27 = i15;
                                        i25 = i8;
                                        i23 = i13;
                                        i24 = i14;
                                        zzejbVar6 = zzejbVar4;
                                        i20 = i2;
                                        i21 = i3;
                                    } else {
                                        zzav(t).zzd(i8, Long.valueOf(i39));
                                        i26 = i38;
                                        i25 = i8;
                                        i23 = i13;
                                        i24 = i14;
                                        zzejbVar6 = zzejbVar4;
                                        i27 = i15;
                                        i20 = i2;
                                        i21 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzejbVar4 = zzejbVar;
                                if (i30 != 0) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    i22 = zzejc.zza(bArr2, i28, zzejbVar4);
                                    unsafe2.putInt(obj3, j, zzejr.zzgh(zzejbVar4.zzikc));
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    i24 = i14;
                                    zzejbVar6 = zzejbVar4;
                                    i20 = i2;
                                    i21 = i3;
                                }
                            case 16:
                                i13 = i29;
                                i14 = i31;
                                if (i30 != 0) {
                                    i15 = i12;
                                    i8 = i34;
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    bArr2 = bArr;
                                    zzb = zzejc.zzb(bArr2, i28, zzejbVar);
                                    zzejbVar4 = zzejbVar;
                                    i15 = i12;
                                    i8 = i34;
                                    unsafe2.putLong(t, j, zzejr.zzfg(zzejbVar.zzikd));
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i22 = zzb;
                                    i25 = i8;
                                    i23 = i13;
                                    i24 = i14;
                                    zzejbVar6 = zzejbVar4;
                                    i20 = i2;
                                    i21 = i3;
                                }
                            case 17:
                                if (i30 != 3) {
                                    i13 = i29;
                                    i14 = i31;
                                    i15 = i12;
                                    i8 = i34;
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    i22 = zzejc.zza(zzemhVar2.zzhk(i31), bArr, i28, i2, (i29 << 3) | 4, zzejbVar);
                                    if ((i38 & i36) == 0) {
                                        zzejbVar3 = zzejbVar;
                                        unsafe2.putObject(obj3, j, zzejbVar3.zzike);
                                    } else {
                                        zzejbVar3 = zzejbVar;
                                        unsafe2.putObject(obj3, j, zzeks.zze(unsafe2.getObject(obj3, j), zzejbVar3.zzike));
                                    }
                                    i26 = i38 | i36;
                                    bArr2 = bArr;
                                    i20 = i2;
                                    i25 = i34;
                                    i27 = i12;
                                    i23 = i29;
                                    i24 = i31;
                                    i21 = i3;
                                    zzejbVar6 = zzejbVar3;
                                }
                            default:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                i4 = i3;
                                i7 = i28;
                                i9 = i38;
                                unsafe = unsafe2;
                                i10 = i14;
                                i27 = i15;
                                i6 = i13;
                                break;
                        }
                    } else {
                        bArr2 = bArr;
                        zzejb zzejbVar7 = zzejbVar6;
                        if (i33 != 27) {
                            i10 = i31;
                            i9 = i26;
                            i17 = i27;
                            if (i33 <= 49) {
                                int i40 = i28;
                                i18 = i34;
                                i6 = i29;
                                unsafe = unsafe2;
                                i22 = zza((zzemh<T>) t, bArr, i28, i2, i34, i29, i30, i10, i32, i33, j, zzejbVar);
                                if (i22 == i40) {
                                    i4 = i3;
                                    i7 = i22;
                                } else {
                                    zzemhVar2 = this;
                                    obj3 = t;
                                    bArr2 = bArr;
                                    i23 = i6;
                                    i20 = i2;
                                    i21 = i3;
                                    zzejbVar6 = zzejbVar;
                                    i24 = i10;
                                    i25 = i18;
                                    i26 = i9;
                                    i27 = i17;
                                    unsafe2 = unsafe;
                                }
                            } else {
                                i19 = i28;
                                i18 = i34;
                                i6 = i29;
                                unsafe = unsafe2;
                                if (i33 != 50) {
                                    i22 = zza((zzemh<T>) t, bArr, i19, i2, i18, i6, i30, i32, i33, j, i10, zzejbVar);
                                    if (i22 != i19) {
                                        zzemhVar2 = this;
                                        obj3 = t;
                                        bArr2 = bArr;
                                        i20 = i2;
                                        zzejbVar6 = zzejbVar;
                                        i25 = i18;
                                        i23 = i6;
                                        i24 = i10;
                                        i26 = i9;
                                        i27 = i17;
                                        unsafe2 = unsafe;
                                        i21 = i3;
                                    }
                                } else if (i30 == 2) {
                                    i22 = zza((zzemh<T>) t, bArr, i19, i2, i10, j, zzejbVar);
                                    if (i22 != i19) {
                                        zzemhVar2 = this;
                                        obj3 = t;
                                        bArr2 = bArr;
                                        i23 = i6;
                                        i20 = i2;
                                        i21 = i3;
                                        zzejbVar6 = zzejbVar;
                                        i24 = i10;
                                        i25 = i18;
                                        i26 = i9;
                                        i27 = i17;
                                        unsafe2 = unsafe;
                                    }
                                } else {
                                    i4 = i3;
                                    i7 = i19;
                                }
                                i4 = i3;
                                i7 = i22;
                            }
                        } else if (i30 == 2) {
                            zzela zzelaVar = (zzela) unsafe2.getObject(obj3, j);
                            if (!zzelaVar.zzbgh()) {
                                int size = zzelaVar.size();
                                zzelaVar = zzelaVar.zzfy(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(obj3, j, zzelaVar);
                            }
                            i22 = zzejc.zza(zzemhVar2.zzhk(i31), i34, bArr, i28, i2, zzelaVar, zzejbVar);
                            i21 = i3;
                            i25 = i34;
                            i23 = i29;
                            zzejbVar6 = zzejbVar7;
                            i24 = i31;
                            i26 = i26;
                            i27 = i27;
                            i20 = i2;
                        } else {
                            i10 = i31;
                            i9 = i26;
                            i17 = i27;
                            i19 = i28;
                            i18 = i34;
                            i6 = i29;
                            unsafe = unsafe2;
                            i4 = i3;
                            i7 = i19;
                        }
                        i8 = i18;
                        i27 = i17;
                    }
                }
                if (i8 != i4 || i4 == 0) {
                    if (this.zzirg) {
                        zzejbVar2 = zzejbVar;
                        if (zzejbVar2.zzikf != zzekd.zzbhz()) {
                            int i41 = i6;
                            if (zzejbVar2.zzikf.zza(this.zzirf, i41) == null) {
                                i22 = zzejc.zza(i8, bArr, i7, i2, zzav(t), zzejbVar);
                                obj3 = t;
                                bArr2 = bArr;
                                i20 = i2;
                                i25 = i8;
                                zzemhVar2 = this;
                                zzejbVar6 = zzejbVar2;
                                i23 = i41;
                                i24 = i10;
                                i26 = i9;
                                unsafe2 = unsafe;
                                i21 = i4;
                            } else {
                                zzekq.zzd zzdVar = (zzekq.zzd) t;
                                zzdVar.zzbja();
                                zzekj<zzekq.zzc> zzekjVar = zzdVar.zzipb;
                                throw new NoSuchMethodError();
                            }
                        } else {
                            obj2 = t;
                            i11 = i6;
                        }
                    } else {
                        obj2 = t;
                        i11 = i6;
                        zzejbVar2 = zzejbVar;
                    }
                    i22 = zzejc.zza(i8, bArr, i7, i2, zzav(t), zzejbVar);
                    i20 = i2;
                    i25 = i8;
                    zzemhVar2 = this;
                    zzejbVar6 = zzejbVar2;
                    i23 = i11;
                    obj3 = obj2;
                    i24 = i10;
                    i26 = i9;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i21 = i4;
                } else {
                    zzemhVar = this;
                    obj = t;
                    i22 = i7;
                    i25 = i8;
                    i26 = i9;
                }
            } else {
                unsafe = unsafe2;
                i4 = i21;
                obj = obj3;
                zzemhVar = zzemhVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x02dc, code lost:
    
        if (r0 == r5) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e0, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r18;
        r1 = r25;
        r6 = r27;
        r7 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0348, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0323, code lost:
    
        if (r0 == r15) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0346, code lost:
    
        if (r0 == r15) goto L116;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0095. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzemy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i, int i2, zzejb zzejbVar) throws IOException {
        byte b;
        int i3;
        int zzhq;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Unsafe unsafe;
        int i9;
        int i10;
        Unsafe unsafe2;
        int i11;
        int i12;
        Unsafe unsafe3;
        Unsafe unsafe4;
        zzemh<T> zzemhVar = this;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i13 = i2;
        zzejb zzejbVar2 = zzejbVar;
        if (zzemhVar.zziri) {
            Unsafe unsafe5 = zzhxt;
            int i14 = -1;
            int i15 = 1048575;
            int i16 = i;
            int i17 = -1;
            int i18 = 0;
            int i19 = 0;
            int i20 = 1048575;
            while (i16 < i13) {
                int i21 = i16 + 1;
                byte b2 = bArr2[i16];
                if (b2 < 0) {
                    i3 = zzejc.zza(b2, bArr2, i21, zzejbVar2);
                    b = zzejbVar2.zzikc;
                } else {
                    b = b2;
                    i3 = i21;
                }
                int i22 = b >>> 3;
                int i23 = b & 7;
                if (i22 > i17) {
                    zzhq = zzemhVar.zzao(i22, i18 / 3);
                } else {
                    zzhq = zzemhVar.zzhq(i22);
                }
                int i24 = zzhq;
                if (i24 == i14) {
                    i10 = i3;
                    i4 = i22;
                    unsafe = unsafe5;
                    i6 = 0;
                } else {
                    int[] iArr = zzemhVar.zzirb;
                    int i25 = iArr[i24 + 1];
                    int i26 = (i25 & 267386880) >>> 20;
                    Unsafe unsafe6 = unsafe5;
                    long j = i25 & i15;
                    if (i26 <= 17) {
                        int i27 = iArr[i24 + 2];
                        int i28 = 1 << (i27 >>> 20);
                        int i29 = i27 & 1048575;
                        if (i29 != i20) {
                            if (i20 != 1048575) {
                                long j2 = i20;
                                unsafe4 = unsafe6;
                                unsafe4.putInt(t2, j2, i19);
                            } else {
                                unsafe4 = unsafe6;
                            }
                            if (i29 != 1048575) {
                                i19 = unsafe4.getInt(t2, i29);
                            }
                            unsafe2 = unsafe4;
                            i20 = i29;
                        } else {
                            unsafe2 = unsafe6;
                        }
                        switch (i26) {
                            case 0:
                                i4 = i22;
                                i11 = i3;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 1) {
                                    zzenw.zza(t2, j, zzejc.zzj(bArr2, i11));
                                    i16 = i11 + 8;
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 1:
                                i4 = i22;
                                i11 = i3;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 5) {
                                    zzenw.zza((Object) t2, j, zzejc.zzk(bArr2, i11));
                                    i16 = i11 + 4;
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 2:
                            case 3:
                                i4 = i22;
                                i11 = i3;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 0) {
                                    int zzb = zzejc.zzb(bArr2, i11, zzejbVar2);
                                    unsafe3.putLong(t, j, zzejbVar2.zzikd);
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    i16 = zzb;
                                    break;
                                }
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 4:
                            case 11:
                                i4 = i22;
                                i11 = i3;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 0) {
                                    i16 = zzejc.zza(bArr2, i11, zzejbVar2);
                                    unsafe3.putInt(t2, j, zzejbVar2.zzikc);
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 5:
                            case 14:
                                i4 = i22;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 1) {
                                    unsafe3.putLong(t, j, zzejc.zzi(bArr2, i3));
                                    i16 = i3 + 8;
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i11 = i3;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 6:
                            case 13:
                                i4 = i22;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 5) {
                                    unsafe3.putInt(t2, j, zzejc.zzh(bArr2, i3));
                                    i16 = i3 + 4;
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i11 = i3;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 7:
                                i4 = i22;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 0) {
                                    i16 = zzejc.zzb(bArr2, i3, zzejbVar2);
                                    zzenw.zza(t2, j, zzejbVar2.zzikd != 0);
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i11 = i3;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 8:
                                i4 = i22;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 2) {
                                    if ((i25 & 536870912) == 0) {
                                        i16 = zzejc.zzc(bArr2, i3, zzejbVar2);
                                    } else {
                                        i16 = zzejc.zzd(bArr2, i3, zzejbVar2);
                                    }
                                    unsafe3.putObject(t2, j, zzejbVar2.zzike);
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i11 = i3;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 9:
                                i4 = i22;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 2) {
                                    i16 = zzejc.zza(zzemhVar.zzhk(i12), bArr2, i3, i13, zzejbVar2);
                                    Object object = unsafe3.getObject(t2, j);
                                    if (object == null) {
                                        unsafe3.putObject(t2, j, zzejbVar2.zzike);
                                    } else {
                                        unsafe3.putObject(t2, j, zzeks.zze(object, zzejbVar2.zzike));
                                    }
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i11 = i3;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 10:
                                i4 = i22;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 2) {
                                    i16 = zzejc.zze(bArr2, i3, zzejbVar2);
                                    unsafe3.putObject(t2, j, zzejbVar2.zzike);
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i11 = i3;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 12:
                                i4 = i22;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 0) {
                                    i16 = zzejc.zza(bArr2, i3, zzejbVar2);
                                    unsafe3.putInt(t2, j, zzejbVar2.zzikc);
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i11 = i3;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 15:
                                i4 = i22;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 0) {
                                    i16 = zzejc.zza(bArr2, i3, zzejbVar2);
                                    unsafe3.putInt(t2, j, zzejr.zzgh(zzejbVar2.zzikc));
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i11 = i3;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 16:
                                if (i23 != 0) {
                                    i4 = i22;
                                    i5 = i20;
                                    unsafe3 = unsafe2;
                                    i11 = i3;
                                    i12 = i24;
                                    i10 = i11;
                                    unsafe = unsafe3;
                                    i6 = i12;
                                    i20 = i5;
                                    break;
                                } else {
                                    int zzb2 = zzejc.zzb(bArr2, i3, zzejbVar2);
                                    i5 = i20;
                                    i4 = i22;
                                    unsafe2.putLong(t, j, zzejr.zzfg(zzejbVar2.zzikd));
                                    i19 |= i28;
                                    unsafe5 = unsafe2;
                                    i18 = i24;
                                    i16 = zzb2;
                                    break;
                                }
                            default:
                                i4 = i22;
                                i11 = i3;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                        }
                        i15 = 1048575;
                        i14 = -1;
                    } else {
                        i4 = i22;
                        int i30 = i3;
                        i5 = i20;
                        if (i26 != 27) {
                            i6 = i24;
                            if (i26 <= 49) {
                                i8 = i19;
                                i9 = i5;
                                unsafe = unsafe6;
                                i16 = zza((zzemh<T>) t, bArr, i30, i2, b, i4, i23, i6, i25, i26, j, zzejbVar);
                            } else {
                                i7 = i30;
                                i8 = i19;
                                unsafe = unsafe6;
                                i9 = i5;
                                if (i26 != 50) {
                                    i16 = zza((zzemh<T>) t, bArr, i7, i2, b, i4, i23, i25, i26, j, i6, zzejbVar);
                                } else if (i23 == 2) {
                                    i16 = zza((zzemh<T>) t, bArr, i7, i2, i6, j, zzejbVar);
                                }
                            }
                            unsafe5 = unsafe;
                            i15 = 1048575;
                            i14 = -1;
                        } else if (i23 == 2) {
                            zzela zzelaVar = (zzela) unsafe6.getObject(t2, j);
                            if (!zzelaVar.zzbgh()) {
                                int size = zzelaVar.size();
                                zzelaVar = zzelaVar.zzfy(size == 0 ? 10 : size << 1);
                                unsafe6.putObject(t2, j, zzelaVar);
                            }
                            i16 = zzejc.zza(zzemhVar.zzhk(i24), b, bArr, i30, i2, zzelaVar, zzejbVar);
                            unsafe5 = unsafe6;
                            i19 = i19;
                            i18 = i24;
                        } else {
                            i6 = i24;
                            i7 = i30;
                            i8 = i19;
                            unsafe = unsafe6;
                            i9 = i5;
                        }
                        i10 = i7;
                        i19 = i8;
                        i20 = i9;
                        i16 = zzejc.zza(b, bArr, i10, i2, zzav(t), zzejbVar);
                        zzemhVar = this;
                        t2 = t;
                        bArr2 = bArr;
                        i13 = i2;
                        zzejbVar2 = zzejbVar;
                        i18 = i6;
                        i17 = i4;
                        unsafe5 = unsafe;
                        i15 = 1048575;
                        i14 = -1;
                    }
                    i20 = i5;
                    i17 = i4;
                    i15 = 1048575;
                    i14 = -1;
                }
                i16 = zzejc.zza(b, bArr, i10, i2, zzav(t), zzejbVar);
                zzemhVar = this;
                t2 = t;
                bArr2 = bArr;
                i13 = i2;
                zzejbVar2 = zzejbVar;
                i18 = i6;
                i17 = i4;
                unsafe5 = unsafe;
                i15 = 1048575;
                i14 = -1;
            }
            int i31 = i19;
            Unsafe unsafe7 = unsafe5;
            if (i20 != 1048575) {
                unsafe7.putInt(t, i20, i31);
            }
            if (i16 != i2) {
                throw zzeld.zzbjk();
            }
            return;
        }
        zza((zzemh<T>) t, bArr, i, i2, 0, zzejbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzemy
    public final void zzak(T t) {
        int i;
        int i2 = this.zzirl;
        while (true) {
            i = this.zzirm;
            if (i2 >= i) {
                break;
            }
            long zzhn = zzhn(this.zzirk[i2]) & 1048575;
            Object zzp = zzenw.zzp(t, zzhn);
            if (zzp != null) {
                zzenw.zza(t, zzhn, this.zzirr.zzaq(zzp));
            }
            i2++;
        }
        int length = this.zzirk.length;
        while (i < length) {
            this.zziro.zzb(t, this.zzirk[i]);
            i++;
        }
        this.zzirp.zzak(t);
        if (this.zzirg) {
            this.zzirq.zzak(t);
        }
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzenq<UT, UB> zzenqVar) {
        zzekx zzhm;
        int i2 = this.zzirb[i];
        Object zzp = zzenw.zzp(obj, zzhn(i) & 1048575);
        return (zzp == null || (zzhm = zzhm(i)) == null) ? ub : (UB) zza(i, i2, this.zzirr.zzan(zzp), zzhm, (zzekx) ub, (zzenq<UT, zzekx>) zzenqVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzekx zzekxVar, UB ub, zzenq<UT, UB> zzenqVar) {
        zzelu<?, ?> zzas = this.zzirr.zzas(zzhl(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzekxVar.zzi(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzenqVar.zzblb();
                }
                zzejo zzgb = zzejg.zzgb(zzelv.zza(zzas, next.getKey(), next.getValue()));
                try {
                    zzelv.zza(zzgb.zzbgu(), zzas, next.getKey(), next.getValue());
                    zzenqVar.zza((zzenq<UT, UB>) ub, i2, zzgb.zzbgt());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.ads.zzemy] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.ads.zzemy] */
    @Override // com.google.android.gms.internal.ads.zzemy
    public final boolean zzaw(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i5 >= this.zzirl) {
                return !this.zzirg || this.zzirq.zzai(t).isInitialized();
            }
            int i6 = this.zzirk[i5];
            int i7 = this.zzirb[i6];
            int zzhn = zzhn(i6);
            int i8 = this.zzirb[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzhxt.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if (((268435456 & zzhn) != 0) && !zza((zzemh<T>) t, i6, i, i2, i10)) {
                return false;
            }
            int i11 = (267386880 & zzhn) >>> 20;
            if (i11 == 9 || i11 == 17) {
                if (zza((zzemh<T>) t, i6, i, i2, i10) && !zza(t, zzhn, zzhk(i6))) {
                    return false;
                }
            } else {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (zza((zzemh<T>) t, i7, i6) && !zza(t, zzhn, zzhk(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzao = this.zzirr.zzao(zzenw.zzp(t, zzhn & 1048575));
                            if (!zzao.isEmpty()) {
                                if (this.zzirr.zzas(zzhl(i6)).zziqw.zzbll() == zzeok.MESSAGE) {
                                    ?? r1 = 0;
                                    Iterator<?> it = zzao.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        r1 = r1;
                                        if (r1 == 0) {
                                            r1 = zzemr.zzbki().zzh(next.getClass());
                                        }
                                        if (!r1.zzaw(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzenw.zzp(t, zzhn & 1048575);
                if (!list.isEmpty()) {
                    ?? zzhk = zzhk(i6);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            break;
                        }
                        if (!zzhk.zzaw(list.get(i12))) {
                            z = false;
                            break;
                        }
                        i12++;
                    }
                }
                if (!z) {
                    return false;
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzemy zzemyVar) {
        return zzemyVar.zzaw(zzenw.zzp(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzeon zzeonVar) throws IOException {
        if (obj instanceof String) {
            zzeonVar.zzi(i, (String) obj);
        } else {
            zzeonVar.zza(i, (zzejg) obj);
        }
    }

    private final void zza(Object obj, int i, zzems zzemsVar) throws IOException {
        if (zzhp(i)) {
            zzenw.zza(obj, i & 1048575, zzemsVar.zzbhc());
        } else if (this.zzirh) {
            zzenw.zza(obj, i & 1048575, zzemsVar.readString());
        } else {
            zzenw.zza(obj, i & 1048575, zzemsVar.zzbhd());
        }
    }

    private final int zzhn(int i) {
        return this.zzirb[i + 1];
    }

    private final int zzho(int i) {
        return this.zzirb[i + 2];
    }

    private static <T> double zzf(T t, long j) {
        return ((Double) zzenw.zzp(t, j)).doubleValue();
    }

    private static <T> float zzg(T t, long j) {
        return ((Float) zzenw.zzp(t, j)).floatValue();
    }

    private static <T> int zzh(T t, long j) {
        return ((Integer) zzenw.zzp(t, j)).intValue();
    }

    private static <T> long zzi(T t, long j) {
        return ((Long) zzenw.zzp(t, j)).longValue();
    }

    private static <T> boolean zzj(T t, long j) {
        return ((Boolean) zzenw.zzp(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zze((zzemh<T>) t, i) == zze((zzemh<T>) t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zze((zzemh<T>) t, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zze(T t, int i) {
        int zzho = zzho(i);
        long j = zzho & 1048575;
        if (j != 1048575) {
            return (zzenw.zzk(t, j) & (1 << (zzho >>> 20))) != 0;
        }
        int zzhn = zzhn(i);
        long j2 = zzhn & 1048575;
        switch ((zzhn & 267386880) >>> 20) {
            case 0:
                return zzenw.zzo(t, j2) != 0.0d;
            case 1:
                return zzenw.zzn(t, j2) != 0.0f;
            case 2:
                return zzenw.zzl(t, j2) != 0;
            case 3:
                return zzenw.zzl(t, j2) != 0;
            case 4:
                return zzenw.zzk(t, j2) != 0;
            case 5:
                return zzenw.zzl(t, j2) != 0;
            case 6:
                return zzenw.zzk(t, j2) != 0;
            case 7:
                return zzenw.zzm(t, j2);
            case 8:
                Object zzp = zzenw.zzp(t, j2);
                if (zzp instanceof String) {
                    return !((String) zzp).isEmpty();
                }
                if (zzp instanceof zzejg) {
                    return !zzejg.zzikj.equals(zzp);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzenw.zzp(t, j2) != null;
            case 10:
                return !zzejg.zzikj.equals(zzenw.zzp(t, j2));
            case 11:
                return zzenw.zzk(t, j2) != 0;
            case 12:
                return zzenw.zzk(t, j2) != 0;
            case 13:
                return zzenw.zzk(t, j2) != 0;
            case 14:
                return zzenw.zzl(t, j2) != 0;
            case 15:
                return zzenw.zzk(t, j2) != 0;
            case 16:
                return zzenw.zzl(t, j2) != 0;
            case 17:
                return zzenw.zzp(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzf(T t, int i) {
        int zzho = zzho(i);
        long j = 1048575 & zzho;
        if (j == 1048575) {
            return;
        }
        zzenw.zzb(t, j, (1 << (zzho >>> 20)) | zzenw.zzk(t, j));
    }

    private final boolean zza(T t, int i, int i2) {
        return zzenw.zzk(t, (long) (zzho(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zzenw.zzb(t, zzho(i2) & 1048575, i);
    }

    private final int zzhq(int i) {
        if (i < this.zzird || i > this.zzire) {
            return -1;
        }
        return zzap(i, 0);
    }

    private final int zzao(int i, int i2) {
        if (i < this.zzird || i > this.zzire) {
            return -1;
        }
        return zzap(i, i2);
    }

    private final int zzap(int i, int i2) {
        int length = (this.zzirb.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzirb[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
