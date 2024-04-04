package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzqa {
    public final List<byte[]> zzahd;
    public final int zzasn;

    public static zzqa zzi(zzpm zzpmVar) throws zzhv {
        try {
            zzpmVar.zzbj(21);
            int readUnsignedByte = zzpmVar.readUnsignedByte() & 3;
            int readUnsignedByte2 = zzpmVar.readUnsignedByte();
            int position = zzpmVar.getPosition();
            int i = 0;
            for (int i2 = 0; i2 < readUnsignedByte2; i2++) {
                zzpmVar.zzbj(1);
                int readUnsignedShort = zzpmVar.readUnsignedShort();
                for (int i3 = 0; i3 < readUnsignedShort; i3++) {
                    int readUnsignedShort2 = zzpmVar.readUnsignedShort();
                    i += readUnsignedShort2 + 4;
                    zzpmVar.zzbj(readUnsignedShort2);
                }
            }
            zzpmVar.zzbi(position);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < readUnsignedByte2; i5++) {
                zzpmVar.zzbj(1);
                int readUnsignedShort3 = zzpmVar.readUnsignedShort();
                for (int i6 = 0; i6 < readUnsignedShort3; i6++) {
                    int readUnsignedShort4 = zzpmVar.readUnsignedShort();
                    System.arraycopy(zzpl.zzbjq, 0, bArr, i4, zzpl.zzbjq.length);
                    int length = i4 + zzpl.zzbjq.length;
                    System.arraycopy(zzpmVar.data, zzpmVar.getPosition(), bArr, length, readUnsignedShort4);
                    i4 = length + readUnsignedShort4;
                    zzpmVar.zzbj(readUnsignedShort4);
                }
            }
            return new zzqa(i == 0 ? null : Collections.singletonList(bArr), readUnsignedByte + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzhv("Error parsing HEVC config", e);
        }
    }

    private zzqa(List<byte[]> list, int i) {
        this.zzahd = list;
        this.zzasn = i;
    }
}
