package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzdva;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzg extends zzdva {
    public zzg(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzp.zzku().zza(e, "AdMobHandler.handleMessage");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdva
    public final void zzb(Message message) {
        try {
            super.zzb(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzp.zzkq();
            zzm.zza(com.google.android.gms.ads.internal.zzp.zzku().getApplicationContext(), th);
            throw th;
        }
    }
}
