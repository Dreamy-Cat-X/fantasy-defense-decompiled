package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbpl implements zzbtf {
    private final Context zzaaf;
    private final zzayt zzbos;
    private final com.google.android.gms.ads.internal.util.zzf zzebk;
    private final zzckx zzfor;
    private final zzdmx zzfve;

    public zzbpl(Context context, zzdmx zzdmxVar, zzayt zzaytVar, com.google.android.gms.ads.internal.util.zzf zzfVar, zzckx zzckxVar) {
        this.zzaaf = context;
        this.zzfve = zzdmxVar;
        this.zzbos = zzaytVar;
        this.zzebk = zzfVar;
        this.zzfor = zzckxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzb(zzdmt zzdmtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzd(zzasu zzasuVar) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcsy)).booleanValue()) {
            com.google.android.gms.ads.internal.zzp.zzky().zza(this.zzaaf, this.zzbos, this.zzfve.zzhje, this.zzebk.zzyl());
        }
        this.zzfor.zzard();
    }
}
