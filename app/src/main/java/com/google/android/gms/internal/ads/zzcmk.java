package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcmk implements zzdza<zzdmt> {
    private final /* synthetic */ zzcmj zzgmr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcmk(zzcmj zzcmjVar) {
        this.zzgmr = zzcmjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        Pattern pattern;
        zzcpi zzcpiVar;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcxb)).booleanValue()) {
            pattern = zzcmj.zzgmq;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzcpiVar = this.zzgmr.zzgmp;
                zzcpiVar.zzeb(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(zzdmt zzdmtVar) {
        zzcpi zzcpiVar;
        zzcpi zzcpiVar2;
        zzdmt zzdmtVar2 = zzdmtVar;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcxb)).booleanValue()) {
            zzcpiVar = this.zzgmr.zzgmp;
            zzcpiVar.zzeb(zzdmtVar2.zzhiz.zzera.responseCode);
            zzcpiVar2 = this.zzgmr.zzgmp;
            zzcpiVar2.zzeo(zzdmtVar2.zzhiz.zzera.zzgom);
        }
    }
}
