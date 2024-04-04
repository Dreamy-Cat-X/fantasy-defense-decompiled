package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.work.WorkRequest;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzmr implements zzkb, zznb, zznn, zzoy<zzmu> {
    private final Uri uri;
    private final Handler zzaeq;
    private boolean zzaft;
    private boolean zzagp;
    private long zzaim;
    private final zzom zzaom;
    private final int zzbdj;
    private final zzmy zzbdk;
    private final zznc zzbdl;
    private final zzok zzbdm;
    private final long zzbdo;
    private final zzmx zzbdq;
    private zzna zzbdv;
    private zzke zzbdw;
    private boolean zzbdx;
    private boolean zzbdy;
    private boolean zzbdz;
    private int zzbea;
    private zznt zzbeb;
    private boolean[] zzbec;
    private boolean[] zzbed;
    private boolean zzbee;
    private long zzbef;
    private int zzbeh;
    private boolean zzbei;
    private final String zzbdn = null;
    private final zzoz zzbdp = new zzoz("Loader:ExtractorMediaPeriod");
    private final zzph zzbdr = new zzph();
    private final Runnable zzbds = new zzmq(this);
    private final Runnable zzbdt = new zzmt(this);
    private final Handler handler = new Handler();
    private long zzbeg = -9223372036854775807L;
    private final SparseArray<zznl> zzbdu = new SparseArray<>();
    private long zzcm = -1;

    public zzmr(Uri uri, zzom zzomVar, zzjz[] zzjzVarArr, int i, Handler handler, zzmy zzmyVar, zznc zzncVar, zzok zzokVar, String str, int i2) {
        this.uri = uri;
        this.zzaom = zzomVar;
        this.zzbdj = i;
        this.zzaeq = handler;
        this.zzbdk = zzmyVar;
        this.zzbdl = zzncVar;
        this.zzbdm = zzokVar;
        this.zzbdo = i2;
        this.zzbdq = new zzmx(zzjzVarArr, this);
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final void zzef(long j) {
    }

    public final void release() {
        this.zzbdp.zza(new zzms(this, this.zzbdq));
        this.handler.removeCallbacksAndMessages(null);
        this.zzaft = true;
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final void zza(zzna zznaVar, long j) {
        this.zzbdv = zznaVar;
        this.zzbdr.open();
        startLoading();
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final void zzho() throws IOException {
        this.zzbdp.zzbg(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final zznt zzhp() {
        return this.zzbeb;
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final long zza(zzof[] zzofVarArr, boolean[] zArr, zznm[] zznmVarArr, boolean[] zArr2, long j) {
        int i;
        zzpf.checkState(this.zzagp);
        for (int i2 = 0; i2 < zzofVarArr.length; i2++) {
            if (zznmVarArr[i2] != null && (zzofVarArr[i2] == null || !zArr[i2])) {
                i = ((zzmw) zznmVarArr[i2]).track;
                zzpf.checkState(this.zzbec[i]);
                this.zzbea--;
                this.zzbec[i] = false;
                this.zzbdu.valueAt(i).disable();
                zznmVarArr[i2] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < zzofVarArr.length; i3++) {
            if (zznmVarArr[i3] == null && zzofVarArr[i3] != null) {
                zzof zzofVar = zzofVarArr[i3];
                zzpf.checkState(zzofVar.length() == 1);
                zzpf.checkState(zzofVar.zzbd(0) == 0);
                int zza = this.zzbeb.zza(zzofVar.zzil());
                zzpf.checkState(!this.zzbec[zza]);
                this.zzbea++;
                this.zzbec[zza] = true;
                zznmVarArr[i3] = new zzmw(this, zza);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.zzbdy) {
            int size = this.zzbdu.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.zzbec[i4]) {
                    this.zzbdu.valueAt(i4).disable();
                }
            }
        }
        if (this.zzbea == 0) {
            this.zzbdz = false;
            if (this.zzbdp.isLoading()) {
                this.zzbdp.zzit();
            }
        } else if (!this.zzbdy ? j != 0 : z) {
            j = zzeg(j);
            for (int i5 = 0; i5 < zznmVarArr.length; i5++) {
                if (zznmVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.zzbdy = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zznb, com.google.android.gms.internal.ads.zznp
    public final boolean zzee(long j) {
        if (this.zzbei) {
            return false;
        }
        if (this.zzagp && this.zzbea == 0) {
            return false;
        }
        boolean open = this.zzbdr.open();
        if (this.zzbdp.isLoading()) {
            return open;
        }
        startLoading();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zznb, com.google.android.gms.internal.ads.zznp
    public final long zzhn() {
        if (this.zzbea == 0) {
            return Long.MIN_VALUE;
        }
        return zzhr();
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final long zzhq() {
        if (!this.zzbdz) {
            return -9223372036854775807L;
        }
        this.zzbdz = false;
        return this.zzbef;
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final long zzhr() {
        long zzhv;
        if (this.zzbei) {
            return Long.MIN_VALUE;
        }
        if (zzhw()) {
            return this.zzbeg;
        }
        if (this.zzbee) {
            zzhv = Long.MAX_VALUE;
            int size = this.zzbdu.size();
            for (int i = 0; i < size; i++) {
                if (this.zzbed[i]) {
                    zzhv = Math.min(zzhv, this.zzbdu.valueAt(i).zzhv());
                }
            }
        } else {
            zzhv = zzhv();
        }
        return zzhv == Long.MIN_VALUE ? this.zzbef : zzhv;
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final long zzeg(long j) {
        if (!this.zzbdw.isSeekable()) {
            j = 0;
        }
        this.zzbef = j;
        int size = this.zzbdu.size();
        boolean z = !zzhw();
        for (int i = 0; z && i < size; i++) {
            if (this.zzbec[i]) {
                z = this.zzbdu.valueAt(i).zze(j, false);
            }
        }
        if (!z) {
            this.zzbeg = j;
            this.zzbei = false;
            if (this.zzbdp.isLoading()) {
                this.zzbdp.zzit();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    this.zzbdu.valueAt(i2).zzk(this.zzbec[i2]);
                }
            }
        }
        this.zzbdz = false;
        return j;
    }

    public final boolean zzaz(int i) {
        if (this.zzbei) {
            return true;
        }
        return !zzhw() && this.zzbdu.valueAt(i).zzie();
    }

    public final void zzhs() throws IOException {
        this.zzbdp.zzbg(Integer.MIN_VALUE);
    }

    public final int zza(int i, zzhu zzhuVar, zzjo zzjoVar, boolean z) {
        if (this.zzbdz || zzhw()) {
            return -3;
        }
        return this.zzbdu.valueAt(i).zza(zzhuVar, zzjoVar, z, this.zzbei, this.zzbef);
    }

    public final void zze(int i, long j) {
        zznl valueAt = this.zzbdu.valueAt(i);
        if (this.zzbei && j > valueAt.zzhv()) {
            valueAt.zzii();
        } else {
            valueAt.zze(j, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final zzkg zzc(int i, int i2) {
        zznl zznlVar = this.zzbdu.get(i);
        if (zznlVar != null) {
            return zznlVar;
        }
        zznl zznlVar2 = new zznl(this.zzbdm);
        zznlVar2.zza(this);
        this.zzbdu.put(i, zznlVar2);
        return zznlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final void zzgs() {
        this.zzbdx = true;
        this.handler.post(this.zzbds);
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final void zza(zzke zzkeVar) {
        this.zzbdw = zzkeVar;
        this.handler.post(this.zzbds);
    }

    @Override // com.google.android.gms.internal.ads.zznn
    public final void zzf(zzhs zzhsVar) {
        this.handler.post(this.zzbds);
    }

    public final void zzht() {
        if (this.zzaft || this.zzagp || this.zzbdw == null || !this.zzbdx) {
            return;
        }
        int size = this.zzbdu.size();
        for (int i = 0; i < size; i++) {
            if (this.zzbdu.valueAt(i).zzif() == null) {
                return;
            }
        }
        this.zzbdr.zziu();
        zznq[] zznqVarArr = new zznq[size];
        this.zzbed = new boolean[size];
        this.zzbec = new boolean[size];
        this.zzaim = this.zzbdw.getDurationUs();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < size) {
                zzhs zzif = this.zzbdu.valueAt(i2).zzif();
                zznqVarArr[i2] = new zznq(zzif);
                String str = zzif.zzahb;
                if (!zzpi.zzbd(str) && !zzpi.zzbc(str)) {
                    z = false;
                }
                this.zzbed[i2] = z;
                this.zzbee = z | this.zzbee;
                i2++;
            } else {
                this.zzbeb = new zznt(zznqVarArr);
                this.zzagp = true;
                this.zzbdl.zzb(new zznr(this.zzaim, this.zzbdw.isSeekable()), null);
                this.zzbdv.zza((zznb) this);
                return;
            }
        }
    }

    private final void zza(zzmu zzmuVar) {
        long j;
        if (this.zzcm == -1) {
            j = zzmuVar.zzcm;
            this.zzcm = j;
        }
    }

    private final void startLoading() {
        zzke zzkeVar;
        zzmu zzmuVar = new zzmu(this, this.uri, this.zzaom, this.zzbdq, this.zzbdr);
        if (this.zzagp) {
            zzpf.checkState(zzhw());
            long j = this.zzaim;
            if (j != -9223372036854775807L && this.zzbeg >= j) {
                this.zzbei = true;
                this.zzbeg = -9223372036854775807L;
                return;
            } else {
                zzmuVar.zze(this.zzbdw.zzdz(this.zzbeg), this.zzbeg);
                this.zzbeg = -9223372036854775807L;
            }
        }
        this.zzbeh = zzhu();
        int i = this.zzbdj;
        if (i == -1) {
            i = (this.zzagp && this.zzcm == -1 && ((zzkeVar = this.zzbdw) == null || zzkeVar.getDurationUs() == -9223372036854775807L)) ? 6 : 3;
        }
        this.zzbdp.zza(zzmuVar, this, i);
    }

    private final int zzhu() {
        int size = this.zzbdu.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.zzbdu.valueAt(i2).zzid();
        }
        return i;
    }

    private final long zzhv() {
        int size = this.zzbdu.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.zzbdu.valueAt(i).zzhv());
        }
        return j;
    }

    private final boolean zzhw() {
        return this.zzbeg != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final /* synthetic */ int zza(zzmu zzmuVar, long j, long j2, IOException iOException) {
        zzke zzkeVar;
        zzmu zzmuVar2 = zzmuVar;
        zza(zzmuVar2);
        Handler handler = this.zzaeq;
        if (handler != null && this.zzbdk != null) {
            handler.post(new zzmv(this, iOException));
        }
        if (iOException instanceof zzns) {
            return 3;
        }
        boolean z = zzhu() > this.zzbeh;
        if (this.zzcm == -1 && ((zzkeVar = this.zzbdw) == null || zzkeVar.getDurationUs() == -9223372036854775807L)) {
            this.zzbef = 0L;
            this.zzbdz = this.zzagp;
            int size = this.zzbdu.size();
            for (int i = 0; i < size; i++) {
                this.zzbdu.valueAt(i).zzk(!this.zzagp || this.zzbec[i]);
            }
            zzmuVar2.zze(0L, 0L);
        }
        this.zzbeh = zzhu();
        return z ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final /* synthetic */ void zza(zzmu zzmuVar, long j, long j2, boolean z) {
        zza(zzmuVar);
        if (z || this.zzbea <= 0) {
            return;
        }
        int size = this.zzbdu.size();
        for (int i = 0; i < size; i++) {
            this.zzbdu.valueAt(i).zzk(this.zzbec[i]);
        }
        this.zzbdv.zza((zzna) this);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final /* synthetic */ void zza(zzmu zzmuVar, long j, long j2) {
        zza(zzmuVar);
        this.zzbei = true;
        if (this.zzaim == -9223372036854775807L) {
            long zzhv = zzhv();
            this.zzaim = zzhv == Long.MIN_VALUE ? 0L : zzhv + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzbdl.zzb(new zznr(this.zzaim, this.zzbdw.isSeekable()), null);
        }
        this.zzbdv.zza((zzna) this);
    }
}
