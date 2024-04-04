package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcje implements zzdre {
    private zztu zzgjf;
    private Map<zzdqz, zzcjg> zzgjl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcje(zztu zztuVar, Map<zzdqz, zzcjg> map) {
        this.zzgjl = map;
        this.zzgjf = zztuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zza(zzdqz zzdqzVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zzb(zzdqz zzdqzVar, String str) {
        if (this.zzgjl.containsKey(zzdqzVar)) {
            this.zzgjf.zza(this.zzgjl.get(zzdqzVar).zzgjo);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zza(zzdqz zzdqzVar, String str, Throwable th) {
        if (this.zzgjl.containsKey(zzdqzVar)) {
            this.zzgjf.zza(this.zzgjl.get(zzdqzVar).zzgjq);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zzc(zzdqz zzdqzVar, String str) {
        if (this.zzgjl.containsKey(zzdqzVar)) {
            this.zzgjf.zza(this.zzgjl.get(zzdqzVar).zzgjp);
        }
    }
}
