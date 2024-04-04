package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zznf implements zzna, zznb {
    private zznt zzafd;
    private zzna zzbdv;
    public final zznb[] zzbfc;
    private final IdentityHashMap<zznm, Integer> zzbfd = new IdentityHashMap<>();
    private int zzbfe;
    private zznb[] zzbff;
    private zznp zzbfg;

    public zznf(zznb... zznbVarArr) {
        this.zzbfc = zznbVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final void zza(zzna zznaVar, long j) {
        this.zzbdv = zznaVar;
        zznb[] zznbVarArr = this.zzbfc;
        this.zzbfe = zznbVarArr.length;
        for (zznb zznbVar : zznbVarArr) {
            zznbVar.zza(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final void zzho() throws IOException {
        for (zznb zznbVar : this.zzbfc) {
            zznbVar.zzho();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final zznt zzhp() {
        return this.zzafd;
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final long zza(zzof[] zzofVarArr, boolean[] zArr, zznm[] zznmVarArr, boolean[] zArr2, long j) {
        zznm[] zznmVarArr2 = zznmVarArr;
        int[] iArr = new int[zzofVarArr.length];
        int[] iArr2 = new int[zzofVarArr.length];
        for (int i = 0; i < zzofVarArr.length; i++) {
            iArr[i] = zznmVarArr2[i] == null ? -1 : this.zzbfd.get(zznmVarArr2[i]).intValue();
            iArr2[i] = -1;
            if (zzofVarArr[i] != null) {
                zznq zzil = zzofVarArr[i].zzil();
                int i2 = 0;
                while (true) {
                    zznb[] zznbVarArr = this.zzbfc;
                    if (i2 >= zznbVarArr.length) {
                        break;
                    }
                    if (zznbVarArr[i2].zzhp().zza(zzil) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        this.zzbfd.clear();
        int length = zzofVarArr.length;
        zznm[] zznmVarArr3 = new zznm[length];
        zznm[] zznmVarArr4 = new zznm[zzofVarArr.length];
        zzof[] zzofVarArr2 = new zzof[zzofVarArr.length];
        ArrayList arrayList = new ArrayList(this.zzbfc.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zzbfc.length) {
            for (int i4 = 0; i4 < zzofVarArr.length; i4++) {
                zzof zzofVar = null;
                zznmVarArr4[i4] = iArr[i4] == i3 ? zznmVarArr2[i4] : null;
                if (iArr2[i4] == i3) {
                    zzofVar = zzofVarArr[i4];
                }
                zzofVarArr2[i4] = zzofVar;
            }
            int i5 = i3;
            zzof[] zzofVarArr3 = zzofVarArr2;
            ArrayList arrayList2 = arrayList;
            long zza = this.zzbfc[i3].zza(zzofVarArr2, zArr, zznmVarArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = zza;
            } else if (zza != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzofVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zzpf.checkState(zznmVarArr4[i6] != null);
                    zznmVarArr3[i6] = zznmVarArr4[i6];
                    this.zzbfd.put(zznmVarArr4[i6], Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzpf.checkState(zznmVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zzbfc[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zzofVarArr2 = zzofVarArr3;
            zznmVarArr2 = zznmVarArr;
        }
        zznm[] zznmVarArr5 = zznmVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zznmVarArr3, 0, zznmVarArr5, 0, length);
        zznb[] zznbVarArr2 = new zznb[arrayList3.size()];
        this.zzbff = zznbVarArr2;
        arrayList3.toArray(zznbVarArr2);
        this.zzbfg = new zzmo(this.zzbff);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final void zzef(long j) {
        for (zznb zznbVar : this.zzbff) {
            zznbVar.zzef(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznb, com.google.android.gms.internal.ads.zznp
    public final boolean zzee(long j) {
        return this.zzbfg.zzee(j);
    }

    @Override // com.google.android.gms.internal.ads.zznb, com.google.android.gms.internal.ads.zznp
    public final long zzhn() {
        return this.zzbfg.zzhn();
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final long zzhq() {
        long zzhq = this.zzbfc[0].zzhq();
        int i = 1;
        while (true) {
            zznb[] zznbVarArr = this.zzbfc;
            if (i >= zznbVarArr.length) {
                if (zzhq != -9223372036854775807L) {
                    for (zznb zznbVar : this.zzbff) {
                        if (zznbVar != this.zzbfc[0] && zznbVar.zzeg(zzhq) != zzhq) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzhq;
            }
            if (zznbVarArr[i].zzhq() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final long zzhr() {
        long j = Long.MAX_VALUE;
        for (zznb zznbVar : this.zzbff) {
            long zzhr = zznbVar.zzhr();
            if (zzhr != Long.MIN_VALUE) {
                j = Math.min(j, zzhr);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final long zzeg(long j) {
        long zzeg = this.zzbff[0].zzeg(j);
        int i = 1;
        while (true) {
            zznb[] zznbVarArr = this.zzbff;
            if (i >= zznbVarArr.length) {
                return zzeg;
            }
            if (zznbVarArr[i].zzeg(zzeg) != zzeg) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i++;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.internal.ads.zzna
    public final void zza(zznb zznbVar) {
        int i = this.zzbfe - 1;
        this.zzbfe = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (zznb zznbVar2 : this.zzbfc) {
            i2 += zznbVar2.zzhp().length;
        }
        zznq[] zznqVarArr = new zznq[i2];
        int i3 = 0;
        for (zznb zznbVar3 : this.zzbfc) {
            zznt zzhp = zznbVar3.zzhp();
            int i4 = zzhp.length;
            int i5 = 0;
            while (i5 < i4) {
                zznqVarArr[i3] = zzhp.zzbc(i5);
                i5++;
                i3++;
            }
        }
        this.zzafd = new zznt(zznqVarArr);
        this.zzbdv.zza((zznb) this);
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final /* synthetic */ void zza(zznb zznbVar) {
        if (this.zzafd != null) {
            this.zzbdv.zza((zzna) this);
        }
    }
}
