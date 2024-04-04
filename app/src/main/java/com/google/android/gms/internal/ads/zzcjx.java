package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcjx {
    private final Map<String, String> zzdak = new ConcurrentHashMap();
    private final /* synthetic */ zzcju zzgkc;

    public zzcjx(zzcju zzcjuVar) {
        this.zzgkc = zzcjuVar;
    }

    public final zzcjx zzaqu() {
        Map<? extends String, ? extends String> map;
        Map<String, String> map2 = this.zzdak;
        map = this.zzgkc.zzgka;
        map2.putAll(map);
        return this;
    }

    public final zzcjx zza(zzdmj zzdmjVar) {
        this.zzdak.put("gqi", zzdmjVar.zzbvf);
        return this;
    }

    public final zzcjx zzc(zzdmi zzdmiVar) {
        this.zzdak.put("aai", zzdmiVar.zzdkl);
        return this;
    }

    public final zzcjx zzr(String str, String str2) {
        this.zzdak.put(str, str2);
        return this;
    }

    public final void zzaqv() {
        Executor executor;
        executor = this.zzgkc.executor;
        executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcjw
            private final zzcjx zzgkb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgkb = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgkb.zzaqx();
            }
        });
    }

    public final String zzaqw() {
        zzckd zzckdVar;
        zzckdVar = this.zzgkc.zzgjw;
        return zzckdVar.zzp(this.zzdak);
    }

    public final /* synthetic */ void zzaqx() {
        zzckd zzckdVar;
        zzckdVar = this.zzgkc.zzgjw;
        zzckdVar.zzo(this.zzdak);
    }
}
