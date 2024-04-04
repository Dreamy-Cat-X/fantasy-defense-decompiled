package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzckx {
    private final Executor executor;
    private final zzayt zzbos;
    private final Context zzcln;
    private final Executor zzfqs;
    private final ScheduledExecutorService zzfro;
    private final WeakReference<Context> zzgld;
    private final zzchu zzgle;
    private final zzckh zzglf;
    private final zzbwl zzglh;
    private boolean zzgkz = false;
    private boolean zzgla = false;
    private final zzazc<Boolean> zzglc = new zzazc<>();
    private Map<String, zzaiv> zzglg = new ConcurrentHashMap();
    private boolean enabled = true;
    private final long zzglb = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime();

    public zzckx(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, zzchu zzchuVar, ScheduledExecutorService scheduledExecutorService, zzckh zzckhVar, zzayt zzaytVar, zzbwl zzbwlVar) {
        this.zzgle = zzchuVar;
        this.zzcln = context;
        this.zzgld = weakReference;
        this.executor = executor2;
        this.zzfro = scheduledExecutorService;
        this.zzfqs = executor;
        this.zzglf = zzckhVar;
        this.zzbos = zzaytVar;
        this.zzglh = zzbwlVar;
        zza("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public final void disable() {
        this.enabled = false;
    }

    public final void zzb(final zzajc zzajcVar) {
        this.zzglc.addListener(new Runnable(this, zzajcVar) { // from class: com.google.android.gms.internal.ads.zzckw
            private final zzckx zzgkx;
            private final zzajc zzgky;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgkx = this;
                this.zzgky = zzajcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgkx.zzc(this.zzgky);
            }
        }, this.zzfqs);
    }

    public final void zzard() {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqq)).booleanValue() && !zzadf.zzddd.get().booleanValue()) {
            if (this.zzbos.zzegf >= ((Integer) zzwo.zzqq().zzd(zzabh.zzcqr)).intValue() && this.enabled) {
                if (this.zzgkz) {
                    return;
                }
                synchronized (this) {
                    if (this.zzgkz) {
                        return;
                    }
                    this.zzglf.zzara();
                    this.zzglh.zzamk();
                    this.zzglc.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzckz
                        private final zzckx zzgkx;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzgkx = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzgkx.zzari();
                        }
                    }, this.executor);
                    this.zzgkz = true;
                    zzdzl<String> zzarf = zzarf();
                    this.zzfro.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzclb
                        private final zzckx zzgkx;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzgkx = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzgkx.zzarh();
                        }
                    }, ((Long) zzwo.zzqq().zzd(zzabh.zzcqt)).longValue(), TimeUnit.SECONDS);
                    zzdyz.zza(zzarf, new zzcle(this), this.executor);
                    return;
                }
            }
        }
        if (this.zzgkz) {
            return;
        }
        zza("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zzglc.set(false);
        this.zzgkz = true;
    }

    public final List<zzaiv> zzare() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzglg.keySet()) {
            zzaiv zzaivVar = this.zzglg.get(str);
            arrayList.add(new zzaiv(str, zzaivVar.zzdhl, zzaivVar.zzdhm, zzaivVar.description));
        }
        return arrayList;
    }

    private final synchronized zzdzl<String> zzarf() {
        String zzxw = com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzyl().zzxw();
        if (!TextUtils.isEmpty(zzxw)) {
            return zzdyz.zzag(zzxw);
        }
        final zzazc zzazcVar = new zzazc();
        com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzb(new Runnable(this, zzazcVar) { // from class: com.google.android.gms.internal.ads.zzcky
            private final zzckx zzgkx;
            private final zzazc zzgli;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgkx = this;
                this.zzgli = zzazcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgkx.zza(this.zzgli);
            }
        });
        return zzazcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzgh(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final Object obj = new Object();
                final zzazc zzazcVar = new zzazc();
                zzdzl zza = zzdyz.zza(zzazcVar, ((Long) zzwo.zzqq().zzd(zzabh.zzcqs)).longValue(), TimeUnit.SECONDS, this.zzfro);
                this.zzglf.zzgf(next);
                this.zzglh.zzft(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime();
                Iterator<String> it = keys;
                zza.addListener(new Runnable(this, obj, zzazcVar, next, elapsedRealtime) { // from class: com.google.android.gms.internal.ads.zzcla
                    private final Object zzdkb;
                    private final String zzgjb;
                    private final zzckx zzgkx;
                    private final zzazc zzglj;
                    private final long zzglk;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgkx = this;
                        this.zzdkb = obj;
                        this.zzglj = zzazcVar;
                        this.zzgjb = next;
                        this.zzglk = elapsedRealtime;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzgkx.zza(this.zzdkb, this.zzglj, this.zzgjb, this.zzglk);
                    }
                }, this.executor);
                arrayList.add(zza);
                final zzclg zzclgVar = new zzclg(this, obj, next, elapsedRealtime, zzazcVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                }
                            }
                            arrayList2.add(new zzajf(optString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                zza(next, false, "", 0);
                try {
                    try {
                        final zzdno zzd = this.zzgle.zzd(next, new JSONObject());
                        this.zzfqs.execute(new Runnable(this, zzd, zzclgVar, arrayList2, next) { // from class: com.google.android.gms.internal.ads.zzclc
                            private final String zzepz;
                            private final zzckx zzgkx;
                            private final zzdno zzgll;
                            private final zzaix zzglm;
                            private final List zzgln;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zzgkx = this;
                                this.zzgll = zzd;
                                this.zzglm = zzclgVar;
                                this.zzgln = arrayList2;
                                this.zzepz = next;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zzgkx.zza(this.zzgll, this.zzglm, this.zzgln, this.zzepz);
                            }
                        });
                    } catch (RemoteException e) {
                        zzaym.zzc("", e);
                    }
                } catch (zzdnf unused2) {
                    zzclgVar.onInitializationFailed("Failed to create Adapter.");
                }
                keys = it;
            }
            zzdyz.zzj(arrayList).zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcld
                private final zzckx zzgkx;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgkx = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zzgkx.zzarg();
                }
            }, this.executor);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zzd.zza("Malformed CLD response", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str, boolean z, String str2, int i) {
        this.zzglg.put(str, new zzaiv(str, z, i, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzdno zzdnoVar, zzaix zzaixVar, List list, String str) {
        try {
            try {
                Context context = this.zzgld.get();
                if (context == null) {
                    context = this.zzcln;
                }
                zzdnoVar.zza(context, zzaixVar, (List<zzajf>) list);
            } catch (zzdnf unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
                sb.append("Failed to initialize adapter. ");
                sb.append(str);
                sb.append(" does not implement the initialize() method.");
                zzaixVar.onInitializationFailed(sb.toString());
            }
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzarg() throws Exception {
        this.zzglc.set(true);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, zzazc zzazcVar, String str, long j) {
        synchronized (obj) {
            if (!zzazcVar.isDone()) {
                zza(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - j));
                this.zzglf.zzs(str, "timeout");
                this.zzglh.zzm(str, "timeout");
                zzazcVar.set(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzarh() {
        synchronized (this) {
            if (this.zzgla) {
                return;
            }
            zza("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - this.zzglb));
            this.zzglc.setException(new Exception());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(final zzazc zzazcVar) {
        this.executor.execute(new Runnable(this, zzazcVar) { // from class: com.google.android.gms.internal.ads.zzclf
            private final zzckx zzgkx;
            private final zzazc zzgli;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgkx = this;
                this.zzgli = zzazcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzazc zzazcVar2 = this.zzgli;
                String zzxw = com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzyl().zzxw();
                if (!TextUtils.isEmpty(zzxw)) {
                    zzazcVar2.set(zzxw);
                } else {
                    zzazcVar2.setException(new Exception());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzari() {
        this.zzglf.zzarb();
        this.zzglh.zzaml();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzajc zzajcVar) {
        try {
            zzajcVar.zze(zzare());
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zza(zzckx zzckxVar, boolean z) {
        zzckxVar.zzgla = true;
        return true;
    }
}
