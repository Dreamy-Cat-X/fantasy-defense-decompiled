package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzln implements zzjz, zzke {
    private static final zzka zzaph = new zzlm();
    private static final int zzazw = zzps.zzbh("qt  ");
    private long zzaim;
    private int zzard;
    private int zzare;
    private zzkb zzarh;
    private int zzaxs;
    private int zzaxt;
    private long zzaxu;
    private int zzaxv;
    private zzpm zzaxw;
    private zzlp[] zzazx;
    private boolean zzazy;
    private final zzpm zzaxo = new zzpm(16);
    private final Stack<zzku> zzaxq = new Stack<>();
    private final zzpm zzapo = new zzpm(zzpl.zzbjq);
    private final zzpm zzapp = new zzpm(4);

    @Override // com.google.android.gms.internal.ads.zzke
    public final boolean isSeekable() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final void release() {
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final boolean zza(zzjy zzjyVar) throws IOException, InterruptedException {
        return zzlo.zze(zzjyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final void zza(zzkb zzkbVar) {
        this.zzarh = zzkbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final void zzc(long j, long j2) {
        this.zzaxq.clear();
        this.zzaxv = 0;
        this.zzare = 0;
        this.zzard = 0;
        if (j == 0) {
            zzhb();
            return;
        }
        zzlp[] zzlpVarArr = this.zzazx;
        if (zzlpVarArr != null) {
            for (zzlp zzlpVar : zzlpVarArr) {
                zzls zzlsVar = zzlpVar.zzbaa;
                int zzec = zzlsVar.zzec(j2);
                if (zzec == -1) {
                    zzec = zzlsVar.zzed(j2);
                }
                zzlpVar.zzaxd = zzec;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzjz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzjy zzjyVar, zzkf zzkfVar) throws IOException, InterruptedException {
        zzlp[] zzlpVarArr;
        boolean z;
        boolean z2;
        boolean z3;
        while (true) {
            int i = this.zzaxs;
            if (i == 0) {
                if (this.zzaxv == 0) {
                    if (zzjyVar.zza(this.zzaxo.data, 0, 8, true)) {
                        this.zzaxv = 8;
                        this.zzaxo.zzbi(0);
                        this.zzaxu = this.zzaxo.zzix();
                        this.zzaxt = this.zzaxo.readInt();
                    } else {
                        z3 = false;
                        if (z3) {
                            return -1;
                        }
                    }
                }
                if (this.zzaxu == 1) {
                    zzjyVar.readFully(this.zzaxo.data, 8, 8);
                    this.zzaxv += 8;
                    this.zzaxu = this.zzaxo.zzjb();
                }
                int i2 = this.zzaxt;
                if (i2 == zzkv.zzatv || i2 == zzkv.zzatx || i2 == zzkv.zzaty || i2 == zzkv.zzatz || i2 == zzkv.zzaua || i2 == zzkv.zzauj) {
                    long position = (zzjyVar.getPosition() + this.zzaxu) - this.zzaxv;
                    this.zzaxq.add(new zzku(this.zzaxt, position));
                    if (this.zzaxu == this.zzaxv) {
                        zzeb(position);
                    } else {
                        zzhb();
                    }
                } else {
                    int i3 = this.zzaxt;
                    if (i3 == zzkv.zzaul || i3 == zzkv.zzatw || i3 == zzkv.zzaum || i3 == zzkv.zzaun || i3 == zzkv.zzavg || i3 == zzkv.zzavh || i3 == zzkv.zzavi || i3 == zzkv.zzauk || i3 == zzkv.zzavj || i3 == zzkv.zzavk || i3 == zzkv.zzavl || i3 == zzkv.zzavm || i3 == zzkv.zzavn || i3 == zzkv.zzaui || i3 == zzkv.zzasu || i3 == zzkv.zzavu) {
                        zzpf.checkState(this.zzaxv == 8);
                        zzpf.checkState(this.zzaxu <= 2147483647L);
                        this.zzaxw = new zzpm((int) this.zzaxu);
                        System.arraycopy(this.zzaxo.data, 0, this.zzaxw.data, 0, 8);
                        this.zzaxs = 1;
                    } else {
                        this.zzaxw = null;
                        this.zzaxs = 1;
                    }
                }
                z3 = true;
                if (z3) {
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    long j = Long.MAX_VALUE;
                    int i4 = 0;
                    int i5 = -1;
                    while (true) {
                        zzlpVarArr = this.zzazx;
                        if (i4 >= zzlpVarArr.length) {
                            break;
                        }
                        zzlp zzlpVar = zzlpVarArr[i4];
                        int i6 = zzlpVar.zzaxd;
                        if (i6 != zzlpVar.zzbaa.zzawz) {
                            long j2 = zzlpVar.zzbaa.zzaos[i6];
                            if (j2 < j) {
                                i5 = i4;
                                j = j2;
                            }
                        }
                        i4++;
                    }
                    if (i5 == -1) {
                        return -1;
                    }
                    zzlp zzlpVar2 = zzlpVarArr[i5];
                    zzkg zzkgVar = zzlpVar2.zzbab;
                    int i7 = zzlpVar2.zzaxd;
                    long j3 = zzlpVar2.zzbaa.zzaos[i7];
                    int i8 = zzlpVar2.zzbaa.zzaor[i7];
                    if (zzlpVar2.zzazp.zzbag == 1) {
                        j3 += 8;
                        i8 -= 8;
                    }
                    long position2 = (j3 - zzjyVar.getPosition()) + this.zzare;
                    if (position2 < 0 || position2 >= 262144) {
                        zzkfVar.position = j3;
                        return 1;
                    }
                    zzjyVar.zzag((int) position2);
                    if (zzlpVar2.zzazp.zzasn == 0) {
                        while (true) {
                            int i9 = this.zzare;
                            if (i9 >= i8) {
                                break;
                            }
                            int zza = zzkgVar.zza(zzjyVar, i8 - i9, false);
                            this.zzare += zza;
                            this.zzard -= zza;
                        }
                    } else {
                        byte[] bArr = this.zzapp.data;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i10 = zzlpVar2.zzazp.zzasn;
                        int i11 = 4 - zzlpVar2.zzazp.zzasn;
                        while (this.zzare < i8) {
                            int i12 = this.zzard;
                            if (i12 == 0) {
                                zzjyVar.readFully(this.zzapp.data, i11, i10);
                                this.zzapp.zzbi(0);
                                this.zzard = this.zzapp.zzja();
                                this.zzapo.zzbi(0);
                                zzkgVar.zza(this.zzapo, 4);
                                this.zzare += 4;
                                i8 += i11;
                            } else {
                                int zza2 = zzkgVar.zza(zzjyVar, i12, false);
                                this.zzare += zza2;
                                this.zzard -= zza2;
                            }
                        }
                    }
                    zzkgVar.zza(zzlpVar2.zzbaa.zzbak[i7], zzlpVar2.zzbaa.zzayi[i7], i8, 0, null);
                    zzlpVar2.zzaxd++;
                    this.zzare = 0;
                    this.zzard = 0;
                    return 0;
                }
                long j4 = this.zzaxu - this.zzaxv;
                long position3 = zzjyVar.getPosition() + j4;
                zzpm zzpmVar = this.zzaxw;
                if (zzpmVar != null) {
                    zzjyVar.readFully(zzpmVar.data, this.zzaxv, (int) j4);
                    if (this.zzaxt == zzkv.zzasu) {
                        zzpm zzpmVar2 = this.zzaxw;
                        zzpmVar2.zzbi(8);
                        if (zzpmVar2.readInt() != zzazw) {
                            zzpmVar2.zzbj(4);
                            while (zzpmVar2.zziv() > 0) {
                                if (zzpmVar2.readInt() == zzazw) {
                                }
                            }
                            z2 = false;
                            this.zzazy = z2;
                        }
                        z2 = true;
                        this.zzazy = z2;
                    } else if (!this.zzaxq.isEmpty()) {
                        this.zzaxq.peek().zza(new zzkx(this.zzaxt, this.zzaxw));
                    }
                } else if (j4 < 262144) {
                    zzjyVar.zzag((int) j4);
                } else {
                    zzkfVar.position = zzjyVar.getPosition() + j4;
                    z = true;
                    zzeb(position3);
                    if (!((z || this.zzaxs == 2) ? false : true)) {
                        return 1;
                    }
                }
                z = false;
                zzeb(position3);
                if (!((z || this.zzaxs == 2) ? false : true)) {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzke
    public final long getDurationUs() {
        return this.zzaim;
    }

    @Override // com.google.android.gms.internal.ads.zzke
    public final long zzdz(long j) {
        long j2 = Long.MAX_VALUE;
        for (zzlp zzlpVar : this.zzazx) {
            zzls zzlsVar = zzlpVar.zzbaa;
            int zzec = zzlsVar.zzec(j);
            if (zzec == -1) {
                zzec = zzlsVar.zzed(j);
            }
            long j3 = zzlsVar.zzaos[zzec];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    private final void zzhb() {
        this.zzaxs = 0;
        this.zzaxv = 0;
    }

    private final void zzeb(long j) throws zzhv {
        zzmg zzmgVar;
        zzkd zzkdVar;
        zzlr zza;
        while (!this.zzaxq.isEmpty() && this.zzaxq.peek().zzasr == j) {
            zzku pop = this.zzaxq.pop();
            if (pop.type == zzkv.zzatv) {
                long j2 = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                long j3 = Long.MAX_VALUE;
                zzmg zzmgVar2 = null;
                zzkd zzkdVar2 = new zzkd();
                zzkx zzap = pop.zzap(zzkv.zzavu);
                if (zzap != null && (zzmgVar2 = zzkw.zza(zzap, this.zzazy)) != null) {
                    zzkdVar2.zzb(zzmgVar2);
                }
                int i = 0;
                while (i < pop.zzast.size()) {
                    zzku zzkuVar = pop.zzast.get(i);
                    if (zzkuVar.type == zzkv.zzatx && (zza = zzkw.zza(zzkuVar, pop.zzap(zzkv.zzatw), -9223372036854775807L, (zzjn) null, this.zzazy)) != null) {
                        zzls zza2 = zzkw.zza(zza, zzkuVar.zzaq(zzkv.zzaty).zzaq(zzkv.zzatz).zzaq(zzkv.zzaua), zzkdVar2);
                        if (zza2.zzawz != 0) {
                            zzlp zzlpVar = new zzlp(zza, zza2, this.zzarh.zzc(i, zza.type));
                            zzhs zzv = zza.zzahw.zzv(zza2.zzayg + 30);
                            if (zza.type == 1) {
                                if (zzkdVar2.zzgt()) {
                                    zzv = zzv.zzb(zzkdVar2.zzaho, zzkdVar2.zzahp);
                                }
                                if (zzmgVar2 != null) {
                                    zzv = zzv.zza(zzmgVar2);
                                }
                            }
                            zzlpVar.zzbab.zze(zzv);
                            zzmgVar = zzmgVar2;
                            zzkdVar = zzkdVar2;
                            j2 = Math.max(j2, zza.zzaim);
                            arrayList.add(zzlpVar);
                            long j4 = zza2.zzaos[0];
                            if (j4 < j3) {
                                j3 = j4;
                            }
                            i++;
                            zzkdVar2 = zzkdVar;
                            zzmgVar2 = zzmgVar;
                        }
                    }
                    zzmgVar = zzmgVar2;
                    zzkdVar = zzkdVar2;
                    i++;
                    zzkdVar2 = zzkdVar;
                    zzmgVar2 = zzmgVar;
                }
                this.zzaim = j2;
                this.zzazx = (zzlp[]) arrayList.toArray(new zzlp[arrayList.size()]);
                this.zzarh.zzgs();
                this.zzarh.zza(this);
                this.zzaxq.clear();
                this.zzaxs = 2;
            } else if (!this.zzaxq.isEmpty()) {
                this.zzaxq.peek().zza(pop);
            }
        }
        if (this.zzaxs != 2) {
            zzhb();
        }
    }
}
