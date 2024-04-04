package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbki extends zzbmz {
    private final View view;
    private final zzbdh zzdhu;
    private final zzdmh zzfrt;
    private final int zzfru;
    private final boolean zzfrv;
    private final boolean zzfrw;
    private zzsn zzfsj;
    private final zzbkb zzfsk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbki(zzbmy zzbmyVar, View view, zzbdh zzbdhVar, zzdmh zzdmhVar, int i, boolean z, boolean z2, zzbkb zzbkbVar) {
        super(zzbmyVar);
        this.view = view;
        this.zzdhu = zzbdhVar;
        this.zzfrt = zzdmhVar;
        this.zzfru = i;
        this.zzfrv = z;
        this.zzfrw = z2;
        this.zzfsk = zzbkbVar;
    }

    public final zzdmh zzajn() {
        return zzdnd.zza(this.zzeqz.zzhhs, this.zzfrt);
    }

    public final View zzajo() {
        return this.view;
    }

    public final int zzaje() {
        return this.zzfru;
    }

    public final boolean zzajf() {
        return this.zzfrv;
    }

    public final boolean zzajg() {
        return this.zzfrw;
    }

    public final boolean zzacp() {
        zzbdh zzbdhVar = this.zzdhu;
        return (zzbdhVar == null || zzbdhVar.zzadi() == null || !this.zzdhu.zzadi().zzacp()) ? false : true;
    }

    public final boolean zzajp() {
        zzbdh zzbdhVar = this.zzdhu;
        return zzbdhVar != null && zzbdhVar.zzadk();
    }

    public final void zza(zzsd zzsdVar) {
        zzbdh zzbdhVar = this.zzdhu;
        if (zzbdhVar != null) {
            zzbdhVar.zza(zzsdVar);
        }
    }

    public final void zza(zzsn zzsnVar) {
        this.zzfsj = zzsnVar;
    }

    public final zzsn zzajq() {
        return this.zzfsj;
    }

    public final void zzb(long j, int i) {
        this.zzfsk.zzb(j, i);
    }
}
