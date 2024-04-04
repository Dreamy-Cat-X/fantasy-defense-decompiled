package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzamd {
    private zzako zzdju;
    private zzdzl<zzalm> zzdjv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamd(zzako zzakoVar) {
        this.zzdju = zzakoVar;
    }

    private final void zzur() {
        if (this.zzdjv == null) {
            final zzazc zzazcVar = new zzazc();
            this.zzdjv = zzazcVar;
            this.zzdju.zzb((zzef) null).zza(new zzazg(zzazcVar) { // from class: com.google.android.gms.internal.ads.zzamg
                private final zzazc zzbvl;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbvl = zzazcVar;
                }

                @Override // com.google.android.gms.internal.ads.zzazg
                public final void zzg(Object obj) {
                    this.zzbvl.set((zzalm) obj);
                }
            }, new zzaze(zzazcVar) { // from class: com.google.android.gms.internal.ads.zzamf
                private final zzazc zzbvl;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbvl = zzazcVar;
                }

                @Override // com.google.android.gms.internal.ads.zzaze
                public final void run() {
                    this.zzbvl.setException(new zzaln("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final <I, O> zzamk<I, O> zzb(String str, zzalr<I> zzalrVar, zzals<O> zzalsVar) {
        zzur();
        return new zzamk<>(this.zzdjv, str, zzalrVar, zzalsVar);
    }

    public final void zzc(final String str, final zzahv<? super zzalm> zzahvVar) {
        zzur();
        this.zzdjv = zzdyz.zzb(this.zzdjv, new zzdyj(str, zzahvVar) { // from class: com.google.android.gms.internal.ads.zzami
            private final String zzdjy;
            private final zzahv zzdjz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdjy = str;
                this.zzdjz = zzahvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                zzalm zzalmVar = (zzalm) obj;
                zzalmVar.zza(this.zzdjy, this.zzdjz);
                return zzdyz.zzag(zzalmVar);
            }
        }, zzayv.zzegn);
    }

    public final void zzd(final String str, final zzahv<? super zzalm> zzahvVar) {
        this.zzdjv = zzdyz.zzb(this.zzdjv, new zzdvo(str, zzahvVar) { // from class: com.google.android.gms.internal.ads.zzamh
            private final String zzdjy;
            private final zzahv zzdjz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdjy = str;
                this.zzdjz = zzahvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdvo
            public final Object apply(Object obj) {
                zzalm zzalmVar = (zzalm) obj;
                zzalmVar.zzb(this.zzdjy, this.zzdjz);
                return zzalmVar;
            }
        }, zzayv.zzegn);
    }
}
