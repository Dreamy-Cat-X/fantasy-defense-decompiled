package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.kt.olleh.inapp.net.ResTags;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcds {
    private final zzdzk zzgfs;
    private final zzcdw zzgft;
    private final zzceg zzgfu;

    public zzcds(zzdzk zzdzkVar, zzcdw zzcdwVar, zzceg zzcegVar) {
        this.zzgfs = zzdzkVar;
        this.zzgft = zzcdwVar;
        this.zzgfu = zzcegVar;
    }

    public final zzdzl<zzcbi> zza(final zzdmt zzdmtVar, final zzdmi zzdmiVar, final JSONObject jSONObject) {
        zzdzl zzb;
        final zzdzl submit = this.zzgfs.submit(new Callable(this, zzdmtVar, zzdmiVar, jSONObject) { // from class: com.google.android.gms.internal.ads.zzcdv
            private final zzdmi zzfti;
            private final zzcds zzgfv;
            private final zzdmt zzggd;
            private final JSONObject zzgge;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfv = this;
                this.zzggd = zzdmtVar;
                this.zzfti = zzdmiVar;
                this.zzgge = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdmt zzdmtVar2 = this.zzggd;
                zzdmi zzdmiVar2 = this.zzfti;
                JSONObject jSONObject2 = this.zzgge;
                zzcbi zzcbiVar = new zzcbi();
                zzcbiVar.zzea(jSONObject2.optInt("template_id", -1));
                zzcbiVar.zzfx(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                zzcbiVar.zzfy(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
                zzdmx zzdmxVar = zzdmtVar2.zzhiy.zzfve;
                if (!zzdmxVar.zzhjf.contains(Integer.toString(zzcbiVar.zzans()))) {
                    zzdnu zzdnuVar = zzdnu.INTERNAL_ERROR;
                    int zzans = zzcbiVar.zzans();
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("Invalid template ID: ");
                    sb.append(zzans);
                    throw new zzcuh(zzdnuVar, sb.toString());
                }
                if (zzcbiVar.zzans() == 3) {
                    if (zzcbiVar.getCustomTemplateId() == null) {
                        throw new zzcuh(zzdnu.INTERNAL_ERROR, "No custom template id for custom template ad response.");
                    }
                    if (!zzdmxVar.zzhjg.contains(zzcbiVar.getCustomTemplateId())) {
                        throw new zzcuh(zzdnu.INTERNAL_ERROR, "Unexpected custom template id in the response.");
                    }
                }
                zzcbiVar.setStarRating(jSONObject2.optDouble("rating", -1.0d));
                String optString = jSONObject2.optString("headline", null);
                if (zzdmiVar2.zzdvy) {
                    com.google.android.gms.ads.internal.zzp.zzkq();
                    String zzyz = com.google.android.gms.ads.internal.util.zzm.zzyz();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzyz).length() + 3 + String.valueOf(optString).length());
                    sb2.append(zzyz);
                    sb2.append(" : ");
                    sb2.append(optString);
                    optString = sb2.toString();
                }
                zzcbiVar.zzn("headline", optString);
                zzcbiVar.zzn("body", jSONObject2.optString("body", null));
                zzcbiVar.zzn("call_to_action", jSONObject2.optString("call_to_action", null));
                zzcbiVar.zzn("store", jSONObject2.optString("store", null));
                zzcbiVar.zzn(ResTags.PRICE, jSONObject2.optString(ResTags.PRICE, null));
                zzcbiVar.zzn("advertiser", jSONObject2.optString("advertiser", null));
                return zzcbiVar;
            }
        });
        final zzdzl<List<zzadv>> zzd = this.zzgft.zzd(jSONObject, "images");
        final zzdzl<zzadv> zzc = this.zzgft.zzc(jSONObject, "secondary_image");
        final zzdzl<zzadv> zzc2 = this.zzgft.zzc(jSONObject, "app_icon");
        final zzdzl<zzadu> zze = this.zzgft.zze(jSONObject, "attribution");
        final zzdzl<zzbdh> zzm = this.zzgft.zzm(jSONObject);
        final zzcdw zzcdwVar = this.zzgft;
        if (!jSONObject.optBoolean("enable_omid")) {
            zzb = zzdyz.zzag(null);
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzb = zzdyz.zzag(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzb = zzdyz.zzag(null);
                } else {
                    zzb = zzdyz.zzb(zzdyz.zzag(null), new zzdyj(zzcdwVar, optString) { // from class: com.google.android.gms.internal.ads.zzcea
                        private final String zzdhw;
                        private final zzcdw zzggl;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzggl = zzcdwVar;
                            this.zzdhw = optString;
                        }

                        @Override // com.google.android.gms.internal.ads.zzdyj
                        public final zzdzl zzf(Object obj) {
                            return this.zzggl.zzb(this.zzdhw, obj);
                        }
                    }, zzayv.zzegm);
                }
            }
        }
        final zzdzl zzdzlVar = zzb;
        final zzdzl<List<zzcel>> zzg = this.zzgfu.zzg(jSONObject, "custom_assets");
        return zzdyz.zza(submit, zzd, zzc, zzc2, zze, zzm, zzdzlVar, zzg).zzb(new Callable(this, submit, zzd, zzc2, zzc, zze, jSONObject, zzm, zzdzlVar, zzg) { // from class: com.google.android.gms.internal.ads.zzcdu
            private final zzdzl zzfux;
            private final zzdzl zzfxc;
            private final zzcds zzgfv;
            private final zzdzl zzgfw;
            private final zzdzl zzgfx;
            private final zzdzl zzgfy;
            private final JSONObject zzgfz;
            private final zzdzl zzgga;
            private final zzdzl zzggb;
            private final zzdzl zzggc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfv = this;
                this.zzfxc = submit;
                this.zzfux = zzd;
                this.zzgfw = zzc2;
                this.zzgfx = zzc;
                this.zzgfy = zze;
                this.zzgfz = jSONObject;
                this.zzgga = zzm;
                this.zzggb = zzdzlVar;
                this.zzggc = zzg;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdzl zzdzlVar2 = this.zzfxc;
                zzdzl zzdzlVar3 = this.zzfux;
                zzdzl zzdzlVar4 = this.zzgfw;
                zzdzl zzdzlVar5 = this.zzgfx;
                zzdzl zzdzlVar6 = this.zzgfy;
                JSONObject jSONObject2 = this.zzgfz;
                zzdzl zzdzlVar7 = this.zzgga;
                zzdzl zzdzlVar8 = this.zzggb;
                zzdzl zzdzlVar9 = this.zzggc;
                zzcbi zzcbiVar = (zzcbi) zzdzlVar2.get();
                zzcbiVar.setImages((List) zzdzlVar3.get());
                zzcbiVar.zza((zzaej) zzdzlVar4.get());
                zzcbiVar.zzb((zzaej) zzdzlVar5.get());
                zzcbiVar.zza((zzaeb) zzdzlVar6.get());
                zzcbiVar.zzh(zzcdw.zzj(jSONObject2));
                zzcbiVar.zza(zzcdw.zzk(jSONObject2));
                zzbdh zzbdhVar = (zzbdh) zzdzlVar7.get();
                if (zzbdhVar != null) {
                    zzcbiVar.zzf(zzbdhVar);
                    zzcbiVar.zzac(zzbdhVar.getView());
                    zzcbiVar.zzb(zzbdhVar.zzaay());
                }
                zzbdh zzbdhVar2 = (zzbdh) zzdzlVar8.get();
                if (zzbdhVar2 != null) {
                    zzcbiVar.zzg(zzbdhVar2);
                }
                for (zzcel zzcelVar : (List) zzdzlVar9.get()) {
                    int i = zzcelVar.type;
                    if (i == 1) {
                        zzcbiVar.zzn(zzcelVar.zzck, zzcelVar.zzdpj);
                    } else if (i == 2) {
                        zzcbiVar.zza(zzcelVar.zzck, zzcelVar.zzggq);
                    }
                }
                return zzcbiVar;
            }
        }, this.zzgfs);
    }
}
