package com.google.android.gms.internal.ads;

import com.kt.olleh.inapp.net.ResTags;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcte implements zzctf<zzcaz> {
    private final zzdzk zzgfs;
    private final zzbzz zzgsv;
    private final zzcds zzgsw;
    private final zzdnr<zzcfp> zzgsx;

    public zzcte(zzbzz zzbzzVar, zzdzk zzdzkVar, zzcds zzcdsVar, zzdnr<zzcfp> zzdnrVar) {
        this.zzgsv = zzbzzVar;
        this.zzgfs = zzdzkVar;
        this.zzgsw = zzcdsVar;
        this.zzgsx = zzdnrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final boolean zza(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        return (zzdmiVar.zzhht == null || zzdmiVar.zzhht.zzgam == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final zzdzl<List<zzdzl<zzcaz>>> zzb(final zzdmt zzdmtVar, final zzdmi zzdmiVar) {
        return zzdyz.zzb(zzdyz.zzb(this.zzgsx.zzavo(), new zzdyj(this, zzdmiVar) { // from class: com.google.android.gms.internal.ads.zzcth
            private final zzdmi zzgrj;
            private final zzcte zzgsy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgsy = this;
                this.zzgrj = zzdmiVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzgsy.zza(this.zzgrj, (zzcfp) obj);
            }
        }, this.zzgfs), new zzdyj(this, zzdmtVar, zzdmiVar) { // from class: com.google.android.gms.internal.ads.zzctg
            private final zzdmi zzfti;
            private final zzdmt zzggd;
            private final zzcte zzgsy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgsy = this;
                this.zzggd = zzdmtVar;
                this.zzfti = zzdmiVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzgsy.zza(this.zzggd, this.zzfti, (JSONArray) obj);
            }
        }, this.zzgfs);
    }

    private final zzdzl<zzcaz> zzb(final zzdmt zzdmtVar, final zzdmi zzdmiVar, final JSONObject jSONObject) {
        final zzdzl<zzcfp> zzavo = this.zzgsx.zzavo();
        final zzdzl<zzcbi> zza = this.zzgsw.zza(zzdmtVar, zzdmiVar, jSONObject);
        return zzdyz.zzb(zzavo, zza).zzb(new Callable(this, zza, zzavo, zzdmtVar, zzdmiVar, jSONObject) { // from class: com.google.android.gms.internal.ads.zzctl
            private final zzdzl zzfux;
            private final zzdzl zzfxc;
            private final zzcte zzgsy;
            private final zzdmt zzgtb;
            private final zzdmi zzgtc;
            private final JSONObject zzgtd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgsy = this;
                this.zzfxc = zza;
                this.zzfux = zzavo;
                this.zzgtb = zzdmtVar;
                this.zzgtc = zzdmiVar;
                this.zzgtd = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgsy.zza(this.zzfxc, this.zzfux, this.zzgtb, this.zzgtc, this.zzgtd);
            }
        }, this.zzgfs);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzcaz zza(zzdzl zzdzlVar, zzdzl zzdzlVar2, zzdmt zzdmtVar, zzdmi zzdmiVar, JSONObject jSONObject) throws Exception {
        zzcbi zzcbiVar = (zzcbi) zzdzlVar.get();
        zzcfp zzcfpVar = (zzcfp) zzdzlVar2.get();
        zzcbk zza = this.zzgsv.zza(new zzbnp(zzdmtVar, zzdmiVar, null), new zzcbu(zzcbiVar), new zzcan(jSONObject, zzcfpVar));
        zza.zzagm().zzapl();
        zza.zzagn().zzb(zzcfpVar);
        zza.zzago().zzi(zzcbiVar.zzanx());
        return zza.zzagl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(zzcfp zzcfpVar, JSONObject jSONObject) throws Exception {
        this.zzgsx.zzd(zzdyz.zzag(zzcfpVar));
        if (!jSONObject.optBoolean("success")) {
            throw new zzaln("process json failed");
        }
        return zzdyz.zzag(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(zzdmt zzdmtVar, zzdmi zzdmiVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzdyz.immediateFailedFuture(new zzcli(zzdnu.NO_FILL));
        }
        if (zzdmtVar.zzhiy.zzfve.zzgxk > 1) {
            int length = jSONArray.length();
            this.zzgsx.ensureSize(Math.min(length, zzdmtVar.zzhiy.zzfve.zzgxk));
            ArrayList arrayList = new ArrayList(zzdmtVar.zzhiy.zzfve.zzgxk);
            for (int i = 0; i < zzdmtVar.zzhiy.zzfve.zzgxk; i++) {
                if (i < length) {
                    arrayList.add(zzb(zzdmtVar, zzdmiVar, jSONArray.getJSONObject(i)));
                } else {
                    arrayList.add(zzdyz.immediateFailedFuture(new zzcli(zzdnu.NO_FILL)));
                }
            }
            return zzdyz.zzag(arrayList);
        }
        return zzdyz.zzb(zzb(zzdmtVar, zzdmiVar, jSONArray.getJSONObject(0)), zzcti.zzdyn, this.zzgfs);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(zzdmi zzdmiVar, final zzcfp zzcfpVar) throws Exception {
        JSONObject zza = com.google.android.gms.ads.internal.util.zzbk.zza("isNonagon", (Object) true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ResTags.RESPONSE, zzdmiVar.zzhht.zzgam);
        jSONObject.put("sdk_params", zza);
        return zzdyz.zzb(zzcfpVar.zzc("google.afma.nativeAds.preProcessJson", jSONObject), new zzdyj(this, zzcfpVar) { // from class: com.google.android.gms.internal.ads.zzctj
            private final zzcte zzgsy;
            private final zzcfp zzgsz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgsy = this;
                this.zzgsz = zzcfpVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzgsy.zza(this.zzgsz, (JSONObject) obj);
            }
        }, this.zzgfs);
    }
}
