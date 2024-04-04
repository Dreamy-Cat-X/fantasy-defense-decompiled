package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.sncompany.newtower.NetworkThread;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzpe {
    private static final byte[] zzbjq = {0, 0, 0, 1};
    private static final int[] zzbjr = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, NetworkThread.DATA_COMMAND_GET_ITEM_LIST, 11025, 8000, 7350};
    private static final int[] zzbjs = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair<Integer, Integer> zze(byte[] bArr) {
        zzpn zzpnVar = new zzpn(bArr);
        int zza = zza(zzpnVar);
        int zzb = zzb(zzpnVar);
        int zzbl = zzpnVar.zzbl(4);
        if (zza == 5 || zza == 29) {
            zzb = zzb(zzpnVar);
            if (zza(zzpnVar) == 22) {
                zzbl = zzpnVar.zzbl(4);
            }
        }
        int i = zzbjs[zzbl];
        zzpf.checkArgument(i != -1);
        return Pair.create(Integer.valueOf(zzb), Integer.valueOf(i));
    }

    public static byte[] zzc(byte[] bArr, int i, int i2) {
        byte[] bArr2 = zzbjq;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, zzbjq.length, i2);
        return bArr3;
    }

    private static int zza(zzpn zzpnVar) {
        int zzbl = zzpnVar.zzbl(5);
        return zzbl == 31 ? zzpnVar.zzbl(6) + 32 : zzbl;
    }

    private static int zzb(zzpn zzpnVar) {
        int zzbl = zzpnVar.zzbl(4);
        if (zzbl == 15) {
            return zzpnVar.zzbl(24);
        }
        zzpf.checkArgument(zzbl < 13);
        return zzbjr[zzbl];
    }
}
