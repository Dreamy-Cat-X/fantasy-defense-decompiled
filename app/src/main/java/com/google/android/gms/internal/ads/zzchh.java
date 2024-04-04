package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final /* synthetic */ class zzchh implements zzbxv {
    private final zzbdh zzesn;

    private zzchh(zzbdh zzbdhVar) {
        this.zzesn = zzbdhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbxv zzk(zzbdh zzbdhVar) {
        return new zzchh(zzbdhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzamq() {
        this.zzesn.destroy();
    }
}
