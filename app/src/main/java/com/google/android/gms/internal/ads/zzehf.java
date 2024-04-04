package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
abstract class zzehf implements zzeid {
    private static final int[] zzihn = zzq(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    int[] zziho;
    private final int zzihp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzehf(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zziho = zzq(bArr);
        this.zzihp = i;
    }

    private static int rotateLeft(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    abstract int[] zzb(int[] iArr, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzbfs();

    @Override // com.google.android.gms.internal.ads.zzeid
    public final byte[] zzn(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - zzbfs()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(zzbfs() + bArr.length);
        zza(allocate, bArr);
        return allocate.array();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - zzbfs() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] zzft = zzeij.zzft(zzbfs());
        byteBuffer.put(zzft);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int remaining = wrap.remaining();
        int i = (remaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer zzf = zzf(zzft, this.zzihp + i2);
            if (i2 == i - 1) {
                zzehd.zza(byteBuffer, wrap, zzf, remaining % 64);
            } else {
                zzehd.zza(byteBuffer, wrap, zzf, 64);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ByteBuffer zzf(byte[] bArr, int i) {
        int[] zzb = zzb(zzq(bArr), i);
        int[] iArr = (int[]) zzb.clone();
        zzc(iArr);
        for (int i2 = 0; i2 < zzb.length; i2++) {
            zzb[i2] = zzb[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb, 0, 16);
        return order;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(int[] iArr, int[] iArr2) {
        int[] iArr3 = zzihn;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, zzihn.length, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzc(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            zza(iArr, 0, 4, 8, 12);
            zza(iArr, 1, 5, 9, 13);
            zza(iArr, 2, 6, 10, 14);
            zza(iArr, 3, 7, 11, 15);
            zza(iArr, 0, 5, 10, 15);
            zza(iArr, 1, 6, 11, 12);
            zza(iArr, 2, 7, 8, 13);
            zza(iArr, 3, 4, 9, 14);
        }
    }

    private static void zza(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = rotateLeft(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = rotateLeft(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = rotateLeft(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = rotateLeft(iArr[i2] ^ iArr[i3], 7);
    }

    private static int[] zzq(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
