package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzdva extends Handler {
    private static zzdvd zzhtp;

    public zzdva() {
    }

    public zzdva(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zzb(message);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzb(Message message) {
        super.dispatchMessage(message);
    }
}
