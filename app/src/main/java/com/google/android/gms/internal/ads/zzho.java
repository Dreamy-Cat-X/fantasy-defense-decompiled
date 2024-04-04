package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzho {
    public final int index;
    private final zzhx[] zzaen;
    private final zzog zzaeo;
    private final zzia[] zzafk;
    private final zzhw zzafl;
    private final zznd zzafr;
    public int zzagf;
    public long zzagg;
    public final zznb zzagj;
    public final Object zzagk;
    public final zznm[] zzagl;
    private final boolean[] zzagm;
    public final long zzagn;
    public boolean zzago;
    public boolean zzagp;
    public boolean zzagq;
    public zzho zzagr;
    public zzoi zzags;
    private zzoi zzagt;

    public zzho(zzhx[] zzhxVarArr, zzia[] zziaVarArr, long j, zzog zzogVar, zzhw zzhwVar, zznd zzndVar, Object obj, int i, int i2, boolean z, long j2) {
        this.zzaen = zzhxVarArr;
        this.zzafk = zziaVarArr;
        this.zzagn = j;
        this.zzaeo = zzogVar;
        this.zzafl = zzhwVar;
        this.zzafr = zzndVar;
        this.zzagk = zzpf.checkNotNull(obj);
        this.index = i;
        this.zzagf = i2;
        this.zzago = z;
        this.zzagg = j2;
        this.zzagl = new zznm[zzhxVarArr.length];
        this.zzagm = new boolean[zzhxVarArr.length];
        this.zzagj = zzndVar.zza(i2, zzhwVar.zzfd());
    }

    public final long zzew() {
        return this.zzagn - this.zzagg;
    }

    public final void zzc(int i, boolean z) {
        this.zzagf = i;
        this.zzago = z;
    }

    public final boolean zzex() {
        if (this.zzagp) {
            return !this.zzagq || this.zzagj.zzhr() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzey() throws zzhd {
        boolean z;
        zzoi zza = this.zzaeo.zza(this.zzafk, this.zzagj.zzhp());
        zzoi zzoiVar = this.zzagt;
        if (zzoiVar != null) {
            for (int i = 0; i < zza.zzbhv.length; i++) {
                if (zza.zza(zzoiVar, i)) {
                }
            }
            z = true;
            if (!z) {
                return false;
            }
            this.zzags = zza;
            return true;
        }
        z = false;
        if (!z) {
        }
    }

    public final long zzb(long j, boolean z) {
        return zza(j, false, new boolean[this.zzaen.length]);
    }

    public final long zza(long j, boolean z, boolean[] zArr) {
        zzoh zzohVar = this.zzags.zzbhv;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzohVar.length) {
                break;
            }
            boolean[] zArr2 = this.zzagm;
            if (z || !this.zzags.zza(this.zzagt, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long zza = this.zzagj.zza(zzohVar.zzim(), this.zzagm, this.zzagl, zArr, j);
        this.zzagt = this.zzags;
        this.zzagq = false;
        int i2 = 0;
        while (true) {
            zznm[] zznmVarArr = this.zzagl;
            if (i2 < zznmVarArr.length) {
                if (zznmVarArr[i2] != null) {
                    zzpf.checkState(zzohVar.zzbe(i2) != null);
                    this.zzagq = true;
                } else {
                    zzpf.checkState(zzohVar.zzbe(i2) == null);
                }
                i2++;
            } else {
                this.zzafl.zza(this.zzaen, this.zzags.zzbhu, zzohVar);
                return zza;
            }
        }
    }

    public final void release() {
        try {
            this.zzafr.zzb(this.zzagj);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }
}
