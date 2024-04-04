package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcen {
    private final Executor zzfqs;
    private final zzdmx zzfve;
    private final zzcgx zzger;

    public zzcen(zzdmx zzdmxVar, Executor executor, zzcgx zzcgxVar) {
        this.zzfve = zzdmxVar;
        this.zzfqs = executor;
        this.zzger = zzcgxVar;
    }

    public final zzdzl<zzbdh> zzn(final JSONObject jSONObject) {
        return zzdyz.zzb(zzdyz.zzb(zzdyz.zzag(null), new zzdyj(this) { // from class: com.google.android.gms.internal.ads.zzceo
            private final zzcen zzggr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzggr = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzggr.zzq(obj);
            }
        }, this.zzfqs), new zzdyj(this, jSONObject) { // from class: com.google.android.gms.internal.ads.zzcem
            private final JSONObject zzfqn;
            private final zzcen zzggr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzggr = this;
                this.zzfqn = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzggr.zza(this.zzfqn, (zzbdh) obj);
            }
        }, this.zzfqs);
    }

    public final zzdzl<zzbdh> zzo(final String str, final String str2) {
        return zzdyz.zzb(zzdyz.zzag(null), new zzdyj(this, str, str2) { // from class: com.google.android.gms.internal.ads.zzcep
            private final String zzdhw;
            private final String zzdkf;
            private final zzcen zzggr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzggr = this;
                this.zzdhw = str;
                this.zzdkf = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzggr.zza(this.zzdhw, this.zzdkf, obj);
            }
        }, this.zzfqs);
    }

    private final void zzh(zzbdh zzbdhVar) {
        zzbdhVar.zza("/video", zzahg.zzdgl);
        zzbdhVar.zza("/videoMeta", zzahg.zzdgm);
        zzbdhVar.zza("/precache", new zzbco());
        zzbdhVar.zza("/delayPageLoaded", zzahg.zzdgp);
        zzbdhVar.zza("/instrument", zzahg.zzdgn);
        zzbdhVar.zza("/log", zzahg.zzdgg);
        zzbdhVar.zza("/videoClicked", zzahg.zzdgh);
        zzbdhVar.zzadi().zzay(true);
        zzbdhVar.zza("/click", zzahg.zzdgc);
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcsf)).booleanValue()) {
            zzbdhVar.zza("/getNativeAdViewSignals", zzahg.zzdgs);
        }
        if (this.zzfve.zzdty != null) {
            zzbdhVar.zzadi().zzaz(true);
            zzbdhVar.zza("/open", new zzahz(null, null, null, null, null));
        } else {
            zzbdhVar.zzadi().zzaz(false);
        }
        if (com.google.android.gms.ads.internal.zzp.zzlo().zzz(zzbdhVar.getContext())) {
            zzbdhVar.zza("/logScionEvent", new zzahx(zzbdhVar.getContext()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zzq(Object obj) throws Exception {
        zzbdh zza = this.zzger.zza(zzvp.zzqd(), null, null);
        final zzazd zzk = zzazd.zzk(zza);
        zzh(zza);
        zza.zzadi().zza(new zzbev(zzk) { // from class: com.google.android.gms.internal.ads.zzcer
            private final zzazd zzeqa;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzeqa = zzk;
            }

            @Override // com.google.android.gms.internal.ads.zzbev
            public final void zzuk() {
                this.zzeqa.zzaaa();
            }
        });
        zza.loadUrl((String) zzwo.zzqq().zzd(zzabh.zzcse));
        return zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(String str, String str2, Object obj) throws Exception {
        final zzbdh zza = this.zzger.zza(zzvp.zzqd(), null, null);
        final zzazd zzk = zzazd.zzk(zza);
        zzh(zza);
        if (this.zzfve.zzdty != null) {
            zza.zza(zzbew.zzael());
        } else {
            zza.zza(zzbew.zzaek());
        }
        zza.zzadi().zza(new zzbes(this, zza, zzk) { // from class: com.google.android.gms.internal.ads.zzceq
            private final zzbdh zzgfd;
            private final zzcen zzggr;
            private final zzazd zzggs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzggr = this;
                this.zzgfd = zza;
                this.zzggs = zzk;
            }

            @Override // com.google.android.gms.internal.ads.zzbes
            public final void zzai(boolean z) {
                this.zzggr.zza(this.zzgfd, this.zzggs, z);
            }
        });
        zza.zzb(str, str2, null);
        return zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbdh zzbdhVar, zzazd zzazdVar, boolean z) {
        if (z) {
            if (this.zzfve.zzhjc != null && zzbdhVar.zzaay() != null) {
                zzbdhVar.zzaay().zzb(this.zzfve.zzhjc);
            }
            zzazdVar.zzaaa();
            return;
        }
        zzazdVar.setException(new zzcuh(zzdnu.INTERNAL_ERROR, "Instream video Web View failed to load."));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(JSONObject jSONObject, final zzbdh zzbdhVar) throws Exception {
        final zzazd zzk = zzazd.zzk(zzbdhVar);
        if (this.zzfve.zzdty != null) {
            zzbdhVar.zza(zzbew.zzael());
        } else {
            zzbdhVar.zza(zzbew.zzaek());
        }
        zzbdhVar.zzadi().zza(new zzbes(this, zzbdhVar, zzk) { // from class: com.google.android.gms.internal.ads.zzcet
            private final zzbdh zzgfd;
            private final zzcen zzggr;
            private final zzazd zzggs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzggr = this;
                this.zzgfd = zzbdhVar;
                this.zzggs = zzk;
            }

            @Override // com.google.android.gms.internal.ads.zzbes
            public final void zzai(boolean z) {
                this.zzggr.zzb(this.zzgfd, this.zzggs, z);
            }
        });
        zzbdhVar.zzb("google.afma.nativeAds.renderVideo", jSONObject);
        return zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzbdh zzbdhVar, zzazd zzazdVar, boolean z) {
        if (this.zzfve.zzhjc != null && zzbdhVar.zzaay() != null) {
            zzbdhVar.zzaay().zzb(this.zzfve.zzhjc);
        }
        zzazdVar.zzaaa();
    }
}
