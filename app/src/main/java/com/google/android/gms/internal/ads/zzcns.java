package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcns extends zzask {
    private final Context context;
    private final Executor zzfqs;
    private final zzatl zzgnt;
    private final zzati zzgnu;
    private final zzbij zzgnv;
    private final HashMap<String, zzcoh> zzgnw;

    public zzcns(Context context, Executor executor, zzatl zzatlVar, zzbij zzbijVar, zzati zzatiVar, HashMap<String, zzcoh> hashMap) {
        zzabh.initialize(context);
        this.context = context;
        this.zzfqs = executor;
        this.zzgnt = zzatlVar;
        this.zzgnu = zzatiVar;
        this.zzgnv = zzbijVar;
        this.zzgnw = hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final zzash zza(zzasf zzasfVar) throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final void zza(zzasf zzasfVar, zzasm zzasmVar) throws RemoteException {
    }

    public final zzdzl<InputStream> zzb(zzasu zzasuVar, int i) {
        zzaly zza = com.google.android.gms.ads.internal.zzp.zzld().zza(this.context, zzayt.zzzz());
        zzdfm zza2 = this.zzgnv.zza(zzasuVar, i);
        zzalq zza3 = zza.zza("google.afma.response.normalize", zzcog.zzgoe, zzalt.zzdjk);
        zzcol zzcolVar = new zzcol(this.context, zzasuVar.zzdsc.zzbrf, this.zzgnt, zzasuVar.zzdtc, i);
        zzdqy zzaha = zza2.zzaha();
        zzcoh zzcohVar = null;
        if (!zzadi.zzddk.get().booleanValue()) {
            if (zzasuVar.zzdvq != null && !zzasuVar.zzdvq.isEmpty()) {
                com.google.android.gms.ads.internal.util.zzd.zzeb("Request contained a PoolKey but split request is disabled.");
            }
        } else if (zzasuVar.zzdvq != null && !zzasuVar.zzdvq.isEmpty() && (zzcohVar = this.zzgnw.remove(zzasuVar.zzdvq)) == null) {
            com.google.android.gms.ads.internal.util.zzd.zzeb("Request contained a PoolKey but no matching parameters were found.");
        }
        if (zzcohVar == null) {
            final zzdzl<JSONObject> zza4 = zza(zzasuVar, zzaha, zza2);
            final zzdzl<zzata> zza5 = zza(zza4, zzaha, zza);
            final zzdql zzaxm = zzaha.zza((zzdqy) zzdqz.HTTP, zza5, zza4).zzb(new Callable(zza4, zza5) { // from class: com.google.android.gms.internal.ads.zzcnv
                private final zzdzl zzfxc;
                private final zzdzl zzggn;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzggn = zza4;
                    this.zzfxc = zza5;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzcok((JSONObject) this.zzggn.get(), (zzata) this.zzfxc.get());
                }
            }).zzb(zzcolVar).zzaxm();
            return zzaha.zza((zzdqy) zzdqz.PRE_PROCESS, zza4, zza5, zzaxm).zzb(new Callable(zzaxm, zza4, zza5) { // from class: com.google.android.gms.internal.ads.zzcnu
                private final zzdzl zzfux;
                private final zzdzl zzfxc;
                private final zzdzl zzggn;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzggn = zzaxm;
                    this.zzfxc = zza4;
                    this.zzfux = zza5;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzcog((zzcon) this.zzggn.get(), (JSONObject) this.zzfxc.get(), (zzata) this.zzfux.get());
                }
            }).zza(zza3).zzaxm();
        }
        final zzdql zzaxm2 = zzaha.zza((zzdqy) zzdqz.HTTP, zzdyz.zzag(new zzcok(zzcohVar.zzgoc, zzcohVar.zzgod))).zzb(zzcolVar).zzaxm();
        final zzdzl<?> zzag = zzdyz.zzag(zzcohVar);
        return zzaha.zza((zzdqy) zzdqz.PRE_PROCESS, zzaxm2, zzag).zzb(new Callable(zzaxm2, zzag) { // from class: com.google.android.gms.internal.ads.zzcnx
            private final zzdzl zzfxc;
            private final zzdzl zzggn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzggn = zzaxm2;
                this.zzfxc = zzag;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdzl zzdzlVar = this.zzggn;
                zzdzl zzdzlVar2 = this.zzfxc;
                return new zzcog((zzcon) zzdzlVar.get(), ((zzcoh) zzdzlVar2.get()).zzgoc, ((zzcoh) zzdzlVar2.get()).zzgod);
            }
        }).zza(zza3).zzaxm();
    }

    private static zzdzl<JSONObject> zza(zzasu zzasuVar, zzdqy zzdqyVar, final zzdfm zzdfmVar) {
        zzdyj zzdyjVar = new zzdyj(zzdfmVar) { // from class: com.google.android.gms.internal.ads.zzcnw
            private final zzdfm zzgnx;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgnx = zzdfmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzgnx.zzagy().zzs(com.google.android.gms.ads.internal.zzp.zzkq().zzc((Bundle) obj));
            }
        };
        return zzdqyVar.zza((zzdqy) zzdqz.GMS_SIGNALS, zzdyz.zzag(zzasuVar.zzdvn)).zza(zzdyjVar).zzb(zzcnz.zzgmf).zzaxm();
    }

    private static zzdzl<zzata> zza(zzdzl<JSONObject> zzdzlVar, zzdqy zzdqyVar, zzaly zzalyVar) {
        return zzdqyVar.zza((zzdqy) zzdqz.BUILD_URL, (zzdzl) zzdzlVar).zza(zzalyVar.zza("AFMA_getAdDictionary", zzalt.zzdjj, zzcny.zzdjl)).zzaxm();
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final void zza(zzasu zzasuVar, zzaso zzasoVar) {
        zzdzl<InputStream> zzb = zzb(zzasuVar, Binder.getCallingUid());
        zza(zzb, zzasoVar);
        zzb.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcob
            private final zzcns zzgny;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgny = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgny.zzars();
            }
        }, this.zzfqs);
    }

    public final zzdzl<InputStream> zzc(zzasu zzasuVar, int i) {
        if (!zzadi.zzddk.get().booleanValue()) {
            return zzdyz.immediateFailedFuture(new Exception("Split request is disabled."));
        }
        if (zzasuVar.zzdvp == null) {
            return zzdyz.immediateFailedFuture(new Exception("Pool configuration missing from request."));
        }
        if (zzasuVar.zzdvp.zzhly == 0 || zzasuVar.zzdvp.zzhlz == 0) {
            return zzdyz.immediateFailedFuture(new Exception("Caching is disabled."));
        }
        zzaly zza = com.google.android.gms.ads.internal.zzp.zzld().zza(this.context, zzayt.zzzz());
        zzdfm zza2 = this.zzgnv.zza(zzasuVar, i);
        zzdqy zzaha = zza2.zzaha();
        final zzdzl<JSONObject> zza3 = zza(zzasuVar, zzaha, zza2);
        final zzdzl<zzata> zza4 = zza(zza3, zzaha, zza);
        return zzaha.zza((zzdqy) zzdqz.GET_URL_AND_CACHE_KEY, zza3, zza4).zzb(new Callable(this, zza4, zza3) { // from class: com.google.android.gms.internal.ads.zzcoa
            private final zzdzl zzfux;
            private final zzdzl zzfxc;
            private final zzcns zzgny;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgny = this;
                this.zzfxc = zza4;
                this.zzfux = zza3;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgny.zza(this.zzfxc, this.zzfux);
            }
        }).zzaxm();
    }

    public final zzdzl<InputStream> zzgj(String str) {
        if (!zzadi.zzddk.get().booleanValue()) {
            return zzdyz.immediateFailedFuture(new Exception("Split request is disabled."));
        }
        zzcof zzcofVar = new zzcof(this);
        if (this.zzgnw.remove(str) == null) {
            String valueOf = String.valueOf(str);
            return zzdyz.immediateFailedFuture(new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
        }
        return zzdyz.zzag(zzcofVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final void zzc(zzasu zzasuVar, zzaso zzasoVar) {
        zza(zzc(zzasuVar, Binder.getCallingUid()), zzasoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final void zza(String str, zzaso zzasoVar) {
        zza(zzgj(str), zzasoVar);
    }

    public final zzdzl<InputStream> zzd(zzasu zzasuVar, int i) {
        zzaly zza = com.google.android.gms.ads.internal.zzp.zzld().zza(this.context, zzayt.zzzz());
        if (!zzado.zzdeb.get().booleanValue()) {
            return zzdyz.immediateFailedFuture(new Exception("Signal collection disabled."));
        }
        zzdfm zza2 = this.zzgnv.zza(zzasuVar, i);
        final zzdet<JSONObject> zzagz = zza2.zzagz();
        return zza2.zzaha().zza((zzdqy) zzdqz.GET_SIGNALS, zzdyz.zzag(zzasuVar.zzdvn)).zza(new zzdyj(zzagz) { // from class: com.google.android.gms.internal.ads.zzcod
            private final zzdet zzgnz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgnz = zzagz;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzgnz.zzs(com.google.android.gms.ads.internal.zzp.zzkq().zzc((Bundle) obj));
            }
        }).zzv(zzdqz.JS_SIGNALS).zza(zza.zza("google.afma.request.getSignals", zzalt.zzdjj, zzalt.zzdjk)).zzaxm();
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final void zzb(zzasu zzasuVar, zzaso zzasoVar) {
        zza(zzd(zzasuVar, Binder.getCallingUid()), zzasoVar);
    }

    private final void zza(zzdzl<InputStream> zzdzlVar, zzaso zzasoVar) {
        zzdyz.zza(zzdyz.zzb(zzdzlVar, new zzdyj(this) { // from class: com.google.android.gms.internal.ads.zzcoc
            private final zzcns zzgny;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgny = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return zzdyz.zzag(zzdnq.zze((InputStream) obj));
            }
        }, zzayv.zzegi), new zzcoe(this, zzasoVar), zzayv.zzegn);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ InputStream zza(zzdzl zzdzlVar, zzdzl zzdzlVar2) throws Exception {
        String zzwp = ((zzata) zzdzlVar.get()).zzwp();
        this.zzgnw.put(zzwp, new zzcoh((zzata) zzdzlVar.get(), (JSONObject) zzdzlVar2.get()));
        return new ByteArrayInputStream(zzwp.getBytes(zzdvm.UTF_8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzars() {
        zzayy.zza(this.zzgnu.zzwr(), "persistFlags");
    }
}
