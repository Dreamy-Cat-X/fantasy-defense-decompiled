package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdbv implements zzdeu<zzdca> {
    private final Context zzaaf;
    private final zzdzk zzgfs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbv(Context context, zzdzk zzdzkVar) {
        this.zzaaf = context;
        this.zzgfs = zzdzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdca> zzata() {
        return this.zzgfs.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdby
            private final zzdbv zzhac;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhac = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzhac.zzath();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdca zzath() throws Exception {
        com.google.android.gms.ads.internal.zzp.zzkq();
        String zzaw = com.google.android.gms.ads.internal.util.zzm.zzaw(this.zzaaf);
        String string = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcww)).booleanValue() ? this.zzaaf.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        com.google.android.gms.ads.internal.zzp.zzkq();
        return new zzdca(zzaw, string, com.google.android.gms.ads.internal.util.zzm.zzax(this.zzaaf));
    }
}
