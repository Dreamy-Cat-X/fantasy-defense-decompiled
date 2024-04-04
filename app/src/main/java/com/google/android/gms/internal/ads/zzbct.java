package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbct extends zzbcj {
    public zzbct(zzbaq zzbaqVar) {
        super(zzbaqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final void abort() {
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final boolean zzfg(String str) {
        zzbaq zzbaqVar = this.zzenz.get();
        if (zzbaqVar != null) {
            zzbaqVar.zza(zzfh(str), this);
        }
        com.google.android.gms.ads.internal.util.zzd.zzex("VideoStreamNoopCache is doing nothing.");
        zza(str, zzfh(str), "noop", "Noop cache is a noop.");
        return false;
    }
}
