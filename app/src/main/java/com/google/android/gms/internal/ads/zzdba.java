package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdba implements zzdeu<Object> {
    private static final Object lock = new Object();
    private final String zzcix;
    private final String zzdsl;
    private final com.google.android.gms.ads.internal.util.zzf zzdza = com.google.android.gms.ads.internal.zzp.zzku().zzxq();
    private final zzdmx zzfve;
    private final zzbol zzgzl;
    private final zzdob zzgzm;

    public zzdba(String str, String str2, zzbol zzbolVar, zzdob zzdobVar, zzdmx zzdmxVar) {
        this.zzdsl = str;
        this.zzcix = str2;
        this.zzgzl = zzbolVar;
        this.zzgzm = zzdobVar;
        this.zzfve = zzdmxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<Object> zzata() {
        final Bundle bundle = new Bundle();
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcvt)).booleanValue()) {
            this.zzgzl.zzf(this.zzfve.zzhjd);
            bundle.putAll(this.zzgzm.zzavp());
        }
        return zzdyz.zzag(new zzder(this, bundle) { // from class: com.google.android.gms.internal.ads.zzdaz
            private final Bundle zzdzr;
            private final zzdba zzgzk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgzk = this;
                this.zzdzr = bundle;
            }

            @Override // com.google.android.gms.internal.ads.zzder
            public final void zzr(Object obj) {
                this.zzgzk.zzb(this.zzdzr, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Bundle bundle, Bundle bundle2) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcvt)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcvs)).booleanValue()) {
                synchronized (lock) {
                    this.zzgzl.zzf(this.zzfve.zzhjd);
                    bundle2.putBundle("quality_signals", this.zzgzm.zzavp());
                }
            } else {
                this.zzgzl.zzf(this.zzfve.zzhjd);
                bundle2.putBundle("quality_signals", this.zzgzm.zzavp());
            }
        }
        bundle2.putString("seq_num", this.zzdsl);
        bundle2.putString("session_id", this.zzdza.zzys() ? "" : this.zzcix);
    }
}
