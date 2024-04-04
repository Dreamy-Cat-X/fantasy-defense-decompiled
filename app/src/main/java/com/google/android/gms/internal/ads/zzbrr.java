package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbrr extends zzbvk<zzbqr> {
    public zzbrr(Set<zzbxf<zzbqr>> set) {
        super(set);
    }

    public final void onAdClosed() {
        zza(zzbru.zzfxn);
    }

    public final void onAdLeftApplication() {
        zza(zzbrt.zzfxn);
    }

    public final void onAdOpened() {
        zza(zzbrw.zzfxn);
    }

    public final void onRewardedVideoStarted() {
        zza(zzbrv.zzfxn);
    }

    public final void zzb(final zzato zzatoVar, final String str, final String str2) {
        zza(new zzbvm(zzatoVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzbry
            private final String zzdhw;
            private final String zzdkf;
            private final zzato zzfxs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxs = zzatoVar;
                this.zzdhw = str;
                this.zzdkf = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                ((zzbqr) obj).zzb(this.zzfxs, this.zzdhw, this.zzdkf);
            }
        });
    }

    public final void onRewardedVideoCompleted() {
        zza(zzbrx.zzfxn);
    }
}
