package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzhm extends Handler {
    private final /* synthetic */ zzhj zzage;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhm(zzhj zzhjVar, Looper looper) {
        super(looper);
        this.zzage = zzhjVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zzage.zza(message);
    }
}
