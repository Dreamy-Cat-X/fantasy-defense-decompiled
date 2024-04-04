package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcmj implements zzcng {
    private static final Pattern zzgmq = Pattern.compile("Received error HTTP response code: (.*)");
    private final ScheduledExecutorService zzfpk;
    private final zzdmx zzfve;
    private final zzdzk zzgfs;
    private final zzcll zzgmo;
    private final zzcpi zzgmp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcmj(zzdmx zzdmxVar, zzcll zzcllVar, zzdzk zzdzkVar, ScheduledExecutorService scheduledExecutorService, zzcpi zzcpiVar) {
        this.zzfve = zzdmxVar;
        this.zzgmo = zzcllVar;
        this.zzgfs = zzdzkVar;
        this.zzfpk = scheduledExecutorService;
        this.zzgmp = zzcpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcng
    public final zzdzl<zzdmt> zzh(zzasu zzasuVar) {
        zzdzl<zzdmt> zzb = zzdyz.zzb(this.zzgmo.zze(zzasuVar), new zzdyj(this) { // from class: com.google.android.gms.internal.ads.zzcmi
            private final zzcmj zzgmn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmn = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzgmn.zzd((InputStream) obj);
            }
        }, this.zzgfs);
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcvp)).booleanValue()) {
            zzb = zzdyz.zzb(zzdyz.zza(zzb, ((Integer) zzwo.zzqq().zzd(zzabh.zzcvq)).intValue(), TimeUnit.SECONDS, this.zzfpk), TimeoutException.class, zzcml.zzbon, zzayv.zzegn);
        }
        zzdyz.zza(zzb, new zzcmk(this), zzayv.zzegn);
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zzd(InputStream inputStream) throws Exception {
        return zzdyz.zzag(new zzdmt(new zzdms(this.zzfve), zzdmr.zza(new InputStreamReader(inputStream))));
    }
}
