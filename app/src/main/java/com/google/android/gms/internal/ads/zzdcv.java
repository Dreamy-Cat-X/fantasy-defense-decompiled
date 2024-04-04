package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdcv implements zzdeu<zzdcw> {
    private final PackageInfo zzdsj;
    private final com.google.android.gms.ads.internal.util.zzf zzebk;
    private final zzdmx zzfve;
    private final zzdzk zzgfs;

    public zzdcv(zzdzk zzdzkVar, zzdmx zzdmxVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzf zzfVar) {
        this.zzgfs = zzdzkVar;
        this.zzfve = zzdmxVar;
        this.zzdsj = packageInfo;
        this.zzebk = zzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdcw> zzata() {
        return this.zzgfs.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdcy
            private final zzdcv zzhao;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhao = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzhao.zzatk();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f9, code lost:
    
        if (r9 == 3) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void zza(ArrayList arrayList, Bundle bundle) {
        JSONArray optJSONArray;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.zzfve.zzhjg);
        String str = "landscape";
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcsj)).booleanValue() && this.zzfve.zzdmv.versionCode > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i = this.zzfve.zzdmv.zzbnq;
            String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? EnvironmentCompat.MEDIA_UNKNOWN : "square" : "portrait" : "landscape" : "any";
            if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(str2)) {
                bundle.putString("native_media_orientation", str2);
            }
        }
        int i2 = this.zzfve.zzdmv.zzbnp;
        if (i2 == 0) {
            str = "any";
        } else if (i2 == 1) {
            str = "portrait";
        } else if (i2 != 2) {
            str = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(str)) {
            bundle.putString("native_image_orientation", str);
        }
        bundle.putBoolean("native_multiple_images", this.zzfve.zzdmv.zzbnr);
        bundle.putBoolean("use_custom_mute", this.zzfve.zzdmv.zzbnu);
        PackageInfo packageInfo = this.zzdsj;
        int i3 = packageInfo == null ? 0 : packageInfo.versionCode;
        if (i3 > this.zzebk.zzyk()) {
            this.zzebk.zzyq();
            this.zzebk.zzde(i3);
        }
        JSONObject zzyp = this.zzebk.zzyp();
        String jSONArray = (zzyp == null || (optJSONArray = zzyp.optJSONArray(this.zzfve.zzhje)) == null) ? null : optJSONArray.toString();
        if (!TextUtils.isEmpty(jSONArray)) {
            bundle.putString("native_advanced_settings", jSONArray);
        }
        if (this.zzfve.zzgxk > 1) {
            bundle.putInt("max_num_ads", this.zzfve.zzgxk);
        }
        zzajh zzajhVar = this.zzfve.zzdty;
        if (zzajhVar != null) {
            if (TextUtils.isEmpty(zzajhVar.zzdhr)) {
                String str3 = "p";
                if (zzajhVar.versionCode >= 2) {
                    int i4 = zzajhVar.zzbnq;
                    if (i4 != 2) {
                    }
                    str3 = "l";
                    bundle.putString("ia_var", str3);
                } else {
                    int i5 = zzajhVar.zzdhq;
                    if (i5 != 1) {
                        if (i5 != 2) {
                            int i6 = zzajhVar.zzdhq;
                            StringBuilder sb = new StringBuilder(52);
                            sb.append("Instream ad video aspect ratio ");
                            sb.append(i6);
                            sb.append(" is wrong.");
                            zzaym.zzev(sb.toString());
                        }
                        bundle.putString("ia_var", str3);
                    }
                    str3 = "l";
                    bundle.putString("ia_var", str3);
                }
            } else {
                bundle.putString("ad_tag", zzajhVar.zzdhr);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.zzfve.zzavd() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdcw zzatk() throws Exception {
        final ArrayList<String> arrayList = this.zzfve.zzhjf;
        if (arrayList == null) {
            return zzdcx.zzhan;
        }
        if (arrayList.isEmpty()) {
            return zzdda.zzhan;
        }
        return new zzdcw(this, arrayList) { // from class: com.google.android.gms.internal.ads.zzdcz
            private final zzdcv zzhao;
            private final ArrayList zzhap;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhao = this;
                this.zzhap = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzder
            public final void zzr(Bundle bundle) {
                this.zzhao.zza(this.zzhap, bundle);
            }
        };
    }
}
