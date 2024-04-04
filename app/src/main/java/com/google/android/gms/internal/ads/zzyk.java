package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzyk implements MuteThisAdReason {
    private final String description;
    private zzyj zzcjh;

    public zzyk(zzyj zzyjVar) {
        String str;
        this.zzcjh = zzyjVar;
        try {
            str = zzyjVar.getDescription();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            str = null;
        }
        this.description = str;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.description;
    }

    public final zzyj zzre() {
        return this.zzcjh;
    }

    public final String toString() {
        return this.description;
    }
}
