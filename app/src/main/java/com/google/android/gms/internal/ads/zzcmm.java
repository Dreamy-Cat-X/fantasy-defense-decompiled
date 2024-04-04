package com.google.android.gms.internal.ads;

import android.content.Context;
import com.kt.olleh.inapp.net.ResTags;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcmm {
    private final Context context;
    private final Executor executor;
    private final zzdmx zzfve;
    private final zzayt zzgms;

    public zzcmm(Context context, zzayt zzaytVar, zzdmx zzdmxVar, Executor executor) {
        this.context = context;
        this.zzgms = zzaytVar;
        this.zzfve = zzdmxVar;
        this.executor = executor;
    }

    public final zzdzl<zzdmt> zzarq() {
        final zzalq zza = com.google.android.gms.ads.internal.zzp.zzld().zzb(this.context, this.zzgms).zza("google.afma.response.normalize", zzalt.zzdjj, zzalt.zzdjj);
        final zzva zzvaVar = this.zzfve.zzhjd.zzchk;
        return zzdyz.zzb(zzdyz.zzb(zzdyz.zzb(zzdyz.zzag(""), new zzdyj(this, zzvaVar) { // from class: com.google.android.gms.internal.ads.zzcmp
            private final zzcmm zzgmu;
            private final zzva zzgmv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmu = this;
                this.zzgmv = zzvaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                zzva zzvaVar2 = this.zzgmv;
                String str = zzvaVar2.zzcgp;
                String str2 = zzvaVar2.zzcgq;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("headers", new JSONObject());
                jSONObject3.put("body", str);
                jSONObject2.put("base_url", "");
                jSONObject2.put("signals", new JSONObject(str2));
                jSONObject.put("request", jSONObject2);
                jSONObject.put(ResTags.RESPONSE, jSONObject3);
                jSONObject.put("flags", new JSONObject());
                return zzdyz.zzag(jSONObject);
            }
        }, this.executor), new zzdyj(zza) { // from class: com.google.android.gms.internal.ads.zzcmo
            private final zzalq zzgmt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmt = zza;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzgmt.zzh((JSONObject) obj);
            }
        }, this.executor), new zzdyj(this) { // from class: com.google.android.gms.internal.ads.zzcmr
            private final zzcmm zzgmu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmu = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzgmu.zzo((JSONObject) obj);
            }
        }, this.executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zzo(JSONObject jSONObject) throws Exception {
        return zzdyz.zzag(new zzdmt(new zzdms(this.zzfve), zzdmr.zza(new StringReader(jSONObject.toString()))));
    }
}
