package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zztm extends zzazc<zztr> {
    private final /* synthetic */ zztj zzbvk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztm(zztj zztjVar) {
        this.zzbvk = zztjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazc, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.zzbvk.disconnect();
        return super.cancel(z);
    }
}
