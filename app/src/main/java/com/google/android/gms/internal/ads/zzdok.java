package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdok {
    private zzdon zzhkx = null;
    private zzdon zzhky = null;
    private zzdon zzhkz = null;
    private zzdon zzhla = null;
    private zzdon zzhlb = null;
    private zzdon zzhlc = null;
    private zzdon zzhld = null;
    private zzdon zzhle = null;

    public final void zza(zzdon zzdonVar) {
        this.zzhla = zzdonVar;
    }

    public final void onAdClosed() {
        zzdon zzdonVar = this.zzhla;
        if (zzdonVar != null) {
            zzdonVar.execute();
        }
    }
}
