package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzjf {
    private final int zzahm;
    private final int zzamu;
    private final int zzamv;
    private final int zzamw;
    private final int zzamx;
    private final short[] zzamy;
    private int zzamz;
    private short[] zzana;
    private int zzanb;
    private short[] zzanc;
    private int zzand;
    private short[] zzane;
    private int zzanh;
    private int zzani;
    private int zzanj;
    private int zzank;
    private int zzanm;
    private int zzann;
    private int zzano;
    private int zzanf = 0;
    private int zzang = 0;
    private int zzanl = 0;
    private float zzahy = 1.0f;
    private float zzahz = 1.0f;

    public zzjf(int i, int i2) {
        this.zzahm = i;
        this.zzamu = i2;
        this.zzamv = i / 400;
        int i3 = i / 65;
        this.zzamw = i3;
        int i4 = i3 * 2;
        this.zzamx = i4;
        this.zzamy = new short[i4];
        this.zzamz = i4;
        this.zzana = new short[i4 * i2];
        this.zzanb = i4;
        this.zzanc = new short[i4 * i2];
        this.zzand = i4;
        this.zzane = new short[i4 * i2];
    }

    public final void setSpeed(float f) {
        this.zzahy = f;
    }

    public final void zza(float f) {
        this.zzahz = f;
    }

    public final void zza(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.zzamu;
        int i2 = remaining / i;
        zzz(i2);
        shortBuffer.get(this.zzana, this.zzanh * this.zzamu, ((i * i2) << 1) / 2);
        this.zzanh += i2;
        zzgg();
    }

    public final void zzb(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzamu, this.zzani);
        shortBuffer.put(this.zzanc, 0, this.zzamu * min);
        int i = this.zzani - min;
        this.zzani = i;
        short[] sArr = this.zzanc;
        int i2 = this.zzamu;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public final void zzfl() {
        int i;
        int i2 = this.zzanh;
        float f = this.zzahy;
        float f2 = this.zzahz;
        int i3 = this.zzani + ((int) ((((i2 / (f / f2)) + this.zzanj) / f2) + 0.5f));
        zzz((this.zzamx * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.zzamx;
            int i5 = this.zzamu;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.zzana[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.zzanh += i * 2;
        zzgg();
        if (this.zzani > i3) {
            this.zzani = i3;
        }
        this.zzanh = 0;
        this.zzank = 0;
        this.zzanj = 0;
    }

    public final int zzgf() {
        return this.zzani;
    }

    private final void zzy(int i) {
        int i2 = this.zzani + i;
        int i3 = this.zzanb;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.zzanb = i4;
            this.zzanc = Arrays.copyOf(this.zzanc, i4 * this.zzamu);
        }
    }

    private final void zzz(int i) {
        int i2 = this.zzanh + i;
        int i3 = this.zzamz;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.zzamz = i4;
            this.zzana = Arrays.copyOf(this.zzana, i4 * this.zzamu);
        }
    }

    private final void zza(short[] sArr, int i, int i2) {
        zzy(i2);
        int i3 = this.zzamu;
        System.arraycopy(sArr, i * i3, this.zzanc, this.zzani * i3, i3 * i2);
        this.zzani += i2;
    }

    private final void zzb(short[] sArr, int i, int i2) {
        int i3 = this.zzamx / i2;
        int i4 = this.zzamu;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.zzamy[i7] = (short) (i8 / i5);
        }
    }

    private final int zza(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.zzamu;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.zzann = i5 / i7;
        this.zzano = i8 / i6;
        return i7;
    }

    private final void zzgg() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.zzani;
        float f = this.zzahy / this.zzahz;
        double d = f;
        int i8 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i9 = this.zzanh;
            if (i9 >= this.zzamx) {
                int i10 = 0;
                while (true) {
                    int i11 = this.zzank;
                    if (i11 > 0) {
                        int min = Math.min(this.zzamx, i11);
                        zza(this.zzana, i10, min);
                        this.zzank -= min;
                        i10 += min;
                    } else {
                        short[] sArr = this.zzana;
                        int i12 = this.zzahm;
                        int i13 = i12 > 4000 ? i12 / 4000 : 1;
                        if (this.zzamu == i8 && i13 == i8) {
                            i = zza(sArr, i10, this.zzamv, this.zzamw);
                        } else {
                            zzb(sArr, i10, i13);
                            int zza = zza(this.zzamy, 0, this.zzamv / i13, this.zzamw / i13);
                            if (i13 != i8) {
                                int i14 = zza * i13;
                                int i15 = i13 << 2;
                                int i16 = i14 - i15;
                                int i17 = i14 + i15;
                                int i18 = this.zzamv;
                                if (i16 < i18) {
                                    i16 = i18;
                                }
                                int i19 = this.zzamw;
                                if (i17 > i19) {
                                    i17 = i19;
                                }
                                if (this.zzamu == i8) {
                                    i = zza(sArr, i10, i16, i17);
                                } else {
                                    zzb(sArr, i10, i8);
                                    i = zza(this.zzamy, 0, i16, i17);
                                }
                            } else {
                                i = zza;
                            }
                        }
                        int i20 = this.zzann;
                        int i21 = i20 != 0 && this.zzanl != 0 && this.zzano <= i20 * 3 && (i20 << 1) > this.zzanm * 3 ? this.zzanl : i;
                        this.zzanm = this.zzann;
                        this.zzanl = i;
                        if (d > 1.0d) {
                            short[] sArr2 = this.zzana;
                            if (f >= 2.0f) {
                                i3 = (int) (i21 / (f - 1.0f));
                            } else {
                                this.zzank = (int) ((i21 * (2.0f - f)) / (f - 1.0f));
                                i3 = i21;
                            }
                            zzy(i3);
                            int i22 = i3;
                            zza(i3, this.zzamu, this.zzanc, this.zzani, sArr2, i10, sArr2, i10 + i21);
                            this.zzani += i22;
                            i10 += i21 + i22;
                        } else {
                            int i23 = i21;
                            short[] sArr3 = this.zzana;
                            if (f < 0.5f) {
                                i2 = (int) ((i23 * f) / (1.0f - f));
                            } else {
                                this.zzank = (int) ((i23 * ((2.0f * f) - 1.0f)) / (1.0f - f));
                                i2 = i23;
                            }
                            int i24 = i23 + i2;
                            zzy(i24);
                            int i25 = this.zzamu;
                            System.arraycopy(sArr3, i10 * i25, this.zzanc, this.zzani * i25, i25 * i23);
                            zza(i2, this.zzamu, this.zzanc, this.zzani + i23, sArr3, i23 + i10, sArr3, i10);
                            this.zzani += i24;
                            i10 += i2;
                        }
                    }
                    if (this.zzamx + i10 > i9) {
                        break;
                    } else {
                        i8 = 1;
                    }
                }
                int i26 = this.zzanh - i10;
                short[] sArr4 = this.zzana;
                int i27 = this.zzamu;
                System.arraycopy(sArr4, i10 * i27, sArr4, 0, i27 * i26);
                this.zzanh = i26;
            }
        } else {
            zza(this.zzana, 0, this.zzanh);
            this.zzanh = 0;
        }
        float f2 = this.zzahz;
        if (f2 == 1.0f || this.zzani == i7) {
            return;
        }
        int i28 = this.zzahm;
        int i29 = (int) (i28 / f2);
        while (true) {
            if (i29 <= 16384 && i28 <= 16384) {
                break;
            }
            i29 /= 2;
            i28 /= 2;
        }
        int i30 = this.zzani - i7;
        int i31 = this.zzanj + i30;
        int i32 = this.zzand;
        if (i31 > i32) {
            int i33 = i32 + (i32 / 2) + i30;
            this.zzand = i33;
            this.zzane = Arrays.copyOf(this.zzane, i33 * this.zzamu);
        }
        short[] sArr5 = this.zzanc;
        int i34 = this.zzamu;
        System.arraycopy(sArr5, i7 * i34, this.zzane, this.zzanj * i34, i34 * i30);
        this.zzani = i7;
        this.zzanj += i30;
        int i35 = 0;
        while (true) {
            i4 = this.zzanj;
            if (i35 >= i4 - 1) {
                break;
            }
            while (true) {
                i5 = this.zzanf;
                int i36 = (i5 + 1) * i29;
                i6 = this.zzang;
                if (i36 <= i6 * i28) {
                    break;
                }
                zzy(1);
                int i37 = 0;
                while (true) {
                    int i38 = this.zzamu;
                    if (i37 < i38) {
                        short[] sArr6 = this.zzanc;
                        int i39 = (this.zzani * i38) + i37;
                        short[] sArr7 = this.zzane;
                        int i40 = (i35 * i38) + i37;
                        short s = sArr7[i40];
                        short s2 = sArr7[i40 + i38];
                        int i41 = this.zzang * i28;
                        int i42 = this.zzanf;
                        int i43 = i42 * i29;
                        int i44 = (i42 + 1) * i29;
                        int i45 = i44 - i41;
                        int i46 = i44 - i43;
                        sArr6[i39] = (short) (((s * i45) + ((i46 - i45) * s2)) / i46);
                        i37++;
                    }
                }
                this.zzang++;
                this.zzani++;
            }
            int i47 = i5 + 1;
            this.zzanf = i47;
            if (i47 == i28) {
                this.zzanf = 0;
                zzpf.checkState(i6 == i29);
                this.zzang = 0;
            }
            i35++;
        }
        int i48 = i4 - 1;
        if (i48 != 0) {
            short[] sArr8 = this.zzane;
            int i49 = this.zzamu;
            System.arraycopy(sArr8, i48 * i49, sArr8, 0, (i4 - i48) * i49);
            this.zzanj -= i48;
        }
    }

    private static void zza(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
