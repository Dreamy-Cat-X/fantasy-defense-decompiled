package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdgh implements zzdeu<zzdgi> {
    private String packageName;
    private zzdzk zzgfs;
    private zzaxk zzhcv;

    public zzdgh(zzaxk zzaxkVar, zzdzk zzdzkVar, String str) {
        this.zzhcv = zzaxkVar;
        this.zzgfs = zzdzkVar;
        this.packageName = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdgi> zzata() {
        new zzazc();
        final zzdzl<String> zzag = zzdyz.zzag(null);
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcwf)).booleanValue()) {
            zzag = this.zzhcv.zzdz(this.packageName);
        }
        final zzdzl<String> zzea = this.zzhcv.zzea(this.packageName);
        return zzdyz.zzb(zzag, zzea).zzb(new Callable(zzag, zzea) { // from class: com.google.android.gms.internal.ads.zzdgk
            private final zzdzl zzfxc;
            private final zzdzl zzggn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzggn = zzag;
                this.zzfxc = zzea;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzdgi((String) this.zzggn.get(), (String) this.zzfxc.get());
            }
        }, zzayv.zzegi);
    }
}
