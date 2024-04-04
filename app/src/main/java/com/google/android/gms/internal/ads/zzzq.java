package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzzq extends zzyi {
    private final String description;
    private final String zzckr;

    public zzzq(String str, String str2) {
        this.description = str;
        this.zzckr = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final String getDescription() throws RemoteException {
        return this.description;
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final String zzrd() throws RemoteException {
        return this.zzckr;
    }
}
