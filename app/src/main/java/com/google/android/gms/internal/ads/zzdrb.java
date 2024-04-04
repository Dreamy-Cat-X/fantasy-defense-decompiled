package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdrb extends zzbvk<zzdre> implements zzdqw<zzdqz> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrb(Set<zzbxf<zzdre>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdqw
    public final void zza(final zzdql<zzdqz, ?> zzdqlVar) {
        zza(new zzbvm(zzdqlVar) { // from class: com.google.android.gms.internal.ads.zzdra
            private final zzdql zzhpq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhpq = zzdqlVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                zzdql zzdqlVar2 = this.zzhpq;
                ((zzdre) obj).zza((zzdqz) zzdqlVar2.zzaxk(), zzdqlVar2.zzaxl());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdqw
    public final void zzb(final zzdql<zzdqz, ?> zzdqlVar) {
        zza(new zzbvm(zzdqlVar) { // from class: com.google.android.gms.internal.ads.zzdrd
            private final zzdql zzhpq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhpq = zzdqlVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                zzdql zzdqlVar2 = this.zzhpq;
                ((zzdre) obj).zzb((zzdqz) zzdqlVar2.zzaxk(), zzdqlVar2.zzaxl());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdqw
    public final void zza(final zzdql<zzdqz, ?> zzdqlVar, final Throwable th) {
        zza(new zzbvm(zzdqlVar, th) { // from class: com.google.android.gms.internal.ads.zzdrc
            private final zzdql zzhpq;
            private final Throwable zzhpr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhpq = zzdqlVar;
                this.zzhpr = th;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                zzdql zzdqlVar2 = this.zzhpq;
                ((zzdre) obj).zza((zzdqz) zzdqlVar2.zzaxk(), zzdqlVar2.zzaxl(), this.zzhpr);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdqw
    public final void zzc(final zzdql<zzdqz, ?> zzdqlVar) {
        zza(new zzbvm(zzdqlVar) { // from class: com.google.android.gms.internal.ads.zzdrf
            private final zzdql zzhpq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhpq = zzdqlVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                zzdql zzdqlVar2 = this.zzhpq;
                ((zzdre) obj).zzc((zzdqz) zzdqlVar2.zzaxk(), zzdqlVar2.zzaxl());
            }
        });
    }
}
