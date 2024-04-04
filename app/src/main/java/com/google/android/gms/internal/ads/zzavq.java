package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzeop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzavq implements zzawd {
    private static List<Future<Void>> zzdxz = Collections.synchronizedList(new ArrayList());
    private final Context context;
    private final zzavy zzduw;
    private final zzeop.zzb.C0016zzb zzdya;
    private final LinkedHashMap<String, zzeop.zzb.zzh.C0022zzb> zzdyb;
    private final zzawf zzdye;
    private boolean zzdyf;
    private final List<String> zzdyc = new ArrayList();
    private final List<String> zzdyd = new ArrayList();
    private final Object lock = new Object();
    private HashSet<String> zzdyg = new HashSet<>();
    private boolean zzdyh = false;
    private boolean zzdyi = false;
    private boolean zzdyj = false;

    public zzavq(Context context, zzayt zzaytVar, zzavy zzavyVar, String str, zzawf zzawfVar) {
        Preconditions.checkNotNull(zzavyVar, "SafeBrowsing config is not present.");
        this.context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzdyb = new LinkedHashMap<>();
        this.zzdye = zzawfVar;
        this.zzduw = zzavyVar;
        Iterator<String> it = zzavyVar.zzdyu.iterator();
        while (it.hasNext()) {
            this.zzdyg.add(it.next().toLowerCase(Locale.ENGLISH));
        }
        this.zzdyg.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzeop.zzb.C0016zzb zzbls = zzeop.zzb.zzbls();
        zzbls.zzb(zzeop.zzb.zzg.OCTAGON_AD);
        zzbls.zzig(str);
        zzbls.zzih(str);
        zzeop.zzb.zza.C0015zza zzblu = zzeop.zzb.zza.zzblu();
        if (this.zzduw.zzdyq != null) {
            zzblu.zzij(this.zzduw.zzdyq);
        }
        zzbls.zzb((zzeop.zzb.zza) ((zzekq) zzblu.zzbiz()));
        zzeop.zzb.zzi.zza zzbu = zzeop.zzb.zzi.zzbmj().zzbu(Wrappers.packageManager(this.context).isCallerInstantApp());
        if (zzaytVar.zzbrf != null) {
            zzbu.zzio(zzaytVar.zzbrf);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.context);
        if (apkVersion > 0) {
            zzbu.zzfs(apkVersion);
        }
        zzbls.zzb((zzeop.zzb.zzi) ((zzekq) zzbu.zzbiz()));
        this.zzdya = zzbls;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Void zzdx(String str) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzawd
    public final zzavy zzwt() {
        return this.zzduw;
    }

    @Override // com.google.android.gms.internal.ads.zzawd
    public final void zzdv(String str) {
        synchronized (this.lock) {
            if (str == null) {
                this.zzdya.zzblw();
            } else {
                this.zzdya.zzii(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawd
    public final boolean zzwu() {
        return PlatformVersion.isAtLeastKitKat() && this.zzduw.zzdys && !this.zzdyi;
    }

    @Override // com.google.android.gms.internal.ads.zzawd
    public final void zzl(View view) {
        if (this.zzduw.zzdys && !this.zzdyi) {
            com.google.android.gms.ads.internal.zzp.zzkq();
            final Bitmap zzn = com.google.android.gms.ads.internal.util.zzm.zzn(view);
            if (zzn == null) {
                zzawa.zzdy("Failed to capture the webview bitmap.");
            } else {
                this.zzdyi = true;
                com.google.android.gms.ads.internal.util.zzm.zzc(new Runnable(this, zzn) { // from class: com.google.android.gms.internal.ads.zzavt
                    private final zzavq zzdyl;
                    private final Bitmap zzdym;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdyl = this;
                        this.zzdym = zzn;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzdyl.zza(this.zzdym);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawd
    public final void zza(String str, Map<String, String> map, int i) {
        synchronized (this.lock) {
            if (i == 3) {
                this.zzdyj = true;
            }
            if (this.zzdyb.containsKey(str)) {
                if (i == 3) {
                    this.zzdyb.get(str).zzb(zzeop.zzb.zzh.zza.zzib(i));
                }
                return;
            }
            zzeop.zzb.zzh.C0022zzb zzbmh = zzeop.zzb.zzh.zzbmh();
            zzeop.zzb.zzh.zza zzib = zzeop.zzb.zzh.zza.zzib(i);
            if (zzib != null) {
                zzbmh.zzb(zzib);
            }
            zzbmh.zzic(this.zzdyb.size());
            zzbmh.zzim(str);
            zzeop.zzb.zzd.C0018zzb zzblz = zzeop.zzb.zzd.zzblz();
            if (this.zzdyg.size() > 0 && map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey() != null ? entry.getKey() : "";
                    String value = entry.getValue() != null ? entry.getValue() : "";
                    if (this.zzdyg.contains(key.toLowerCase(Locale.ENGLISH))) {
                        zzblz.zzb((zzeop.zzb.zzc) ((zzekq) zzeop.zzb.zzc.zzblx().zzap(zzejg.zzia(key)).zzaq(zzejg.zzia(value)).zzbiz()));
                    }
                }
            }
            zzbmh.zzb((zzeop.zzb.zzd) ((zzekq) zzblz.zzbiz()));
            this.zzdyb.put(str, zzbmh);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawd
    public final void zzwv() {
        this.zzdyh = true;
    }

    private final zzeop.zzb.zzh.C0022zzb zzdw(String str) {
        zzeop.zzb.zzh.C0022zzb c0022zzb;
        synchronized (this.lock) {
            c0022zzb = this.zzdyb.get(str);
        }
        return c0022zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzawd
    public final void zzww() {
        synchronized (this.lock) {
            zzdzl zzb = zzdyz.zzb(this.zzdye.zza(this.context, this.zzdyb.keySet()), new zzdyj(this) { // from class: com.google.android.gms.internal.ads.zzavs
                private final zzavq zzdyl;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdyl = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdyj
                public final zzdzl zzf(Object obj) {
                    return this.zzdyl.zzi((Map) obj);
                }
            }, zzayv.zzegn);
            zzdzl zza = zzdyz.zza(zzb, 10L, TimeUnit.SECONDS, zzayv.zzegl);
            zzdyz.zza(zzb, new zzavx(this, zza), zzayv.zzegn);
            zzdxz.add(zza);
        }
    }

    private final zzdzl<Void> zzwx() {
        zzdzl<Void> zzb;
        if (!((this.zzdyf && this.zzduw.zzdyw) || (this.zzdyj && this.zzduw.zzdyv) || (!this.zzdyf && this.zzduw.zzdyt))) {
            return zzdyz.zzag(null);
        }
        synchronized (this.lock) {
            Iterator<zzeop.zzb.zzh.C0022zzb> it = this.zzdyb.values().iterator();
            while (it.hasNext()) {
                this.zzdya.zzb((zzeop.zzb.zzh) ((zzekq) it.next().zzbiz()));
            }
            this.zzdya.zzo(this.zzdyc);
            this.zzdya.zzp(this.zzdyd);
            if (zzawa.isEnabled()) {
                String url = this.zzdya.getUrl();
                String zzblq = this.zzdya.zzblq();
                StringBuilder sb = new StringBuilder(String.valueOf(url).length() + 53 + String.valueOf(zzblq).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(url);
                sb.append("\n  clickUrl: ");
                sb.append(zzblq);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (zzeop.zzb.zzh zzhVar : this.zzdya.zzblp()) {
                    sb2.append("    [");
                    sb2.append(zzhVar.zzbmg());
                    sb2.append("] ");
                    sb2.append(zzhVar.getUrl());
                }
                zzawa.zzdy(sb2.toString());
            }
            zzdzl<String> zza = new com.google.android.gms.ads.internal.util.zzax(this.context).zza(1, this.zzduw.zzdyr, null, ((zzeop.zzb) ((zzekq) this.zzdya.zzbiz())).toByteArray());
            if (zzawa.isEnabled()) {
                zza.addListener(zzavv.zzdyo, zzayv.zzegi);
            }
            zzb = zzdyz.zzb(zza, zzavu.zzdyn, zzayv.zzegn);
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zzi(Map map) throws Exception {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.lock) {
                            int length = optJSONArray.length();
                            zzeop.zzb.zzh.C0022zzb zzdw = zzdw(str);
                            if (zzdw == null) {
                                String valueOf = String.valueOf(str);
                                zzawa.zzdy(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzdw.zzin(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zzdyf = (length > 0) | this.zzdyf;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (zzadk.zzddt.get().booleanValue()) {
                    com.google.android.gms.ads.internal.util.zzd.zzb("Failed to get SafeBrowsing metadata", e);
                }
                return zzdyz.immediateFailedFuture(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zzdyf) {
            synchronized (this.lock) {
                this.zzdya.zzb(zzeop.zzb.zzg.OCTAGON_AD_SB_MATCH);
            }
        }
        return zzwx();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Bitmap bitmap) {
        zzejp zzbgo = zzejg.zzbgo();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzbgo);
        synchronized (this.lock) {
            this.zzdya.zzb((zzeop.zzb.zzf) ((zzekq) zzeop.zzb.zzf.zzbme().zzas(zzbgo.zzbgc()).zzik("image/png").zzb(zzeop.zzb.zzf.zza.TYPE_CREATIVE).zzbiz()));
        }
    }
}
