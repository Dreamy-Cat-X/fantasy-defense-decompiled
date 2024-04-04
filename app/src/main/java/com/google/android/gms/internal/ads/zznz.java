package com.google.android.gms.internal.ads;

import android.graphics.Point;
import androidx.appcompat.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zznz extends zzoa {
    private static final int[] zzbhh = new int[0];
    private final zzoe zzbhi;
    private final AtomicReference<zzny> zzbhj;

    public zznz() {
        this(null);
    }

    private static int zze(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    private static boolean zze(int i, boolean z) {
        int i2 = i & 3;
        if (i2 != 3) {
            return z && i2 == 2;
        }
        return true;
    }

    private zznz(zzoe zzoeVar) {
        this.zzbhi = null;
        this.zzbhj = new AtomicReference<>(new zzny());
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x017f, code lost:
    
        if (r9.zzagx <= r15) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a9  */
    @Override // com.google.android.gms.internal.ads.zzoa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final zzof[] zza(zzia[] zziaVarArr, zznt[] zzntVarArr, int[][][] iArr) throws zzhd {
        int i;
        zzny zznyVar;
        int i2;
        int i3;
        zznt zzntVar;
        int i4;
        zzof[] zzofVarArr;
        zzny zznyVar2;
        int i5;
        zznq zznqVar;
        int i6;
        boolean z;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int[] iArr2;
        zznq zznqVar2;
        int i10;
        int i11;
        boolean z3;
        int i12;
        boolean zze;
        boolean z4;
        int zze2;
        boolean z5;
        int i13;
        int i14;
        boolean z6;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Point point;
        int i20;
        zzia[] zziaVarArr2 = zziaVarArr;
        int length = zziaVarArr2.length;
        zzof[] zzofVarArr2 = new zzof[length];
        zzny zznyVar3 = this.zzbhj.get();
        int i21 = 0;
        boolean z7 = false;
        while (i21 < length) {
            if (2 == zziaVarArr2[i21].getTrackType()) {
                if (z7) {
                    i4 = length;
                    zzofVarArr = zzofVarArr2;
                    zznyVar2 = zznyVar3;
                    i5 = i21;
                } else {
                    zznt zzntVar2 = zzntVarArr[i21];
                    int[][] iArr3 = iArr[i21];
                    int i22 = zznyVar3.zzbhb;
                    int i23 = zznyVar3.zzbhc;
                    int i24 = zznyVar3.zzbhd;
                    int i25 = zznyVar3.viewportWidth;
                    int i26 = zznyVar3.viewportHeight;
                    boolean z8 = zznyVar3.zzbhg;
                    boolean z9 = zznyVar3.zzbhe;
                    boolean z10 = zznyVar3.zzbhf;
                    i4 = length;
                    zznyVar2 = zznyVar3;
                    zznq zznqVar3 = null;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = -1;
                    int i31 = -1;
                    while (i27 < zzntVar2.length) {
                        zznq zzbc = zzntVar2.zzbc(i27);
                        zznt zzntVar3 = zzntVar2;
                        zzof[] zzofVarArr3 = zzofVarArr2;
                        ArrayList arrayList = new ArrayList(zzbc.length);
                        int i32 = i21;
                        for (int i33 = 0; i33 < zzbc.length; i33++) {
                            arrayList.add(Integer.valueOf(i33));
                        }
                        int i34 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                        if (i25 == Integer.MAX_VALUE || i26 == Integer.MAX_VALUE) {
                            zznqVar = zznqVar3;
                            i6 = i28;
                            z = z8;
                            i7 = i26;
                            i8 = i25;
                            z2 = z9;
                            i9 = i24;
                        } else {
                            i6 = i28;
                            int i35 = 0;
                            while (i35 < zzbc.length) {
                                zzhs zzbb = zzbc.zzbb(i35);
                                zznq zznqVar4 = zznqVar3;
                                if (zzbb.width <= 0 || zzbb.height <= 0) {
                                    z5 = z8;
                                    i13 = i26;
                                    i14 = i25;
                                    z6 = z9;
                                    i15 = i24;
                                } else {
                                    int i36 = zzbb.width;
                                    z6 = z9;
                                    int i37 = zzbb.height;
                                    z5 = z8;
                                    if (z8) {
                                        i13 = i26;
                                        if ((i36 > i37) != (i25 > i26)) {
                                            i17 = i25;
                                            i14 = i17;
                                            i16 = i13;
                                            i18 = i36 * i17;
                                            i15 = i24;
                                            i19 = i37 * i16;
                                            if (i18 < i19) {
                                                point = new Point(i16, zzps.zzf(i19, i36));
                                            } else {
                                                point = new Point(zzps.zzf(i18, i37), i17);
                                            }
                                            i20 = zzbb.width * zzbb.height;
                                            if (zzbb.width >= ((int) (point.x * 0.98f)) && zzbb.height >= ((int) (point.y * 0.98f)) && i20 < i34) {
                                                i34 = i20;
                                            }
                                        }
                                    } else {
                                        i13 = i26;
                                    }
                                    i16 = i25;
                                    i14 = i16;
                                    i17 = i13;
                                    i18 = i36 * i17;
                                    i15 = i24;
                                    i19 = i37 * i16;
                                    if (i18 < i19) {
                                    }
                                    i20 = zzbb.width * zzbb.height;
                                    if (zzbb.width >= ((int) (point.x * 0.98f))) {
                                        i34 = i20;
                                    }
                                }
                                i35++;
                                zznqVar3 = zznqVar4;
                                z9 = z6;
                                z8 = z5;
                                i26 = i13;
                                i25 = i14;
                                i24 = i15;
                            }
                            zznqVar = zznqVar3;
                            z = z8;
                            i7 = i26;
                            i8 = i25;
                            z2 = z9;
                            i9 = i24;
                            if (i34 != Integer.MAX_VALUE) {
                                for (int size = arrayList.size() - 1; size >= 0; size--) {
                                    int zzez = zzbc.zzbb(((Integer) arrayList.get(size)).intValue()).zzez();
                                    if (zzez == -1 || zzez > i34) {
                                        arrayList.remove(size);
                                    }
                                }
                            }
                        }
                        int[] iArr4 = iArr3[i27];
                        int i38 = i29;
                        int i39 = i30;
                        int i40 = i31;
                        i28 = i6;
                        int i41 = 0;
                        while (i41 < zzbc.length) {
                            if (zze(iArr4[i41], z10)) {
                                zzhs zzbb2 = zzbc.zzbb(i41);
                                if (!arrayList.contains(Integer.valueOf(i41)) || ((zzbb2.width != -1 && zzbb2.width > i22) || (zzbb2.height != -1 && zzbb2.height > i23))) {
                                    i11 = i9;
                                } else {
                                    if (zzbb2.zzagx != -1) {
                                        i11 = i9;
                                    } else {
                                        i11 = i9;
                                    }
                                    z3 = true;
                                    if (!z3 || z2) {
                                        zznqVar2 = zzbc;
                                        i10 = i28;
                                        i12 = !z3 ? 2 : 1;
                                        iArr2 = iArr4;
                                        zze = zze(iArr4[i41], false);
                                        if (zze) {
                                            i12 += 1000;
                                        }
                                        z4 = i12 <= i38;
                                        if (i12 == i38) {
                                            if (zzbb2.zzez() != i39) {
                                                zze2 = zze(zzbb2.zzez(), i39);
                                            } else {
                                                zze2 = zze(zzbb2.zzagx, i40);
                                            }
                                            z4 = !(zze && z3) ? zze2 >= 0 : zze2 <= 0;
                                        }
                                        if (z4) {
                                            i40 = zzbb2.zzagx;
                                            i38 = i12;
                                            i39 = zzbb2.zzez();
                                            zznqVar = zznqVar2;
                                            i28 = i41;
                                            i41++;
                                            i9 = i11;
                                            zzbc = zznqVar2;
                                            iArr4 = iArr2;
                                        }
                                    } else {
                                        iArr2 = iArr4;
                                        zznqVar2 = zzbc;
                                        i10 = i28;
                                    }
                                }
                                z3 = false;
                                if (z3) {
                                }
                                zznqVar2 = zzbc;
                                i10 = i28;
                                if (!z3) {
                                }
                                iArr2 = iArr4;
                                zze = zze(iArr4[i41], false);
                                if (zze) {
                                }
                                if (i12 <= i38) {
                                }
                                if (i12 == i38) {
                                }
                                if (z4) {
                                }
                            } else {
                                iArr2 = iArr4;
                                zznqVar2 = zzbc;
                                i10 = i28;
                                i11 = i9;
                            }
                            i28 = i10;
                            i41++;
                            i9 = i11;
                            zzbc = zznqVar2;
                            iArr4 = iArr2;
                        }
                        i24 = i9;
                        i27++;
                        i29 = i38;
                        i31 = i40;
                        zzntVar2 = zzntVar3;
                        zzofVarArr2 = zzofVarArr3;
                        zznqVar3 = zznqVar;
                        z9 = z2;
                        z8 = z;
                        i26 = i7;
                        i25 = i8;
                        i30 = i39;
                        i21 = i32;
                    }
                    zznq zznqVar5 = zznqVar3;
                    zzofVarArr = zzofVarArr2;
                    i5 = i21;
                    zzofVarArr[i5] = zznqVar5 == null ? null : new zzob(zznqVar5, i28);
                    z7 = zzofVarArr[i5] != null;
                }
                int i42 = zzntVarArr[i5].length;
            } else {
                i4 = length;
                zzofVarArr = zzofVarArr2;
                zznyVar2 = zznyVar3;
                i5 = i21;
            }
            i21 = i5 + 1;
            zziaVarArr2 = zziaVarArr;
            zznyVar3 = zznyVar2;
            length = i4;
            zzofVarArr2 = zzofVarArr;
        }
        zzof[] zzofVarArr4 = zzofVarArr2;
        zzny zznyVar4 = zznyVar3;
        int i43 = length;
        int i44 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (i44 < i43) {
            int trackType = zziaVarArr[i44].getTrackType();
            if (trackType == 1) {
                i = i43;
                zznyVar = zznyVar4;
                if (!z11) {
                    zznt zzntVar4 = zzntVarArr[i44];
                    int[][] iArr5 = iArr[i44];
                    boolean z13 = zznyVar.zzbhf;
                    int i45 = 0;
                    int i46 = 0;
                    int i47 = -1;
                    int i48 = -1;
                    while (i45 < zzntVar4.length) {
                        zznq zzbc2 = zzntVar4.zzbc(i45);
                        int[] iArr6 = iArr5[i45];
                        int i49 = i48;
                        int i50 = i47;
                        int i51 = i46;
                        for (int i52 = 0; i52 < zzbc2.length; i52++) {
                            if (zze(iArr6[i52], z13)) {
                                zzhs zzbb3 = zzbc2.zzbb(i52);
                                int i53 = iArr6[i52];
                                int i54 = (zzbb3.zzahr & 1) != 0 ? 2 : 1;
                                if (zze(i53, false)) {
                                    i54 += 1000;
                                }
                                if (i54 > i51) {
                                    i50 = i45;
                                    i49 = i52;
                                    i51 = i54;
                                }
                            }
                        }
                        i45++;
                        i46 = i51;
                        i47 = i50;
                        i48 = i49;
                    }
                    zzofVarArr4[i44] = i47 == -1 ? null : new zzob(zzntVar4.zzbc(i47), i48);
                    z11 = zzofVarArr4[i44] != null;
                }
            } else if (trackType == 2) {
                i = i43;
                zznyVar = zznyVar4;
            } else if (trackType != 3) {
                zziaVarArr[i44].getTrackType();
                zznt zzntVar5 = zzntVarArr[i44];
                int[][] iArr7 = iArr[i44];
                zznyVar = zznyVar4;
                boolean z14 = zznyVar.zzbhf;
                int i55 = 0;
                int i56 = 0;
                zznq zznqVar6 = null;
                for (int i57 = 0; i57 < zzntVar5.length; i57++) {
                    zznq zzbc3 = zzntVar5.zzbc(i57);
                    int[] iArr8 = iArr7[i57];
                    int i58 = 0;
                    while (i58 < zzbc3.length) {
                        if (zze(iArr8[i58], z14)) {
                            i3 = i43;
                            int i59 = (zzbc3.zzbb(i58).zzahr & 1) != 0 ? 2 : 1;
                            zzntVar = zzntVar5;
                            if (zze(iArr8[i58], false)) {
                                i59 += 1000;
                            }
                            if (i59 > i56) {
                                zznqVar6 = zzbc3;
                                i55 = i58;
                                i56 = i59;
                            }
                        } else {
                            i3 = i43;
                            zzntVar = zzntVar5;
                        }
                        i58++;
                        zzntVar5 = zzntVar;
                        i43 = i3;
                    }
                }
                i = i43;
                zzofVarArr4[i44] = zznqVar6 == null ? null : new zzob(zznqVar6, i55);
            } else {
                i = i43;
                zznyVar = zznyVar4;
                if (!z12) {
                    zznt zzntVar6 = zzntVarArr[i44];
                    int[][] iArr9 = iArr[i44];
                    boolean z15 = zznyVar.zzbhf;
                    int i60 = 0;
                    int i61 = 0;
                    int i62 = 0;
                    zznq zznqVar7 = null;
                    while (i60 < zzntVar6.length) {
                        zznq zzbc4 = zzntVar6.zzbc(i60);
                        int[] iArr10 = iArr9[i60];
                        zznq zznqVar8 = zznqVar7;
                        int i63 = i62;
                        int i64 = i61;
                        for (int i65 = 0; i65 < zzbc4.length; i65++) {
                            if (zze(iArr10[i65], z15)) {
                                zzhs zzbb4 = zzbc4.zzbb(i65);
                                boolean z16 = (zzbb4.zzahr & 1) != 0;
                                boolean z17 = (zzbb4.zzahr & 2) != 0;
                                if (z16) {
                                    i2 = 3;
                                } else if (z17) {
                                    i2 = 1;
                                }
                                if (zze(iArr10[i65], false)) {
                                    i2 += 1000;
                                }
                                if (i2 > i63) {
                                    i64 = i65;
                                    zznqVar8 = zzbc4;
                                    i63 = i2;
                                }
                            }
                        }
                        i60++;
                        i61 = i64;
                        i62 = i63;
                        zznqVar7 = zznqVar8;
                    }
                    zzofVarArr4[i44] = zznqVar7 == null ? null : new zzob(zznqVar7, i61);
                    z12 = zzofVarArr4[i44] != null;
                }
            }
            i44++;
            zznyVar4 = zznyVar;
            i43 = i;
        }
        return zzofVarArr4;
    }
}
