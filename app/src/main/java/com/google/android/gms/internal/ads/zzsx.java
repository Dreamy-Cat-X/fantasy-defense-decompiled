package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzsx implements zzrm {
    private final /* synthetic */ zzsv zzbus;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsx(zzsv zzsvVar) {
        this.zzbus = zzsvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final void zzp(boolean z) {
        if (!z) {
            this.zzbus.disconnect();
        } else {
            this.zzbus.connect();
        }
    }
}
