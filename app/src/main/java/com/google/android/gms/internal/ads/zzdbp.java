package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdbp implements zzdeu<zzdbq> {
    private final zzdmx zzfve;
    private final zzdzk zzgfs;
    private final String zzgyg;
    private final zzchw zzgzy;

    public zzdbp(zzdzk zzdzkVar, zzchw zzchwVar, zzdmx zzdmxVar, String str) {
        this.zzgfs = zzdzkVar;
        this.zzgzy = zzchwVar;
        this.zzfve = zzdmxVar;
        this.zzgyg = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdbq> zzata() {
        return this.zzgfs.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdbs
            private final zzdbp zzhaa;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhaa = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzhaa.zzatg();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdbq zzatg() throws Exception {
        JSONObject zzq;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcsz)).booleanValue() && (zzq = this.zzgzy.zzq(this.zzfve.zzhje, this.zzgyg)) != null) {
            return new zzdbq(zzq.toString());
        }
        return null;
    }
}
