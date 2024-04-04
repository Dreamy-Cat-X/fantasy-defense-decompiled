package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzhj implements zzhg {
    private int repeatMode;
    private final zzhx[] zzaen;
    private final zzog zzaeo;
    private final zzoh zzaep;
    private final Handler zzaeq;
    private final zzhl zzaer;
    private final CopyOnWriteArraySet<zzhf> zzaes;
    private final zzid zzaet;
    private final zzie zzaeu;
    private boolean zzaev;
    private boolean zzaew;
    private int zzaex;
    private int zzaey;
    private int zzaez;
    private boolean zzafa;
    private zzic zzafb;
    private Object zzafc;
    private zznt zzafd;
    private zzoh zzafe;
    private zzhy zzaff;
    private zzhn zzafg;
    private int zzafh;
    private int zzafi;
    private long zzafj;

    public zzhj(zzhx[] zzhxVarArr, zzog zzogVar, zzhw zzhwVar) {
        String str = zzps.zzbkk;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        zzpf.checkState(zzhxVarArr.length > 0);
        this.zzaen = (zzhx[]) zzpf.checkNotNull(zzhxVarArr);
        this.zzaeo = (zzog) zzpf.checkNotNull(zzogVar);
        this.zzaew = false;
        this.repeatMode = 0;
        this.zzaex = 1;
        this.zzaes = new CopyOnWriteArraySet<>();
        this.zzaep = new zzoh(new zzof[zzhxVarArr.length]);
        this.zzafb = zzic.zzaid;
        this.zzaet = new zzid();
        this.zzaeu = new zzie();
        this.zzafd = zznt.zzbgs;
        this.zzafe = this.zzaep;
        this.zzaff = zzhy.zzahx;
        this.zzaeq = new zzhm(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.zzafg = new zzhn(0, 0L);
        this.zzaer = new zzhl(zzhxVarArr, zzogVar, zzhwVar, this.zzaew, 0, this.zzaeq, this.zzafg, this);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void zza(zzhf zzhfVar) {
        this.zzaes.add(zzhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void zzb(zzhf zzhfVar) {
        this.zzaes.remove(zzhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final int getPlaybackState() {
        return this.zzaex;
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void zza(zznd zzndVar) {
        if (!this.zzafb.isEmpty() || this.zzafc != null) {
            this.zzafb = zzic.zzaid;
            this.zzafc = null;
            Iterator<zzhf> it = this.zzaes.iterator();
            while (it.hasNext()) {
                it.next().zza(this.zzafb, this.zzafc);
            }
        }
        if (this.zzaev) {
            this.zzaev = false;
            this.zzafd = zznt.zzbgs;
            this.zzafe = this.zzaep;
            this.zzaeo.zzd(null);
            Iterator<zzhf> it2 = this.zzaes.iterator();
            while (it2.hasNext()) {
                it2.next().zza(this.zzafd, this.zzafe);
            }
        }
        this.zzaez++;
        this.zzaer.zza(zzndVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void zzg(boolean z) {
        if (this.zzaew != z) {
            this.zzaew = z;
            this.zzaer.zzg(z);
            Iterator<zzhf> it = this.zzaes.iterator();
            while (it.hasNext()) {
                it.next().zza(z, this.zzaex);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final boolean zzel() {
        return this.zzaew;
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void seekTo(long j) {
        int zzeo = zzeo();
        if (zzeo < 0 || (!this.zzafb.isEmpty() && zzeo >= this.zzafb.zzff())) {
            throw new zzht(this.zzafb, zzeo, j);
        }
        this.zzaey++;
        this.zzafh = zzeo;
        if (!this.zzafb.isEmpty()) {
            this.zzafb.zza(zzeo, this.zzaet, false);
            long zzdp = (j == -9223372036854775807L ? 0L : zzhe.zzdp(j)) + 0;
            long j2 = this.zzafb.zza(0, this.zzaeu, false).zzaim;
            if (j2 != -9223372036854775807L) {
                int i = (zzdp > j2 ? 1 : (zzdp == j2 ? 0 : -1));
            }
        }
        this.zzafi = 0;
        if (j == -9223372036854775807L) {
            this.zzafj = 0L;
            this.zzaer.zza(this.zzafb, zzeo, -9223372036854775807L);
            return;
        }
        this.zzafj = j;
        this.zzaer.zza(this.zzafb, zzeo, zzhe.zzdp(j));
        Iterator<zzhf> it = this.zzaes.iterator();
        while (it.hasNext()) {
            it.next().zzek();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void stop() {
        this.zzaer.stop();
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void release() {
        this.zzaer.release();
        this.zzaeq.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void zza(zzhh... zzhhVarArr) {
        this.zzaer.zza(zzhhVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void zzb(zzhh... zzhhVarArr) {
        this.zzaer.zzb(zzhhVarArr);
    }

    private final int zzeo() {
        if (this.zzafb.isEmpty() || this.zzaey > 0) {
            return this.zzafh;
        }
        this.zzafb.zza(this.zzafg.zzagf, this.zzaeu, false);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final long getDuration() {
        if (this.zzafb.isEmpty()) {
            return -9223372036854775807L;
        }
        return zzhe.zzdo(this.zzafb.zza(zzeo(), this.zzaet, false).zzaim);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final long zzen() {
        if (this.zzafb.isEmpty() || this.zzaey > 0) {
            return this.zzafj;
        }
        this.zzafb.zza(this.zzafg.zzagf, this.zzaeu, false);
        return this.zzaeu.zzfh() + zzhe.zzdo(this.zzafg.zzagh);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final long getBufferedPosition() {
        if (this.zzafb.isEmpty() || this.zzaey > 0) {
            return this.zzafj;
        }
        this.zzafb.zza(this.zzafg.zzagf, this.zzaeu, false);
        return this.zzaeu.zzfh() + zzhe.zzdo(this.zzafg.zzagi);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final int zzem() {
        return this.zzaen.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(Message message) {
        switch (message.what) {
            case 0:
                this.zzaez--;
                return;
            case 1:
                this.zzaex = message.arg1;
                Iterator<zzhf> it = this.zzaes.iterator();
                while (it.hasNext()) {
                    it.next().zza(this.zzaew, this.zzaex);
                }
                return;
            case 2:
                this.zzafa = message.arg1 != 0;
                Iterator<zzhf> it2 = this.zzaes.iterator();
                while (it2.hasNext()) {
                    it2.next().zzf(this.zzafa);
                }
                return;
            case 3:
                if (this.zzaez == 0) {
                    zzoi zzoiVar = (zzoi) message.obj;
                    this.zzaev = true;
                    this.zzafd = zzoiVar.zzbhu;
                    this.zzafe = zzoiVar.zzbhv;
                    this.zzaeo.zzd(zzoiVar.zzbhw);
                    Iterator<zzhf> it3 = this.zzaes.iterator();
                    while (it3.hasNext()) {
                        it3.next().zza(this.zzafd, this.zzafe);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.zzaey - 1;
                this.zzaey = i;
                if (i == 0) {
                    this.zzafg = (zzhn) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<zzhf> it4 = this.zzaes.iterator();
                        while (it4.hasNext()) {
                            it4.next().zzek();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.zzaey == 0) {
                    this.zzafg = (zzhn) message.obj;
                    Iterator<zzhf> it5 = this.zzaes.iterator();
                    while (it5.hasNext()) {
                        it5.next().zzek();
                    }
                    return;
                }
                return;
            case 6:
                zzhp zzhpVar = (zzhp) message.obj;
                this.zzaey -= zzhpVar.zzagu;
                if (this.zzaez == 0) {
                    this.zzafb = zzhpVar.zzafb;
                    this.zzafc = zzhpVar.zzafc;
                    this.zzafg = zzhpVar.zzafg;
                    Iterator<zzhf> it6 = this.zzaes.iterator();
                    while (it6.hasNext()) {
                        it6.next().zza(this.zzafb, this.zzafc);
                    }
                    return;
                }
                return;
            case 7:
                zzhy zzhyVar = (zzhy) message.obj;
                if (this.zzaff.equals(zzhyVar)) {
                    return;
                }
                this.zzaff = zzhyVar;
                Iterator<zzhf> it7 = this.zzaes.iterator();
                while (it7.hasNext()) {
                    it7.next().zza(zzhyVar);
                }
                return;
            case 8:
                zzhd zzhdVar = (zzhd) message.obj;
                Iterator<zzhf> it8 = this.zzaes.iterator();
                while (it8.hasNext()) {
                    it8.next().zza(zzhdVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
