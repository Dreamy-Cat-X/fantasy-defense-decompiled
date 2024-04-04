package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zznv {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zza(long j, zzpm zzpmVar, zzkg[] zzkgVarArr) {
        boolean z;
        while (zzpmVar.zziv() > 1) {
            int zzf = zzf(zzpmVar);
            int zzf2 = zzf(zzpmVar);
            if (zzf2 == -1 || zzf2 > zzpmVar.zziv()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzpmVar.zzbi(zzpmVar.limit());
            } else {
                if (zzf == 4 && zzf2 >= 8) {
                    int position = zzpmVar.getPosition();
                    int readUnsignedByte = zzpmVar.readUnsignedByte();
                    int readUnsignedShort = zzpmVar.readUnsignedShort();
                    int readInt = zzpmVar.readInt();
                    int readUnsignedByte2 = zzpmVar.readUnsignedByte();
                    zzpmVar.zzbi(position);
                    if (readUnsignedByte == 181 && readUnsignedShort == 49 && readInt == 1195456820 && readUnsignedByte2 == 3) {
                        z = true;
                        if (!z) {
                            zzpmVar.zzbj(8);
                            int readUnsignedByte3 = zzpmVar.readUnsignedByte() & 31;
                            zzpmVar.zzbj(1);
                            int i = readUnsignedByte3 * 3;
                            int position2 = zzpmVar.getPosition();
                            for (zzkg zzkgVar : zzkgVarArr) {
                                zzpmVar.zzbi(position2);
                                zzkgVar.zza(zzpmVar, i);
                                zzkgVar.zza(j, 1, i, 0, null);
                            }
                            zzpmVar.zzbj(zzf2 - (i + 10));
                        } else {
                            zzpmVar.zzbj(zzf2);
                        }
                    }
                }
                z = false;
                if (!z) {
                }
            }
        }
    }

    private static int zzf(zzpm zzpmVar) {
        int i = 0;
        while (zzpmVar.zziv() != 0) {
            int readUnsignedByte = zzpmVar.readUnsignedByte();
            i += readUnsignedByte;
            if (readUnsignedByte != 255) {
                return i;
            }
        }
        return -1;
    }
}
