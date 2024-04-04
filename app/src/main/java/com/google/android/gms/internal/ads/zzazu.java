package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzazu implements Runnable {
    private final /* synthetic */ zzazo zzehu;
    private final /* synthetic */ int zzehy;
    private final /* synthetic */ int zzehz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazu(zzazo zzazoVar, int i, int i2) {
        this.zzehu = zzazoVar;
        this.zzehy = i;
        this.zzehz = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzazy zzazyVar;
        zzazy zzazyVar2;
        zzazyVar = this.zzehu.zzehq;
        if (zzazyVar != null) {
            zzazyVar2 = this.zzehu.zzehq;
            zzazyVar2.zzk(this.zzehy, this.zzehz);
        }
    }
}
