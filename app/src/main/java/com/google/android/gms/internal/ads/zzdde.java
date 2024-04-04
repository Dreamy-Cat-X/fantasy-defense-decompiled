package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdde implements zzdeu<zzddb> {
    private final Context context;
    private final zzdzk zzgyp;
    private final Set<String> zzgzd;

    public zzdde(zzdzk zzdzkVar, Context context, Set<String> set) {
        this.zzgyp = zzdzkVar;
        this.context = context;
        this.zzgzd = set;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzddb> zzata() {
        return this.zzgyp.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzddd
            private final zzdde zzhar;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhar = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzhar.zzatl();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddb zzatl() throws Exception {
        boolean zze;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcup)).booleanValue()) {
            zze = zzddb.zze(this.zzgzd);
            if (zze) {
                return new zzddb(com.google.android.gms.ads.internal.zzp.zzlf().getVersion(this.context));
            }
        }
        return new zzddb(null);
    }
}
