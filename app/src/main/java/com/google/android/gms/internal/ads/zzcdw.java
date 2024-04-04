package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.kt.olleh.inapp.net.ResTags;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcdw {
    private final Context context;
    private final Executor executor;
    private final zzayt zzbpd;
    private final zzadz zzdmv;
    private final zztu zzepa;
    private final zzef zzequ;
    private final ScheduledExecutorService zzfpk;
    private final zzcdr zzggf;
    private final com.google.android.gms.ads.internal.zzb zzggg;
    private final zzcen zzggh;

    public zzcdw(Context context, zzcdr zzcdrVar, zzef zzefVar, zzayt zzaytVar, com.google.android.gms.ads.internal.zzb zzbVar, zztu zztuVar, Executor executor, zzdmx zzdmxVar, zzcen zzcenVar, ScheduledExecutorService scheduledExecutorService) {
        this.context = context;
        this.zzggf = zzcdrVar;
        this.zzequ = zzefVar;
        this.zzbpd = zzaytVar;
        this.zzggg = zzbVar;
        this.zzepa = zztuVar;
        this.executor = executor;
        this.zzdmv = zzdmxVar.zzdmv;
        this.zzggh = zzcenVar;
        this.zzfpk = scheduledExecutorService;
    }

    public static List<zzzq> zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzdws.zzazp();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzdws.zzazp();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            zzzq zzl = zzl(optJSONArray.optJSONObject(i));
            if (zzl != null) {
                arrayList.add(zzl);
            }
        }
        return zzdws.zzb(arrayList);
    }

    public static zzzq zzk(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzl(optJSONObject);
    }

    private static zzzq zzl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(ResTags.REASON);
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzzq(optString, optString2);
    }

    public final zzdzl<zzadv> zzc(JSONObject jSONObject, String str) {
        return zza(jSONObject.optJSONObject(str), this.zzdmv.zzdet);
    }

    public final zzdzl<List<zzadv>> zzd(JSONObject jSONObject, String str) {
        return zza(jSONObject.optJSONArray(str), this.zzdmv.zzdet, this.zzdmv.zzbnr);
    }

    private final zzdzl<List<zzadv>> zza(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzdyz.zzag(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zza(jSONArray.optJSONObject(i), z));
        }
        return zzdyz.zzb(zzdyz.zzi(arrayList), zzcdz.zzdyn, this.executor);
    }

    private final zzdzl<zzadv> zza(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzdyz.zzag(null);
        }
        final String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzdyz.zzag(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzdyz.zzag(new zzadv(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zza(jSONObject.optBoolean("require"), (zzdzl<Object>) zzdyz.zzb(this.zzggf.zza(optString, optDouble, optBoolean), new zzdvo(optString, optDouble, optInt, optInt2) { // from class: com.google.android.gms.internal.ads.zzcdy
            private final String zzdjy;
            private final int zzedl;
            private final int zzedm;
            private final double zzggk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdjy = optString;
                this.zzggk = optDouble;
                this.zzedl = optInt;
                this.zzedm = optInt2;
            }

            @Override // com.google.android.gms.internal.ads.zzdvo
            public final Object apply(Object obj) {
                String str = this.zzdjy;
                return new zzadv(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.zzggk, this.zzedl, this.zzedm);
            }
        }, this.executor), (Object) null);
    }

    public final zzdzl<zzadu> zze(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return zzdyz.zzag(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zza(optJSONObject.optBoolean("require"), (zzdzl<Object>) zzdyz.zzb(zza(optJSONArray, false, true), new zzdvo(this, optJSONObject) { // from class: com.google.android.gms.internal.ads.zzceb
            private final JSONObject zzfqn;
            private final zzcdw zzggl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzggl = this;
                this.zzfqn = optJSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzdvo
            public final Object apply(Object obj) {
                return this.zzggl.zza(this.zzfqn, (List) obj);
            }
        }, this.executor), (Object) null);
    }

    private static Integer zzf(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final zzdzl<zzbdh> zzm(JSONObject jSONObject) {
        JSONObject zza = com.google.android.gms.ads.internal.util.zzbk.zza(jSONObject, "html_containers", "instream");
        if (zza == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzdyz.zzag(null);
            }
            if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
                com.google.android.gms.ads.internal.util.zzd.zzex("Required field 'vast_xml' is missing");
                return zzdyz.zzag(null);
            }
            return zza((zzdzl<Object>) zzdyz.zza(this.zzggh.zzn(optJSONObject), ((Integer) zzwo.zzqq().zzd(zzabh.zzcsg)).intValue(), TimeUnit.SECONDS, this.zzfpk), (Object) null);
        }
        final zzdzl<zzbdh> zzo = this.zzggh.zzo(zza.optString("base_url"), zza.optString("html"));
        return zzdyz.zzb(zzo, new zzdyj(zzo) { // from class: com.google.android.gms.internal.ads.zzced
            private final zzdzl zzggn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzggn = zzo;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                zzdzl zzdzlVar = this.zzggn;
                zzbdh zzbdhVar = (zzbdh) obj;
                if (zzbdhVar == null || zzbdhVar.zzaay() == null) {
                    throw new zzcuh(zzdnu.INTERNAL_ERROR, "Retrieve video view in instream ad response failed.");
                }
                return zzdzlVar;
            }
        }, zzayv.zzegn);
    }

    private static <T> zzdzl<T> zza(zzdzl<T> zzdzlVar, T t) {
        final Object obj = null;
        return zzdyz.zzb(zzdzlVar, Exception.class, new zzdyj(obj) { // from class: com.google.android.gms.internal.ads.zzcec
            private final Object zzggm = null;

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj2) {
                Object obj3 = this.zzggm;
                com.google.android.gms.ads.internal.util.zzd.zza("Error during loading assets.", (Exception) obj2);
                return zzdyz.zzag(obj3);
            }
        }, zzayv.zzegn);
    }

    private static <T> zzdzl<T> zza(boolean z, final zzdzl<T> zzdzlVar, T t) {
        if (z) {
            return zzdyz.zzb(zzdzlVar, new zzdyj(zzdzlVar) { // from class: com.google.android.gms.internal.ads.zzcef
                private final zzdzl zzggn;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzggn = zzdzlVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdyj
                public final zzdzl zzf(Object obj) {
                    return obj != null ? this.zzggn : zzdyz.immediateFailedFuture(new zzcuh(zzdnu.INTERNAL_ERROR, "Retrieve required value in native ad response failed."));
                }
            }, zzayv.zzegn);
        }
        return zza(zzdzlVar, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zzb(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzp.zzkr();
        zzbdh zza = zzbdp.zza(this.context, zzbew.zzaej(), "native-omid", false, false, this.zzequ, null, this.zzbpd, null, null, this.zzggg, this.zzepa, null, null);
        final zzazd zzk = zzazd.zzk(zza);
        zza.zzadi().zza(new zzbes(zzk) { // from class: com.google.android.gms.internal.ads.zzcee
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
        zza.loadData(str, "text/html", "UTF-8");
        return zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzadu zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzf = zzf(jSONObject, "bg_color");
        Integer zzf2 = zzf(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzadu(optString, list, zzf, zzf2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzdmv.zzbns, optBoolean);
    }
}
