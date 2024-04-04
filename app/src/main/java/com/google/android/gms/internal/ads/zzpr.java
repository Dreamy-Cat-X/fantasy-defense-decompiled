package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzpr implements zzpj {
    private boolean started;
    private zzhy zzaff = zzhy.zzahx;
    private long zzbki;
    private long zzbkj;

    public final void start() {
        if (this.started) {
            return;
        }
        this.zzbkj = SystemClock.elapsedRealtime();
        this.started = true;
    }

    public final void stop() {
        if (this.started) {
            zzel(zzgc());
            this.started = false;
        }
    }

    public final void zzel(long j) {
        this.zzbki = j;
        if (this.started) {
            this.zzbkj = SystemClock.elapsedRealtime();
        }
    }

    public final void zza(zzpj zzpjVar) {
        zzel(zzpjVar.zzgc());
        this.zzaff = zzpjVar.zzfs();
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final long zzgc() {
        long zzdu;
        long j = this.zzbki;
        if (!this.started) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzbkj;
        if (this.zzaff.zzahy == 1.0f) {
            zzdu = zzhe.zzdp(elapsedRealtime);
        } else {
            zzdu = this.zzaff.zzdu(elapsedRealtime);
        }
        return j + zzdu;
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final zzhy zzb(zzhy zzhyVar) {
        if (this.started) {
            zzel(zzgc());
        }
        this.zzaff = zzhyVar;
        return zzhyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final zzhy zzfs() {
        return this.zzaff;
    }
}
