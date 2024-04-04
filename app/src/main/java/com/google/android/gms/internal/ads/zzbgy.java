package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbgy {
    private zzbfh zzeur;
    private zzbhj zzfmn;
    private zzdrj zzfmo;
    private zzbhs zzfmp;
    private zzdnx zzfmq;

    private zzbgy() {
    }

    public final zzbgy zzc(zzbfh zzbfhVar) {
        this.zzeur = (zzbfh) zzepw.checkNotNull(zzbfhVar);
        return this;
    }

    public final zzbgy zza(zzbhj zzbhjVar) {
        this.zzfmn = (zzbhj) zzepw.checkNotNull(zzbhjVar);
        return this;
    }

    public final zzbff zzahv() {
        zzepw.zza(this.zzeur, (Class<zzbfh>) zzbfh.class);
        zzepw.zza(this.zzfmn, (Class<zzbhj>) zzbhj.class);
        if (this.zzfmo == null) {
            this.zzfmo = new zzdrj();
        }
        if (this.zzfmp == null) {
            this.zzfmp = new zzbhs();
        }
        if (this.zzfmq == null) {
            this.zzfmq = new zzdnx();
        }
        return new zzbgb(this.zzeur, this.zzfmn, this.zzfmo, this.zzfmp, this.zzfmq);
    }
}
