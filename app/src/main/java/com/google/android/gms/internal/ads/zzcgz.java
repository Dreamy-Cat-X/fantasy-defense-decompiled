package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcgz {
    private final zzawd zzbof;
    private final zzcju zzdgu;
    private final zzdro zzdgv;
    private final zzcpy zzdgy;
    private final zzef zzequ;
    private final zzdsh zzfpv;
    private final Executor zzfqs;
    private final zzbrr zzfvb;
    private final zzbso zzfzs;
    private final zzbqq zzgaq;
    private final zzbjf zzgar;
    private final zzbxe zzgat;
    private final zzbsf zzghm;
    private final zzbuy zzghn;
    private final com.google.android.gms.ads.internal.zza zzgih;
    private final zzbrl zzgii;
    private final zzbun zzgij;

    public zzcgz(zzbqq zzbqqVar, zzbrr zzbrrVar, zzbsf zzbsfVar, zzbso zzbsoVar, zzbuy zzbuyVar, Executor executor, zzbxe zzbxeVar, zzbjf zzbjfVar, com.google.android.gms.ads.internal.zza zzaVar, zzbrl zzbrlVar, zzawd zzawdVar, zzef zzefVar, zzbun zzbunVar, zzcpy zzcpyVar, zzdsh zzdshVar, zzcju zzcjuVar, zzdro zzdroVar) {
        this.zzgaq = zzbqqVar;
        this.zzfvb = zzbrrVar;
        this.zzghm = zzbsfVar;
        this.zzfzs = zzbsoVar;
        this.zzghn = zzbuyVar;
        this.zzfqs = executor;
        this.zzgat = zzbxeVar;
        this.zzgar = zzbjfVar;
        this.zzgih = zzaVar;
        this.zzgii = zzbrlVar;
        this.zzbof = zzawdVar;
        this.zzequ = zzefVar;
        this.zzgij = zzbunVar;
        this.zzdgy = zzcpyVar;
        this.zzfpv = zzdshVar;
        this.zzdgu = zzcjuVar;
        this.zzdgv = zzdroVar;
    }

    public final void zza(final zzbdh zzbdhVar, boolean z) {
        zzdv zzca;
        zzbdhVar.zzadi().zza(new zzuz(this) { // from class: com.google.android.gms.internal.ads.zzcgy
            private final zzcgz zzgig;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgig = this;
            }

            @Override // com.google.android.gms.internal.ads.zzuz
            public final void onAdClicked() {
                this.zzgig.zzapt();
            }
        }, this.zzghm, this.zzfzs, new zzahe(this) { // from class: com.google.android.gms.internal.ads.zzchb
            private final zzcgz zzgig;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgig = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahe
            public final void onAppEvent(String str, String str2) {
                this.zzgig.zzp(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzu(this) { // from class: com.google.android.gms.internal.ads.zzcha
            private final zzcgz zzgig;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgig = this;
            }

            @Override // com.google.android.gms.ads.internal.overlay.zzu
            public final void zzwe() {
                this.zzgig.zzaps();
            }
        }, z, null, this.zzgih, new zzchj(this), this.zzbof, this.zzdgy, this.zzfpv, this.zzdgu, this.zzdgv);
        zzbdhVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.google.android.gms.internal.ads.zzchd
            private final zzcgz zzgig;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgig = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.zzgig.zza(view, motionEvent);
            }
        });
        zzbdhVar.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.gms.internal.ads.zzchc
            private final zzcgz zzgig;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgig = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.zzgig.zzae(view);
            }
        });
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcrh)).booleanValue() && (zzca = this.zzequ.zzca()) != null) {
            zzca.zzb(zzbdhVar.getView());
        }
        this.zzgat.zza(zzbdhVar, this.zzfqs);
        this.zzgat.zza(new zzqv(zzbdhVar) { // from class: com.google.android.gms.internal.ads.zzchf
            private final zzbdh zzesn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzesn = zzbdhVar;
            }

            @Override // com.google.android.gms.internal.ads.zzqv
            public final void zza(zzqw zzqwVar) {
                this.zzesn.zzadi().zza(zzqwVar.zzbrn.left, zzqwVar.zzbrn.top, false);
            }
        }, this.zzfqs);
        this.zzgat.zzv(zzbdhVar.getView());
        zzbdhVar.zza("/trackActiveViewUnit", new zzahv(this, zzbdhVar) { // from class: com.google.android.gms.internal.ads.zzche
            private final zzbdh zzgfd;
            private final zzcgz zzgig;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgig = this;
                this.zzgfd = zzbdhVar;
            }

            @Override // com.google.android.gms.internal.ads.zzahv
            public final void zza(Object obj, Map map) {
                this.zzgig.zza(this.zzgfd, (zzbdh) obj, map);
            }
        });
        this.zzgar.zzn(zzbdhVar);
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcom)).booleanValue()) {
            return;
        }
        zzbrl zzbrlVar = this.zzgii;
        zzbdhVar.getClass();
        zzbrlVar.zza(zzchh.zzk(zzbdhVar), this.zzfqs);
    }

    public static zzdzl<?> zza(zzbdh zzbdhVar, String str, String str2) {
        final zzazc zzazcVar = new zzazc();
        zzbdhVar.zzadi().zza(new zzbes(zzazcVar) { // from class: com.google.android.gms.internal.ads.zzchg
            private final zzazc zzbvl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbvl = zzazcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbes
            public final void zzai(boolean z) {
                zzazc zzazcVar2 = this.zzbvl;
                if (z) {
                    zzazcVar2.set(null);
                } else {
                    zzazcVar2.setException(new Exception("Ad Web View failed to load."));
                }
            }
        });
        zzbdhVar.zzb(str, str2, null);
        return zzazcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbdh zzbdhVar, zzbdh zzbdhVar2, Map map) {
        this.zzgar.zzc(zzbdhVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzae(View view) {
        this.zzgih.recordClick();
        zzawd zzawdVar = this.zzbof;
        if (zzawdVar != null) {
            zzawdVar.zzwv();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ boolean zza(View view, MotionEvent motionEvent) {
        this.zzgih.recordClick();
        zzawd zzawdVar = this.zzbof;
        if (zzawdVar == null) {
            return false;
        }
        zzawdVar.zzwv();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaps() {
        this.zzfvb.onAdLeftApplication();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(String str, String str2) {
        this.zzghn.onAppEvent(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzapt() {
        this.zzgaq.onAdClicked();
    }
}
