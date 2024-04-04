package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.core.internal.view.SupportMenu;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Pair<ByteBuffer, Long> zza(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> zza = zza(randomAccessFile, 0);
        return zza != null ? zza : zza(randomAccessFile, (int) SupportMenu.USER_MASK);
    }

    private static Pair<ByteBuffer, Long> zza(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        if (i < 0 || i > 65535) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("maxCommentSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i, length - 22)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        zze(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i3 = capacity2 - 22;
            int min = Math.min(i3, (int) SupportMenu.USER_MASK);
            for (int i4 = 0; i4 < min; i4++) {
                i2 = i3 - i4;
                if (allocate.getInt(i2) == 101010256 && (allocate.getShort(i2 + 20) & 65535) == i4) {
                    break;
                }
            }
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        allocate.position(i2);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i2));
    }

    public static long zzc(ByteBuffer byteBuffer) {
        zze(byteBuffer);
        return zzb(byteBuffer, byteBuffer.position() + 16);
    }

    public static void zza(ByteBuffer byteBuffer, long j) {
        zze(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j < 0 || j > 4294967295L) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("uint32 value of out range: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        byteBuffer.putInt(byteBuffer.position() + position, (int) j);
    }

    public static long zzd(ByteBuffer byteBuffer) {
        zze(byteBuffer);
        return zzb(byteBuffer, byteBuffer.position() + 12);
    }

    private static void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static long zzb(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getInt(i) & 4294967295L;
    }
}
