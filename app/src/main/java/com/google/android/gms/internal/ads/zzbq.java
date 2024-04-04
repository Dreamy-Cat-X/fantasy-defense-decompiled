package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbq {
    public static int zza(byte b) {
        return b < 0 ? b + 256 : b;
    }

    public static long zzf(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static int zzg(ByteBuffer byteBuffer) {
        return (zza(byteBuffer.get()) << 8) + 0 + zza(byteBuffer.get());
    }

    public static long zzh(ByteBuffer byteBuffer) {
        long zzf = (zzf(byteBuffer) << 32) + 0;
        if (zzf < 0) {
            throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        }
        return zzf + zzf(byteBuffer);
    }

    public static double zzi(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = 0 | ((bArr[0] << 24) & ViewCompat.MEASURED_STATE_MASK) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (bArr[3] & 255);
        Double.isNaN(d);
        return d / 65536.0d;
    }

    public static double zzj(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = 0 | ((bArr[0] << 24) & ViewCompat.MEASURED_STATE_MASK) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (bArr[3] & 255);
        Double.isNaN(d);
        return d / 1.073741824E9d;
    }

    public static String zzk(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
