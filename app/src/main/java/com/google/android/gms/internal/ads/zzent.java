package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzent {
    private static final zzent zzitk = new zzent(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzijy;
    private int zziov;
    private Object[] zzirc;
    private int[] zzitl;

    public static zzent zzblc() {
        return zzitk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzent zzbld() {
        return new zzent();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzent zza(zzent zzentVar, zzent zzentVar2) {
        int i = zzentVar.count + zzentVar2.count;
        int[] copyOf = Arrays.copyOf(zzentVar.zzitl, i);
        System.arraycopy(zzentVar2.zzitl, 0, copyOf, zzentVar.count, zzentVar2.count);
        Object[] copyOf2 = Arrays.copyOf(zzentVar.zzirc, i);
        System.arraycopy(zzentVar2.zzirc, 0, copyOf2, zzentVar.count, zzentVar2.count);
        return new zzent(i, copyOf, copyOf2, true);
    }

    private zzent() {
        this(0, new int[8], new Object[8], true);
    }

    private zzent(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zziov = -1;
        this.count = i;
        this.zzitl = iArr;
        this.zzirc = objArr;
        this.zzijy = z;
    }

    public final void zzbgi() {
        this.zzijy = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzeon zzeonVar) throws IOException {
        if (zzeonVar.zzbhy() == zzeom.zzivs) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzeonVar.zzc(this.zzitl[i] >>> 3, this.zzirc[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzeonVar.zzc(this.zzitl[i2] >>> 3, this.zzirc[i2]);
        }
    }

    public final void zzb(zzeon zzeonVar) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (zzeonVar.zzbhy() == zzeom.zzivr) {
            for (int i = 0; i < this.count; i++) {
                zzb(this.zzitl[i], this.zzirc[i], zzeonVar);
            }
            return;
        }
        for (int i2 = this.count - 1; i2 >= 0; i2--) {
            zzb(this.zzitl[i2], this.zzirc[i2], zzeonVar);
        }
    }

    private static void zzb(int i, Object obj, zzeon zzeonVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzeonVar.zzq(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            zzeonVar.zzk(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            zzeonVar.zza(i2, (zzejg) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 == 5) {
                zzeonVar.zzaf(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzeld.zzbji());
        }
        if (zzeonVar.zzbhy() == zzeom.zzivr) {
            zzeonVar.zzhe(i2);
            ((zzent) obj).zzb(zzeonVar);
            zzeonVar.zzhf(i2);
        } else {
            zzeonVar.zzhf(i2);
            ((zzent) obj).zzb(zzeonVar);
            zzeonVar.zzhe(i2);
        }
    }

    public final int zzble() {
        int i = this.zziov;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += zzeka.zzd(this.zzitl[i3] >>> 3, (zzejg) this.zzirc[i3]);
        }
        this.zziov = i2;
        return i2;
    }

    public final int zzbin() {
        int zzm;
        int i = this.zziov;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.zzitl[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                zzm = zzeka.zzm(i5, ((Long) this.zzirc[i3]).longValue());
            } else if (i6 == 1) {
                zzm = zzeka.zzo(i5, ((Long) this.zzirc[i3]).longValue());
            } else if (i6 == 2) {
                zzm = zzeka.zzc(i5, (zzejg) this.zzirc[i3]);
            } else if (i6 == 3) {
                zzm = (zzeka.zzgv(i5) << 1) + ((zzent) this.zzirc[i3]).zzbin();
            } else if (i6 == 5) {
                zzm = zzeka.zzaj(i5, ((Integer) this.zzirc[i3]).intValue());
            } else {
                throw new IllegalStateException(zzeld.zzbji());
            }
            i2 += zzm;
        }
        this.zziov = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzent)) {
            return false;
        }
        zzent zzentVar = (zzent) obj;
        int i = this.count;
        if (i == zzentVar.count) {
            int[] iArr = this.zzitl;
            int[] iArr2 = zzentVar.zzitl;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                }
                if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                Object[] objArr = this.zzirc;
                Object[] objArr2 = zzentVar.zzirc;
                int i3 = this.count;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    }
                    if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    }
                    i4++;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.count;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzitl;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzirc;
        int i7 = this.count;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzeme.zza(sb, i, String.valueOf(this.zzitl[i2] >>> 3), this.zzirc[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(int i, Object obj) {
        if (!this.zzijy) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.count;
        if (i2 == this.zzitl.length) {
            int i3 = this.count + (i2 < 4 ? 8 : i2 >> 1);
            this.zzitl = Arrays.copyOf(this.zzitl, i3);
            this.zzirc = Arrays.copyOf(this.zzirc, i3);
        }
        int[] iArr = this.zzitl;
        int i4 = this.count;
        iArr[i4] = i;
        this.zzirc[i4] = obj;
        this.count = i4 + 1;
    }
}
