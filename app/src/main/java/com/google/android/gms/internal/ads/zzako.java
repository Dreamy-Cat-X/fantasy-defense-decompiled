package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzako {
    private final Context context;
    private final Object lock;
    private int status;
    private final zzayt zzbpd;
    private final String zzdie;
    private com.google.android.gms.ads.internal.util.zzau<zzakb> zzdif;
    private com.google.android.gms.ads.internal.util.zzau<zzakb> zzdig;
    private zzalf zzdih;

    private zzako(Context context, zzayt zzaytVar, String str) {
        this.lock = new Object();
        this.status = 1;
        this.zzdie = str;
        this.context = context.getApplicationContext();
        this.zzbpd = zzaytVar;
        this.zzdif = new zzalc();
        this.zzdig = new zzalc();
    }

    public zzako(Context context, zzayt zzaytVar, String str, com.google.android.gms.ads.internal.util.zzau<zzakb> zzauVar, com.google.android.gms.ads.internal.util.zzau<zzakb> zzauVar2) {
        this(context, zzaytVar, str);
        this.zzdif = zzauVar;
        this.zzdig = zzauVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzalf zza(final zzef zzefVar) {
        final zzalf zzalfVar = new zzalf(this.zzdig);
        zzayv.zzegm.execute(new Runnable(this, zzefVar, zzalfVar) { // from class: com.google.android.gms.internal.ads.zzakn
            private final zzako zzdib;
            private final zzef zzdic;
            private final zzalf zzdid;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdib = this;
                this.zzdic = zzefVar;
                this.zzdid = zzalfVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdib.zza(this.zzdic, this.zzdid);
            }
        });
        zzalfVar.zza(new zzakx(this, zzalfVar), new zzala(this, zzalfVar));
        return zzalfVar;
    }

    public final zzalb zzb(zzef zzefVar) {
        synchronized (this.lock) {
            synchronized (this.lock) {
                if (this.zzdih != null && this.status == 0) {
                    this.zzdih.zza(new zzazg(this) { // from class: com.google.android.gms.internal.ads.zzakq
                        private final zzako zzdib;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdib = this;
                        }

                        @Override // com.google.android.gms.internal.ads.zzazg
                        public final void zzg(Object obj) {
                            this.zzdib.zza((zzakb) obj);
                        }
                    }, zzakp.zzdii);
                }
            }
            if (this.zzdih != null && this.zzdih.getStatus() != -1) {
                if (this.status == 0) {
                    return this.zzdih.zzul();
                }
                if (this.status == 1) {
                    this.status = 2;
                    zza((zzef) null);
                    return this.zzdih.zzul();
                }
                if (this.status == 2) {
                    return this.zzdih.zzul();
                }
                return this.zzdih.zzul();
            }
            this.status = 2;
            zzalf zza = zza((zzef) null);
            this.zzdih = zza;
            return zza.zzul();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzakb zzakbVar) {
        if (zzakbVar.isDestroyed()) {
            this.status = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzef zzefVar, final zzalf zzalfVar) {
        try {
            final zzakd zzakdVar = new zzakd(this.context, this.zzbpd, zzefVar, null);
            zzakdVar.zza(new zzake(this, zzalfVar, zzakdVar) { // from class: com.google.android.gms.internal.ads.zzaks
                private final zzako zzdib;
                private final zzalf zzdij;
                private final zzakb zzdik;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdib = this;
                    this.zzdij = zzalfVar;
                    this.zzdik = zzakdVar;
                }

                @Override // com.google.android.gms.internal.ads.zzake
                public final void zzuj() {
                    com.google.android.gms.ads.internal.util.zzm.zzecu.postDelayed(new Runnable(this.zzdib, this.zzdij, this.zzdik) { // from class: com.google.android.gms.internal.ads.zzakr
                        private final zzako zzdib;
                        private final zzalf zzdij;
                        private final zzakb zzdik;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdib = r1;
                            this.zzdij = r2;
                            this.zzdik = r3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzdib.zza(this.zzdij, this.zzdik);
                        }
                    }, zzakz.zzdit);
                }
            });
            zzakdVar.zza("/jsLoaded", new zzakt(this, zzalfVar, zzakdVar));
            com.google.android.gms.ads.internal.util.zzbr zzbrVar = new com.google.android.gms.ads.internal.util.zzbr();
            zzakw zzakwVar = new zzakw(this, zzefVar, zzakdVar, zzbrVar);
            zzbrVar.set(zzakwVar);
            zzakdVar.zza("/requestReload", zzakwVar);
            if (this.zzdie.endsWith(".js")) {
                zzakdVar.zzcw(this.zzdie);
            } else if (this.zzdie.startsWith("<html>")) {
                zzakdVar.zzcy(this.zzdie);
            } else {
                zzakdVar.zzcx(this.zzdie);
            }
            com.google.android.gms.ads.internal.util.zzm.zzecu.postDelayed(new zzakv(this, zzalfVar, zzakdVar), zzakz.zzdis);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Error creating webview.", th);
            com.google.android.gms.ads.internal.zzp.zzku().zza(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzalfVar.reject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzalf zzalfVar, zzakb zzakbVar) {
        synchronized (this.lock) {
            if (zzalfVar.getStatus() != -1 && zzalfVar.getStatus() != 1) {
                zzalfVar.reject();
                zzdzk zzdzkVar = zzayv.zzegm;
                zzakbVar.getClass();
                zzdzkVar.execute(zzaku.zzb(zzakbVar));
                com.google.android.gms.ads.internal.util.zzd.zzeb("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
