package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzckh {
    private String zzgkt;
    private zzckd zzgku;
    private List<Map<String, String>> zzgkq = new ArrayList();
    private boolean zzgkr = false;
    private boolean zzgks = false;
    private final com.google.android.gms.ads.internal.util.zzf zzdza = com.google.android.gms.ads.internal.zzp.zzku().zzxq();

    public zzckh(String str, zzckd zzckdVar) {
        this.zzgkt = str;
        this.zzgku = zzckdVar;
    }

    public final synchronized void zzgf(String str) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqw)).booleanValue()) {
            if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzczk)).booleanValue()) {
                Map<String, String> zzarc = zzarc();
                zzarc.put("action", "adapter_init_started");
                zzarc.put("ancn", str);
                this.zzgkq.add(zzarc);
            }
        }
    }

    public final synchronized void zzgg(String str) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqw)).booleanValue()) {
            if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzczk)).booleanValue()) {
                Map<String, String> zzarc = zzarc();
                zzarc.put("action", "adapter_init_finished");
                zzarc.put("ancn", str);
                this.zzgkq.add(zzarc);
            }
        }
    }

    public final synchronized void zzs(String str, String str2) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqw)).booleanValue()) {
            if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzczk)).booleanValue()) {
                Map<String, String> zzarc = zzarc();
                zzarc.put("action", "adapter_init_finished");
                zzarc.put("ancn", str);
                zzarc.put("rqe", str2);
                this.zzgkq.add(zzarc);
            }
        }
    }

    public final synchronized void zzara() {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqw)).booleanValue()) {
            if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzczk)).booleanValue()) {
                if (!this.zzgkr) {
                    Map<String, String> zzarc = zzarc();
                    zzarc.put("action", "init_started");
                    this.zzgkq.add(zzarc);
                    this.zzgkr = true;
                }
            }
        }
    }

    public final synchronized void zzarb() {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqw)).booleanValue()) {
            if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzczk)).booleanValue()) {
                if (!this.zzgks) {
                    Map<String, String> zzarc = zzarc();
                    zzarc.put("action", "init_finished");
                    this.zzgkq.add(zzarc);
                    Iterator<Map<String, String>> it = this.zzgkq.iterator();
                    while (it.hasNext()) {
                        this.zzgku.zzo(it.next());
                    }
                    this.zzgks = true;
                }
            }
        }
    }

    private final Map<String, String> zzarc() {
        Map<String, String> zzaqz = this.zzgku.zzaqz();
        zzaqz.put("tms", Long.toString(com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime(), 10));
        zzaqz.put("tid", this.zzdza.zzys() ? "" : this.zzgkt);
        return zzaqz;
    }
}
