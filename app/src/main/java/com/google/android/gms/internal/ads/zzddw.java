package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzddw implements zzdeu<zzddt> {
    private final Context context;
    private final ScheduledExecutorService zzfpk;
    private final zzdmx zzfve;
    private final zzdzk zzgfs;
    private final zzcwo zzgum;
    private String zzgyg;
    private final zzcwq zzhay;

    public zzddw(zzdzk zzdzkVar, ScheduledExecutorService scheduledExecutorService, String str, zzcwq zzcwqVar, Context context, zzdmx zzdmxVar, zzcwo zzcwoVar) {
        this.zzgfs = zzdzkVar;
        this.zzfpk = scheduledExecutorService;
        this.zzgyg = str;
        this.zzhay = zzcwqVar;
        this.context = context;
        this.zzfve = zzdmxVar;
        this.zzgum = zzcwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzddt> zzata() {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqh)).booleanValue()) {
            return zzdyz.zza(new zzdyk(this) { // from class: com.google.android.gms.internal.ads.zzddv
                private final zzddw zzhax;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzhax = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdyk
                public final zzdzl zzatn() {
                    return this.zzhax.zzato();
                }
            }, this.zzgfs);
        }
        return zzdyz.zzag(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(String str, List list, Bundle bundle) throws Exception {
        zzazc zzazcVar = new zzazc();
        this.zzgum.zzgn(str);
        zzaoz zzgo = this.zzgum.zzgo(str);
        if (zzgo == null) {
            throw null;
        }
        zzgo.zza(ObjectWrapper.wrap(this.context), this.zzgyg, bundle, (Bundle) list.get(0), this.zzfve.zzbpe, new zzcww(str, zzgo, zzazcVar));
        return zzazcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zzato() {
        Map<String, List<Bundle>> zzt = this.zzhay.zzt(this.zzgyg, this.zzfve.zzhje);
        final ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<Bundle>> entry : zzt.entrySet()) {
            final String key = entry.getKey();
            final List<Bundle> value = entry.getValue();
            final Bundle bundle = this.zzfve.zzhjd.zzche != null ? this.zzfve.zzhjd.zzche.getBundle(key) : null;
            arrayList.add(zzdyu.zzg(zzdyz.zza(new zzdyk(this, key, value, bundle) { // from class: com.google.android.gms.internal.ads.zzddy
                private final String zzdhw;
                private final zzddw zzhax;
                private final List zzhaz;
                private final Bundle zzhba;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzhax = this;
                    this.zzdhw = key;
                    this.zzhaz = value;
                    this.zzhba = bundle;
                }

                @Override // com.google.android.gms.internal.ads.zzdyk
                public final zzdzl zzatn() {
                    return this.zzhax.zza(this.zzdhw, this.zzhaz, this.zzhba);
                }
            }, this.zzgfs)).zza(((Long) zzwo.zzqq().zzd(zzabh.zzcqg)).longValue(), TimeUnit.MILLISECONDS, this.zzfpk).zza(Throwable.class, new zzdvo(key) { // from class: com.google.android.gms.internal.ads.zzddx
                private final String zzdjy;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdjy = key;
                }

                @Override // com.google.android.gms.internal.ads.zzdvo
                public final Object apply(Object obj) {
                    String valueOf = String.valueOf(this.zzdjy);
                    com.google.android.gms.ads.internal.util.zzd.zzev(valueOf.length() != 0 ? "Error calling adapter: ".concat(valueOf) : new String("Error calling adapter: "));
                    return null;
                }
            }, this.zzgfs));
        }
        return zzdyz.zzk(arrayList).zzb(new Callable(arrayList) { // from class: com.google.android.gms.internal.ads.zzdea
            private final List zzhbb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhbb = arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzdzl> list = this.zzhbb;
                JSONArray jSONArray = new JSONArray();
                for (zzdzl zzdzlVar : list) {
                    if (((JSONObject) zzdzlVar.get()) != null) {
                        jSONArray.put(zzdzlVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzddt(jSONArray.toString());
            }
        }, this.zzgfs);
    }
}
