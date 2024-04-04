package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public final class zzaby {
    private zzaby zzdal;
    private final List<zzabw> zzdaj = new LinkedList();
    private final Map<String, String> zzdak = new LinkedHashMap();
    private final Object lock = new Object();
    final boolean zzdai = true;

    public zzaby(boolean z, String str, String str2) {
        this.zzdak.put("action", str);
        this.zzdak.put("ad_format", str2);
    }

    public final void zzc(zzaby zzabyVar) {
        synchronized (this.lock) {
            this.zzdal = zzabyVar;
        }
    }

    public final zzabw zzex(long j) {
        if (this.zzdai) {
            return new zzabw(j, null, null);
        }
        return null;
    }

    public final boolean zza(zzabw zzabwVar, long j, String... strArr) {
        synchronized (this.lock) {
            for (String str : strArr) {
                this.zzdaj.add(new zzabw(j, str, zzabwVar));
            }
        }
        return true;
    }

    public final zzabx zzsp() {
        zzabx zzabxVar;
        boolean booleanValue = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcqu)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.lock) {
            for (zzabw zzabwVar : this.zzdaj) {
                long time = zzabwVar.getTime();
                String zzsl = zzabwVar.zzsl();
                zzabw zzsm = zzabwVar.zzsm();
                if (zzsm != null && time > 0) {
                    long time2 = time - zzsm.getTime();
                    sb.append(zzsl);
                    sb.append('.');
                    sb.append(time2);
                    sb.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(zzsm.getTime()))) {
                            hashMap.put(Long.valueOf(zzsm.getTime()), new StringBuilder(zzsl));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzsm.getTime()));
                            sb2.append('+');
                            sb2.append(zzsl);
                        }
                    }
                }
            }
            this.zzdaj.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzabxVar = new zzabx(sb.toString(), str);
        }
        return zzabxVar;
    }

    public final void zzg(String str, String str2) {
        zzabo zzxk;
        if (!this.zzdai || TextUtils.isEmpty(str2) || (zzxk = com.google.android.gms.ads.internal.zzp.zzku().zzxk()) == null) {
            return;
        }
        synchronized (this.lock) {
            zzabs zzcq = zzxk.zzcq(str);
            Map<String, String> map = this.zzdak;
            map.put(str, zzcq.zzf(map.get(str), str2));
        }
    }

    public final Map<String, String> zzsq() {
        synchronized (this.lock) {
            zzabo zzxk = com.google.android.gms.ads.internal.zzp.zzku().zzxk();
            if (zzxk != null && this.zzdal != null) {
                return zzxk.zza(this.zzdak, this.zzdal.zzsq());
            }
            return this.zzdak;
        }
    }
}
