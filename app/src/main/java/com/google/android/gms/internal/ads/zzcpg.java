package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcpg implements zzbqw, zzbsg {
    private static final Object zzgow = new Object();
    private static int zzgox = 0;
    private final zzcpp zzgoy;

    public zzcpg(zzcpp zzcppVar) {
        this.zzgoy = zzcppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void onAdLoaded() {
        zzbi(true);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzd(zzvc zzvcVar) {
        zzbi(false);
    }

    private static boolean zzarv() {
        boolean z;
        synchronized (zzgow) {
            z = zzgox < ((Integer) zzwo.zzqq().zzd(zzabh.zzcxc)).intValue();
        }
        return z;
    }

    private final void zzbi(boolean z) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcxb)).booleanValue() && zzarv()) {
            this.zzgoy.zzbi(z);
            synchronized (zzgow) {
                zzgox++;
            }
        }
    }
}
