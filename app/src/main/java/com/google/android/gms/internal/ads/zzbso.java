package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbso extends zzbvk<com.google.android.gms.ads.internal.overlay.zzp> implements com.google.android.gms.ads.internal.overlay.zzp {
    public zzbso(Set<zzbxf<com.google.android.gms.ads.internal.overlay.zzp>> set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zza(final com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        zza(new zzbvm(zzlVar) { // from class: com.google.android.gms.internal.ads.zzbsn
            private final com.google.android.gms.ads.internal.overlay.zzl zzfxu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxu = zzlVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzp) obj).zza(this.zzfxu);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void onUserLeaveHint() {
        zza(zzbsq.zzfxn);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void onPause() {
        zza(zzbsp.zzfxn);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void onResume() {
        zza(zzbss.zzfxn);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzvn() {
        zza(zzbsr.zzfxn);
    }
}
