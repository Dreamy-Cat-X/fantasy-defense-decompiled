package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzrq implements ValueCallback<String> {
    private final /* synthetic */ zzrn zzbtp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrq(zzrn zzrnVar) {
        this.zzbtp = zzrnVar;
    }

    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        this.zzbtp.zzbtl.zza(this.zzbtp.zzbti, this.zzbtp.zzbtj, str, this.zzbtp.zzbtk);
    }
}
