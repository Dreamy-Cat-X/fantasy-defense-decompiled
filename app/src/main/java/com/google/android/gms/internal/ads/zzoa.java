package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzoa extends zzog {
    private zzod zzbhm;
    private final SparseArray<Map<zznt, zzoc>> zzbhk = new SparseArray<>();
    private final SparseBooleanArray zzbhl = new SparseBooleanArray();
    private int zzaic = 0;

    protected abstract zzof[] zza(zzia[] zziaVarArr, zznt[] zzntVarArr, int[][][] iArr) throws zzhd;

    public final void zzf(int i, boolean z) {
        if (this.zzbhl.get(i) == z) {
            return;
        }
        this.zzbhl.put(i, z);
        invalidate();
    }

    @Override // com.google.android.gms.internal.ads.zzog
    public final zzoi zza(zzia[] zziaVarArr, zznt zzntVar) throws zzhd {
        int[] iArr;
        int[] iArr2 = new int[zziaVarArr.length + 1];
        int length = zziaVarArr.length + 1;
        zznq[][] zznqVarArr = new zznq[length];
        int[][][] iArr3 = new int[zziaVarArr.length + 1][];
        for (int i = 0; i < length; i++) {
            zznqVarArr[i] = new zznq[zzntVar.length];
            iArr3[i] = new int[zzntVar.length];
        }
        int length2 = zziaVarArr.length;
        int[] iArr4 = new int[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            iArr4[i2] = zziaVarArr[i2].zzeg();
        }
        for (int i3 = 0; i3 < zzntVar.length; i3++) {
            zznq zzbc = zzntVar.zzbc(i3);
            int length3 = zziaVarArr.length;
            int i4 = 0;
            for (int i5 = 0; i5 < zziaVarArr.length; i5++) {
                zzia zziaVar = zziaVarArr[i5];
                for (int i6 = 0; i6 < zzbc.length; i6++) {
                    int zza = zziaVar.zza(zzbc.zzbb(i6)) & 3;
                    if (zza > i4) {
                        length3 = i5;
                        if (zza == 3) {
                            break;
                        }
                        i4 = zza;
                    }
                }
            }
            if (length3 == zziaVarArr.length) {
                iArr = new int[zzbc.length];
            } else {
                zzia zziaVar2 = zziaVarArr[length3];
                int[] iArr5 = new int[zzbc.length];
                for (int i7 = 0; i7 < zzbc.length; i7++) {
                    iArr5[i7] = zziaVar2.zza(zzbc.zzbb(i7));
                }
                iArr = iArr5;
            }
            int i8 = iArr2[length3];
            zznqVarArr[length3][i8] = zzbc;
            iArr3[length3][i8] = iArr;
            iArr2[length3] = iArr2[length3] + 1;
        }
        zznt[] zzntVarArr = new zznt[zziaVarArr.length];
        int[] iArr6 = new int[zziaVarArr.length];
        for (int i9 = 0; i9 < zziaVarArr.length; i9++) {
            int i10 = iArr2[i9];
            zzntVarArr[i9] = new zznt((zznq[]) Arrays.copyOf(zznqVarArr[i9], i10));
            iArr3[i9] = (int[][]) Arrays.copyOf(iArr3[i9], i10);
            iArr6[i9] = zziaVarArr[i9].getTrackType();
        }
        zznt zzntVar2 = new zznt((zznq[]) Arrays.copyOf(zznqVarArr[zziaVarArr.length], iArr2[zziaVarArr.length]));
        zzof[] zza2 = zza(zziaVarArr, zzntVarArr, iArr3);
        int i11 = 0;
        while (true) {
            if (i11 < zziaVarArr.length) {
                if (this.zzbhl.get(i11)) {
                    zza2[i11] = null;
                } else {
                    zznt zzntVar3 = zzntVarArr[i11];
                    Map<zznt, zzoc> map = this.zzbhk.get(i11);
                    if ((map != null ? map.get(zzntVar3) : null) != null) {
                        throw new NoSuchMethodError();
                    }
                }
                i11++;
            } else {
                zzod zzodVar = new zzod(iArr6, zzntVarArr, iArr4, iArr3, zzntVar2);
                zzhz[] zzhzVarArr = new zzhz[zziaVarArr.length];
                for (int i12 = 0; i12 < zziaVarArr.length; i12++) {
                    zzhzVarArr[i12] = zza2[i12] != null ? zzhz.zzaib : null;
                }
                return new zzoi(zzntVar, new zzoh(zza2), zzodVar, zzhzVarArr);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzog
    public final void zzd(Object obj) {
        this.zzbhm = (zzod) obj;
    }
}
