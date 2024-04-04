package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzmu implements zzpa {
    private final Uri uri;
    private final zzom zzaom;
    private final /* synthetic */ zzmr zzbdi;
    private final zzmx zzbdq;
    private final zzph zzbdr;
    private volatile boolean zzbel;
    private long zzben;
    private final zzkf zzbek = new zzkf();
    private boolean zzbem = true;
    private long zzcm = -1;

    public zzmu(zzmr zzmrVar, Uri uri, zzom zzomVar, zzmx zzmxVar, zzph zzphVar) {
        this.zzbdi = zzmrVar;
        this.uri = (Uri) zzpf.checkNotNull(uri);
        this.zzaom = (zzom) zzpf.checkNotNull(zzomVar);
        this.zzbdq = (zzmx) zzpf.checkNotNull(zzmxVar);
        this.zzbdr = zzphVar;
    }

    public final void zze(long j, long j2) {
        this.zzbek.position = j;
        this.zzben = j2;
        this.zzbem = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final void cancelLoad() {
        this.zzbel = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final boolean zzhx() {
        return this.zzbel;
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final void zzhy() throws IOException, InterruptedException {
        int i = 0;
        while (i == 0 && !this.zzbel) {
            zzjw zzjwVar = null;
            try {
                long j = this.zzbek.position;
                long zza = this.zzaom.zza(new zzor(this.uri, j, -1L, zzmr.zzf(this.zzbdi)));
                this.zzcm = zza;
                if (zza != -1) {
                    this.zzcm = zza + j;
                }
                zzjw zzjwVar2 = new zzjw(this.zzaom, j, this.zzcm);
                try {
                    zzjz zza2 = this.zzbdq.zza(zzjwVar2, this.zzaom.getUri());
                    if (this.zzbem) {
                        zza2.zzc(j, this.zzben);
                        this.zzbem = false;
                    }
                    while (i == 0 && !this.zzbel) {
                        this.zzbdr.block();
                        i = zza2.zza(zzjwVar2, this.zzbek);
                        if (zzjwVar2.getPosition() > zzmr.zzg(this.zzbdi) + j) {
                            j = zzjwVar2.getPosition();
                            this.zzbdr.zziu();
                            zzmr.zzi(this.zzbdi).post(zzmr.zzh(this.zzbdi));
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else {
                        this.zzbek.position = zzjwVar2.getPosition();
                    }
                    zzps.zza(this.zzaom);
                } catch (Throwable th) {
                    th = th;
                    zzjwVar = zzjwVar2;
                    if (i != 1 && zzjwVar != null) {
                        this.zzbek.position = zzjwVar.getPosition();
                    }
                    zzps.zza(this.zzaom);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
