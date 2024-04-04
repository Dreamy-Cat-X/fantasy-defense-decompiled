package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcbh {
    private zzaei zzcks;

    public zzcbh(zzcax zzcaxVar) {
        this.zzcks = zzcaxVar;
    }

    public final synchronized zzaei zztx() {
        return this.zzcks;
    }

    public final synchronized void zza(zzaei zzaeiVar) {
        this.zzcks = zzaeiVar;
    }
}
