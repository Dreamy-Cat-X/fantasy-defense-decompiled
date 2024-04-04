package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzry extends zzrr {
    private MessageDigest zzbty;

    @Override // com.google.android.gms.internal.ads.zzrr
    public final byte[] zzbp(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int i = 4;
        if (split.length == 1) {
            int zzbr = zzrv.zzbr(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(zzbr);
            bArr2 = allocate.array();
        } else {
            if (split.length < 5) {
                bArr = new byte[split.length << 1];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int zzbr2 = zzrv.zzbr(split[i2]);
                    int i3 = (zzbr2 >> 16) ^ (65535 & zzbr2);
                    byte[] bArr3 = {(byte) i3, (byte) (i3 >> 8)};
                    int i4 = i2 << 1;
                    bArr[i4] = bArr3[0];
                    bArr[i4 + 1] = bArr3[1];
                }
            } else {
                bArr = new byte[split.length];
                for (int i5 = 0; i5 < split.length; i5++) {
                    int zzbr3 = zzrv.zzbr(split[i5]);
                    bArr[i5] = (byte) ((zzbr3 >> 24) ^ (((zzbr3 & 255) ^ ((zzbr3 >> 8) & 255)) ^ ((zzbr3 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.zzbty = zzmm();
        synchronized (this.mLock) {
            if (this.zzbty == null) {
                return new byte[0];
            }
            this.zzbty.reset();
            this.zzbty.update(bArr2);
            byte[] digest = this.zzbty.digest();
            if (digest.length <= 4) {
                i = digest.length;
            }
            byte[] bArr4 = new byte[i];
            System.arraycopy(digest, 0, bArr4, 0, i);
            return bArr4;
        }
    }
}
