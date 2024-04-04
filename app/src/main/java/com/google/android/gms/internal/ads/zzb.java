package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.core.view.InputDeviceCompat;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzb {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[Catch: all -> 0x0292, TryCatch #0 {all -> 0x0292, blocks: (B:3:0x0009, B:5:0x000f, B:7:0x0028, B:11:0x0039, B:13:0x0041, B:17:0x0050, B:19:0x0083, B:21:0x0092, B:25:0x00a6, B:27:0x00b2, B:29:0x00d5, B:31:0x00f1, B:32:0x00fe, B:34:0x0104, B:36:0x010b, B:42:0x0121, B:44:0x012c, B:48:0x0135, B:46:0x0153, B:56:0x015a, B:57:0x0182, B:59:0x0183, B:60:0x019f, B:63:0x01a0, B:64:0x01b8, B:66:0x01b9, B:67:0x01c0, B:68:0x01c1, B:69:0x01c8, B:70:0x01c9, B:71:0x01ea, B:72:0x01eb, B:73:0x0203, B:74:0x0204, B:75:0x021d, B:76:0x021e, B:77:0x0225, B:78:0x0226, B:79:0x023e, B:80:0x023f, B:81:0x0246, B:82:0x0247, B:83:0x0267, B:84:0x0268, B:85:0x026f, B:87:0x0270, B:88:0x0291), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0268 A[Catch: all -> 0x0292, TryCatch #0 {all -> 0x0292, blocks: (B:3:0x0009, B:5:0x000f, B:7:0x0028, B:11:0x0039, B:13:0x0041, B:17:0x0050, B:19:0x0083, B:21:0x0092, B:25:0x00a6, B:27:0x00b2, B:29:0x00d5, B:31:0x00f1, B:32:0x00fe, B:34:0x0104, B:36:0x010b, B:42:0x0121, B:44:0x012c, B:48:0x0135, B:46:0x0153, B:56:0x015a, B:57:0x0182, B:59:0x0183, B:60:0x019f, B:63:0x01a0, B:64:0x01b8, B:66:0x01b9, B:67:0x01c0, B:68:0x01c1, B:69:0x01c8, B:70:0x01c9, B:71:0x01ea, B:72:0x01eb, B:73:0x0203, B:74:0x0204, B:75:0x021d, B:76:0x021e, B:77:0x0225, B:78:0x0226, B:79:0x023e, B:80:0x023f, B:81:0x0246, B:82:0x0247, B:83:0x0267, B:84:0x0268, B:85:0x026f, B:87:0x0270, B:88:0x0291), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X509Certificate[][] zza(String str) throws zzh, SecurityException, IOException {
        boolean z;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair<ByteBuffer, Long> zza = zzi.zza(randomAccessFile);
            if (zza == null) {
                long length = randomAccessFile.length();
                StringBuilder sb = new StringBuilder(102);
                sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb.append(length);
                sb.append(" bytes");
                throw new zzh(sb.toString());
            }
            ByteBuffer byteBuffer = (ByteBuffer) zza.first;
            long longValue = ((Long) zza.second).longValue();
            long j = longValue - 20;
            int i = 1;
            int i2 = 0;
            if (j >= 0) {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == 1347094023) {
                    z = true;
                    if (!z) {
                        throw new zzh("ZIP64 APK not supported");
                    }
                    long zzc = zzi.zzc(byteBuffer);
                    if (zzc >= longValue) {
                        StringBuilder sb2 = new StringBuilder(122);
                        sb2.append("ZIP Central Directory offset out of range: ");
                        sb2.append(zzc);
                        sb2.append(". ZIP End of Central Directory offset: ");
                        sb2.append(longValue);
                        throw new zzh(sb2.toString());
                    }
                    if (zzi.zzd(byteBuffer) + zzc != longValue) {
                        throw new zzh("ZIP Central Directory is not immediately followed by End of Central Directory");
                    }
                    if (zzc < 32) {
                        StringBuilder sb3 = new StringBuilder(87);
                        sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                        sb3.append(zzc);
                        throw new zzh(sb3.toString());
                    }
                    ByteBuffer allocate = ByteBuffer.allocate(24);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    randomAccessFile.seek(zzc - allocate.capacity());
                    randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                    if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                        throw new zzh("No APK Signing Block before ZIP Central Directory");
                    }
                    long j2 = allocate.getLong(0);
                    if (j2 < allocate.capacity() || j2 > 2147483639) {
                        StringBuilder sb4 = new StringBuilder(57);
                        sb4.append("APK Signing Block size out of range: ");
                        sb4.append(j2);
                        throw new zzh(sb4.toString());
                    }
                    int i3 = (int) (8 + j2);
                    long j3 = zzc - i3;
                    if (j3 < 0) {
                        StringBuilder sb5 = new StringBuilder(59);
                        sb5.append("APK Signing Block offset out of range: ");
                        sb5.append(j3);
                        throw new zzh(sb5.toString());
                    }
                    ByteBuffer allocate2 = ByteBuffer.allocate(i3);
                    allocate2.order(ByteOrder.LITTLE_ENDIAN);
                    randomAccessFile.seek(j3);
                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                    long j4 = allocate2.getLong(0);
                    if (j4 != j2) {
                        StringBuilder sb6 = new StringBuilder(103);
                        sb6.append("APK Signing Block sizes in header and footer do not match: ");
                        sb6.append(j4);
                        sb6.append(" vs ");
                        sb6.append(j2);
                        throw new zzh(sb6.toString());
                    }
                    Pair create = Pair.create(allocate2, Long.valueOf(j3));
                    ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                    long longValue2 = ((Long) create.second).longValue();
                    if (byteBuffer2.order() != ByteOrder.LITTLE_ENDIAN) {
                        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                    }
                    int i4 = 8;
                    ByteBuffer zza2 = zza(byteBuffer2, 8, byteBuffer2.capacity() - 24);
                    while (zza2.hasRemaining()) {
                        i2 += i;
                        if (zza2.remaining() < i4) {
                            StringBuilder sb7 = new StringBuilder(70);
                            sb7.append("Insufficient data to read size of APK Signing Block entry #");
                            sb7.append(i2);
                            throw new zzh(sb7.toString());
                        }
                        long j5 = zza2.getLong();
                        if (j5 < 4 || j5 > 2147483647L) {
                            StringBuilder sb8 = new StringBuilder(76);
                            sb8.append("APK Signing Block entry #");
                            sb8.append(i2);
                            sb8.append(" size out of range: ");
                            sb8.append(j5);
                            throw new zzh(sb8.toString());
                        }
                        int i5 = (int) j5;
                        int position = zza2.position() + i5;
                        if (i5 > zza2.remaining()) {
                            int remaining = zza2.remaining();
                            StringBuilder sb9 = new StringBuilder(91);
                            sb9.append("APK Signing Block entry #");
                            sb9.append(i2);
                            sb9.append(" size out of range: ");
                            sb9.append(i5);
                            sb9.append(", available: ");
                            sb9.append(remaining);
                            throw new zzh(sb9.toString());
                        }
                        if (zza2.getInt() != 1896449818) {
                            zza2.position(position);
                            i = 1;
                            i4 = 8;
                        } else {
                            X509Certificate[][] zza3 = zza(randomAccessFile.getChannel(), new zze(zza(zza2, i5 - 4), longValue2, zzc, longValue, byteBuffer));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return zza3;
                        }
                    }
                    throw new zzh("No APK Signature Scheme v2 block in APK Signing Block");
                }
            }
            z = false;
            if (!z) {
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    private static X509Certificate[][] zza(FileChannel fileChannel, zze zzeVar) throws SecurityException {
        ByteBuffer byteBuffer;
        long j;
        long j2;
        long j3;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzeVar.zzb;
                ByteBuffer zza = zza(byteBuffer);
                int i = 0;
                while (zza.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zza(zza(zza), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (!hashMap.isEmpty()) {
                    j = zzeVar.zzc;
                    j2 = zzeVar.zzd;
                    j3 = zzeVar.zze;
                    byteBuffer2 = zzeVar.zzf;
                    if (hashMap.isEmpty()) {
                        throw new SecurityException("No digests provided");
                    }
                    zzf zzfVar = new zzf(fileChannel, 0L, j);
                    zzf zzfVar2 = new zzf(fileChannel, j2, j3 - j2);
                    ByteBuffer duplicate = byteBuffer2.duplicate();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    zzi.zza(duplicate, j);
                    zzd zzdVar = new zzd(duplicate);
                    int size = hashMap.size();
                    int[] iArr = new int[size];
                    Iterator it = hashMap.keySet().iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        iArr[i2] = ((Integer) it.next()).intValue();
                        i2++;
                    }
                    try {
                        byte[][] zza2 = zza(iArr, new zzc[]{zzfVar, zzfVar2, zzdVar});
                        for (int i3 = 0; i3 < size; i3++) {
                            int i4 = iArr[i3];
                            if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i4)), zza2[i3])) {
                                throw new SecurityException(String.valueOf(zzb(i4)).concat(" digest of contents did not verify"));
                            }
                        }
                        return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                    } catch (DigestException e2) {
                        throw new SecurityException("Failed to compute digest(s) of contents", e2);
                    }
                }
                throw new SecurityException("No content digests found");
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x0125. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static X509Certificate[] zza(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) throws SecurityException, IOException {
        String str;
        byte[] bArr;
        Pair create;
        boolean z;
        ByteBuffer zza = zza(byteBuffer);
        ByteBuffer zza2 = zza(byteBuffer);
        byte[] zzb = zzb(byteBuffer);
        ArrayList arrayList = new ArrayList();
        int i = -1;
        int i2 = 0;
        byte[] bArr2 = null;
        while (true) {
            char c = 1;
            if (!zza2.hasRemaining()) {
                if (i == -1) {
                    if (i2 == 0) {
                        throw new SecurityException("No signatures found");
                    }
                    throw new SecurityException("No supported signatures found");
                }
                if (i == 513 || i == 514) {
                    str = "EC";
                } else if (i != 769) {
                    switch (i) {
                        case InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
                        case 258:
                        case 259:
                        case 260:
                            str = "RSA";
                            break;
                        default:
                            String valueOf = String.valueOf(Long.toHexString(i));
                            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
                    }
                } else {
                    str = "DSA";
                }
                if (i == 513) {
                    bArr = null;
                    create = Pair.create("SHA256withECDSA", null);
                } else if (i == 514) {
                    bArr = null;
                    create = Pair.create("SHA512withECDSA", null);
                } else if (i != 769) {
                    switch (i) {
                        case InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
                            create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                            bArr = null;
                            break;
                        case 258:
                            create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                            bArr = null;
                            break;
                        case 259:
                            bArr = null;
                            create = Pair.create("SHA256withRSA", null);
                            break;
                        case 260:
                            bArr = null;
                            create = Pair.create("SHA512withRSA", null);
                            break;
                        default:
                            String valueOf2 = String.valueOf(Long.toHexString(i));
                            throw new IllegalArgumentException(valueOf2.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf2) : new String("Unknown signature algorithm: 0x"));
                    }
                } else {
                    bArr = null;
                    create = Pair.create("SHA256withDSA", null);
                }
                String str2 = (String) create.first;
                AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) create.second;
                try {
                    PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(zzb));
                    Signature signature = Signature.getInstance(str2);
                    signature.initVerify(generatePublic);
                    if (algorithmParameterSpec != null) {
                        signature.setParameter(algorithmParameterSpec);
                    }
                    signature.update(zza);
                    if (!signature.verify(bArr2)) {
                        throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
                    }
                    zza.clear();
                    ByteBuffer zza3 = zza(zza);
                    ArrayList arrayList2 = new ArrayList();
                    int i3 = 0;
                    while (zza3.hasRemaining()) {
                        i3++;
                        try {
                            ByteBuffer zza4 = zza(zza3);
                            if (zza4.remaining() < 8) {
                                throw new IOException("Record too short");
                            }
                            int i4 = zza4.getInt();
                            arrayList2.add(Integer.valueOf(i4));
                            if (i4 == i) {
                                bArr = zzb(zza4);
                            }
                        } catch (IOException | BufferUnderflowException e) {
                            StringBuilder sb = new StringBuilder(42);
                            sb.append("Failed to parse digest record #");
                            sb.append(i3);
                            throw new IOException(sb.toString(), e);
                        }
                    }
                    if (!arrayList.equals(arrayList2)) {
                        throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                    }
                    int zza5 = zza(i);
                    byte[] put = map.put(Integer.valueOf(zza5), bArr);
                    if (put != null && !MessageDigest.isEqual(put, bArr)) {
                        throw new SecurityException(String.valueOf(zzb(zza5)).concat(" contents digest does not match the digest specified by a preceding signer"));
                    }
                    ByteBuffer zza6 = zza(zza);
                    ArrayList arrayList3 = new ArrayList();
                    int i5 = 0;
                    while (zza6.hasRemaining()) {
                        i5++;
                        byte[] zzb2 = zzb(zza6);
                        try {
                            arrayList3.add(new zzg((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(zzb2)), zzb2));
                        } catch (CertificateException e2) {
                            StringBuilder sb2 = new StringBuilder(41);
                            sb2.append("Failed to decode certificate #");
                            sb2.append(i5);
                            throw new SecurityException(sb2.toString(), e2);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        throw new SecurityException("No certificates listed");
                    }
                    if (!Arrays.equals(zzb, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                        throw new SecurityException("Public key mismatch between certificate and signature record");
                    }
                    return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e3) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 27);
                    sb3.append("Failed to verify ");
                    sb3.append(str2);
                    sb3.append(" signature");
                    throw new SecurityException(sb3.toString(), e3);
                }
            }
            i2++;
            try {
                ByteBuffer zza7 = zza(zza2);
                if (zza7.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i6 = zza7.getInt();
                arrayList.add(Integer.valueOf(i6));
                if (i6 != 513 && i6 != 514 && i6 != 769) {
                    switch (i6) {
                        case InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            z = false;
                            break;
                    }
                    if (z) {
                        if (i != -1) {
                            int zza8 = zza(i6);
                            int zza9 = zza(i);
                            if (zza8 == 1) {
                                if (zza9 != 1) {
                                    if (zza9 != 2) {
                                        StringBuilder sb4 = new StringBuilder(37);
                                        sb4.append("Unknown digestAlgorithm2: ");
                                        sb4.append(zza9);
                                        throw new IllegalArgumentException(sb4.toString());
                                    }
                                    c = 65535;
                                    if (c > 0) {
                                    }
                                }
                                c = 0;
                                if (c > 0) {
                                }
                            } else {
                                if (zza8 != 2) {
                                    StringBuilder sb5 = new StringBuilder(37);
                                    sb5.append("Unknown digestAlgorithm1: ");
                                    sb5.append(zza8);
                                    throw new IllegalArgumentException(sb5.toString());
                                }
                                if (zza9 != 1) {
                                    if (zza9 != 2) {
                                        StringBuilder sb6 = new StringBuilder(37);
                                        sb6.append("Unknown digestAlgorithm2: ");
                                        sb6.append(zza9);
                                        throw new IllegalArgumentException(sb6.toString());
                                    }
                                    c = 0;
                                }
                                if (c > 0) {
                                }
                            }
                        }
                        bArr2 = zzb(zza7);
                        i = i6;
                    }
                }
                z = true;
                if (z) {
                }
            } catch (IOException | BufferUnderflowException e4) {
                StringBuilder sb7 = new StringBuilder(45);
                sb7.append("Failed to parse signature record #");
                sb7.append(i2);
                throw new SecurityException(sb7.toString(), e4);
            }
        }
    }

    private static byte[][] zza(int[] iArr, zzc[] zzcVarArr) throws DigestException {
        long j;
        zzc[] zzcVarArr2 = zzcVarArr;
        int length = zzcVarArr2.length;
        long j2 = 0;
        int i = 0;
        long j3 = 0;
        int i2 = 0;
        while (true) {
            j = 1048576;
            if (i2 >= length) {
                break;
            }
            j3 += ((zzcVarArr2[i2].size() + 1048576) - 1) / 1048576;
            i2++;
        }
        if (j3 >= 2097151) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Too many chunks: ");
            sb.append(j3);
            throw new DigestException(sb.toString());
        }
        int i3 = (int) j3;
        byte[][] bArr = new byte[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            byte[] bArr2 = new byte[(zzc(iArr[i4]) * i3) + 5];
            bArr2[0] = 90;
            zza(i3, bArr2, 1);
            bArr[i4] = bArr2;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        int length2 = iArr.length;
        MessageDigest[] messageDigestArr = new MessageDigest[length2];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            String zzb = zzb(iArr[i5]);
            try {
                messageDigestArr[i5] = MessageDigest.getInstance(zzb);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(String.valueOf(zzb).concat(" digest not supported"), e);
            }
        }
        int length3 = zzcVarArr2.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length3) {
            zzc zzcVar = zzcVarArr2[i6];
            long j4 = j2;
            int i8 = i7;
            int i9 = length3;
            long size = zzcVar.size();
            while (size > j2) {
                int min = (int) Math.min(size, j);
                zza(min, bArr3, 1);
                for (int i10 = 0; i10 < length2; i10++) {
                    messageDigestArr[i10].update(bArr3);
                }
                long j5 = j4;
                try {
                    zzcVar.zza(messageDigestArr, j5, min);
                    int i11 = 0;
                    while (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        byte[] bArr4 = bArr3;
                        byte[] bArr5 = bArr[i11];
                        int zzc = zzc(i12);
                        int i13 = length2;
                        MessageDigest messageDigest = messageDigestArr[i11];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int i14 = i8;
                        zzc zzcVar2 = zzcVar;
                        int digest = messageDigest.digest(bArr5, (i14 * zzc) + 5, zzc);
                        if (digest != zzc) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 46);
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i11++;
                        i8 = i14;
                        bArr3 = bArr4;
                        length2 = i13;
                        messageDigestArr = messageDigestArr2;
                        zzcVar = zzcVar2;
                    }
                    long j6 = min;
                    long j7 = j5 + j6;
                    size -= j6;
                    i8++;
                    bArr3 = bArr3;
                    messageDigestArr = messageDigestArr;
                    j = 1048576;
                    j4 = j7;
                    j2 = 0;
                } catch (IOException e2) {
                    StringBuilder sb3 = new StringBuilder(59);
                    sb3.append("Failed to digest chunk #");
                    sb3.append(i8);
                    sb3.append(" of section #");
                    sb3.append(i);
                    throw new DigestException(sb3.toString(), e2);
                }
            }
            i++;
            i6++;
            zzcVarArr2 = zzcVarArr;
            i7 = i8;
            length3 = i9;
            messageDigestArr = messageDigestArr;
            j2 = 0;
            j = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length];
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            byte[] bArr7 = bArr[i15];
            String zzb2 = zzb(i16);
            try {
                bArr6[i15] = MessageDigest.getInstance(zzb2).digest(bArr7);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(String.valueOf(zzb2).concat(" digest not supported"), e3);
            }
        }
        return bArr6;
    }

    private static int zza(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString(i));
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    private static String zzb(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private static int zzc(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private static ByteBuffer zza(ByteBuffer byteBuffer, int i, int i2) {
        if (i2 < 8) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("end < start: ");
            sb.append(i2);
            sb.append(" < 8");
            throw new IllegalArgumentException(sb.toString());
        }
        int capacity = byteBuffer.capacity();
        if (i2 > byteBuffer.capacity()) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("end > capacity: ");
            sb2.append(i2);
            sb2.append(" > ");
            sb2.append(capacity);
            throw new IllegalArgumentException(sb2.toString());
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            byteBuffer.position(8);
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            return slice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }

    private static ByteBuffer zza(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer zza(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(93);
            sb.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(101);
            sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
            sb2.append(i);
            sb2.append(", remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
        return zza(byteBuffer, i);
    }

    private static byte[] zzb(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(90);
            sb.append("Underflow while reading length-prefixed value. Length: ");
            sb.append(i);
            sb.append(", available: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    private static void zza(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) i;
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 16);
        bArr[4] = (byte) (i >>> 24);
    }
}
