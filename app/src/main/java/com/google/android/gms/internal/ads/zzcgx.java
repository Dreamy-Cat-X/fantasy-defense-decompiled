package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcgx {
    private final Context context;
    private final zzayt zzbpd;
    private final zzbdp zzbpq;
    private final zztu zzepa;
    private final zzef zzequ;
    private final zzacm zzeqv;
    private final com.google.android.gms.ads.internal.zzb zzeqx;
    private final zzbsx zzgif;

    public zzcgx(zzbdp zzbdpVar, Context context, zzef zzefVar, zzacm zzacmVar, zzayt zzaytVar, com.google.android.gms.ads.internal.zzb zzbVar, zztu zztuVar, zzbsx zzbsxVar) {
        this.zzbpq = zzbdpVar;
        this.context = context;
        this.zzequ = zzefVar;
        this.zzeqv = zzacmVar;
        this.zzbpd = zzaytVar;
        this.zzeqx = zzbVar;
        this.zzepa = zztuVar;
        this.zzgif = zzbsxVar;
    }

    public final zzbdh zze(zzvp zzvpVar) throws zzbdt {
        return zza(zzvpVar, null, null);
    }

    public final zzbdh zza(zzvp zzvpVar, zzdmi zzdmiVar, zzdmj zzdmjVar) throws zzbdt {
        return zzbdp.zza(this.context, zzbew.zzb(zzvpVar), zzvpVar.zzacv, false, false, this.zzequ, this.zzeqv, this.zzbpd, null, new zzcgw(this), this.zzeqx, this.zzepa, zzdmiVar, zzdmjVar);
    }
}
