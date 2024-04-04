package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcuc<T> implements zzdza<T> {
    private final /* synthetic */ zzdmj zzghj;
    private final /* synthetic */ long zzgtk;
    private final /* synthetic */ String zzgtl;
    private final /* synthetic */ zzdmi zzgtm;
    private final /* synthetic */ zzcud zzgtn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcuc(zzcud zzcudVar, long j, String str, zzdmi zzdmiVar, zzdmj zzdmjVar) {
        this.zzgtn = zzcudVar;
        this.zzgtk = j;
        this.zzgtl = str;
        this.zzgtm = zzdmiVar;
        this.zzghj = zzdmjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void onSuccess(T t) {
        Clock clock;
        boolean z;
        zzcqx zzcqxVar;
        zzcuf zzcufVar;
        clock = this.zzgtn.zzbpw;
        long elapsedRealtime = clock.elapsedRealtime() - this.zzgtk;
        this.zzgtn.zza(this.zzgtl, 0, elapsedRealtime, this.zzgtm.zzhij);
        z = this.zzgtn.zzgtq;
        if (z) {
            zzcufVar = this.zzgtn.zzgto;
            zzcufVar.zza(this.zzghj, this.zzgtm, 0, null, elapsedRealtime);
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcze)).booleanValue()) {
            zzcqxVar = this.zzgtn.zzfvn;
            zzcqxVar.zza(this.zzgtm, elapsedRealtime, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        Clock clock;
        int i;
        boolean z;
        zzcqx zzcqxVar;
        zzcuf zzcufVar;
        clock = this.zzgtn.zzbpw;
        long elapsedRealtime = clock.elapsedRealtime() - this.zzgtk;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zzctt) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof zzdnf) {
            i = 5;
        } else {
            i = ((th instanceof zzcli) && zzdns.zzh(th).errorCode == 3) ? 1 : 6;
        }
        this.zzgtn.zza(this.zzgtl, i, elapsedRealtime, this.zzgtm.zzhij);
        z = this.zzgtn.zzgtq;
        if (z) {
            zzcufVar = this.zzgtn.zzgto;
            zzcufVar.zza(this.zzghj, this.zzgtm, i, th instanceof zzcqu ? (zzcqu) th : null, elapsedRealtime);
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcze)).booleanValue()) {
            zzvc zzh = zzdns.zzh(th);
            if ((zzh.errorCode == 3 || zzh.errorCode == 0) && zzh.zzcgu != null && !zzh.zzcgu.zzcgt.equals(MobileAds.ERROR_DOMAIN)) {
                zzh = zzdns.zzh(new zzcqu(zzdnu.MEDIATION_NO_FILL, zzh.zzcgu));
            }
            zzcqxVar = this.zzgtn.zzfvn;
            zzcqxVar.zza(this.zzgtm, elapsedRealtime, zzh);
        }
    }
}
