package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzpu {
    private final int height;
    private final int width;
    public final List<byte[]> zzahd;
    public final int zzasn;
    public final float zzbjv;

    public static zzpu zzg(zzpm zzpmVar) throws zzhv {
        int i;
        int i2;
        float f;
        try {
            zzpmVar.zzbj(4);
            int readUnsignedByte = (zzpmVar.readUnsignedByte() & 3) + 1;
            if (readUnsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int readUnsignedByte2 = zzpmVar.readUnsignedByte() & 31;
            for (int i3 = 0; i3 < readUnsignedByte2; i3++) {
                arrayList.add(zzh(zzpmVar));
            }
            int readUnsignedByte3 = zzpmVar.readUnsignedByte();
            for (int i4 = 0; i4 < readUnsignedByte3; i4++) {
                arrayList.add(zzh(zzpmVar));
            }
            if (readUnsignedByte2 > 0) {
                zzpk zzd = zzpl.zzd((byte[]) arrayList.get(0), readUnsignedByte, ((byte[]) arrayList.get(0)).length);
                int i5 = zzd.width;
                int i6 = zzd.height;
                f = zzd.zzbjv;
                i = i5;
                i2 = i6;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new zzpu(arrayList, readUnsignedByte, i, i2, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzhv("Error parsing AVC config", e);
        }
    }

    private zzpu(List<byte[]> list, int i, int i2, int i3, float f) {
        this.zzahd = list;
        this.zzasn = i;
        this.width = i2;
        this.height = i3;
        this.zzbjv = f;
    }

    private static byte[] zzh(zzpm zzpmVar) {
        int readUnsignedShort = zzpmVar.readUnsignedShort();
        int position = zzpmVar.getPosition();
        zzpmVar.zzbj(readUnsignedShort);
        return zzpe.zzc(zzpmVar.data, position, readUnsignedShort);
    }
}
