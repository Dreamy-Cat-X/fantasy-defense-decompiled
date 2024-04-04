package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzazx implements Runnable {
    private final /* synthetic */ zzazo zzehu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazx(zzazo zzazoVar) {
        this.zzehu = zzazoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzazy zzazyVar;
        zzazy zzazyVar2;
        zzazy zzazyVar3;
        zzazyVar = this.zzehu.zzehq;
        if (zzazyVar != null) {
            zzazyVar2 = this.zzehu.zzehq;
            zzazyVar2.onPaused();
            zzazyVar3 = this.zzehu.zzehq;
            zzazyVar3.zzaal();
        }
    }
}
