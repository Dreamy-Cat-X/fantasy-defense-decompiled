package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbwl extends zzbvk<zzbwq> implements zzbwq {
    public zzbwl(Set<zzbxf<zzbwq>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void zzft(final String str) {
        zza(new zzbvm(str) { // from class: com.google.android.gms.internal.ads.zzbwk
            private final String zzdjy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdjy = str;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                ((zzbwq) obj).zzft(this.zzdjy);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void zzfu(final String str) {
        zza(new zzbvm(str) { // from class: com.google.android.gms.internal.ads.zzbwn
            private final String zzdjy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdjy = str;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                ((zzbwq) obj).zzfu(this.zzdjy);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void zzm(final String str, final String str2) {
        zza(new zzbvm(str, str2) { // from class: com.google.android.gms.internal.ads.zzbwm
            private final String zzdhw;
            private final String zzdjy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdjy = str;
                this.zzdhw = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                ((zzbwq) obj).zzm(this.zzdjy, this.zzdhw);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void zzamk() {
        zza(zzbwp.zzfxn);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void zzaml() {
        zza(zzbwo.zzfxn);
    }
}
