package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzeka extends zzejd {
    private static final Logger logger = Logger.getLogger(zzeka.class.getName());
    private static final boolean zzilm = zzenw.zzblf();
    zzekc zziln;

    public static int zzbr(boolean z) {
        return 1;
    }

    public static int zzd(double d) {
        return 8;
    }

    public static int zzfl(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int zzfn(long j) {
        return 8;
    }

    public static int zzfo(long j) {
        return 8;
    }

    private static long zzfp(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzg(float f) {
        return 4;
    }

    public static int zzgx(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzgz(int i) {
        return 4;
    }

    public static int zzha(int i) {
        return 4;
    }

    private static int zzhc(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static zzeka zzv(byte[] bArr) {
        return new zzb(bArr, 0, bArr.length);
    }

    public abstract void writeTag(int i, int i2) throws IOException;

    public abstract void zza(int i, zzejg zzejgVar) throws IOException;

    public abstract void zza(int i, zzemd zzemdVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(int i, zzemd zzemdVar, zzemy zzemyVar) throws IOException;

    public abstract void zzac(int i, int i2) throws IOException;

    public abstract void zzad(int i, int i2) throws IOException;

    public abstract void zzaf(int i, int i2) throws IOException;

    public abstract void zzai(zzejg zzejgVar) throws IOException;

    public abstract void zzb(int i, zzejg zzejgVar) throws IOException;

    public abstract int zzbhv();

    public abstract void zzd(byte b) throws IOException;

    public abstract void zzfh(long j) throws IOException;

    public abstract void zzfj(long j) throws IOException;

    public abstract void zzg(zzemd zzemdVar) throws IOException;

    public abstract void zzgr(int i) throws IOException;

    public abstract void zzgs(int i) throws IOException;

    public abstract void zzgu(int i) throws IOException;

    public abstract void zzh(int i, boolean z) throws IOException;

    public abstract void zzi(int i, long j) throws IOException;

    public abstract void zzi(int i, String str) throws IOException;

    public abstract void zzib(String str) throws IOException;

    public abstract void zzk(int i, long j) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzk(byte[] bArr, int i, int i2) throws IOException;

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static class zza extends IOException {
        zza() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zza(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        zza(String str, Throwable th) {
            super(r3.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
            String valueOf = String.valueOf(str);
        }
    }

    private zzeka() {
    }

    public final void zzae(int i, int i2) throws IOException {
        zzad(i, zzhc(i2));
    }

    public final void zzj(int i, long j) throws IOException {
        zzi(i, zzfp(j));
    }

    public final void zza(int i, float f) throws IOException {
        zzaf(i, Float.floatToRawIntBits(f));
    }

    public final void zzb(int i, double d) throws IOException {
        zzk(i, Double.doubleToRawLongBits(d));
    }

    public final void zzgt(int i) throws IOException {
        zzgs(zzhc(i));
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    private static class zzb extends zzeka {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zzb(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i2 | 0 | (bArr.length - i2)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.buffer = bArr;
            this.offset = 0;
            this.position = 0;
            this.limit = i2;
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void writeTag(int i, int i2) throws IOException {
            zzgs((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzac(int i, int i2) throws IOException {
            writeTag(i, 0);
            zzgr(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzad(int i, int i2) throws IOException {
            writeTag(i, 0);
            zzgs(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzaf(int i, int i2) throws IOException {
            writeTag(i, 5);
            zzgu(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzi(int i, long j) throws IOException {
            writeTag(i, 0);
            zzfh(j);
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzk(int i, long j) throws IOException {
            writeTag(i, 1);
            zzfj(j);
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzh(int i, boolean z) throws IOException {
            writeTag(i, 0);
            zzd(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzi(int i, String str) throws IOException {
            writeTag(i, 2);
            zzib(str);
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zza(int i, zzejg zzejgVar) throws IOException {
            writeTag(i, 2);
            zzai(zzejgVar);
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzai(zzejg zzejgVar) throws IOException {
            zzgs(zzejgVar.size());
            zzejgVar.zza(this);
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzk(byte[] bArr, int i, int i2) throws IOException {
            zzgs(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        final void zza(int i, zzemd zzemdVar, zzemy zzemyVar) throws IOException {
            writeTag(i, 2);
            zzeiw zzeiwVar = (zzeiw) zzemdVar;
            int zzbgd = zzeiwVar.zzbgd();
            if (zzbgd == -1) {
                zzbgd = zzemyVar.zzau(zzeiwVar);
                zzeiwVar.zzfv(zzbgd);
            }
            zzgs(zzbgd);
            zzemyVar.zza(zzemdVar, this.zziln);
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zza(int i, zzemd zzemdVar) throws IOException {
            writeTag(1, 3);
            zzad(2, i);
            writeTag(3, 2);
            zzg(zzemdVar);
            writeTag(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzb(int i, zzejg zzejgVar) throws IOException {
            writeTag(1, 3);
            zzad(2, i);
            zza(3, zzejgVar);
            writeTag(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzg(zzemd zzemdVar) throws IOException {
            zzgs(zzemdVar.zzbin());
            zzemdVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzd(byte b) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzgr(int i) throws IOException {
            if (i >= 0) {
                zzgs(i);
            } else {
                zzfh(i);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzgs(int i) throws IOException {
            if (!zzeka.zzilm || zzeiz.zzbgf() || zzbhv() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.buffer;
                        int i2 = this.position;
                        this.position = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                    }
                }
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr2[i3] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                byte[] bArr3 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                zzenw.zza(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.buffer;
            int i5 = this.position;
            this.position = i5 + 1;
            zzenw.zza(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                byte[] bArr5 = this.buffer;
                int i7 = this.position;
                this.position = i7 + 1;
                zzenw.zza(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.buffer;
            int i8 = this.position;
            this.position = i8 + 1;
            zzenw.zza(bArr6, i8, (byte) (i6 | 128));
            int i9 = i6 >>> 7;
            if ((i9 & (-128)) == 0) {
                byte[] bArr7 = this.buffer;
                int i10 = this.position;
                this.position = i10 + 1;
                zzenw.zza(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.buffer;
            int i11 = this.position;
            this.position = i11 + 1;
            zzenw.zza(bArr8, i11, (byte) (i9 | 128));
            int i12 = i9 >>> 7;
            if ((i12 & (-128)) == 0) {
                byte[] bArr9 = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                zzenw.zza(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.buffer;
            int i14 = this.position;
            this.position = i14 + 1;
            zzenw.zza(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.buffer;
            int i15 = this.position;
            this.position = i15 + 1;
            zzenw.zza(bArr11, i15, (byte) (i12 >>> 7));
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzgu(int i) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                int i3 = i2 + 1;
                this.position = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.buffer;
                int i4 = i3 + 1;
                this.position = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.buffer;
                int i5 = i4 + 1;
                this.position = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.buffer;
                this.position = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzfh(long j) throws IOException {
            if (zzeka.zzilm && zzbhv() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    zzenw.zza(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                zzenw.zza(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzfj(long j) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i2 = i + 1;
                this.position = i2;
                bArr[i] = (byte) j;
                byte[] bArr2 = this.buffer;
                int i3 = i2 + 1;
                this.position = i3;
                bArr2[i2] = (byte) (j >> 8);
                byte[] bArr3 = this.buffer;
                int i4 = i3 + 1;
                this.position = i4;
                bArr3[i3] = (byte) (j >> 16);
                byte[] bArr4 = this.buffer;
                int i5 = i4 + 1;
                this.position = i5;
                bArr4[i4] = (byte) (j >> 24);
                byte[] bArr5 = this.buffer;
                int i6 = i5 + 1;
                this.position = i6;
                bArr5[i5] = (byte) (j >> 32);
                byte[] bArr6 = this.buffer;
                int i7 = i6 + 1;
                this.position = i7;
                bArr6[i6] = (byte) (j >> 40);
                byte[] bArr7 = this.buffer;
                int i8 = i7 + 1;
                this.position = i8;
                bArr7[i7] = (byte) (j >> 48);
                byte[] bArr8 = this.buffer;
                this.position = i8 + 1;
                bArr8[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        private final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzejd
        public final void zzh(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final void zzib(String str) throws IOException {
            int i = this.position;
            try {
                int zzgx = zzgx(str.length() * 3);
                int zzgx2 = zzgx(str.length());
                if (zzgx2 == zzgx) {
                    int i2 = i + zzgx2;
                    this.position = i2;
                    int zza = zzenz.zza(str, this.buffer, i2, zzbhv());
                    this.position = i;
                    zzgs((zza - i) - zzgx2);
                    this.position = zza;
                    return;
                }
                zzgs(zzenz.zzd(str));
                this.position = zzenz.zza(str, this.buffer, this.position, zzbhv());
            } catch (zzeoc e) {
                this.position = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzeka
        public final int zzbhv() {
            return this.limit - this.position;
        }
    }

    public final void zzfi(long j) throws IOException {
        zzfh(zzfp(j));
    }

    public final void zzf(float f) throws IOException {
        zzgu(Float.floatToRawIntBits(f));
    }

    public final void zzc(double d) throws IOException {
        zzfj(Double.doubleToRawLongBits(d));
    }

    public final void zzbq(boolean z) throws IOException {
        zzd(z ? (byte) 1 : (byte) 0);
    }

    public static int zzag(int i, int i2) {
        return zzgx(i << 3) + zzgw(i2);
    }

    public static int zzah(int i, int i2) {
        return zzgx(i << 3) + zzgx(i2);
    }

    public static int zzai(int i, int i2) {
        return zzgx(i << 3) + zzgx(zzhc(i2));
    }

    public static int zzaj(int i, int i2) {
        return zzgx(i << 3) + 4;
    }

    public static int zzak(int i, int i2) {
        return zzgx(i << 3) + 4;
    }

    public static int zzl(int i, long j) {
        return zzgx(i << 3) + zzfl(j);
    }

    public static int zzm(int i, long j) {
        return zzgx(i << 3) + zzfl(j);
    }

    public static int zzn(int i, long j) {
        return zzgx(i << 3) + zzfl(zzfp(j));
    }

    public static int zzo(int i, long j) {
        return zzgx(i << 3) + 8;
    }

    public static int zzp(int i, long j) {
        return zzgx(i << 3) + 8;
    }

    public static int zzb(int i, float f) {
        return zzgx(i << 3) + 4;
    }

    public static int zzc(int i, double d) {
        return zzgx(i << 3) + 8;
    }

    public static int zzi(int i, boolean z) {
        return zzgx(i << 3) + 1;
    }

    public static int zzal(int i, int i2) {
        return zzgx(i << 3) + zzgw(i2);
    }

    public static int zzj(int i, String str) {
        return zzgx(i << 3) + zzic(str);
    }

    public static int zzc(int i, zzejg zzejgVar) {
        int zzgx = zzgx(i << 3);
        int size = zzejgVar.size();
        return zzgx + zzgx(size) + size;
    }

    public static int zza(int i, zzeli zzeliVar) {
        int zzgx = zzgx(i << 3);
        int zzbin = zzeliVar.zzbin();
        return zzgx + zzgx(zzbin) + zzbin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, zzemd zzemdVar, zzemy zzemyVar) {
        return zzgx(i << 3) + zza(zzemdVar, zzemyVar);
    }

    public static int zzb(int i, zzemd zzemdVar) {
        return (zzgx(8) << 1) + zzah(2, i) + zzgx(24) + zzh(zzemdVar);
    }

    public static int zzd(int i, zzejg zzejgVar) {
        return (zzgx(8) << 1) + zzah(2, i) + zzc(3, zzejgVar);
    }

    public static int zzb(int i, zzeli zzeliVar) {
        return (zzgx(8) << 1) + zzah(2, i) + zza(3, zzeliVar);
    }

    public static int zzgv(int i) {
        return zzgx(i << 3);
    }

    public static int zzgw(int i) {
        if (i >= 0) {
            return zzgx(i);
        }
        return 10;
    }

    public static int zzgy(int i) {
        return zzgx(zzhc(i));
    }

    public static int zzfk(long j) {
        return zzfl(j);
    }

    public static int zzfm(long j) {
        return zzfl(zzfp(j));
    }

    public static int zzhb(int i) {
        return zzgw(i);
    }

    public static int zzic(String str) {
        int length;
        try {
            length = zzenz.zzd(str);
        } catch (zzeoc unused) {
            length = str.getBytes(zzeks.UTF_8).length;
        }
        return zzgx(length) + length;
    }

    public static int zza(zzeli zzeliVar) {
        int zzbin = zzeliVar.zzbin();
        return zzgx(zzbin) + zzbin;
    }

    public static int zzaj(zzejg zzejgVar) {
        int size = zzejgVar.size();
        return zzgx(size) + size;
    }

    public static int zzw(byte[] bArr) {
        int length = bArr.length;
        return zzgx(length) + length;
    }

    public static int zzh(zzemd zzemdVar) {
        int zzbin = zzemdVar.zzbin();
        return zzgx(zzbin) + zzbin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzemd zzemdVar, zzemy zzemyVar) {
        zzeiw zzeiwVar = (zzeiw) zzemdVar;
        int zzbgd = zzeiwVar.zzbgd();
        if (zzbgd == -1) {
            zzbgd = zzemyVar.zzau(zzeiwVar);
            zzeiwVar.zzfv(zzbgd);
        }
        return zzgx(zzbgd) + zzbgd;
    }

    public final void zzbhw() {
        if (zzbhv() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zza(String str, zzeoc zzeocVar) throws IOException {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzeocVar);
        byte[] bytes = str.getBytes(zzeks.UTF_8);
        try {
            zzgs(bytes.length);
            zzh(bytes, 0, bytes.length);
        } catch (zza e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zza(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzc(int i, zzemd zzemdVar, zzemy zzemyVar) {
        int zzgx = zzgx(i << 3) << 1;
        zzeiw zzeiwVar = (zzeiw) zzemdVar;
        int zzbgd = zzeiwVar.zzbgd();
        if (zzbgd == -1) {
            zzbgd = zzemyVar.zzau(zzeiwVar);
            zzeiwVar.zzfv(zzbgd);
        }
        return zzgx + zzbgd;
    }

    @Deprecated
    public static int zzi(zzemd zzemdVar) {
        return zzemdVar.zzbin();
    }

    @Deprecated
    public static int zzhd(int i) {
        return zzgx(i);
    }
}
