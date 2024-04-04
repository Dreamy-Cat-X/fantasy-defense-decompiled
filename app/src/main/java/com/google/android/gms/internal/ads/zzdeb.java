package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdeb implements zzdeu<zzdec> {
    private final Context context;
    private final zzawg zzbql;
    private final zzdzk zzgfs;

    public zzdeb(zzawg zzawgVar, zzdzk zzdzkVar, Context context) {
        this.zzbql = zzawgVar;
        this.zzgfs = zzdzkVar;
        this.context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdec> zzata() {
        return this.zzgfs.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdee
            private final zzdeb zzhbg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhbg = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzhbg.zzatp();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdec zzatp() throws Exception {
        if (!this.zzbql.zzz(this.context)) {
            return new zzdec(null, null, null, null, null);
        }
        String zzac = this.zzbql.zzac(this.context);
        String str = zzac == null ? "" : zzac;
        String zzad = this.zzbql.zzad(this.context);
        String str2 = zzad == null ? "" : zzad;
        String zzae = this.zzbql.zzae(this.context);
        String str3 = zzae == null ? "" : zzae;
        String zzaf = this.zzbql.zzaf(this.context);
        return new zzdec(str, str2, str3, zzaf == null ? "" : zzaf, "TIME_OUT".equals(str2) ? (Long) zzwo.zzqq().zzd(zzabh.zzcnq) : null);
    }
}
