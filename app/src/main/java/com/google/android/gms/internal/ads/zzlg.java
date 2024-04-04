package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.appcompat.widget.ActivityChooserView;
import com.google.android.gms.internal.ads.zzjn;
import com.sncompany.newtower.GameRenderer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzlg implements zzjz {
    private static final zzka zzaph = new zzlj();
    private static final int zzaxg = zzps.zzbh("seig");
    private static final byte[] zzaxh = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private final int flags;
    private long zzaim;
    private final zzpm zzapo;
    private int zzard;
    private int zzare;
    private zzkb zzarh;
    private final zzlr zzaxi;
    private final SparseArray<zzll> zzaxj;
    private final zzpm zzaxk;
    private final zzpm zzaxl;
    private final zzpm zzaxm;
    private final zzpq zzaxn;
    private final zzpm zzaxo;
    private final byte[] zzaxp;
    private final Stack<zzku> zzaxq;
    private final LinkedList<zzli> zzaxr;
    private int zzaxs;
    private int zzaxt;
    private long zzaxu;
    private int zzaxv;
    private zzpm zzaxw;
    private long zzaxx;
    private int zzaxy;
    private long zzaxz;
    private zzll zzaya;
    private int zzayb;
    private boolean zzayc;
    private zzkg zzayd;
    private zzkg[] zzaye;
    private boolean zzayf;

    public zzlg() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final void release() {
    }

    private zzlg(int i) {
        this(0, null);
    }

    private zzlg(int i, zzpq zzpqVar) {
        this(0, null, null);
    }

    private zzlg(int i, zzpq zzpqVar, zzlr zzlrVar) {
        this.flags = 0;
        this.zzaxn = null;
        this.zzaxi = null;
        this.zzaxo = new zzpm(16);
        this.zzapo = new zzpm(zzpl.zzbjq);
        this.zzaxk = new zzpm(5);
        this.zzaxl = new zzpm();
        this.zzaxm = new zzpm(1);
        this.zzaxp = new byte[16];
        this.zzaxq = new Stack<>();
        this.zzaxr = new LinkedList<>();
        this.zzaxj = new SparseArray<>();
        this.zzaim = -9223372036854775807L;
        this.zzaxz = -9223372036854775807L;
        zzhb();
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final boolean zza(zzjy zzjyVar) throws IOException, InterruptedException {
        return zzlo.zzd(zzjyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final void zza(zzkb zzkbVar) {
        this.zzarh = zzkbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final void zzc(long j, long j2) {
        int size = this.zzaxj.size();
        for (int i = 0; i < size; i++) {
            this.zzaxj.valueAt(i).reset();
        }
        this.zzaxr.clear();
        this.zzaxy = 0;
        this.zzaxq.clear();
        zzhb();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0004 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzjz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzjy zzjyVar, zzkf zzkfVar) throws IOException, InterruptedException {
        zzlq zzlqVar;
        zzkj zzkjVar;
        int i;
        boolean z;
        zzkj zzkjVar2;
        int zza;
        zzlq zzlqVar2;
        int i2;
        long zzjb;
        long zzjb2;
        boolean z2;
        zzjy zzjyVar2 = zzjyVar;
        while (true) {
            int i3 = this.zzaxs;
            int i4 = 1;
            int i5 = 0;
            if (i3 != 0) {
                int i6 = 4;
                if (i3 != 1) {
                    long j = Long.MAX_VALUE;
                    if (i3 == 2) {
                        int size = this.zzaxj.size();
                        zzll zzllVar = null;
                        for (int i7 = 0; i7 < size; i7++) {
                            zzlt zzltVar = this.zzaxj.valueAt(i7).zzazo;
                            if (zzltVar.zzbbb && zzltVar.zzbao < j) {
                                j = zzltVar.zzbao;
                                zzllVar = this.zzaxj.valueAt(i7);
                            }
                        }
                        if (zzllVar == null) {
                            this.zzaxs = 3;
                        } else {
                            int position = (int) (j - zzjyVar.getPosition());
                            if (position < 0) {
                                throw new zzhv("Offset to encryption data was negative.");
                            }
                            zzjyVar2.zzag(position);
                            zzlt zzltVar2 = zzllVar.zzazo;
                            zzjyVar2.readFully(zzltVar2.zzbba.data, 0, zzltVar2.zzbaz);
                            zzltVar2.zzbba.zzbi(0);
                            zzltVar2.zzbbb = false;
                        }
                    } else {
                        if (i3 == 3) {
                            if (this.zzaya == null) {
                                SparseArray<zzll> sparseArray = this.zzaxj;
                                int size2 = sparseArray.size();
                                zzll zzllVar2 = null;
                                for (int i8 = 0; i8 < size2; i8++) {
                                    zzll valueAt = sparseArray.valueAt(i8);
                                    if (valueAt.zzazt != valueAt.zzazo.zzbap) {
                                        long j2 = valueAt.zzazo.zzbaq[valueAt.zzazt];
                                        if (j2 < j) {
                                            zzllVar2 = valueAt;
                                            j = j2;
                                        }
                                    }
                                }
                                if (zzllVar2 == null) {
                                    int position2 = (int) (this.zzaxx - zzjyVar.getPosition());
                                    if (position2 < 0) {
                                        throw new zzhv("Offset to end of mdat was negative.");
                                    }
                                    zzjyVar2.zzag(position2);
                                    zzhb();
                                    i = 0;
                                    z = false;
                                    if (!z) {
                                        return i;
                                    }
                                } else {
                                    int position3 = (int) (zzllVar2.zzazo.zzbaq[zzllVar2.zzazt] - zzjyVar.getPosition());
                                    if (position3 < 0) {
                                        Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                        position3 = 0;
                                    }
                                    zzjyVar2.zzag(position3);
                                    this.zzaya = zzllVar2;
                                }
                            }
                            this.zzayb = this.zzaya.zzazo.zzbas[this.zzaya.zzazr];
                            if (this.zzaya.zzazo.zzbaw) {
                                zzll zzllVar3 = this.zzaya;
                                zzlt zzltVar3 = zzllVar3.zzazo;
                                zzpm zzpmVar = zzltVar3.zzbba;
                                int i9 = zzltVar3.zzbal.zzaxf;
                                if (zzltVar3.zzbay != null) {
                                    zzlqVar2 = zzltVar3.zzbay;
                                } else {
                                    zzlqVar2 = zzllVar3.zzazp.zzbah[i9];
                                }
                                int i10 = zzlqVar2.zzbad;
                                boolean z3 = zzltVar3.zzbax[zzllVar3.zzazr];
                                this.zzaxm.data[0] = (byte) ((z3 ? 128 : 0) | i10);
                                this.zzaxm.zzbi(0);
                                zzkg zzkgVar = zzllVar3.zzasm;
                                zzkgVar.zza(this.zzaxm, 1);
                                zzkgVar.zza(zzpmVar, i10);
                                if (z3) {
                                    int readUnsignedShort = zzpmVar.readUnsignedShort();
                                    zzpmVar.zzbj(-2);
                                    int i11 = (readUnsignedShort * 6) + 2;
                                    zzkgVar.zza(zzpmVar, i11);
                                    i2 = i10 + 1 + i11;
                                } else {
                                    i2 = i10 + 1;
                                }
                                this.zzare = i2;
                                this.zzayb += i2;
                            } else {
                                this.zzare = 0;
                            }
                            if (this.zzaya.zzazp.zzbag == 1) {
                                this.zzayb -= 8;
                                zzjyVar2.zzag(8);
                            }
                            this.zzaxs = 4;
                            this.zzard = 0;
                        }
                        zzlt zzltVar4 = this.zzaya.zzazo;
                        zzlr zzlrVar = this.zzaya.zzazp;
                        zzkg zzkgVar2 = this.zzaya.zzasm;
                        int i12 = this.zzaya.zzazr;
                        if (zzlrVar.zzasn == 0) {
                            while (true) {
                                int i13 = this.zzare;
                                int i14 = this.zzayb;
                                if (i13 >= i14) {
                                    break;
                                }
                                this.zzare += zzkgVar2.zza(zzjyVar2, i14 - i13, false);
                            }
                        } else {
                            byte[] bArr = this.zzaxk.data;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i15 = zzlrVar.zzasn + 1;
                            int i16 = 4 - zzlrVar.zzasn;
                            while (this.zzare < this.zzayb) {
                                int i17 = this.zzard;
                                if (i17 == 0) {
                                    zzjyVar2.readFully(bArr, i16, i15);
                                    this.zzaxk.zzbi(i5);
                                    this.zzard = this.zzaxk.zzja() - i4;
                                    this.zzapo.zzbi(i5);
                                    zzkgVar2.zza(this.zzapo, i6);
                                    zzkgVar2.zza(this.zzaxk, i4);
                                    this.zzayc = this.zzaye != null && zzpl.zza(zzlrVar.zzahw.zzahb, bArr[i6]);
                                    this.zzare += 5;
                                    this.zzayb += i16;
                                } else {
                                    if (this.zzayc) {
                                        this.zzaxl.reset(i17);
                                        zzjyVar2.readFully(this.zzaxl.data, i5, this.zzard);
                                        zzkgVar2.zza(this.zzaxl, this.zzard);
                                        zza = this.zzard;
                                        int zzb = zzpl.zzb(this.zzaxl.data, this.zzaxl.limit());
                                        this.zzaxl.zzbi("video/hevc".equals(zzlrVar.zzahw.zzahb) ? 1 : 0);
                                        this.zzaxl.zzbh(zzb);
                                        zznv.zza(zzltVar4.zzav(i12) * 1000, this.zzaxl, this.zzaye);
                                    } else {
                                        zza = zzkgVar2.zza(zzjyVar2, i17, false);
                                    }
                                    this.zzare += zza;
                                    this.zzard -= zza;
                                    i4 = 1;
                                    i5 = 0;
                                    i6 = 4;
                                }
                            }
                        }
                        long zzav = zzltVar4.zzav(i12) * 1000;
                        int i18 = (zzltVar4.zzbaw ? 1073741824 : 0) | (zzltVar4.zzbav[i12] ? 1 : 0);
                        if (zzltVar4.zzbaw) {
                            if (zzltVar4.zzbay != null) {
                                zzlqVar = zzltVar4.zzbay;
                            } else {
                                zzlqVar = zzlrVar.zzbah[zzltVar4.zzbal.zzaxf];
                            }
                            if (zzlqVar != this.zzaya.zzazv) {
                                zzkjVar2 = new zzkj(1, zzlqVar.zzbae);
                            } else {
                                zzkjVar2 = this.zzaya.zzazu;
                            }
                            zzkjVar = zzkjVar2;
                        } else {
                            zzlqVar = null;
                            zzkjVar = null;
                        }
                        this.zzaya.zzazu = zzkjVar;
                        this.zzaya.zzazv = zzlqVar;
                        zzkgVar2.zza(zzav, i18, this.zzayb, 0, zzkjVar);
                        while (!this.zzaxr.isEmpty()) {
                            zzli removeFirst = this.zzaxr.removeFirst();
                            this.zzaxy -= removeFirst.size;
                            this.zzayd.zza(zzav + removeFirst.zzayj, 1, removeFirst.size, this.zzaxy, null);
                        }
                        this.zzaya.zzazr++;
                        this.zzaya.zzazs++;
                        if (this.zzaya.zzazs == zzltVar4.zzbar[this.zzaya.zzazt]) {
                            this.zzaya.zzazt++;
                            i = 0;
                            this.zzaya.zzazs = 0;
                            this.zzaya = null;
                        } else {
                            i = 0;
                        }
                        this.zzaxs = 3;
                        z = true;
                        if (!z) {
                        }
                    }
                } else {
                    int i19 = ((int) this.zzaxu) - this.zzaxv;
                    zzpm zzpmVar2 = this.zzaxw;
                    if (zzpmVar2 != null) {
                        zzjyVar2.readFully(zzpmVar2.data, 8, i19);
                        zzkx zzkxVar = new zzkx(this.zzaxt, this.zzaxw);
                        long position4 = zzjyVar.getPosition();
                        if (!this.zzaxq.isEmpty()) {
                            this.zzaxq.peek().zza(zzkxVar);
                        } else {
                            if (zzkxVar.type == zzkv.zzatu) {
                                zzpm zzpmVar3 = zzkxVar.zzawq;
                                zzpmVar3.zzbi(8);
                                int zzar = zzkv.zzar(zzpmVar3.readInt());
                                zzpmVar3.zzbj(4);
                                long zzix = zzpmVar3.zzix();
                                if (zzar == 0) {
                                    zzjb = zzpmVar3.zzix();
                                    zzjb2 = zzpmVar3.zzix();
                                } else {
                                    zzjb = zzpmVar3.zzjb();
                                    zzjb2 = zzpmVar3.zzjb();
                                }
                                long j3 = position4 + zzjb2;
                                long zza2 = zzps.zza(zzjb, 1000000L, zzix);
                                zzpmVar3.zzbj(2);
                                int readUnsignedShort2 = zzpmVar3.readUnsignedShort();
                                int[] iArr = new int[readUnsignedShort2];
                                long[] jArr = new long[readUnsignedShort2];
                                long[] jArr2 = new long[readUnsignedShort2];
                                long[] jArr3 = new long[readUnsignedShort2];
                                long j4 = zza2;
                                int i20 = 0;
                                while (i20 < readUnsignedShort2) {
                                    int readInt = zzpmVar3.readInt();
                                    if ((readInt & Integer.MIN_VALUE) != 0) {
                                        throw new zzhv("Unhandled indirect reference");
                                    }
                                    long zzix2 = zzpmVar3.zzix();
                                    iArr[i20] = readInt & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                                    jArr[i20] = j3;
                                    jArr3[i20] = j4;
                                    long j5 = zzjb + zzix2;
                                    int i21 = i20;
                                    int i22 = readUnsignedShort2;
                                    long[] jArr4 = jArr2;
                                    long[] jArr5 = jArr3;
                                    j4 = zzps.zza(j5, 1000000L, zzix);
                                    jArr4[i21] = j4 - jArr5[i21];
                                    zzpmVar3.zzbj(4);
                                    j3 += r5[i21];
                                    jArr = jArr;
                                    jArr2 = jArr4;
                                    jArr3 = jArr5;
                                    iArr = iArr;
                                    i20 = i21 + 1;
                                    zzjb = j5;
                                    readUnsignedShort2 = i22;
                                }
                                Pair create = Pair.create(Long.valueOf(zza2), new zzjx(iArr, jArr, jArr2, jArr3));
                                this.zzaxz = ((Long) create.first).longValue();
                                this.zzarh.zza((zzke) create.second);
                                this.zzayf = true;
                            } else if (zzkxVar.type == zzkv.zzawa) {
                                zzpm zzpmVar4 = zzkxVar.zzawq;
                                if (this.zzayd != null) {
                                    zzpmVar4.zzbi(12);
                                    zzpmVar4.zzjc();
                                    zzpmVar4.zzjc();
                                    long zza3 = zzps.zza(zzpmVar4.zzix(), 1000000L, zzpmVar4.zzix());
                                    zzpmVar4.zzbi(12);
                                    int zziv = zzpmVar4.zziv();
                                    this.zzayd.zza(zzpmVar4, zziv);
                                    long j6 = this.zzaxz;
                                    if (j6 != -9223372036854775807L) {
                                        this.zzayd.zza(j6 + zza3, 1, zziv, 0, null);
                                    } else {
                                        this.zzaxr.addLast(new zzli(zza3, zziv));
                                        this.zzaxy += zziv;
                                    }
                                }
                            }
                            zzjyVar2 = zzjyVar;
                        }
                    } else {
                        zzjyVar2.zzag(i19);
                    }
                    zzeb(zzjyVar.getPosition());
                }
            } else {
                if (this.zzaxv == 0) {
                    z2 = false;
                    if (zzjyVar2.zza(this.zzaxo.data, 0, 8, true)) {
                        this.zzaxv = 8;
                        this.zzaxo.zzbi(0);
                        this.zzaxu = this.zzaxo.zzix();
                        this.zzaxt = this.zzaxo.readInt();
                    }
                    if (!z2) {
                        return -1;
                    }
                }
                if (this.zzaxu == 1) {
                    zzjyVar2.readFully(this.zzaxo.data, 8, 8);
                    this.zzaxv += 8;
                    this.zzaxu = this.zzaxo.zzjb();
                }
                if (this.zzaxu < this.zzaxv) {
                    throw new zzhv("Atom size less than header length (unsupported).");
                }
                long position5 = zzjyVar.getPosition() - this.zzaxv;
                if (this.zzaxt == zzkv.zzaue) {
                    int size3 = this.zzaxj.size();
                    for (int i23 = 0; i23 < size3; i23++) {
                        zzlt zzltVar5 = this.zzaxj.valueAt(i23).zzazo;
                        zzltVar5.zzbam = position5;
                        zzltVar5.zzbao = position5;
                        zzltVar5.zzban = position5;
                    }
                }
                if (this.zzaxt == zzkv.zzatb) {
                    this.zzaya = null;
                    this.zzaxx = position5 + this.zzaxu;
                    if (!this.zzayf) {
                        this.zzarh.zza(new zzkh(this.zzaim));
                        this.zzayf = true;
                    }
                    this.zzaxs = 2;
                } else {
                    int i24 = this.zzaxt;
                    if (i24 == zzkv.zzatv || i24 == zzkv.zzatx || i24 == zzkv.zzaty || i24 == zzkv.zzatz || i24 == zzkv.zzaua || i24 == zzkv.zzaue || i24 == zzkv.zzauf || i24 == zzkv.zzaug || i24 == zzkv.zzauj) {
                        long position6 = (zzjyVar.getPosition() + this.zzaxu) - 8;
                        this.zzaxq.add(new zzku(this.zzaxt, position6));
                        if (this.zzaxu == this.zzaxv) {
                            zzeb(position6);
                        } else {
                            zzhb();
                        }
                    } else {
                        int i25 = this.zzaxt;
                        if (i25 == zzkv.zzaum || i25 == zzkv.zzaul || i25 == zzkv.zzatw || i25 == zzkv.zzatu || i25 == zzkv.zzaun || i25 == zzkv.zzatq || i25 == zzkv.zzatr || i25 == zzkv.zzaui || i25 == zzkv.zzats || i25 == zzkv.zzatt || i25 == zzkv.zzauo || i25 == zzkv.zzauw || i25 == zzkv.zzaux || i25 == zzkv.zzavb || i25 == zzkv.zzava || i25 == zzkv.zzauy || i25 == zzkv.zzauz || i25 == zzkv.zzauk || i25 == zzkv.zzauh || i25 == zzkv.zzawa) {
                            if (this.zzaxv != 8) {
                                throw new zzhv("Leaf atom defines extended atom size (unsupported).");
                            }
                            if (this.zzaxu > 2147483647L) {
                                throw new zzhv("Leaf atom with length > 2147483647 (unsupported).");
                            }
                            this.zzaxw = new zzpm((int) this.zzaxu);
                            System.arraycopy(this.zzaxo.data, 0, this.zzaxw.data, 0, 8);
                            this.zzaxs = 1;
                        } else {
                            if (this.zzaxu > 2147483647L) {
                                throw new zzhv("Skipping atom with length > 2147483647 (unsupported).");
                            }
                            this.zzaxw = null;
                            this.zzaxs = 1;
                        }
                        z2 = true;
                        if (!z2) {
                        }
                    }
                }
                z2 = true;
                if (!z2) {
                }
            }
        }
    }

    private final void zzhb() {
        this.zzaxs = 0;
        this.zzaxv = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzeb(long j) throws zzhv {
        SparseArray sparseArray;
        zzlg zzlgVar;
        zzku zzkuVar;
        SparseArray<zzll> sparseArray2;
        int i;
        int i2;
        int i3;
        byte[] bArr;
        zzlt zzltVar;
        int size;
        int i4;
        byte[] bArr2;
        int i5;
        int i6;
        zzku zzkuVar2;
        int i7;
        int i8;
        zzlt zzltVar2;
        byte[] bArr3;
        int i9;
        zzku zzkuVar3;
        zzll zzllVar;
        List<zzkx> list;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z;
        int i15;
        boolean z2;
        int i16;
        boolean z3;
        int i17;
        boolean z4;
        boolean z5;
        zzlg zzlgVar2 = this;
        while (!zzlgVar2.zzaxq.isEmpty() && zzlgVar2.zzaxq.peek().zzasr == j) {
            zzku pop = zzlgVar2.zzaxq.pop();
            zzll zzllVar2 = null;
            int i18 = 12;
            int i19 = 1;
            if (pop.type == zzkv.zzatv) {
                zzpf.checkState(true, "Unexpected moov box.");
                zzjn zzb = zzb(pop.zzass);
                zzku zzaq = pop.zzaq(zzkv.zzaug);
                SparseArray sparseArray3 = new SparseArray();
                int size2 = zzaq.zzass.size();
                long j2 = -9223372036854775807L;
                int i20 = 0;
                while (i20 < size2) {
                    zzkx zzkxVar = zzaq.zzass.get(i20);
                    if (zzkxVar.type == zzkv.zzats) {
                        zzpm zzpmVar = zzkxVar.zzawq;
                        zzpmVar.zzbi(i18);
                        Pair create = Pair.create(Integer.valueOf(zzpmVar.readInt()), new zzlf(zzpmVar.zzja() - i19, zzpmVar.zzja(), zzpmVar.zzja(), zzpmVar.readInt()));
                        sparseArray3.put(((Integer) create.first).intValue(), (zzlf) create.second);
                    } else if (zzkxVar.type == zzkv.zzauh) {
                        zzpm zzpmVar2 = zzkxVar.zzawq;
                        zzpmVar2.zzbi(8);
                        j2 = zzkv.zzar(zzpmVar2.readInt()) == 0 ? zzpmVar2.zzix() : zzpmVar2.zzjb();
                    }
                    i20++;
                    i18 = 12;
                    i19 = 1;
                }
                SparseArray sparseArray4 = new SparseArray();
                int size3 = pop.zzast.size();
                int i21 = 0;
                while (i21 < size3) {
                    zzku zzkuVar4 = pop.zzast.get(i21);
                    if (zzkuVar4.type == zzkv.zzatx) {
                        sparseArray = sparseArray3;
                        zzlr zza = zzkw.zza(zzkuVar4, pop.zzap(zzkv.zzatw), j2, zzb, false);
                        if (zza != null) {
                            sparseArray4.put(zza.id, zza);
                        }
                    } else {
                        sparseArray = sparseArray3;
                    }
                    i21++;
                    sparseArray3 = sparseArray;
                }
                SparseArray sparseArray5 = sparseArray3;
                int size4 = sparseArray4.size();
                if (zzlgVar2.zzaxj.size() == 0) {
                    for (int i22 = 0; i22 < size4; i22++) {
                        zzlr zzlrVar = (zzlr) sparseArray4.valueAt(i22);
                        zzll zzllVar3 = new zzll(zzlgVar2.zzarh.zzc(i22, zzlrVar.type));
                        zzllVar3.zza(zzlrVar, (zzlf) sparseArray5.get(zzlrVar.id));
                        zzlgVar2.zzaxj.put(zzlrVar.id, zzllVar3);
                        zzlgVar2.zzaim = Math.max(zzlgVar2.zzaim, zzlrVar.zzaim);
                    }
                    if ((zzlgVar2.flags & 4) != 0 && zzlgVar2.zzayd == null) {
                        zzkg zzc = zzlgVar2.zzarh.zzc(zzlgVar2.zzaxj.size(), 4);
                        zzlgVar2.zzayd = zzc;
                        zzc.zze(zzhs.zza((String) null, "application/x-emsg", Long.MAX_VALUE));
                    }
                    if ((zzlgVar2.flags & 8) != 0 && zzlgVar2.zzaye == null) {
                        zzkg zzc2 = zzlgVar2.zzarh.zzc(zzlgVar2.zzaxj.size() + 1, 3);
                        zzc2.zze(zzhs.zza((String) null, "application/cea-608", (String) null, -1, 0, (String) null, (zzjn) null));
                        zzlgVar2.zzaye = new zzkg[]{zzc2};
                    }
                    zzlgVar2.zzarh.zzgs();
                } else {
                    zzpf.checkState(zzlgVar2.zzaxj.size() == size4);
                    for (int i23 = 0; i23 < size4; i23++) {
                        zzlr zzlrVar2 = (zzlr) sparseArray4.valueAt(i23);
                        zzlgVar2.zzaxj.get(zzlrVar2.id).zza(zzlrVar2, (zzlf) sparseArray5.get(zzlrVar2.id));
                    }
                }
            } else {
                if (pop.type == zzkv.zzaue) {
                    SparseArray<zzll> sparseArray6 = zzlgVar2.zzaxj;
                    int i24 = zzlgVar2.flags;
                    byte[] bArr4 = zzlgVar2.zzaxp;
                    int size5 = pop.zzast.size();
                    int i25 = 0;
                    while (i25 < size5) {
                        zzku zzkuVar5 = pop.zzast.get(i25);
                        if (zzkuVar5.type == zzkv.zzauf) {
                            zzpm zzpmVar3 = zzkuVar5.zzap(zzkv.zzatr).zzawq;
                            zzpmVar3.zzbi(8);
                            int zzas = zzkv.zzas(zzpmVar3.readInt());
                            int readInt = zzpmVar3.readInt();
                            if ((i24 & 16) != 0) {
                                readInt = 0;
                            }
                            zzll zzllVar4 = sparseArray6.get(readInt);
                            if (zzllVar4 == null) {
                                zzllVar4 = zzllVar2;
                            } else {
                                if ((zzas & 1) != 0) {
                                    long zzjb = zzpmVar3.zzjb();
                                    zzllVar4.zzazo.zzban = zzjb;
                                    zzllVar4.zzazo.zzbao = zzjb;
                                }
                                zzlf zzlfVar = zzllVar4.zzazq;
                                zzllVar4.zzazo.zzbal = new zzlf((zzas & 2) != 0 ? zzpmVar3.zzja() - 1 : zzlfVar.zzaxf, (zzas & 8) != 0 ? zzpmVar3.zzja() : zzlfVar.duration, (zzas & 16) != 0 ? zzpmVar3.zzja() : zzlfVar.size, (zzas & 32) != 0 ? zzpmVar3.zzja() : zzlfVar.flags);
                            }
                            if (zzllVar4 != null) {
                                zzlt zzltVar3 = zzllVar4.zzazo;
                                long j3 = zzltVar3.zzbbc;
                                zzllVar4.reset();
                                if (zzkuVar5.zzap(zzkv.zzatq) != null && (i24 & 2) == 0) {
                                    zzpm zzpmVar4 = zzkuVar5.zzap(zzkv.zzatq).zzawq;
                                    zzpmVar4.zzbi(8);
                                    j3 = zzkv.zzar(zzpmVar4.readInt()) == 1 ? zzpmVar4.zzjb() : zzpmVar4.zzix();
                                }
                                List<zzkx> list2 = zzkuVar5.zzass;
                                int size6 = list2.size();
                                sparseArray2 = sparseArray6;
                                int i26 = 0;
                                int i27 = 0;
                                int i28 = 0;
                                while (i28 < size6) {
                                    int i29 = size5;
                                    zzkx zzkxVar2 = list2.get(i28);
                                    long j4 = j3;
                                    if (zzkxVar2.type == zzkv.zzatt) {
                                        zzpm zzpmVar5 = zzkxVar2.zzawq;
                                        zzpmVar5.zzbi(12);
                                        int zzja = zzpmVar5.zzja();
                                        if (zzja > 0) {
                                            i26 += zzja;
                                            i27++;
                                        }
                                    }
                                    i28++;
                                    size5 = i29;
                                    j3 = j4;
                                }
                                i2 = size5;
                                long j5 = j3;
                                zzllVar4.zzazt = 0;
                                zzllVar4.zzazs = 0;
                                zzllVar4.zzazr = 0;
                                zzlt zzltVar4 = zzllVar4.zzazo;
                                zzltVar4.zzbap = i27;
                                zzltVar4.zzawz = i26;
                                if (zzltVar4.zzbar == null || zzltVar4.zzbar.length < i27) {
                                    zzltVar4.zzbaq = new long[i27];
                                    zzltVar4.zzbar = new int[i27];
                                }
                                if (zzltVar4.zzbas == null || zzltVar4.zzbas.length < i26) {
                                    int i30 = (i26 * GameRenderer.GAME_SHOP_SHOP_INVENTORY_START_X) / 100;
                                    zzltVar4.zzbas = new int[i30];
                                    zzltVar4.zzbat = new int[i30];
                                    zzltVar4.zzbau = new long[i30];
                                    zzltVar4.zzbav = new boolean[i30];
                                    zzltVar4.zzbax = new boolean[i30];
                                }
                                int i31 = 0;
                                int i32 = 0;
                                int i33 = 0;
                                while (true) {
                                    long j6 = 0;
                                    if (i31 >= size6) {
                                        break;
                                    }
                                    zzkx zzkxVar3 = list2.get(i31);
                                    if (zzkxVar3.type == zzkv.zzatt) {
                                        int i34 = i32 + 1;
                                        zzpm zzpmVar6 = zzkxVar3.zzawq;
                                        zzpmVar6.zzbi(8);
                                        int zzas2 = zzkv.zzas(zzpmVar6.readInt());
                                        zzlr zzlrVar3 = zzllVar4.zzazp;
                                        list = list2;
                                        zzlt zzltVar5 = zzllVar4.zzazo;
                                        i10 = size6;
                                        zzlf zzlfVar2 = zzltVar5.zzbal;
                                        zzltVar5.zzbar[i32] = zzpmVar6.zzja();
                                        zzltVar2 = zzltVar3;
                                        bArr3 = bArr4;
                                        zzltVar5.zzbaq[i32] = zzltVar5.zzban;
                                        if ((zzas2 & 1) != 0) {
                                            long[] jArr = zzltVar5.zzbaq;
                                            zzkuVar2 = pop;
                                            i9 = i25;
                                            zzkuVar3 = zzkuVar5;
                                            jArr[i32] = jArr[i32] + zzpmVar6.readInt();
                                        } else {
                                            zzkuVar2 = pop;
                                            i9 = i25;
                                            zzkuVar3 = zzkuVar5;
                                        }
                                        boolean z6 = (zzas2 & 4) != 0;
                                        int i35 = zzlfVar2.flags;
                                        if (z6) {
                                            i35 = zzpmVar6.zzja();
                                        }
                                        boolean z7 = (zzas2 & 256) != 0;
                                        boolean z8 = (zzas2 & 512) != 0;
                                        boolean z9 = (zzas2 & 1024) != 0;
                                        boolean z10 = (zzas2 & 2048) != 0;
                                        if (zzlrVar3.zzbai != null) {
                                            i11 = i35;
                                            if (zzlrVar3.zzbai.length == 1 && zzlrVar3.zzbai[0] == 0) {
                                                i12 = i31;
                                                j6 = zzps.zza(zzlrVar3.zzbaj[0], 1000L, zzlrVar3.zzdd);
                                                int[] iArr = zzltVar5.zzbas;
                                                int[] iArr2 = zzltVar5.zzbat;
                                                zzllVar = zzllVar4;
                                                long[] jArr2 = zzltVar5.zzbau;
                                                i7 = i12;
                                                boolean[] zArr = zzltVar5.zzbav;
                                                boolean z11 = (zzlrVar3.type == 2 || (i24 & 1) == 0) ? false : true;
                                                i13 = zzltVar5.zzbar[i32] + i33;
                                                long j7 = zzlrVar3.zzdd;
                                                int i36 = i33;
                                                long j8 = i32 <= 0 ? zzltVar5.zzbbc : j5;
                                                i8 = i24;
                                                i14 = i36;
                                                while (i14 < i13) {
                                                    if (z7) {
                                                        z = z7;
                                                        i15 = zzpmVar6.zzja();
                                                    } else {
                                                        z = z7;
                                                        i15 = zzlfVar2.duration;
                                                    }
                                                    if (z8) {
                                                        z2 = z8;
                                                        i16 = zzpmVar6.zzja();
                                                    } else {
                                                        z2 = z8;
                                                        i16 = zzlfVar2.size;
                                                    }
                                                    if (i14 == 0 && z6) {
                                                        z3 = z6;
                                                        i17 = i11;
                                                    } else if (z9) {
                                                        z3 = z6;
                                                        i17 = zzpmVar6.readInt();
                                                    } else {
                                                        z3 = z6;
                                                        i17 = zzlfVar2.flags;
                                                    }
                                                    if (z10) {
                                                        z4 = z9;
                                                        z5 = z10;
                                                        iArr2[i14] = (int) ((zzpmVar6.readInt() * 1000) / j7);
                                                    } else {
                                                        z4 = z9;
                                                        z5 = z10;
                                                        iArr2[i14] = 0;
                                                    }
                                                    jArr2[i14] = zzps.zza(j8, 1000L, j7) - j6;
                                                    iArr[i14] = i16;
                                                    zArr[i14] = ((i17 >> 16) & 1) == 0 && (!z11 || i14 == 0);
                                                    j8 += i15;
                                                    i14++;
                                                    z7 = z;
                                                    z8 = z2;
                                                    z6 = z3;
                                                    z9 = z4;
                                                    z10 = z5;
                                                }
                                                zzltVar5.zzbbc = j8;
                                                i33 = i13;
                                                i32 = i34;
                                            }
                                        } else {
                                            i11 = i35;
                                        }
                                        i12 = i31;
                                        int[] iArr3 = zzltVar5.zzbas;
                                        int[] iArr22 = zzltVar5.zzbat;
                                        zzllVar = zzllVar4;
                                        long[] jArr22 = zzltVar5.zzbau;
                                        i7 = i12;
                                        boolean[] zArr2 = zzltVar5.zzbav;
                                        if (zzlrVar3.type == 2) {
                                        }
                                        i13 = zzltVar5.zzbar[i32] + i33;
                                        long j72 = zzlrVar3.zzdd;
                                        int i362 = i33;
                                        if (i32 <= 0) {
                                        }
                                        i8 = i24;
                                        i14 = i362;
                                        while (i14 < i13) {
                                        }
                                        zzltVar5.zzbbc = j8;
                                        i33 = i13;
                                        i32 = i34;
                                    } else {
                                        zzkuVar2 = pop;
                                        i7 = i31;
                                        i8 = i24;
                                        zzltVar2 = zzltVar3;
                                        bArr3 = bArr4;
                                        i9 = i25;
                                        zzkuVar3 = zzkuVar5;
                                        zzllVar = zzllVar4;
                                        list = list2;
                                        i10 = size6;
                                    }
                                    i31 = i7 + 1;
                                    list2 = list;
                                    size6 = i10;
                                    bArr4 = bArr3;
                                    zzltVar3 = zzltVar2;
                                    pop = zzkuVar2;
                                    i25 = i9;
                                    zzkuVar5 = zzkuVar3;
                                    zzllVar4 = zzllVar;
                                    i24 = i8;
                                }
                                zzkuVar = pop;
                                i = i24;
                                zzlt zzltVar6 = zzltVar3;
                                byte[] bArr5 = bArr4;
                                i3 = i25;
                                zzll zzllVar5 = zzllVar4;
                                zzkx zzap = zzkuVar5.zzap(zzkv.zzauw);
                                if (zzap != null) {
                                    zzltVar = zzltVar6;
                                    zzlq zzlqVar = zzllVar5.zzazp.zzbah[zzltVar.zzbal.zzaxf];
                                    zzpm zzpmVar7 = zzap.zzawq;
                                    int i37 = zzlqVar.zzbad;
                                    zzpmVar7.zzbi(8);
                                    if ((zzkv.zzas(zzpmVar7.readInt()) & 1) == 1) {
                                        zzpmVar7.zzbj(8);
                                    }
                                    int readUnsignedByte = zzpmVar7.readUnsignedByte();
                                    int zzja2 = zzpmVar7.zzja();
                                    if (zzja2 != zzltVar.zzawz) {
                                        int i38 = zzltVar.zzawz;
                                        StringBuilder sb = new StringBuilder(41);
                                        sb.append("Length mismatch: ");
                                        sb.append(zzja2);
                                        sb.append(", ");
                                        sb.append(i38);
                                        throw new zzhv(sb.toString());
                                    }
                                    if (readUnsignedByte == 0) {
                                        boolean[] zArr3 = zzltVar.zzbax;
                                        i6 = 0;
                                        for (int i39 = 0; i39 < zzja2; i39++) {
                                            int readUnsignedByte2 = zzpmVar7.readUnsignedByte();
                                            i6 += readUnsignedByte2;
                                            zArr3[i39] = readUnsignedByte2 > i37;
                                        }
                                    } else {
                                        i6 = (readUnsignedByte * zzja2) + 0;
                                        Arrays.fill(zzltVar.zzbax, 0, zzja2, readUnsignedByte > i37);
                                    }
                                    zzltVar.zzau(i6);
                                } else {
                                    zzltVar = zzltVar6;
                                }
                                zzkx zzap2 = zzkuVar5.zzap(zzkv.zzaux);
                                if (zzap2 != null) {
                                    zzpm zzpmVar8 = zzap2.zzawq;
                                    zzpmVar8.zzbi(8);
                                    int readInt2 = zzpmVar8.readInt();
                                    if ((zzkv.zzas(readInt2) & 1) == 1) {
                                        zzpmVar8.zzbj(8);
                                    }
                                    int zzja3 = zzpmVar8.zzja();
                                    if (zzja3 != 1) {
                                        StringBuilder sb2 = new StringBuilder(40);
                                        sb2.append("Unexpected saio entry count: ");
                                        sb2.append(zzja3);
                                        throw new zzhv(sb2.toString());
                                    }
                                    zzltVar.zzbao += zzkv.zzar(readInt2) == 0 ? zzpmVar8.zzix() : zzpmVar8.zzjb();
                                }
                                zzkx zzap3 = zzkuVar5.zzap(zzkv.zzavb);
                                if (zzap3 != null) {
                                    zza(zzap3.zzawq, 0, zzltVar);
                                }
                                zzkx zzap4 = zzkuVar5.zzap(zzkv.zzauy);
                                zzkx zzap5 = zzkuVar5.zzap(zzkv.zzauz);
                                if (zzap4 != null && zzap5 != null) {
                                    zzpm zzpmVar9 = zzap4.zzawq;
                                    zzpm zzpmVar10 = zzap5.zzawq;
                                    zzpmVar9.zzbi(8);
                                    int readInt3 = zzpmVar9.readInt();
                                    if (zzpmVar9.readInt() == zzaxg) {
                                        if (zzkv.zzar(readInt3) == 1) {
                                            zzpmVar9.zzbj(4);
                                        }
                                        if (zzpmVar9.readInt() != 1) {
                                            throw new zzhv("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        zzpmVar10.zzbi(8);
                                        int readInt4 = zzpmVar10.readInt();
                                        if (zzpmVar10.readInt() == zzaxg) {
                                            int zzar = zzkv.zzar(readInt4);
                                            if (zzar != 1) {
                                                i5 = 2;
                                                if (zzar >= 2) {
                                                    zzpmVar10.zzbj(4);
                                                }
                                            } else {
                                                if (zzpmVar10.zzix() == 0) {
                                                    throw new zzhv("Variable length decription in sgpd found (unsupported)");
                                                }
                                                i5 = 2;
                                            }
                                            if (zzpmVar10.zzix() != 1) {
                                                throw new zzhv("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            zzpmVar10.zzbj(i5);
                                            if (zzpmVar10.readUnsignedByte() == 1) {
                                                int readUnsignedByte3 = zzpmVar10.readUnsignedByte();
                                                byte[] bArr6 = new byte[16];
                                                zzpmVar10.zze(bArr6, 0, 16);
                                                zzltVar.zzbaw = true;
                                                zzltVar.zzbay = new zzlq(true, readUnsignedByte3, bArr6);
                                            }
                                        }
                                        size = zzkuVar5.zzass.size();
                                        i4 = 0;
                                        while (i4 < size) {
                                            zzkx zzkxVar4 = zzkuVar5.zzass.get(i4);
                                            if (zzkxVar4.type == zzkv.zzava) {
                                                zzpm zzpmVar11 = zzkxVar4.zzawq;
                                                zzpmVar11.zzbi(8);
                                                bArr2 = bArr5;
                                                zzpmVar11.zze(bArr2, 0, 16);
                                                if (Arrays.equals(bArr2, zzaxh)) {
                                                    zza(zzpmVar11, 16, zzltVar);
                                                }
                                            } else {
                                                bArr2 = bArr5;
                                            }
                                            i4++;
                                            bArr5 = bArr2;
                                        }
                                        bArr = bArr5;
                                        i25 = i3 + 1;
                                        bArr4 = bArr;
                                        sparseArray6 = sparseArray2;
                                        size5 = i2;
                                        pop = zzkuVar;
                                        i24 = i;
                                        zzllVar2 = null;
                                    }
                                }
                                size = zzkuVar5.zzass.size();
                                i4 = 0;
                                while (i4 < size) {
                                }
                                bArr = bArr5;
                                i25 = i3 + 1;
                                bArr4 = bArr;
                                sparseArray6 = sparseArray2;
                                size5 = i2;
                                pop = zzkuVar;
                                i24 = i;
                                zzllVar2 = null;
                            }
                        }
                        zzkuVar = pop;
                        sparseArray2 = sparseArray6;
                        i = i24;
                        i2 = size5;
                        i3 = i25;
                        bArr = bArr4;
                        i25 = i3 + 1;
                        bArr4 = bArr;
                        sparseArray6 = sparseArray2;
                        size5 = i2;
                        pop = zzkuVar;
                        i24 = i;
                        zzllVar2 = null;
                    }
                    zzjn zzb2 = zzb(pop.zzass);
                    zzlgVar = this;
                    if (zzb2 != null) {
                        int size7 = zzlgVar.zzaxj.size();
                        for (int i40 = 0; i40 < size7; i40++) {
                            zzll valueAt = zzlgVar.zzaxj.valueAt(i40);
                            valueAt.zzasm.zze(valueAt.zzazp.zzahw.zza(zzb2));
                        }
                    }
                } else {
                    zzlgVar = zzlgVar2;
                    if (!zzlgVar.zzaxq.isEmpty()) {
                        zzlgVar.zzaxq.peek().zza(pop);
                    }
                }
                zzlgVar2 = zzlgVar;
            }
        }
        zzhb();
    }

    private static void zza(zzpm zzpmVar, int i, zzlt zzltVar) throws zzhv {
        zzpmVar.zzbi(i + 8);
        int zzas = zzkv.zzas(zzpmVar.readInt());
        if ((zzas & 1) != 0) {
            throw new zzhv("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zzas & 2) != 0;
        int zzja = zzpmVar.zzja();
        if (zzja != zzltVar.zzawz) {
            int i2 = zzltVar.zzawz;
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(zzja);
            sb.append(", ");
            sb.append(i2);
            throw new zzhv(sb.toString());
        }
        Arrays.fill(zzltVar.zzbax, 0, zzja, z);
        zzltVar.zzau(zzpmVar.zziv());
        zzpmVar.zze(zzltVar.zzbba.data, 0, zzltVar.zzbaz);
        zzltVar.zzbba.zzbi(0);
        zzltVar.zzbbb = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzjn zzb(List<zzkx> list) {
        Pair create;
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zzkx zzkxVar = list.get(i);
            if (zzkxVar.type == zzkv.zzauo) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = zzkxVar.zzawq.data;
                zzpm zzpmVar = new zzpm(bArr);
                if (zzpmVar.limit() >= 32) {
                    zzpmVar.zzbi(0);
                    if (zzpmVar.readInt() == zzpmVar.zziv() + 4 && zzpmVar.readInt() == zzkv.zzauo) {
                        int zzar = zzkv.zzar(zzpmVar.readInt());
                        if (zzar > 1) {
                            StringBuilder sb = new StringBuilder(37);
                            sb.append("Unsupported pssh version: ");
                            sb.append(zzar);
                            Log.w("PsshAtomUtil", sb.toString());
                        } else {
                            UUID uuid2 = new UUID(zzpmVar.readLong(), zzpmVar.readLong());
                            if (zzar == 1) {
                                zzpmVar.zzbj(zzpmVar.zzja() << 4);
                            }
                            int zzja = zzpmVar.zzja();
                            if (zzja == zzpmVar.zziv()) {
                                byte[] bArr2 = new byte[zzja];
                                zzpmVar.zze(bArr2, 0, zzja);
                                create = Pair.create(uuid2, bArr2);
                                uuid = create != null ? null : (UUID) create.first;
                                if (uuid != null) {
                                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                } else {
                                    arrayList.add(new zzjn.zza(uuid, "video/mp4", bArr));
                                }
                            }
                        }
                    }
                }
                create = null;
                if (create != null) {
                }
                if (uuid != null) {
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzjn(arrayList);
    }
}
