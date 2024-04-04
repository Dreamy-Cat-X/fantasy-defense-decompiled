package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzki implements zzkn {
    private final byte[] zzaox = new byte[8];
    private final Stack<zzkk> zzaoy = new Stack<>();
    private final zzks zzaoz = new zzks();
    private zzkm zzapa;
    private int zzapb;
    private int zzapc;
    private long zzapd;

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zza(zzkm zzkmVar) {
        this.zzapa = zzkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void reset() {
        this.zzapb = 0;
        this.zzaoy.clear();
        this.zzaoz.reset();
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final boolean zzb(zzjy zzjyVar) throws IOException, InterruptedException {
        String str;
        double longBitsToDouble;
        int zzao;
        int zza;
        long j;
        int i;
        zzpf.checkState(this.zzapa != null);
        while (true) {
            if (!this.zzaoy.isEmpty()) {
                long position = zzjyVar.getPosition();
                j = this.zzaoy.peek().zzapg;
                if (position >= j) {
                    zzkm zzkmVar = this.zzapa;
                    i = this.zzaoy.pop().zzapc;
                    zzkmVar.zzan(i);
                    return true;
                }
            }
            if (this.zzapb == 0) {
                long zza2 = this.zzaoz.zza(zzjyVar, true, false, 4);
                if (zza2 == -2) {
                    zzjyVar.zzgq();
                    while (true) {
                        zzjyVar.zza(this.zzaox, 0, 4);
                        zzao = zzks.zzao(this.zzaox[0]);
                        if (zzao != -1 && zzao <= 4) {
                            zza = (int) zzks.zza(this.zzaox, zzao, false);
                            if (this.zzapa.zzam(zza)) {
                                break;
                            }
                        }
                        zzjyVar.zzag(1);
                    }
                    zzjyVar.zzag(zzao);
                    zza2 = zza;
                }
                if (zza2 == -1) {
                    return false;
                }
                this.zzapc = (int) zza2;
                this.zzapb = 1;
            }
            if (this.zzapb == 1) {
                this.zzapd = this.zzaoz.zza(zzjyVar, false, true, 8);
                this.zzapb = 2;
            }
            int zzal = this.zzapa.zzal(this.zzapc);
            if (zzal != 0) {
                if (zzal == 1) {
                    long position2 = zzjyVar.getPosition();
                    this.zzaoy.add(new zzkk(this.zzapc, this.zzapd + position2));
                    this.zzapa.zzd(this.zzapc, position2, this.zzapd);
                    this.zzapb = 0;
                    return true;
                }
                if (zzal == 2) {
                    long j2 = this.zzapd;
                    if (j2 > 8) {
                        long j3 = this.zzapd;
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Invalid integer size: ");
                        sb.append(j3);
                        throw new zzhv(sb.toString());
                    }
                    this.zzapa.zzd(this.zzapc, zza(zzjyVar, (int) j2));
                    this.zzapb = 0;
                    return true;
                }
                if (zzal == 3) {
                    long j4 = this.zzapd;
                    if (j4 > 2147483647L) {
                        long j5 = this.zzapd;
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("String element size: ");
                        sb2.append(j5);
                        throw new zzhv(sb2.toString());
                    }
                    zzkm zzkmVar2 = this.zzapa;
                    int i2 = this.zzapc;
                    int i3 = (int) j4;
                    if (i3 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i3];
                        zzjyVar.readFully(bArr, 0, i3);
                        str = new String(bArr);
                    }
                    zzkmVar2.zza(i2, str);
                    this.zzapb = 0;
                    return true;
                }
                if (zzal == 4) {
                    this.zzapa.zza(this.zzapc, (int) this.zzapd, zzjyVar);
                    this.zzapb = 0;
                    return true;
                }
                if (zzal == 5) {
                    long j6 = this.zzapd;
                    if (j6 != 4 && j6 != 8) {
                        long j7 = this.zzapd;
                        StringBuilder sb3 = new StringBuilder(40);
                        sb3.append("Invalid float size: ");
                        sb3.append(j7);
                        throw new zzhv(sb3.toString());
                    }
                    zzkm zzkmVar3 = this.zzapa;
                    int i4 = this.zzapc;
                    int i5 = (int) this.zzapd;
                    long zza3 = zza(zzjyVar, i5);
                    if (i5 == 4) {
                        longBitsToDouble = Float.intBitsToFloat((int) zza3);
                    } else {
                        longBitsToDouble = Double.longBitsToDouble(zza3);
                    }
                    zzkmVar3.zza(i4, longBitsToDouble);
                    this.zzapb = 0;
                    return true;
                }
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append("Invalid element type ");
                sb4.append(zzal);
                throw new zzhv(sb4.toString());
            }
            zzjyVar.zzag((int) this.zzapd);
            this.zzapb = 0;
        }
    }

    private final long zza(zzjy zzjyVar, int i) throws IOException, InterruptedException {
        zzjyVar.readFully(this.zzaox, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zzaox[i2] & 255);
        }
        return j;
    }
}
