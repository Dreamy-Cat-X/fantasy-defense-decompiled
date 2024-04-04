package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzud {
    private final byte[] zzbxw;
    private int zzbxx;
    private int zzbxy;
    private final /* synthetic */ zztz zzbxz;

    private zzud(zztz zztzVar, byte[] bArr) {
        this.zzbxz = zztzVar;
        this.zzbxw = bArr;
    }

    public final synchronized void log() {
        try {
            if (this.zzbxz.zzbxv) {
                this.zzbxz.zzbxu.zzc(this.zzbxw);
                this.zzbxz.zzbxu.zzs(this.zzbxx);
                this.zzbxz.zzbxu.zzt(this.zzbxy);
                this.zzbxz.zzbxu.zza(null);
                this.zzbxz.zzbxu.log();
            }
        } catch (RemoteException e) {
            zzaym.zzb("Clearcut log failed", e);
        }
    }

    public final zzud zzbu(int i) {
        this.zzbxx = i;
        return this;
    }

    public final zzud zzbv(int i) {
        this.zzbxy = i;
        return this;
    }
}
