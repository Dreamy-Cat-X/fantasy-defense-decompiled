package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzbdp {
    public static zzdzl<zzbdh> zza(final Context context, final zzayt zzaytVar, final String str, final zzef zzefVar, final com.google.android.gms.ads.internal.zzb zzbVar) {
        return zzdyz.zzb(zzdyz.zzag(null), new zzdyj(context, zzefVar, zzaytVar, zzbVar, str) { // from class: com.google.android.gms.internal.ads.zzbdo
            private final Context zzczq;
            private final zzef zzdic;
            private final zzayt zzepx;
            private final com.google.android.gms.ads.internal.zzb zzepy;
            private final String zzepz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzczq = context;
                this.zzdic = zzefVar;
                this.zzepx = zzaytVar;
                this.zzepy = zzbVar;
                this.zzepz = str;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                Context context2 = this.zzczq;
                zzef zzefVar2 = this.zzdic;
                zzayt zzaytVar2 = this.zzepx;
                com.google.android.gms.ads.internal.zzb zzbVar2 = this.zzepy;
                String str2 = this.zzepz;
                com.google.android.gms.ads.internal.zzp.zzkr();
                zzbdh zza = zzbdp.zza(context2, zzbew.zzaej(), "", false, false, zzefVar2, null, zzaytVar2, null, null, zzbVar2, zztu.zzne(), null, null);
                final zzazd zzk = zzazd.zzk(zza);
                zza.zzadi().zza(new zzbes(zzk) { // from class: com.google.android.gms.internal.ads.zzbdq
                    private final zzazd zzeqa;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzeqa = zzk;
                    }

                    @Override // com.google.android.gms.internal.ads.zzbes
                    public final void zzai(boolean z) {
                        this.zzeqa.zzaaa();
                    }
                });
                zza.loadUrl(str2);
                return zzk;
            }
        }, zzayv.zzegm);
    }

    public static zzbdh zza(final Context context, final zzbew zzbewVar, final String str, final boolean z, final boolean z2, final zzef zzefVar, final zzacm zzacmVar, final zzayt zzaytVar, zzaby zzabyVar, final com.google.android.gms.ads.internal.zzk zzkVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zztu zztuVar, final zzdmi zzdmiVar, final zzdmj zzdmjVar) throws zzbdt {
        zzabh.initialize(context);
        try {
            final zzaby zzabyVar2 = null;
            return (zzbdh) com.google.android.gms.ads.internal.util.zzbu.zza(new zzdwh(context, zzbewVar, str, z, z2, zzefVar, zzacmVar, zzaytVar, zzabyVar2, zzkVar, zzbVar, zztuVar, zzdmiVar, zzdmjVar) { // from class: com.google.android.gms.internal.ads.zzbdr
                private final Context zzczq;
                private final String zzdkf;
                private final zzbew zzeqb;
                private final boolean zzeqc;
                private final boolean zzeqd;
                private final zzef zzeqe;
                private final zzacm zzeqf;
                private final zzayt zzeqg;
                private final zzaby zzeqh = null;
                private final com.google.android.gms.ads.internal.zzk zzeqi;
                private final com.google.android.gms.ads.internal.zzb zzeqj;
                private final zztu zzeqk;
                private final zzdmi zzeql;
                private final zzdmj zzeqm;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzczq = context;
                    this.zzeqb = zzbewVar;
                    this.zzdkf = str;
                    this.zzeqc = z;
                    this.zzeqd = z2;
                    this.zzeqe = zzefVar;
                    this.zzeqf = zzacmVar;
                    this.zzeqg = zzaytVar;
                    this.zzeqi = zzkVar;
                    this.zzeqj = zzbVar;
                    this.zzeqk = zztuVar;
                    this.zzeql = zzdmiVar;
                    this.zzeqm = zzdmjVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdwh
                public final Object get() {
                    return zzbdp.zzb(this.zzczq, this.zzeqb, this.zzdkf, this.zzeqc, this.zzeqd, this.zzeqe, this.zzeqf, this.zzeqg, null, this.zzeqi, this.zzeqj, this.zzeqk, this.zzeql, this.zzeqm);
                }
            });
        } catch (Throwable th) {
            throw new zzbdt("Webview initialization failed.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ zzbdh zzb(Context context, zzbew zzbewVar, String str, boolean z, boolean z2, zzef zzefVar, zzacm zzacmVar, zzayt zzaytVar, zzaby zzabyVar, com.google.android.gms.ads.internal.zzk zzkVar, com.google.android.gms.ads.internal.zzb zzbVar, zztu zztuVar, zzdmi zzdmiVar, zzdmj zzdmjVar) {
        try {
            TrafficStats.setThreadStatsTag(264);
            zzbds zzbdsVar = new zzbds(zzbdx.zzc(context, zzbewVar, str, z, z2, zzefVar, zzacmVar, zzaytVar, zzabyVar, zzkVar, zzbVar, zztuVar, zzdmiVar, zzdmjVar));
            zzbdsVar.setWebViewClient(com.google.android.gms.ads.internal.zzp.zzks().zza(zzbdsVar, zztuVar, z2));
            zzbdsVar.setWebChromeClient(new zzbcz(zzbdsVar));
            return zzbdsVar;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
