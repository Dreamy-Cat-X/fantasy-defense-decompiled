package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcfp {
    private final Context context;
    private final zzbdp zzbpq;
    private final zzcju zzdgu;
    private final zzdro zzdgv;
    private final zzcpy zzdgy;
    private final zzayt zzdsc;
    private final zzef zzequ;
    private final zzdsh zzfpv;
    private final Executor zzfqs;
    private final com.google.android.gms.ads.internal.zzb zzggg;
    private final zzcfx zzghd = new zzcfx(null);
    private final zzaib zzghe = new zzaib();
    private zzdzl<zzbdh> zzghf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfp(zzcfy zzcfyVar) {
        this.context = zzcfy.zza(zzcfyVar);
        this.zzfqs = zzcfy.zzb(zzcfyVar);
        this.zzequ = zzcfy.zzc(zzcfyVar);
        this.zzdsc = zzcfy.zzd(zzcfyVar);
        this.zzggg = zzcfy.zze(zzcfyVar);
        this.zzbpq = zzcfy.zzf(zzcfyVar);
        this.zzdgy = zzcfy.zzg(zzcfyVar);
        this.zzfpv = zzcfy.zzh(zzcfyVar);
        this.zzdgu = zzcfy.zzi(zzcfyVar);
        this.zzdgv = zzcfy.zzj(zzcfyVar);
    }

    public final synchronized void zzapm() {
        zzdzl<zzbdh> zzb = zzdyz.zzb(zzbdp.zza(this.context, this.zzdsc, (String) zzwo.zzqq().zzd(zzabh.zzcsc), this.zzequ, this.zzggg), new zzdvo(this) { // from class: com.google.android.gms.internal.ads.zzcfo
            private final zzcfp zzghc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzghc = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdvo
            public final Object apply(Object obj) {
                return this.zzghc.zzj((zzbdh) obj);
            }
        }, this.zzfqs);
        this.zzghf = zzb;
        zzayy.zza(zzb, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void destroy() {
        if (this.zzghf == null) {
            return;
        }
        zzdyz.zza(this.zzghf, new zzcfq(this), this.zzfqs);
        this.zzghf = null;
    }

    public final synchronized zzdzl<JSONObject> zzc(final String str, final JSONObject jSONObject) {
        if (this.zzghf == null) {
            return zzdyz.zzag(null);
        }
        return zzdyz.zzb(this.zzghf, new zzdyj(this, str, jSONObject) { // from class: com.google.android.gms.internal.ads.zzcfr
            private final String zzdhw;
            private final zzcfp zzghc;
            private final JSONObject zzghg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzghc = this;
                this.zzdhw = str;
                this.zzghg = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzghc.zza(this.zzdhw, this.zzghg, (zzbdh) obj);
            }
        }, this.zzfqs);
    }

    public final synchronized void zza(String str, zzahv<Object> zzahvVar) {
        if (this.zzghf == null) {
            return;
        }
        zzdyz.zza(this.zzghf, new zzcft(this, str, zzahvVar), this.zzfqs);
    }

    public final synchronized void zzb(String str, zzahv<Object> zzahvVar) {
        if (this.zzghf == null) {
            return;
        }
        zzdyz.zza(this.zzghf, new zzcfs(this, str, zzahvVar), this.zzfqs);
    }

    public final synchronized void zza(String str, Map<String, ?> map) {
        if (this.zzghf == null) {
            return;
        }
        zzdyz.zza(this.zzghf, new zzcfv(this, str, map), this.zzfqs);
    }

    public final synchronized void zza(zzdmi zzdmiVar, zzdmj zzdmjVar) {
        if (this.zzghf == null) {
            return;
        }
        zzdyz.zza(this.zzghf, new zzcfu(this, zzdmiVar, zzdmjVar), this.zzfqs);
    }

    public final <T> void zza(WeakReference<T> weakReference, String str, zzahv<T> zzahvVar) {
        zza(str, new zzcgb(this, weakReference, str, zzahvVar, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(String str, JSONObject jSONObject, zzbdh zzbdhVar) throws Exception {
        return this.zzghe.zza(zzbdhVar, str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbdh zzj(zzbdh zzbdhVar) {
        zzbdhVar.zza("/result", this.zzghe);
        zzbet zzadi = zzbdhVar.zzadi();
        zzcfx zzcfxVar = this.zzghd;
        zzadi.zza(null, zzcfxVar, zzcfxVar, zzcfxVar, zzcfxVar, false, null, new com.google.android.gms.ads.internal.zza(this.context, null, null), null, null, this.zzdgy, this.zzfpv, this.zzdgu, this.zzdgv);
        return zzbdhVar;
    }
}
